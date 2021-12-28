package com.berkay.projeodev;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;


public class oyun1 extends AppCompatActivity {
    public TextView txtMor, txtMavi, txtYesil, txtTuruncu, txtPuan, txtSure, txtDogru;
    public EditText edtMor, edtMavi, edtYesil, edtTur;
    public Button kontrolMor, kontrolMavi, kontrolYesil, kontrolTuruncu, buttonSonuc;
    int sayac = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_oyun1);
        txtDogru = findViewById(R.id.txtDogru);
        txtSure = findViewById(R.id.txtSure);
        txtPuan = findViewById(R.id.txtPuan);
        txtMor = findViewById(R.id.txtMor);
        txtMavi = findViewById(R.id.txtMavi);
        txtYesil = findViewById(R.id.txtYesil);
        txtTuruncu = findViewById(R.id.txtTuruncu);
        edtMor = findViewById(R.id.edtMor);
        edtMavi = findViewById(R.id.edtMavi);
        edtYesil = findViewById(R.id.edtYesil);
        edtTur = findViewById(R.id.edtTur);
        buttonSonuc = findViewById(R.id.buttonSonuc);

        kontrolMor = findViewById(R.id.kontrolMor);
        kontrolMavi = findViewById(R.id.kontrolMavi);
        kontrolYesil = findViewById(R.id.kontrolYesil);
        kontrolTuruncu = findViewById(R.id.kontrolTuruncu);

        edtMor.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        edtMavi.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        edtYesil.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        edtTur.setFilters(new InputFilter[] {new InputFilter.AllCaps()});

        new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtSure.setText("KALAN SURE : " + millisUntilFinished / 1000);
                txtSure.setTextSize(15);
                edtMor.setFocusable(false);
                edtMavi.setFocusable(false);
                edtYesil.setFocusable(false);
                edtTur.setFocusable(false);
            }

            @Override
            public void onFinish() {
                edtMor.setFocusableInTouchMode(true);
                edtMavi.setFocusableInTouchMode(true);
                edtYesil.setFocusableInTouchMode(true);
                edtTur.setFocusableInTouchMode(true);
                txtSure.setText("SURENIZ DOLDU\n" +
                        "RENKLERI YAZIN");
                txtMor.setVisibility(View.INVISIBLE);
                txtMavi.setVisibility(View.INVISIBLE);
                txtYesil.setVisibility(View.INVISIBLE);
                txtTuruncu.setVisibility(View.INVISIBLE);

            }
        }.start();


        kontrolMor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtMor.getText().toString().equals("MOR")) {
                    sayac++;
                    txtPuan.setText("" + sayac);
                    edtMor.setFocusable(false);


                }
            }
        });
        kontrolMavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtMavi.getText().toString().equals("MAVI")) {
                    sayac++;
                    txtPuan.setText("" + sayac);
                    edtMavi.setFocusable(false);
                }
            }
        });
        kontrolYesil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtYesil.getText().toString().equals("YESIL")) {
                    sayac++;
                    txtPuan.setText("" + sayac);
                    edtYesil.setFocusable(false);
                }
            }
        });
        kontrolTuruncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtTur.getText().toString().equals("TURUNCU")) {
                    sayac++;
                    txtPuan.setText("" + sayac);
                    edtTur.setFocusable(false);
                }
            }
        });
        buttonSonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDogru.setVisibility(View.VISIBLE);
                txtPuan.setVisibility(View.VISIBLE);
                if (edtTur.getText().toString().equals("TURUNCU")) {
                    kontrolTuruncu.setText("Doğru");
                    kontrolTuruncu.setBackgroundColor(Color.rgb(0, 255, 0));
                    kontrolTuruncu.setTextColor(Color.WHITE);
                    txtTuruncu.setVisibility(View.VISIBLE);
                    txtPuan.setText("" + sayac);
                    edtTur.setFocusable(false);
                } else {
                    kontrolTuruncu.setBackgroundColor(Color.rgb(255, 0, 0));
                    kontrolTuruncu.setText("YANLIŞ");
                }
                if (edtYesil.getText().toString().equals("YESIL")) {
                    kontrolYesil.setText("Doğru");
                    kontrolYesil.setBackgroundColor(Color.rgb(0, 255, 0));
                    kontrolYesil.setTextColor(Color.WHITE);
                    txtYesil.setVisibility(View.VISIBLE);
                    txtPuan.setText("" + sayac);
                    edtYesil.setFocusable(false);
                } else {
                    kontrolYesil.setBackgroundColor(Color.rgb(255, 0, 0));
                    kontrolYesil.setText("YANLIŞ");
                }
                if (edtMavi.getText().toString().equals("MAVI")) {
                    kontrolMavi.setText("Doğru");
                    kontrolMavi.setBackgroundColor(Color.rgb(0, 255, 0));
                    kontrolMavi.setTextColor(Color.WHITE);
                    txtMavi.setVisibility(View.VISIBLE);

                    txtPuan.setText("" + sayac);
                    edtMavi.setFocusable(false);
                } else {
                    kontrolMavi.setBackgroundColor(Color.rgb(255, 0, 0));
                    kontrolMavi.setText("YANLIŞ");
                }
                if (edtMor.getText().toString().equals("MOR")) {
                    kontrolMor.setText("Doğru");
                    kontrolMor.setBackgroundColor(Color.rgb(0, 255, 0));
                    kontrolMor.setTextColor(Color.WHITE);
                    txtMor.setVisibility(View.VISIBLE);
                    txtPuan.setText("" + sayac);
                    edtMor.setFocusable(false);
                }
                if (txtPuan.getText().toString().equals("4")) {
                    txtDogru.setText("HEPSİNİ DOĞRU BİLDİN :)");
                    txtPuan.setVisibility(View.INVISIBLE);
                }

                buttonSonuc.setVisibility(View.INVISIBLE);
            }
        });


    }
}