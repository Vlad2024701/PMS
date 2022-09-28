package vladix.sim.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import vladix.sim.lab1.text.TextFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            Log.d("MainActivity", " i =" + i);
        }

        displayText();
    }

    private void displayText() {
        TextFunction textFunction = new TextFunction();
        TextView textView = findViewById(R.id.newest);
        textView.setText(textFunction.getValue());
    }
}