package common;

import org.apache.commons.math3.util.ArithmeticUtils;

/**
 * @author vert on 2021/10/1
 */
public class GcdTest {
    public static void main(String[] args) {
        //计算两个整数的公约数
        int a = ArithmeticUtils.gcd(361,285);
        System.out.println(a);
    }
}
