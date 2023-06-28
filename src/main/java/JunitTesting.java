public class JunitTesting {



    public static int maxArray(int max[]){
        int arry =max[0];

        for(int i=1;i<max.length;i++){
            if(arry<max[i])
                arry=max[i];
        } return arry;
    }

    public static int add (int a,int b){

        int result1 = a+b;
        System.out.println(result1);
        return result1;
    }
}
