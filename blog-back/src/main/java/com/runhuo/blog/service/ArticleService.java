package com.runhuo.blog.service;

import com.runhuo.blog.vo.ArticleVo;
import com.runhuo.blog.vo.params.ArticleParam;
import com.runhuo.blog.vo.params.PageParams;
import com.runhuo.blog.vo.result.Result;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 21:00
 */
public interface ArticleService {
    /**
     * 获取文章列表的信息
     *
     * @param pageParams
     * @return
     */
    Result getArticleList(PageParams pageParams);

    Result getHotArticles(int limit);

    Result getNewArticles(int limit);

    Result listArchives();

    Result findArticleById(Long id);

    Result publish(ArticleParam articleParam);

    Result listArticle(PageParams pageParams);
}
