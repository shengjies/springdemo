package com.sj.shiro.realm;

import com.sj.shiro.domain.User;
import com.sj.shiro.mapper.PermissionsMapper;
import com.sj.shiro.mapper.RoleMapper;
import com.sj.shiro.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PermissionsMapper permissionsMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public String getName() {
        return "UserRealm";
    }

    /**
     * 用户授权
     * @param principal
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        User user = (User) principal.getPrimaryPrincipal();
        List<String> permissions = new ArrayList<>();
        List<String> roles = new ArrayList<>();
        if("admin".equals(user.getUsername())){
            permissions.add("*:*");
            roles = roleMapper.selectAllRole();
        }else{
            roles = roleMapper.selectRoleByUserId(user.getId());
            permissions = permissionsMapper.selectPermissionsByUserId(user.getId());
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);
        info.addRoles(roles);
        return info;
    }

    /**
     * 用户验证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = token.getPrincipal().toString();

        User user = userMapper.selectUserByUserName(username);

        if(user == null){
            return null;
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(), ByteSource.Util.bytes(user.getUsername()),getName());

        return info;
    }

    /**
     * 清除缓存数据
     */
    protected void clearCache() {
        PrincipalCollection principals =  SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }
}
