package com.example.copilotdemo.mapper;

import com.example.copilotdemo.model.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述：
 * @author firefly by 2024/1/28
 */

@Mapper
public interface SchoolMapper {

    int insert(School school);

    List<School> list(School school);

    int update(School school);

    int delete(int id);


}
