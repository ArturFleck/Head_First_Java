package HW12;

class Link {
    public long dData; // Данные
    public long iData;
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(long d) // Конструктор
    {
        dData = d;
    }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    {
        System.out.print(dData + " ");
    }
// -------------------------------------------------------------
} // Конец класса Link
////////////////////////////////////////////////////////////////
class FirstLastList {
    private Link first; // Ссылка на первый элемент
    private Link last; // Ссылка на последний элемент
    // -------------------------------------------------------------
    public FirstLastList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
        last = null;
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    {
        return first == null;
    }
    // -------------------------------------------------------------
    public void insertFirst(long dd) // Вставка элемента в начало списка
    {
        Link newLink = new Link(dd); // Создание нового элемента
        if (isEmpty()) // Если список пуст,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }
    // -------------------------------------------------------------
    public void insertLast(long dd) // Вставка элемента в конец списка
    {
        Link newLink = new Link(dd); // Создание нового элемента
        if (isEmpty()) // Если список пуст,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // Старое значение last --> newLink
        last = newLink; // newLink <-- last
    }
    // -------------------------------------------------------------
/*    public long deleteFirst() // Удаление первого элемента списка
    { // (предполагается, что список не пуст)
        long temp = first.dData;
        if(first.next == null) // Если только один элемент
            last = null; // null <-- last
        first = first.next; // first --> старое значение next
        return temp;
    }*/

    public void deleteFirst() // Удаление первого элемента списка
    { // (предполагается, что список не пуст)
        if (first.next == null) // Если только один элемент
            last = null; // null <-- last
        first = first.next; // first --> старое значение next
    }

    public void deleteLast() // Удаление первого элемента списка
    {
        Link current = first;
        Link prev=last;
            while (current.next != null) {
                if (current.next == last){
                    prev = current;
                }
                current = current.next;
            }
        last=prev;
        last.next=prev;
        last.displayLink();
        last.next.displayLink();
    }
    // -------------------------------------------------------------
    public Link delete(int key) // Удаление элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = first; // Поиск элемента
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null)
                return null; // Элемент не найден
            else {
                previous = current; // Перейти к следующему элементу
                current = current.next;
            }
        } // Совпадение найдено
        if (current == first) // Если первый элемент,
            first = first.next; // изменить first
        else // В противном случае
            previous.next = current.next; // обойти его в списке
        return current;
    }
    // -------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // От начала списка
        while (current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
// -------------------------------------------------------------
} // Конец класса FirstLastList

////////////////////////////////////////////////////////////////
class FirstLastApp {
    public static void main(String[] args) { // Создание нового списка
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(22); // Вставка в начало списка
        theList.displayList();
        theList.insertFirst(44);
        theList.displayList();
        theList.insertFirst(66);
        theList.displayList();

        theList.insertLast(11); // Вставка в конец списка
        theList.displayList();
        theList.insertLast(33);
        theList.displayList();
        theList.insertLast(55);
        theList.insertLast(95);
        theList.displayList();
        theList.displayList();

        theList.deleteFirst(); // Удаление первых двух элементов
        theList.displayList();
        theList.deleteFirst();
        theList.displayList();

        theList.deleteLast();
        theList.displayList();
    }
} // Конец класса FirstLastApp