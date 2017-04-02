package br.com.app.t_games.Activitys;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.app.t_games.Domain.Jogo;
import br.com.app.t_games.Fragment.JogoDetalheFragment;
import br.com.app.t_games.Fragment.JogoListFragment;
import br.com.app.t_games.R;

public class MeusJogosActivity extends AppCompatActivity implements JogoListFragment.AoClicarNoJogo{

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_jogos);
    }
    @Override
    public void clicouNoJogo(Jogo jogo) {
        Intent it = new Intent(this, JogoActivity.class);
        it.putExtra(JogoActivity.EXTRA_JOGO, jogo);
        startActivity(it);
    }
}
