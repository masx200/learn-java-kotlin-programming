package chapter.seven.nine.two.one;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HrefMatch {
    public static void main(String[] args) {
        try {
            Scanner typeIn = new Scanner(System.in);
            System.out.println("请输入网址:");
            String urlString = typeIn.nextLine();

            OkHttpClient client = new OkHttpClient();

            Request getRequest = new Request.Builder()
                    .url(urlString)
                    .build();
            try (Response response = client.newCall(getRequest).execute()
            ) {
                var input = response.body().string();
                System.out.println("网页内容如下:");
                System.out.println(input);
                //<a href = " ..." > 的模式串
                String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>])\\s*>";
                //编译模式串(区分大小写),生成模式对象
                Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(input); //匹配器对象赋值
                while (matcher.find()) {  //查找匹配串
                    int start = matcher.start();
                    int end = matcher.end();
                    String match = input.substring(start, end);
                    System.out.println(match);
                }

            }

        } catch (IOException | PatternSyntaxException e) {
            e.printStackTrace();
        }
    }
}