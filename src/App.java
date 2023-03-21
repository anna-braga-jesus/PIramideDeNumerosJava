public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pirâmide de números");
        int total = 5;
        for(int i = 0 ; i <= total ; i++ ){
            for(int j = 1; j <= i ; j++){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
