public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        try(Scanner sc = new Scanner(new FileInputStream(file))){
            int count = 0;
            while(sc.hasNext()){
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        }
    }
}
