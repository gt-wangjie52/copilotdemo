package com.example.copilotdemo.controller;

import com.example.copilotdemo.model.Beers;
import com.example.copilotdemo.service.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author firefly by 2024/1/29
 */
@RequestMapping("/beers")
@RestController
public class BeersController {

    @Autowired
    private BeersService beersService;

    // 创建分页查询方法，传入 beers 参数，返回 beers list 集合
    @RequestMapping("/list")
    public List<Beers> list(@RequestBody Beers beers) {
        return beersService.selectBeersList(beers);
    }

    // 创建查询详情方法，传入 id 参数，返回 beers 对象
    @RequestMapping("/detail")
    public Beers detail(Integer id) {
        return beersService.selectBeersById(id);
    }

    // 创建新增方法，传入 beers 对象，返回新增条数
    @RequestMapping("/insert")
    public int insert(@RequestBody Beers beers) {
        return beersService.insertBeers(beers);
    }

    // 创建更新方法，传入 beers 对象，返回更新条数
    @RequestMapping("/update")
    public int update(@RequestBody Beers beers) {
        return beersService.updateBeers(beers);
    }

    // 创建删除方法，传入 id 参数，返回删除条数
    @RequestMapping("/delete")
    public int delete(Integer id) {
        return beersService.deleteBeers(id);
    }

}
