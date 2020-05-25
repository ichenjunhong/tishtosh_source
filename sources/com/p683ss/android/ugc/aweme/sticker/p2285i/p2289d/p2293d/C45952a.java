package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2293d;

import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45913k;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2287b.C45927c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.a */
public final class C45952a implements C45913k {

    /* renamed from: a */
    private final C29252f f115959a;

    /* renamed from: b */
    private final C45927c<String, Effect> f115960b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.a$a */
    public static final class C45953a implements C48699d {

        /* renamed from: a */
        final /* synthetic */ C45952a f115961a;

        /* renamed from: b */
        final /* synthetic */ C48705j f115962b;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C48705j jVar = this.f115962b;
            if (jVar != null) {
                jVar.mo8643a(effect);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C48705j jVar = this.f115962b;
            if (jVar != null) {
                jVar.mo8638a(effect);
            }
            if (effect != null) {
                this.f115961a.mo92562a(effect);
            }
        }

        C45953a(C45952a aVar, C48705j jVar) {
            this.f115961a = aVar;
            this.f115962b = jVar;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C48705j jVar = this.f115962b;
            if (jVar != null) {
                jVar.mo8644a(effect, dVar);
            }
        }

        /* renamed from: a */
        public final void mo59191a(Effect effect, int i, long j) {
            C48705j jVar = this.f115962b;
            if (!(jVar instanceof C48699d)) {
                jVar = null;
            }
            C48699d dVar = (C48699d) jVar;
            if (dVar != null) {
                dVar.mo59191a(effect, i, j);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.d.a$b */
    public static final class C45954b implements C48704i {

        /* renamed from: a */
        final /* synthetic */ C45952a f115963a;

        /* renamed from: b */
        final /* synthetic */ C48704i f115964b;

        /* renamed from: a */
        public final void mo77143a(C48649d dVar) {
            C48704i iVar = this.f115964b;
            if (iVar != null) {
                iVar.mo77143a(dVar);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            List<Effect> list = (List) obj;
            C48704i iVar = this.f115964b;
            if (iVar != null) {
                iVar.mo8638a(list);
            }
            if (list != null) {
                for (Effect effect : list) {
                    if (effect != null) {
                        this.f115963a.mo92562a(effect);
                    }
                }
            }
        }

        C45954b(C45952a aVar, C48704i iVar) {
            this.f115963a = aVar;
            this.f115964b = iVar;
        }
    }

    /* renamed from: a */
    public final void mo92562a(Effect effect) {
        C45927c<String, Effect> cVar = this.f115960b;
        if (cVar != null) {
            String id = effect.getId();
            C52711k.m112236a((Object) id, "id");
            cVar.mo22280a(id, effect);
        }
    }

    public C45952a(C29252f fVar, C45927c<String, Effect> cVar) {
        C52711k.m112240b(fVar, "effectPlatform");
        this.f115959a = fVar;
        this.f115960b = cVar;
    }

    /* renamed from: a */
    public final void mo92514a(Effect effect, C48705j jVar) {
        C52711k.m112240b(effect, "effect");
        if (!this.f115959a.mo59142a(effect)) {
            this.f115959a.mo59123a(effect, (C48705j) new C45953a(this, jVar));
        } else if (jVar != null) {
            jVar.mo8638a(effect);
        }
    }

    /* renamed from: a */
    public final void mo92515a(List<String> list, Map<String, String> map, C48703h hVar) {
        C52711k.m112240b(list, "effectIds");
        this.f115959a.mo59140a(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo92516a(List<String> list, boolean z, Map<String, String> map, C48704i iVar) {
        C52711k.m112240b(list, "effectIds");
        this.f115959a.mo59141a(list, map, z, (C48704i) new C45954b(this, iVar));
    }
}
