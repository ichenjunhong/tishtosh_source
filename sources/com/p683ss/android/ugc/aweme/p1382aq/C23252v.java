package com.p683ss.android.ugc.aweme.p1382aq;

import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.v */
public abstract class C23252v implements Serializable {

    /* renamed from: a */
    protected final HashMap<String, String> f62124a = new HashMap<>();

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(C23231d dVar) {
        HashMap buildParams = buildParams();
        if (dVar != null) {
            dVar.mo48070a((Map<String, String>) buildParams);
        }
    }

    public final void appendParam(String str, String str2, C23232a aVar) {
        this.f62124a.put(str, aVar.mo48079a(str2));
    }
}
