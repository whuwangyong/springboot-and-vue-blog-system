package com.runhuo.blog.service;

import com.runhuo.blog.vo.params.CommentParam;
import com.runhuo.blog.vo.result.Result;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/24 15:59
 */
public interface CommentsService {
    Result commentsByArticleId(Long articleId);

    Result comment(CommentParam commentParam);
}
