package com.p683ss.android.ugc.aweme.base.activity;

import android.os.Bundle;
import com.p683ss.android.ugc.bogut.library.p2414a.C48496a;
import com.p683ss.android.ugc.bogut.library.p2415b.C48501a;
import com.p683ss.android.ugc.bogut.library.view.C48504b;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmePresenterActivity */
public abstract class AmePresenterActivity<P extends C48501a> extends AmeSSActivity {

    /* renamed from: a */
    private C48504b<P> f62468a = new C48504b<>(C48496a.m104926a(getClass()));

    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public final P mo48546a() {
        return this.f62468a.mo95999a();
    }

    public void onResume() {
        super.onResume();
        this.f62468a.mo96001a((Object) this);
    }

    public void onDestroy() {
        this.f62468a.mo96004c();
        super.onDestroy();
        this.f62468a.mo96002a(!isChangingConfigurations());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("presenter_state", this.f62468a.mo96003b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f62468a.mo96000a(bundle.getBundle("presenter_state"));
        }
    }
}
