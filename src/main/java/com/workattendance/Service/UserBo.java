package com.workattendance.Service;



public class UserBo {
    private int id;
    private String empNo;
    private String empName;
    private String power;
    private static UserBo userbo = null;

    private UserBo(){

    };

    public static  synchronized UserBo getUserBo(){
        if(userbo==null){
            UserBo userbo = new UserBo();

            return userbo;
        }else{
            return userbo;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
