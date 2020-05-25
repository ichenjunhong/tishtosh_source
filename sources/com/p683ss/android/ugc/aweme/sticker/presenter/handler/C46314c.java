package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.LiveData;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.defult.DefaultSenorPresenter;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46295d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c */
public final class C46314c extends C46306b {

    /* renamed from: a */
    private boolean f116847a;

    /* renamed from: b */
    private final AppCompatActivity f116848b;

    /* renamed from: c */
    private final C20457b f116849c;

    /* renamed from: d */
    private final LiveData<Boolean> f116850d;

    /* renamed from: e */
    private final C46295d f116851e;

    /* renamed from: a */
    public final void mo93028a() {
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        if (!aVar.f116852a.getTypes().contains("AR")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m100606a(boolean z) {
        Boolean bool = (Boolean) this.f116850d.getValue();
        if (bool == null) {
            bool = Boolean.valueOf(false);
        }
        C52711k.m112236a((Object) bool, "nativeInitLiveData.value ?: false");
        this.f116851e.mo93022a(new DefaultSenorPresenter(this.f116848b, this.f116848b, this.f116849c, bool.booleanValue()), z);
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        if (aVar.f116852a.getTypes().contains("highRotationFreq")) {
            this.f116847a = true;
            int[] iArr = {11, 15};
            Boolean bool = (Boolean) this.f116850d.getValue();
            if (bool == null) {
                bool = Boolean.valueOf(false);
            }
            C52711k.m112236a((Object) bool, "nativeInitLiveData.value ?: false");
            DefaultSenorPresenter defaultSenorPresenter = new DefaultSenorPresenter(this.f116848b, this.f116848b, this.f116849c, bool.booleanValue());
            for (int i = 0; i < 2; i++) {
                defaultSenorPresenter.mo90409a(iArr[i], 0);
            }
            this.f116851e.mo93022a(defaultSenorPresenter, true);
        } else if (this.f116847a) {
            this.f116847a = false;
            m100606a(true);
        } else {
            m100606a(false);
        }
    }

    public C46314c(AppCompatActivity appCompatActivity, C20457b bVar, LiveData<Boolean> liveData, C46295d dVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(bVar, "cameraService");
        C52711k.m112240b(liveData, "nativeInitLiveData");
        C52711k.m112240b(dVar, "sensorPresenterHolder");
        this.f116848b = appCompatActivity;
        this.f116849c = bVar;
        this.f116850d = liveData;
        this.f116851e = dVar;
    }
}
