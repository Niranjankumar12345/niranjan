package test1;

import java.util.ArrayList;

public class MemoryStatus extends UserObject {
    MemoryStatus(String id, String name, String phoneno, String address) {
        super(id, name, phoneno, address);
    }

    public static void main(String[] args) {


        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory :"+runtime.totalMemory());
        System.out.println("Free memory :"+runtime.freeMemory());

        double q=runtime.freeMemory();
        double w=runtime.totalMemory();

        double r=w/2;

        if(q>r){
            ArrayList<String> nir=new ArrayList<>();
            for(int i=0;i<=20000;i++){
                MemoryStatus obj=new MemoryStatus("36","sugan","255377484","rasipuram");

            }

        }

        System.out.println("After Creating the Object :"+runtime.freeMemory());

    }
}
