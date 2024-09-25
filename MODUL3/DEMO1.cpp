//ramadhan wijaya
//2211102208
#include <iostream>

using namespace std;

class Kelereng {
private:
    int merah;
    int kuning;
public:
    Kelereng(int jum_merah, int jum_kuning);
    void tampil();
    // Overloading operator
    Kelereng operator+(Kelereng b);
    Kelereng operator-(Kelereng b);
    Kelereng operator*(Kelereng b);
    Kelereng operator/(Kelereng b);
    Kelereng operator%(Kelereng b);
    void operator++(); // Prefix increment
    void operator--(); // Prefix decrement
};

Kelereng::Kelereng(int jum_merah, int jum_kuning) {
    merah = jum_merah;
    kuning = jum_kuning;
}

void Kelereng::tampil() {
    cout << "Jumlah merah = " << merah << ", kuning = " << kuning << endl;
}

Kelereng Kelereng::operator+(Kelereng b) {
    Kelereng temp(0, 0);
    temp.merah = merah + b.merah;
    temp.kuning = kuning + b.kuning;
    return temp;
}

Kelereng Kelereng::operator-(Kelereng b) {
    Kelereng temp(0, 0);
    temp.merah = merah - b.merah;
    temp.kuning = kuning - b.kuning;
    return temp;
}

Kelereng Kelereng::operator*(Kelereng b) {
    Kelereng temp(0, 0);
    temp.merah = merah * b.merah;
    temp.kuning = kuning * b.kuning;
    return temp;
}

Kelereng Kelereng::operator/(Kelereng b) {
    Kelereng temp(0, 0);
    temp.merah = merah / b.merah;
    temp.kuning = kuning / b.kuning;
    return temp;
}

Kelereng Kelereng::operator%(Kelereng b) {
    Kelereng temp(0, 0);
    temp.merah = merah % b.merah;
    temp.kuning = kuning % b.kuning;
    return temp;
}

void Kelereng::operator++() {
    ++merah;
    ++kuning;
}

void Kelereng::operator--() {
    --merah;
    --kuning;
}

int main() {
    Kelereng Kelereng1(20, 8);
    Kelereng Kelereng2(7, 3);
    Kelereng Kelereng3(0, 0);

    cout << "Objek Kelereng 1" << endl;
    Kelereng1.tampil();
    cout << endl << "Objek Kelereng 2" << endl;
    Kelereng2.tampil();

    // Contoh operator overloading terhadap +
    Kelereng3 = Kelereng1 + Kelereng2;
    cout << endl << "Hasil penjumlahan Kelereng 1 dan Kelereng 2" << endl;
    Kelereng3.tampil();

    // Contoh operator overloading terhadap -
    Kelereng3 = Kelereng1 - Kelereng2;
    cout << endl << "Hasil pengurangan Kelereng 1 dan Kelereng 2" << endl;
    Kelereng3.tampil();

    // Contoh operator overloading terhadap *
    Kelereng3 = Kelereng1 * Kelereng2;
    cout << endl << "Hasil perkalian Kelereng 1 dan Kelereng 2" << endl;
    Kelereng3.tampil();

    // Contoh operator overloading terhadap /
    Kelereng3 = Kelereng1 / Kelereng2;
    cout << endl << "Hasil pembagian Kelereng 1 dan Kelereng 2" << endl;
    Kelereng3.tampil();

    // Contoh operator overloading terhadap %
    Kelereng3 = Kelereng1 % Kelereng2;
    cout << endl << "Hasil sisa pembagian Kelereng 1 dan Kelereng 2" << endl;
    Kelereng3.tampil();

    // Contoh operator overloading terhadap ++
    ++Kelereng1;
    cout << endl << "Hasil ++Kelereng1" << endl;
    Kelereng1.tampil();

    // Contoh operator overloading terhadap --
    --Kelereng2;
    cout << endl << "Hasil --Kelereng2" << endl;
    Kelereng2.tampil();

    cin.get(); // Menunggu input sebelum keluar
    return 0;
}
