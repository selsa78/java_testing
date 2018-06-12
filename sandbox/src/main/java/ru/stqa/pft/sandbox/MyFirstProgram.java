package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {			// Функция main прнимает на вход массив строк
		hello("world");										// Обращение к функции hello с конкретным значением для параметра somebody
		hello("user");
		hello("Sergey");

		Square s = new Square(5); 			// Создание объекта заданного типа
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}
	public static void hello(String somebody){		// Функция, которая выполняет команду вывода на экран текста с ее параметром somebody
		System.out.println ("Hello, " + somebody + "!!!");		// В кавычках - литеральное значение
	}

	public static double area(Square s){
		return s.l * s.l;
	}

	public static double area (Rectangle r){
		return r.a * r.b;
	}
}