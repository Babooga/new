#include <iostream>
#include <conio.h>
#include <string.h>
using namespace std;

class Pegawai // Class Pegawai
{
private:
    char NIP[5];
    char nama[20];

public:
    Pegawai();
    Pegawai(char *nip, char *nm);
    void tampilPeg();
};
Pegawai::Pegawai()
{
    cout << "Konstruktor pegawai dijalankan..." << endl;
}
Pegawai::Pegawai(char *nip, char *nm)
{
    strcpy(NIP, nip);
    strcpy(nama, nm);
}
void Pegawai::tampilPeg()
{
    cout << "NIP : " << NIP << " ,Nama : " << nama << endl;
}


class Perusahaan // Class Perusahaan
{
private:
    int counter;
    char namaPer[20];
    Pegawai peg[3]; // agregasi antara pegawai dan perusahaan
public:
    Perusahaan(char *nm);
    void insertPegawai(Pegawai p);
    // Relasi yang menunjukkan agregasi
    void tampilPer();
};
Perusahaan::Perusahaan(char *nm)
{
    strcpy(namaPer, nm);
    counter = 0;
    cout << "Konstruktor perusahaan dijalankan..." << endl;
}
void Perusahaan::insertPegawai(Pegawai p)
{
    peg[counter] = p;
    counter++;
}
void Perusahaan::tampilPer()
{
    cout << "Perusahaan " << namaPer << " memiliki pegawai :" << endl;
    for (int i = 0; i < counter; i++)
    {
        peg[i].tampilPeg();
    }
}

int main()
{
    Perusahaan Per("Nusantara Jaya");
    Pegawai Peg1("P001", "Rudi");
    Pegawai Peg2("P002", "Toni");
    Pegawai Peg3("P003", "Ani");
    // Relasi antara Class Pegawai dengan Class Perusahaan
    Per.insertPegawai(Peg1);
    Per.insertPegawai(Peg2);
    Per.insertPegawai(Peg3);
    cout << endl;
    Per.tampilPer();
    getch();
    return 0;
}