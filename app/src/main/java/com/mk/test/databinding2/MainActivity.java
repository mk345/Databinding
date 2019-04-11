package com.mk.test.databinding2;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mk.test.databinding2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    private Item item;
    private ClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        item = new Item();
        item.setName("Item #1");
        item.setQuantity("4");

        binding.setItem(item);

        handlers = new ClickHandlers(this);
        binding.setHandlers(handlers);
    }

    public class ClickHandlers {

        Context context;

        public ClickHandlers(Context context) {
            this.context = context;
        }

        public void onButtonClick(View view) {
            Log.e("MKTEST", "clicked");
            item.setQuantity("7");
        }
    }
}
