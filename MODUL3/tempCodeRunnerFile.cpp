//ramadhan wijaya
//2211102208
// Prinsip-Prinsip Perancangan Kelas
#include <iostream>
#include <iomanip>
#include <conio.h>
#include <string.h>

using namespace  std;
/******* Mendeklarasikan Kelas *******/
class Buku
{
private: // encapsulation atributes dari kelas
    char pengarang[24];
    char judul[20];
    int jmlh_halaman;
    float diskon;
    double Harga;

public:      // visibilitas methods dari kelas
    Buku();  // constructor
    ~Buku(); // destructor

    // fungsi-fungsi mutator
    void setPengarang(char *Pengarang);
    void setJudul(char *Judul);
    void setJmlhHalaman(int JmlhHalaman);
    // fungsi-fungsi accessor
    char *getPengarang();
    char *getJudul();
    int getJmlhHalaman();
    // method overloading
    void setInfo(float dskn, double HargaBuku);
    void setInfo(double HargaBuku);
    void cetak();
};
/******* Mendeklarasikan Methods dari Kelas *******/
Buku::Buku() // constructor
{
    cout << "Konstruktor buku dijalankan...." << endl;
}

Buku::~Buku() // destructor
{
    // perintah di bawah ini hanya menunjukkan bahwa destruktor dipanggil di akhir program
    cout<< "Destruktor buku dijalankan...." << endl;
    getch();
}

// fungsi-fungsi mutator
void Buku::setPengarang(char *Pengarang)
{
    strcpy(pengarang, Pengarang);
}
void Buku::setJudul(char *Judul)
{
    strcpy(judul, Judul);
}
void Buku::setJmlhHalaman(int JmlhHalaman)
{
    jmlh_halaman = JmlhHalaman;
}

// fungsi-fungsi accessor
char *Buku::getPengarang()
{
    return pengarang;
}
char *Buku::getJudul()
{
    return judul;
}
int Buku::getJmlhHalaman()
{
    return jmlh_halaman;
}
// method overloading
void Buku::setInfo(float dskn, double HargaBuku)
{
    diskon = dskn;
    Harga = HargaBuku - (diskon * HargaBuku);
}


void Buku::setInfo(double HargaBuku)
{
    diskon = 0.1;
    Harga = HargaBuku - (diskon * HargaBuku);
}
void Buku::cetak()
{
    cout << setiosflags(ios::fixed); // manipulasi digit pecahan
    cout << "\nJudul Buku : " << getJudul() << endl;
    cout << "Pengarang : " << getPengarang() << endl;
    cout << "Jumlah halaman Buku : " << getJmlhHalaman() << " halaman "<<endl;
    cout << "Diskon Buku dibeli : " << setprecision(2) << diskon << endl;
    cout << "Harga Buku : "<< setprecision(2)<<Harga<<endl;
}
/************************ Main Program ************************/
int main(){
    Buku novel, fiksi, folklore;
    cout << endl;
    novel.setJudul("Interstelar");
    novel.setPengarang("cristopher nolan");
    novel.setInfo(0.2, 45000);
    novel.setJmlhHalaman(123);
    novel.cetak();

    fiksi.setJudul("vent");
    fiksi.setPengarang("caroline mcquen");
    fiksi.setJmlhHalaman(202);
    fiksi.setInfo(79000);
    fiksi.cetak();

    folklore.setJudul("diao chan");
    folklore.setPengarang("somebody");
    folklore.setJmlhHalaman(142);
    folklore.setInfo(120000);
    folklore.cetak();

    getch();
    return 0;
}