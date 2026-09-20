# Sistem Penyewaan Perangkat

## 1. Identitas Mahasiswa

**Nama:** Siti Nursinta  

**NIM:** 2509116087

**Kelas:** C 2025

---

## 2. Penjelasan Studi Kasus

**Sistem Penyewaan Perangkat** merupakan aplikasi berbasis console yang dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO).

Aplikasi ini dibuat untuk membantu mengelola data perangkat yang dapat disewakan. Pada sistem ini terdapat dua jenis perangkat, yaitu **Kamera** dan **Drone**.

Setiap perangkat memiliki beberapa informasi umum, yaitu:

- ID perangkat
- Nama perangkat
- Harga sewa
- Status perangkat

Selain informasi umum tersebut, setiap jenis perangkat memiliki informasi khusus. Pada perangkat **Kamera** terdapat informasi berupa resolusi dan jenis kamera. Sedangkan pada perangkat **Drone** terdapat informasi berupa resolusi kamera dan durasi terbang.

Aplikasi ini memiliki beberapa menu utama untuk mengelola data perangkat, yaitu:

1. **Tambah Kamera** untuk menambahkan data perangkat Kamera.
2. **Tambah Drone** untuk menambahkan data perangkat Drone.
3. **Tampilkan Semua Perangkat** untuk melihat seluruh data perangkat yang telah ditambahkan.
4. **Ubah Status Perangkat** untuk mengubah status suatu perangkat berdasarkan ID.
5. **Hapus Perangkat** untuk menghapus data perangkat berdasarkan ID.
6. **Keluar** untuk mengakhiri program.

Data perangkat yang ditambahkan akan disimpan menggunakan `ArrayList`, sehingga data dapat dikelola selama program sedang dijalankan.

---

## 3. Diagram Kelas / Hierarki Class

Struktur class pada **Sistem Penyewaan Perangkat** terdiri dari satu superclass dan dua subclass.

```text
                         Perangkat
                        (Superclass)
                       /            \
                      /              \
                 Kamera              Drone
                (Subclass)         (Subclass)
```

### Penjelasan Class

#### 1. Perangkat

`Perangkat` merupakan **superclass** atau class induk dalam program.

Class ini berisi atribut dan method yang bersifat umum dan digunakan oleh berbagai jenis perangkat.

Atribut pada class `Perangkat`:

- `idPerangkat`
- `namaPerangkat`
- `hargaSewa`
- `status`

Method yang terdapat pada class ini adalah:

- `tampilkanInfo()`

Method tersebut digunakan untuk menampilkan informasi umum dari perangkat.

#### 2. Kamera

`Kamera` merupakan **subclass** dari class `Perangkat`.

Class `Kamera` mewarisi atribut dan method dari class `Perangkat`, kemudian memiliki atribut tambahan yang khusus digunakan untuk perangkat Kamera.

Atribut tambahan:

- `resolusi`
- `jenisKamera`

Class `Kamera` juga melakukan perubahan pada method `tampilkanInfo()` untuk menampilkan informasi tambahan mengenai Kamera.

#### 3. Drone

`Drone` merupakan **subclass** dari class `Perangkat`.

Class `Drone` mewarisi atribut dan method dari class `Perangkat`, kemudian memiliki atribut tambahan yang sesuai dengan karakteristik Drone.

Atribut tambahan:

- `resolusiKamera`
- `durasiTerbang`

Class `Drone` juga melakukan perubahan pada method `tampilkanInfo()` untuk menampilkan informasi tambahan mengenai Drone.

### Struktur Class pada Program

```text
Model
│
├── Perangkat
│   ├── idPerangkat
│   ├── namaPerangkat
│   ├── hargaSewa
│   ├── status
│   └── tampilkanInfo()
│
├── Kamera extends Perangkat
│   ├── resolusi
│   ├── jenisKamera
│   └── tampilkanInfo()
│
└── Drone extends Perangkat
    ├── resolusiKamera
    ├── durasiTerbang
    └── tampilkanInfo()
```
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-20%20202530.png?raw=true)

Selain class pada package `Model`, program juga memiliki:

- `KelolaPerangkat` pada package `Logic` yang digunakan untuk mengelola data perangkat menggunakan `ArrayList`.
- `SistemPenyewaanPerangkat` pada package `Main` yang digunakan sebagai class utama untuk menjalankan program dan menampilkan menu.

---

## 4. Penjelasan Implementasi Inheritance

Inheritance diterapkan dengan menggunakan class `Perangkat` sebagai **superclass** dan class `Kamera` serta `Drone` sebagai **subclass**.

Inheritance memungkinkan subclass untuk menggunakan kembali atribut dan method dari superclass serta menambahkan atribut atau perilaku khusus. Pada program ini, konsep tersebut digunakan agar informasi yang sama pada Kamera dan Drone tidak perlu dibuat ulang. Konsep inheritance menggunakan keyword `extends`. 

