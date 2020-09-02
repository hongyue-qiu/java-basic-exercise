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
        List<String> finalWordLists = new ArrayList<String>();
        Corllections.addAll(finalWordLists,string1);
        Corllections.addAll(finalWordLists,string2);
  

        long count1 = finalWordLists.stream().forEach(str -> str.matches("[a-zA-Z]+")).count();
        
        if(count1 < finalWordLists.size() ) throw new error("input not valid");
        
        finalWordLists.stream().forEach(str -> str.toUpperCase());
        Corllections.sort(finalWordLists);

        Set<String> set = new HashSet<>(finalWordLists);
 
        //获得list与set的差集
        Collection rs = CollectionUtils.disjunction(finalWordLists,set);
        //将collection转换为list
        List<String> results = new ArrayList<>(rs);

        List<String> result = results.stream().forEach(str->str.replace(""," ").trim();)

        
        // Stream<String> finalStream = Stream.concat(firstWordLists.stream(),secondWordLists.stream());
        // finalStream.toUpperCase().forEach(str->System.out.print(str));

        return null;
    }
}
