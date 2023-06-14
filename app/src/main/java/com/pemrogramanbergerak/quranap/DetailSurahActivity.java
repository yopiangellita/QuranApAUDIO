package com.pemrogramanbergerak.quranap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailSurahActivity extends AppCompatActivity {

    TextView textViewNameSimpleSurah;
    TextView textViewIDSurah;

    TextView textViewNameArabicSurah;
    TextView textViewJumlahAyatSurah;
    TextView textViewTempatTurunSurah;
    TextView textViewUrutanTurunSurah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_surah);

        String nameSimple = getIntent().getStringExtra("name_simple");
        textViewNameSimpleSurah = findViewById(R.id.tvNamaSurah);
        textViewNameSimpleSurah.setText(" " + (nameSimple));

        int id = getIntent().getIntExtra("id", 1);
        textViewIDSurah = findViewById(R.id.tvIDSurah);
        textViewIDSurah.setText(" Surat ke : " + (id) + " di Al-Qur'an") ;

        String nameArabic = getIntent().getStringExtra("name_arabic");
        textViewNameArabicSurah = findViewById(R.id.tvNamaArabicSurah);
        textViewNameArabicSurah.setText("( "+ (nameArabic) +")");

        int versesCount = getIntent().getIntExtra("verses_count", 1);
        textViewJumlahAyatSurah = findViewById(R.id.tvJumlahAyatSurah);
        textViewJumlahAyatSurah.setText(" Jumlah Ayat : " + (versesCount));

        String revelationPlace = getIntent().getStringExtra("revelation_place");
        textViewTempatTurunSurah = findViewById(R.id.tvTempatTurunSurah);
        textViewTempatTurunSurah.setText(" Diturunkan di : " + (revelationPlace));

        int revelationOrder = getIntent().getIntExtra("revelation_order", 1);
        textViewUrutanTurunSurah = findViewById(R.id.tvUrutanTurunSurah);
        textViewUrutanTurunSurah.setText(" Urutan Turun Surah : " + (revelationOrder));
    }

}