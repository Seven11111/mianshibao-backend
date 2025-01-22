package com.mianshibao.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * id 雪花算法生成
     * IdType.AUTO：使用数据库自增 ID 作为主键。
     * IdType.NONE：无特定生成策略，如果全局配置中有 IdType 相关的配置，则会跟随全局配置。
     * IdType.INPUT：在插入数据前，由用户自行设置主键值。
     * IdType.ASSIGN_ID：自动分配 ID，适用于 Long、Integer、String 类型的主键。默认使用雪花算法通过 IdentifierGenerator 的 nextId 实现。@since 3.3.0
     * IdType.ASSIGN_UUID：自动分配 UUID，适用于 String 类型的主键。默认实现为 IdentifierGenerator 的 nextUUID 方法。@since 3.3.0
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表（json 数组）
     */
    private String tags;

    /**
     * 推荐答案
     */
    private String answer;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 编辑时间
     */
    private Date editTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}