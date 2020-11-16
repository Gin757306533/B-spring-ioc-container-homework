# B-spring-ioc-container-homework
Spring IoC Container Basics 课程课后作业。

GreetingService 现在必须为 prototype scope，如何保证每次 GreetingController 的 greet() 方法被调用时都会创建新的 greetingService bean？
至少2种解决方法且
GreetingController 仍为 singleton scope。
每种方案分别提交到单独的分支上，这些分支都需从 p2-starts-from-here 分出来，依次命名为 p2s1、p2s2即可。

方案二：利用@Lookup方法，spring会覆盖带有@Lookup注解的方法