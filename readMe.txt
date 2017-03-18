卡夫卡demo
消息提供者-broker-消息消费者
http://blog.csdn.net/evankaka/article/details/52421314
需要配置Zookeeper的环境变量

kafka-one:是直接使用main函数直接使用，是一个基础的方法（先启动消费者，再启动生产者，参考：http://lxw1234.com/archives/2015/09/512.htm）
kafka-two:使用springboot不使用配置文件的方式使用
kafka-three:是使用配置文件的方式使用kafka