# messageDemo-SpringCloud
消息通信的demo文件集
1、生产者Producer具备Feign客户端，调用dbService微服务；

2、增加微服务dbService,通过Spring Data Jpa 访问数据库获取对象user

3、生产者Producer将获取对象user通过RabbitMQ,发送给消费组groupA和
groupB

