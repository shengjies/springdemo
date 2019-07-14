package com.sj.shiro.utlis;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Test {
    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("666","admin",3);
        System.out.println(md5Hash);
    }
}
