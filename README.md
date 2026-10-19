# katalon-petstore-api

## 📌 Deskripsi Proyek
Proyek ini adalah tugas Final Project - Katalon Studio bagian **API Automation**. Otomatisasi pengujian dilakukan pada endpoint API resmi JPetStore Swagger API (https://swagger.io) untuk memastikan fungsionalitas pengelolaan data backend berjalan dengan baik melalui skenario positif, negatif, dan pengujian alur berantai.

## 🛠️ Prasyarat & Cara Menjalankan
1. Download dan instal aplikasi **Katalon Studio** di laptop Anda.
2. Clone atau download folder proyek API ini ke komputer Anda.
3. Buka Katalon Studio, lalu pilih **File** > **Open Project** > Arahkan ke folder proyek ini.
4. Pastikan Execution Profile menggunakan profile `default` yang sudah terisi variabel global base URL secara aman tanpa hardcode.
5. Pastikan aplikasi pendukung **Appium / Node.js** atau server lokal API Anda sudah terhubung (jika diperlukan).
6. Buka folder **Test Suites** pada panel kiri Katalon Studio, lalu klik dua kali file **Suite_API_Automation**.
7. Klik tombol **Run** (panah hijau melingkar) di toolbar bagian atas untuk menjalankan semua pengujian API secara otomatis.

## 📊 Test Suite & Test Coverage
Proyek ini mencakup total **5 Skenario Uji API (Test Cases)** yang dieksekusi secara massal, berurutan, dan terintegrasi di dalam satu Test Suite:
1. **TC6_API_POST_Sukses** (Positive Case) - Menguji keberhasilan penambahan data hewan baru (Add Pet) ke server dengan validasi respon status code 200 OK.
2. **TC7_API_GET_Sukses** (Positive Case) - Menguji fungsi pencarian data hewan berdasarkan ID yang valid dan memastikan data respon JSON sesuai.
3. **TC8_API_GET_Gagal** (Negative Case) - Memastikan sistem menangani kesalahan dengan benar (Error Handling) dan mengembalikan status 404 Not Found saat mencari ID hewan palsu.
4. **TC9_API_PUT_Sukses** (Positive Case) - Menguji fitur pembaruan data (Update Pet) untuk mengubah atribut nama atau status hewan secara dinamis pada server.
5. **TC10_API_E2E_Flow** (End-to-End Flow) - Menguji siklus hidup data secara utuh dalam satu alur berantai tanpa putus, mulai dari proses pembuatan (Create), membaca data (Read), hingga menghapus data (Delete).


