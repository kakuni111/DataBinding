package com.sample.databinding;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Ayumi on 2016/09/10.
 */
public class UserObservableField {
    private ObservableField<String> firstName = new ObservableField<>();
    private ObservableField<String> lastName = new ObservableField<>();
    private ObservableInt age = new ObservableInt();

    public UserObservableField(String firstName, String lastName, int age) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.age.set(age);
    }

    public ObservableField<String> getFirstName() {
        return firstName;
    }

    public ObservableInt getAge() {
        return age;
    }

    public ObservableField<String> getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setAge(int age) {
        this.age.set(age);
    }
}