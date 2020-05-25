package com.p683ss.android.ugc.aweme.music.p1976d;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.network.observer.C50088b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.d.d */
public final class C37363d implements C37362c {

    /* renamed from: a */
    private final Context f95329a;

    /* renamed from: com.ss.android.ugc.aweme.music.d.d$a */
    static final class C37364a implements Runnable {

        /* renamed from: a */
        public static final C37364a f95330a = new C37364a();

        C37364a() {
        }

        public final void run() {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.htz).mo19066a();
        }
    }

    public C37363d(Context context) {
        C52711k.m112240b(context, "context");
        this.f95329a = context;
    }

    /* renamed from: a */
    public final void mo76648a(C37369f fVar, C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap, JSONObject jSONObject) {
        C52711k.m112240b(fVar, "requestDetectInterceptor");
        C52711k.m112240b(bVar, "networkState");
        C52711k.m112240b(hashMap, "detailMap");
        C52711k.m112240b(jSONObject, "detectLog");
        if (bVar == C50088b.NO_NETWORK && fVar.mo76651b()) {
            C23727n.m58238a(C37364a.f95330a);
        }
        try {
            C23569o.m57779a("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception unused) {
        }
    }
}
