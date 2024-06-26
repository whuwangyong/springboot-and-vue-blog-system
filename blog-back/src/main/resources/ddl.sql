create database blog;
use blog;

CREATE TABLE article
(
    id             bigint(0)                                               NOT NULL AUTO_INCREMENT,
    comment_counts int(0)                                                  NULL DEFAULT NULL COMMENT '评论数量',
    create_date    bigint(0)                                               NULL DEFAULT NULL COMMENT '创建时间',
    summary        varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '简介',
    title          varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL COMMENT '标题',
    view_counts    int(0)                                                  NULL DEFAULT NULL COMMENT '浏览数量',
    weight         int(0)                                                  NOT NULL COMMENT '是否置顶',
    author_id      bigint(0)                                               NULL DEFAULT NULL COMMENT '作者id',
    body_id        bigint(0)                                               NULL DEFAULT NULL COMMENT '内容id',
    category_id    int(0)                                                  NULL DEFAULT NULL COMMENT '类别id',
    PRIMARY KEY (id) USING BTREE
);


CREATE TABLE article_tag
(
    id         bigint(0) NOT NULL AUTO_INCREMENT,
    article_id bigint(0) NOT NULL,
    tag_id     bigint(0) NOT NULL,
    PRIMARY KEY (id) USING BTREE,
    INDEX article_id (article_id) USING BTREE,
    INDEX tag_id (tag_id) USING BTREE
);

CREATE TABLE tag
(
    id       bigint(0)                                                     NOT NULL AUTO_INCREMENT,
    avatar   varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    tag_name varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    PRIMARY KEY (id) USING BTREE
);

CREATE TABLE sys_user
(
    id                  bigint(0)                                               NOT NULL AUTO_INCREMENT,
    account             varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL COMMENT '账号',
    admin               bit(1)                                                  NULL DEFAULT NULL COMMENT '是否管理员',
    avatar              varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
    create_date         bigint(0)                                               NULL DEFAULT NULL COMMENT '注册时间',
    deleted             bit(1)                                                  NULL DEFAULT NULL COMMENT '是否删除',
    email               varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
    last_login          bigint(0)                                               NULL DEFAULT NULL COMMENT '最后登录时间',
    mobile_phone_number varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL COMMENT '手机号',
    nickname            varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
    password            varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL COMMENT '密码',
    salt                varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密盐',
    status              varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
    PRIMARY KEY (id) USING BTREE
);

CREATE TABLE article_body
(
    id           bigint(0)                                           NOT NULL AUTO_INCREMENT,
    content      longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
    content_html longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
    article_id   bigint(0)                                           NOT NULL,
    PRIMARY KEY (id) USING BTREE
);

CREATE TABLE category
(
    id            bigint(0)                                                     NOT NULL AUTO_INCREMENT,
    avatar        varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    category_name varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    description   varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    PRIMARY KEY (id) USING BTREE
);

CREATE TABLE comment
(
    id          bigint(0)                                                     NOT NULL AUTO_INCREMENT,
    content     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    create_date bigint(0)                                                     NOT NULL,
    article_id  bigint(0)                                                        NOT NULL,
    author_id   bigint(0)                                                     NOT NULL,
    parent_id   bigint(0)                                                     NOT NULL,
    to_uid      bigint(0)                                                     NOT NULL,
    level       varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci         NOT NULL,
    PRIMARY KEY (`id`) USING BTREE
);