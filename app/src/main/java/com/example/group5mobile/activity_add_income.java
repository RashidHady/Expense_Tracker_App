package com.example.expensetracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddIncomeActivity extends AppCompatActivity {

    private ImageButton btnBack;
    private Button btnSave;

    private EditText etSource;
    private EditText etAmount;
    private EditText etDate;
    private EditText etLocation;
    private EditText etNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_income);

        // Initialize Views
        btnBack = findViewById(R.id.btnBack);
        btnSave = findViewById(R.id.btnSave);

        etSource = findViewById(R.id.etSource);
        etAmount = findViewById(R.id.etAmount);
        etDate = findViewById(R.id.etDate);
        etLocation = findViewById(R.id.etLocation);
        etNotes = findViewById(R.id.etNotes);

        // Back Button
        btnBack.setOnClickListener(v -> finish());

        // Save Button
        btnSave.setOnClickListener(v -> {

            String source = etSource.getText().toString().trim();
            String amount = etAmount.getText().toString().trim();
            String date = etDate.getText().toString().trim();
            String location = etLocation.getText().toString().trim();
            String notes = etNotes.getText().toString().trim();

            if (source.isEmpty()) {
                etSource.setError("Enter income source");
                etSource.requestFocus();
                return;
            }

            if (amount.isEmpty()) {
                etAmount.setError("Enter amount");
                etAmount.requestFocus();
                return;
            }

            if (date.isEmpty()) {
                etDate.setError("Enter date");
                etDate.requestFocus();
                return;
            }

            if (location.isEmpty()) {
                etLocation.setError("Enter location");
                etLocation.requestFocus();
                return;
            }

            Toast.makeText(
                    AddIncomeActivity.this,
                    "Income Saved Successfully!",
                    Toast.LENGTH_SHORT
            ).show();

            // Clear fields
            etSource.setText("");
            etAmount.setText("");
            etDate.setText("");
            etLocation.setText("");
            etNotes.setText("");
        });
    }
}