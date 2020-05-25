package com.p683ss.android.ugc.aweme.web;

import android.os.ResultReceiver;

/* renamed from: com.ss.android.ugc.aweme.web.IJsCallback */
public interface IJsCallback<T> {
    T get();

    ResultReceiver getResultReceiver();
}
