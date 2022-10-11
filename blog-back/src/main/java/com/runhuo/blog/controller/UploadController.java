package com.runhuo.blog.controller;

import com.runhuo.blog.vo.result.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/25 12:28
 */
@RestController
@RequestMapping("/upload")
public class UploadController {
    /**
     * markdown编辑器中上传的图片
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping
    public Result upload(@RequestParam("image") MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + "." + StringUtils.substringAfterLast(originalFilename, ".");
        file.transferTo(new File("/static/img/" + fileName));
        return Result.success(null);
    }
}
