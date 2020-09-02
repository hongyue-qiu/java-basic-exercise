import org.junit.platform.commons.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class GrammarExercise {
    public static void main(String[] args) throws Exception {
        //需要从命令行读入
        String firstWordList = "";
        String secondWordList = "";

        List<String> result = findCommonWordsWithSpace(firstWordList,secondWordList);
        //按要求输出到命令行

    }

    public static List<String> findCommonWordsWithSpace(String firstWordList, String secondWordList) throws Exception {
        //在这编写实现代码
        //Scanner sc = new Scanner(System.in);
        //firstWordList = sc.next();
        //secondWordList = sc.next();
        String[] string1 = firstWordList.split(",");
        String[] string2 = secondWordList.split(",");
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> finalWordLists = new ArrayList<String>();
        Collections.addAll(finalWordLists,string1);
        Collections.addAll(finalWordLists,string2);
        Collections.addAll(list1,string1);
        Collections.addAll(list2,string2);
  
        //int count = 0;
        long count1 = finalWordLists.stream().filter(str -> str.matches("[a-zA-Z]+")).count() ;

        if(count1 < finalWordLists.size() ) throw new Exception("input not valid");
        
        //finalWordLists.stream().forEach(str -> str.toUpperCase());
        list1.stream().forEach(str -> str.toUpperCase());
        list2.stream().forEach(str -> str.toUpperCase());

        list1.retainAll(list2);
        Collections.sort(list1);
        list1.stream().forEach(str->str.replace(""," ").trim());


        // Stream<String> finalStream = Stream.concat(firstWordLists.stream(),secondWordLists.stream());
        // finalStream.toUpperCase().forEach(str->System.out.print(str));

        return null;
    }
}
