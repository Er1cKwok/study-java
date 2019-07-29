import java.math.BigDecimal;

public class BigDecimalTest {
  public static void main(String[] args) {
    BigDecimal bd = new BigDecimal("1.023");
    BigDecimal bd1 = new BigDecimal("0.023");
    BigDecimal a = bd.subtract(bd1);
    System.out.println(a);
  }
}
