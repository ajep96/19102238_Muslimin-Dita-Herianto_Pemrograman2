# Modul 0 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam Java

  Penjelasan Teori
* Tipe Dasar

  Penjelasan Teori
* Variabel

  Penjelasan Teori
* Casting dan Promotion

  Penjelasan Teori

<hr>

## Praktikum
Soal : 
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/Musliminnn/19102238_Muslimin-Dita-Herianto_Pemrograman2/blob/modul0/src/main/java/com/muslimin/pbo/modul0/latihan/BigInteger.java)

  ```java
  long p = 2147483648;
  ```
  Syntax diatas akan menampilkan error:
  ```java
  C:\Users\Muslimin\IdeaProjects\PraktikumPBO\src\main\java\com\muslimin\pbo\modul2\latihan\BigInteger.java:5: error: integer number too large: 2147483648
  ```
  Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer   bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca     tipe data yang kita maksud adalah tipe data long.

  Contoh:
  ```java
  long p = 2147483648L;
  ```


2. [Jawaban Soal 2]()
3. [Jawaban Soal 3]()

<hr>

## Kesimpulan
