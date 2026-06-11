# Experiment-05, 异步交互与页面动态渲染实验

### 实验原理

结合jquery/fetch()/Jackson实现后端数据请求，并将数据动态渲染到页面视图。

### 实验目的

理解并掌握基于 Servlet 实现服务器端请求/相应处理。  
理解并掌握基于Jackson的对象序列化/反序列化方法。  
理解并掌握 fetch() 异步请求函数的使用方法。  
理解并掌握基于 jquery 更新视图节点的方法。

### 实验内容

按前后端分离开发设计模式，后端仅负责处理业务并响应数据，不再处理页面的动态渲染，跳转转发等操作。

前端负责渲染基础视图结构，异步请求后端数据，动态创建视图组件并填充。

**环境**

基于web-experiments项目  
声明项目打包类型，声明java版本，添加Servlet依赖，添加Jackson依赖。  
创建webapp目录。    
entity/*，util/JacksonUtils，service/UserService，基础代码可直接复制使用。

**需求+1**

实现controller控制层组件。  
编写ListTeachersServlet，处理请求路径`/api/listteachers`，从模拟业务获取全部用户信息，序列化为JSON字符串，返回响应客户端。

编写listteachers.html视图，构建基础table组件。  
异步请求`/api/listteachers`获取全部用户数据。  
动态将数据填充至table组件。

**需求+1**

编写GetTeacherServlet，`/api/getteacher`，获取请求参数，调用模拟业务获取指定参数用户详细信息，获取全部titles/courses数据，序列化响应客户端。

编写getteacher.html视图，构建input/select/checkboxs等基础组件。  
异步请求`/api/getteacher`，传递用户ID参数，获取指定用户详细信息。  
动态将数据渲染至form表单相应组件。  
基于用户数据，设置下拉框/复选框等组件的默认渲染样式。

扩展listteachers.html视图，将用户姓名渲染为跳转并传递ID参数的超链接。
移除默认ISO时间中的分隔符`T`。