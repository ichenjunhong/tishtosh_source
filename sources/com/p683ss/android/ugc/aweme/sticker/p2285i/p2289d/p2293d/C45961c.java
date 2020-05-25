package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2293d;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39568at;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p.C39634a;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45870a;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45876d;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45878f;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45879g;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45911i;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45913k;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c */
public final class C45961c extends C45969d implements C45876d {

    /* renamed from: a */
    public C45878f f115981a = new C45962a();

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$a */
    public static final class C45962a implements C45878f {
        C45962a() {
        }

        /* renamed from: a */
        public final boolean mo92475a(Effect effect) {
            C52711k.m112240b(effect, "effect");
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$b */
    public static final class C45963b implements C39568at {

        /* renamed from: a */
        final /* synthetic */ C45879g f115982a;

        /* renamed from: b */
        final /* synthetic */ String f115983b;

        /* renamed from: c */
        final /* synthetic */ boolean f115984c;

        /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$b$a */
        public static final class C45964a implements C39634a {

            /* renamed from: a */
            final /* synthetic */ C45963b f115985a;

            /* renamed from: b */
            final /* synthetic */ C42482c f115986b;

            /* renamed from: a */
            public final void mo80710a(int i) {
                this.f115985a.f115982a.mo92477a(i);
            }

            C45964a(C45963b bVar, C42482c cVar) {
                this.f115985a = bVar;
                this.f115986b = cVar;
            }

            /* renamed from: a */
            public final void mo80711a(Integer num, String str) {
                this.f115985a.f115982a.mo92476a();
            }

            /* renamed from: a */
            public final void mo80712a(String str, MusicWaveBean musicWaveBean) {
                C52711k.m112240b(str, "musicFile");
                this.f115985a.f115982a.mo92478a(this.f115986b, str);
            }
        }

        /* renamed from: a */
        public final void mo80658a(Exception exc) {
            this.f115982a.mo92476a();
        }

        /* renamed from: a */
        public final void mo80657a(C42482c cVar) {
            if (cVar == null) {
                this.f115982a.mo92476a();
            } else if (!C45870a.m99714a() || cVar.isCommerceMusic()) {
                String a = C46055e.m100052a(this.f115983b);
                C39633p p = C39629l.m88232a().mo58585p();
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                Context applicationContext = b.getApplicationContext();
                C52711k.m112236a((Object) applicationContext, "CameraClient.getApplication().applicationContext");
                boolean z = false;
                if (!p.mo80709a(cVar, applicationContext, false)) {
                    this.f115982a.mo92476a();
                    return;
                }
                CharSequence charSequence = a;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (!z) {
                    this.f115982a.mo92477a(100);
                    this.f115982a.mo92478a(cVar, a);
                } else if (!this.f115984c) {
                    this.f115982a.mo92477a(100);
                    this.f115982a.mo92478a(cVar, null);
                } else {
                    C39633p p2 = C39629l.m88232a().mo58585p();
                    Application b2 = C39629l.m88233b();
                    C52711k.m112236a((Object) b2, "CameraClient.getApplication()");
                    p2.mo80707a(b2, cVar, 0, false, new C45964a(this, cVar));
                }
            } else {
                this.f115982a.mo92476a();
            }
        }

        C45963b(C45879g gVar, String str, boolean z) {
            this.f115982a = gVar;
            this.f115983b = str;
            this.f115984c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$c */
    static final class C45965c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45961c f115987a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f115988b;

        /* renamed from: c */
        final /* synthetic */ C45955b f115989c;

        C45965c(C45961c cVar, StickerWrapper stickerWrapper, C45955b bVar) {
            this.f115987a = cVar;
            this.f115988b = stickerWrapper;
            this.f115989c = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C45961c.super.mo92567b(this.f115988b, this.f115989c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$d */
    public static final class C45966d implements C48704i {

        /* renamed from: a */
        final /* synthetic */ C45961c f115990a;

        /* renamed from: b */
        final /* synthetic */ C48705j f115991b;

        /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$d$a */
        public static final class C45967a implements C48699d {

            /* renamed from: a */
            final /* synthetic */ C45966d f115992a;

            /* renamed from: b */
            final /* synthetic */ List f115993b;

            /* renamed from: a */
            public final void mo59191a(Effect effect, int i, long j) {
            }

            /* renamed from: a */
            public final void mo8643a(Effect effect) {
                this.f115992a.f115991b.mo8643a(effect);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                this.f115992a.f115991b.mo8638a((Effect) obj);
            }

            C45967a(C45966d dVar, List list) {
                this.f115992a = dVar;
                this.f115993b = list;
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C52711k.m112240b(dVar, "e");
                this.f115992a.f115991b.mo8644a(effect, dVar);
            }
        }

        /* renamed from: a */
        public final void mo77143a(C48649d dVar) {
            C48705j jVar = this.f115991b;
            if (dVar == null) {
                dVar = new C48649d(-1, new IllegalStateException("get effect info error"));
            }
            jVar.mo8644a(null, dVar);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            List list;
            List list2 = (List) obj;
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    list = list2;
                } else {
                    list = null;
                }
                if (list != null) {
                    Effect effect = (Effect) list2.get(0);
                    if (this.f115990a.mo92568b(effect)) {
                        C45955b bVar = new C45955b(effect, new C45967a(this, list2));
                        List music = effect.getMusic();
                        if (music != null) {
                            String str = (String) music.get(0);
                            if (str != null) {
                                C45961c cVar = this.f115990a;
                                C45961c.m99913a(str, (C45879g) bVar, true);
                                this.f115990a.f115998c.mo92514a(effect, bVar);
                            }
                        }
                        bVar.mo92476a();
                        this.f115990a.f115998c.mo92514a(effect, bVar);
                    }
                    this.f115990a.f115998c.mo92514a(effect, this.f115991b);
                    return;
                }
            }
            mo77143a(new C48649d(-1, new IllegalStateException("get effect info error")));
        }

        C45966d(C45961c cVar, C48705j jVar) {
            this.f115990a = cVar;
            this.f115991b = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.c$e */
    static final class C45968e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45961c f115994a;

        /* renamed from: b */
        final /* synthetic */ StickerWrapper f115995b;

        /* renamed from: c */
        final /* synthetic */ C45955b f115996c;

        C45968e(C45961c cVar, StickerWrapper stickerWrapper, C45955b bVar) {
            this.f115994a = cVar;
            this.f115995b = stickerWrapper;
            this.f115996c = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C45961c.super.mo92565a(this.f115995b, (C48699d) this.f115996c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final boolean mo92568b(Effect effect) {
        boolean z;
        boolean z2 = true;
        if (effect != null) {
            if (C46059g.m100094r(effect)) {
                Collection music = effect.getMusic();
                if (music == null || music.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f115981a.mo92475a(effect);
                }
            }
            return false;
        }
        z2 = false;
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo92566a(Effect effect) {
        if (effect == null || !C46059g.m100094r(effect)) {
            return super.mo92566a(effect);
        }
        if (!super.mo92566a(effect) || !StickerWrapper.m99613a(effect)) {
            return false;
        }
        return true;
    }

    public C45961c(C45913k kVar, C45911i iVar) {
        C52711k.m112240b(kVar, "innerFetcher");
        C52711k.m112240b(iVar, "converter");
        super(kVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92567b(StickerWrapper stickerWrapper, C48699d dVar) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        C52711k.m112240b(dVar, "iEffectDownloadProgressListener");
        if (!mo92568b(stickerWrapper.f115779a)) {
            super.mo92567b(stickerWrapper, dVar);
            return;
        }
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "stickerWrapper.effect");
        C45955b bVar = new C45955b(effect, dVar);
        m99911a(stickerWrapper, bVar, (C52670a<C52860x>) new C45965c<C52860x>(this, stickerWrapper, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92565a(StickerWrapper stickerWrapper, C48699d dVar) {
        C52711k.m112240b(stickerWrapper, "stickerWrapper");
        C52711k.m112240b(dVar, "iFetchEffectListener");
        if (!mo92568b(stickerWrapper.f115779a)) {
            super.mo92565a(stickerWrapper, dVar);
            return;
        }
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "stickerWrapper.effect");
        C45955b bVar = new C45955b(effect, dVar);
        m99911a(stickerWrapper, bVar, (C52670a<C52860x>) new C45968e<C52860x>(this, stickerWrapper, bVar));
    }

    /* renamed from: a */
    static void m99913a(String str, C45879g gVar, boolean z) {
        C39629l.m88232a().mo58585p().mo80708a(str, new C45963b(gVar, str, z));
    }

    /* renamed from: a */
    private final void m99911a(StickerWrapper stickerWrapper, C45955b bVar, C52670a<C52860x> aVar) {
        if (!this.f115999d.mo92511a(stickerWrapper.f115779a)) {
            aVar.invoke();
        } else {
            bVar.mo8638a(stickerWrapper.f115779a);
        }
        Effect effect = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect, "stickerWrapper.effect");
        List music = effect.getMusic();
        if (music != null) {
            String str = (String) music.get(0);
            if (str != null) {
                m99913a(str, (C45879g) bVar, !stickerWrapper.f115782d);
                return;
            }
        }
        bVar.mo92476a();
    }

    /* renamed from: a */
    public final void mo92470a(String str, String str2, C48705j jVar) {
        C52711k.m112240b(str, "effectId");
        C52711k.m112240b(jVar, "listener");
        Map hashMap = new HashMap();
        hashMap.put("scene", str2);
        mo92471a(str, hashMap, jVar);
    }

    /* renamed from: a */
    public final void mo92471a(String str, Map<String, String> map, C48705j jVar) {
        C52711k.m112240b(str, "effectId");
        C52711k.m112240b(jVar, "listener");
        this.f115998c.mo92516a(C52575l.m112092a(str), false, map, new C45966d(this, jVar));
    }
}
