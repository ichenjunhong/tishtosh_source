package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p2425e.C48545a;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.e */
public abstract class C37602e {

    /* renamed from: a */
    public Effect f95900a;

    /* renamed from: b */
    public C37621k f95901b;

    /* renamed from: c */
    public final Context f95902c;

    /* renamed from: d */
    public String f95903d;

    /* renamed from: e */
    public final MusicModel f95904e;

    /* renamed from: f */
    private C1690c f95905f;

    /* renamed from: g */
    private C1690c f95906g;

    /* renamed from: h */
    private final C37372e f95907h;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$a */
    static final class C37603a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C37602e f95908a;

        C37603a(C37602e eVar) {
            this.f95908a = eVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C37643s sVar = (C37643s) obj;
            C52711k.m112240b(sVar, "it");
            this.f95908a.f95900a = sVar.f95992e;
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e$b */
    static final class C37604b<T1, T2, R> implements C1707b<C37643s, C37643s, C37643s> {

        /* renamed from: a */
        public static final C37604b f95909a = new C37604b();

        C37604b() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
            C37643s sVar = (C37643s) obj;
            C37643s sVar2 = (C37643s) obj2;
            C52711k.m112240b(sVar, "t1");
            C52711k.m112240b(sVar2, "t2");
            String str = sVar.f95988a;
            if (str == null) {
                str = sVar2.f95988a;
            }
            String str2 = str;
            MusicWaveBean musicWaveBean = sVar.f95989b;
            if (musicWaveBean == null) {
                musicWaveBean = sVar2.f95989b;
            }
            MusicWaveBean musicWaveBean2 = musicWaveBean;
            Integer num = sVar.f95990c;
            if (num == null) {
                num = sVar2.f95990c;
            }
            Integer num2 = num;
            C48545a aVar = sVar.f95991d;
            if (aVar == null) {
                aVar = sVar2.f95991d;
            }
            C48545a aVar2 = aVar;
            Effect effect = sVar.f95992e;
            if (effect == null) {
                effect = sVar2.f95992e;
            }
            Effect effect2 = effect;
            Integer num3 = sVar.f95993f;
            if (num3 == null) {
                num3 = sVar2.f95993f;
            }
            Integer num4 = num3;
            C48649d dVar = sVar.f95994g;
            if (dVar == null) {
                dVar = sVar2.f95994g;
            }
            C37643s sVar3 = new C37643s(str2, musicWaveBean2, num2, aVar2, effect2, num4, dVar);
            return sVar3;
        }
    }

    /* renamed from: c */
    public abstract C1710e<C37643s> mo77084c();

    /* renamed from: d */
    public abstract C1710e<C37642r> mo77085d();

    /* renamed from: b */
    public final void mo77120b() {
        C37621k kVar = this.f95901b;
        if (kVar != null) {
            kVar.mo77135a((C37620j) null);
        }
    }

    /* renamed from: a */
    public final void mo77117a() {
        C1690c cVar = this.f95905f;
        if (cVar != null) {
            if (!(!cVar.isDisposed())) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.dispose();
            }
        }
        C1690c cVar2 = this.f95906g;
        if (cVar2 != null) {
            if (!(!cVar2.isDisposed())) {
                cVar2 = null;
            }
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo77118a(C37620j jVar) {
        mo77119a(jVar, this.f95903d);
    }

    /* renamed from: a */
    public final void mo77119a(C37620j jVar, String str) {
        CharSequence charSequence;
        if (this.f95901b != null && jVar == null) {
            this.f95903d = str;
        } else if (this.f95905f == null || this.f95906g == null || (!C52711k.m112239a((Object) this.f95903d, (Object) str))) {
            Effect effect = this.f95900a;
            if (effect != null) {
                charSequence = effect.getId();
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(charSequence, str)) {
                this.f95900a = null;
            }
            this.f95903d = str;
            this.f95901b = new C37621k(jVar);
            C2180b l = C2180b.m6534l();
            C52711k.m112236a((Object) l, "PublishSubject.create<MusicAndEffectProgress>()");
            C1690c f = l.mo6545f(mo77085d());
            C52711k.m112236a((Object) f, "progressSubject.subscrib…EffectProgressConsumer())");
            this.f95905f = f;
            C37372e eVar = this.f95907h;
            MusicModel musicModel = this.f95904e;
            C2189f fVar = l;
            C52711k.m112240b(eVar, "musicFetcher");
            C52711k.m112240b(fVar, "subject");
            C2201v a = C2201v.m6601a((C2205y<T>) new C37640b<T>(musicModel, eVar, fVar));
            C52711k.m112236a((Object) a, "Observable.create { emit…        }\n        }\n    }");
            C2206z zVar = a;
            Context context = this.f95902c;
            String str2 = this.f95903d;
            Effect effect2 = this.f95900a;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(fVar, "subject");
            C2201v a2 = C2201v.m6601a((C2205y<T>) new C37632a<T>(str2, effect2, context, fVar));
            C52711k.m112236a((Object) a2, "Observable.create(Observ…(effect)\n        }\n    })");
            C1690c f2 = C2201v.m6603a(zVar, (C2206z<? extends T2>) a2.mo6541d((C1711f<? super T, ? extends R>) new C37603a<Object,Object>(this)), (C1707b<? super T1, ? super T2, ? extends R>) C37604b.f95909a).mo6545f(mo77084c());
            C52711k.m112236a((Object) f2, "Observable.zip(provideMu…ndEffectResultConsumer())");
            this.f95906g = f2;
        } else {
            this.f95903d = str;
            C1690c cVar = this.f95906g;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (cVar.isDisposed()) {
                C37621k kVar = this.f95901b;
                if (kVar != null) {
                    kVar.mo77135a(jVar);
                }
                this.f95905f = null;
                this.f95906g = null;
                return;
            }
            C37621k kVar2 = this.f95901b;
            if (kVar2 != null) {
                kVar2.mo77135a(jVar);
            }
        }
    }

    public C37602e(Context context, String str, MusicModel musicModel, C37372e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "musicFetcher");
        this.f95902c = context;
        this.f95903d = str;
        this.f95904e = musicModel;
        this.f95907h = eVar;
    }
}
