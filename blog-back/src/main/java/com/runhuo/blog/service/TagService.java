package com.runhuo.blog.service;

import com.runhuo.blog.vo.TagVo;
import com.runhuo.blog.vo.result.Result;

import java.util.List;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 21:48
 */
public interface TagService {
    List<TagVo> findTagsByArticleId(Long id);

    Result findHotTags(int limit);

    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
