package com.example.frag.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.frag.R;
import com.example.frag.adapter.PhotoAdapter;
import com.example.frag.adapter.PlaceAdapter;
import com.example.frag.adapter.TourAdapter;
import com.example.frag.adapter.TrendAdapter;
import com.example.frag.model.Photo;
import com.example.frag.model.PlaceModel;
import com.example.frag.model.TourModel;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<PlaceModel> arrayList;
    private RecyclerView view1, view2;
    private TrendAdapter adapter;

    private ArrayList<TourModel> arrayList2;
    private TourAdapter adapter2;

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private PhotoAdapter photoAdapter;



    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initValue1();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        view1 = view.findViewById(R.id.view1);
        view1.setLayoutManager(linearLayoutManager);

        /*view1 = view.findViewById(R.id.view1);
        view1.setLayoutManager(new LinearLayoutManager(getContext()));
        view1.hasFixedSize();*/
        PlaceAdapter adapter = new PlaceAdapter(getContext(),arrayList);
        view1.setAdapter(adapter);



        //Slider
        viewPager = view.findViewById(R.id.viewPager);
        circleIndicator = view.findViewById(R.id.circle_indicator);

        photoAdapter = new PhotoAdapter(getContext(), getListPhoto());
        viewPager.setAdapter(photoAdapter);

        circleIndicator.setViewPager(viewPager);
        photoAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

    }
    private List<Photo> getListPhoto(){
        List<Photo> list = new ArrayList<>();

        list.add(new Photo(R.drawable.img_1));
        list.add(new Photo(R.drawable.img_5));
        list.add(new Photo(R.drawable.img_2));
        list.add(new Photo(R.drawable.img_3));
        list.add(new Photo(R.drawable.img_8));

        return list;

    }


    private void initValue1() {
        arrayList = new ArrayList<>();

        arrayList.add(new PlaceModel("Quảng Ninh", R.drawable.img));
        arrayList.add(new PlaceModel("Ninh Bình", R.drawable.img_10));
        arrayList.add(new PlaceModel("Quảng Bình", R.drawable.img_1));
        arrayList.add(new PlaceModel("Đà Nẵng", R.drawable.img_2));
        arrayList.add(new PlaceModel("Sa Pa", R.drawable.img_5));
        arrayList.add(new PlaceModel("Nha Trang", R.drawable.img_6));

    }


}