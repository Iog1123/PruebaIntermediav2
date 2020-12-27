package com.example.pruebaintermedia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pruebaintermedia.databinding.FragmentMessageBinding;


public class MessageFragment extends Fragment {
    private FragmentMessageBinding messageBinding;


    public MessageFragment() {
        // Required empty public constructor




    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        messageBinding=FragmentMessageBinding.inflate(inflater,container,false
        );
        return messageBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        messageBinding.contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageBinding.contactButton.setVisibility(View.INVISIBLE);
                messageBinding.messageEditTXT.setVisibility(View.VISIBLE);
                messageBinding.buttonEnviar.setVisibility(View.VISIBLE);
                messageBinding.HitTEXT.setVisibility(View.VISIBLE);
            }
        });
    }
}