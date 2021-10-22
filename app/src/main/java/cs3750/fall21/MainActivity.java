package cs3750.fall21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;
import cs3750.fall21.Order;

public class MainActivity extends AppCompatActivity {
Order OrderList = new Order();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Image Button 1 onClickListener
        ImageButton img_btn_1 = findViewById(R.id.order_item_1);
        img_btn_1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.addItem("Burger");
                updateText();
            }
        });

        //Image Button 2 onClickListener
        ImageButton img_btn_2 = findViewById(R.id.order_item_2);
        img_btn_2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.addItem("Shake");
                updateText();
            }
        });

        //Image Button 3 onClickListener
        ImageButton img_btn_3 = findViewById(R.id.order_item_3);
        img_btn_3.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.addItem("Fries");
                updateText();
            }
        });

        //Image Button 4 onClickListener
        ImageButton img_btn_4 = findViewById(R.id.order_item_4);
        img_btn_4.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v){
                //Do something in response to button click
                OrderList.addItem("Pop");
                updateText();
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
                if (OrderList.orderSize() == 0) {
                    cust_order_txt.setTextColor(getResources().getColor(R.color.red));
                    cust_order_txt.setText("There isn't an item ordered yet!");
                }
                else if (OrderList.orderSize() > 0) {
                    s += "Order Sent: \n";

                    while (OrderList.orderSize() > i) {
                        s += OrderList.getItem(i) + "\n";
                        i++;
                    }
                    cust_order_txt.setTextColor(getResources().getColor(R.color.black));
                    cust_order_txt.setText(s);
                }
            }
        });



    }

    // Should make it so now any button press will update the list of items
    private void updateText() {
        //Do something in response to button press
        MultiAutoCompleteTextView cust_order_txt =
                findViewById(R.id.show_cust_order_txt);
        String s = "";
        int i = 0;
        if (OrderList.orderSize() > 0) {
            while (OrderList.orderSize() > i) {
                s += OrderList.getItem(i) + "\n";
                i++;
            }
            cust_order_txt.setTextColor(getResources().getColor(R.color.black));
            cust_order_txt.setText(s);
        }
    }
}