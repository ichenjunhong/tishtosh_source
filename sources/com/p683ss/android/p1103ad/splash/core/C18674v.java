package com.p683ss.android.p1103ad.splash.core;

import com.p683ss.android.p1103ad.splash.core.p1114c.C18612j;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18619p;
import com.p683ss.android.p1103ad.splash.p1123g.C18741g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.v */
public class C18674v {

    /* renamed from: k */
    private static volatile C18674v f51612k;

    /* renamed from: l */
    private static volatile boolean f51613l;

    /* renamed from: a */
    public volatile C18619p f51614a;

    /* renamed from: b */
    public volatile int f51615b;

    /* renamed from: c */
    public AtomicInteger f51616c;

    /* renamed from: d */
    public AtomicInteger f51617d;

    /* renamed from: e */
    public int f51618e;

    /* renamed from: f */
    public List<Map<String, String>> f51619f;

    /* renamed from: g */
    public volatile long f51620g;

    /* renamed from: h */
    public boolean f51621h;

    /* renamed from: i */
    public boolean f51622i;

    /* renamed from: j */
    public boolean f51623j;

    /* renamed from: m */
    private int f51624m;

    /* renamed from: n */
    private volatile boolean f51625n;

    /* renamed from: o */
    private long f51626o;

    /* renamed from: h */
    private static boolean m45444h() {
        return f51613l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo38186g() {
        this.f51625n = true;
        this.f51614a = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final List<C18612j> mo38181b() {
        if (!mo38183d()) {
            return null;
        }
        return this.f51614a.f51411a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final LinkedHashMap<Long, String> mo38182c() {
        if (!mo38184e()) {
            return null;
        }
        return this.f51614a.f51412b;
    }

    /* renamed from: f */
    public final long mo38185f() {
        if (this.f51623j) {
            return -1;
        }
        return this.f51626o;
    }

    /* renamed from: a */
    public static C18674v m45443a() {
        if (f51612k == null) {
            synchronized (C18674v.class) {
                if (f51612k == null) {
                    f51612k = new C18674v();
                }
            }
        }
        return f51612k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo38183d() {
        if ((!(!this.f51625n) || !m45444h()) || this.f51614a == null || this.f51614a.f51411a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo38184e() {
        if ((!(!this.f51625n) || !m45444h()) || this.f51614a == null || this.f51614a.f51412b == null) {
            return false;
        }
        return true;
    }

    private C18674v() {
        this.f51615b = -1;
        this.f51616c = new AtomicInteger();
        this.f51617d = new AtomicInteger();
        this.f51618e = 0;
        this.f51619f = Collections.synchronizedList(new ArrayList());
        this.f51620g = 0;
        this.f51626o = -1;
        this.f51621h = false;
        this.f51622i = false;
        this.f51623j = false;
        this.f51614a = null;
        this.f51622i = false;
        this.f51624m = 0;
        this.f51621h = false;
        this.f51625n = false;
    }

    /* renamed from: a */
    public final void mo38178a(int i) {
        new StringBuilder("UDPClient. setUDPSwitchResult: ").append(i);
        this.f51615b = i;
    }

    /* renamed from: a */
    public final void mo38179a(long j) {
        if (j == -1) {
            this.f51626o = -1;
            C18741g.m45694a("时间校验, 重置保存的远端服务器时间");
            return;
        }
        if (this.f51626o == -1) {
            C18673u.m45399a().mo38152c(j);
            StringBuilder sb = new StringBuilder("时间校验，保存远端服务器时间: ");
            sb.append(j);
            C18741g.m45694a(sb.toString());
            this.f51626o = j;
        }
    }

    /* renamed from: a */
    public final void mo38180a(AtomicInteger atomicInteger) {
        this.f51617d = atomicInteger;
        if (this.f51618e == atomicInteger.get()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                for (Map entrySet : this.f51619f) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Entry entry : entrySet.entrySet()) {
                        jSONObject3.putOpt((String) entry.getKey(), entry.getValue());
                    }
                    jSONArray.put(jSONObject3);
                }
                jSONObject.put("udp_addrs", jSONArray);
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.putOpt("is_ad_event", "1");
                new StringBuilder("UDPClient. sendStopShowingEvent:\n").append(jSONObject2.toString());
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            C18642g.m45201a(84378473382L, "splash_ad", "splash_init_monitor_all", jSONObject2);
        }
    }
}
