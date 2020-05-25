package com.p683ss.android.deviceregister;

import android.content.Context;
import com.bytedance.common.utility.C9374b;
import com.bytedance.common.utility.C9423k;
import com.bytedance.common.utility.C9423k.C9424a;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.deviceregister.p1155b.C19008a;
import com.p683ss.android.p1167g.C19165d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.l */
public final class C19049l {

    /* renamed from: b */
    private static volatile C19049l f52484b;

    /* renamed from: c */
    private static final AtomicBoolean f52485c = new AtomicBoolean(false);

    /* renamed from: d */
    private static String[] f52486d;

    /* renamed from: a */
    final AtomicLong f52487a = new AtomicLong(-1);

    /* renamed from: com.ss.android.deviceregister.l$a */
    interface C19054a {
        /* renamed from: a */
        void mo38935a(Object obj);
    }

    /* renamed from: com.ss.android.deviceregister.l$b */
    static final class C19055b implements Runnable {

        /* renamed from: a */
        private final String f52489a;

        /* renamed from: b */
        private final String[] f52490b;

        /* renamed from: c */
        private final boolean f52491c = false;

        /* renamed from: d */
        private final C19054a f52492d;

        /* renamed from: e */
        private final Object f52493e;

        public final void run() {
            String str;
            StringBuilder sb = new StringBuilder("encrypt=");
            sb.append(this.f52491c);
            sb.append(" urls=");
            sb.append(Arrays.toString(this.f52490b));
            if (this.f52490b != null && this.f52490b.length != 0) {
                String[] strArr = this.f52490b;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    new StringBuilder("for-loop-start, url=").append(str2);
                    try {
                        if (this.f52491c) {
                            byte[] b = C19049l.m46384b(this.f52489a);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append("?tt_data=a");
                            String sb3 = sb2.toString();
                            HashMap hashMap = new HashMap();
                            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
                            str = C9423k.m18637a().mo17023a(sb3, b, (Map<String, String>) hashMap, (C9424a) null);
                        } else {
                            str = C9423k.m18637a().mo17062a(str2, C19049l.m46381a(this.f52489a), true, "application/json; charset=utf-8", false);
                        }
                        new StringBuilder("response=").append(str);
                        if (this.f52492d != null) {
                            this.f52492d.mo38935a(this.f52493e);
                        }
                        return;
                    } catch (C9374b | IOException unused) {
                        i++;
                    }
                }
            }
        }

