package striker.gravitas_android.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import striker.gravitas_android.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutTeamFragment extends Fragment {


    public AboutTeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_team, container, false);
    }

}