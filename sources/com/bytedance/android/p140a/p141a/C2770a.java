package com.bytedance.android.p140a.p141a;

import android.view.View;
import com.bytedance.android.p140a.p141a.p146e.C2787a;
import com.bytedance.android.p140a.p141a.p149h.C2796a;
import com.bytedance.android.p140a.p141a.p149h.C2798c;
import com.bytedance.android.p140a.p141a.p150i.C2799a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.a */
public final class C2770a implements C2798c {

    /* renamed from: a */
    Map<String, C2796a> f8332a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo7361a() {
        for (C2796a aVar : this.f8332a.values()) {
            if (aVar != null) {
                aVar.mo7361a();
            }
        }
    }

    /* renamed from: a */
    public final void mo7362a(View view, C2787a aVar) {
        C2799a.m7957a("track_call_start", aVar, (JSONObject) null);
        new StringBuilder("track_call_start:").append(aVar.toString());
        String str = aVar.f8364b;
        C2796a aVar2 = (C2796a) this.f8332a.get(str);
        if (aVar2 == null) {
            C2799a.m7957a("track_tracker_invalid", aVar, (JSONObject) null);
            new StringBuilder("track_tracker_invalid:no tracker available for ").append(str);
            return;
        }
        aVar2.mo7362a(view, aVar);
    }
}
