package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.content.Context;
import com.bytedance.p582g.p583a.p592d.C10009j;
import com.bytedance.p582g.p583a.p592d.C10009j.C10018a;
import com.bytedance.p582g.p583a.p592d.C10020k;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36928j;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.n */
public final class C36905n implements C36928j {

    /* renamed from: a */
    private C10009j f94287a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.n$a */
    public static final class C36906a implements C10018a {
        C36906a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo7396a() {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo76154a(String str) {
        C52711k.m112240b(str, "aid");
        this.f94287a = C10020k.m20166a(str);
    }

    /* renamed from: a */
    public final void mo76157a(String str, List<String> list) {
        C52711k.m112240b(str, "aid");
        C52711k.m112240b(list, "params");
        C10020k.m20168a(str, list);
    }

    /* renamed from: a */
    public final void mo76158a(String str, JSONObject jSONObject) {
        C10009j jVar = this.f94287a;
        if (jVar != null) {
            jVar.mo17980a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo76153a(Context context, String str, JSONObject jSONObject) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "aid");
        C52711k.m112240b(jSONObject, "headerInfo");
        C10020k.m20167a(context, str, jSONObject, new C36906a());
    }

    /* renamed from: a */
    public final void mo76155a(String str, int i, JSONObject jSONObject) {
        C10009j jVar = this.f94287a;
        if (jVar != null) {
            jVar.mo17977a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo76159a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C10009j jVar = this.f94287a;
        if (jVar != null) {
            jVar.mo17982a(str, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo76156a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C10009j jVar = this.f94287a;
        if (jVar != null) {
            jVar.mo17978a(str, i, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo76160a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C10009j jVar = this.f94287a;
        if (jVar != null) {
            jVar.mo17983a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
