package Task3;


import java.util.HashSet;
import java.util.Iterator;

public class CompareString {
    public static void main(String[] args){
        String names[]={"klert478","rtg111","iop745","yuro12","jk4201","archi55","al42096","milinp","nimeria457","klert478","jk4201","chagan99"};
        HashSet<String> userhset1=new HashSet<>();
        HashSet<String> userhset2=new HashSet<>();

        for(int i=0;i<names.length-4;i++){
            userhset1.add(names[i]);
        }
        for(int i=names.length-4;i<names.length;i++){
            userhset2.add(names[i]);
        }
        System.out.println("Common elements:\n");
        for(String s:userhset1){
            if(userhset2.contains(s)){
                System.out.println(s);
            }
        }
    }
}
