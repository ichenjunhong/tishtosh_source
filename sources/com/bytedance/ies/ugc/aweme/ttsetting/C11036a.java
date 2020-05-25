package com.bytedance.ies.ugc.aweme.ttsetting;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataBean;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.google.gson.C17971f;
import com.google.gson.C18082l;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a */
public final class C11036a {

    /* renamed from: a */
    static volatile TTSettingData f29640a;

    /* renamed from: b */
    static volatile JSONObject f29641b;

    /* renamed from: c */
    public static final C11036a f29642c = new C11036a();

    /* renamed from: d */
    private static ArrayList<Object> f29643d;

    /* renamed from: e */
    private static ArrayList<C11043b> f29644e;

    /* renamed from: f */
    private static boolean f29645f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static boolean f29646g = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a */
    public static final class C11037a implements C12743e<C18082l> {

        /* renamed from: a */
        final /* synthetic */ C52727e f29647a;

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$a */
        static final class C11038a implements Runnable {

            /* renamed from: a */
            public static final C11038a f29648a = new C11038a();

            C11038a() {
            }

            public final void run() {
                C11036a.f29642c.mo19940a();
            }
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$b */
        static final class C11039b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11037a f29649a;

            /* renamed from: b */
            final /* synthetic */ C12799u f29650b;

            C11039b(C11037a aVar, C12799u uVar) {
                this.f29649a = aVar;
                this.f29650b = uVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
                if (r2 == null) goto L_0x0016;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.bytedance.retrofit2.u r0 = r4.f29650b
                    if (r0 == 0) goto L_0x0009
                    T r0 = r0.f33552b
                    com.google.gson.l r0 = (com.google.gson.C18082l) r0
                    goto L_0x000a
                L_0x0009:
                    r0 = 0
                L_0x000a:
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r1 = r4.f29649a
                    d.f.b.v$e r1 = r1.f29647a
                    if (r0 == 0) goto L_0x0016
                    java.lang.String r2 = r0.toString()
                    if (r2 != 0) goto L_0x0018
                L_0x0016:
                    java.lang.String r2 = ""
                L_0x0018:
                    r1.element = r2
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r1 = r4.f29649a
                    d.f.b.v$e r1 = r1.f29647a
                    T r1 = r1.element
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 == 0) goto L_0x0030
                    com.bytedance.ies.ugc.aweme.ttsetting.a r0 = com.bytedance.ies.ugc.aweme.ttsetting.C11036a.f29642c
                    r0.mo19940a()
                    return
                L_0x0030:
                    com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse r1 = new com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse
                    com.google.gson.f r2 = new com.google.gson.f
                    r2.<init>()
                    java.lang.Class<com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData> r3 = com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData.class
                    java.lang.Object r0 = r2.mo34881a(r0, r3)
                    java.lang.String r2 = "Gson().fromJson(response…TSettingData::class.java)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                    com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData r0 = (com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData) r0
                    org.json.JSONObject r2 = new org.json.JSONObject
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r3 = r4.f29649a
                    d.f.b.v$e r3 = r3.f29647a
                    T r3 = r3.element
                    java.lang.String r3 = (java.lang.String) r3
                    r2.<init>(r3)
                    r1.<init>(r0, r2)
                    com.bytedance.ies.ugc.aweme.ttsetting.a r0 = com.bytedance.ies.ugc.aweme.ttsetting.C11036a.f29642c
                    boolean r0 = com.bytedance.ies.ugc.aweme.ttsetting.C11036a.f29646g
                    if (r0 == 0) goto L_0x006a
                    com.bytedance.ies.ugc.aweme.ttsetting.a r0 = com.bytedance.ies.ugc.aweme.ttsetting.C11036a.f29642c
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r2 = r4.f29649a
                    d.f.b.v$e r2 = r2.f29647a
                    T r2 = r2.element
                    java.lang.String r2 = (java.lang.String) r2
                    r0.mo19941a(r1, r2)
                    return
                L_0x006a:
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r2 = android.os.Looper.getMainLooper()
                    r0.<init>(r2)
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a$b$1 r2 = new com.bytedance.ies.ugc.aweme.ttsetting.a$a$b$1
                    r2.<init>(r4, r1)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    r0.post(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.ttsetting.C11036a.C11037a.C11039b.run():void");
            }
        }

