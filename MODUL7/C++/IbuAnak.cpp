#include <string.h>
#include <iostream>
#include <conio.h>
using namespace std;

class Manusia
{
private:
    char nama[20];
    int umur;
    Manusia *anak;
    // Letak asosiasi, dimana kelas anak menjadi variabel
    Manusia *ibu;

public:
    Manusia(char *nama, int umur);
    Manusia(char *nama, int umur, Manusia &ibu);
    void cetak();
    void adopsi(Manusia &anak);
    // Relasi yang menunjukkan asosiasi
};

Manusia::Manusia(char *nm, int umr)
{
    strcpy(nama, nm);
    umur = umr;
    ibu = NULL;
    anak = NULL;
}

Manusia::Manusia(char *nm, int umr, Manusia &ibu_angkat)
{
    strcpy(nama, nm);
    umur = umr;
    anak = NULL;
    ibu = &ibu_angkat;
    ibu_angkat.anak = this;
}

void Manusia::cetak()
{
    cout << endl << "- Data Pribadi -" << endl;
    cout << "Nama : " << nama << endl;
    cout << "Umur : " << umur << endl;
    if (ibu)
        cout << "Nama ibu : " << ibu->nama << endl;
    if (anak)
        cout << "Nama anak : " << anak->nama << endl;
}

void Manusia::adopsi(Manusia &anak_angkat)
{
    anak = &anak_angkat;
    anak_angkat.ibu = this;
}

int main()
{
    Manusia ibu1("Budi", 30);
    Manusia anak1("Ani", 4);
    Manusia ibu2("Diana", 40);
    Manusia anak2("Andi", 5, ibu2);
    // Relasi antara Manusia dengan Manusia
    cout << endl << "=========================" << endl;
    ibu1.cetak();
    anak1.cetak();
    cout << endl << "=========================" << endl;
    ibu1.adopsi(anak1);
    ibu1.cetak();
    anak1.cetak();
    cout << endl << "=========================" << endl;
    ibu2.cetak();
    anak2.cetak();
    cout << endl;
    getch();
    return 0;
}