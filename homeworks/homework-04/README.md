# Homework-04
### 浮动按钮
实现效果：当悬浮在浮动按钮，动态改变按钮图标，过渡旋转180度，渐入二级图标列表     
基于homework-03介绍的Google Material Icon实现   
可以通过国内CDN节点引入jquery，https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js

![result](https://github.com/bwhyman/web-course/blob/master/homeworks/homework-04/screen-01.gif)

### 原理与思路
难点在于：<br>
通过jquery动态改变元素文本内容，从而改变浮动按钮图标，较简单，但通过jquery实现转动较复杂 <br>
通过CSS实现转动较简单，但无法改变元素文本内容 <br>
因此需要结合jquery+css共同实现 <br>

布局/样式 <br>
浮动容器，绝对定位到右上角，内容居中 <br>
浮动容器中按钮图标，颜色/尺寸大小等等 <br>
浮动按钮图标最好选用实心图标，空心最好加背景，否则浮动按钮可能不明显 <br>
浮动容器中的二级列表，每个列表项中超链接，内容为图标，列表隐藏 <br>
可声明特定的二级图标样式，例如删除为红色 <br>
悬浮在容器时，按钮图标旋转180度，渐变 <br>

jquery <br>
容器悬浮监听，进入，修改按钮图标，二级列表渐入；移出，改回按钮图标，二级列表渐出   