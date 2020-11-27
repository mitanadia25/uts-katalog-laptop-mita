package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnToshiba,btnHp,btnAcer;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnToshiba = findViewById(R.id.btn_buka_toshiba);
        btnHp = findViewById(R.id.btn_buka_hp);
        btnAcer = findViewById(R.id.btn_buka_acer);
        btnToshiba.setOnClickListener(view -> bukaGaleri("Toshiba"));
        btnHp.setOnClickListener(view -> bukaGaleri("Hp"));
        btnAcer.setOnClickListener(view -> bukaGaleri("Acer"));
    }

    private void bukaGaleri(String jenisLeptop) {
        Log.d("MAIN","Buka activity toshiba");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisLeptop);
        startActivity(intent);
    }

}