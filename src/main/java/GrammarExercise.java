import java.util.List;

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
        
        String[] string1 = firstWordList.split(",");
        String[] string2 = secondWordList.split(",");
        List<String> firstWordLists = new ArrayList<String>();
        List<String> secondWordLists = new ArrayList<String>();
        Corllections.addAll(firstWordLists,string1);
        Corllections.addAll(SecondWordLists,string2);

        long count1 = firstWordLists.stream().forEach(str -> str.matches("[a-zA-Z]+")).count();
        long count2 = secondWordLists.stream().forEach(str -> str.matches("[a-zA-Z]+")).count();
        if(count1 < firstWordLists.size() || count2 < secondWordLists.size()) throw new error("input not valid");
        
        Corllections.sort(finalWordLists);
        Corllections.sort(secondWordLists);
        List<String> finalWordLists = new ArrayList<String>();
        Stream<String> finalStream = Stream.concat(firstWordLists.stream(),secondWordLists.stream());
        finalStream.distinct().forEach(str->System.out.print(str));

        return null;
    }
}
