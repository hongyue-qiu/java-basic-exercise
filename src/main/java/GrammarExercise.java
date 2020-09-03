import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GrammarExercise {
    public static void main(String[] args) {
        //需要从命令行读入
        String firstWordList = "";
        String secondWordList = "";

        List<String> result = findCommonWordsWithSpace(firstWordList,secondWordList);
        //按要求输出到命令行

    }

    public static List<String> findCommonWordsWithSpace(String firstWordList, String secondWordList) {
        //在这编写实现代码
        if (firstWordList.contains(",,") || !firstWordList.matches("[a-zA-Z,]+") || !secondWordList.matches("[a-zA-Z,]+")) {
            throw new RuntimeException("input not valid");
        }
        String[] string1 = firstWordList.split(",");
        String[] string2 = secondWordList.split(",");
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        Collections.addAll(list1, string1);
        Collections.addAll(list2, string2);


        //finalWordLists.stream().forEach(str -> str.toUpperCase());
        List<String> list3 = list1.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        List<String> list4 = list2.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());

        list3.retainAll(list4);
        //list1.stream().distinct();
        Collections.sort(list1);
        List<String> result = list3.stream().map(string -> string.replace("", " ").trim()).distinct().collect(Collectors.toList());
        return result;
    }
}