        C19055b(String str, String[] strArr, boolean z, C19054a aVar, Object obj) {
            this.f52489a = str;
            this.f52490b = strArr;
            this.f52492d = aVar;
            this.f52493e = obj;
        }
    }

    /* renamed from: com.ss.android.deviceregister.l$c */
    static class C19056c extends C9393e {
        private C19056c() {
        }

        public final void run() {
            List<C19044i> f = C19059m.m46390a().mo38947f();
            if (f != null && !f.isEmpty()) {
                for (C19044i iVar : f) {
                    C19047j a = C19047j.m46366a();
                    if (!a.f52479g.containsKey(iVar.f52452a)) {
                        C19049l.m46379a(iVar);
                    }
                }
                for (C19044i iVar2 : f) {
                    if (System.currentTimeMillis() - iVar2.f52453b.longValue() > TimeUnit.DAYS.toMillis(7)) {
                        new StringBuilder("timestampActiveUserId=").append(iVar2.f52452a);
                        C19059m.m46390a().mo38942b(iVar2.f52452a.intValue());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.deviceregister.l$d */
    static class C19057d extends C9393e {
        private C19057d() {
        }

        public final void run() {
            List<C19048k> g = C19059m.m46390a().mo38948g();
            if (g != null && !g.isEmpty()) {
                for (C19048k a : g) {
                    C19049l.m46380a(a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.deviceregister.l$e */
    static class C19058e extends C9393e {
        private C19058e() {
        }

        public final void run() {
            List<C19039h> e = C19059m.m46390a().mo38946e();
            if (e != null && !e.isEmpty()) {
                for (C19039h hVar : e) {
                    C19047j a = C19047j.m46366a();
                    if (!a.f52478f.containsKey(hVar.f52426k)) {
                        C19049l.m46378a(hVar);
                    }
                }
                for (C19039h hVar2 : e) {
                    if (System.currentTimeMillis() - hVar2.f52416a.longValue() > TimeUnit.DAYS.toMillis(7)) {
                        new StringBuilder("timestampPrimaryId=").append(hVar2.f52426k);
                        C19059m.m46390a().mo38937a(hVar2.f52426k.intValue());
                    }
                }
            }
        }
    }

    private C19049l() {
    }

    /* renamed from: a */
    static C19049l m46376a() {
        if (f52484b == null) {
            synchronized (C19049l.class) {
                if (f52484b == null) {
                    f52484b = new C19049l();
                }
            }
        }
        return f52484b;
    }

    /* renamed from: b */
    private static String[] m46385b() {
        if (f52485c.compareAndSet(false, true)) {
            String[] a = C19008a.m46193a();
            String[] strArr = new String[a.length];
            for (int i = 0; i < a.length; i++) {
                String str = a[i];
                Context context = AppProvider.f52306a;
                if (context != null) {
                    str = C19165d.m46728a(context, str);
                }
                strArr[i] = NetUtil.addCommonParams(str, true);
            }
            f52486d = strArr;
        }
        return f52486d;
    }

    /* renamed from: a */
    public static byte[] m46381a(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    static void m46378a(C19039h hVar) {
        String[] b = m46385b();
        boolean b2 = C19008a.m46194b();
        C19055b bVar = new C19055b(m46377a(m46382b(hVar), "device_register").toString(), b, false, new C19054a() {
            /* renamed from: a */
            public final void mo38935a(Object obj) {
                C19059m.m46390a().mo38937a(((C19039h) obj).f52426k.intValue());
            }
        }, hVar);
        StringBuilder sb = new StringBuilder("encrypt=");
        sb.append(b2);
        sb.append(" timestamp=");
        sb.append(hVar);
        new C9393e(bVar, "TimestampSender", false).start();
    }

    /* renamed from: b */
    private static JSONObject m46383b(C19044i iVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp_active_user_id", iVar.f52452a);
            jSONObject.put("active_user_invoke_internal_start", iVar.f52453b);
            jSONObject.put("active_user_invoke_internal_end", iVar.f52454c);
            jSONObject.put("internal_json_object", iVar.f52455d);
            jSONObject.put("active_thread_run", iVar.f52456e);
            jSONObject.put("active_user_start", iVar.f52457f);
            jSONObject.put("active_user_end", iVar.f52458g);
            jSONObject.put("active_user_net_start", iVar.f52459h);
            jSONObject.put("active_user_net_stacktrace", iVar.f52460i);
            jSONObject.put("net_url", iVar.f52461j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m46379a(C19044i iVar) {
        String[] b = m46385b();
        boolean b2 = C19008a.m46194b();
        C19055b bVar = new C19055b(m46377a(m46383b(iVar), "active_user").toString(), b, false, new C19054a() {
            /* renamed from: a */
            public final void mo38935a(Object obj) {
                C19059m.m46390a().mo38942b(((C19044i) obj).f52452a.intValue());
            }
        }, iVar);
        StringBuilder sb = new StringBuilder("encrypt=");
        sb.append(b2);
        sb.append(" timestampActiveUser=");
        sb.append(iVar);
        new C9393e(bVar, "TimestampSender", false).start();
    }

    /* renamed from: b */
    private static JSONObject m46382b(C19039h hVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (C19041a aVar : hVar.f52423h) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("net_request_start", aVar.f52427a);
                jSONObject2.put("net_request_end", aVar.f52428b);
                jSONObject2.put("url", aVar.f52429c);
                jSONObject2.put("data", aVar.f52430d);
                jSONObject2.put("exception", aVar.f52431e);
                jSONObject2.put("error_message", aVar.f52432f);
                jSONObject2.put("n_try", aVar.f52433g);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("timestampPrimaryId", hVar.f52426k);
            jSONObject.put("init_start", hVar.f52416a);
            jSONObject.put("init_end", hVar.f52417b);
            jSONObject.put("prepare_param_start", hVar.f52418c);
            jSONObject.put("prepare_param_end", hVar.f52419d);
            jSONObject.put("load_cache_start", hVar.f52420e);
            jSONObject.put("load_cache_end", hVar.f52421f);
            jSONObject.put("max_try_times", hVar.f52422g);
            jSONObject.put("calls", jSONArray);
            jSONObject.put("current_did", hVar.f52424i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m46380a(C19048k kVar) {
        String[] b = m46385b();
        boolean b2 = C19008a.m46194b();
        C19055b bVar = new C19055b(m46377a(kVar.mo38932a(), "header").toString(), b, false, new C19054a() {
            /* renamed from: a */
            public final void mo38935a(Object obj) {
                C19059m.m46390a().mo38944c(((C19048k) obj).f52483b.intValue());
            }
        }, kVar);
        StringBuilder sb = new StringBuilder("encrypt=");
        sb.append(b2);
        sb.append(" timestampHeader=");
        sb.append(kVar);
        new C9393e(bVar, "TimestampSender", false).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m46384b(java.lang.String r3) throws java.io.IOException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "data="
            r0.<init>(r1)
            r0.append(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x006b
            byte[] r3 = m46381a(r3)
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x005e }
            int r2 = r3.length     // Catch:{ all -> 0x005e }
            r1.<init>(r2)     // Catch:{ all -> 0x005e }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x005a }
            r2.<init>(r1)     // Catch:{ all -> 0x005a }
            r2.write(r3)     // Catch:{ all -> 0x0058 }
            r1.close()
            r2.close()
            byte[] r3 = r1.toByteArray()
            if (r3 == 0) goto L_0x0050
            int r0 = r3.length
            if (r0 == 0) goto L_0x0050
            int r0 = r3.length
            byte[] r3 = com.bytedance.frameworks.core.p577a.C9925b.m19906a(r3, r0)
            if (r3 == 0) goto L_0x0048
            int r0 = r3.length
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "success, encryptBytes' length="
            r0.<init>(r1)
            int r1 = r3.length
            r0.append(r1)
            return r3
        L_0x0048:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "encrypt failed!"
            r3.<init>(r0)
            throw r3
        L_0x0050:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "gzip failed!"
            r3.<init>(r0)
            throw r3
        L_0x0058:
            r3 = move-exception
            goto L_0x005c
        L_0x005a:
            r3 = move-exception
            r2 = r0
        L_0x005c:
            r0 = r1
            goto L_0x0060
        L_0x005e:
            r3 = move-exception
            r2 = r0
        L_0x0060:
            if (r0 == 0) goto L_0x0065
            r0.close()
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.close()
        L_0x006a:
            throw r3
        L_0x006b:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "empty input!"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19049l.m46384b(java.lang.String):byte[]");
    }

    /* renamed from: a */
    private static JSONObject m46377a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("data", jSONObject);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }
}
