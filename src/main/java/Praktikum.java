public class Praktikum {
    public static void main(String[] args) {
        String[] testNames = {
                "Тимоти Шаламе",
                "ТимотиШаламе",
                " Тимоти Шаламе",
                "Тимоти Шаламе ",
                "Ти Ш",
                "Тимоти Шаламеченьдлинноеслово"
        };
        Account account;
        for (String name : testNames) {
            account = new Account(name);
            System.out.println("Name: \"" + name + "\" is " + (account.checkNameToEmboss() ? "valid" : "invalid"));
        }
    }
}
