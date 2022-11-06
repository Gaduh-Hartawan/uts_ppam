package lat.pam.uts_pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String messageSpinner = intent.getStringExtra("storelocation");
        String message = intent.getStringExtra("username");
        TextView textView = findViewById(R.id.text_location);
        TextView textUser = findViewById(R.id.username2);
        textUser.setText(textUser.getText() + message);
        textView.setText(messageSpinner);
    }

    public void launchThirdActivity(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}