# xiao-refactoring
&lt;refactoring: improving the design of existing code> src code

#### 重构列表

###### 函数
1. Extract Method(抽取完成固定功能的一段代码为方法)
2. Inline Method(一行的调用，就没必要作为方法)
3. Inline Temp(没有必要的临时变量就去掉)
4. Replace Temp with Query(使用get方法获取临时变量的值)
5. Introduce Explaining Variable(为每次操作赋值有意义的临时变量名称)
6. Split Temporary Variable(临时变量应该只有一个职责，如果有多个，声明多个变量)
7. Remove Assignments to Parameters(不要对方法的参数进行赋值)(无论对象还是数值引用，都是值引用，浅拷贝)
8. Replace Method with Method Object(如果方法的参数太多，新建一个对象)
9. Substitute Algorithm(替换旧的算法)

###### 对象
1. Move Method(方法应该属于哪个类)
2. Move Field(字段应该属于哪个类)
3. Extract Class(如果一个类太臃肿，那么考虑分散职责)
4. Inline Class(该类只是public类的附属类)
5. Hide Delegate(没必要向客户端暴露类的内部调用细节)
6. Remove Middle Man(去除没必要的委托，明确是否是真的委托的关系)
7. Introduce Foreign Method
8. Introduce Local Extension

###### 组织数据
1. SelfEncapsulate Field(get和set包装字段的访问)
2. Replace Value with Object(明确类的职责，哪些功能需要一个新类来实现)
3. Change Value to Reference(限定类的创建方式，什么情况下是相同的对象。Date类是可变的)
3. Change Reference to Value(保证类是不可变的，是pojo。String类是不可变的)
4. Replace Array with Object(数据里面的对象，表示的不是相同语义的东西的时候)
5. Change Unidirectional Association to Bidirectional
6. Change Bidirectional Association to Unidirectional
7. Replace Number with Symbolic Constant
8. Duplicate Observed Data
9. Encapsulate Data
10. Encapsulate Collection
11. Replace Record with Class
12. Replace Type Code with Subclass
13. Replace Type Code with State/Strategy



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
