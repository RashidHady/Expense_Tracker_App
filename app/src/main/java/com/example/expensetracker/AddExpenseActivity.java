package com.example.expensetracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddExpenseActivity extends AppCompatActivity {

    private EditText etExpenseName, etAmount, etLocation;
    private TextView tvCategory, tvDate;
    private ImageView btnBack, btnSaveIcon;
    private ImageButton btnGps;
    private Button btnSaveExpense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        // Initialize views
        etExpenseName = findViewById(R.id.etExpenseName);
        etAmount = findViewById(R.id.etAmount);
        etLocation = findViewById(R.id.etLocation);
        tvCategory = findViewById(R.id.tvCategory);
        tvDate = findViewById(R.id.tvDate);
        btnBack = findViewById(R.id.btnBack);
        btnSaveIcon = findViewById(R.id.btnSaveIcon);
        btnGps = findViewById(R.id.btnGps);
        btnSaveExpense = findViewById(R.id.btnSaveExpense);

        // Set click listeners
        btnBack.setOnClickListener(v -> finish());

        btnSaveIcon.setOnClickListener(v -> saveExpense());

        btnSaveExpense.setOnClickListener(v -> saveExpense());

        btnGps.setOnClickListener(v -> {
            Toast.makeText(this, "Fetching GPS location...", Toast.LENGTH_SHORT).show();
            etLocation.setText("Dar es Salaam");
        });

        tvCategory.setOnClickListener(v -> {
            Toast.makeText(this, "Select Category clicked", Toast.LENGTH_SHORT).show();
        });

        tvDate.setOnClickListener(v -> {
            Toast.makeText(this, "Select Date clicked", Toast.LENGTH_SHORT).show();
        });
    }

    private void saveExpense() {
        String name = etExpenseName.getText().toString();
        String amount = etAmount.getText().toString();

        if (name.isEmpty() || amount.isEmpty()) {
            Toast.makeText(this, "Please fill all required fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Expense saved: " + name, Toast.LENGTH_SHORT).show();
            // Implement actual save logic here
        }
    }
}
