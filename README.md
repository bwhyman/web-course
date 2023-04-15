# Web Development Technologies
### Overview
China, Northeast Forestry University, Software Engineering, Web Development Technologies

Web开发技术，是东北林业大学软件工程专业第4学期的一门专业选修课，32+16课时。  
主讲教师：王波老师

课程基于HTML5/CSS3/JavaScript(ES2019+)，讨论基本Web网页设计开发技术。包括：  
基本HTML标签；栅格/弹性/响应式等基本布局方式；Card/模态框/浮动按钮等基本网页组件的设计实现；  
以及Servlet/JSP/JSTL/JDBC/异步非阻塞Servlet&Filter等基于java的服务器端技术，为后续Web系统框架(Springboot+SpringCloud+Vue)/移动终端软件设计(Flutter)课程提供支持

### Important Migrations(2022.12.07)
课程示例迁移到java17+Servlet6.0+tomcat10。  
servlet/jstl/annotation属于原Java EE规范，更名为Jakarta EE后包路径从`javax.*`，变更为`jakarta.*`。  
`javax.sql.*`，属于Java SE规范下`java.sql`模块，而非Java EE规范，因此无需变更。  

### Development Environments
 - Intellij IDEA Ultimate
 - OpenJDK ^17
 - MySQL ^8
 - Tomcat ^10
 - Git ^2.3
 - Chrome ^100

### Example Collections
 - /web-examples，课程示例
 - /web-experiments，实验示例 
 - /web-homeworks，作业示例 

### Documents
 - [开发环境](./home.md)

### Projects
- [课程设计](./project.md)
 
### Course Details
 - https://mooc1-1.chaoxing.com/course/91374545.html
 
### Related Courses
 - https://github.com/bwhyman/java-course
 - https://github.com/bwhyman/springboot-course
 - https://github.com/bwhyman/vite-vue3-examples
 - https://github.com/bwhyman/flutter_examples
