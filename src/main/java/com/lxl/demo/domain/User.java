package com.lxl.demo.domain;

/**
 * <dl>
 * <dt>User</dt>
 * <dd>@auther lixinlong</dd>
 * <dd>@create 2018/6/22</dd>
 * <dd></dd>
 * </dl>
 */
public class User {

    Integer id;

    String username;

    String password;

    public User() {
    }

    public User(Integer i, String lxl, String s) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
