//ramadhan wijaya
//2211102208
#include <iostream>
#include <cstring>

using namespace std;

class Keluarga
{
public:
    char nama[20];

public:
    // konstruktor Keluarga
    Keluarga(const char *Nama)
    {
        strncpy(nama, Nama, sizeof(nama));
    }
    // destruktor Keluarga
    virtual ~Keluarga()
    {
        cout << "Destruktor di kelas Keluarga.." << endl;
    }
    // deklarasi fungsi virtual murni
    virtual void info() = 0;
};

class Keturunan : public Keluarga
{
private:
    char nama_depan[15];

public:
    Keturunan(const char *Nama_depan, const char *Nama_kel) : Keluarga(Nama_kel)
    {
        strncpy(nama_depan, Nama_depan, sizeof(nama_depan));
    }
    ~Keturunan()
    {
        cout << "Destruktor di Keturunan.." << endl;
    }
    void info() override
    {
        cout << nama_depan << ' ' << nama << endl;
    }
};

int main()
{
    Keluarga *anak1 = new Keturunan("Umar", "Khatab");
    anak1->info();
    Keluarga *anak2 = new Keturunan("Udin", "Pambudi");
    anak2->info();

    delete anak1;
    delete anak2;

    cin.get(); // Tunggu masukan sebelum program selesai
    return 0;
}