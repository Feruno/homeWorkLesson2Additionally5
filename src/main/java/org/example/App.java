package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        class Cat {
            private String name; //Ошибка в указании модификатора доступа, public сменил на private для трёх переменных
            private int age;
            private int weight;

            public Cat(String name, int age, int weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int getAge() {

                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }

            //Не было геттеров и сеттеров для weight
            public int getWeight() {

                return weight;
            }
            public void setWeight(int weight) {
                this.weight = weight;
            }
        }
    }
}
