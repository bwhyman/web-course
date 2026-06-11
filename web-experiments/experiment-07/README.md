# Experiment-07, JDBC实验
### 实验原理
通过配置DataSource连接数据库，通过JDBC Connection、PreparedStatement、ResultSet接口完成数据库操作。

### 实验目的
理解在Tomcat服务器配置DataSource数据源  
理解并掌握创建容器启动监听器的方法  
理解并掌握基于JNDI树自动注入DataSource数据源对象的方法  
理解并掌握Connection接口的基本使用方法  
理解并掌握通过PreparedStatement接口执行SQL语句的方法  
理解并掌握PreparedStatement接口赋值传参的方法  
理解并掌握通过ResultSet接口获取查询结果的方法  
理解并掌握基于try with resources的资源自动关闭的方法  

### 实验内容
基于web-experiments项目，声明项目打包类型，java版本，Servlet/MySQL Driver/Annotation/Jackson依赖，添加打包插件。    
远程IP：[视频Remote MySQL Connections](https://mooc1.chaoxing.com/mooc-ans/nodedetailcontroller/visitnodedetail?courseId=91374545&knowledgeId=868078605)
 - 基于idea database视图，个人学号/密码登录远程MySQL数据库  
 - 在已经默认创建的以个人学号命名的数据库下，创建数据表user，添加id/name/insert_time数据段，并声明合适类型
 - insert_time段为datetime类型，默认值记录插入时间  
 - 添加若干测试数据记录  

在webapp下，创建META-INF目录，直接复制context.xml资源配置文件，修改配置数据。  
在com.entity下创建User实体类，声明id/name/insertTime等合适数据类型属性，映射数据库字段。  
在com.util下，创建容器启动监听器DataSourceUtils，从JNDI树获取DataSource对象，暴露连接对象获取方法。

结合`动态渲染实验`。

**需求+1**  
在com.controller下，创建ListUsersServlet类，基于JDBC查询全部用户信息，封装每一条记录为对象，创建集合封装对象元素，序列化返回。

创建listusers.html视图，向后端请求全部用户数据，以列表动态渲染。

**需求+1**  
在com.controller下，创建GetUserServlet类，接收用户ID参数，基于JDBC查询指定ID用户信息，封装为对象，序列化返回。  

创建getuser.html视图，接收用户ID参数，并向后端请求指定ID用户数据，将响应的用户数据渲染到input
输入框。  
扩展listusers.html视图，将用户信息以超链接渲染，带参数跳转到getuser.html。

**需求+1**  
在com.controller下，创建UpdateUserServlet类，基于JDBC更新用户信息，返回成功标识。  

扩展getuser.html视图，基于fetch()实现 POST 请求，发送修改的用户信息至后端，返回更新成功标识后，弹出通知框。  