# Experiment-05
### Servlet & Filter实验
需求+1 <br>
在/WEB_INF/jsp/下，创建login.html登录页面，声明登录form表单，向/login发出请求 <br>
在/WEB_INF/jsp/下，创建welcome.html页面，声明欢迎文本 <br>
在java目录下，编写java代码 <br>
在com.controller下，创建LoginServlet类，处理/login地址请求，重写doGet()方法，转发请求至login.html文档 <br>
在com.controller下，创建WelcomeServlet类，处理/welcome地址请求，重写重写doGet()，转发至welcome.html文档 <br>
在login.html添加，向/welcome地址请求的超链接 <br>
基于，9.2Deploy Project on Tomcat，部署运行项目至tomcat <br>
向login发起请求，http://localhost:8080/login <br>
正确运行后，浏览器将显式登录页面 <br>

需求+1 <br>
在com.entity下，创建User类，封装用户真实姓名，用户名，密码属性 <br>
重写LoginServlet的doPost()方法，获取页面传入的登录用户名/密码参数，
实现当用户名/密码为指定字符串时，创建user对象，并将对象添加至session中；
且，登录成功，重定向到/welcome，即welcome页面，登录失败，重定向到/login，登录页面 <br>

此时，仍可向/welcome地址，直接发送请求 <br>

需求+1 <br>
在com.filter下，创建LoginFilter过滤器，声明排除路径，重写doFilter()方法，判断请求路径是否为排除路径，判断用户是否登录，
从而实现，当用户未登录时，重定向到/login登录 <br>

重启服务器，尝试在未登录状态下，向/welcome请求；登陆后，重定向到/welcome；
打开新窗口向/welcome请求，可通过，从而验证过滤器的实现 <br>

http://localhost:8080/welcome <br>
