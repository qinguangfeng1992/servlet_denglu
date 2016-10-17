package com.qinguangfeng831.javabean;


/**
 * Created by Administrator on 2016/8/31.
 */
public class Hobby {
    private String username;
    private String password;
    private String hobby;



    private String sex;
    private String born;
    private String QQ;
    private String phone;
    private String descr;



    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hobby=" + hobby  +'\'' +
                ", sex='" + sex + '\'' +
                ", born='" + born + '\'' +
                ", QQ='" + QQ + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
