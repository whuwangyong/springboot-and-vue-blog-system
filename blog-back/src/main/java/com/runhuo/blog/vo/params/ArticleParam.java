package com.runhuo.blog.vo.params;

import com.runhuo.blog.vo.CategoryVo;
import com.runhuo.blog.vo.TagVo;
import lombok.Data;

import java.util.List;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/25 10:16
 */
@Data
public class ArticleParam {
    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;
}
