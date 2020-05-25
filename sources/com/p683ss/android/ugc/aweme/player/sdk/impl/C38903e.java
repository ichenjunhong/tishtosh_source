package com.p683ss.android.ugc.aweme.player.sdk.impl;

import com.bytedance.ies.ugc.aweme.network.C11030f;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.ttvideoengine.net.TTVNetClient;
import com.p683ss.ttvideoengine.net.TTVNetClient.CompletionListener;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p089g.C2147b;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.e */
public final class C38903e extends TTVNetClient {

    /* renamed from: a */
    public TTNetClientApi f99094a;

    /* renamed from: b */
    private C1689b f99095b = new C1689b();

    /* renamed from: c */
    private C11030f f99096c;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.e$a */
    public static class C38906a {

        /* renamed from: a */
        JSONObject f99104a;

        /* renamed from: b */
        Exception f99105b;

        /* renamed from: c */
        int f99106c = -1;
    }

    public final void cancel() {
        this.f99095b.mo6180a();
    }

    public C38903e(C11030f fVar) {
        this.f99096c = fVar;
        this.f99094a = (TTNetClientApi) this.f99096c.mo19930a(TTNetClientApi.class);
    }

    /* renamed from: a */
    public static List<C12685b> m86667a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            arrayList.add(new C12685b(str, (String) map.get(str)));
        }
        return arrayList;
    }

    public final void startTask(String str, CompletionListener completionListener) {
        m86668a(str, null, null, 0, completionListener);
    }

    public final void startTask(String str, Map<String, String> map, CompletionListener completionListener) {
        m86668a(str, map, null, 0, completionListener);
    }

    public final void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, CompletionListener completionListener) {
        m86668a(str, map, jSONObject, i, completionListener);
    }

    /* renamed from: a */
    private void m86668a(String str, Map<String, String> map, JSONObject jSONObject, int i, final CompletionListener completionListener) {
        C1689b bVar = this.f99095b;
        final int i2 = i;
        final String str2 = str;
        final Map<String, String> map2 = map;
        final JSONObject jSONObject2 = jSONObject;
        C389052 r1 = new Callable<C38906a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C38906a call() throws Exception {
                C12690b bVar;
                C38906a aVar = new C38906a();
                try {
                    if (i2 != 1) {
                        bVar = C38903e.this.f99094a.get(str2, C38903e.m86667a(map2));
                    } else {
                        bVar = C38903e.this.f99094a.post(str2, C38903e.m86667a(map2), jSONObject2);
                    }
                    C12799u execute = bVar.execute();
                    try {
                        aVar.f99104a = new JSONObject((String) execute.f33552b);
                    } catch (Exception e) {
                        aVar.f99105b = e;
                        TTVideoEngineLog.m110645d(e);
                        aVar.f99106c = -9979;
                    }
                    if (aVar.f99105b == null && !execute.mo23960c()) {
                        aVar.f99105b = new Exception("http fail");
                        aVar.f99106c = execute.mo23958a();
                    }
                } catch (Exception e2) {
                    aVar.f99105b = e2;
                }
                return aVar;
            }
        };
        bVar.mo6181a((C1690c) C2201v.m6607a((Callable<? extends T>) r1).mo6529b(C2168a.m6521b()).mo6526b(new C2147b<C38906a>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                C38854a.m86291a("ttnet doTask startTask onError", th);
                completionListener.onCompletion(null, new Error("", -9994, th.toString()));
            }

            public final /* synthetic */ void onNext(Object obj) {
                String str;
                C38906a aVar = (C38906a) obj;
                if (C38854a.f98960a) {
                    StringBuilder sb = new StringBuilder("ttnet doTask startTask onNext:");
                    if (aVar.f99104a != null) {
                        str = aVar.f99104a.toString();
                    } else {
                        str = "json null.";
                    }
                    sb.append(str);
                }
                if (aVar.f99105b == null) {
                    completionListener.onCompletion(aVar.f99104a, null);
                } else {
                    completionListener.onCompletion(aVar.f99104a, new Error("", aVar.f99106c, aVar.f99105b.toString()));
                }
            }
        }));
    }
}
