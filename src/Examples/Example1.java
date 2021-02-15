// Задача: Принимаем строку, преобразуем его в чар, необходимо вывести повторяющиеся символы как true, не повторяющиеся как false.

package Examples; //это пакет

import java.util.HashMap;

public class Example1 {



        public static void main(String[] args) {
            System.out.println(DoubleChar("aassddfgh")); //отправляем строку нашему методу и выводим результат на экран
        }

        private static HashMap<Character, Boolean> DoubleChar(String str) { //наш метод который принимает строку и возвращает мапу в виде чар, булеан
            char[] array =str.toCharArray(); //инициализирум наш массив и передаем в нее строку, которую преобразуем в чар
            HashMap<Character, Boolean> mapHash = new HashMap<>(); //инициализируем коллекцию мапу
            for (int i=0; i< array.length;i++){ // прогоняем наш массив чар
                if (mapHash.containsKey(array[i])){ //если в нашей коллекции есть совпадение с элементом под номером i
                    mapHash.put(array[i], true); //то возвращем тру
                }else{
                    mapHash.put(array[i], false); //иначе фолс
                }
            }
            return mapHash; //возвращаем готовую коллекцию
        }
    }



