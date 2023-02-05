/*
 * Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
 */
package j_hometasks_02;

public class task_01 {
    public static void main(String[] args) {
        String strDirty = "{\"name\": \"Ivanov\",\"country\": \"Russia\",\"city\": \"Moscow\",\"age\": \"null\"}";
        String str = strDirty.replace("{", "").replace("}", "").replace("\"", " ");
        StringBuilder string = new StringBuilder();

        String[] newStr = str.split(",", 0);
        for (String string2 : newStr) {
            String[] string3 = string2.split(":", 0);
            if (!"null".equals(string3[1].trim())) {
                System.out.printf("%s = %s", string3[0], string3[1]);
            }

        }

    }

}
