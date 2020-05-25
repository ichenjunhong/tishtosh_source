package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2293d;

import android.os.Looper;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45183i;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45879g;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.b */
public final class C45955b implements C45879g, C48699d {

    /* renamed from: a */
    public long f115965a;

    /* renamed from: b */
    public final Effect f115966b;

    /* renamed from: c */
    public final C48699d f115967c;

    /* renamed from: d */
    private volatile boolean f115968d;

    /* renamed from: e */
    private volatile boolean f115969e;

    /* renamed from: f */
    private volatile int f115970f;

    /* renamed from: g */
    private volatile int f115971g;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.b$a */
    static final class C45956a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52670a f115972a;

        C45956a(C52670a aVar) {
            this.f115972a = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f115972a.invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.b$b */
    static final class C45957b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45955b f115973a;

        C45957b(C45955b bVar) {
            this.f115973a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f115973a.f115967c.mo8638a(this.f115973a.f115966b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.b$c */
    static final class C45958c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45955b f115974a;

        /* renamed from: b */
        final /* synthetic */ Effect f115975b;

        /* renamed from: c */
        final /* synthetic */ C48649d f115976c;

        C45958c(C45955b bVar, Effect effect, C48649d dVar) {
            this.f115974a = bVar;
            this.f115975b = effect;
            this.f115976c = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f115974a.f115967c.mo8644a(this.f115975b, this.f115976c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.b$d */
    static final class C45959d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45955b f115977a;

        /* renamed from: b */
        final /* synthetic */ Effect f115978b;

        C45959d(C45955b bVar, Effect effect) {
            this.f115977a = bVar;
            this.f115978b = effect;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f115977a.f115967c.mo8643a(this.f115978b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.b$e */
    static final class C45960e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45955b f115979a;

        /* renamed from: b */
        final /* synthetic */ int f115980b;

        C45960e(C45955b bVar, int i) {
            this.f115979a = bVar;
            this.f115980b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f115979a.f115967c.mo59191a(this.f115979a.f115966b, this.f115980b, this.f115979a.f115965a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    private final void m99901b() {
        if (this.f115968d && this.f115969e) {
            m99900a((C52670a<C52860x>) new C45957b<C52860x>(this));
        }
    }

    /* renamed from: c */
    private final void m99902c() {
        int i = 100;
        if (!this.f115968d && !this.f115969e) {
            i = (this.f115971g + this.f115970f) / 2;
        } else if (!this.f115969e) {
            i = (this.f115971g + 100) / 2;
        } else if (!this.f115968d) {
            i = (this.f115970f + 100) / 2;
        }
        m99900a((C52670a<C52860x>) new C45960e<C52860x>(this, i));
    }

    /* renamed from: a */
    public final void mo92476a() {
        this.f115969e = true;
        String effectId = this.f115966b.getEffectId();
        C52711k.m112236a((Object) effectId, "effect.effectId");
        C52711k.m112240b(effectId, "effectId");
        C45183i.f114318a.put(effectId, null);
        m99901b();
    }

    /* renamed from: a */
    public final void mo92477a(int i) {
        this.f115971g = i;
        m99902c();
    }

    /* renamed from: b */
    public final void mo8638a(Effect effect) {
        this.f115968d = true;
        m99901b();
    }

    /* renamed from: a */
    public final void mo8643a(Effect effect) {
        m99900a((C52670a<C52860x>) new C45959d<C52860x>(this, effect));
    }

    /* renamed from: a */
    private static void m99900a(C52670a<C52860x> aVar) {
        if (C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            C0013i.m18a((Callable<TResult>) new C45956a<TResult>(aVar), C0013i.f25b);
        }
    }

    public C45955b(Effect effect, C48699d dVar) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(dVar, "iEffectDownloadProgressListener");
        this.f115966b = effect;
        this.f115967c = dVar;
    }

    /* renamed from: a */
    public final void mo92478a(C42482c cVar, String str) {
        C52711k.m112240b(cVar, "avMusic");
        this.f115969e = true;
        String effectId = this.f115966b.getEffectId();
        C52711k.m112236a((Object) effectId, "effect.effectId");
        C52711k.m112240b(effectId, "effectId");
        if (cVar != null) {
            cVar.setMusicPriority(-1);
        }
        C45183i.f114318a.put(effectId, cVar);
        C45183i.f114319b.put(effectId, str);
        if (str != null) {
            String musicId = cVar.getMusicId();
            C52711k.m112236a((Object) musicId, "avMusic.musicId");
            C46055e.m100053a(musicId, str);
        }
        m99901b();
    }

    /* renamed from: a */
    public final void mo8644a(Effect effect, C48649d dVar) {
        C52711k.m112240b(dVar, "e");
        m99900a((C52670a<C52860x>) new C45958c<C52860x>(this, effect, dVar));
    }

    /* renamed from: a */
    public final void mo59191a(Effect effect, int i, long j) {
        this.f115965a = j;
        this.f115970f = i;
        m99902c();
    }
}
