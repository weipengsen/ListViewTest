package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity {
	
//	private String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
//			"Melon","Tomato","Potato"};
	private List<Fruit> fruitlist = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitlist);
        ListView listview = (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new OnItemClickListener(){
        	@Override
        	public void onItemClick(AdapterView<?> parent,View view,int position,long id){
        		Fruit fruit=fruitlist.get(position);
        		Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
        	}
        });
    }
    
    private void initFruits(){
    	Fruit apple=new Fruit("Apple",R.drawable.s110);
    	fruitlist.add(apple);
    	Fruit banana=new Fruit("Banana",R.drawable.s111);
    	fruitlist.add(banana);
    	Fruit orange=new Fruit("Orange",R.drawable.s112);
    	fruitlist.add(orange);
    	Fruit watermelon=new Fruit("Watermelon",R.drawable.s113);
    	fruitlist.add(watermelon);
    	Fruit pear=new Fruit("Peat",R.drawable.s114);
    	fruitlist.add(pear);
    	Fruit grape=new Fruit("Grape",R.drawable.s115);
    	fruitlist.add(grape);
    	Fruit pineapple=new Fruit("Pineapple",R.drawable.s116);
    	fruitlist.add(pineapple);
    	Fruit strawberry=new Fruit("Strawberry",R.drawable.s117);
    	fruitlist.add(strawberry);
    	Fruit cherry=new Fruit("Cherry",R.drawable.s118);
    	fruitlist.add(cherry);
    	Fruit mango=new Fruit("Mango",R.drawable.s119);
    	fruitlist.add(mango);
    }

}
