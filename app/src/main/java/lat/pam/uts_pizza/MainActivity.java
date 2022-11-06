package lat.pam.uts_pizza;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.HeaderViewListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.android.twoactivities.extra.MESSAGE2";
    private EditText mMessageEditText;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_name);

        spinner = findViewById(R.id.spinner_store);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.store, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(adapter);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String messageSpinner = spinner.getSelectedItem().toString();
        String message = mMessageEditText.getText().toString();
        intent.putExtra("storelocation", messageSpinner);
        intent.putExtra("username", message);
        startActivity(intent);
    }

}