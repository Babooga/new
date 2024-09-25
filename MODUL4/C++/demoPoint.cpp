//Ramadhan Wijaya
//2211102208
#include <iostream>
#include <conio.h>

using namespace std;

// Kelas Point sebagai kelas induk
class Point
{
public:
    Point(float = 0.0, float = 0.0); // konstruktor default
    void cetakPoint();               // akan di-redefinisi di kelas anak
    ~Point();                        // destruktor
protected:
    float x, y;
};
Point::Point(float a, float b)
{
    cout << "Konstruktor Point dijalankan " << endl;
    x = a;
    y = b;
}
void Point::cetakPoint()
{
    cout << "Point : " << '[' << x << ", " << y << ']' << endl;
}
Point::~Point()
{
    cout << "Destruktor Point dijalankan" << endl;
}

// Kelas Circle : Merupakan kelas turunan dari kelas Point
class Circle : public Point
{
public:
    Circle(float r = 0.0, float x = 0.0, float y = 0.0); // konstruktor
    void cetakPoint();                                   // redefinisi fungsi kelas induk
    ~Circle();                                           // destruktor
private:
    float radius;
};

// memanggil konstruktor kelas induk dan inisialisasi data member warisan
Circle::Circle(float r, float a, float b) : Point(a, b) 
{
    cout << "Konstruktor Circle dijalankan" << endl;
    radius = r;
}
void Circle::cetakPoint()
{
    Point::cetakPoint();
    cout << "Circle : radiusnya " << radius << endl;
}

// destruktor
Circle::~Circle() 
{
    cout << "Destruktor Circle dijalankan " << endl;
}

int main()
{
    Point p(1.1, 2.2); // Pembentukan Objek Point
    cout << endl;
    Circle circle1(6.5, 8.2, 1.9); // Pembentukan Objek Circle
    circle1.cetakPoint();          // Pemanggilan Method
    cout << endl;
    Circle circle2(10, 5, 5);
    circle2.cetakPoint();
    getch();
    return 0;
}
