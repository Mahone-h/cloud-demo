package cn.mahone.consumer.pojo;

import lombok.Data;

import java.util.Date;

/**
 * describe: tb_user对应的pojo
 *
 *  使用通用mapper注意:
 *  1.给pojo添加表名的映射
 *  2.声明主键
 *  3.主键是否自增
 *  4.是否有数据库中没有的字段
 * @class_name:
 * @parms:
 * @author: Mahone
 * @date: 2018/10/30 18:02
 **/
@Data
public class User {

    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;
    /**
     * 瞬时   不会作为sql语句的一个字段
     */

    private String note;
}