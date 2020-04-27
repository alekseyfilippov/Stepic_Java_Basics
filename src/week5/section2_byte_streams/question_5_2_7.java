package week5.section2_byte_streams;

public class question_5_2_7 {
    /*
     * Вопрос: Есть следующий код:
     *
     * FileInputStream fileInputStream = new FileInputStream(file);
     * try (DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
     *     // ...
     * }
     *
     * Является ли проблемой то, что не вызван метод fileInputStream.close()? Почему?
     *
     *
     * Ответ: Нет, т.к. DataInputStream в своем методе close() закроет InputStream, с которым работает.
     *
     */
}
