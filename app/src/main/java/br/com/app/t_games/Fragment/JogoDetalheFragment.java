package br.com.app.t_games.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import br.com.app.t_games.Domain.Jogo;
import br.com.app.t_games.R;

/**
 * Created by Fabiano on 31/03/2017.
 */

public class JogoDetalheFragment extends Fragment {

    public static final String TAG_DETALHE = "tagDetalhe";
    private static final String EXTRA_JOGO = "jogo";

    TextView mTextNomeJogo;
    TextView mTextNomeConsole;
    RatingBar mRating;
    ImageView mCapa;

    Jogo mJogo;

    public static  JogoDetalheFragment novaInstancia(Jogo jogo){
        Bundle parametros = new Bundle();
        parametros.putSerializable(EXTRA_JOGO, jogo);

        JogoDetalheFragment fragment = new JogoDetalheFragment();
        fragment.setArguments(parametros);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mJogo = (Jogo)getArguments().getSerializable(EXTRA_JOGO);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View layout = inflater.inflate(R.layout.fragment_detalhe_jogo, container, false);

        mTextNomeJogo = (TextView)layout.findViewById(R.id.txtNomeJogo);
        mTextNomeConsole = (TextView)layout.findViewById(R.id.txtNomeConsole);
        mRating = (RatingBar)layout.findViewById(R.id.rtbRating);
        mCapa = (ImageView)layout.findViewById(R.id.appBarImg);

        if(mJogo != null){
            mTextNomeJogo.setText(mJogo.mNomeJogo);
            mTextNomeConsole.setText(mJogo.mNomeConsole);
            mRating.setRating(mJogo.mRating);
        }
        return layout;
    }
}
