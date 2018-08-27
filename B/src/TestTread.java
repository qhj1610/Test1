import java.math.BigDecimal;

public class TestTread {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("111");
        threadLocal.set("222");
        System.out.println(threadLocal.get());

        System.out.println(BigDecimal.ZERO.setScale(2));

    }
}
