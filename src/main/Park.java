package main;

import java.util.LinkedList;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午2:46
 * To change this template use File | Settings | File Templates.
 */
public class Park {
    int[] park=new int[100] ;
    int status=0;   //车总量数

   // int sation=100-status;
    public int   should_return_error(){
        return  park.length;
    }
    public String push(int sation){
        status=sation;
         if(status <100){
             status ++;
             return String.valueOf(100-status) ;
         } else{
             return "error";
         }


    }
    public String pop(int sation){
           status=sation;
        if(status >0){
            status--;
            return String.valueOf(100-status) ;
        }
        else{
            return "error";
        }
    }

}
