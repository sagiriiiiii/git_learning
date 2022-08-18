package sky.almanac;

import java.util.Objects;

/**
 * @program: sky-almanac
 * @description: 测试类
 * @author: Cosmax C
 * @create: 2021-06-18 08:14
 **/
public class HelloPicDemoApplication {

    public static void main(String[] args) {

        // 获取今日实体
        TodayInfo demoName = TodayInfoUtils.getTodayInfoByUserName("折翼的走地小鸡");

        // 保存路径
        String path = Objects.requireNonNull(HelloPicDemoApplication.class.getClassLoader().getResource("")).getPath();
        path += "/今日黄历.jpg";

        PicUtils.drawHuangLi(demoName, path);
    }
}
