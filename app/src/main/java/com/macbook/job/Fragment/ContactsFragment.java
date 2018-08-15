package com.macbook.job.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.macbook.job.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }
    public static Fragment newInstance(String text ) {
        Fragment frag = new ContactsFragment();
        Bundle args = new Bundle();
        //  args.putString(ARG_TEXT, text);
        //  args.putInt(ARG_COLOR, color);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

}
