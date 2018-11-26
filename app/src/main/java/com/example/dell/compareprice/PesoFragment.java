package com.example.dell.compareprice;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class PesoFragment extends Fragment {


    public PesoFragment() {
        // Required empty public constructor

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_peso, container, false);

        view.findViewById(R.id.button_peso_resultado).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextInputEditText valorDoProduto1 = getActivity().findViewById(R.id.valor1_editText);
                TextInputEditText valorDoProduto2 = getActivity().findViewById(R.id.valor2_editText);
                TextInputEditText quantidadeProduto1 = getActivity().findViewById(R.id.quantidade1_editText);
                TextInputEditText quantidadeProduto2 = getActivity().findViewById(R.id.quantidade2_editText);

                Float floatValor1 = Float.parseFloat(valorDoProduto1.getText().toString());
                Float floatValor2 = Float.parseFloat(valorDoProduto2.getText().toString());
                Float floatQuantidade1 = Float.parseFloat(quantidadeProduto1.getText().toString());
                Float floatQuantidade2 = Float.parseFloat(quantidadeProduto2.getText().toString());

                Float resultadoProduto1 = floatQuantidade1/floatValor1;
                Float resultadoProduto2 = floatQuantidade2/floatValor2;
                Float resultadoEmPorcenagem1= resultadoProduto1/resultadoProduto2*100-100;
                Float resultadoEmPorcenagem2= resultadoProduto2/resultadoProduto1*100-100;

                if(resultadoProduto1>resultadoProduto2){
                    DecimalFormat dc = new DecimalFormat("0.0");
                    Toast.makeText(getView().getContext(), "Produto 1 está: " + dc.format(resultadoEmPorcenagem1) + "% MAIS BARATO que o Produto 2." , Toast.LENGTH_LONG).show();
                } else {
                    DecimalFormat dc = new DecimalFormat("0.0");
                    Toast.makeText(getView().getContext(), "Produto 2 está: " + dc.format(resultadoEmPorcenagem2) + "% MAIS BARATO que o Produto 1.", Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;

    }
}