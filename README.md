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

案例：根据不同请求类型，领取不同的奖品（优惠券、第三方积分卡、奖品）

### 抽象工厂

简单工厂：提供方法的工厂，比如提供了领取优惠券的方法。

工厂方法：提供工厂的方法，比如提供领取优惠券的工厂，你需要使用该工厂所提供的方法，才能领取优惠券。

抽象工厂：提供组合工厂的方法。

案例：替换Redis双集群升级

随着这次的升级，可以预见的问题会有；

1. 很多服务用到了Redis需要一起升级到集群。
2. 需要兼容集群A和集群B，便于后续的灾备。
3. 两套集群提供的接口和方法各有差异，需要做适配。
4. 不能影响到目前正常运行的系统。

这里的抽象工厂的创建和获取方式，会采用代理类的方式进行实现。
所被代理的类就是目前的Redis操作方法类，让这个类在不需要任何修改下，就可以实现调用集群A和集群B的数据服务。

并且这里还有一点非常重要，由于集群A和集群B在部分方法提供上是不同的，
因此需要做一个接口适配，而这个适配类就相当于工厂中的工厂，
用于创建把不同的服务抽象为统一的接口做相同的业务。这一块与我们上一章节中的工厂方法模型类型，可以翻阅参考。

### 建造者模式

建造者模式所完成的内容就是通过将多个简单对象通过一步步的组装构建出一个复杂对象的过程。

将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。

场景：

很多装修公司都会给出自家的套餐服务，一般有；欧式豪华、轻奢田园、现代简约等等，
而这些套餐的后面是不同的商品的组合。例如；一级&二级吊顶、多乐士涂料、圣象地板、马可波罗地砖等等，
按照不同的套餐的价格选取不同的品牌组合，最终再按照装修面积给出一个整体的报价。

### 原型模式

原型模式主要解决的问题就是创建重复对象，而这部分对象内容本身比较复杂，
生成过程可能从库或者RPC接口中获取数据的耗时较长，因此采用克隆的方式节省时间。

场景：

考试，混排题目，混排选项