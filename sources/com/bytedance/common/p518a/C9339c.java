package com.bytedance.common.p518a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.bytedance.common.a.c */
final class C9339c {

    /* renamed from: a */
    public ConcurrentMap<String, C9337b> f25558a = new ConcurrentHashMap();

    /* renamed from: b */
    public ConcurrentMap<String, C9337b> f25559b = new ConcurrentHashMap();

    /* renamed from: c */
    ConcurrentSkipListSet<String> f25560c = new ConcurrentSkipListSet<>();

    /* renamed from: d */
    public String f25561d;

    /* renamed from: e */
    public int f25562e = -2;

    /* renamed from: f */
    public boolean f25563f;

    /* renamed from: g */
    private Context f25564g;

    /* renamed from: h */
    private BroadcastReceiver f25565h = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int b = C9345h.m18516b(context);
                boolean z = false;
                String str = null;
                if (b == 1) {
                    C9339c.m18499b(C9339c.this.f25558a);
                    str = C9345h.m18517c(context);
                    if (str != null && !str.equals(C9339c.this.f25561d)) {
                        C9339c.m18498a(C9339c.this.f25559b);
                        C9339c.this.f25559b.clear();
                        C9339c.this.f25561d = str;
                        z = true;
                    }
                    if (!z && C9339c.this.f25562e != b) {
                        C9339c.m18498a(C9339c.this.f25559b);
                    }
                }
                StringBuilder sb = new StringBuilder("connectivity change: ");
                sb.append(b);
                sb.append(" clear: ");
                sb.append(z);
                sb.append(", bssid:");
                sb.append(str);
                C9343f.m18512a(sb.toString());
                if (C9345h.m18514a(context)) {
                    C9339c.m18499b(C9339c.this.f25559b);
                    if (C9339c.this.f25562e != b) {
                        C9339c.m18498a(C9339c.this.f25558a);
                    }
                }
                C9339c.this.f25562e = b;
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ConcurrentMap<String, C9337b> mo16963a() {
        if (C9345h.m18516b(this.f25564g) == 0) {
            return this.f25558a;
        }
        return this.f25559b;
    }

    /* renamed from: a */
    static void m18498a(Map<String, C9337b> map) {
        if (!(map == null || map == null)) {
            try {
                for (Entry entry : map.entrySet()) {
                    C9342e a = C9341d.m18501a();
                    if (a != null) {
                        ((C9337b) entry.getValue()).mo16959a();
                        a.mo16965a((String) entry.getKey());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    static void m18499b(Map<String, C9337b> map) {
        if (!(map == null || map == null)) {
            try {
                for (Entry entry : map.entrySet()) {
                    if (entry != null) {
                        ((C9337b) entry.getValue()).mo16959a();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    C9339c(Context context, boolean z) {
        this.f25564g = context;
        this.f25563f = z;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this.f25565h, intentFilter);
    }
}
