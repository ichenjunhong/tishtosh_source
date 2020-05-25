package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.graphics.Bitmap;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46295d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor.ARSenorPresenter;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler */
public final class ARStickerHandler extends C46306b implements C0183j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116797a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ARStickerHandler.class), "arSensorPresenter", "getArSensorPresenter()Lcom/ss/android/ugc/aweme/sticker/types/ar/senor/ARSenorPresenter;"))};

    /* renamed from: b */
    final C52668f f116798b = C52732g.m112285a(new C46300a(this));

    /* renamed from: c */
    public final Context f116799c;

    /* renamed from: d */
    public final C0184k f116800d;

    /* renamed from: e */
    public final C20457b f116801e;

    /* renamed from: f */
    public final C20489b f116802f;

    /* renamed from: g */
    public final LiveData<Boolean> f116803g;

    /* renamed from: h */
    public final C46295d f116804h;

    /* renamed from: i */
    private final C50627o f116805i = new C46301b(this);

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler$a */
    static final class C46300a extends C52712l implements C52670a<ARSenorPresenter> {

        /* renamed from: a */
        final /* synthetic */ ARStickerHandler f116806a;

        C46300a(ARStickerHandler aRStickerHandler) {
            this.f116806a = aRStickerHandler;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f116806a.f116799c;
            C0184k kVar = this.f116806a.f116800d;
            C20457b bVar = this.f116806a.f116801e;
            C20489b bVar2 = this.f116806a.f116802f;
            Boolean bool = (Boolean) this.f116806a.f116803g.getValue();
            if (bool == null) {
                bool = Boolean.valueOf(false);
            }
            ARSenorPresenter aRSenorPresenter = new ARSenorPresenter(context, kVar, bVar, bVar2, bool.booleanValue());
            return aRSenorPresenter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler$b */
    static final class C46301b implements C50627o {

        /* renamed from: a */
        final /* synthetic */ ARStickerHandler f116807a;

        C46301b(ARStickerHandler aRStickerHandler) {
            this.f116807a = aRStickerHandler;
        }

        /* renamed from: a */
        public final void mo43756a(boolean z) {
            if (z) {
                this.f116807a.f116804h.mo93022a((ARSenorPresenter) this.f116807a.f116798b.getValue(), false);
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    private final void onDestroy() {
        this.f116802f.mo43468a(this.f116805i);
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116802f.mo43468a(this.f116805i);
        this.f116802f.mo43531h(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo93031b(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        this.f116802f.mo43531h(true);
        this.f116802f.mo43443a((Bitmap) null);
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return aVar.f116852a.getTypes().contains("AR");
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        this.f116802f.mo43493b(this.f116805i);
    }

    public ARStickerHandler(Context context, C0184k kVar, C20457b bVar, C20489b bVar2, LiveData<Boolean> liveData, C46295d dVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(bVar, "cameraController");
        C52711k.m112240b(bVar2, "effectController");
        C52711k.m112240b(liveData, "nativeInitLiveData");
        C52711k.m112240b(dVar, "sensorHolder");
        this.f116799c = context;
        this.f116800d = kVar;
        this.f116801e = bVar;
        this.f116802f = bVar2;
        this.f116803g = liveData;
        this.f116804h = dVar;
        this.f116800d.getLifecycle().mo324a(this);
    }
}
