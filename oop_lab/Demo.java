public class Demo {
    public static void main(String args[]){
        Music m1 = new Music("anna", new Artist("john","american",4.5), "30 years","comedy","albumName",new Date(21,9,23));
        Music m2 = new Music("anna", new Artist("tylor","english",4.6), "30 years","comedy","albumName",new Date(21,9,23));
        Music m3 = new Music("title3", new Artist("zendaya","australian",6.7), "30 years","comedy","albumName",new Date(21,9,23));
        Music m4 = new Music("title4", new Artist("alizafar","pakistani",9.0), "30 years","comedy","albumName",new Date(21,9,23));
        Music m5 = new Music("title5", new Artist("barbie","french",10.0), "30 years","comedy","albumName",new Date(21,9,23));

           if(m1.getTitle().equals (m2.getTitle())){
               System.out.println("titles are same");
           }else{
               System.out.println("titles are not same");
           }
           Music list[]=new Music[10];
           list[0]=m1;
           list[1]=m2;
           list[2]=m3;
           list[3]=m3;
           list[4]=m4;

           int i;
           for(i=0;i<=4.;i++){
            System.out.println(list[i]);
        }

    }
}
