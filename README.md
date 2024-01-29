将这个类的所有接口生成一个 mkdown 文件
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
