##suibianwanwna -che

##资料
[spring文档](https://spring.io/guides)
[githubOAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[okhttp](https://square.github.io/okhttp/)
[springdocs](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#using-boot-devtools)
[thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)

##工具
git
lombok

##脚本
```sql
CREATE TABLE USER
(
    ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);

alter table USER add bio varchar(256) null;

create table question
(
    id int auto_increment primary key,
    title varchar(50),
    description text,
    gmt_create bigint,
    gmt_modified bigint,
    creator int,
    comment_count int default 0,
    view_count int default 0,
    like_count int default 0,
    tag varchar(256)
);

alter table USER add avatar_url varchar(100) null;