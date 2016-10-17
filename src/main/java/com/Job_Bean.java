package com;

/**这是第二道 表单的作业的 实体类
 * Created by Administrator on 2016/8/31.
 */
public class Job_Bean {
    private String username;
    private String password;
    private String hobby;
    private  String address;
     private String sex;
     private String descr;

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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Job_Bean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hobby='" + hobby + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
