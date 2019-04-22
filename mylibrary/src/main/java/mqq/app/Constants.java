package mqq.app;

/**
 * 作者：你的.魅影
 * 创建：2018/4/24  21:36
 * 邮箱：710360540@qq.com
 * 微博：http://www.weibo.com/meiying6666
 */
public class Constants {

    public enum LogoutReason {
        user,
        expired,
        gray,
        kicked,
        tips,
        suspend,
        forceLogout,
        switchAccount,
        secKicked
    }

    public enum PropertiesKey {
        uinDisplayName,
        nickName;

        public String toString() {
            return name();
        }
    }

}
