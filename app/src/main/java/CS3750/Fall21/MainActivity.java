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

        //Image Button 1 onClickListener
        android.widget.ImageButton img_btn_1 =
                (android.widget.ImageButton) findViewById(R.id.order_item_1);
        img_btn_1.setOnClickListener (new android.view.View.OnClickListener() {
            public void onClick(android.view.View v){
                //Do something in response to button click
                OrderList.add("Burger");
            }
        });

        //Image Button 2 onClickListener
        android.widget.ImageButton img_btn_2 =
                (android.widget.ImageButton) findViewById(R.id.order_item_2);
        img_btn_2.setOnClickListener (new android.view.View.OnClickListener() {
            public void onClick(android.view.View v){
                //Do something in response to button click
                OrderList.add("Shake");
            }
        });

        //Image Button 3 onClickListener
        android.widget.ImageButton img_btn_3 =
                (android.widget.ImageButton) findViewById(R.id.order_item_3);
        img_btn_3.setOnClickListener (new android.view.View.OnClickListener() {
            public void onClick(android.view.View v){
                //Do something in response to button click
                OrderList.add("Fries");
            }
        });

        //Image Button 4 onClickListener
        android.widget.ImageButton img_btn_4 =
                (android.widget.ImageButton) findViewById(R.id.order_item_4);
        img_btn_4.setOnClickListener (new android.view.View.OnClickListener() {
            public void onClick(android.view.View v){
                //Do something in response to button click
                OrderList.add("Pop");
            }
        });

        //Image Button "show order list" onClickListener
        android.widget.ImageButton show_order =
                (android.widget.ImageButton) findViewById(R.id.show_order_list);
        show_order.setOnClickListener (new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                //Do something in response to button press
                /*android.content.Intent intent =
                new android.content.Intent(this,
                ShowCustOrderActivity.class); //issue here with class name
                startActivity(intent);*/
                android.widget.MultiAutoCompleteTextView cust_order_txt =
                        (android.widget.MultiAutoCompleteTextView)
                                findViewById(R.id.show_cust_order_txt);
                String s = "";
                int i = 0;
                if (OrderList.isEmpty()) {
                    cust_order_txt.setTextColor(getResources().getColor(R.color.red));
                    cust_order_txt.setText("There isn't an item ordered yet!");
                }
                //Issue where after testing above check, once adding items to test again, below
                //code does not run, it just crashes..?
                else if (!(OrderList.isEmpty())) {
                    while (OrderList.size() > i) {
                        s += OrderList.get(i) + "%n";
                        i++;
                    }
                    cust_order_txt.setTextColor(getResources().getColor(R.color.black));
                    cust_order_txt.setText(s);
                }
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