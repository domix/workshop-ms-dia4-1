package org.jllinares.microservice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * The Class CalculadoraServiceTests.
 */
public class CalculadoraServiceTests {
  
  /**
   * Test sum.
   */
  @Test
  public void test_sum() {
    CalculadoraService service = new CalculadoraService();
    assertEquals("La suma de 1 y 3 debe ser 3", Integer.valueOf(3), service.sum(1, 2));
  }
}