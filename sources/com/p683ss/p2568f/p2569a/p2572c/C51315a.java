package com.p683ss.p2568f.p2569a.p2572c;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.p2568f.p2569a.C51311c;
import com.p683ss.p2568f.p2569a.p2570a.C51301a;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.c.a */
public final class C51315a {

    /* renamed from: d */
    public static volatile long f128237d;

    /* renamed from: a */
    public final C51311c f128238a;

    /* renamed from: b */
    public volatile boolean f128239b;

    /* renamed from: c */
    public volatile String f128240c;

    /* renamed from: e */
    private final ExecutorService f128241e;

    /* renamed from: f */
    private Context f128242f;

    /* renamed from: g */
    private Future f128243g;

    /* renamed from: h */
    private volatile C51319a f128244h;

    /* renamed from: i */
    private int f128245i = 600000;

    /* renamed from: j */
    private int f128246j = -1;

    /* renamed from: k */
    private int f128247k = -1;

    /* renamed from: l */
    private int f128248l = -1;

    /* renamed from: com.ss.f.a.c.a$a */
    public interface C51319a {
        /* renamed from: a */
        void mo101870a(String str, String str2, C51301a aVar, boolean z);
    }

    /* renamed from: c */
    public final String mo101865c() {
        mo101864b();
        return this.f128240c;
    }

    /* renamed from: a */
    public final void mo101861a() {
        this.f128244h = null;
        if (this.f128243g != null && !this.f128243g.isDone()) {
            this.f128243g.cancel(true);
            this.f128243g = null;
        }
    }

