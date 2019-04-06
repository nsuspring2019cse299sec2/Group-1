package com.example.sakibmahmud.project_code.Profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sakibmahmud.project_code.R;
import com.example.sakibmahmud.project_code.Utils.UniversalImageLoader;
import com.nostra13.universalimageloader.core.ImageLoader;

public class EditProfileFragment extends Fragment {

    private static final String TAG = "EditProfileFragment";

    private ImageView mProfilePhoto;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editprofile, container, false);
        mProfilePhoto = (ImageView) view.findViewById(R.id.profile_photo);

        setProfileImage();

        //back arrow for navigating back to "Proflie Activity"
        ImageView backArrow = (ImageView) view.findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating back to ProfileActivity");
                getActivity().finish();
            }
        });

        return view;
    }

    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image.");
        String imgURL = "https://scontent.fdac18-1.fna.fbcdn.net/v/t1.0-9/52333457_2399136860109931_3149409594426523648_n.jpg?_nc_cat=102&_nc_ht=scontent.fdac18-1.fna&oh=5f18efaacad82c519894278b082b1da9&oe=5D43B4FE";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto, null, "");
    }
}
