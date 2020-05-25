package com.p683ss.mediakit.net;

import com.p683ss.mediakit.net.TTVNetClient.CompletionListener;
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

/* renamed from: com.ss.mediakit.net.TTHTTPNetwork */
public class TTHTTPNetwork extends TTVNetClient {
    public static final C53678w JSON = C53678w.m114225a("application/json");
    private static C53682y mClient;
    private C53524e mCall;

    public void cancel() {
        if (this.mCall != null && !this.mCall.mo111250d()) {
            this.mCall.mo111248c();
        }
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
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC, Splitter:B:26:0x0046] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.C53524e r5, okhttp3.C53504ad r6) {
                /*
                    r4 = this;
                    r5 = 0
                    okhttp3.ae r0 = r6.f132404g     // Catch:{ all -> 0x0041 }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0011 }
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0011 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0011 }
                    r2 = r1
                    r1 = r5
                    goto L_0x0013
                L_0x000f:
                    r5 = move-exception
                    goto L_0x0044
                L_0x0011:
                    r1 = move-exception
                    r2 = r5
                L_0x0013:
                    if (r1 != 0) goto L_0x0022
                    boolean r6 = r6.mo111275a()     // Catch:{ all -> 0x000f }
                    if (r6 != 0) goto L_0x0022
                    java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x000f }
                    java.lang.String r6 = "http fail"
                    r1.<init>(r6)     // Catch:{ all -> 0x000f }
                L_0x0022:
                    if (r0 == 0) goto L_0x0029
                    r0.close()     // Catch:{ Exception -> 0x0028 }
                    goto L_0x0029
                L_0x0028:
                L_0x0029:
                    if (r1 != 0) goto L_0x0031
                    com.ss.mediakit.net.TTVNetClient$CompletionListener r6 = r8
                    r6.onCompletion(r2, r5)
                    return
                L_0x0031:
                    com.ss.mediakit.net.TTVNetClient$CompletionListener r6 = r8
                    com.ss.mediakit.net.Error r0 = new com.ss.mediakit.net.Error
                    r3 = 0
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r3, r5, r5, r1)
                    r6.onCompletion(r2, r0)
                    return
                L_0x0041:
                    r6 = move-exception
                    r0 = r5
                    r5 = r6
                L_0x0044:
                    if (r0 == 0) goto L_0x0049
                    r0.close()     // Catch:{ Exception -> 0x0049 }
                L_0x0049:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.net.TTHTTPNetwork.C513681.onResponse(okhttp3.e, okhttp3.ad):void");
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
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.C53524e r5, okhttp3.C53504ad r6) throws java.io.IOException {
                /*
                    r4 = this;
                    r5 = 0
                    okhttp3.ae r0 = r6.f132404g     // Catch:{ all -> 0x003d }
                    java.lang.String r1 = r0.string()     // Catch:{ Exception -> 0x0010 }
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0010 }
                    r2.<init>(r1)     // Catch:{ Exception -> 0x0010 }
                    r1 = r5
                    goto L_0x0016
                L_0x000e:
                    r5 = move-exception
                    goto L_0x0040
                L_0x0010:
                    r1 = move-exception
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x000e }
                    r2 = r5
                L_0x0016:
                    boolean r3 = r6.mo111275a()     // Catch:{ all -> 0x000e }
                    if (r3 != 0) goto L_0x001e
                    java.lang.String r1 = r6.f132401d     // Catch:{ all -> 0x000e }
                L_0x001e:
                    if (r0 == 0) goto L_0x0025
                    r0.close()     // Catch:{ Exception -> 0x0024 }
                    goto L_0x0025
                L_0x0024:
                L_0x0025:
                    if (r1 != 0) goto L_0x002d
                    com.ss.mediakit.net.TTVNetClient$CompletionListener r6 = r10
                    r6.onCompletion(r2, r5)
                    return
                L_0x002d:
                    com.ss.mediakit.net.TTVNetClient$CompletionListener r6 = r10
                    com.ss.mediakit.net.Error r0 = new com.ss.mediakit.net.Error
                    r3 = 0
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r3, r5, r5, r1)
                    r6.onCompletion(r2, r0)
                    return
                L_0x003d:
                    r6 = move-exception
                    r0 = r5
                    r5 = r6
                L_0x0040:
                    if (r0 == 0) goto L_0x0045
                    r0.close()     // Catch:{ Exception -> 0x0045 }
                L_0x0045:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.net.TTHTTPNetwork.C513692.onResponse(okhttp3.e, okhttp3.ad):void");
            }
        });
    }
}
