// Задача: Вывести список на экран в перевернутом виде (без массивов).
// Пример: 1 -> 2->3->4
// Вывод: 4->3->2->1


import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        LinkedList<Integer> startList = new LinkedList<>();
        startList.add(1);
        startList.add(2);
        startList.add(3);
        startList.add(4);
        startList.add(5);
        System.out.println(startList);
        Stack<Integer> integerStack = new Stack<>();
        integerStack.addAll(startList);
        startList.clear();
        while (!integerStack.empty()) {
            startList.add(integerStack.pop());
            System.out.println(startList);
        }
    }
}