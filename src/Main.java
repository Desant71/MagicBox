public class Main {
    public static void main(String[] args){
        MagicBox<String> stringMagicBox = new MagicBox<>(4);
        stringMagicBox.add("31081993");
        stringMagicBox.add("Nikita");
        stringMagicBox.add("Work");
        stringMagicBox.add("Netology");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }

}