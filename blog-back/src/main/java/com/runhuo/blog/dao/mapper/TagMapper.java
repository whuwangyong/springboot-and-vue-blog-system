package com.runhuo.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.runhuo.blog.dao.entity.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 21:03
 */
@Mapper
public interface TagMapper extends BaseMapper<Tag> {
    List<Tag> findTagsByArticleId(Long id);

    List<Long> findHotTagsIds(int limit);

    List<Tag> findTagsByTagsId(List<Long> tagIds);
}
