# Dubbo-admin

----------

## 操作如下
1.修改application.properties中相关配置信息如图,zookeeper配置以圈出
![](https://img-blog.csdnimg.cn/2018121415312121.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ppbmd5YW5nVjU4Nw==,size_16,color_FFFFFF,t_70)

2.maven打包
>mvn clean package

3.进入target目录 运行Java jar包
> java -jar dubbo-admin-0.0.1-SNAPSHOT.jar

## 访问
默认端口为7001，账号/密码 ：root/root<br>
访问地址为：http://localhost:7001/<br>
显示如下图,则访问成功
![](https://img-blog.csdn.net/20171226170908477?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvamluZ3lhbmdWNTg3/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)