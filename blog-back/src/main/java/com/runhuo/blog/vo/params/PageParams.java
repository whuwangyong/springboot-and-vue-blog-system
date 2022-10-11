package com.runhuo.blog.vo.params;

import lombok.Data;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 21:08
 * 文章列表的参数实体类
 */
@Data
public class PageParams {
    private int page = 1;

    private int pageSize = 10;
    private Long categoryId;

    private Long tagId;

    private String year;
    private String month;

    public String getMonth() {
        if (this.month != null && this.month.length() == 1) {
            return "0"+this.month;
        }
        return this.month;
    }
}
