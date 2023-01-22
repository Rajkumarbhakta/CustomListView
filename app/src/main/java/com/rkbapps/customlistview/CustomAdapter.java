package com.rkbapps.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends ArrayAdapter<ModelClass> {

    List<ModelClass> modelClassList = new ArrayList<>();
    Context context;

    //making the constructor
    CustomAdapter(List<ModelClass> modelClassList, Context context) {
        super(context, R.layout.my_list_items, modelClassList);
        this.modelClassList = modelClassList;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        final View view;

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list_items, parent, false);
            //find the views
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.txtPersonName);
            viewHolder.txtPhNumber = (TextView) convertView.findViewById(R.id.txtPhoneNumber);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            view = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;
        }

        //set data to view from the model class list
        viewHolder.txtName.setText(modelClassList.get(position).getName());
        viewHolder.txtPhNumber.setText(modelClassList.get(position).getPhoneNumber());
        viewHolder.imageView.setImageResource(modelClassList.get(position).getImage());

        return view;
    }


    //viewHolder class
    public class ViewHolder {
        TextView txtName;
        TextView txtPhNumber;
        ImageView imageView;
    }
}
