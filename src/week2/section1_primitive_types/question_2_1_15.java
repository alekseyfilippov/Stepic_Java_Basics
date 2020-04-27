package week2.section1_primitive_types;

public class question_2_1_15 {
    /*
     * Вопрос: Реализуйте метод flipBit, изменяющий значение одного бита заданного целого
     * числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
     *
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     *
     * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
     * ввода-вывода добавит проверяющая система.
     *
     *Ответ:
     * см.ниже
     */
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        int result=0;
        result=value>>(bitIndex-1);
        if (result%2!=0){
            result=value&~(1<<bitIndex-1);
        }else{
            result=value|(1<<bitIndex-1);
        }
        return result; // put your implementation here
    }
}
