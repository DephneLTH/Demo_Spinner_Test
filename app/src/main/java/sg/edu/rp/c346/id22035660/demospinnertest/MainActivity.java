package sg.edu.rp.c346.id22035660.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spnYesNo;
    TextView tvSpn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        tvSpn = findViewById(R.id.textView);

        spnYesNo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        tvSpn.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        tvSpn.setText("Spinner Item, No Selected");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){
                
            }
        });
    }
}