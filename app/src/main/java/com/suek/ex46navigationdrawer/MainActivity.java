package com.suek.ex46navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout= findViewById(R.id.layout_drawer);
        navigationView= findViewById(R.id.nav);
        //기본 item 의 icon 에 색조를 적용하지 않음(기본 회색 색조)
        navigationView.setItemIconTintList(null);

        //네비뷰의 메뉴 항목을 클릭했을 때 반응하기!!
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();
                switch (id){
                    case R.id.menu_gallery:
                        Toast.makeText(MainActivity.this, "Gallery", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_send:
                        Toast.makeText(MainActivity.this, "Send", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.aa:
                        Toast.makeText(MainActivity.this, "aa", Toast.LENGTH_SHORT).show();
                        break;
                    case  R.id.bb:
                        Toast.makeText(MainActivity.this, "bb", Toast.LENGTH_SHORT).show();
                        break;
                }//switch


                //switch 문 끝나고 Drawer 을 닫기!!
                drawerLayout.closeDrawer(navigationView);


                return false;
            }
        });
    }



    //헤더아이콘 클릭시
    public  void clickHeaderIcon(View v){
        //헤더아이콘 변경작업..
        Toast.makeText(this, "click on Header Icon", Toast.LENGTH_SHORT).show();
    }
}
