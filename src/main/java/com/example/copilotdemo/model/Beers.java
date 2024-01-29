package com.example.copilotdemo.model;

import lombok.Data;

/**
 * 描述：
 *
 * @author firefly by 2024/1/29
 */
@Data
public class Beers {

    // 读取 beer.json 文件，创建实体类

    // id
    private Integer id;
    // 名字
    private String name;
    // 风格
    private String tagline;
    // 第一次酿造
    private String first_brewed;
    // 描述
    private String description;
    // 图片
    private String image_url;
    // 价格
    private String price;
    // 酒精度
    private String abv;
    // 价格
    private String ibu;
    // 目标密度
    private String target_fg;
    // 原始密度
    private String target_og;
    // 体积
    private String ebc;
    // 颜色
    private String srm;
    // 酸碱度
    private String ph;
    // 酵母
    private String attenuation_level;
    // 体积
    private String volume;
    // 酿造体积
    private String boil_volume;
    // 方法
    private String method;
    // 酿造方法
    private String ingredients;
    // 食物搭配
    private String food_pairing;
    // 酿造提示
    private String brewers_tips;
    // 贡献者
    private String contributed_by;

    private Integer offset;

    private Integer limit;


}
