# Homework-02
### Card布局
掌握以上给定的HTML布局方法，最后一次提供HTML布局，下次作业的HTML布局代码也自己写了   
基于Card设计模式，实现人物描述布局样式      
网站测试图库：https://pravatar.cc/   
网站提供多种尺寸风格的图片，可用于测试   

![result](https://github.com/bwhyman/web-course/blob/master/homeworks/homework-02/screen-01.PNG)

### 原理与思路
布局   
声明全局容器   
声明card容器   
card容器中声明header容器，header容器中声明引用一张网络图片   
card容器中声明content容器，content容器中声明描述段落，与超链接   
在全局容器中，创建3个card，指定不同图片   

样式   
全局box计算模式   
声明全局容器为弹性容器，将其中的3个card弹性横向布局   
card容器：合适宽度，合适的内外边距，内部元素居中   
header中的图片：显示为圆形半透明，尺寸按容器缩放   
描述内容：两端对齐   
超链接：背景淡红，的按钮式超链接    
当悬浮在card：card添加阴影   
当悬浮在card：图片不再透明，且添加渐变效果  
当悬浮在按钮式超链接：背景色纯红   
