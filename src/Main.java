public class Main {
    public static void main(String[] args) {

        //1 завдання
        int[] m = new int[50];
        for (int i=0, j=1;i<50;i++, j+=2) {
            System.out.println(m[i]=j);
        }
        //for (int i: m) System.out.print(m[i]+ " ");


        //2 завдання
        int[] m2 = new int[20];
        System.out.println("До заміни:  ");
        for (int i=0;i<20;i++) {
            m2[i]=(int) Math.round(Math.random() * 9);
            System.out.print(m2[i]+" ");
        }
        for (int j=1;j<20;j+=2) {
            m2[j]=0;
        }
        System.out.println("\nПісля заміни:  ");
        for (int i=0;i<20;i++){
            System.out.print(m2[i]+" ");
        }




        //3 завдання
        int[] mas1,mas2,mas3;
        mas1= new int[5];
        mas2= new int[5];
        mas3= new int[5];
        int mid1=0,mid2=0,mid3 =0;
        System.out.println("\nПерший масив: ");
        for (int i=0;i<5;i++) {
            mas1[i]=(int) Math.round(Math.random() * 9);
            System.out.print(mas1[i]+" ");
            mid1 +=mas1[i];
        }
        System.out.println("\nДругий масив: ");
        for (int i=0;i<5;i++) {
            mas2[i]=(int) Math.round(Math.random() * 9);
            System.out.print(mas2[i]+" ");
            mid2 +=mas2[i];
        }
        System.out.println("\nТретій масив: ");
        for (int i=0;i<5;i++) {
            mas3[i]=(int) Math.round(Math.random() * 9);
            System.out.print(mas3[i]+" ");
            mid3 +=mas3[i];
        }




    }
}