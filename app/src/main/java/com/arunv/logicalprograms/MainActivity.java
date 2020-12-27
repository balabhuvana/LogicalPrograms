package com.arunv.logicalprograms;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPrograms = findViewById(R.id.btnPrograms);
        btnPrograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printPrimeNumbers(20);
            }
        });
    }

    private void fibonacciSeries(int num) {
        int a = 0, b = 1, c;

        Log.i("----> ", "" + a);

        for (int i = 0; i <= num; i++) {
            Log.i("----> ", "" + b);
            c = a + b;
            a = b;
            b = c;
        }
    }

    private void validatePrimeNumbers(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            Log.i("----> ", "" + num + " Yes It is a prime number");
        } else {
            Log.i("----> ", "" + num + " It is not a prime number");
        }
    }

    private void printPrimeNumbers(int num) {
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 1) {
                Log.i("----> ", "" + i + " Yes It is a prime number");
            }

        }
    }

}
