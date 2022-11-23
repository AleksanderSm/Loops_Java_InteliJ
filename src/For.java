public class For {
    public static void main(String[] args) {
        String[] cats=new String[]{"Bonifacy","Garfield", "Klakier","Pussy" };
//        for (int i=0; i< cats.length; i++) {
//            System.out.println(cats[i]);
//        }

        int x=3;
        int y;
        System.out.println(x++); //3 następnie +1
        System.out.println(++x); //5
        System.out.println(x);  //5
        y = x++;                //5
        System.out.println (y); //5
        y = ++x;                //7
        System.out.println (y); //7
        System.out.println (++y); //8
    }
}