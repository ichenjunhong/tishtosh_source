package com.bytedance.lobby.internal;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;

public abstract class BaseViewModel<T> extends AndroidViewModel {

    /* renamed from: b */
    private C0198r<T> f32527b = new C0198r<>();

    /* renamed from: g */
    public LiveData<T> mo23341g() {
        return this.f32527b;
    }

    /* renamed from: b */
    public void mo23338b(T t) {
        this.f32527b.setValue(t);
    }

    BaseViewModel(Application application) {
        super(application);
    }
}
