
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
        if (mid1 > mid2 && mid1 > mid3) {
            System.out.println("\nСереднє арифметичне для Масиву 1 більше за інші масиви: " +(double) mid1/5);
        } else if (mid2 > mid1 && mid2 > mid3) {
            System.out.println("\nСереднє арифметичне для Масиву 2 більше за інші масиви: " +(double) mid2/5);
        } else if (mid3 > mid1 && mid3 > mid2) {
            System.out.println("\nСереднє арифметичне для Масиву 3 більше за інші масиви: " + (double) mid3/5);
        } else {
            System.out.println("\nСереднє арифметичне для всіх масивів рівне: " + (double) mid1/5);
        }
        //??????


        //4 завдання
        int[] arr1,arr2;
        arr1= new int[10];
        arr2= new int[10];
        double [] arr3= new double[10];

        System.out.println("\nПерший масив: ");
        for (int i=0;i<10;i++) {
            arr1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nДругий масив: ");
        for (int i=0;i<10;i++) {
            arr2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nТретій масив: ");
        for (int i=0;i<10;i++) {
            arr3[i] =(double) (arr1[i] + arr2[i]) / 2;
            System.out.print(arr3[i] + " ");
        }


        //5 завдання
        System.out.println();
        int ar []= new int[15];
        int c=0;
        for (int i=0;i<15;i++) {
            ar[i] = (int) Math.round(Math.random() * 10);
            System.out.print(ar[i] + " ");
            if (ar[i]%2==0) c++;
        }
        System.out.println("\nКількість парних елементів:  "+c);


        //6 завдання
        int twoa [][]=new int [15][];
        twoa [0]=new int [5];
        twoa [1]=new int [5];
        twoa [2]=new int [5];
        twoa [3]=new int [5];
        twoa [4]=new int [8];
        twoa [5]=new int [8];
        twoa [6]=new int [8];
        twoa [7]=new int [8];
        twoa [8]=new int [3];
        twoa [9]=new int [3];
        twoa [10]=new int [3];
        twoa [11]=new int [3];
        twoa [12]=new int [9];
        twoa [13]=new int [9];
        twoa [14]=new int [9];
        for (int i=0;i< twoa.length;i++) {
            for (int j=0;j< twoa[i].length;j++){
                twoa[i][j]=(int)(Math.random()*15);
                System.out.print(twoa[i][j]+" ");
            }
            System.out.println();
        }




        //7 завдання
        int svn[][]=new int [7][7];
        int svns[]=new int[7];
        int ss=0;
        int svnsb =0;
        int indsvn=0;
        for (int i=0;i<7;i++) {
            ss=0;
            for (int j=0;j<7;j++){
                svn[i][j]=(int)(Math.random()*6);
                System.out.print(svn[i][j]+" ");
                ss+=svn[i][j];
            }
            System.out.println();
            svns[i]=ss;
        }
        for (int i=0;i<7;i++) {
            if (svns[i]>svnsb){
                svnsb=svns[i];
                indsvn=i;
            }
        }
        System.out.println("Найбільша сума значень міститься у рядку з індексом "+ indsvn);


    }
}