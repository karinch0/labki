package hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorControllerTest {

    @Test
    public void testValidExpression() {
        // Тест для виразу "1+1"
        Expression expression = new ExpressionBuilder("1+1").build();
        double result = expression.evaluate();
        Assertions.assertEquals(2, result, 0.001); // Тест має пройти
    }

  /* @Test
    public void testInvalidExpression() {
        // Тест для виразу "5-1"
        Expression expression = new ExpressionBuilder("5-1").build();
        double result = expression.evaluate();
        Assertions.assertEquals(2, result, 0.001); // Цей тест має показати помилку
    }*/
}
