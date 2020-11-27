package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Toshiba;
import simple.example.hewanpedia.model.Leptop;
import simple.example.hewanpedia.model.Acer;
import simple.example.hewanpedia.model.Hp;

public class DataProvider {
    private static List<Leptop> laptop = new ArrayList<>();

    private static List<Acer> initDataAcer(Context ctx) {
        List<Acer> acers = new ArrayList<>();
        acers.add(new Acer("Acer","Acer Swift 3X",
                "Acer Swift 3X disebut-sebut sebagai notebook pertama di Indonesia dengan kartu grafis Intel Xe Max, yang performanya setara dengan notebook gaming.", R.drawable.acer_1));
        acers.add(new Acer( "Acer","Acer Aspire 3 A314-32 Intel N4120",
                "Acer Aspire 3 A314-32 Intel N4120 adalah laptop level entri yang dijual seharga Rp 3 jutaan. Performa yang ditawarkannya standar untuk komputasi ringan sehari-hari, membuatnya cocok digunakan oleh anak sekolahan.", R.drawable.acer_2));
        acers.add(new Acer( "Acer", "Acer Aspire 3 Slim",
                "Acer Aspire 3 Slim ini merupakan laptop Acer untuk kelas harga terjangkau. Laptop ini dibanderol dengan harga mulai Rp3 jutaan, harga yang tentunya menarik dan banyak dicari orang.", R.drawable.acer_3));
        acers.add(new Acer( "Acer", "Acer Aspire 5 A514-53 (Magical Color)",
                "Acer Aspire 5 A514-53 atau Acer Aspire 5 Magical Color merupakan laptop kelas harga Rp6 jutaan. Di kelas harga ini, spesifikasi yang ditawarkan tentu lebih menarik.", R.drawable.acer_4));
        acers.add(new Acer( "Acer", "Acer Swift 3 Ryzen (Acer Swift 3 SF314-42)",
                "Laptop ini menawarkan prosesor AMD Ryzen 4500U yang tentunya merupakan prosesor baru dengan proses fabrikasi 7nm.", R.drawable.acer_5));
        acers.add(new Acer( "Acer", "Acer Nitro 5 Ryzen 4000 (AN515-44)",
                "Jika membutuhkan laptop gaming, maka Acer Nitro 5 Ryzen 4000 jawabannya. Laptop ini memiliki keunggulan di port yang lengkap, desain gahar khas gaming, dan sokonga layar 15,6 inci dengan refresh rate 144 Hz.", R.drawable.acer_6));
        return acers;
    }

    private static List<Toshiba> initDataToshiba(Context ctx) {
        List<Toshiba> toshibas = new ArrayList<>();
        toshibas.add(new Toshiba( "Toshiba", "Toshiba Portégé X20W",
                "Toshiba Portégé X20W bisa diandalkan untuk berbagai kegiatan mulai dari bermain game", R.drawable.toshiba_1));
        toshibas.add(new Toshiba( "Toshiba", "Toshiba Portégé Z20T",
                "Laptop Toshiba terbaru selanjutnya ada Portege Z20T, notebook 2 in 1 yang bisa dipisahkan antara monitor dan keyboard-nya.", R.drawable.toshiba_2));
        toshibas.add(new Toshiba( "Toshiba", "Toshiba C55 C2052",
                "Laptop Toshiba terbaru selanjutnya ada Toshiba C55 yang memiliki kapasitas RAM 4 Gb dan 500 Gb internal jenis hard disk, cocok untuk pekerjaan sederhana sehari-hari.", R.drawable.toshiba_3));
        toshibas.add(new Toshiba( "Toshiba", "Portege X30-D128",
                "Portege X30-D128 bisa kamu pertimbangkan jika mencari laptop untuk bermain game kelas berat jenis AAA dengan lancar.", R.drawable.toshiba_4));
        toshibas.add(new Toshiba( "Toshiba", "Satellite L50T-B1779",
                "Sedang mencari laptop Toshiba untuk keperluan pekerjaan dan multimedia ringan? Kamu bisa mempertimbangkan Satellite L50T-B1779 yang memiliki layar lebar 15,6 inci dengan resolusi high definition.", R.drawable.toshiba_5));
        toshibas.add(new Toshiba( "Toshiba", "Toshiba Satellite M840-1031 XQ",
                "Toshiba Satellite E45W-C4200WX cocok untuk pekerjaan yang berhubungan dengan desain grafis karena memiliki fitur layar sentuh 14 inci yang membuatnya mudah diatur.", R.drawable.toshiba_6));
        return toshibas;
    }

    private static List<Hp> initDataHp(Context ctx) {
        List<Hp> hps = new ArrayList<>();
        hps.add(new Hp( "Hp", "HP Pavilion Gaming - 15-ec0001ax",
                "Salah satu laptop HP terbaik adalah HP Pavilion Gaming - 15-ec0001ax ini mengawinkan duet prosesor berkelas milik AMD, Ryzen 5 3550H generasi Picasso dan kartu grafis buatan NVIDIA GeForce seri GTX 1050 pada dapur pacu andalannya. ", R.drawable.hp_1));
        hps.add(new Hp("Hp","HP EliteBook 8440p",
                "Terbukti dengan HP EliteBook 8440p ini, yang diklaim lebih cocok digunakan kaum pekerja eksekutif dengan mobilitas tinggi, daripada menjadi kawan setia seorang desainer.", R.drawable.hp_2));
        hps.add(new Hp( "Hp", "HP Pavilion 15",
                "Dengan mode standarnya yang mengawinkan prosesor Core i5-9300H dengan RAM 8GB, salah satu laptop HP terbaik ini dibekali SSD berkapasitas 256GB. ", R.drawable.hp_3));
        hps.add(new Hp( "Hp", " HP Spectre x360 13-4123tu",
                "mengusung desain yang sangat portable, memudahkan anda dalam membawanya ketika dalam perjalanan. Dengan ukuran 12,1 x 7,7 inci niscaya akan memudahkan anda memilih tas yang muat dengan laptop ini.", R.drawable.hp_4));
        hps.add(new Hp( "Hp", "HP OMEN X",
                "Laptop ini sudah memasuki jajaran laptop gaming premium dengan konfigurasi tertinggi yang dibekali Core i7-9750H dan dikawinkan dengan RAM sebesar 16GB.", R.drawable.hp_5));
        hps.add(new Hp( "Hp", "HP OMEN 17-an002tx",
                "Hawlett Packard sungguh tak ingin ketinggalan dalam bursa pasar laptop gaming, menggandeng OMEN, HP mendesain laptop dengan performa mumpuni dan berkelas premium.", R.drawable.hp_6));
        return hps;
    }

    private static void initAllLaptop(Context ctx) {
        laptop.addAll(initDataToshiba(ctx));
        laptop.addAll(initDataAcer(ctx));
        laptop.addAll(initDataHp(ctx));
    }

    public static List<Leptop> getLaptop(Context ctx) {
        if (laptop.size() == 0) {
            initAllLaptop(ctx);
        }
        return  laptop;
    }

    public static List<Leptop> getLaptopssByTipe(Context ctx, String model) {
        List<Leptop> laptopsByType = new ArrayList<>();
        if (laptop.size() == 0) {
            initAllLaptop(ctx);
        }
        for (Leptop h : laptop) {
            if (h.getModel().equals(model)) {
                laptopsByType.add(h);
            }
        }
        return laptopsByType;
    }

}
