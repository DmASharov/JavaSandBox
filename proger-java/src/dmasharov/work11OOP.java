package dmasharov;

public class work11OOP {

	public static void main(String[] args) {
		// ОПП: классы и объекты
		// Создание объекта
		Transport bmw = new Transport(250.5f, 2500, "Wight", new byte[] {0, 0, 0});
		// Комментируем т.к. используем конструктор класса
		// bmw.setValues(250.5f, 2500, "Wight", new byte[] {0, 0, 0});
		// String res1 = bmw.getValues();
		// System.out.println(res1);
		// С помощью метода заменили на 1 строку
//		bmw.speed = 250.5f;
//		bmw.weight = 2500;
//		bmw.color = "White";
//		bmw.coordinate = new byte[] {0, 0, 0};
		
		Transport truck = new Transport(5600, new byte[] {100, 0, 100});
//		truck.speed = 140.5f;
//		truck.weight = 5600;
//		truck.color = "Red";
//		truck.coordinate = new byte[] {100, 0, 100};
//		
//		String res2 = truck.getValues();
//		System.out.println(res2);

	}

}