### Implementasi pada Class Kamera

Class `Kamera` mewarisi class `Perangkat` menggunakan keyword `extends`.

```java
public class Kamera extends Perangkat
```

Dengan demikian, `Kamera` dapat menggunakan atribut dan method yang dimiliki oleh `Perangkat`.

Atribut umum seperti:

```text
idPerangkat
namaPerangkat
hargaSewa
status
```

berasal dari superclass `Perangkat`.

Kemudian `Kamera` menambahkan atribut khusus:

```text
resolusi
jenisKamera
```

### Implementasi pada Class Drone

Class `Drone` juga mewarisi class `Perangkat`.

```java
public class Drone extends Perangkat
```

Dengan inheritance tersebut, `Drone` dapat menggunakan atribut dan method umum dari `Perangkat`.

Kemudian `Drone` menambahkan atribut khusus:

```text
resolusiKamera
durasiTerbang
```

### Penggunaan `super`

Pada constructor subclass, keyword `super` digunakan untuk memanggil constructor dari superclass `Perangkat`.

Contohnya pada class `Kamera`:

```java
super(idPerangkat, namaPerangkat, hargaSewa, status);
```

Hal yang sama juga diterapkan pada class `Drone`.

Penggunaan `super` membuat data umum seperti ID, nama, harga sewa, dan status dapat diinisialisasi melalui constructor milik superclass.

### Penggunaan `@Override`

Inheritance juga diterapkan melalui `@Override`.

Method `tampilkanInfo()` yang terdapat pada class `Perangkat` ditulis kembali pada class `Kamera` dan `Drone` agar masing-masing subclass dapat menampilkan informasi tambahan sesuai jenis perangkatnya.

Contoh pada class `Kamera:

```java
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Resolusi       : " + resolusi);
    System.out.println("Jenis Kamera   : " + jenisKamera);
}
```

Pada kode tersebut, `super.tampilkanInfo()` digunakan untuk memanggil method `tampilkanInfo()` milik superclass terlebih dahulu. Setelah itu, class `Kamera` menambahkan informasi khusus berupa resolusi dan jenis kamera.

Hal yang sama diterapkan pada class `Drone`, tetapi informasi tambahan yang ditampilkan adalah resolusi kamera dan durasi terbang.

### Kesimpulan Implementasi Inheritance

Penerapan inheritance pada program dapat digambarkan sebagai berikut:

```text
                    Perangkat
                   (Superclass)
                   /          \
                  /            \
             Kamera            Drone
            (Subclass)        (Subclass)
```

Dengan struktur tersebut, `Kamera` dan `Drone` memiliki hubungan pewarisan dengan `Perangkat`. Atribut dan method yang bersifat umum ditempatkan pada superclass, sedangkan atribut khusus ditempatkan pada masing-masing subclass.

---

## 5. Screenshot Saat Program Dijalankan

### 5.1 Menu Utama

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20222051.png?raw=true)

**Keterangan:**  
Menu utama digunakan sebagai tampilan awal program dan berisi pilihan untuk mengelola data perangkat. Pengguna dapat memilih menu untuk menambah, menampilkan, mengubah, atau menghapus data perangkat.

---

### 5.2 Tambah Kamera

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20222344.png?raw=true)

**Keterangan:**  
Menu Tambah Kamera digunakan untuk memasukkan data perangkat Kamera, seperti ID perangkat, nama perangkat, harga sewa, status, resolusi, dan jenis kamera.

---

### 5.3 Tambah Drone

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20222509.png?raw=true)

**Keterangan:**  
Menu Tambah Drone digunakan untuk memasukkan data perangkat Drone, seperti ID perangkat, nama perangkat, harga sewa, status, resolusi kamera, dan durasi terbang.

---

### 5.4 Tampilkan Semua Perangkat

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20223033.png?raw=true)

**Keterangan:**  
Menu Tampilkan Semua Perangkat digunakan untuk melihat seluruh data perangkat yang telah ditambahkan ke dalam sistem, baik perangkat Kamera maupun Drone.

---

### 5.5 Ubah Status Perangkat

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20223136.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20223150.png?raw=true)

**Keterangan:**  
Menu Ubah Status Perangkat digunakan untuk mengubah status perangkat berdasarkan ID perangkat. Fitur ini dapat digunakan ketika status suatu perangkat mengalami perubahan.

---

### 5.6 Hapus Perangkat

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20223214.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20223228.png?raw=true)

**Keterangan:**  
Menu Hapus Perangkat digunakan untuk menghapus data perangkat berdasarkan ID perangkat yang dipilih.

---

### 5.7 Keluar dari program

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Matkul/Screenshot%202026-09-16%20223248.png?raw=true)
