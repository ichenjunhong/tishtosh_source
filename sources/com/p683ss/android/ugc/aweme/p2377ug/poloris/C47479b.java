package com.p683ss.android.ugc.aweme.p2377ug.poloris;

import android.app.Activity;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.polaris.browser.C12621c;
import com.bytedance.polaris.browser.p823a.C12609c;
import com.bytedance.polaris.browser.p823a.C12610d;
import com.p683ss.android.sdk.webview.C19750e;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.b */
public final class C47479b implements C10762d {

    /* renamed from: a */
    public C12609c f119750a;

    /* renamed from: b */
    private final C19750e f119751b;

    /* renamed from: c */
    private final WeakReference<Activity> f119752c;

    public C47479b(C19750e eVar, Activity activity) {
        this.f119751b = eVar;
        this.f119752c = new WeakReference<>(activity);
        this.f119750a = new C12621c(activity, eVar.f54420f);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        C12610d dVar;
        if (hVar != null) {
            hVar.f28951h = false;
            if (hVar == null) {
                dVar = null;
            } else {
                C12610d dVar2 = new C12610d();
                dVar2.f33101c = hVar.f28946c;
                dVar2.f33102d = hVar.f28947d;
                dVar2.f33100b = hVar.f28945b;
                dVar2.f33099a = hVar.f28944a;
                dVar2.f33103e = hVar.f28948e;
                dVar = dVar2;
            }
            if (!(dVar == null || this.f119750a == null)) {
                this.f119750a.mo23712a(dVar);
            }
        }
    }
}
