# Experiment-07
### JDBC实验
需求+1 <br>
在index.jsp添加form表单，像数据库插入用户<br>
在com.controller下，创建AddUserServlet类，接收用户名，调用UserService服务插入到数据库，重定向到/listusers<br>
需求+1<br>
在index.jsp添加form表单，修改指定用户的用户名<br>
在com.controller下，创建UpdateUserServlet类，接收用户ID与新用户名，调用UserService服务更新数据库，重定向到/listusers<br>
需求+1<br>
在index.jsp用户名列表，添加跳转超链接<br>
在com.controller下，创建GetUserServlet类，接收用户ID，调用UserService服务获取指定用户详细信息，转发至/getuser<br>
创建getuser.jsp，显式用户详细信息<br>
<br>
解决方案<br>
在com.entity下创建User实体类，声明id，name，insertTime等属性，对应数据库字段<br>
在com.util下，创建容器启动监听器DataSourceUtils，注入DataSource对象，暴露连接对象获取方法<br>
在com.service下，创建UserService接口<br>
在com.service.impl下，创建接口实现类UserServiceImpl，基于JDBC实现以上接口中的方法<br>
在com.service下，创建ServiceFactory服务工厂，对外暴露服务对象，隐藏服务的具体实现。即，外部仅通过服务工厂获取指定服务接口对象，无需关心接口的具体实现类
<br>
在com.controller下，创建ListUsersServlet，通过工厂类获取UserService服务接口对象，加载全部用户信息，将数据推送到页面index.jsp
<br>
在/WEB-INF/jsp/下，创建listusers.jsp，基于JSTL标签，加载全部用户
<br>
部署运行。注意部署时的配置<br> 
# Experiment-08
### MVC整合实验
整合课程学习内容，基于MVC设计模式完成项目的设计与开发。<br> 
本实例内容，着重强调基于MVC设计模式Web工程项目的整体结构，所有代码、文件可直接使用<br> 
基于experiment-07模块完成<br> 
需求+1 <br> 
在/WEB-INF/jsp/下，创建common目录，创建header.jsp代码片段，定义上导航内容及样式 <br> 
在common下，创建footer.jsp代码片段，定义页脚内容及样式<br> 
在common下，创建sidebar.jsp代码片段，定义左导航代码片段<br> 
<br> 
在com.controller下，创建IndexServlet类，获取全部用户信息，并推送到index.jsp页面<br> 
在/WEB-INF/jsp/下，创建index.jsp，基于jsp指令，引入header footer sidebar文件，定义整体样式及表格等样式，动态生成表格数据<br> 



