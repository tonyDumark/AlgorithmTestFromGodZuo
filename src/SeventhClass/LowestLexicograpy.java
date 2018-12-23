package SeventhClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author : Wobum
 * @Date : 2018/12/23 17:01
 * @Software : IntelliJ IDEA
 * @Description: 给定一个字符串类型的数组strs，找到一种拼接方式，使得把所
 * 有字 符串拼起来之后形成的字符串具有最低的字典序
 **/
public class LowestLexicograpy {
    public static class StirngCompare implements Comparator<String>{

        @Override
        public int compare(String o1, String o2){
            return (o1 + o2).compareTo(o2 + o1);
        }
    }

    public static String lowestString(String[] strings){
        if (strings == null || strings.length == 0){
            return "";
        }

        Arrays.sort(strings,new StirngCompare());
        String res = "";
        for (int i = 0; i < strings.length; i++){
            res += strings[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs1 = { "jibw", "ji", "jp", "bw", "jibw" };
        System.out.println(lowestString(strs1));
        Arrays.sort(strs1);
        String[] strs2 = { "ba", "b" };
        System.out.println(lowestString(strs2));

    }



}
