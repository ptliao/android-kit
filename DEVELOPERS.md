# 开发者公约

* [命名规范](#命名规范)
* [编码规范](#编码规范)
* [git提交规范](#git提交规范)

## 命名规范

### 关键字
base：基础
common：公共
module：模块
feature：业务单位

### 项目分包结构
```（app + feature_${business}（api + p_main + p_${} + p_base）+ widgets（widget_${name}）+ vendors（vendor_${name}）```

- app
- feature_${name}
  - api
  - p_main
  - p_feature1
  - p_feature2
  - p_base
- widgets
  - widget_name1
  - widget_name2
- vendors
  - vendor_name1
  - vendor_name2

```feature_${business} 业务层：api feature为对外接口，p_main module 负责聚合p_${feature}，p_${feature}为最小业务单元。p工程又涉及到公共代码下移到p_base问题，需要谨慎对待。```

widgets 组件层：通用组件，如视频播放器、图片预览、文件选择等。

vendors framework层：基础库，如网络请求、base类、glide封装等。

[readme：组件化整体方案](https://github.com/hcanyz/android-dynamic-module)

参考：[微信Android模块化架构重构实践](https://mp.weixin.qq.com/s/mkhCzeoLdev5TyO6DqHEdw) [美团外卖Android平台化架构演进实践](https://tech.meituan.com/2018/03/16/meituan-food-delivery-android-architecture-evolution.html)

### 资源
```${business}_${name}_${attrs}```

### Git TAG & RELEASE
```
${version}.${env}

case
...
```

## 编码规范
1. 编码前先思考，复杂方案先团队讨论，编码逻辑保持清晰简单。
2. 代码格式工整有序，善用段落。不包含无用代码、历史代码。
3. 注释注重why而不是what，挖的坑要标fixme，todo。

## git提交规范
参照 https://github.com/angular/angular.js/blob/master/DEVELOPERS.md#-git-commit-guidelines
