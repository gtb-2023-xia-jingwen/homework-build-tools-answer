# Build Tools Homework

## Problem 1：理解标准 gradle 项目中各部分的含义

请在下方 ✅ 后面填写你对该文件或文件夹含义的理解

```
├── app ✅                                       子项目目录
│         ├── build ✅                           子项目生成 artifacts 的目录
│         ├── build.gradle ✅                    子项目的 gradle build 脚本
│         └── src        
│             ├── main ✅                        子项目的源代码及配置文件目录
│             └── test ✅                        子项目的测试代码及配置文件目录
├── gradle        
│         └── wrapper        
│             ├── gradle-wrapper.jar ✅          包含用于下载 Gradle 版本代码的 jar 文件
│             └── gradle-wrapper.properties ✅   控制 Gradle Wrapper 运行时行为的属性文件
├── gradlew ✅                                   使用 Gradle Wrapper 在 Linux/Unix 平台构建的执行脚本
├── gradlew.bat ✅                               使用 Gradle Wrapper 在 Windows 平台构建的执行脚本
└── settings.gradle ✅                           项目的设置文件，定义了子项目的位置
```

## Problem 2：引入第三方 library 重构代码

请引入 `29.0-jre` 版本的 `Guava` 库，使用 `Joiner` 重构 `StringJoiner` 类的 `join` 方法。

请确保重构后的代码可以通过全部测试。
