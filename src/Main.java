import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1 () {
        System.out.println("Вариант №1");
            String[] alphabet = new String[]{"A", "A", "Б", "B", "Г", "Д", "Б", "E", "Ё", "Д", "Ж", "З", "Х", "Ц", "Ж", "Ш", "Щ", "З", "И", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ж", "Ш", "К", "Щ", "З", "Ь", "М", "Ы", "Ъ", "Э", "Ю", "Я", "У"};
            int count = 0;
            String generalString = "";
        for (int i = 0; i < alphabet.length; i++) {
            count++;
            for (int j = count; j < alphabet.length; j++) {
                if (alphabet[count - 1].equals(alphabet[j])) {
                    alphabet[j] = "";
                }
            }
            generalString = generalString + alphabet[i];
        }
        System.out.println(Arrays.toString(alphabet));
        System.out.print(generalString);
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Вариант №2");
        String[] alphabet = new String[]{"A", "A", "Б", "B", "Г", "Д", "Б", "E", "Ё", "Д", "Ж", "З", "Х", "Ц", "Ж", "Ш", "Щ", "З", "И", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ж", "Ш", "К", "Щ", "З", "Ь", "М", "Ы", "Ъ", "Э", "Ю", "Я", "У"};
        String[] alphabetClean = Arrays.stream(alphabet).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(alphabetClean));
        String generalString = String.join("", alphabetClean);
        System.out.println(generalString);
    }
}