    /* renamed from: b */
    public final void mo101864b() {
        if (SystemClock.elapsedRealtime() - f128237d >= 300000) {
            this.f128241e.submit(new Runnable() {
                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            C51315a.this.f128240c = byName.getHostAddress();
                            C51315a.f128237d = SystemClock.elapsedRealtime();
                            new StringBuilder("update dns server ip:").append(C51315a.this.f128240c);
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static boolean m110361b(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo101859a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x004f
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0009
            goto L_0x004f
        L_0x0009:
            java.lang.String r0 = "://"
            int r0 = r6.indexOf(r0)
            int r0 = r0 + 3
            r5.f128246j = r0
            r0 = -1
            r5.f128247k = r0
            int r1 = r5.f128246j
            int r2 = r6.length()
        L_0x001c:
            if (r1 >= r2) goto L_0x003c
            char r3 = r6.charAt(r1)
            r4 = 35
            if (r3 == r4) goto L_0x003c
            r4 = 47
            if (r3 == r4) goto L_0x003c
            r4 = 58
            if (r3 == r4) goto L_0x0037
            switch(r3) {
                case 63: goto L_0x003c;
                case 64: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0039
        L_0x0032:
            int r3 = r1 + 1
            r5.f128246j = r3
            goto L_0x0039
        L_0x0037:
            r5.f128247k = r1
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x003c:
            r5.f128248l = r1
            int r1 = r5.f128247k
            if (r1 != r0) goto L_0x0046
            int r0 = r5.f128248l
            r5.f128247k = r0
        L_0x0046:
            int r0 = r5.f128246j
            int r1 = r5.f128247k
            java.lang.String r6 = r6.substring(r0, r1)
            return r6
        L_0x004f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2568f.p2569a.p2572c.C51315a.mo101859a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo101862a(final String str, C51319a aVar) {
        int i;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (this.f128241e != null) {
                final boolean z = this.f128239b;
                mo101861a();
                this.f128244h = aVar;
                NetworkInfo a = C51326d.m110386a(this.f128242f);
                if (a == null || !a.isAvailable()) {
                    str2 = null;
                    i = -1;
                } else {
                    i = a.getType();
                    str2 = a.getExtraInfo();
                }
                C51320b.m110372a();
                int c = C51320b.m110374c();
                boolean z2 = true;
                if (i != -1 && i == c) {
                    C51320b.m110372a();
                    String d = C51320b.m110376d();
                    if (str2 == null || (d != null && str2.equals(d))) {
                        z2 = false;
                    }
                }
                if (z2) {
                    C51320b.m110372a().mo101873b();
                    C51320b.m110372a();
                    C51320b.m110375c(str2);
                    C51320b.m110372a();
                    C51320b.m110373a(i);
                }
                C51321a a2 = C51320b.m110372a().mo101871a(str);
                if (a2 != null && System.currentTimeMillis() - a2.f128260b <= ((long) this.f128245i) && !a2.f128261c) {
                    mo101863a(this.f128239b, str, a2.f128259a, null, false);
                } else if (!this.f128241e.isShutdown()) {
                    this.f128243g = this.f128241e.submit(new Runnable() {
                        public final void run() {
                            if (z) {
                                C51315a aVar = C51315a.this;
                                String str = str;
                                String a = C2240a.m6772a("http://%s/%s/d?host=%s", new Object[]{"203.107.1.4", "131950", str});
                                C51328f.m110388a(aVar.f128238a, a, aVar.mo101859a(a), new C51329a(str) {

                                    /* renamed from: a */
                                    final /* synthetic */ String f128252a;

                                    /* renamed from: a */
                                    public final void mo101867a(C51301a aVar) {
                                        C51315a.this.mo101863a(true, this.f128252a, null, aVar, true);
                                    }

                                    /* renamed from: a */
                                    public final void mo101868a(JSONObject jSONObject) {
                                        String str;
                                        JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                                        if (optJSONArray == null || optJSONArray.length() == 0) {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("host", this.f128252a);
                                            C51315a.this.mo101863a(true, this.f128252a, null, new C51301a(-111, "http dns response ip empty", hashMap), true);
                                            return;
                                        }
                                        try {
                                            str = optJSONArray.getString(0);
                                        } catch (Exception unused) {
                                            str = null;
                                        }
                                        C51315a.this.mo101863a(true, this.f128252a, str, null, true);
                                    }

                                    {
                                        this.f128252a = r2;
                                    }
                                });
                                return;
                            }
                            C51315a aVar2 = C51315a.this;
                            String str2 = str;
                            try {
                                InetAddress byName = InetAddress.getByName(str2);
                                if (byName == null) {
                                    aVar2.mo101863a(false, str2, null, new C51301a(-110, "", null), true);
                                    return;
                                }
                                String hostAddress = byName.getHostAddress();
                                if (byName instanceof Inet6Address) {
                                    hostAddress = C2240a.m6772a("[%s]", new Object[]{hostAddress});
                                }
                                aVar2.mo101863a(false, str2, hostAddress, null, true);
                            } catch (UnknownHostException e) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("reason", "Unknown host name");
                                hashMap.put("host", str2);
                                hashMap.put("exception", e.toString());
                                aVar2.mo101863a(false, str2, null, new C51301a(-110, "Unknown Host", hashMap), true);
                            }
                        }
                    });
                } else {
                    mo101863a(false, str, null, null, false);
                }
            } else {
                throw new IllegalStateException("mExecutor should not be null");
            }
        }
    }

    public C51315a(Context context, ExecutorService executorService, C51311c cVar) {
        this.f128242f = context;
        this.f128241e = executorService;
        this.f128238a = cVar;
    }

    /* renamed from: a */
    public final String mo101860a(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        boolean startsWith = str.startsWith(WebKitApi.SCHEME_HTTP);
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, this.f128246j));
        sb.append(str2);
        String sb2 = sb.toString();
        int i = this.f128247k;
        if (this.f128248l != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(str.substring(this.f128247k, this.f128248l));
            sb2 = sb3.toString();
            i = this.f128248l;
        }
        if (!startsWith) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("/");
            sb4.append(mo101859a(str));
            sb2 = sb4.toString();
        } else if (map != null) {
            map.put("Host", C2240a.m6772a(" %s", new Object[]{mo101859a(str)}));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(str.substring(i));
        return sb5.toString();
    }

    /* renamed from: a */
    public final void mo101863a(boolean z, String str, String str2, C51301a aVar, boolean z2) {
        if (this.f128239b == z) {
            C51319a aVar2 = this.f128244h;
            if (aVar2 != null) {
                if (z2 && str2 != null) {
                    C51321a aVar3 = new C51321a();
                    aVar3.f128260b = System.currentTimeMillis();
                    aVar3.f128259a = str2;
                    aVar3.f128261c = false;
                    C51320b.m110372a().mo101872a(str, aVar3);
                }
                aVar2.mo101870a(str, str2, aVar, z2);
            }
        }
    }
}
