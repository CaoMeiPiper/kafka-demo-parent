卡夫卡demo
消息提供者-broker-消息消费者
http://blog.csdn.net/evankaka/article/details/52421314
需要配置Zookeeper的环境变量

只有 2.10 版本才能在windows上运行


运行Kafka服务器
重要：请确保在启动Kafka服务器前，Zookeeper实例已经准备好并开始运行。
1.进入Kafka安装目录C:\kafka_2.11-0.9.0.0\
2.按下Shift+右键，选择“打开命令窗口”选项，打开命令行。
3.现在输入.\bin\windows\kafka-server-start.bat .\config\server.properties 并回车。
.\bin\windows\kafka-server-start.bat .\config\server.properties


kafka-one:是直接使用main函数直接使用，是一个基础的方法（先启动消费者，再启动生产者，参考：http://lxw1234.com/archives/2015/09/512.htm）
kafka-two:使用springboot不使用配置文件的方式使用
kafka-three:是使用配置文件的方式使用kafka