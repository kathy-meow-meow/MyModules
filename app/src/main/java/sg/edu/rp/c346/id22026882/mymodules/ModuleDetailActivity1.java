package sg.edu.rp.c346.id22026882.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity1 extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail1);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int year = intentReceived.getIntExtra("year", 0);
        int sem = intentReceived.getIntExtra("semester", 0);
        double credit = intentReceived.getDoubleExtra("credit", 0);
        String venue = intentReceived.getStringExtra("venue");

        tvCode.setText("Module Code: " + code);
        tvName.setText("Module Name: " + name);
        tvYear.setText("Academic Year: " + year);
        tvSem.setText("Semester: " + sem);
        tvCredit.setText("Module Credit: " + credit);
        tvVenue.setText("Venue: " + venue);

    }
}