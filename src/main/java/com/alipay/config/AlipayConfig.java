package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092500596041";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCzMzByvlhnZcBPQvq2r/kc2Gvyo3h/YL1PM7XpwSYwQeSqqig5bwGcWfeg8M3OQxQyVt3AMBJhEdpZLRLpPyR7Clf7L3YUF4QTY/7CyvB02TccnlNe0EENg9A781zqqWtFEgtlW9PY1DdJoqpLbPBV1U9ZGbOuh+Xl+sOThEWAasZpsUUS/RXUz0V+wcfF6Ok9AzrRRD5W2p5Ld27Nk6gZuGb/I9v+Ty6K0ybNr6AfR+xzBD7SCq85VEnlD5Z+OeLn9oe4gq/bNXL3173cAzBU5q0LpyBa9hMsZTb2cqgXXV3dn9SSkiqhvI5/ITr/vSzL4ucCHMoVCx2olhnHHWvPAgMBAAECggEAZs1+BMWX97FS0uXM6NMpKVgrDWakcQaxc+dpe/F3lAWpRhMZwmEhXm3qdqTOnH607nARBPlPAer5BWGrUK4Nopx7frlqlvoqpeketOcxbQdT65IUp/b26ubspgfmDSUmSdihOwOkE+ci1JaB9YVIlyUpQSdSglSqGfZzDoS6ToF8ZzAZl09xmCTYRZiVne9vwVNysr9i8Hbb+nR4Rux48y//iBq+LHR9M32KHjh/n86UTJDRxGVChMgXdRw45NxkQnhz/ViEfz0HlEY2gpzmPK7oaHdtOxGvoDBReHRXMn3C2OrhD2K1YhdgM/foshcwppdW9oPt0eO7u2TIYO4DOQKBgQDmrElnSaR7f8YDfdWm2SQ4m2KDSm6dhyBA5udz1YaE2/AtvMvvtrLyFnARqWv0Tht/efMM7rHclS0gsh6lEFaqTbA6kRmZPuvWERITK1M6pq8D4/fv4UeKSbHxx6xhO7LpMw9FNuKioCa9pOAOg7u8ZP8y3OXq4VNbn/Vhz5yBPQKBgQDG4BupMog53UMM3NzTxJgzo6DW3FJTEs/pls9olBNgKE6FQthvZnwexG3iaLYo3r4ayyAsKsDaJP8dgafxdLcSBEQsf8Sk2LNhEXdgsoehdJPqf7u703duXXmGZQKKDsnbVdrogB9bogkQWfijotMnI1LDLIcrNLcILgGJwXbZ+wKBgGVsu5m+t6PVuqsuWRLTxylcqSQxRhHdqEDhRkOYT117l0+FA+aS3nuzgfNCG0WAUnbqmAPHsEzdCsqlhvPtCy42mpYl1qubDvdA6kGjeyT+xVVgl1PSKjKT1LoKobDfHvuKh9xXFa+L23znUd0P7ywW/F7Q4gc0rAJNgwdO0fHBAoGBAIPu5srPWCozDCk7WFAwqtwPIEOJ9B9iaoXHY584JMZ01up3FwiIT61FmLRLzRS9+BXkTVqfnkLZqlkTy6tWR6DvLZ7rwDOwAwhRQwXmSi4lHX/C73NCbYfNATLUTePyvZ0BjvERFjx++U5csaM1AKmFOIF8R8u08/u8MY8GxmcDAoGBAKBHIVOwCjWJro5rTeWlakg1X/Gn0l5Y0QoM4EoT4TCjb+eJW+UBEoevUhJHRuZlsLw61sP1Aq6IC7mTBJl05UPEOfG3U3j8J9Evxil91g5h5ekFWmKbOxuOYUF1b0OsoSDmY/y3TPw5deIF2kfy5Ukn2Pl+Fg/Wq492tRbBXqGo";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAszMwcr5YZ2XAT0L6tq/5HNhr8qN4f2C9TzO16cEmMEHkqqooOW8BnFn3oPDNzkMUMlbdwDASYRHaWS0S6T8kewpX+y92FBeEE2P+wsrwdNk3HJ5TXtBBDYPQO/Nc6qlrRRILZVvT2NQ3SaKqS2zwVdVPWRmzrofl5frDk4RFgGrGabFFEv0V1M9FfsHHxejpPQM60UQ+VtqeS3duzZOoGbhm/yPb/k8uitMmza+gH0fscwQ+0gqvOVRJ5Q+Wfjni5/aHuIKv2zVy99e93AMwVOatC6cgWvYTLGU29nKoF11d3Z/UkpIqobyOfyE6/70sy+LnAhzKFQsdqJYZxx1rzwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
    public static String notify_url = "http://192.168.0.111:8989/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
    public static String return_url = "http://192.168.0.111:8989/return_url.jsp";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
