package com.example.copilotdemo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 描述：
 * @author firefly by 2024/1/28
 */
@Data
public class School implements Serializable {
    // id 为主键，自增
    private Integer id;

    // school 为学校名称
    private String school;

    // area 为学校所在地区
    private String area;
    // contact 为学校联系人
    private String contact;

    // phone 为学校联系人手机号
    private String phone;

    // createTime 为创建时间
    private Date createTime;

    // updateTime 为更新时间
    private Date updateTime;

    // start 为分页开始位置
    private Integer start;

    // size 为分页大小
    private Integer size;

}
