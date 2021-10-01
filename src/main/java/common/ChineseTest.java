package common;

import com.github.houbb.opencc4j.util.ZhConverterUtil;

/**
 * @author vert on 2021/10/1
 */
public class ChineseTest {
    public static void main(String[] args) {
        String original = "生命在于运动";
        String result = ZhConverterUtil.toTraditional(original);
        System.out.println(result);
    }
}
