package com.example.copilotdemo;

/**
 * 描述：
 *
 * @author firefly by 2024/1/28
 */
public class SchoolTest {

    // 帮我创建一个mysql数据表，包含 id,学校,地区,对接人,手机号，创建时间，更新时间，状态 字段
    // create table school(id int primary key auto_increment, school varchar(100), area varchar(100), contact varchar(100), phone varchar(100), create_time datetime, update_time datetime, status int);
    // 生成一些测试数据
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('北京大学', '北京', '张三', '13800138000', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('清华大学', '北京', '李四', '13800138001', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('复旦大学', '上海', '王五', '13800138002', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('上海交通大学', '上海', '赵六', '13800138003', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('武汉大学', '武汉', '孙七', '13800138004', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('华中科技大学', '武汉', '周八', '13800138005', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('浙江大学', '杭州', '吴九', '13800138006', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('南京大学', '南京', '郑十', '13800138007', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('南开大学', '天津', '钱十一', '13800138008', now(), now(), 1);
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('天津大学', '天津', '孙十二', '13800138009', now(), now(), 1);
    // 帮我编写一条sql语句，批量插入10条测试数据到school表中
    // insert into school(school, area, contact, phone, create_time, update_time, status) values('北京大学', '北京', '张三', '13800138000', now(), now(), 1),('清华大学', '北京', '李四', '13800138001', now(), now(), 1),('复旦大学', '上海', '王五', '13800138002', now(), now(), 1),('上海交通大学', '上海', '赵六', '13800138003', now(), now(), 1),('武汉大学', '武汉', '孙七', '13800138004', now(), now(), 1),('华中科技大学', '武汉', '周八', '13800138005', now(), now(), 1),('浙江大学', '杭州', '吴九', '13800138006', now(), now(), 1),('南京大学', '南京', '郑十', '13800138007', now(), now(), 1),('南开大学', '天津', '钱十一', '13800138008', now(), now(), 1),('天津大学', '天津', '孙十二', '13800138009', now(), now(), 1);
    // 帮我编写一条sql语句，倒叙查询school表中的数据并具有分页功能
    // select * from school order by id desc limit 0, 10;
    // 把上面的语句通过mybatis的xml文件配置出来
    // <select id="list" resultType="com.firefly.pojo.School">
    //     select * from school order by id desc limit #{start}, #{size};
    // </select>
    // 帮我编写一条sql语句，查询school表中的数据并具有分页功能，同时可以根据学校名称,地区，对接人，手机号进行模糊查询
    // select * from school where school like '%#{keyword}%' or area like '%#{keyword}%' or contact like '%#{keyword}%' or phone like '%#{keyword}%' order by id desc limit #{start}, #{size};
    // 把上面的语句通过mybatis的xml文件配置出来
    // <select id="list" resultType="com.firefly.pojo.School">
    //     select * from school where school like '%#{keyword}%' or area like '%#{keyword}%' or contact like '%#{keyword}%' or phone like '%#{keyword}%' order by id desc limit #{start}, #{size};
    // </select>
    // 修改上面的xml语句配置，使得只有不为空的学校名称,地区，对接人，手机号字段才会参与到sql语句中
    // <select id="list" resultType="com.firefly.pojo.School">
    //     select * from school
    //     <where>
    //         <if test="school != null and school != ''">
    //             and school like '%#{school}%'
    //         </if>
    //         <if test="area != null and area != ''">
    //             and area like '%#{area}%'
    //         </if>
    //         <if test="contact != null and contact != ''">
    //             and contact like '%#{contact}%'
    //         </if>
    //         <if test="phone != null and phone != ''">
    //             and phone like '%#{phone}%'
    //         </if>
    //     </where>
    //     order by create_time desc limit #{start}, #{size};
    // </select>
    // 帮我编写一条sql语句，插入数据到school表中，直接生成 mybatis xml 数据
    // <insert id="insert" parameterType="com.firefly.pojo.School">
    //     insert into school(school, area, contact, phone, create_time, update_time, status)
    // </insert>

    // 帮我编写一条sql语句，更新school表中的数据，使得只有不为空的学校名称,地区，对接人，手机号字段才会参与到sql语句中
    // <update id="update" parameterType="com.firefly.pojo.School">
    //     update school
    //  <trim prefix="set" suffixOverrides=",">
    //      <if test="school != null and school != ''">
    //          school = #{school},
    //      </if>
    //      <if test="area != null and area != ''">
    //          area = #{area},
    //      </if>
    //      <if test="contact != null and contact != ''">
    //          contact = #{contact},
    //      </if>
    //      <if test="phone != null and phone != ''">
    //          phone = #{phone},
    //      </if>
    //      update_time = now()
    //  </trim>
    //  where id = #{id}
    // </update>










    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
