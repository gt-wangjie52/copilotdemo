将这个类的所有接口生成一个 mkdown 文件
# BeersController
## list
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- |------| --- |
| name | String | 否    | 名称 |
| tagline | String | 否    | 标签 |
| food_pairing | String | 否    | 食物搭配 |
| description | String | 否    | 描述 |
| offset | Integer | 是    | 开始页 |
| limit | Integer | 是    | 每页条数 |
### 返回参数
| 参数名 | 参数类型 | 参数描述 |
| --- | --- | --- |
| id | Integer | id |
| name | String | 名称 |
| tagline | String | 标签 |
| first_brewed | String | 首次酿造 |
| description | String | 描述 |
| image_url | String | 图片 |
| abv | Double | 酒精度 |
| ibu | Double | 苦度 |
| target_fg | Double | 目标密度 |
| target_og | Double | 原始密度 |
| ebc | Double | 颜色 |
| srm | Double | 颜色 |
| ph | Double | 酸碱度 |
| attenuation_level | Double | 发酵度 |
| volume | Double | 体积 |
| boil_volume | Double | 煮沸体积 |
| method | String | 方法 |
| ingredients | String | 原料 |
| food_pairing | String | 食物搭配 |
| brewers_tips | String | 酿酒师建议 |
| contributed_by | String | 贡献者 |
| offset | Integer | 开始页 |
| limit | Integer | 每页条数 |
### 返回示例
```json
[ {
  "id": 1,
  "name": "Buzz",
  "tagline": "A Real Bitter Experience.",
  "first_brewed": "09/2007",
  "description": "A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.",
  "image_url": "https://images.punkapi.com/v2/keg.png",
  "price": 2.5,
  "abv": 4.5,
  "ibu": 60,
  "target_fg": 1010,
  "target_og": 1044,
  "ebc": 20,
  "srm": 10,
  "ph": 4.4,
  "attenuation_level": 75,
  "volume": {
    "value": 20,
    "unit": "litres"
  },
  "boil_volume": {
    "value": 25,
    "unit": "litres"
  },
  "food_pairing": [
    "Spicy chicken tikka masala",
    "Grilled chicken quesadilla",
    "Caramel toffee cake"
  ],
  "brewers_tips": "The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus.",
  "contributed_by": "Sam Mason <samjbmason>"
}]
```
## insert
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- |------| --- |
| name | String | 否    | 名称 |
| tagline | String | 否    | 标签 |
| first_brewed | String | 否    | 首次酿造 |
| description | String | 否    | 描述 |
| image_url | String | 否    | 图片 |
| price | Double | 否    | 价格 |
| abv | Double | 否    | 酒精度 |
| ibu | Double | 否    | 苦度 |
| target_fg | Double | 否    | 目标密度 |
| target_og | Double | 否    | 原始密度 |
| ebc | Double | 否    | 颜色 |
| srm | Double | 否    | 颜色 |
| ph | Double | 否    | 酸碱度 |
| attenuation_level | Double | 否    | 发酵度 |
| volume | Double | 否    | 体积 |
| boil_volume | Double | 否    | 煮沸体积 |
| method | String | 否    | 方法 |
| ingredients | String | 否    | 原料 |
| food_pairing | String | 否    | 食物搭配 |
| brewers_tips | String | 否    | 酿酒师建议 |
| contributed_by | String | 否    | 贡献者 |
### 返回参数
| 参数名   | 参数类型 | 参数描述 |
|-------| --- |------|
| count | Integer | 数量   |
### 返回示例
```json
1
```
## update
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- | --- | --- |
| id | Integer | 是 | id |
| name | String | 否 | 名称 |
| tagline | String | 否 | 标签 |
| first_brewed | String | 否 | 首次酿造 |
| description | String | 否 | 描述 |
| image_url | String | 否 | 图片 |
| price | Double | 否 | 价格 |
| abv | Double | 否 | 酒精度 |
| ibu | Double | 否 | 苦度 |
| target_fg | Double | 否 | 目标密度 |
| target_og | Double | 否 | 原始密度 |
| ebc | Double | 否 | 颜色 |
| srm | Double | 否 | 颜色 |
| ph | Double | 否 | 酸碱度 |
| attenuation_level | Double | 否 | 发酵度 |
| volume | Double | 否 | 体积 |
| boil_volume | Double | 否 | 煮沸体积 |
| method | String | 否 | 方法 |
| ingredients | String | 否 | 原料 |
| food_pairing | String | 否 | 食物搭配 |
| brewers_tips | String | 否 | 酿酒师建议 |
| contributed_by | String | 否 | 贡献者 |
### 返回参数
| 参数名   | 参数类型 | 参数描述 |
|-------| --- |------|
| count | Integer | 处理数量 |
### 返回示例
```json
1
```
## delete
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- | --- | --- |
| id | Integer | 是 | id |
### 返回参数
| 参数名   | 参数类型 | 参数描述 |
|-------| --- |------|
| count | Integer | 数量   |
# 返回示例
```json
1
```




