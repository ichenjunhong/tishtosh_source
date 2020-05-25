package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.p2322a;

import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46306b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.a.a */
public final class C46436a extends C46306b implements C46440b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117143a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46436a.class), "handler", "getHandler()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;"))};

    /* renamed from: b */
    C46487b f117144b = new C46487b();

    /* renamed from: c */
    public String f117145c;

    /* renamed from: d */
    public final AppCompatActivity f117146d;

    /* renamed from: e */
    final C52682m<String, String, Integer> f117147e;

    /* renamed from: f */
    private final C52668f f117148f = C52732g.m112285a(new C46437a(this));

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.a.a$a */
    static final class C46437a extends C52712l implements C52670a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C46436a f117149a;

        C46437a(C46436a aVar) {
            this.f117149a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SafeHandler(this.f117149a.f117146d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.a.a$b */
    static final class C46438b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C46436a f117150a;

        /* renamed from: b */
        final /* synthetic */ String f117151b;

        C46438b(C46436a aVar, String str) {
            this.f117150a = aVar;
            this.f117151b = str;
        }

        public final /* synthetic */ Object call() {
            String str = null;
            if (TextUtils.isEmpty(this.f117151b)) {
                C46436a aVar = this.f117150a;
                if (aVar.f117144b != null) {
                    C52682m<String, String, Integer> mVar = aVar.f117147e;
                    C46487b bVar = aVar.f117144b;
                    if (bVar != null) {
                        str = bVar.mo93234c();
                    }
                    if (str == null) {
                        str = "";
                    }
                    mVar.invoke(str, "");
                }
            } else {
                C46436a aVar2 = this.f117150a;
                String str2 = this.f117151b;
                if (C50200d.m108346a(str2) && aVar2.f117144b != null) {
                    C52682m<String, String, Integer> mVar2 = aVar2.f117147e;
                    C46487b bVar2 = aVar2.f117144b;
                    if (bVar2 != null) {
                        str = bVar2.mo93234c();
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        C52711k.m112234a();
                    }
                    mVar2.invoke(str, str2);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.a.a$c */
    static final class C46439c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46436a f117152a;

        C46439c(C46436a aVar) {
            this.f117152a = aVar;
        }

        public final void run() {
            this.f117152a.mo93176b(this.f117152a.f117145c);
            this.f117152a.f117145c = null;
        }
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f117144b = null;
        this.f117145c = null;
    }

    /* renamed from: b */
    public final void mo93175b() {
        this.f117145c = null;
        C46476a.m100891a(false);
    }

    /* renamed from: a */
    public final void mo93174a(String str) {
        this.f117145c = str;
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C46059g.m100099w(aVar.f116852a);
    }

    /* renamed from: b */
    public final void mo93176b(String str) {
        this.f117145c = str;
        C0013i.m16a((Callable<TResult>) new C46438b<TResult>(this, str));
    }

    public C46436a(AppCompatActivity appCompatActivity, C52682m<? super String, ? super String, Integer> mVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(mVar, "effectController");
        this.f117146d = appCompatActivity;
        this.f117147e = mVar;
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        Effect effect = aVar.f116852a;
        if (C39629l.m88232a().mo58572c().mo49434a(this.f117146d) != 0) {
            C50275d.m108530a((Context) this.f117146d, (int) R.string.co0).mo98174a();
            return;
        }
        if (this.f117144b == null) {
            this.f117144b = new C46487b();
        }
        C46487b bVar2 = this.f117144b;
        if (bVar2 == null) {
            C52711k.m112234a();
        }
        if (!bVar2.mo93232a()) {
            C46487b bVar3 = this.f117144b;
            if (bVar3 == null) {
                C52711k.m112234a();
            }
            String sdkExtra = effect.getSdkExtra();
            C52711k.m112236a((Object) sdkExtra, "sticker.sdkExtra");
            bVar3.mo93231a(sdkExtra);
        }
        C46476a.m100891a(true);
        if (!TextUtils.isEmpty(this.f117145c)) {
            ((SafeHandler) this.f117148f.getValue()).post(new C46439c(this));
        }
    }
}
