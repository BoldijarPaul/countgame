package com.bolnizar.countgame;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PartFragment extends Fragment {

    private int mColor;
    private static int A = 0;

    public PartFragment() {
        mColor = A % 2 == 0 ? Color.RED : Color.BLUE;
        A++;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_part, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View root = view.findViewById(R.id.part_root);
        root.setBackgroundColor(mColor);
    }
}
