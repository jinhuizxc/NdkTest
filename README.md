# NdkTest
NdkTest,学习测试遇到一些坑，记录，待更新...

 # android ndk编程
 * https://blog.csdn.net/qq_41063141/article/details/83298633

 # 记录下几个异常:
 * 1、Error: Your project contains C++ files but it is not using a supported native build system
 
 解决办法: https://blog.csdn.net/lzh838330255/article/details/81703849
   在app的 build.gradle 中的 buildType中添加 以下这句代码：
 ```
 // 添加这句代码
  sourceSets{
     main {
          jni.srcDirs = []
      }
  }
 ```

 * 2、make project异常:
 Error: Your project contains C++ files but it is not using a supported native build system.
  Consider using CMake or ndk-build integration. For more information, go to:
  https://d.android.com/r/studio-ui/add-native-code.html
  Alternatively, you can use the experimental plugin:
  https://developer.android.com/r/tools/experimental-plugin.html
 解决方法: https://blog.csdn.net/xiaozhu0922/article/details/78835144
```
在build.gradle的defaultConfig节点下加入：
 // 使用Cmake工具
 externalNativeBuild {
 cmake {
 cppFlags “serial_port”
 //生成多个版本的so文件
 abiFilters ‘arm64-v8a’, ‘armeabi-v7a’
 }
 }
 在build.gradle的android节点下加入：
 // 配置CMakeLists.txt路径
 externalNativeBuild {
 cmake {
 path “CMakeLists.txt” //编译后so文件的名字
 }
 }
```
* 3、打开旧项目报异常:
     解决"No toolchains found in the NDK toolchains folder for ABI with prefix: mips64el-linux-android"错误
     解决办法: https://blog.csdn.net/vocanicy/article/details/83004626
     其实解决方法很简单，就是修改build.gradle,改为3.1以上版本即可

# 参考资料:
* AndroidStudio JNI详细教程+Gradle3.0以上JNI爬坑之旅 https://www.jianshu.com/p/997ae19a5fae

