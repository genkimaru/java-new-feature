package leetcode;

import java.util.*;

/**
 * @auther guan.c.wang
 * @date 9/14/2020.
 * @see
 */
public class FullSort {

    public static ArrayList<List<String>> result = new ArrayList<List<String>>();
    public static  ArrayList<String> temp = new ArrayList<>();

    public static int originalSize;

    public static void fechOneSortOthers(String[] arr){
        List<String> list = Arrays.asList(arr);
        int size = list.size();
        if(list.size() == 2){
            temp.addAll(list);
            result.add(cloneList(temp));
            temp.removeAll(list);
            Collections.reverse(list);
            temp.addAll(list);
            result.add(cloneList(temp));

        }else {

            for (int i = 0; i < size ; i++) {
                String a = list.get(i);
                if (temp.size() > size ) {
                    temp = removeLastN(temp, size);
                }
                temp.add(a);
                List<String> list2 = removeObj(list, a);
                fechOneSortOthers(list2.toArray(new String[]{}));
            }
        }

    }

    private static ArrayList<String> removeLastN(ArrayList<String> temp, int size) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < temp.size()- size ; i++) {
            list.add(temp.get(i));
        }
        return list;

    }

    private static ArrayList<String> removeLast(ArrayList<String> temp) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < temp.size()-1 ; i++) {
            list.add(temp.get(i));
        }
        return list;
    }

    private static boolean decideAddOrRemove(ArrayList<String> temp, int size, int originalSize) {
        int tempSize = temp.size();
        if(tempSize + size == originalSize){
           return true ;
        }else{
            return false;
        }
    }


    private static List<String> cloneList(ArrayList<String> temp) {
        ArrayList<String> list = new ArrayList<>();
        for(String s : temp){
            list.add(s);
        }
        return list;

    }

    public static   List<String> removeObj( List<String> list , String a){
        List<String> l = new ArrayList<String>();
        for(String s : list){
            if(!s.equals(a)){
                l.add(s);
            }
        }
        return l;
    }

    public static void viewResult(ArrayList<List<String>> result){
        for (List<String> list : result){
            for(String s : list){
                System.out.print(s);
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {

        String[]  arr = {"a" , "b" ,"c" , "d" , "e"};
        originalSize = arr.length;
        fechOneSortOthers(arr);

        System.out.println(result.size());

       viewResult(result);

    }
}
