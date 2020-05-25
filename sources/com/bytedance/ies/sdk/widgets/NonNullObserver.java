package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0199s;

public interface NonNullObserver<T> extends C0199s<T> {
    void onChanged(T t);
}
