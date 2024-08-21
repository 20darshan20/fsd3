public class   Stringclass {
    public static void main(String[] args) {
        String name1 = "darshan";
        String name2 = "hello sir";
        String name3 = name1 + name2;

        System.out.println(name3);

        String name4=name1.concat(name1);
        System.out.println(name4);

        String name5=name2.replace("sir","bye");
        System.out.println(name5);
    }
}