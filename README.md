## 平台简介

### 文档 http://doc.rycloud.zmrit.com 
### 启动演示视频 https://www.bilibili.com/video/av95044508/

### 源码
- [Github](https://github.com/zhangmrit/xizhi-cloud)
- [Gitee](https://gitee.com/zhangmrit/xizhi-cloud)

#### 友情链接 [xizhi-Cloud](https://gitee.com/y_project/xizhi-Cloud) Element UI版本。
#### 分支说明

- **master** spring原生方式，使用eureka做注册中心和spring config做配置中心
- **nacos** 集成spring-cloud-alibaba 使用nacos做注册中心和配置中心

本项目FORK自  [xizhi](https://gitee.com/y_project/xizhi)

蓝本是[zhangmrit/xizhi](https://gitee.com/zhangmrit/xizhi)

依次绑定host：

127.0.0.1 eureka7001.com

127.0.0.1 gateway.com

如果要使用eureka集群，请依次绑定eureka7002.com,eureka7003.com后修改各项目中的注释部分

```
xizhi-cloud
|
├──xizhi-common --通用包
|  |
|  ├──xizhi-common-core --核心工具包
|  |
|  ├──xizhi-common-redis --redis工具包
|  |
|  ├──xizhi-common-log --日志工具包
|  |
|  ├──xizhi-common-auth --权限工具包
|
├──xizhi-config --cloud统一配置中心
|
├──xizhi-eureka --注册中心
|
├──xizhi-gateway --网关
|
├──xizhi-service-api --服务api模块
|  |
|  ├──xizhi-system-api --系统业务api
|
├──xizhi-service --微服务
|  |
|  ├──xizhi-system --系统业务
|  |
|  ├──xizhi-auth --授权中心
|  |
|  ├──xizhi-gen --代码生成
|  |
|  ├──xizhi-dfs --文件
|
├──xizhi-tool --工具
|  |
|  ├──xizhi-monitor --监控中心
|
├──xizhi-ant --前端 使用ant design框架

```



启动顺序：
- eureka
- config
- gateway
- system
- auth
- gen 可选
- dfs 可选

菜单sql有增加字段，以上传到sql文件
该分支是ant分支，前端使用ant-design-vue 项目地址 [xizhi-ant](https://gitee.com/zhangmrit/xizhi-ant)

monitor使用springadmin完成,目前只是最简单的用法,[详戳](http://doc.rycloud.zmrit.com/#/extra?id=%e7%9b%91%e6%8e%a7)

## xizhi Cloud交流群

QQ群：  [![加入QQ群](https://img.shields.io/badge/755109875-blue.svg)](https://jq.qq.com/?_wv=1027&k=5JGXHPD)  点击按钮入群。

### 鸣谢
- (https://gitee.com/y_project/xizhi) 开源框架，以及演示服务器提供
- [antdv-pro](https://github.com/vueComponent/ant-design-vue-pro) 前端集成框架
- [AJ-Captcha](https://gitee.com/anji-plus/captcha) 滑动验证码

欢迎pr或者加入，给个star是最好的鞭策

##  请作者喝杯咖啡或者建设演示服务器


![](http://upload.ouliu.net/i/20191021180958e1ek5.png)
