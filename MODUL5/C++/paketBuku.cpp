#include <iostream>
using namespace std;
struct hewan
{
    string nama_Hewan;
    char jenis_kelamin;
    string cara_berkembangbiak;
    string alat_pernapasan;
    string tempat_hidup;
    bool karnivora;
};
hewan binatang;
struct hewan_darat
{
    hewan binatang;
    int jumlah_kaki;
    bool menyusui;
    string suara;
};
hewan_darat binatang_darat;
struct hewan_laut
{
    hewan binatang;
    string sirip;
    string pertahanan_diri;
};
hewan_laut binatang_laut;
int main()
{
    hewan_darat singa;
    singa.binatang.nama_Hewan = "Singa";
    singa.binatang.jenis_kelamin = 'J';
    singa.binatang.cara_berkembangbiak = "Vivipar";
    singa.binatang.alat_pernapasan = "Paru-paru";
    singa.binatang.tempat_hidup = "Hutan";
    singa.binatang.karnivora = true;
    singa.jumlah_kaki = 4;
    singa.menyusui = true;

    singa.suara = "Rawrr";
    hewan_laut paus_beluga;
    paus_beluga.binatang.nama_Hewan = "Paus Beluga";
    paus_beluga.binatang.jenis_kelamin = 'J';
    paus_beluga.binatang.cara_berkembangbiak = "Vivipar";
    paus_beluga.binatang.alat_pernapasan = "Paru-paru";
    paus_beluga.binatang.tempat_hidup = "Laut";
    paus_beluga.binatang.karnivora = true;
    paus_beluga.sirip = "Bulat melengkung";
    paus_beluga.pertahanan_diri = "Kibasan ekor";
    cout << "=========================================" << endl;
    cout << " Hewan Darat" << endl;
    cout << "=========================================" << endl;
    cout << "Nama hewan\t\t: " << singa.binatang.nama_Hewan << endl;
    cout << "Jenis kelamin\t\t: " << singa.binatang.jenis_kelamin << endl;
    cout << "Cara berkembang biak\t: " << singa.binatang.cara_berkembangbiak << endl;
    cout << "Alat pernapasan\t\t: " << singa.binatang.alat_pernapasan << endl;
    cout << "Tempat hidup\t\t: " << singa.binatang.tempat_hidup << endl;
    cout << "Karnivora\t\t: " << singa.binatang.karnivora << endl;
    cout << "Jumlah kaki\t\t: " << singa.jumlah_kaki << endl;
    cout << "Manyusui\t\t: " << singa.menyusui << endl;
    cout << "Suara\t\t\t: " << singa.suara << endl;
    cout << endl;
    cout << "=========================================" << endl;
    cout << " Hewan Laut" << endl;
    cout << "=========================================" << endl;
    cout << "Nama hewan\t\t: " << paus_beluga.binatang.nama_Hewan << endl;
    cout << "Jenis kelamin\t\t: " << paus_beluga.binatang.jenis_kelamin << endl;
    cout << "Cara berkembang biak\t: " << paus_beluga.binatang.cara_berkembangbiak << endl;
    cout << "Alat pernapasan\t\t: " << paus_beluga.binatang.alat_pernapasan
         << endl;
    cout << "Tempat hidup\t\t: " << paus_beluga.binatang.tempat_hidup << endl;
    cout << "Karnivora\t\t: " << paus_beluga.binatang.karnivora << endl;
    cout << "Sirip\t\t\t: " << paus_beluga.sirip << endl;
    cout << "Pertahanan diri\t\t: " << paus_beluga.pertahanan_diri << endl;
    return 0;
}