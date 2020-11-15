# B-spring-ioc-container-homework
Spring IoC Container Basics 课程课后作业。
主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

在应用开发的过程中，
如果想要将第三方库中的组件装配到你的应用中，
在这种情况下，是没有办法在它的类上添加@Component和@Autowired注解的，
因此就不能使用自动化装配的方案了。
但是可以通过xml 或者在@Configuration配置类中通过@Bean进行配置