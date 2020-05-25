package com.bytedance.ttnet.encrypt;

import android.util.Base64;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9904j;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12757k;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.encrypt.C13343c.C13344a;
import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;
import com.bytedance.ttnet.hostmonitor.HostStatus;
import com.bytedance.ttnet.p887e.C13328c;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TtTokenConfig {

    /* renamed from: f */
    private static volatile TtTokenConfig f34797f;

    /* renamed from: a */
    public Object f34798a = new Object();

    /* renamed from: b */
    public C13340a f34799b;

    /* renamed from: c */
    final HostMonitorBroadcastReceiver f34800c = new HostMonitorBroadcastReceiver() {
        /* renamed from: a */
        public final void mo24864a(HostStatus hostStatus) {
            if (hostStatus != null) {
                try {
                    if (C9912g.m19864a(C13303d.m26799b().mo24896a())) {
                        super.mo24864a(hostStatus);
                        if (hostStatus.f34822d) {
                            TtTokenConfig.this.mo24941e();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: d */
    public AtomicBoolean f34801d = new AtomicBoolean(false);

    /* renamed from: e */
    public long f34802e = 0;

    /* renamed from: g */
    private C13340a f34803g;

    /* renamed from: h */
    private long f34804h = 0;

    /* renamed from: i */
    private int f34805i = 0;

    interface ISessionTokenApi {
        @C12706h
        C12690b<String> getSeesionToken(@C12691a boolean z, @C12713o int i, @C12699af String str);
    }

    /* renamed from: com.bytedance.ttnet.encrypt.TtTokenConfig$a */
    public static final class C13340a {

        /* renamed from: a */
        long f34809a;

        /* renamed from: b */
        long f34810b;

        /* renamed from: c */
        String f34811c;

        /* renamed from: d */
        byte[] f34812d;

        /* renamed from: e */
        byte[] f34813e;

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionToken{request_time=");
            sb.append(this.f34809a);
            sb.append(", expire_time=");
            sb.append(this.f34810b);
            sb.append(", token='");
            sb.append(this.f34811c);
            sb.append('\'');
            sb.append(", key=");
            sb.append(Arrays.toString(this.f34812d));
            sb.append(", hmac_key=");
            sb.append(Arrays.toString(this.f34813e));
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static TtTokenConfig m26876a() {
        if (f34797f == null) {
            synchronized (TtTokenConfig.class) {
                if (f34797f == null) {
                    f34797f = new TtTokenConfig();
                }
            }
        }
        return f34797f;
    }

    /* renamed from: b */
    public final C13340a mo24938b() {
        C13340a aVar;
        if (!C9912g.m19864a(C13303d.m26799b().mo24896a())) {
            m26877g();
        }
        synchronized (this.f34798a) {
            aVar = this.f34799b;
        }
        return aVar;
    }

    /* renamed from: d */
    public final void mo24940d() {
        C13344a d = C13343c.m26894d();
        if (d != null && d.mo24860m()) {
            List<C9904j> list = C9894e.f26956a;
            if (list != null && list.size() > 0) {
                Map c = mo24939c();
                for (C9904j a : list) {
                    try {
                        a.mo17789a(c);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private TtTokenConfig() {
        if (C9912g.m19864a(C13303d.m26799b().mo24896a())) {
            this.f34800c.mo24948a(C13303d.m26799b().mo24896a());
        }
        this.f34803g = new C13340a();
        this.f34803g.f34812d = C13328c.m26838a(1000, "AES");
        this.f34803g.f34813e = C13328c.m26838a(1001, "HmacSHA256");
        m26877g();
    }

    /* renamed from: c */
    public final Map<String, ?> mo24939c() {
        if (this.f34799b == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f34798a) {
            linkedHashMap.put("token", this.f34799b.f34811c);
            linkedHashMap.put("key", this.f34799b.f34812d);
            linkedHashMap.put("hmac_key", this.f34799b.f34813e);
            linkedHashMap.put("expire", Long.valueOf(this.f34799b.f34810b));
            linkedHashMap.put("request_time", Long.valueOf(this.f34799b.f34809a));
            linkedHashMap.put(C42311c.f106863g, Integer.valueOf(1));
            linkedHashMap.put("session_token", this.f34799b);
        }
        return linkedHashMap;
    }

    /* renamed from: g */
    private void m26877g() {
        try {
            long parseLong = Long.parseLong(C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "tt_token_rt", "-1"));
            if (this.f34802e <= 0 || this.f34802e != parseLong) {
                this.f34802e = parseLong;
                String a = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "tt_token_t", "");
                String a2 = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "tt_token_e", "");
                String a3 = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "tt_token_h", "");
                String a4 = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "tt_token_et", "0");
                if (!C9431p.m18664a(a) && !C9431p.m18664a(a2)) {
                    if (!C9431p.m18664a(a3)) {
                        C13340a aVar = new C13340a();
                        aVar.f34811c = new String((byte[]) C13342b.m26891b(this.f34803g, Base64.decode(a, 2)).second);
                        aVar.f34812d = (byte[]) C13342b.m26891b(this.f34803g, Base64.decode(a2, 2)).second;
                        aVar.f34813e = (byte[]) C13342b.m26891b(this.f34803g, Base64.decode(a3, 2)).second;
                        aVar.f34809a = parseLong;
                        aVar.f34810b = Long.parseLong(a4);
                        synchronized (this.f34798a) {
                            this.f34799b = aVar;
                        }
                        mo24940d();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public final void mo24941e() {
        long j;
        long j2;
        if (C9912g.m19864a(C13303d.m26799b().mo24896a())) {
            C13344a d = C13343c.m26894d();
            if (d != null && d.mo24860m()) {
                if (this.f34799b == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.f34804h > 0) {
                        if (this.f34805i == 1) {
                            if (currentTimeMillis - this.f34804h < 15000) {
                                return;
                            }
                        } else if (this.f34805i != 2 || currentTimeMillis - this.f34804h < 30000) {
                            return;
                        }
                    }
                } else {
                    synchronized (this.f34798a) {
                        j = this.f34799b.f34810b;
                        j2 = this.f34799b.f34809a;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (j2 > currentTimeMillis2) {
                        j2 = currentTimeMillis2 - j;
                    }
                    if (j2 + j <= currentTimeMillis2) {
                        if (this.f34804h > 0) {
                            if (this.f34805i == 1) {
                                if (currentTimeMillis2 - this.f34804h < 15000) {
                                    return;
                                }
                            } else if (this.f34805i != 2 || currentTimeMillis2 - this.f34804h < 30000) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (!this.f34801d.get()) {
                    this.f34801d.getAndSet(true);
                    ISessionTokenApi iSessionTokenApi = (ISessionTokenApi) C13333g.m26861a(C13341a.f34814a, ISessionTokenApi.class);
                    if (iSessionTokenApi == null) {
                        this.f34801d.getAndSet(false);
                        return;
                    }
                    C12690b seesionToken = iSessionTokenApi.getSeesionToken(true, -1, "/session_token/");
                    final long currentTimeMillis3 = System.currentTimeMillis();
                    this.f34804h = currentTimeMillis3;
                    this.f34805i++;
                    seesionToken.enqueue(new C12757k<String>() {
                        /* renamed from: a */
                        public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                            TtTokenConfig.this.f34801d.getAndSet(false);
                        }

                        /* renamed from: a */
                        public final void mo19943a(C12690b<String> bVar, Throwable th) {
                            TtTokenConfig.this.f34801d.getAndSet(false);
                        }

                        /* renamed from: b */
                        public final void mo23905b(C12690b<String> bVar, C12799u<String> uVar) {
                            if (uVar != null) {
                                String str = (String) uVar.f33552b;
                                if (!C9431p.m18664a(str)) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.optInt("status", -1) == 0) {
                                            String optString = jSONObject.optString("key", "");
                                            String optString2 = jSONObject.optString("hmac_key", "");
                                            String optString3 = jSONObject.optString("token", "");
                                            long optLong = (((jSONObject.optLong("expire", 0) * 60) * 60) * 1000) / 2;
                                            if (!C9431p.m18664a(optString) && !C9431p.m18664a(optString2)) {
                                                if (!C9431p.m18664a(optString3)) {
                                                    C13340a aVar = new C13340a();
                                                    aVar.f34809a = currentTimeMillis3;
                                                    aVar.f34810b = optLong;
                                                    aVar.f34811c = optString3;
                                                    aVar.f34812d = Base64.decode(optString, 2);
                                                    aVar.f34813e = Base64.decode(optString2, 2);
                                                    synchronized (TtTokenConfig.this.f34798a) {
                                                        TtTokenConfig.this.f34799b = aVar;
                                                        TtTokenConfig.this.f34802e = currentTimeMillis3;
                                                    }
                                                    TtTokenConfig.this.mo24942f();
                                                    TtTokenConfig.this.mo24940d();
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.ttnet.encrypt.b.a(com.bytedance.ttnet.encrypt.TtTokenConfig$a, byte[]):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (com.bytedance.common.utility.C9431p.m18664a(r1) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r3 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = new java.util.LinkedHashMap();
        r8 = "tt_token_t";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r1 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.C13342b.m26888a(r11.f34803g, r1.getBytes()).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0.put(r8, r1);
        r1 = "tt_token_e";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r2 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r2.length > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r2 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.C13342b.m26888a(r11.f34803g, r2).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0.put(r1, r2);
        r1 = "tt_token_h";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r3 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r3.length > 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        r2 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.C13342b.m26888a(r11.f34803g, r3).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r0.put(r1, r2);
        r0.put("tt_token_rt", java.lang.String.valueOf(r4));
        r0.put("tt_token_et", java.lang.String.valueOf(r6));
        com.bytedance.ttnet.C13303d.m26799b().mo24901a(com.bytedance.ttnet.C13303d.m26799b().mo24896a(), (java.util.Map<java.lang.String, ?>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24942f() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f34798a     // Catch:{ Throwable -> 0x00ae }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00ae }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r1 = r11.f34799b     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            return
        L_0x0009:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r1 = r11.f34799b     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.f34811c     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r2 = r11.f34799b     // Catch:{ all -> 0x00ab }
            byte[] r2 = r2.f34812d     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r3 = r11.f34799b     // Catch:{ all -> 0x00ab }
            byte[] r3 = r3.f34813e     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r4 = r11.f34799b     // Catch:{ all -> 0x00ab }
            long r4 = r4.f34809a     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r6 = r11.f34799b     // Catch:{ all -> 0x00ab }
            long r6 = r6.f34810b     // Catch:{ all -> 0x00ab }
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x00ae }
            if (r0 != 0) goto L_0x00aa
            if (r2 == 0) goto L_0x00aa
            if (r3 != 0) goto L_0x002a
            goto L_0x00aa
        L_0x002a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x00ae }
            r0.<init>()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r8 = "tt_token_t"
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00ae }
            r10 = 2
            if (r9 == 0) goto L_0x003b
            java.lang.String r1 = ""
            goto L_0x004d
        L_0x003b:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r9 = r11.f34803g     // Catch:{ Throwable -> 0x00ae }
            byte[] r1 = r1.getBytes()     // Catch:{ Throwable -> 0x00ae }
            android.util.Pair r1 = com.bytedance.ttnet.encrypt.C13342b.m26888a(r9, r1)     // Catch:{ Throwable -> 0x00ae }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x00ae }
            byte[] r1 = (byte[]) r1     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r10)     // Catch:{ Throwable -> 0x00ae }
        L_0x004d:
            r0.put(r8, r1)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_e"
            if (r2 == 0) goto L_0x0067
            int r8 = r2.length     // Catch:{ Throwable -> 0x00ae }
            if (r8 > 0) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r8 = r11.f34803g     // Catch:{ Throwable -> 0x00ae }
            android.util.Pair r2 = com.bytedance.ttnet.encrypt.C13342b.m26888a(r8, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x00ae }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r10)     // Catch:{ Throwable -> 0x00ae }
            goto L_0x0069
        L_0x0067:
            java.lang.String r2 = ""
        L_0x0069:
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_h"
            if (r3 == 0) goto L_0x0083
            int r2 = r3.length     // Catch:{ Throwable -> 0x00ae }
            if (r2 > 0) goto L_0x0074
            goto L_0x0083
        L_0x0074:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r2 = r11.f34803g     // Catch:{ Throwable -> 0x00ae }
            android.util.Pair r2 = com.bytedance.ttnet.encrypt.C13342b.m26888a(r2, r3)     // Catch:{ Throwable -> 0x00ae }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x00ae }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r10)     // Catch:{ Throwable -> 0x00ae }
            goto L_0x0085
        L_0x0083:
            java.lang.String r2 = ""
        L_0x0085:
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_rt"
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x00ae }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_et"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x00ae }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            com.bytedance.ttnet.c r1 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x00ae }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x00ae }
            android.content.Context r2 = r2.mo24896a()     // Catch:{ Throwable -> 0x00ae }
            r1.mo24901a(r2, r0)     // Catch:{ Throwable -> 0x00ae }
            return
        L_0x00aa:
            return
        L_0x00ab:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r1     // Catch:{ Throwable -> 0x00ae }
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.encrypt.TtTokenConfig.mo24942f():void");
    }
}
