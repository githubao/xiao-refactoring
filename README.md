# xiao-refactoring
&lt;refactoring: improving the design of existing code> src code

#### 重构列表

##### 函数
1. Extract Method(抽取完成固定功能的一段代码为方法)
2. Inline Method(一行的调用，就没必要作为方法)
3. Inline Temp(没有必要的临时变量就去掉)
4. Replace Temp with Query(使用get方法获取临时变量的值)
5. Introduce Explaining Variable(为每次操作赋值有意义的临时变量名称)
6. Split Temporary Variable(临时变量应该只有一个职责，如果有多个，声明多个变量)
7. Remove Assignments to Parameters(不要对方法的参数进行赋值)(无论对象还是数值引用，都是值引用，浅拷贝)
8. Replace Method with Method Object(如果方法的参数太多，新建一个对象)
9. Substitute Algorithm(替换旧的算法)

##### 对象
1. Move Method(方法应该属于哪个类)
2. Move Field(字段应该属于哪个类)
3. Extract Class(如果一个类太臃肿，那么考虑分散职责)
4. Inline Class(该类只是public类的附属类)
5. Hide Delegate(没必要向客户端暴露类的内部调用细节)
6. Remove Middle Man(去除没必要的委托，明确是否是真的委托的关系)
7. Introduce Foreign Method(外部添加方法完善api)
8. Introduce Local Extension(外部继承类完善api)

##### 组织数据
1. SelfEncapsulate Field(get和set包装字段的访问)
2. Replace Value with Object(明确类的职责，哪些功能需要一个新类来实现)
3. Change Value to Reference(限定类的创建方式，什么情况下是相同的对象。Date类是可变的)
4. Change Reference to Value(保证类是不可变的，是pojo。String类是不可变的)
5. Replace Array with Object(数据里面的对象，表示的不是相同语义的东西的时候)
6. Duplicate Observed Data(分离逻辑，复制数据字段到控制层，view只负责展示，controller层设置数据)
7. Change Unidirectional Association to Bidirectional(互相持有引用)
8. Change Bidirectional Association to Unidirectional(不要循环引用)
9. Replace Number with Symbolic Constant(使用常量类)
10. Encapsulate Data(使用get和set访问字段值)
11. Encapsulate Collection(get返回不可变的对象，提供add和remove单个元素的方法)
12. Replace Record with Class(对于外部的数据记录，使用一个新的数据类来表示)
13. Replace Type Code with Class(使用枚举替代类型码)
14. Replace Type Code with Subclass(使用继承和多态替代类型码)
15. Replace Type Code with State/Strategy(使用策略或者状态模式替代类型码)
16. Replace Subclass with Field(如果子类只是常量数据的不同，那么删除它)

##### 简化条件
1. Decompose Conditional(条件判断抽取为独立的函数)
2. Consolidate Conditional Expression(相同的条件分支判断条件逻辑结果相同，则合并)
3. Consolidate Duplicate Conditional Fragments(不要在条件体里面写共同的代码)
4. Remove Control Flag(在循环中最好不要使用布尔变量进行条件控制，而是使用break/continue)
5. Replace Nested Conditional with Guard Clauses(使用return替代复杂嵌套的条件判断)
6. Replace Conditional with Polymorphism(使用多态替换switch语句)
7. Introduce Null Object(不要返回空对象，返回空内容的实体对象)
8. Introduce Assertion(使用断言来表示代码执行的先决条件)

##### 简化函数
1. Rename Method(函数的名字应该表达它的作用和含义)
2. Add Parameter(为函数添加必要的参数)
3. Remove Parameter(移除函数不必要的参数)
4. Separate Query from Modifier(不要既查询状态，又修改状态。任何有返回值的函数都不应该有副作用(修改值))
5. Parameterize Method(向函数传递参数而不是新建冗余的方法)
6. Replace Parameter with Explicit Methods(用确定的方法替代传参调用)
7. Preserve Whole Object(传递整个对象使得内部可以使用各种信息)
8. Replace Parameter with Methods(如果函数参数是通过调用另外一个函数获得的，那么它没必要存在)
9. Introduce Parameter Object(传递函数很多的时候，使用对象传参)
10. Remove Setting Method(为保证对象不被修改，移除设值函数)
11. Hide Method(外部使用不到的函数，改成私有调用)
12. Replace Constructor with Factory Method(使用工厂方法)
12. Encapsulate Downcast(如果必须要强制类型转化，那么最好封装成函数)
13. Replace Error Code with Exception(用异常代替错误码)
13. Replace Exception with Test(不要用异常处理正常的情况)

###### 处理概括关系
1. 

#### 重构原则

- 何为重构
- 为何重构
- 何时重构
- 怎么对产品经理说
- 重构难题(数据库中间件设计，接口修改，)
- 重构与设计
- 重构与性能

1. 事不过三，三则重构
2. 不要过早发布接口。请修改你的代码所有权政策，使重构更顺畅。

#### 测试原则

1. 确保所有测试都完全自动化，让它们检查自己的测试结果。
2. 考虑可能出错的边界条件，把测试火力集中在那儿。
3. 当事情被认为应该会出错时，别忘了检查是否抛出了预期的异常。
4. 不要因为测试无法捕捉所有bug就不写测试，因为测试的确可以捕捉到大多数bug。


#### 坏的代码

1. 重复代码
2. 过长函数
3. 过大的类
4. 过长参数列
5. 发散式变化(对于多个不同变化，必须要修改相同的函数)
6. 霰弹式修改(对于一个相同的变化，必须要修改多个地方)
7. 依恋情节(一个类对其他类的依赖超过对自己的依赖)
8. 数据泥团(多个不同数据杂糅在同一个类)
9. 基本类型偏执(使用对象替代表意不明的基本类型)
10. switch惊悚现身
11. 平行继承体系(过度继承会引起重复的功能)
12. 冗赘类(删除掉没有意义的类)
13. 夸夸其谈未来性
14. 令人迷惑的暂时字段
15. 过度耦合的消息链(委托的实现不宜太长)
16. 中间人(委托是否有必要)
17. 狎昵关系(任何类应该权责分明)
18. 异曲同工的类
19. 不完美的类库(不要过分依赖，使用补丁或者外部实现优化)
20. 纯粹的数据类(应该有访问权限控制，get和set)
21. 被拒绝的遗赠(如果不实现方法，那么就没有必要继承)
22. 过多的注释
