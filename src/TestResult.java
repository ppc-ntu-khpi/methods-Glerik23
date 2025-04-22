public class TestResult {

    public static void main(String[] args) {
        // Задаємо тестові слова для перевірки
        String word1 = "level";     // Паліндром
        String word2 = "hello";     // Не паліндром
        String word3 = "Madam";     // Не паліндром (через регістр)
        String word4 = "A man, a plan, a canal: Panama"; // Не паліндром (через пробіли, розділові знаки та регістр)
        String word5 = "rotor";     // Паліндром
        String word6 = "";          // Пуста строка, вважається паліндромом
        String word7 = "a";         // Один символ, вважається паліндромом


        // Викликаємо статичний метод Calculate для першого слова
        boolean isWord1Palindrome = Exercise.Calculate(word1);
        // Коригуємо рядок виводу відповідно до специфіки завдання
        System.out.println("Слово '" + word1 + "' є паліндромом? " + (isWord1Palindrome ? "Так" : "Ні"));

        // Викликаємо для другого слова
        boolean isWord2Palindrome = Exercise.Calculate(word2);
        System.out.println("Слово '" + word2 + "' є паліндромом? " + (isWord2Palindrome ? "Так" : "Ні"));

        // Викликаємо для третього слова (демонстрація чутливості до регістру)
        boolean isWord3Palindrome = Exercise.Calculate(word3);
        System.out.println("Слово '" + word3 + "' є паліндромом? " + (isWord3Palindrome ? "Так" : "Ні"));

        // Викликаємо для четвертого слова (демонстрація чутливості до інших символів)
        boolean isWord4Palindrome = Exercise.Calculate(word4);
        System.out.println("Фраза '" + word4 + "' є паліндромом? " + (isWord4Palindrome ? "Так" : "Ні"));

         // Викликаємо для п'ятого слова
        boolean isWord5Palindrome = Exercise.Calculate(word5);
        System.out.println("Слово '" + word5 + "' є паліндромом? " + (isWord5Palindrome ? "Так" : "Ні"));

        // Викликаємо для пустої строки
        boolean isWord6Palindrome = Exercise.Calculate(word6);
        System.out.println("Слово (пуста строка) '" + word6 + "' є паліндромом? " + (isWord6Palindrome ? "Так" : "Ні"));

        // Викликаємо для одного символу
        boolean isWord7Palindrome = Exercise.Calculate(word7);
        System.out.println("Слово '" + word7 + "' є паліндромом? " + (isWord7Palindrome ? "Так" : "Ні"));
    }
}