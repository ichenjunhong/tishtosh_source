package com.bytedance.android.live.core.rxutils;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.LiveData;
import android.util.Pair;
import com.bytedance.android.live.core.rxutils.p239a.C3988b;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p094l.C2178a;

public class RxViewModel extends C0209x {

    /* renamed from: a */
    private final C1689b f11114a = new C1689b();

    /* renamed from: b */
    private final List<Pair<LiveData, C0199s>> f11115b = new ArrayList();

    /* renamed from: o */
    public final C2178a<C3988b> f11116o = C2178a.m6527l();

    public void onCleared() {
        this.f11114a.mo6180a();
        for (Pair pair : this.f11115b) {
            ((LiveData) pair.first).removeObserver((C0199s) pair.second);
        }
        this.f11115b.clear();
        this.f11116o.onNext(C3988b.DESTROY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9390a(C1690c cVar) {
        this.f11114a.mo6181a(cVar);
    }
}
