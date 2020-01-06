package com.vk.simplebindserviceexample;

import java.util.Random;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ProductService extends Service {


    class MyBinder extends Binder {

        public ProductService getService(){
            return ProductService.this;
        }

    }

    public int randomGenerator() {

        Random randomNumber = new Random();

        int luckyNumber = randomNumber.nextInt();

        return luckyNumber;

    }

    private IBinder mBinder = new MyBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
