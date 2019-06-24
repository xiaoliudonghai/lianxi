package com.example.lianxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Hello World!
     */
    private TextView mTv;
    /**
     * 跳转
     */
    private Button mBt;
    /**
     * pop
     */
    private Button mPop;

    private Toolbar mToob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void initView() {
        mToob = (Toolbar) findViewById(R.id.toob);
        mBt = (Button) findViewById(R.id.bt);
        mBt.setOnClickListener(this);
        mPop = (Button) findViewById(R.id.pop);
        mPop.setOnClickListener(this);
        setSupportActionBar(mToob);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bt:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.pop:
                new AlertDialog.Builder(this)
                        .setMessage("你好")
                        .setTitle("adafd")
                        .setNegativeButton("1",null)
                        .setPositiveButton("2",null)
                        .show();
                break;
        }
    }
}
