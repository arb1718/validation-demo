package org.sarsandi.rajeev.validationdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class ValidationDemoApplicationTests {

  @Test
  void contextLoads() {

    List<String> names =
        Arrays.asList("jack", "ram", "lok", "dillon").stream()
            .filter(name -> name.startsWith("j"))
            .collect(Collectors.toList());
    names.forEach(name -> System.out.println("Hello" + name));
	System.out.println("Jenkins up");
  }
  
  
}
