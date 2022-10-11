package com.runhuo.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.runhuo.blog.dao.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/24 16:01
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
