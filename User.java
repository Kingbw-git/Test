package cn.health.pojo;

public class User {
   private int userNo;
   private String userName;
   private String sex;
   private int age;
   private String address;
    private String phone;
    private int ztNo;

    private ZhuangTai zhuangTai;


    public ZhuangTai getZhuangTai() {
        return zhuangTai;
    }

    public void setZhuangTai(ZhuangTai zhuangTai) {
        this.zhuangTai = zhuangTai;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getZtNo() {
        return ztNo;
    }

    public void setZtNo(int ztNo) {
        this.ztNo = ztNo;
    }
}
