package vn.edu.ntu.huynhnhatthanh_59132265;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView thanh1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate called");
        Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();

        thanh1 = findViewById(R.id.thanh);
        SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
        String thoigian = simple.format(new Date());
        thanh1.setText(thoigian);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart called");
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume called");
        Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();
        thanh1 = findViewById(R.id.thanh);
        SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
        String thoigian = simple.format(new Date());
        thanh1.setText(thoigian);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause called");
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop called");
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();

    }
}
