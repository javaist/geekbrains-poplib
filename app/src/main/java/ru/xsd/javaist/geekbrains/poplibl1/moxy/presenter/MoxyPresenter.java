package ru.xsd.javaist.geekbrains.poplibl1.moxy.presenter;


import android.util.Log;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.xsd.javaist.geekbrains.poplibl1.moxy.model.MoxyModel;
import ru.xsd.javaist.geekbrains.poplibl1.moxy.view.MoxyView;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyView> {
    private MoxyModel moxyModel;

    public MoxyPresenter(){
        this.moxyModel = new MoxyModel();
    }

    private String concatStrings(String base, String add) {
        return base + add;
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public void onButtonClick(String addition) {
        String newString = concatStrings(moxyModel.getString(), addition);
        moxyModel.setString(newString);
        getViewState().setTextViewText(newString);
    }
}
