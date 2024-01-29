package com.example.copilotdemo.service.Impl;

import com.example.copilotdemo.mapper.SchoolMapper;
import com.example.copilotdemo.model.School;
import com.example.copilotdemo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author firefly by 2024/1/28
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    // 传入 school 参数，返回 school list 集合
    public List<School> list(School school){
        return schoolMapper.list(school);
    }

    // 传入 id 参数，返回删除数量
    @Override
    public int delete(int id) {
        return schoolMapper.delete(id);
    }

    // 传入 school 参数，返回添加数量
    @Override
    public int insert(School school) {
        return schoolMapper.insert(school);
    }

    // 传入 school 参数，返回更新数量
    @Override
    public int update(School school) {
        return schoolMapper.update(school);
    }

    @Override
    public List<School> listPhone(School school) {
        // 分页查询出所有数据
        List<School> list = schoolMapper.list(school);
        // 将手机号脱敏
        for (School s : list) {
            s.setPhone(s.getPhone().replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2"));
        }
        // 返回数据
        return list;
    }

}
