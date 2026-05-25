package DsaPractice;

public class Arrays {
    static void main() {
        int[] arr = new int[10];
        arr[0]=1;
        arr[2]=2;
        arr[1]=2;
        arr[3]=7;
        arr[4]=6;
        arr[5]=8;
        int currentindex = 2;
        int currentValue = 100;

        for (int i=6;i>=currentindex;i--){
            arr[i+1] = arr[i];
        }
        arr[currentindex] = currentValue;

        System.out.println(arr.length);
        for (int arr1 :arr){
            System.out.println(arr1);
        }
    }
}
