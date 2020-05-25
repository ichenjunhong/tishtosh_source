package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.os.Handler;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.CommonLifeCycleObserver.C33325a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.AbsReadStateDelegate */
public abstract class AbsReadStateDelegate extends Handler implements CommonLifeCycleObserver {

    /* renamed from: a */
    public final C33449f f86381a;

    /* renamed from: a */
    public void mo70638a() {
    }

    /* renamed from: b */
    public void mo70639b() {
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        C33325a.onCreate(this);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C33325a.onDestroy(this);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        C33325a.onPause(this);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        C33325a.onResume(this);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
        C33325a.onStart(this);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        C33325a.onStop(this);
    }

    public AbsReadStateDelegate(C33449f fVar) {
        C52711k.m112240b(fVar, "dataCenter");
        this.f86381a = fVar;
    }
}
