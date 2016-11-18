package me.linxq.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_app_1).setOnClickListener(this);
        findViewById(R.id.btn_app_2).setOnClickListener(this);
        findViewById(R.id.btn_app_3).setOnClickListener(this);
        findViewById(R.id.btn_app_4).setOnClickListener(this);
        findViewById(R.id.btn_app_5).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        vs1:
//        switch (view.getId()){
//            case R.id.btn_app_1:
//                Toast.makeText(this,"启动应用：热门电影", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn_app_2:
//                Toast.makeText(this,"启动应用：股票雄鹰", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn_app_3:
//                Toast.makeText(this,"启动应用：XYZ阅读器", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn_app_4:
//                Toast.makeText(this,"启动应用：最新闻", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn_app_5:
//                Toast.makeText(this,"启动应用：毕业设计", Toast.LENGTH_SHORT).show();
//                break;
//        }

//      vs2:
        Button button = (Button)view;
        String appName = button.getText().toString();
        Toast.makeText(this, "启动应用：" + appName, Toast.LENGTH_SHORT).show();
    }
}
