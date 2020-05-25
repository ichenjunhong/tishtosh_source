package com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23077b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.GetDownloadPauseTaskMethod */
public final class GetDownloadPauseTaskMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f64275b = "get_download_pause_task";

    /* renamed from: c */
    private C10269a f64276c = C10269a.PRIVATE;

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64276c;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64275b;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64276c = aVar;
    }

    public GetDownloadPauseTaskMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        if (((C23077b) this.f27647a.mo18401c(C23077b.class)) != null) {
            aVar.mo49911a((Object) new JSONObject());
        } else {
            aVar.mo49910a(-1, "jsdownload manager missing");
        }
    }
}
