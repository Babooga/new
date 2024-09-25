//ramadhan wijaya
//2211102208

#include <iostream>
#include <conio.h>
using namespace std;

class makhluk{
    public:
    virtual void keterangan(){  // deklarasi rposedur virtual
        cout <<"keterangan() pada kelas mahkluk"<<endl;
    }
};

class mamalia:public makhluk{ // ":" mewariskan
    public:
    void keterangan(){
        cout<<"keterangan() pada kelas mamalia"<<endl;
    }
};

class sapi:public mamalia{
    void keterangan(){
        cout<<"keterangan() pada kelas sapi"<<endl;
    }
};

int main (){
    //definisi obek mamalia
    mamalia m,m2;

    //definisi objek sapii
    sapi s;

    //definisi pointer ke objek class mahkluk
    makhluk *binatang;

    //menunjuk ke objek mamalia
    //harus meunjuk ke alamatnya tidak bisa ke objeknya langsung :::menggunakan "&"
    binatang = &m;
    binatang->keterangan();

    cout <<endl<<"-------------------------------"<<endl;
    //menuju ke objek sapi
    //harus meunjuk ke alamatnya tidak bisa ke objeknya langsung :::menggunakan "&"
    binatang = &s;
    binatang->keterangan();

    cout <<endl<<"--------------------------------"<<endl;
    binatang = &m2;
    binatang->keterangan();
    getch();

    return 0;
}


