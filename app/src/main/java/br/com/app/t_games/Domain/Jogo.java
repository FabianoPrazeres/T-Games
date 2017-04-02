package br.com.app.t_games.Domain;

import android.content.Context;

import org.parceler.Parcel;

import java.io.Serializable;

/**
 * Created by Fabiano on 31/03/2017.
 */

public class Jogo implements Serializable{

    public String mNomeJogo;
    public String mNomeConsole;
    int mCapa;
    public float mRating;

    public Jogo(String mNomeJogo, String mNomeConsole, int mCapa, float mRating){
        this.mNomeJogo = mNomeJogo;
        this.mNomeConsole = mNomeConsole;
        this.mCapa = mCapa;
        this.mRating = mRating;
    }

    @Override
    public String toString(){
        return mNomeJogo;
    }
}
