# spring自定义属性编辑器
### 总体流程
- 在实例化的时候把对应的属性编辑器添加到对应的bean包装类里面
```java
org.springframework.beans.factory.support.AbstractBeanFactory.initBeanWrapper()
```
- 在bean填充属性时根据属性的类型调用对应的属性编辑器
```java
org.springframework.beans.TypeConverterDelegate.doConvertTextValue()
//调用对应属性编辑器的该方法完成属性编辑
editor.setAsText(newTextValue);
```

### 涉及到的知识
- 内省在wiki上的解释：

在计算机科学中，内省是指计算机程序在运行时（Run time）检查对象（Object）类型的一种能力，通常也可以称作运行时类型检查。
不应该将内省和反射混淆。相对于内省，反射更进一步，是指计算机程序在运行时（Run time）可以访问、检测和修改它本身状态或行为的一种能力。

https://www.cnblogs.com/alice-cj/p/11444723.html