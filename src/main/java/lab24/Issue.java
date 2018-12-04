package lab24;
/*Для автоматизации работы библиотеки необходимо разработать иерархию классов.
На полках в библиотеке находится много печатных изданий. Вынесем все общие свойства печатных изданий в класс  Issue.
В нем реализуем метод toPrint() , который выводит на печать информацию о издании в следующем формате name=TestNameIssue,countPages=100.
Класс Book расширяет класс Issue и добавляет новое свойство  authorBook, которое характерно для книг.
Необходимо реализовать метод toPrint() для класса Book, который выводит на печать информацию про книгу в следующем формате
Book{name=<name>,countPages=<countPages>,author=<authorBook>}
Подсказка: для реализации метода  toPrint() необходимо использовать метод toPrint() класса Issue.*/

public class Issue {
    public String name;
    public int countPages;

    public Issue(String name, int countPages) {
        this.name = "TestNameIssue";
        this.countPages = 100;
    }

    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }

}

class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.name = "TestNameBook";
        this.authorBook = "TestBookAuthor";
    }

    @Override
    public String toPrint(){
        return "Book{name="+name+",countPages="+countPages+",author="+authorBook+"}";
    }
}
