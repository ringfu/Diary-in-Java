package chapter10;
/*
*  10.2 Map 接口  page 190
*  by: fy   time: 2018-03-24
*  */

import java.util.Hashtable;

public class MapTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"fy");
        ht.put(2,"hu");
        ht.put(3,"jk");

        for(int i = 0; i < ht.size(); i++){
            if(ht.containsKey(i+1)){
                System.out.println(ht.get(i+1));
            }
        }
    }
}
