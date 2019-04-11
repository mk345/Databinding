package com.mk.test.databinding2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Item extends BaseObservable {

    String name;
    String quantity;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
        notifyPropertyChanged(BR.quantity);
    }
}
