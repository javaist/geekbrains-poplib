package ru.xsd.javaist.geekbrains.poplibl1.plain.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.xsd.javaist.geekbrains.poplibl1.R;
import ru.xsd.javaist.geekbrains.poplibl1.plain.presenter.PlainPresenter;

public class PlainActivity extends AppCompatActivity implements PlainView {
    private EditText editText;
    private TextView textView;
    private PlainPresenter plainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        plainPresenter = new PlainPresenter();
    }

    @Override
    public void setTextViewText(String string) {
        textView.setText(string);
    }

    @Override
    public String getEditTextValue() {
        return String.valueOf(editText.getText());
    }

    public void onButtonClick(View view) {
        setTextViewText(plainPresenter.onButtonClick(getEditTextValue()));
    }
}
