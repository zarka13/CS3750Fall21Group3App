package CS3750.Fall21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> OrderList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.Button btn_order_1 = (android.widget.Button) findViewById(R.id.order_1);
        btn_order_1.setOnClickListener (new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                //Do something in response to button click
                OrderList.add(btn_order_1.getText().toString());
            }
        });
    }
}

/* --Create Activity to start after button click
button.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View v) {
    Intent intent = new Intent(this, YourActivityName.class);
    startActivity(intent);
}
});
 */