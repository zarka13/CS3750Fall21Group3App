package CS3750.Fall21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> OrderList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Image Button 1 onClickListener
        ImageButton img_btn_1 = findViewById(R.id.order_item_1);
        img_btn_1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.add("Burger");
            }
        });

        //Image Button 2 onClickListener
        ImageButton img_btn_2 = findViewById(R.id.order_item_2);
        img_btn_2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.add("Shake");
            }
        });

        //Image Button 3 onClickListener
        ImageButton img_btn_3 = findViewById(R.id.order_item_3);
        img_btn_3.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.add("Fries");
            }
        });

        //Image Button 4 onClickListener
        ImageButton img_btn_4 = findViewById(R.id.order_item_4);
        img_btn_4.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.add("Pop");
            }
        });

        //Image Button "show order list" onClickListener
        ImageButton show_order = findViewById(R.id.show_order_list);
        show_order.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                //Do something in response to button press
                MultiAutoCompleteTextView cust_order_txt =
                                findViewById(R.id.show_cust_order_txt);
                String s = "";
                int i = 0;
                if (OrderList.isEmpty()) {
                    cust_order_txt.setTextColor(getResources().getColor(R.color.red));
                    cust_order_txt.setText("There isn't an item ordered yet!");
                }
                else if (!(OrderList.isEmpty())) {
                    while (OrderList.size() > i) {
                        s += OrderList.get(i) + "\n";
                        i++;
                    }
                    cust_order_txt.setTextColor(getResources().getColor(R.color.black));
                    cust_order_txt.setText(s);
                }
            }
        });

    }
}