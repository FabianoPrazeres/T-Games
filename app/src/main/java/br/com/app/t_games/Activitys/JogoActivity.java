package br.com.app.t_games.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import br.com.app.t_games.Domain.Jogo;
import br.com.app.t_games.Fragment.JogoDetalheFragment;
import br.com.app.t_games.Fragment.JogoListFragment;
import br.com.app.t_games.R;


/**
 * Created by Fabiano on 01/04/2017.
 */

public class JogoActivity extends AppCompatActivity  {

    public static final String EXTRA_JOGO = "jogo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_detalhe);

        if(savedInstanceState == null){
            Intent intent = getIntent();
            Jogo jogo = (Jogo)intent.getSerializableExtra(EXTRA_JOGO);
            JogoDetalheFragment fragment = JogoDetalheFragment.novaInstancia(jogo);
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.detalhe, fragment, JogoDetalheFragment.TAG_DETALHE);
            ft.commit();
        }
    }
}
