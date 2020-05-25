package com.p683ss.android.ugc.aweme.p1963ml;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.p1192ml.C19496a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.ml.g */
public final class C37109g implements C19496a {
    /* renamed from: a */
    public final void mo40655a(Throwable th, String str) {
        C9220a.m18312a(th, str);
    }

    /* renamed from: a */
    public final void mo40654a(String str, HashMap<String, String> hashMap) {
        C1680ad.m5962a((Callable<? extends T>) new C37111h<Object>(str, hashMap)).mo6155b(C2168a.m6521b()).mo6148a(C2168a.m6521b()).mo6159b((C1683ag<? super T>) new C1683ag<Boolean>() {
            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C1690c cVar) {
            }

            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }
        });
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m83340b(String str, HashMap hashMap) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            for (Entry entry : hashMap.entrySet()) {
                if ("consume".equalsIgnoreCase((String) entry.getKey())) {
                    jSONObject.put("consume_time", Long.parseLong((String) entry.getValue()));
                } else {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        C23131p.m57779a("ml-evaluator", jSONObject);
        return Boolean.valueOf(true);
    }
}
