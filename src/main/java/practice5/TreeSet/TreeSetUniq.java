package practice5.TreeSet;

import java.util.TreeSet;

public class TreeSetUniq {
    private static TreeSet<Integer> set = new TreeSet<>();

    public static void addUniq(int num){
        if(set.add(num)){
            System.out.println(num + " число было добавлено");
        }else{
            System.out.println(num + " число не было добавлено");
        }
    }

    public static void main(String[] args) {
        addUniq(1);
        addUniq(2);
        addUniq(1);
        addUniq(2);
        addUniq(3);
        addUniq(-1);
        addUniq(3);

        System.out.println(set);

    }
}
