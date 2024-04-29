import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {4, -5, 0, 3, 2, 10, -4};

        System.out.println(Arrays.toString(arr1));
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        arr1 =  Arrays.copyOf(arr1, arr1.length+2);
        arr1[arr1.length - 2] = 100;
        arr1[arr1.length - 1] = 50;
        //System.gc(); - рекомендация для запуска garbage colletor, но не запускает его а просто рекомендует
        //Arrays.compaer(arr1, arr2) - > 0 если arr1 больше (то есть рсавнение) < 0 если меньше, 0 если равны

        //native -- метод реализован не средствами Java
        //ссылка в Java - является объектом класса, полем которого является закрытый указатель
        //закрытый указатель, т.е. в Java разработичк не может напрямSую обратиться к адресу
        //System. arraycopy(мас_откуда, инд_откуда, мас_куда, инд_куда, сколько) - native метод, для быстрого копирования
        //удаление элементов из массива можно сделать через метода arraycopy
        int intDel = 4;
        int number = 2;
        System.arraycopy(arr1, intDel + number, arr1, intDel, arr1.length - intDel - number);
        arr1 =  Arrays.copyOf(arr1, arr1.length - number);
        System.out.println(Arrays.toString(arr1));

        //здесь новый массив не создается, а получаем новую ссылку на сущ массив
        //int [] arr2 = arr1;






    }
}
