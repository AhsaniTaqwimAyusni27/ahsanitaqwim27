package id.ac.id.uinsuska.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recylerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("John wick","john.wick@email.com",R.drawable.download));
        items.add(new Item("Topik Mulet","topik.h@email.com",R.drawable.ic_launcher_foreground));
        items.add(new Item("Irpan Brewok","ipan.u@email.com",R.drawable.download));
        items.add(new Item("Ragil Gemoy","ragil.h@email.com",R.drawable.ic_launcher_background));
        items.add(new Item("Ajo Gemoy","ajo.k@email.com",R.drawable.download));
        items.add(new Item("Fayat Imut","fayat.k@email.com",R.drawable.download));
        items.add(new Item("Wahyu Ba","wahyu.k@email.com",R.drawable.download));
        items.add(new Item("Supermen js","Supermen.k@email.com",R.drawable.download));
        items.add(new Item("Utramen k","utramen.k@email.com",R.drawable.download));
        items.add(new Item("spidermen Ba","spidermen.k@email.com",R.drawable.download));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}