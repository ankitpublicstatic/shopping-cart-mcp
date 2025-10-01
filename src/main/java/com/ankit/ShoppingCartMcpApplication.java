package com.ankit;

import java.util.List;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.ankit.tools.ShoppingCartMcpService;

@SpringBootApplication
public class ShoppingCartMcpApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShoppingCartMcpApplication.class, args);
  }

  @Bean
  public List<ToolCallback> shoppingCartToolCallback(ShoppingCartMcpService cartMcpService) {
    return List.of(ToolCallbacks.from(cartMcpService));
  }

}
