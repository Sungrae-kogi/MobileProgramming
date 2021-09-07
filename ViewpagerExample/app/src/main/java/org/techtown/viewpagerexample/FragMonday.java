package org.techtown.viewpagerexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragMonday extends Fragment {
    private View view;

    //newInstance 호출하면 Fragmonday를 그대로 다시 돌려주는역할
    public static FragMonday newInstance(){
        FragMonday fragMonday = new FragMonday();
        return fragMonday;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_monday,container,false);

        return view;
    }
}
