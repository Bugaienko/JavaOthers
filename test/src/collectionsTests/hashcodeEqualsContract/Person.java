package collectionsTests.hashcodeEqualsContract;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    /*
    У двух одинаковых объектов всегда hash равен
    Контракт hashCode() equals()
    1) У двух объектов вызываем Hashcode() и сравниваем:
    2) Если хэши разные - два объекта точно разные -> выдаем false
    3) Если хэши равны -> вызываем equals() - медленный, но дает точный ответ
    4) equals () -> выдает точно правильный ответ
     */
}
