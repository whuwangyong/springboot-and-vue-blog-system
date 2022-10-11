package com.runhuo.blog.dao.entity;

import lombok.Data;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 17:17
 * 文章实体类
 */

@Data
public class Article {
    public static final int TOP = 1;

    public static final int COMMON = 0;

    private Long id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    /**
     * 作者id
     */
    private Long authorId;
    /**
     * 内容id
     */
    private Long bodyId;
    /**
     * 类别id
     */
    private Long categoryId;

    /**
     * 置顶
     */
    private Integer weight = COMMON;


    /**
     * 创建时间
     */
    private Long createDate;
}
