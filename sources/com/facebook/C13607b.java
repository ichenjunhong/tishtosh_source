package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.content.C0732g;
import com.facebook.AccessToken.C13489a;
import com.facebook.C14564s.C14565a;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
public final class C13607b {

    /* renamed from: d */
    private static volatile C13607b f35506d;

    /* renamed from: a */
    final C13507a f35507a;

    /* renamed from: b */
    public AccessToken f35508b;

    /* renamed from: c */
    public AtomicBoolean f35509c = new AtomicBoolean(false);

    /* renamed from: e */
    private final C0732g f35510e;

    /* renamed from: f */
    private Date f35511f = new Date(0);

    /* renamed from: com.facebook.b$a */
    static class C13612a {

        /* renamed from: a */
        public String f35529a;

        /* renamed from: b */
        public int f35530b;

        /* renamed from: c */
        public Long f35531c;

        private C13612a() {
        }
    }

    /* renamed from: a */
    static C13607b m27474a() {
        if (f35506d == null) {
            synchronized (C13607b.class) {
                if (f35506d == null) {
                    f35506d = new C13607b(C0732g.m2130a(C14533n.m29773g()), new C13507a());
                }
            }
        }
        return f35506d;
    }

    /* renamed from: c */
    private static void m27476c() {
        Context g = C14533n.m29773g();
        AccessToken a = AccessToken.m27253a();
        AlarmManager alarmManager = (AlarmManager) g.getSystemService("alarm");
        if (AccessToken.m27257b() && a.f35172a != null && alarmManager != null) {
            Intent intent = new Intent(g, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, a.f35172a.getTime(), PendingIntent.getBroadcast(g, 0, intent, 0));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25463b() {
        /*
            r6 = this;
            com.facebook.AccessToken r0 = r6.f35508b
            if (r0 == 0) goto L_0x0041
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.facebook.AccessToken r1 = r6.f35508b
            com.facebook.d r1 = r1.f35177f
            boolean r1 = r1.canExtendToken
            if (r1 == 0) goto L_0x0041
            long r1 = r0.longValue()
            java.util.Date r3 = r6.f35511f
            long r3 = r3.getTime()
            long r1 = r1 - r3
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0041
            long r0 = r0.longValue()
            com.facebook.AccessToken r2 = r6.f35508b
            java.util.Date r2 = r2.f35178g
            long r2 = r2.getTime()
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 != 0) goto L_0x0045
            return
        L_0x0045:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0058
            r6.mo25459a(r1)
            return
        L_0x0058:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            com.facebook.b$1 r2 = new com.facebook.b$1
            r2.<init>(r1)
            r0.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C13607b.mo25463b():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25460a(AccessToken accessToken) {
        mo25462a(accessToken, true);
    }

    /* renamed from: a */
    public final void mo25459a(C13489a aVar) {
        AccessToken accessToken = this.f35508b;
        if (accessToken == null) {
            if (aVar != null) {
                new C14457k("No current access token to refresh");
            }
        } else if (!this.f35509c.compareAndSet(false, true)) {
            if (aVar != null) {
                new C14457k("Refresh already in progress");
            }
        } else {
            this.f35511f = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C13612a aVar2 = new C13612a();
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            C136092 r8 = r0;
            final HashSet hashSet4 = hashSet;
            final HashSet hashSet5 = hashSet2;
            HashSet hashSet6 = hashSet2;
            final HashSet hashSet7 = hashSet3;
            C136092 r0 = new C13501b() {
                /* renamed from: a */
                public final void mo25316a(C14696t tVar) {
                    JSONObject jSONObject = tVar.f38084b;
                    if (jSONObject != null) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("data");
                        if (optJSONArray != null) {
                            atomicBoolean2.set(true);
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString("status");
                                    if (!C14277aa.m29276a(optString) && !C14277aa.m29276a(optString2)) {
                                        String lowerCase = optString2.toLowerCase(Locale.US);
                                        if (lowerCase.equals("granted")) {
                                            hashSet4.add(optString);
                                        } else if (lowerCase.equals("declined")) {
                                            hashSet5.add(optString);
                                        } else if (lowerCase.equals("expired")) {
                                            hashSet7.add(optString);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            };
            C14564s sVar = new C14564s(m27473a(accessToken, (C13501b) r8), m27475b(accessToken, new C13501b() {
                /* renamed from: a */
                public final void mo25316a(C14696t tVar) {
                    JSONObject jSONObject = tVar.f38084b;
                    if (jSONObject != null) {
                        aVar2.f35529a = jSONObject.optString("access_token");
                        aVar2.f35530b = jSONObject.optInt("expires_at");
                        aVar2.f35531c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    }
                }
            }));
            final AccessToken accessToken2 = accessToken;
            final C13489a aVar3 = aVar;
            final AtomicBoolean atomicBoolean3 = atomicBoolean;
            final C13612a aVar4 = aVar2;
            final HashSet hashSet8 = hashSet;
            final HashSet hashSet9 = hashSet6;
            final HashSet hashSet10 = hashSet3;
            C136114 r02 = new C14565a() {
                /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0042=Splitter:B:18:0x0042, B:51:0x00e8=Splitter:B:51:0x00e8} */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo25465a(com.facebook.C14564s r18) {
                    /*
                        r17 = this;
                        r1 = r17
                        r2 = 0
                        com.facebook.b r0 = com.facebook.C13607b.m27474a()     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r0 = r0.f35508b     // Catch:{ all -> 0x00fb }
                        if (r0 == 0) goto L_0x00e8
                        com.facebook.b r0 = com.facebook.C13607b.m27474a()     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r0 = r0.f35508b     // Catch:{ all -> 0x00fb }
                        java.lang.String r0 = r0.f35180i     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f35180i     // Catch:{ all -> 0x00fb }
                        if (r0 == r3) goto L_0x001b
                        goto L_0x00e8
                    L_0x001b:
                        java.util.concurrent.atomic.AtomicBoolean r0 = r4     // Catch:{ all -> 0x00fb }
                        boolean r0 = r0.get()     // Catch:{ all -> 0x00fb }
                        if (r0 != 0) goto L_0x0042
                        com.facebook.b$a r0 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.String r0 = r0.f35529a     // Catch:{ all -> 0x00fb }
                        if (r0 != 0) goto L_0x0042
                        com.facebook.b$a r0 = r5     // Catch:{ all -> 0x00fb }
                        int r0 = r0.f35530b     // Catch:{ all -> 0x00fb }
                        if (r0 != 0) goto L_0x0042
                        com.facebook.AccessToken$a r0 = r3     // Catch:{ all -> 0x00fb }
                        if (r0 == 0) goto L_0x003a
                        com.facebook.k r0 = new com.facebook.k     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = "Failed to refresh access token"
                        r0.<init>(r3)     // Catch:{ all -> 0x00fb }
                    L_0x003a:
                        com.facebook.b r0 = com.facebook.C13607b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f35509c
                        r0.set(r2)
                        return
                    L_0x0042:
                        com.facebook.AccessToken r0 = new com.facebook.AccessToken     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f35529a     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x004f
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f35529a     // Catch:{ all -> 0x00fb }
                        goto L_0x0053
                    L_0x004f:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f35176e     // Catch:{ all -> 0x00fb }
                    L_0x0053:
                        r4 = r3
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r5 = r3.f35179h     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r6 = r3.f35180i     // Catch:{ all -> 0x00fb }
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00fb }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x0068
                        java.util.Set r3 = r6     // Catch:{ all -> 0x00fb }
                    L_0x0066:
                        r7 = r3
                        goto L_0x006d
                    L_0x0068:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Set<java.lang.String> r3 = r3.f35173b     // Catch:{ all -> 0x00fb }
                        goto L_0x0066
                    L_0x006d:
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00fb }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x0079
                        java.util.Set r3 = r7     // Catch:{ all -> 0x00fb }
                    L_0x0077:
                        r8 = r3
                        goto L_0x007e
                    L_0x0079:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Set<java.lang.String> r3 = r3.f35174c     // Catch:{ all -> 0x00fb }
                        goto L_0x0077
                    L_0x007e:
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00fb }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x008a
                        java.util.Set r3 = r8     // Catch:{ all -> 0x00fb }
                    L_0x0088:
                        r9 = r3
                        goto L_0x008f
                    L_0x008a:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Set<java.lang.String> r3 = r3.f35175d     // Catch:{ all -> 0x00fb }
                        goto L_0x0088
                    L_0x008f:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        com.facebook.d r10 = r3.f35177f     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        int r3 = r3.f35530b     // Catch:{ all -> 0x00fb }
                        r11 = 1000(0x3e8, double:4.94E-321)
                        if (r3 == 0) goto L_0x00a8
                        java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r13 = r5     // Catch:{ all -> 0x00fb }
                        int r13 = r13.f35530b     // Catch:{ all -> 0x00fb }
                        long r13 = (long) r13     // Catch:{ all -> 0x00fb }
                        long r13 = r13 * r11
                        r3.<init>(r13)     // Catch:{ all -> 0x00fb }
                        goto L_0x00ac
                    L_0x00a8:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Date r3 = r3.f35172a     // Catch:{ all -> 0x00fb }
                    L_0x00ac:
                        r13 = r3
                        java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x00fb }
                        r14.<init>()     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.Long r3 = r3.f35531c     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x00c8
                        java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r15 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.Long r15 = r15.f35531c     // Catch:{ all -> 0x00fb }
                        long r15 = r15.longValue()     // Catch:{ all -> 0x00fb }
                        long r11 = r11 * r15
                        r3.<init>(r11)     // Catch:{ all -> 0x00fb }
                        goto L_0x00cc
                    L_0x00c8:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Date r3 = r3.f35181j     // Catch:{ all -> 0x00fb }
                    L_0x00cc:
                        r15 = r3
                        r3 = r0
                        r11 = r13
                        r12 = r14
                        r13 = r15
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00fb }
                        com.facebook.b r3 = com.facebook.C13607b.m27474a()     // Catch:{ all -> 0x00fb }
                        r3.mo25460a(r0)     // Catch:{ all -> 0x00fb }
                        com.facebook.b r0 = com.facebook.C13607b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f35509c
                        r0.set(r2)
                        com.facebook.AccessToken$a r0 = r3
                        if (r0 == 0) goto L_0x00e7
                        return
                    L_0x00e7:
                        return
                    L_0x00e8:
                        com.facebook.AccessToken$a r0 = r3     // Catch:{ all -> 0x00fb }
                        if (r0 == 0) goto L_0x00f3
                        com.facebook.k r0 = new com.facebook.k     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = "No current access token to refresh"
                        r0.<init>(r3)     // Catch:{ all -> 0x00fb }
                    L_0x00f3:
                        com.facebook.b r0 = com.facebook.C13607b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f35509c
                        r0.set(r2)
                        return
                    L_0x00fb:
                        r0 = move-exception
                        com.facebook.b r3 = com.facebook.C13607b.this
                        java.util.concurrent.atomic.AtomicBoolean r3 = r3.f35509c
                        r3.set(r2)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.C13607b.C136114.mo25465a(com.facebook.s):void");
                }
            };
            sVar.mo26803a((C14565a) r02);
            sVar.mo26802a();
        }
    }

    /* renamed from: a */
    private static GraphRequest m27473a(AccessToken accessToken, C13501b bVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me/permissions", new Bundle(), C14697u.GET, bVar);
        return graphRequest;
    }

    /* renamed from: b */
    private static GraphRequest m27475b(AccessToken accessToken, C13501b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        GraphRequest graphRequest = new GraphRequest(accessToken, "oauth/access_token", bundle, C14697u.GET, bVar);
        return graphRequest;
    }

    private C13607b(C0732g gVar, C13507a aVar) {
        C14283ab.m29306a((Object) gVar, "localBroadcastManager");
        C14283ab.m29306a((Object) aVar, "accessTokenCache");
        this.f35510e = gVar;
        this.f35507a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25461a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C14533n.m29773g(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f35510e.mo2404a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25462a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f35508b;
        this.f35508b = accessToken;
        this.f35509c.set(false);
        this.f35511f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f35507a.mo25335a(accessToken);
            } else {
                this.f35507a.mo25336b();
                C13615c.m27490a(C14533n.m29773g());
            }
        }
        if (!C14277aa.m29275a(accessToken2, accessToken)) {
            mo25461a(accessToken2, accessToken);
            m27476c();
        }
    }
}
