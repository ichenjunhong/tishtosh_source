package com.bytedance.android.live.broadcast.effect;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.live.broadcast.effect.t */
final /* synthetic */ class C3364t implements C2205y {

    /* renamed from: a */
    private final C3266p f9662a;

    /* renamed from: b */
    private final FilterModel f9663b;

    C3364t(C3266p pVar, FilterModel filterModel) {
        this.f9662a = pVar;
        this.f9663b = filterModel;
    }

    public final void subscribe(C2204x xVar) {
        C3266p pVar = this.f9662a;
        FilterModel filterModel = this.f9663b;
        C3266p a = C3266p.m8943a();
        String id = filterModel.getEffect().getId();
        String tagsUpdatedAt = filterModel.getEffect().getTagsUpdatedAt();
        C32693 r5 = new C48710o(filterModel, xVar) {

            /* renamed from: a */
            final /* synthetic */ FilterModel f9444a;

            /* renamed from: b */
            final /* synthetic */ C2204x f9445b;

            /* renamed from: a */
            public final void mo8641a() {
                this.f9444a.setNew(true);
                this.f9445b.mo6273a();
            }

            /* renamed from: b */
            public final void mo8642b() {
                this.f9444a.setNew(false);
                this.f9445b.mo6273a();
            }

            {
                this.f9444a = r2;
                this.f9445b = r3;
            }
        };
        if (a.f9435c == null || id == null || tagsUpdatedAt == null || TextUtils.equals("NULL", tagsUpdatedAt.toUpperCase())) {
            r5.mo8642b();
        } else {
            a.f9435c.mo96675a(id, tagsUpdatedAt, (C48710o) r5);
        }
    }
}
