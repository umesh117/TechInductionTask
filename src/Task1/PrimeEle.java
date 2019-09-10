package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PrimeEle {
    public static void main(String[] args){
        Random r=new Random();
        int n=r.nextInt(100-15+1)+15;
        Integer[] eleInt=new Integer[n];
        for(int i=0;i<eleInt.length;i++){
            eleInt[i]=r.nextInt();
        }

        ArrayList<Integer> eleArylist=new ArrayList<Integer>(Arrays.asList(eleInt));

        Integer minEle= Collections.min(eleArylist);
        Integer maxEle= Collections.max(eleArylist);

        ArrayList<Integer> primeEle=primefind(eleArylist);

        System.out.println("\nElements:"+eleArylist);

        System.out.println("Max:"+maxEle+"\nMin:"+minEle+"\nPrime Numbers:"+primeEle);

    }

    static ArrayList<Integer> primefind(ArrayList<Integer> ele){
        ArrayList<Integer> primeEle=new ArrayList<Integer>();
        for(int i=0;i<ele.size();i++) {
            Integer num=ele.get(i);

            if(num>1){
               int r=(int)Math.sqrt(num);
                int j;

                for(j=2;j<=r;j++){
                    if((num%j)==0)
                        break;
                }
                if(j>r){
                    primeEle.add(num);
                }
            }
        }
        return  primeEle;
    }
}