        C11037a(C52727e eVar) {
            this.f29647a = eVar;
        }

        /* renamed from: a */
        public final void mo19942a(C12690b<C18082l> bVar, C12799u<C18082l> uVar) {
            C24076h.m58904e().submit(new C11039b(this, uVar));
        }

        /* renamed from: a */
        public final void mo19943a(C12690b<C18082l> bVar, Throwable th) {
            C52711k.m112240b(bVar, "call");
            C52711k.m112240b(th, "t");
            if (C11036a.f29646g) {
                C24076h.m58904e().submit(C11038a.f29648a);
            } else {
                C11036a.f29642c.mo19940a();
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$b */
    static final class C11041b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f29653a;

        C11041b(String str) {
            this.f29653a = str;
        }

        public final void run() {
            C11036a aVar = C11036a.f29642c;
            C11036a.f29640a = (TTSettingData) new C17971f().mo34884a(this.f29653a, TTSettingData.class);
            C11036a aVar2 = C11036a.f29642c;
            C11036a.f29641b = new JSONObject(this.f29653a);
            if (C11036a.f29646g) {
                C11036a.m22357b();
            } else {
                new Handler(Looper.getMainLooper()).post(C110421.f29654a);
            }
        }
    }

    private C11036a() {
    }

    /* renamed from: b */
    public static void m22357b() {
        ArrayList<Object> arrayList = f29643d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                TTSettingData tTSettingData = f29640a;
                if (tTSettingData != null) {
                    TTSettingDataBean data = tTSettingData.getData();
                    if (data != null) {
                        data.getApp();
                    }
                }
            }
        }
        f29643d = null;
        ArrayList<C11043b> arrayList2 = f29644e;
        if (arrayList2 != null) {
            for (C11043b a : arrayList2) {
                a.mo19950a(m22353a(f29641b));
            }
        }
        f29644e = null;
    }

    /* renamed from: c */
    private static void m22358c() {
        f29645f = true;
        ArrayList<Object> arrayList = f29643d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                new Exception("no data to show");
            }
        }
        f29643d = null;
        ArrayList<C11043b> arrayList2 = f29644e;
        if (arrayList2 != null) {
            for (C11043b a : arrayList2) {
                a.mo19949a((Throwable) new Exception("no data to show"));
            }
        }
        f29644e = null;
    }

    /* renamed from: a */
    public final void mo19940a() {
        String string = Keva.getRepo("TTSettingData").getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            m22358c();
            return;
        }
        C52711k.m112236a((Object) string, "settingResponse");
        m22355a(string);
    }

    /* renamed from: a */
    private static void m22355a(String str) {
        C24076h.m58904e().submit(new C11041b(str));
    }

    /* renamed from: a */
    private static JSONObject m22353a(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                return optJSONObject.optJSONObject("app");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m22354a(C11043b bVar) {
        C52711k.m112240b(bVar, "callback");
        JSONObject jSONObject = f29641b;
        if (jSONObject != null) {
            bVar.mo19950a(m22353a(jSONObject));
        } else if (f29645f) {
            bVar.mo19949a((Throwable) new Exception("no data to show"));
        } else {
            ArrayList<C11043b> arrayList = f29644e;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            f29644e = arrayList;
            if (arrayList != null) {
                arrayList.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo19941a(TTSettingDataResponse tTSettingDataResponse, String str) {
        f29640a = tTSettingDataResponse.getTtSettingData();
        f29641b = tTSettingDataResponse.getTtSettingDataJSONObject();
        Keva repo = Keva.getRepo("TTSettingData");
        if (!TextUtils.isEmpty(str)) {
            repo.storeString("settingData", str);
            repo.storeLong("last_get_setting_time", System.currentTimeMillis());
            m22357b();
            return;
        }
        String string = repo.getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            m22358c();
            return;
        }
        C52711k.m112236a((Object) string, "settingResponseFromKeva");
        m22355a(string);
    }
}
