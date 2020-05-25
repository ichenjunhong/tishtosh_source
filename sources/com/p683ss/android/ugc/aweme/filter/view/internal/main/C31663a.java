package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.a */
public final class C31663a implements C31634f {

    /* renamed from: a */
    private final C29252f f82707a;

    /* renamed from: b */
    private final C31499l f82708b;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.a$a */
    static final class C31664a implements C48715t {

        /* renamed from: a */
        public static final C31664a f82709a = new C31664a();

        C31664a() {
        }

        /* renamed from: a */
        public final void mo8708a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.a$b */
    static final class C31665b implements C48715t {

        /* renamed from: a */
        public static final C31665b f82710a = new C31665b();

        C31665b() {
        }

        /* renamed from: a */
        public final void mo8708a() {
        }
    }

    public C31663a(C29252f fVar, C31499l lVar) {
        C52711k.m112240b(fVar, "effectPlatform");
        C52711k.m112240b(lVar, "repository");
        this.f82707a = fVar;
        this.f82708b = lVar;
    }

    /* renamed from: a */
    public final void mo64545a(EffectCategoryResponse effectCategoryResponse, C48710o oVar) {
        C52711k.m112240b(effectCategoryResponse, "category");
        C52711k.m112240b(oVar, "listener");
        this.f82707a.mo59136a(effectCategoryResponse.getId(), effectCategoryResponse.getTags(), effectCategoryResponse.getTagsUpdateTime(), oVar);
    }

    /* renamed from: a */
    public final void mo64544a(C31459g gVar, C48715t tVar) {
        C52711k.m112240b(gVar, "filter");
        Effect c = C31487c.m73328c(this.f82708b.mo64415e(), gVar);
        if (c != null) {
            C29252f fVar = this.f82707a;
            String id = c.getId();
            String tagsUpdatedAt = c.getTagsUpdatedAt();
            if (tVar == null) {
                tVar = C31664a.f82709a;
            }
            fVar.mo59133a(id, tagsUpdatedAt, tVar);
        }
    }

    /* renamed from: a */
    public final void mo64546a(EffectCategoryResponse effectCategoryResponse, C48715t tVar) {
        C52711k.m112240b(effectCategoryResponse, "category");
        C29252f fVar = this.f82707a;
        String id = effectCategoryResponse.getId();
        String tagsUpdateTime = effectCategoryResponse.getTagsUpdateTime();
        if (tVar == null) {
            tVar = C31665b.f82710a;
        }
        fVar.mo59133a(id, tagsUpdateTime, tVar);
    }
}
