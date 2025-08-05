package com.week1.question2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editPrincipal;
    EditText editRate;
    EditText editTime;
    TextView tvResult;
    Button btnSimpleInterest;
    Button btnLoanRepayment;
    Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        editPrincipal = findViewById(R.id.editPrincipal);
        editRate = findViewById(R.id.editRate);
        editTime = findViewById(R.id.editTime);
        tvResult = findViewById(R.id.tvResult);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnLoanRepayment = findViewById(R.id.btnLoanRepayment);
        btnQuit = findViewById(R.id.btnQuit);


        btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calculateSimpleInterest(); }
        });

        btnLoanRepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { calculateLoanRepayment(); }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { quitApp(); }
        });
    }

    private void calculateSimpleInterest() {
        String principalStr = editPrincipal.getText().toString();
        String rateStr = editRate.getText().toString();
        String timeStr = editTime.getText().toString();

        if (principalStr.isEmpty() || rateStr.isEmpty() || timeStr.isEmpty()) {
            tvResult.setText("Please enter all fields.");
            return;
        }

        try {
            double principal = Double.parseDouble(principalStr);
            double rate = Double.parseDouble(rateStr);
            double time = Double.parseDouble(timeStr);

            double simpleInterest = (principal * rate * time) / 100;

            String resultText = String.format("Simple Interest: %.2f", simpleInterest);
            tvResult.setText(resultText);

        } catch (NumberFormatException e) {
            tvResult.setText("Invalid input! Please enter numeric values only.");
        }
    }

    private void calculateLoanRepayment() {
        String principalStr = editPrincipal.getText().toString();
        String rateStr = editRate.getText().toString();
        String timeStr = editTime.getText().toString();

        if (principalStr.isEmpty() || rateStr.isEmpty() || timeStr.isEmpty()) {
            tvResult.setText("Please enter all fields.");
            return;
        }

        try {
            double principal = Double.parseDouble(principalStr);
            double rate = Double.parseDouble(rateStr);
            double time = Double.parseDouble(timeStr);

            double simpleInterest = (principal * rate * time) / 100;
            double totalAmount = principal + simpleInterest;
            double monthlyRepayment = totalAmount / (time * 12);

            String resultText = String.format("Monthly Repayment: %.2f\nTotal Amount with Interest: %.2f",
                    monthlyRepayment, totalAmount);
            tvResult.setText(resultText);

        } catch (NumberFormatException e) {
            tvResult.setText("Invalid input! Please enter numeric values only.");
        }
    }

    private void quitApp() {
        finish();
    }
}

