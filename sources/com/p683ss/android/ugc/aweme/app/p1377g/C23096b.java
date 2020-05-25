package com.p683ss.android.ugc.aweme.app.p1377g;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;

/* renamed from: com.ss.android.ugc.aweme.app.g.b */
public final class C23096b extends HandlerThread {

    /* renamed from: a */
    public Handler f61501a;

    /* renamed from: b */
    private Callback f61502b;

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        this.f61501a = new Handler(getLooper(), this.f61502b);
    }
}
