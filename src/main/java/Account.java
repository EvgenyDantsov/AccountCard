public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int spaceCount=0;
        if(name.length()<3 || name.length()>19){
            return false;
        }
            for(char c : name.toCharArray()){
                if(c==' '){
                    spaceCount++;
                }
            }
            if(spaceCount!=1) {
                return false;
            }
        return !name.startsWith(" ") && !name.endsWith(" ");
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }
}
