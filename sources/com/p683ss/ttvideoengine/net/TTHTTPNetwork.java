package com.p683ss.ttvideoengine.net;

import com.p683ss.ttvideoengine.net.TTVNetClient.CompletionListener;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53678w;
import okhttp3.C53682y;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.net.TTHTTPNetwork */
public class TTHTTPNetwork extends TTVNetClient {
    public static final C53678w JSON = C53678w.m114225a("application/json");
    private static C53682y mClient;
    private C53524e mCall;

    public void cancel() {
        if (this.mCall != null && !this.mCall.mo111250d()) {
            this.mCall.mo111248c();
        }
    }

    public void startTask(String str, final CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new C53682y().mo111653b().mo111654a(10, TimeUnit.SECONDS).mo111672c(10, TimeUnit.SECONDS).mo111668b(10, TimeUnit.SECONDS).mo111667a();
            }
        }
        this.mCall = mClient.mo111325a(new C53499a().mo111262a(str).mo111272c());
        this.mCall.mo111246a(new C53526f() {
            public void onFailure(C53524e eVar, IOException iOException) {
                completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[SYNTHETIC, Splitter:B:26:0x0052] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.C53524e r6, okhttp3.C53504ad r7) {
                /*
                    r5 = this;
                    r6 = 0
                    okhttp3.ae r0 = r7.f132404g     // Catch:{ all -> 0x004d }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0013 }
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0013 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0013 }
                    r2 = -1
                    r2 = r1
                    r3 = -1
                    r1 = r6
                    goto L_0x001c
                L_0x0011:
                    r6 = move-exception
                    goto L_0x0050
                L_0x0013:
                    r1 = move-exception
                    com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1)     // Catch:{ all -> 0x0011 }
                    r2 = -9979(0xffffffffffffd905, float:NaN)
                    r2 = r6
                    r3 = -9979(0xffffffffffffd905, float:NaN)
                L_0x001c:
                    if (r1 != 0) goto L_0x002d
                    boolean r4 = r7.mo111275a()     // Catch:{ all -> 0x0011 }
                    if (r4 != 0) goto L_0x002d
                    java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0011 }
                    java.lang.String r3 = "http fail"
                    r1.<init>(r3)     // Catch:{ all -> 0x0011 }
                    int r3 = r7.f132400c     // Catch:{ all -> 0x0011 }
                L_0x002d:
                    if (r0 == 0) goto L_0x0034
                    r0.close()     // Catch:{ Exception -> 0x0033 }
                    goto L_0x0034
                L_0x0033:
                L_0x0034:
                    if (r1 != 0) goto L_0x003c
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r7 = r7
                    r7.onCompletion(r2, r6)
                    return
                L_0x003c:
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r6 = r7
                    com.ss.ttvideoengine.utils.Error r7 = new com.ss.ttvideoengine.utils.Error
                    java.lang.String r0 = ""
                    java.lang.String r1 = r1.toString()
                    r7.<init>(r0, r3, r1)
                    r6.onCompletion(r2, r7)
                    return
                L_0x004d:
                    r7 = move-exception
                    r0 = r6
                    r6 = r7
                L_0x0050:
                    if (r0 == 0) goto L_0x0055
                    r0.close()     // Catch:{ Exception -> 0x0055 }
                L_0x0055:
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.net.TTHTTPNetwork.C515153.onResponse(okhttp3.e, okhttp3.ad):void");
            }
        });
    }

    public void startTask(String str, Map<String, String> map, final CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new C53682y().mo111653b().mo111654a(10, TimeUnit.SECONDS).mo111672c(10, TimeUnit.SECONDS).mo111668b(10, TimeUnit.SECONDS).mo111667a();
            }
        }
        C53499a a = new C53499a().mo111262a(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                a.mo111263a(str2, (String) map.get(str2));
            }
        }
        this.mCall = mClient.mo111325a(a.mo111272c());
        this.mCall.mo111246a(new C53526f() {
            public void onFailure(C53524e eVar, IOException iOException) {
                completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[SYNTHETIC, Splitter:B:26:0x0052] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.C53524e r6, okhttp3.C53504ad r7) {
                /*
                    r5 = this;
                    r6 = 0
                    okhttp3.ae r0 = r7.f132404g     // Catch:{ all -> 0x004d }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0013 }
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0013 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0013 }
                    r2 = -1
                    r2 = r1
                    r3 = -1
                    r1 = r6
                    goto L_0x001c
                L_0x0011:
                    r6 = move-exception
                    goto L_0x0050
                L_0x0013:
                    r1 = move-exception
                    com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1)     // Catch:{ all -> 0x0011 }
                    r2 = -9979(0xffffffffffffd905, float:NaN)
                    r2 = r6
                    r3 = -9979(0xffffffffffffd905, float:NaN)
                L_0x001c:
                    if (r1 != 0) goto L_0x002d
                    boolean r4 = r7.mo111275a()     // Catch:{ all -> 0x0011 }
                    if (r4 != 0) goto L_0x002d
                    java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0011 }
                    java.lang.String r3 = "http fail"
                    r1.<init>(r3)     // Catch:{ all -> 0x0011 }
                    int r3 = r7.f132400c     // Catch:{ all -> 0x0011 }
                L_0x002d:
                    if (r0 == 0) goto L_0x0034
                    r0.close()     // Catch:{ Exception -> 0x0033 }
                    goto L_0x0034
                L_0x0033:
                L_0x0034:
                    if (r1 != 0) goto L_0x003c
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r7 = r8
                    r7.onCompletion(r2, r6)
                    return
                L_0x003c:
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r6 = r8
                    com.ss.ttvideoengine.utils.Error r7 = new com.ss.ttvideoengine.utils.Error
                    java.lang.String r0 = ""
                    java.lang.String r1 = r1.toString()
                    r7.<init>(r0, r3, r1)
                    r6.onCompletion(r2, r7)
                    return
                L_0x004d:
                    r7 = move-exception
                    r0 = r6
                    r6 = r7
                L_0x0050:
                    if (r0 == 0) goto L_0x0055
                    r0.close()     // Catch:{ Exception -> 0x0055 }
                L_0x0055:
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.net.TTHTTPNetwork.C515131.onResponse(okhttp3.e, okhttp3.ad):void");
            }
        });
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new C53682y().mo111653b().mo111654a(10, TimeUnit.SECONDS).mo111672c(10, TimeUnit.SECONDS).mo111668b(10, TimeUnit.SECONDS).mo111667a();
            }
        }
        C53499a a = new C53499a().mo111262a(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                a.mo111271b(str2, (String) map.get(str2));
            }
        }
        if (i == 1) {
            a.mo111265a(C53500ac.create(JSON, String.valueOf(jSONObject)));
        }
        this.mCall = mClient.mo111325a(a.mo111272c());
        this.mCall.mo111246a(new C53526f() {
            public void onFailure(C53524e eVar, IOException iOException) {
                StringBuilder sb = new StringBuilder("startTask onFailure: ");
                sb.append(iOException.toString());
                TTVideoEngineLog.m110644d("TTHTTPNetwork", sb.toString());
                completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[Catch:{ all -> 0x0026 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[SYNTHETIC, Splitter:B:20:0x003f] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC, Splitter:B:34:0x0077] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.C53524e r8, okhttp3.C53504ad r9) throws java.io.IOException {
                /*
                    r7 = this;
                    r8 = 0
                    okhttp3.ae r0 = r9.f132404g     // Catch:{ all -> 0x0072 }
                    r1 = -9979(0xffffffffffffd905, float:NaN)
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0028 }
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0028 }
                    r3.<init>(r2)     // Catch:{ Exception -> 0x0028 }
                    java.lang.String r4 = "TTHTTPNetwork"
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0024 }
                    java.lang.String r6 = "startTask onResponse body:"
                    r5.<init>(r6)     // Catch:{ Exception -> 0x0024 }
                    r5.append(r2)     // Catch:{ Exception -> 0x0024 }
                    java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0024 }
                    com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r4, r2)     // Catch:{ Exception -> 0x0024 }
                    r2 = -1
                    r4 = r8
                    goto L_0x0033
                L_0x0024:
                    r2 = move-exception
                    goto L_0x002a
                L_0x0026:
                    r8 = move-exception
                    goto L_0x0075
                L_0x0028:
                    r2 = move-exception
                    r3 = r8
                L_0x002a:
                    java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0026 }
                    com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r2)     // Catch:{ all -> 0x0026 }
                    r2 = -9979(0xffffffffffffd905, float:NaN)
                L_0x0033:
                    boolean r5 = r9.mo111275a()     // Catch:{ all -> 0x0026 }
                    if (r5 != 0) goto L_0x003d
                    java.lang.String r4 = r9.f132401d     // Catch:{ all -> 0x0026 }
                    int r2 = r9.f132400c     // Catch:{ all -> 0x0026 }
                L_0x003d:
                    if (r0 == 0) goto L_0x0044
                    r0.close()     // Catch:{ Exception -> 0x0043 }
                    goto L_0x0044
                L_0x0043:
                L_0x0044:
                    if (r4 != 0) goto L_0x004c
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r9 = r10
                    r9.onCompletion(r3, r8)
                    return
                L_0x004c:
                    if (r2 != r1) goto L_0x005f
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r9 = r10
                    com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
                    java.lang.String r3 = ""
                    java.lang.String r4 = r4.toString()
                    r0.<init>(r3, r1, r2, r4)
                    r9.onCompletion(r8, r0)
                    return
                L_0x005f:
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r8 = r10
                    com.ss.ttvideoengine.utils.Error r9 = new com.ss.ttvideoengine.utils.Error
                    java.lang.String r0 = ""
                    r1 = -9994(0xffffffffffffd8f6, float:NaN)
                    java.lang.String r4 = r4.toString()
                    r9.<init>(r0, r1, r2, r4)
                    r8.onCompletion(r3, r9)
                    return
                L_0x0072:
                    r9 = move-exception
                    r0 = r8
                    r8 = r9
                L_0x0075:
                    if (r0 == 0) goto L_0x007a
                    r0.close()     // Catch:{ Exception -> 0x007a }
                L_0x007a:
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.net.TTHTTPNetwork.C515142.onResponse(okhttp3.e, okhttp3.ad):void");
            }
        });
    }
}
