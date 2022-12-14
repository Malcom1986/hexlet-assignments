# big-O
Создайте класс `App` с публичным статическим методом `getIntersectionOfLists()`, который принимает на вход два отсортированных списка целых чисел, находит их пересечение и возвращает в виде списка. 

Поиск пересечения двух неотсортированных списков — операция, в рамках которой выполняется вложенный цикл с полной проверкой каждого элемента первого списка на вхождение во второй.

Сложность данного алгоритма `O(n * m)` (произведение `n` и `m`), где `n` и `m` — количество элементов в списках. Если списки отсортированы, то можно реализовать алгоритм, сложность которого уже `O(n + m)`, что значительно лучше.


 
```java
List<Integer> num1 = new ArrayList<>();
num1.add(10);
num1.add(12);
num1.add(24);
List<Integer> num2 = new ArrayList<>();
num2.add(10);
num2.add(24);
System.out.println(App.getIntersectionOfLists(num1, num2)); // => [10, 24]
```

### Алгоритм

Суть алгоритма довольно проста. В коде вводятся два указателя (индекса) на каждый из списков. Начальное значение каждого указателя `0`. Затем идёт проверка элементов, находящихся под этими индексами в обоих списках. Если они совпадают, то значение заносится в результирующий список, а оба индекса инкрементируются. Если значение в первом списке больше, чем во втором, то инкрементируется указатель второго списка, иначе — первого.
