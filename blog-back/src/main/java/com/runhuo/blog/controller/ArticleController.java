package com.runhuo.blog.controller;

import com.runhuo.blog.service.ArticleService;
import com.runhuo.blog.vo.ArticleVo;
import com.runhuo.blog.vo.params.ArticleParam;
import com.runhuo.blog.vo.params.PageParams;
import com.runhuo.blog.vo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 17:19
 */
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 获取文章列表（首页）
     *
     * @param pageParams
     * @return
     */
    @PostMapping("/getArticleList")
    public Result getArticleList(@RequestBody PageParams pageParams) {
        return articleService.getArticleList(pageParams);
    }

    /**
     * 获取最热文章
     *
     * @return
     */
    @GetMapping("/getHotArticles")
    public Result getHotArticles() {
        int limit = 5;
        return articleService.getHotArticles(limit);
    }

    /**
     * 获取最新文章
     *
     * @return
     */
    @GetMapping("/getNewArticles")
    public Result getNewArticles() {
        int limit = 5;
        return articleService.getNewArticles(limit);
    }

    @GetMapping("/listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    /**
     * 文章详情
     *
     * @param id
     * @return
     */
    @GetMapping("/view/{id}")
    public Result findArticleById(@PathVariable("id") Long id) {
        return articleService.findArticleById(id);
    }

    @PostMapping("/publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }

}
