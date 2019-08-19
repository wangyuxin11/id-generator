package org.github.id.generator.baidu.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * # 链接：https://www.jianshu.com/p/947bff7be2da
 * # 参考：https://github.com/hansonwang99/Spring-Boot-In-Action/tree/master/springbt_uid_generator
 * # 源码：https://github.com/baidu/uid-generator
 *
 */
@SpringBootApplication
@MapperScan({"org.github.id.generator.baidu.consumer", "org.github.id.generator.baidu.fsg.uid.worker.dao"})
public class UidConsumerApplication {

	//我们每启动一次 Spring Boot工程，其即会自动去 MySQL数据的 WORKER_NODE表中插入一行关于工作节点的记录，类似下图所示：
	public static void main(String[] args) {
		SpringApplication.run(UidConsumerApplication.class, args);
	}
	
}



/*
基于百度的UidGenerator改造的全局唯一id生成器

版权声明：本文为博主原创文章，遵循 CC 4.0 by-sa 版权协议，转载请附上原文出处链接和本声明。
本文链接：https://blog.csdn.net/gaoshili001/article/details/79126695


其实百度的UidGenerator生成器也是基于snowflake算法的，在原生的项目中使用的基于数据库的，我改造成了基于zookpeer的，用zookpeer的序列号实现分布式seq的生成（代替了算法中的机器码）；

关于uidgenerator我这里就不多说了，不了解的可以去看下资料http://blog.csdn.net/littlesmallless/article/details/69663640

*/