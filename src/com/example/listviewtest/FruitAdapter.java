package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<Fruit> {
	private int resourceid;
	
	public FruitAdapter(Context context,int textViewResourceId,List<Fruit> objects){
		super(context,textViewResourceId,objects);
		resourceid = textViewResourceId;
	}
	
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		Fruit fruit = getItem(position);
		View view;
		ViewHolder viewholder;
		if(convertView==null){
			view=LayoutInflater.from(getContext()).inflate(resourceid,null);
			viewholder=new ViewHolder();
			viewholder.fruitimage=(ImageView) view.findViewById(R.id.fruit_image);
			viewholder.fruitname=(TextView) view.findViewById(R.id.fruit_name);
			view.setTag(viewholder);
		}else{
			view=convertView;
			viewholder=(ViewHolder) view.getTag();
		}
	
		viewholder.fruitimage.setImageResource(fruit.getImageId());
		viewholder.fruitname.setText(fruit.getName());
		return view;
		
	}
	class ViewHolder{
		ImageView fruitimage;
		TextView fruitname;
	}

}
