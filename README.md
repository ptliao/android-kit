> android-kit 致力于为android关键场景提供解决方案。  
> 知之非艰,行之惟艰。

- [x] 规范（编码、commit msg、命名） [readme](./DEVELOPERS.md)

- [x] version code(name) v1R00S00I00  & app name [readme](app/build.gradle)

- [x] signingConfigs 生产keystore配置安全 [readme](https://juejin.im/post/6855939988715438088)

- [x] 项目分包结构 [readme](./DEVELOPERS.md#项目分包结构)

- [ ] 模块source引入与maven aar引入动态切换 [readme](https://github.com/hcanyz/android-dynamic-module)

- [ ] 模块独立初始化，性能监听（首屏时间、）

- [ ] 混淆文件模块化 & manifestPlaceholders模块化(三方sdk key)

- [ ] 环境切换（api、三方key）

- [ ] res管理 & 换肤
    采用官方Theme方案，切换主题时重启所有activity。
    参考：
    [material](https://material.io/design/color/the-color-system.html#color-theme-creation)
    [styling](https://medium.com/androiddevelopers/android-styling-themes-vs-styles-ebe05f917578) [翻译版](https://juejin.im/post/6844904200673968141)
    [activity reCreate过渡](https://github.com/iKirby/ithomereader/blob/1f1b2ceac8c70305b37b24f13797af48e0e146d4/app/src/main/java/me/ikirby/ithomereader/ui/activity/ThemeSwitchTransitionActivity.kt)

- [ ] 数据库加密 & 数据库版本管理（跨多版本升级）

- [ ] 用户数据存储分区 & 目录结构划分 & 权限受限降级处理

- [ ] 灰度、abtest（业务点、版本、）& app全局配置数据（api、缓存、更新策略）

- [ ] 页面route url & 统一外部入口（h5、推送通知栏、三方应用跳转）

- [ ] js bridge  & flutter MethodCallHandler： 对外统一&方法版本控制&权限管理

- [ ] 公共组件（toast、dialog、theme、） & 工具类

- [ ] 设计一个登录模块

- [ ] 设计一个RouterPortal

- [ ] 设计一个EventDispatcher EventHandler