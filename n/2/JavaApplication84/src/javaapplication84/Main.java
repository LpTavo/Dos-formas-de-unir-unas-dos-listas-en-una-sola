import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        
       
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        
       
        System.out.println("Lista combinada: " + mergedList);
    }
}
