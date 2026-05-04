public class Constructor{
    int x;
    public Constructor(){
        x = 5;
        System.out.println("Constructor Called");
        
    }

    public static void main(String []args){
        Constructor cnstr = new Constructor();
        System.out.println(++cnstr.x);
    }
}