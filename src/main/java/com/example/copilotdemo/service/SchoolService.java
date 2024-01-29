package com.example.copilotdemo.service;

import com.example.copilotdemo.model.School;

import java.util.List;

/**
 * 描述：
 *
 * @author firefly by 2024/1/28
 */
public interface SchoolService {

    // 查询数据
    List<School> list(School school);

    // 删除数据
    int delete(int id);

    // 添加数据
    int insert(School school);

    // 更新数据
    int update(School school);

    // 查询数据,将手机号脱敏
    List<School> listPhone(School school);


}
