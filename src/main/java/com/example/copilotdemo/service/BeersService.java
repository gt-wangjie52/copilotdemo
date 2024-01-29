package com.example.copilotdemo.service;

import com.example.copilotdemo.model.Beers;

import java.util.List;

/**
 * 描述：
 *
 * @author firefly by 2024/1/29
 */
public interface BeersService {

    // 创建分页查询方法
    List<Beers> selectBeersList(Beers beers);

    // 查询详情
    Beers selectBeersById(Integer id);

    // 创建新增方法
    int insertBeers(Beers beers);

    // 创建更新方法
    int updateBeers(Beers beers);

    // 创建删除方法
    int deleteBeers(Integer id);

}
