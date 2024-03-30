package com.xingble.conf;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.xingble.model.MyUser;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author pwx
 * @version 1.0
 * @describe 实体类自动填充配置
 * @date 2022/9/2 8:40
 */
@Configuration
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        setFieldValByName("createTime", new Date(), metaObject);    //创建时间
        setFieldValByName("updateTime", new Date(), metaObject);    //更新时间
        setFieldValByName("state", 0, metaObject);          //启用状态
        setFieldValByName("deleteState", 0, metaObject);    //删除状态
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        QueryWrapper<MyUser> wrapper = new QueryWrapper<>();
        setFieldValByName("updateTime", new Date(), metaObject);    //更新时间

    }



}
