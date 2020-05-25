package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14943ad;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ta */
public final class C16256ta implements Callable<abb> {

    /* renamed from: f */
    private static long f45567f = 10;

    /* renamed from: a */
    final Context f45568a;

    /* renamed from: b */
    final C14943ad f45569b;

    /* renamed from: c */
    final beh f45570c;

    /* renamed from: d */
    final abc f45571d;

    /* renamed from: e */
    final C15806ck f45572e;

    /* renamed from: g */
    private final adr f45573g;

    /* renamed from: h */
    private final C16276tu f45574h;

    /* renamed from: i */
    private final Object f45575i = new Object();

    /* renamed from: j */
    private boolean f45576j;

    /* renamed from: k */
    private int f45577k;

    /* renamed from: l */
    private List<String> f45578l;

    /* renamed from: m */
    private JSONObject f45579m;

    /* renamed from: n */
    private String f45580n;

    /* renamed from: o */
    private String f45581o;

    public C16256ta(Context context, C14943ad adVar, adr adr, beh beh, abc abc, C15806ck ckVar) {
        this.f45568a = context;
        this.f45569b = adVar;
        this.f45573g = adr;
        this.f45571d = abc;
        this.f45570c = beh;
        this.f45572e = ckVar;
        this.f45574h = adVar.mo27510G();
        this.f45576j = false;
        this.f45577k = -2;
        this.f45578l = null;
        this.f45580n = null;
        this.f45581o = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3.length() != 0) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0176 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0178 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ea A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.abb call() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.internal.ad r2 = r15.f45569b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r11 = r2.f38518n     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r2 = r15.m38816b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r2 != 0) goto L_0x006c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abc r3 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxi r3 = r3.f40130b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r3 = r3.f46184b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r2.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abc r4 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxi r4 = r4.f40130b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = r4.f46184b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            int r4 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0035
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            if (r3 == 0) goto L_0x003e
            int r3 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 != 0) goto L_0x0042
        L_0x003e:
            r3 = 3
            r15.m38813a(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x0042:
            com.google.android.gms.internal.ads.tu r3 = r15.f45574h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.aga r2 = r3.mo31413a(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            long r3 = f45567f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r3 = "success"
            boolean r3 = r2.optBoolean(r3, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r8 = r2
            goto L_0x006d
        L_0x006c:
            r8 = r1
        L_0x006d:
            if (r8 == 0) goto L_0x0076
            java.lang.String r2 = "enable_omid"
            boolean r2 = r8.optBoolean(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            if (r2 != 0) goto L_0x007f
            com.google.android.gms.internal.ads.afz r3 = com.google.android.gms.internal.ads.afp.m32820a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x007d:
            r12 = r3
            goto L_0x00ad
        L_0x007f:
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r8.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 != 0) goto L_0x008c
            com.google.android.gms.internal.ads.afz r3 = com.google.android.gms.internal.ads.afp.m32820a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x007d
        L_0x008c:
            java.lang.String r4 = "omid_html"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.afz r3 = com.google.android.gms.internal.ads.afp.m32820a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x007d
        L_0x009d:
            com.google.android.gms.internal.ads.afz r4 = com.google.android.gms.internal.ads.afp.m32820a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tb r5 = new com.google.android.gms.internal.ads.tb     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r5.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.ads.agf.f40430a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.aga r3 = com.google.android.gms.internal.ads.afp.m32822a(r4, r5, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x007d
        L_0x00ad:
            boolean r3 = r15.m38816b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 != 0) goto L_0x016b
            if (r8 != 0) goto L_0x00b7
            goto L_0x016b
        L_0x00b7:
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = "instream"
            java.lang.String r5 = "type"
            java.lang.String r5 = r8.optString(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = r4.equals(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abc r5 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r5 = r5.f40129a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r5 = r5.f46154y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r5 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.abc r5 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r5 = r5.f40129a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r5 = r5.f46154y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r5 = r5.f46066b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x00db
        L_0x00da:
            r5 = 0
        L_0x00db:
            com.google.android.gms.internal.ads.abc r6 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r6 = r6.f40129a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r6 = r6.f46154y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r6 == 0) goto L_0x00ec
            com.google.android.gms.internal.ads.abc r6 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r6 = r6.f40129a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r6 = r6.f46154y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r6 = r6.f46068d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x00ed
        L_0x00ec:
            r6 = 0
        L_0x00ed:
            if (r4 == 0) goto L_0x00f6
            com.google.android.gms.internal.ads.sz r3 = new com.google.android.gms.internal.ads.sz     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x00f6:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x0108
            com.google.android.gms.internal.ads.tv r3 = new com.google.android.gms.internal.ads.tv     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abc r4 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = r4.f40138j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x0108:
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.tw r3 = new com.google.android.gms.internal.ads.tw     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abc r4 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = r4.f40138j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x011a:
            java.lang.String r4 = "3"
            boolean r3 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = "custom_template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.agl r4 = new com.google.android.gms.internal.ads.agl     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r4.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            android.os.Handler r6 = com.google.android.gms.internal.ads.acd.f40245a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.td r7 = new com.google.android.gms.internal.ads.td     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r7.<init>(r15, r4, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r6.post(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            long r6 = f45567f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.Object r3 = r4.get(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0147
            com.google.android.gms.internal.ads.tx r3 = new com.google.android.gms.internal.ads.tx     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x0147:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r4 = "custom_template_id"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            int r5 = r4.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r5 == 0) goto L_0x015e
            java.lang.String r3 = r3.concat(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x0164
        L_0x015e:
            java.lang.String r4 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r4.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3 = r4
        L_0x0164:
            com.google.android.gms.internal.ads.abv.m32794c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016b
        L_0x0168:
            r15.m38813a(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x016b:
            r3 = r1
        L_0x016c:
            boolean r4 = r15.m38816b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 != 0) goto L_0x01e5
            if (r3 == 0) goto L_0x01e5
            if (r8 != 0) goto L_0x0178
            goto L_0x01e5
        L_0x0178:
            java.lang.String r4 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r5 = "impression_tracking_urls"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r5 != 0) goto L_0x0188
            r6 = r1
            goto L_0x019e
        L_0x0188:
            int r6 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r7 = 0
        L_0x018f:
            int r9 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r7 >= r9) goto L_0x019e
            java.lang.String r9 = r5.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r6[r7] = r9     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            int r7 = r7 + 1
            goto L_0x018f
        L_0x019e:
            if (r6 != 0) goto L_0x01a2
            r5 = r1
            goto L_0x01a6
        L_0x01a2:
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x01a6:
            r15.f45578l = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r5 = "active_view"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r15.f45579m = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = "debug_signals"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r15.f45580n = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = "omid_settings"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r15.f45581o = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.dt r13 = r3.mo31391a(r15, r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r13 != 0) goto L_0x01cc
            java.lang.String r3 = "Failed to retrieve ad assets."
            com.google.android.gms.internal.ads.abv.m32794c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x01e5
        L_0x01cc:
            com.google.android.gms.internal.ads.dv r14 = new com.google.android.gms.internal.ads.dv     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            android.content.Context r4 = r15.f45568a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.ads.internal.ad r5 = r15.f45569b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tu r6 = r15.f45574h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.beh r7 = r15.f45570c     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abc r3 = r15.f45571d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r3 = r3.f40129a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzbgz r10 = r3.f46140k     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3 = r14
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r13.mo30919a(r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x01e6
        L_0x01e5:
            r13 = r1
        L_0x01e6:
            boolean r3 = r13 instanceof com.google.android.gms.internal.ads.C15832dj     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x01f9
            r3 = r13
            com.google.android.gms.internal.ads.dj r3 = (com.google.android.gms.internal.ads.C15832dj) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.te r4 = new com.google.android.gms.internal.ads.te     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r4.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tu r3 = r15.f45574h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r5 = "/nativeAdCustomClick"
            r3.mo31415a(r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x01f9:
            com.google.android.gms.internal.ads.abb r2 = r15.m38810a(r13, r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.ads.internal.ad r3 = r15.f45569b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.ama r4 = m38814b(r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.f38516l = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            return r2
        L_0x0206:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            com.google.android.gms.internal.ads.abv.m32795c(r3, r2)
            goto L_0x021a
        L_0x020d:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            com.google.android.gms.internal.ads.abv.m32795c(r3, r2)
            goto L_0x021a
        L_0x0214:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
            com.google.android.gms.internal.ads.abv.m32795c(r3, r2)
        L_0x021a:
            boolean r2 = r15.f45576j
            if (r2 != 0) goto L_0x0221
            r15.m38813a(r0)
        L_0x0221:
            com.google.android.gms.internal.ads.abb r0 = r15.m38810a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16256ta.call():com.google.android.gms.internal.ads.abb");
    }

    /* renamed from: b */
    private static ama m38814b(aga<ama> aga) {
        try {
            return (ama) aga.get((long) ((Integer) caf.m37099d().mo30717a(C15740bx.f44281bO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            afc.m32795c("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            afc.m32795c("", e2);
            return null;
        }
    }

    /* renamed from: a */
    private final abb m38810a(C15843dt dtVar, boolean z) {
        int i;
        synchronized (this.f45575i) {
            i = (dtVar == null && this.f45577k == -2) ? 0 : this.f45577k;
        }
        abb abb = new abb(this.f45571d.f40129a.f46132c, null, this.f45571d.f40130b.f46185c, i, this.f45571d.f40130b.f46187e, this.f45578l, this.f45571d.f40130b.f46193k, this.f45571d.f40130b.f46192j, this.f45571d.f40129a.f46138i, false, null, null, null, null, null, 0, this.f45571d.f40132d, this.f45571d.f40130b.f46188f, this.f45571d.f40134f, this.f45571d.f40135g, this.f45571d.f40130b.f46196n, this.f45579m, i != -2 ? null : dtVar, null, null, null, this.f45571d.f40130b.f46159D, this.f45571d.f40130b.f46160E, null, this.f45571d.f40130b.f46163H, this.f45580n, this.f45571d.f40137i, this.f45571d.f40130b.f46170O, this.f45571d.f40138j, z, this.f45571d.f40130b.f46173R, this.f45571d.f40130b.f46174S, this.f45581o, this.f45571d.f40130b.f46177V, this.f45571d.f40130b.f46178W);
        return abb;
    }

    /* renamed from: a */
    public final aga<C15819cx> mo31392a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return afp.m32820a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m38815b(optJSONObject, "text_color");
        Integer b2 = m38815b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f45571d.f40129a.f46154y == null || this.f45571d.f40129a.f46154y.f46065a < 2) ? 1 : this.f45571d.f40129a.f46154y.f46069e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<aga> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = mo31396a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(mo31394a(optJSONObject, "image", false, false));
        }
        agl agl = new agl();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (aga a : arrayList) {
            List list = arrayList;
            a.mo28797a(new C16263th(atomicInteger, size, agl, arrayList), acb.f40240a);
            arrayList = list;
        }
        agl agl2 = agl;
        C16261tf tfVar = new C16261tf(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean);
        return afp.m32823a((aga<A>) agl2, (afl<A, B>) tfVar, (Executor) acb.f40240a);
    }

    /* renamed from: b */
    private static Integer m38815b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final aga<C15827de> mo31394a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return mo31395a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public final List<aga<C15827de>> mo31396a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mo31397a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(mo31395a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final aga<C15827de> mo31395a(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String str;
        if (z) {
            str = jSONObject.getString("url");
        } else {
            str = jSONObject.optString("url");
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(str)) {
            mo31397a(0, z);
            return afp.m32820a(null);
        }
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z2) {
            C15827de deVar = new C15827de(null, Uri.parse(str), optDouble, optInt, optInt2);
            return afp.m32820a(deVar);
        }
        adr adr = this.f45573g;
        C16262tg tgVar = new C16262tg(this, z, optDouble, optBoolean, str, optInt, optInt2);
        return adr.mo28735a(str, (adx<T>) tgVar);
    }

    /* renamed from: a */
    public final aga<ama> mo31393a(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return afp.m32820a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            abv.m32798e("Required field 'vast_xml' is missing");
            return afp.m32820a(null);
        }
        C16266tk a = m38812a(this.f45568a, this.f45570c, this.f45571d, this.f45572e, this.f45569b);
        boolean equals = "instream".equals(jSONObject.optString("type"));
        agl agl = new agl();
        agf.f40430a.execute(new C16267tl(a, equals, optJSONObject, agl));
        return agl;
    }

    /* renamed from: b */
    private final boolean m38816b() {
        boolean z;
        synchronized (this.f45575i) {
            z = this.f45576j;
        }
        return z;
    }

    /* renamed from: a */
    private final void m38813a(int i) {
        synchronized (this.f45575i) {
            this.f45576j = true;
            this.f45577k = i;
        }
    }

    /* renamed from: a */
    public final void mo31397a(int i, boolean z) {
        if (z) {
            m38813a(i);
        }
    }

    /* renamed from: a */
    static ama m38811a(aga<ama> aga) {
        try {
            return (ama) aga.get((long) ((Integer) caf.m37099d().mo30717a(C15740bx.f44280bN)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            abv.m32795c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            abv.m32795c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* renamed from: a */
    static C16266tk m38812a(Context context, beh beh, abc abc, C15806ck ckVar, C14943ad adVar) {
        C16266tk tkVar = new C16266tk(context, beh, abc, ckVar, adVar);
        return tkVar;
    }
}
