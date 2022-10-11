package com.runhuo.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.runhuo.blog.dao.entity.Article;
import com.runhuo.blog.vo.ArchivesVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/22 17:18
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    List<ArchivesVo> listArchives();

    IPage<Article> listArticle(Page<Article> page,Long categoryId,Long tagId,String year,String month);
}
