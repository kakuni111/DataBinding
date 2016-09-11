package com.sample.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Ayumi on 2016/09/10.
 */
public class UserBaseObservable extends BaseObservable {
    private String firstName;
    private String lastName;
    private int age;

    public UserBaseObservable(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.sample.databinding.BR.firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.sample.databinding.BR.firstName);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.sample.databinding.BR.age);
    }

}