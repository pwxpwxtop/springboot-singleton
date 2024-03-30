package com.xingble.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.pwxpwxtop.fastservice.animation.Bo;
import io.github.pwxpwxtop.fastservice.animation.Vo;
import io.github.pwxpwxtop.fastservice.enums.BoType;
import io.github.pwxpwxtop.fastservice.enums.VoType;
import lombok.Data;

/**
 * @Description:
 * @Author: PWX
 * @CreateDate: 2024/2/26 0:23
 * @UpdateUser: IntelliJ IDEA
 * @UpdateDate: 2024/2/26 0:23
 * @Version: 1.0
 */
@Data
@TableName("my_user")
public class MyUser {

    @TableId(type = IdType.ASSIGN_ID)
    @ExcelProperty("唯一id")
    private Long id;

    @Bo( type = {BoType.REPEAT, BoType.FILTER}, exist = false)
    @Vo(type = {VoType.EQ, VoType.NOT_NULL}, exist = true)
    @ExcelProperty("姓名")
    private String name;

    @Vo(regex = "(0?[1-9]|[1-9][0-9])", msg = "超过年龄范围")
    @ExcelProperty("年龄")
    private Long age;

    @Vo(exist = false)
    @ExcelProperty("性别")
    private String sex;

    @Bo( type = {BoType.NOT_NULL_STR}, regex = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$", msg = "手机号码不正确")
    @Vo(regex = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$", msg = "手机号码不正确")
    @ExcelProperty("手机号码")
    private Long phone;
}
