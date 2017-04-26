# SSH_DEMO
ssh（spring+springMVC+hibernate）框架的简单整合（通过xml文件整合）
## SSH框架的搭建步骤
### 1、装配数据源文件（*.properties）
### 2、配置数据源（DataSource）
### 3、将hibernate的sessionfactory整合到spring中
#### ---3.1、将spring中得到的数据源注入到sessionFactory中
#### ---3.2、将ORM映射文件整合到sessionFactory中
#### ---3.3、配置hibernate的额外属性（show_sql等）
### 4、配置事务控制
#### ---4.1、配置事务管理器（注入spring整合的sessionFactory对象）  
#### ---4.2、配置事物传播性
#### ---4.3、组装切入点和事物传播性
### 5、配置struts2
### 6、在web.xml文件中配置spring容器中的web监听器
### 7、配置web容器中的初始化参数（contextConfigLocation）
