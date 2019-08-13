##suibianwanwna -che

##资料
[spring 文档](https://spring.io/guides)
[github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[okhttp](https://square.github.io/okhttp/)
[spring docs](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#using-boot-devtools)

##工具
git

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