# SchoolController
## list
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- |------| --- |
| school | String | 否    | 学校 |
| area | String | 否    | 地区 |
| contact | String | 否    | 联系人 |
| phone | String | 否    | 手机号 |
| start | Integer | 是    | 开始页 |
| size | Integer | 是    | 每页条数 |
### 返回参数
| 参数名 | 参数类型 | 参数描述 |
| --- | --- | --- |
| id | Integer | id |
| school | String | 学校 |
| area | String | 地区 |
| contact | String | 联系人 |
| phone | String | 手机号 |
| createTime | Date | 创建时间 |
| updateTime | Date | 更新时间 |
| status | Integer | 状态 |
| start | Integer | 开始页 |
| size | Integer | 每页条数 |
### 返回示例
```json
[
{
"id": 1,
"school": "北京大学",
"area": "北京",
"contact": "张三",
"phone": "13800138000",
"createTime": "2021-01-28T09:25:00.000+00:00",
"updateTime": "2021-01-28T09:25:00.000+00:00",
"status": 1,
"start": 0,
"size": 10
}
]
```
## insert
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- |------| --- |
| school | String | 否    | 学校 |
| area | String | 否    | 地区 |
| contact | String | 否    | 联系人 |
| phone | String | 否    | 手机号 |
| start | Integer | 是    | 开始页 |
| size | Integer | 是    | 每页条数 |
### 返回参数
| 参数名   | 参数类型 | 参数描述 |
|-------| --- |------|
| count | Integer | 数量   |
### 返回示例
```json
1
```
## update
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- | --- | --- |
| school | Sring | 否 | 学校 |
| area | String | 否 | 地区 |
| contact | String | 否 | 联系人 |
| phone | String | 否 | 手机号 |
| start | Integer | 是 | 开始页 |
| size | Integer | 是 | 每页条数 |
### 返回参数
| 参数名   | 参数类型 | 参数描述 |
|-------| --- |------|
| count | Integer | 处理数量 |
### 返回示例
```json
1
```
## delete
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- | --- | --- |
| id | Integer | 是 | id |
### 返回参数
| 参数名   | 参数类型 | 参数描述 |
|-------| --- |------|
| count | Integer | 数量   |
# 返回示例
```json
1
```
## listPhone
### 请求方式
POST
### 请求参数
| 参数名 | 参数类型 | 是否必须 | 参数描述 |
| --- | --- | --- | --- |
| school | String | 否 | 学校 |
| area | String | 否 | 地区 |
| contact | String | 否 | 联系人 |
| phone | String | 否 | 手机号 |
| start | Integer | 是 | 开始页 |
| size | Integer | 是 | 每页条数 |
### 返回参数
| 参数名 | 参数类型 | 参数描述 |
| --- | --- | --- |
| id | Integer | id |
| school | String | 学校 |
| area | String | 地区 |
| contact | String | 联系人 |
| phone | String | 手机号 |
| createTime | Date | 创建时间 |
| updateTime | Date | 更新时间 |
| status | Integer | 状态 |
| start | Integer | 开始页 |
| size | Integer | 每页条数 |
### 返回示例
```json
[
{
"id": 1,
"school": "北京大学",
"area": "北京",
"contact": "张三",
"phone": "138****8000",
"createTime": "2021-01-28T09:25:00.000+00:00",
"updateTime": "2021-01-28T09:25:00.000+00:00",
"status": 1,
"start": 0,
"size": 10
}
]
```
## 生成时间
2021-01-28 09:25:00
## 生成人
firefly
## 生成工具
copilot
## 生成工具版本
1.0.0
## 生成工具作者
firefly
