package ru.xsd.javaist.geekbrains.poplibl1.plain.presenter;

import ru.xsd.javaist.geekbrains.poplibl1.plain.model.PlainModel;
import ru.xsd.javaist.geekbrains.poplibl1.plain.view.PlainView;

public class PlainPresenter {
    private PlainModel plainModel;

    public PlainPresenter(){
        plainModel = new PlainModel();
    }

    private String concatStrings(String base, String addition) {
        return base + addition;
    }

    public String onButtonClick(String addition) {
        String newString = concatStrings(plainModel.getString(), addition);
        plainModel.setString(newString);
        return newString;
    }
}
