package br.com.app.t_games.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.app.t_games.Domain.Jogo;

import static br.com.app.t_games.R.drawable.jogo;

/**
 * Created by Fabiano on 31/03/2017.
 */

public class JogoListFragment extends ListFragment {

    List<Jogo> mJogos;
    ArrayAdapter<Jogo>mAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        mJogos = carregarJogos();

        mAdapter = new ArrayAdapter<Jogo>(getActivity(), android.R.layout.simple_list_item_1, mJogos);
        setListAdapter(mAdapter);
    }

    private List<Jogo> carregarJogos(){
        List<Jogo> jogos = new ArrayList<Jogo>();
        jogos.add(new Jogo("Grand Turismo", "PlayStation 4", 1, 4));
        jogos.add(new Jogo("Guitar hero", "X box", 1, 4));
        jogos.add(new Jogo("Streer Figther", "X Box One", 1, 4));
        jogos.add(new Jogo("Juiced 2", "PlayStation 3", 1, 4));
        jogos.add(new Jogo("Tekken", "X Box", 1, 4));
        jogos.add(new Jogo("Qualquer", "Nintendo", 1, 4));
        return jogos;
    }

    @Override
    public void  onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);

        Activity activity = getActivity();
        if(activity instanceof  AoClicarNoJogo){
            Jogo jogo = (Jogo)l.getItemAtPosition(position);
            AoClicarNoJogo listener = (AoClicarNoJogo)activity;
            listener.clicouNoJogo(jogo);
        }
    }

    public interface AoClicarNoJogo{
        void clicouNoJogo(Jogo jogo);
    }
}
