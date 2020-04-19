package ru.xsd.javaist.geekbrains.poplibl1.moxy.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;
import ru.xsd.javaist.geekbrains.poplibl1.R;
import ru.xsd.javaist.geekbrains.poplibl1.moxy.presenter.MoxyPresenter;


public class MoxyActivity extends MvpAppCompatActivity implements MoxyView {
    private EditText editText;
    private TextView textView;

    @InjectPresenter
    MoxyPresenter moxyPresenter;

    @ProvidePresenter
    public MoxyPresenter moxyPresenter() {
        return new MoxyPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }

    @Override
    public void setTextViewText(String string) {
        Log.d("MoxyActivity", "setTextView: " + string);
        textView.setText(string);
    }


    public String getEditTextValue() {
        return String.valueOf(editText.getText());
    }

    public void onButtonClick(View view) {
        moxyPresenter.onButtonClick(getEditTextValue());
    }
}
