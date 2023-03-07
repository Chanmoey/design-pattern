# 学习设计模式
学习设计模式，改善代码质量。

## 六大设计原则

### 单一原则

一个类（模块、方法）应该只有一个发送变化的原因，我的理解就是一个基本单位，就负责一个事情就好。

如果一个类或者一个方法负责的内容太多，不仅使得代码复杂的提高，导致后期难以维护，而且一个方法太重，也会影响到
方法的复用，例如甲方法完成了ABC的任务，在以后，我需要完成B任务时，无法复用甲方法，就要重新写一个方法了。

### 开闭原则

类、模块、函数等应该对扩展是开放的，对修改是封闭的。

修改可能会许多未知的错误，对于需求的变更，应该添加新的代码去应对，而不是修改原有的代码。

### 里氏替换原则

继承必须确保超类所拥有的性质在子类中依然成立。

如果继承的子类要改写父类提供的逻辑，那么则考虑这个继承逻辑是否成立。

如果子类改写了父类提供的功能，将来父类的功能升级后，子类将无法享受到这次升级的成功。

### 迪米特法则

用于降低类之间的耦合。

每个对象尽可能减少对其他对象的了解，因此使得系统间模块相互独立，相互之间很少有依赖关系。

尽可能少的依赖其他类。

### 接口隔离原则

将庞大臃肿的接口，拆分成几个更小、更具体的接口。让接口只包含客户感兴趣的方法。

更小的接口，可以细分不同的职责，也符合单一原则。

### 依赖倒置原则

依赖抽象，而不是依赖具体。

具体表现为在编码的过程中，我们要依赖接口，而不是依赖具体实现，降低耦合。

比如Controller层依赖的是Service层的接口，而不是具体的Impl。

后期业务变更，只需要更改配置文件，控制IOC容器的注入逻辑，就可以实现不改变Controller代码
的情况下，对业务进行升级。

## 创建型

### 简单工厂模式

在父类中提供一个创建对象的方法， 允许子类决定实例化对象的类型。

接收用户获取对象的请求，通过if else返回具体的对象，或者通过Map管理对象，通过get
返回用户的需求。

