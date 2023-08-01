package pl.coderslab.oop.inheritance;
//## Zadanie nr 2
//Stwórz klasę `Shape`[PUNKT], która będzie posiadała:
//1. prywatne atrybuty `x` i `y` (określające [WSPÓŁRZĘDNE PUNKTU]
// środek tego kształtu) oraz `color`,
//2. konstruktor, przyjmujący zmienne określające[WSPÓŁRZĘDNE PUNKTU]
// wartości `x`, `y` i `color`,
//3. metodę o nazwie `getDescription()`, wypisującą
// informacje o tym [WSPÓŁRZĘDNYCH PUNKTU] kształcie, zwracającą wartość typu `String`,
//4. metodę o nazwie `getDistance(Shape shape)`,
// zwracającą odległość [PUNKTU] od [INNEGO PUNKTU] środka innego kształtu,
// wynik ma być typu `double`.
//Sprawdź, co się dzieje, kiedy zmieniasz dostęp
// do poszczególnych funkcji z publicznego na prywatny.

public class Shape {

//1. prywatne atrybuty `x` i `y` (określające
// środek tego kształtu) oraz `color`

    private double x;
    private double y;
    private String color;

//2. konstruktor, przyjmujący zmienne określające
// wartości `x`, `y` i `color`
public Shape(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

// 3. metodę o nazwie `getDescription()`, wypisującą
// informacje o tym kształcie, zwracającą wartość typu `String`,
    public String getDescription() {
        return "Współrzędne figury [PUNKTU]:" + " x: " + this.x + " y: " + this.y + " color: " + this.color;
    }

// 4. metodę o nazwie `getDistance(Shape shape)`,
// zwracającą odległość od środka innego kształtu,
// wynik ma być typu `double`.
// Sprawdź, co się dzieje, kiedy zmieniasz dostęp
// do poszczególnych funkcji z publicznego na prywatny.
    // obiekt Shape shape = new Shape();
    //[Shape shape to WSPÓŁRZĘDNE DRUGIEGO PUNKTU]

    public double getDistance(Shape shape) {
        // this.x minus shape.x do potęgi 2
        double xValue  = Math.pow((this.x - shape.x),2);
        double yValue = Math.pow((this.y - shape.y), 2);
        //dodatni pierwiastek kwadratowy z wartości typu double.
        return Math.sqrt(xValue + yValue);
    }

    //Zgodnie z twierdzeniem Pitagorasa suma kwadratów
    // długości boków trójkąta jest równa kwadratowi
    // długości przeciwprostokątnej trójkąta:  AB 2 = AC 2 + CB 2 .
    //
    //Po drugie, obliczmy AC i CB.
    //AC = y2 - y1
    //
    //Podobnie:
    //
    //BC = x2 - x1
    //
    //Podstawmy części równania:
    //AB 2 = AC 2 + CB 2
    //distance * distance = (y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)
    //
    //Ostatecznie z powyższego równania możemy obliczyć odległość między punktami:
    //
    //distance = sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1))
    //A=(x1,y1),B=(x2,y2)
    //
    //wzór na odległość między punktami A i B ma postać:
    //
    //|AB|=√((x2−x1)2+(y2−y1)2)
    //
    //Przykład
    //
    //A=(2,−2),B=(3,0)
    //
    //Odległość między tymi punktami wynosi:
    //
    //|AB|=√((3−2)2+(0−(−2)))2=√5≈2,236
}
