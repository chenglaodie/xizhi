

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


