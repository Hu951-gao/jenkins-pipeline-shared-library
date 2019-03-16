为什么要使用jenkins pipeline shared library
---
随着扩展的越来越大，Jenkins pipeline的任务越来越多，很多地方都是重复的，每次都copy重新配置一次很不方便，而且如果更新的话，还需要手动一个一个pipeline任务的去改，可能存在漏改，错改的情况。pipeline shared library就是把重复的部分放到一个代码仓库中，任务需要用的时候直接应用就可以了，这样就不需要一个一个pipeline任务的去配置，需要release新版本的时候，也只需要改一个地方。

配置shared library
---
1、Jenkins系统变量中Global Pipeline Libararies项配置添加pipeline shared library

2、在pipeline的pipeline script中进行引用
```
@Library("pipeline_shared_library@master") _        ##pipeline_shared_library为上一步中Jenkins配置的名称，@master为代码仓库分支，为空时为默认值
import test.*     ##调用代码仓库的某个文件
new example1().excute()  ##调用文件中的函数
```
