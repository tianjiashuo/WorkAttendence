package com.workattendance.Repository.dao;

import com.workattendance.Repository.entity.Check;
import com.workattendance.Repository.mappers.CheckRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CheckDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //更新年假
    public Check updateAnnualLeaveByEmpNo(String empNo, int annualLeave){
        String sql = "UPDATE check set annualLeave=?  WHERE empNo=?";
        jdbcTemplate.update(sql, annualLeave,empNo);
        return queryCheckByEmpNo(empNo);
    }

    //更新请假次数
    public Check updateLeaveTimeByEmpNo(String empNo, int leaveTime){
        String sql = "UPDATE check set leaveTime=?  WHERE empNo=?";
        jdbcTemplate.update(sql, leaveTime,empNo);
        return queryCheckByEmpNo(empNo);
    }

    //更新缺勤次数
    public Check updateAbsenteeismByEmpNo(String empNo, int absenteeism){
        String sql = "UPDATE check set absenteeism=?  WHERE empNo=?";
        jdbcTemplate.update(sql, absenteeism,empNo);
        return queryCheckByEmpNo(empNo);
    }

    //根据empNo查询
    public Check queryCheckByEmpNo(String empNo) {
        String sql = "SELECT * FROM check WHERE empNo=?";
        Check check = jdbcTemplate.queryForObject(sql, new CheckRowMapper(), empNo);
        return check;
    }

}