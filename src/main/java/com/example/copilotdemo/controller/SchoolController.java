package com.example.copilotdemo.controller;

import com.example.copilotdemo.mapper.SchoolMapper;
import com.example.copilotdemo.model.School;
import com.example.copilotdemo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author firefly by 2024/1/28
 */
@RequestMapping("/school")
@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    // 查询 school 数据，传入 school 参数，返回 school list 集合
    @RequestMapping("/list")
    public List<School> list(@RequestBody School school) {
        return schoolService.list(school);
    }

    // 添加 school 数据，传入 school 参数，返回添加数量
    @RequestMapping("/insert")
    public int insert(@RequestBody School school) {
        return schoolService.insert(school);
    }

    // 更新 school 数据，传入 school 参数，返回更新数量
    @RequestMapping("/update")
    public int update(@RequestBody School school) {
        return schoolService.update(school);
    }

    // 删除 school 数据，传入 id 参数，返回删除数量
    @RequestMapping("/delete")
    public int delete(@RequestBody Map<String, Integer> params) {
        return schoolService.delete(params.get("id"));
    }

    // 查询 school 数据，传入 school 参数，返回 school list 集合，手机号脱敏
    @RequestMapping("/listPhone")
    public List<School> listPhone(@RequestBody School school) {
        return schoolService.listPhone(school);
    }






}
