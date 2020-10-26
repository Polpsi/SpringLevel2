package springlevel2.statisticmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

@SpringBootApplication
@IntegrationComponentScan
public class StatisticModuleApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(StatisticModuleApplication.class, args);

        Message<String> message = MessageBuilder
                .withPayload("body")
                .setHeader("header", "value")
                .build();

        MessageChannel channel = (DirectChannel) context.getBean("channel_no5");
        channel.send(message);
    }

    @ServiceActivator(inputChannel = "channel_no5")
    public void foo(@Payload String payload, @Headers Map<String, Object> headerMap){
        headerMap.forEach((s, o) -> System.out.printf("%s:%s\n", s, o));
        System.out.println(payload);
    }


}