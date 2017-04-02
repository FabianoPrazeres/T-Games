package br.com.app.t_games.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Spinner;
import android.widget.TextView;

import br.com.app.t_games.Domain.Jogo;
import br.com.app.t_games.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Fabiano on 01/04/2017.
 */

public class JogoDialogFragment extends DialogFragment {

    private static final String DIALOG_TAG = "editDialog";
    private static final String EXTRA_JOGO = "jogo";

    private Spinner spnMeuJogo;
    private Spinner spnPrimeiraEscolha;
    private Spinner spnSegundaEscolha;
    private Spinner spnTerceiraEscolha;
    private Jogo mJogo;

    public static  JogoDialogFragment newInstance(Jogo jogo){
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_JOGO, jogo);
        JogoDialogFragment dialog = new JogoDialogFragment();
        dialog.setArguments(bundle);
        return dialog;
    }

    @Override
    public void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        mJogo = (Jogo)getArguments().getSerializable(EXTRA_JOGO);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View layout = inflater.inflate(R.layout.fragment_dialog_jogo, container, false);
        spnMeuJogo = (Spinner)layout.findViewById(R.id.spnMeuJogo);
        spnPrimeiraEscolha = (Spinner)layout.findViewById(R.id.spnPrimeira);
        spnSegundaEscolha = (Spinner)layout.findViewById(R.id.spnSegunda);
        spnTerceiraEscolha = (Spinner)layout.findViewById(R.id.spnTerceira);

        getDialog().setTitle("Novo Jogo");
        return layout;
    }
    public void abrir(FragmentManager fm){
        if(fm.findFragmentByTag(DIALOG_TAG)==null);{
            show(fm, DIALOG_TAG);
        }
    }


}
