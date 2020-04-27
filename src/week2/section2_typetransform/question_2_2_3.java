package week2.section2_typetransform;

public class question_2_2_3 {
    /*
     * Вопрос: Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после
     * символа "\" (обратный слэш) на расстоянии a.
     *
     * В качестве примера написано заведомо неправильное выражение. Исправьте его.
     *
     *Ответ:
     * см.ниже
     */
    public static char charExpression(int a) {
        int s = '\\';
        int sum = s + a;
        char unicode = (char) sum;
        return unicode;
    }
}
