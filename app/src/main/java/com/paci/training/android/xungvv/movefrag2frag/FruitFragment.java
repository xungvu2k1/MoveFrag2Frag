package com.paci.training.android.xungvv.movefrag2frag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FruitFragment extends Fragment {
    TextView moveToDetail;
    public FruitFragment() {
        // Required empty public constructor
    }
    public static FruitFragment newInstance(String param1, String param2) {
        FruitFragment fragment = new FruitFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fruit, container, false);
        moveToDetail = view.findViewById(R.id.tv_detail_most_popular_fruits);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        moveToDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailFragment detailFragment = new DetailFragment() ;
                Bundle bundle = new Bundle();
                User user = new User("xung", 20);
                bundle.putSerializable("object_key", user);
                detailFragment.setArguments(bundle);

                getFragmentManager().beginTransaction()
                        .replace(R.id.detail_frag_container, detailFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}