package automationtesting;

public class Array {

    public static void main(String[] args) {

        int [] a = {24, 25, 78, 29};
        for (int i=0;i<4;i++){
            System.out.println(a[1]);


        }

        for (int r : a){
            System.out.println(r);

        }

        String [] b ={"An,bn"};

        for (int J=0; J<b.length;J++ ){
            System.out.println(b[J]);

        }

        for (String out:b) {

            System.out.println(out);
        }
    }

}
