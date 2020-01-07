package com.example.handymama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class View3 extends Fragment {
    ArrayList<View3Data> view3Data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view3, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView3);

        view3Data = new ArrayList<>();

        view3Data.add(new View3Data(R.drawable.cleaningservice,"Cleaning Service"));
        view3Data.add(new View3Data(R.drawable.paintingservice,"Painting Service"));
        view3Data.add(new View3Data(R.drawable.packandshift,"Pack and Shift"));
        view3Data.add(new View3Data(R.drawable.plumbingservice,"Plumbing Service"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        View3Adapter objAdapter = new View3Adapter(view3Data);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(objAdapter);

        return view;
    }
}
