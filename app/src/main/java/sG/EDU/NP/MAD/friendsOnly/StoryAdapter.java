package sG.EDU.NP.MAD.friendsOnly;

import android.support.annotation.NonNull;
//import android.support.v7.widget.;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.koddev.instagram.R;
import java.util.List;

import com.google.firebase.database.core.Context;


public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.viewHolder>{

    private Context = mContext;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        public ImageView story_photo,story_plus, story_photo_seen;
        public TextView story_username, addstory_text;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            story_photo = itemView.findViewById(R.id.story_photo);
            story_plus = itemView.findViewById(R.id.story_plus);
            story_photo_seen = itemView.findViewById(R.id.story_photo_seen);
            story_username = itemView.findViewById(R.id.story_username);
            addstory_text = itemView.findViewById(R.id.addstory_text);
        }
    }
}
