package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsers {
    public static void main(String args[]){
        String names[]={"umesh117","utngpd","utngpe","archi55","al42096","milinp","nimeria457","klert478","jk4201","chagan99"};
        ArrayList<User> userarrlst=new ArrayList<>(10);

        for(int i=0;i<names.length;i++){
            userarrlst.add(new User(names[i],((int)(Math.random()*85))+15));
        }

        Comparator<User> sortele=new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age-o2.age;
            }
        };


        Collections.sort(userarrlst,sortele);

        System.out.println(userarrlst);

    }
}
