# Experiment-06
### EL & JSTL实验
需求+1 <br>
以表格形式显示所有注册教师姓名及注册时间 <br>
且教师姓名为可点击的超链接，点击后跳转至教师详细信息页面 <br>
在详细页面以表单形式，基于教师注册过的信息，加载初始化页面 <br>
提交表单后，在控制台打印显示修改后的数据 <br>

解决方案 <br>
项目结构规范：所有控制层组件servlet，置于com.controller包下；所有视图文档，置于/WEB-INF/jsp/目录下 <br>

创建加载显示全部教师的listteachers.jsp页面，在文档顶部引入JSTL标签库，通过EL表达式与JSTL标签，动态生成表格，动态生成超链接的地址及参数数据 <br>

创建处理对应请求的ListTeachersServlet，调用DatabaseUtils中的相应方法，获取全部教师对象并转发至视图页面 <br>

创建updateteacher.jsp页面以及表单，在表单标签中加载教师详细信息，
在页面引入核心及格式化标签库，按以下样式加载基本数据，基于逻辑判断，按教师原注册的职称及课程数据，渲染初始化页面 <br>

创建处理对应请求的UpdateTeacherServlet，获取教师ID参数，调用DatabaseUtils中的相应方法，
将：指定教师、全部职称、全部课程对象，转发至页面 <br>

由UpdateTeacherServlet，同时处理提交修改post请求，获取请求参数并打印显示 <br>

注意部署方法，需要在tomcat的配置中，添加实验项目(参考视频内容)，以及修改根路径地址 <br>

向声明的地址发送请求 <br>
http://localhost:8080/listteachers <br>
http://localhost:8080/updateteacher?tid=2 <br>

