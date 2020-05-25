package com.bytedance.p513c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.util.Pair;
import android.widget.Toast;
import com.bytedance.p513c.C9296c.C9299b;
import com.bytedance.p513c.C9328j.C9331b;
import com.bytedance.p513c.p514a.C9288a;
import com.bytedance.p513c.p515b.C9292b;
import com.bytedance.p513c.p515b.C9295c;
import com.bytedance.p513c.p516c.C9301b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.a */
public final class C9282a {

    /* renamed from: a */
    public C9295c f25383a;

    /* renamed from: b */
    public C9296c f25384b;

    /* renamed from: c */
    public C9317h f25385c;

    /* renamed from: d */
    public C9317h f25386d;

    /* renamed from: e */
    public C9289b f25387e;

    /* renamed from: f */
    private C9328j f25388f;

    /* renamed from: g */
    private boolean f25389g;

    /* renamed from: com.bytedance.c.a$a */
    static class C9287a {

        /* renamed from: a */
        public static C9282a f25399a = new C9282a();
    }

    private C9282a() {
    }

    /* renamed from: a */
    public static C9282a m18401a() {
        return C9287a.f25399a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C9317h mo16873c() {
        if (this.f25385c != null) {
            return this.f25385c;
        }
        return this.f25386d;
    }

    /* renamed from: b */
    public final void mo16872b() {
        if (this.f25389g && this.f25385c != null && this.f25385c.isShowing()) {
            this.f25385c.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo16874d() {
        if (this.f25383a != null) {
            C9292b bVar = this.f25383a.f25423b;
            bVar.f25416k = m18401a().f25384b.f25442r;
            bVar.mo16885b();
        }
    }

    /* renamed from: a */
    public static void m18402a(boolean z) {
        C9315f.f25497a = 1;
    }

    /* renamed from: a */
    public final synchronized C9282a mo16870a(final C9296c cVar) {
        boolean z;
        if (this.f25389g) {
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (cVar == null || cVar.f25441q == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        this.f25384b = cVar;
        this.f25388f = C9328j.m18487a();
        C9328j jVar = this.f25388f;
        if (jVar.f25538a == null) {
            synchronized (C9328j.class) {
                if (jVar.f25538a == null) {
                    jVar.f25538a = new HandlerThread("TuringVerifyThread");
                    jVar.f25538a.start();
                    jVar.f25539b = new C9331b(jVar.f25538a.getLooper());
                }
            }
        }
        C9302d.f25474b.put("channel", cVar.f25429e);
        C9302d.f25474b.put("app_name", cVar.f25428d);
        C9302d.f25474b.put("app_version", cVar.f25433i);
        C9302d.f25474b.put("aid", cVar.f25426b);
        C9302d.f25474b.put("sdk_version", cVar.f25430f);
        C9302d.f25474b.put("device_brand", cVar.f25437m);
        C9302d.f25474b.put("device_model", cVar.f25438n);
        C9302d.f25474b.put("os_version", cVar.f25435k);
        C9302d.f25474b.put("os_name", cVar.f25434j);
        C9302d.f25474b.put("locale", cVar.f25445u);
        C9302d.f25474b.put("iid", cVar.f25432h);
        C9302d.f25474b.put("user_id", cVar.f25439o);
        C9302d.f25474b.put("did", cVar.f25436l);
        this.f25383a = new C9295c(cVar);
        this.f25388f.mo16943a((Runnable) new Runnable() {
            public final void run() {
                C9295c cVar = C9282a.this.f25383a;
                Context context = cVar.f25441q;
                if (!cVar.f25424c) {
                    C9292b bVar = cVar.f25423b;
                    Context applicationContext = context.getApplicationContext();
                    C9299b bVar2 = cVar.f25422a.f25425a;
                    bVar.f25410b = C9301b.m18436a();
                    bVar.f25410b.mo16910a(applicationContext.getApplicationContext());
                    C9292b.f25406a = bVar2;
                    new C9288a().getClass();
                    bVar.f25411c = "{  \"h5_sg\": \"https://s0.ipstatp.com/sec-sdk/secsdk-captcha/2.4.0/index.html\",  \"h5_va\": \"https://s0.ipstatp.com/sec-sdk/secsdk-captcha/2.4.0/index.html\",  \"sms_va\": \"https://s0.ipstatp.com/sec-sdk/secsdk-mobile-original/1.8.1/index.html\",  \"sms_sg\": \"https://s0.ipstatp.com/sec-sdk/secsdk-mobile-original/1.8.1/index.html\",  \"rgb\": \"000000\",  \"alpha\": \"0.5\",  \"width\": 300,  \"height\": 331,  \"verify_sg\": \"https://verify-sg.byteoversea.com/\",  \"verify_va\": \"https://verification-va.byteoversea.com/\",  \"mobile_cdn\": \"\",  \"captcha_cdn\": \"//unpkg.pstatp.com/byted/secsdk-captcha/2.1.15/build/captcha.js\",  \"verify_cdn\": \"\",  \"period\": 300000}";
                    C9301b bVar3 = bVar.f25410b;
                    String str = "url";
                    bVar3.mo16911b();
                    String str2 = null;
                    if (bVar3.f25471a != null && bVar3.f25471a.isOpen()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        String[] strArr = {sb.toString()};
                        String[] strArr2 = {C42311c.f106865i};
                        Cursor query = bVar3.f25471a.query("h5_storage", strArr2, "primary_key=?", strArr, null, null, null, "1");
                        if (query != null) {
                            if (!query.moveToFirst()) {
                                query.close();
                            } else {
                                str2 = query.getString(0);
                                query.close();
                            }
                        }
                    }
                    if (str2 != null) {
                        bVar.f25411c = str2;
                    }
                    bVar.mo16883a();
                    if (bVar.mo16884a(bVar.f25411c)) {
                        bVar.mo16885b();
                    } else {
                        bVar.mo16887d();
                        new StringBuilder("VerifyUrl do not need update : ").append(bVar.f25412d);
                    }
                    cVar.f25424c = true;
                }
            }
        });
        this.f25389g = true;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis2);
            C9302d.m18449a(C9302d.m18446a("turing_verify_init_sdk", jSONObject).toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0079 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007a A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[Catch:{ Exception -> 0x0093 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.lang.String> m18400a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x009d
            if (r9 != 0) goto L_0x0006
            goto L_0x009d
        L_0x0006:
            r8 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0092 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r1 = "region"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r2 = "type"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0092 }
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x0092 }
            r3 = -819951495(0xffffffffcf208879, float:-2.69329843E9)
            r4 = -1
            r5 = 1
            if (r2 == r3) goto L_0x0033
            r3 = 114009(0x1bd59, float:1.5976E-40)
            if (r2 == r3) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            java.lang.String r2 = "sms"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0092 }
            if (r0 == 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x0033:
            java.lang.String r2 = "verify"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0092 }
            if (r0 == 0) goto L_0x003d
            r0 = 0
            goto L_0x003e
        L_0x003d:
            r0 = -1
        L_0x003e:
            r2 = 2
            switch(r0) {
                case 0: goto L_0x0046;
                case 1: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            r0 = 0
            goto L_0x0047
        L_0x0044:
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 2
        L_0x0047:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0093 }
            r6 = 3179(0xc6b, float:4.455E-42)
            if (r3 == r6) goto L_0x006c
            r8 = 3668(0xe54, float:5.14E-42)
            if (r3 == r8) goto L_0x0062
            r8 = 3755(0xeab, float:5.262E-42)
            if (r3 == r8) goto L_0x0058
            goto L_0x0075
        L_0x0058:
            java.lang.String r8 = "va"
            boolean r8 = r1.equals(r8)     // Catch:{ Exception -> 0x0093 }
            if (r8 == 0) goto L_0x0075
            r8 = 1
            goto L_0x0076
        L_0x0062:
            java.lang.String r8 = "sg"
            boolean r8 = r1.equals(r8)     // Catch:{ Exception -> 0x0093 }
            if (r8 == 0) goto L_0x0075
            r8 = 2
            goto L_0x0076
        L_0x006c:
            java.lang.String r2 = "cn"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0093 }
            if (r1 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r8 = -1
        L_0x0076:
            switch(r8) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0082;
                case 2: goto L_0x007a;
                default: goto L_0x0079;
            }     // Catch:{ Exception -> 0x0093 }
        L_0x0079:
            goto L_0x0093
        L_0x007a:
            com.bytedance.c.c r8 = r7.f25384b     // Catch:{ Exception -> 0x0093 }
            com.bytedance.c.c$b r1 = com.bytedance.p513c.C9296c.C9299b.REGION_SINGAPOER     // Catch:{ Exception -> 0x0093 }
            r8.mo16890a(r1)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x0082:
            com.bytedance.c.c r8 = r7.f25384b     // Catch:{ Exception -> 0x0093 }
            com.bytedance.c.c$b r1 = com.bytedance.p513c.C9296c.C9299b.REGION_USA_EAST     // Catch:{ Exception -> 0x0093 }
            r8.mo16890a(r1)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x008a:
            com.bytedance.c.c r8 = r7.f25384b     // Catch:{ Exception -> 0x0093 }
            com.bytedance.c.c$b r1 = com.bytedance.p513c.C9296c.C9299b.REGION_CHINA     // Catch:{ Exception -> 0x0093 }
            r8.mo16890a(r1)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.<init>(r0, r9)
            return r8
        L_0x009d:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 0
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p513c.C9282a.m18400a(int, java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    public final void mo16871a(final Activity activity, int i, final C9289b bVar) {
        if (this.f25389g && activity != null) {
            String str = this.f25384b.f25432h;
            String str2 = this.f25384b.f25439o;
            String str3 = this.f25384b.f25436l;
            try {
                C9302d.f25475c.lockInterruptibly();
                C9302d.f25474b.put("iid", str);
                C9302d.f25474b.put("user_id", str2);
                C9302d.f25474b.put("did", str3);
                C9302d.f25475c.unlock();
            } catch (Exception unused) {
            }
            if (VERSION.SDK_INT < 17) {
                Toast makeText = Toast.makeText(activity, activity.getResources().getString(R.string.gx0), 1);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
                bVar.mo16879a(999);
                int i2 = VERSION.SDK_INT;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", 2);
                    jSONObject.put("os_version", i2);
                    C9302d.m18449a(C9302d.m18446a("turing_verify_system_low", jSONObject).toString());
                } catch (JSONException unused2) {
                }
            } else {
                final Pair a = m18400a(2, this.f25384b.f25449y);
                if (((Integer) a.first).intValue() == 0) {
                    bVar.mo16879a(997);
                } else {
                    this.f25388f.mo16943a((Runnable) new Runnable() {
                        public final void run() {
                            final String a = C9282a.this.f25383a.mo16888a(activity, ((Integer) a.first).intValue(), (String) a.second);
                            if (!activity.isFinishing()) {
                                activity.runOnUiThread(new Runnable() {
                                    public final void run() {
                                        if (C9282a.this.f25385c != null && C9282a.this.f25385c.isShowing()) {
                                            if (C9282a.this.f25387e != null) {
                                                C9282a.this.f25385c.f25509i = false;
                                                C9282a.this.f25387e.mo16879a(998);
                                                int intValue = ((Integer) a.first).intValue();
                                                JSONObject jSONObject = new JSONObject();
                                                try {
                                                    jSONObject.put("type", intValue);
                                                    C9302d.m18449a(C9302d.m18446a("turing_verify_pop_override", jSONObject).toString());
                                                } catch (JSONException unused) {
                                                }
                                                C9282a.this.f25387e = null;
                                            }
                                            C9317h hVar = C9282a.this.f25385c;
                                            hVar.f25512l = "override_close";
                                            hVar.dismiss();
                                        }
                                        C9282a aVar = C9282a.this;
                                        Activity activity = activity;
                                        int intValue2 = ((Integer) a.first).intValue();
                                        C9289b bVar = bVar;
                                        String str = a;
                                        C9302d.f25473a = System.currentTimeMillis();
                                        aVar.f25387e = bVar;
                                        C9317h hVar2 = new C9317h(activity, intValue2, aVar.f25384b.f25442r, str, aVar.f25387e);
                                        aVar.f25385c = hVar2;
                                        aVar.f25385c.setOnDismissListener(new OnDismissListener() {
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                if (dialogInterface.equals(C9282a.this.f25385c)) {
                                                    C9282a.this.f25386d = C9282a.this.f25385c;
                                                    C9282a.this.f25385c = null;
                                                }
                                            }
                                        });
                                        aVar.f25385c.show();
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("type", intValue2);
                                            C9302d.m18449a(C9302d.m18446a("turing_verify_pop", jSONObject2).toString());
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
    }
}
