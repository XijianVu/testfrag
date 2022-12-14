package com.example.frag.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.frag.R;
import com.example.frag.adapter.TrendAdapter;
import com.example.frag.model.ItemList;

import java.util.ArrayList;

public class TrendFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<ItemList> arrayList;
    private RecyclerView rvLista;
    private TrendAdapter adapter;

    public TrendFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TrendFragment newInstance(String param1, String param2) {
        TrendFragment fragment = new TrendFragment();
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
        return inflater.inflate(R.layout.fragment_trend, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initValue();

        rvLista = view.findViewById(R.id.rvLista);
        rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        rvLista.hasFixedSize();
        TrendAdapter adapter = new TrendAdapter(getContext(),arrayList);
        rvLista.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initValue() {
        arrayList = new ArrayList<>();

        arrayList.add(new ItemList("V???nh H??? Long", "V???nh H??? Long n???m thu???c b??? ph???n c???a v???nh B???c B???, ph??a ????ng B???c gi??p v???i v???nh B??i T??? Long, ph??a T??y Nam gi??p v???i qu???n ?????o C??t B??, ph??a T??y v?? T??y B???c gi??p v???i ?????t li???n, ph??a ????ng Nam v?? ph??a Nam h?????ng ra v???nh B???c B???. C???nh quan non n?????c ngo???n m???c tr??n V???nh ???????c ki???n t???o b???i h??n 1600 h??n ?????o ???? v??i l???n nh??? tr??n l??n n?????c xanh ng???c l???c b???o ?????c tr??ng c???a V???nh H??? Long. ????y c??ng l?? n??i ch???ng ki???n nh???ng thay ?????i trong l???ch s??? ph??t tri???n c???a Tr??i ?????t. C??c c???t ???? v??i ???????c bao ph??? b???i c??c h??ng c??y nhi???t ?????i xanh th???m, c??ng h??? th???ng hang, ?????ng ???? v??i k??? v??. V???nh H??? Long ???????c UNESCO c??ng nh???n l?? Di s???n Thi??n nhi??n Th??? gi???i l???n ?????u ti??n v??o n??m 1994 nh??? nh???ng gi?? tr??? c???nh quan t??? nhi??n ?????c ????o v?? quan tr???ng v??? m???t th???m m???. N??m 2000, V???nh H??? Long vinh d??? l???n th??? hai ???????c c??ng nh???n b???i nh???ng gi?? tr??? ?????a ch???t ?????a m???o ?????c tr??ng, qua qu?? tr??nh Tr??i ?????t ki???n t???o trong h??ng t??? n??m. Nhi???u du kh??ch kh??ng ng??? r???ng H??? Long l???i l?? m???t Di s???n mang gi?? tr??? l???n v???i nh??n lo???i ?????n v???y b???i s??? ??a d???ng sinh h???c, v??n h??a v?? l???ch s??? hi???m c??. Nh??? nh???ng gi?? tr??? ?????c ????o ????, V???nh H??? Long ???? tr??? th??nh ??i???m ?????n h???p d???n cho du kh??ch, n??i h??? c?? th??? ?????n g???n h??n v???i ?????t n?????c, con ng?????i Vi???t Nam s??i ?????ng, th?? v???.", R.drawable.img));
        arrayList.add(new ItemList("Ninh B??nh", "C??ch th??? ???? H?? N???i n??o nhi???t kh??ng xa nh??ng Ninh B??nh lu??n mang ?????n cho du kh??ch m???t c???m gi??c b??nh y??n v?? nh??? nh??ng ?????n k??? l???. M???t s??? ?????a ??i???m du l???ch n???i ti???ng t???i Ninh B??nh khi???n kh??ch du l???ch xi??u l??ng ch??nh l?? Tr??ng An, ch??a B??i ????nh, c??? ???? Hoa L?? hay Tam C???c, B??ch ?????ng???\n" +
                "\n" +
                "Khu du l???ch Tr??ng An ch??nh l?? ?????a ??i???m du l???ch n???i ti???ng nh???t c???a Ninh B??nh hi???n nay. V???i phong c???nh thi??n nhi??n hoang s?? tuy???t ?????p, Tr??ng An Ninh B??nh ???? ???????c Unesco c??ng nh???n l?? di s???n thi??n nhi??n v?? di s???n v??n h??a th??? gi???i.", R.drawable.img_10));
        arrayList.add(new ItemList("Phong Nha - K??? B??ng", "?????ng Phong Nha l?? danh th???ng ti??u bi???u nh???t c???a h??? th???ng hang ?????ng thu???c qu???n th??? danh th???ng Phong Nha ??? K??? B??ng. Phong Nha ???????c b??nh ch???n l?? m???t trong nh???ng hang ?????ng ?????p nh???t th??? gi???i v???i c??c ti??u ch??: S??ng ng???m d??i nh???t, H??? n?????c ng???m ?????p nh???t. C???a hang cao v?? r???ng nh???t, C??c b??i c??t, b??i ???? ng???m ?????p nh???t, Hang kh?? r???ng v?? ?????p nh???t, H??? th???ng th???ch nh?? k??? ???o v?? tr??ng l??? nh???t, Hang ?????ng n?????c d??i nh???t. ?????ng Phong Nha l?? m???t ??i???m ?????n ???????c nhi???u du kh??ch l???a ch???n trong chuy???n du l???ch Qu???ng B??nh.", R.drawable.img_1));
        arrayList.add(new ItemList("H???i An", "Nh???c ?????n du l???ch Vi???t Nam th?? H???i An l?? m???t c??i t??n kh??ng th??? kh??ng nh???c ?????n. H???i An mang d??ng d???p x??a c?? v???i n???p s???ng nh??? nh??ng ???????c nhi???u kh??ch du l???ch ch???n l???a. Hi???n t???i, du l???ch t???i H???i An r???t ph??t tri???n v???i ????ng ?????o kh??ch du l???ch trong v?? ngo??i n?????c ?????n h??ng n??m. ??? ????y c??ng c?? r???t nhi???u ?????a ??i???m ????? tham quan v?? ch???p ???nh.\n" +
                "\n" +
                "Ph??? c??? H???i An l?? m???t ph??? c??? n???m ven bi???n c???a t???nh mi???n Trung c??ch th??nh ph??? ???? N???ng 30km v??? ph??a Nam, thu???c t???nh Qu???ng nam Vi???t Nam. Ph??? c??? H???i An ??i???n h??nh cho m???t th????ng c???ng th??? tr?????ng s???m u???t, n??i n??y t???ng c?? d???u t??ch c???a th????ng c???ng ng?????i Ch??m, ???????c bi???t ?????n v???i con ???????ng t?? l???a n???i ti???ng. trong hai cu???c chi???n tranh l???n c???a vi???t Nam kh??ng b??? t??n ph?? n??i ????y ch??nh th???c tr??? th??nh n??i du l???ch h???p d???n ???????c nhi???u du kh??ch b???n ph????ng bi???t t???i.", R.drawable.img_4));
        arrayList.add(new ItemList("C???u V??ng - Ki???t t??c gi???a n??i r???ng", "L?? m???t trong nh???ng ?????a ??i???m du l???ch m???i v?? c??ng n???i ti???ng, C???u V??ng ???? N???ng tr??n B?? N?? Hills ???? khi???n d??n t??nh ph???i tr???m tr???, x???n xang b???i v??? ?????p k??? v??. T??? l???n ?????u xu???t hi???n C???u V??ng kh??ng ch??? t???o n??n c??n s???t trong n?????c m?? c??n g??y \"ch???n ?????ng\" kh???p th??? gi???i\n" + "\n" + "C???u V??ng thu???c khu du l???ch Sun World Ba Na Hills, sau 1 n??m thi???t k??? v?? 1 n??m thi c??ng, c??y c???u ch??nh th???c ???????c kh??nh th??nh v??o th??ng 6/2018. Gi???ng nh?? t??n g???i c???a m??nh, C???u V??ng c?? m???t m??u v??ng ?????c tr??ng l???p l??nh v?? n???i b???t gi???a thi??n nhi??n xanh m??t.", R.drawable.img_7));
        arrayList.add(new ItemList("Ch??? n???i C??i R??ng C???n Th??", "Ch??? n???i C??i R??ng l?? lo???i h??nh ch??? ?????c ????o v?? ?????c tr??ng c???a v??ng ?????ng b???ng s??ng C???u Long m?? kh??ng n??i n??o tr??n ?????t n?????c Vi???t Nam c?? ???????c. V?? ????y c??ng l?? khu ch??? ti??u bi???u, s???m u???t, n???i ti???ng nh???t cho n??t v??n h??a s??ng n?????c mi???n T??y. Ch??? n???i C??i R??ng C???n Th?? s??? mang ?????n nh???ng tr???i nghi???m c?? 1-0-2 cho b???n nh?? chi??m ng?????ng khung c???nh n??n th?? c???a ch??? n???i l??c b??nh minh, ng???i l??nh ????nh tr??n thuy???n h??a m??nh v??o kh??ng kh?? bu??n b??n t???p n???p s??ng s???m v?? th?????ng th???c t?? b??n ri??u ngay tr??n ghe thuy???n??? v?? c??ng tuy???t v???i. ", R.drawable.img_8));
    }


}