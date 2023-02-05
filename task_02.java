/*
 * Дана json строка (можно сохранить в файл и читать из файла)
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
 */
package j_hometasks_02;

public class task_02 {
    public static void main(String[] args) {
        String strDirty = "{\"Фамилия\": \"Иванов\",\"оценка\": \"5\",\"предмет\": \"Математика\"}";
        String a = "Студент ";
        String b = " получил ";
        String c = " по предмету: ";
        StringBuilder sb = new StringBuilder();
        String strClean = strDirty.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\"", "").replace('[', ' ')
                .replace(']', ' ');
        // System.out.println(strClean);
        String[] parts = strClean.split(",", 0);
        for (String part : parts) {
            String[] params = part.split(":");
            if ("Фамилия".equals(params[0].trim())) {
                sb = new StringBuilder(a).append(params[1]);

            } else if ("оценка".equals(params[0].trim())) {
                sb.append(b).append(params[1]);
            } else if ("предмет".equals(params[0].trim())) {
                sb.append(c).append(params[1]);
                System.out.println(sb);
            }

        }
    }
}