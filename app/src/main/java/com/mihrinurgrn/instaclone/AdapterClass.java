package com.mihrinurgrn.instaclone;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterClass extends ArrayAdapter {
    private final ArrayList<String> username;
    private final ArrayList<String> userComment;
    private final ArrayList<Bitmap> userImage;
    private final Activity context;

    public AdapterClass(ArrayList<String> username,ArrayList<String> userComment,ArrayList<Bitmap> userImage,Activity context)
    {
        super(context,R.layout.custom_view,username);
        this.username=username;
        this.userComment=userComment;
        this.userImage=userImage;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View customView=layoutInflater.inflate(R.layout.custom_view,null,true);
        TextView usernameText=customView.findViewById(R.id.custom_view_username_text);
        TextView commentText=customView.findViewById(R.id.custom_view_comment_text);
        ImageView imageView=customView.findViewById(R.id.custom_view_image_view);


        usernameText.setText(username.get(position));
        imageView.setImageBitmap(userImage.get(position));
        commentText.setText(userComment.get(position));
        return customView;
    }
}
