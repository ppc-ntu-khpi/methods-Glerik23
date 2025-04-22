/**
 * Клас для виконання обчислень, зокрема, для перевірки, чи є рядок паліндромом.
 */
public class Exercise {

    /**
     * Перевіряє, чи є заданий рядок паліндромом (читається однаково вперед і назад).
     * <p>
     * Паліндром - це послідовність символів, яка читається однаково в обох напрямках.
     * Ця перевірка чутлива до регістру символів та враховує пробіли чи інші символи.
     * Наприклад, "level" - паліндром, "hello" - не паліндром, "Madam" - не паліндром
     * (через регістр), " racecar " - не паліндром (через пробіли).
     * </p>
     *
     * @param inputString Рядок для перевірки на паліндром.
     * @return true, якщо {@code inputString} є паліндромом, false в іншому випадку.
     */
    public static boolean Calculate(String inputString) {
        // Для перевірки паліндрома, найпростіший спосіб - порівняти рядок
        // з його реверсованою версією.

        // Створюємо StringBuilder з вхідного рядка
        StringBuilder reversedStringBuilder = new StringBuilder(inputString);

        // Реверсуємо StringBuilder
        reversedStringBuilder.reverse();

        // Перетворюємо реверсований StringBuilder назад у рядок
        String reversedString = reversedStringBuilder.toString();

        // Порівнюємо оригінальний рядок з реверсованим.
        // Використовуємо equals() для коректного порівняння вмісту рядків.
        return inputString.equals(reversedString);
    }
}