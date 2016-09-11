package com.sample.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sample.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final String DEFAULT_FIRST_NAME = "Ayumi";
    private final String DEFAULT_LAST_NAME = "Chida";
    private final int DEFAULT_AGE = 27;

    private User mUser;
    private UserBaseObservable mUserBaseObservable;
    private UserObservableField mUserObservableField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);

        mUser = new User(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_AGE);
        binding.setUser(mUser);


        mUserBaseObservable = new UserBaseObservable(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_AGE);
        binding.setUserBaseObservable(mUserBaseObservable);

        mUserObservableField = new UserObservableField(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_AGE);
        binding.setUserObservableField(mUserObservableField);
    }

    public void onButtonClick(View v) {
        Toast.makeText(v.getContext(), "clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onChangeButtonClick(View v) {
        mUser.setFirstName("Hiroyuki");
        mUser.setAge(20);

        mUserBaseObservable.setFirstName("Mitsuhiro");
        mUserBaseObservable.setAge(56);

        mUserObservableField.setFirstName("Mitsuo");
        mUserObservableField.setAge(85);
    }

    public void onResetButtonClick(View v) {
        mUser.setFirstName(DEFAULT_FIRST_NAME);
        mUser.setAge(DEFAULT_AGE);

        mUserBaseObservable.setFirstName(DEFAULT_FIRST_NAME);
        mUserBaseObservable.setAge(DEFAULT_AGE);

        mUserObservableField.setFirstName(DEFAULT_FIRST_NAME);
        mUserObservableField.setAge(DEFAULT_AGE);
    }
}
