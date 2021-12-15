public class Report5{
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException nullE){
            System.out.println("nullを参照してエラーが発生しています！");
            System.out.println(nullE.getMessage());
        }
        
    }
}