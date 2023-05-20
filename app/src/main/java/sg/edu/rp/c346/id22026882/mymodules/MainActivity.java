package sg.edu.rp.c346.id22026882.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346mod;
    TextView c227mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346mod = findViewById(R.id.textViewC346);
        c227mod = findViewById(R.id.textViewC227);

        c346mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity1.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2023);
                intent.putExtra("semester", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E63A");
                startActivity(intent);

            }
        });

        c227mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity2.class);
                intent.putExtra("code", "C227");
                intent.putExtra("name", "Computer System Technologies");
                intent.putExtra("year", 2023);
                intent.putExtra("semester", 2);
                intent.putExtra("credit", 2.5);
                intent.putExtra("venue", "E63B");
                startActivity(intent);

            }
        });

    }
}