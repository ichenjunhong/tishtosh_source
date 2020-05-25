package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ck */
public final class C15806ck {

    /* renamed from: a */
    public boolean f44781a;

    /* renamed from: b */
    public final Object f44782b = new Object();

    /* renamed from: c */
    public String f44783c;

    /* renamed from: d */
    private final List<C15804ci> f44784d = new LinkedList();

    /* renamed from: e */
    private final Map<String, String> f44785e = new LinkedHashMap();

    /* renamed from: f */
    private C15806ck f44786f;

    public C15806ck(boolean z, String str, String str2) {
        this.f44781a = z;
        this.f44785e.put("action", str);
        this.f44785e.put("ad_format", str2);
    }

    /* renamed from: a */
    public final void mo30899a(C15806ck ckVar) {
        synchronized (this.f44782b) {
            this.f44786f = ckVar;
        }
    }

    /* renamed from: a */
    public final C15804ci mo30897a() {
        return mo30898a(C14963ax.m30837g().mo28524b());
    }

    /* renamed from: a */
    public final C15804ci mo30898a(long j) {
        if (!this.f44781a) {
            return null;
        }
        return new C15804ci(j, null, null);
    }

    /* renamed from: a */
    public final boolean mo30902a(C15804ci ciVar, String... strArr) {
        if (!this.f44781a || ciVar == null) {
            return false;
        }
        return mo30901a(ciVar, C14963ax.m30837g().mo28524b(), strArr);
    }

    /* renamed from: a */
    public final boolean mo30901a(C15804ci ciVar, long j, String... strArr) {
        synchronized (this.f44782b) {
            for (String ciVar2 : strArr) {
                this.f44784d.add(new C15804ci(j, ciVar2, ciVar));
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String mo30903b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f44782b) {
            for (C15804ci ciVar : this.f44784d) {
                long j = ciVar.f44776a;
                String str = ciVar.f44777b;
                C15804ci ciVar2 = ciVar.f44778c;
                if (ciVar2 != null && j > 0) {
                    long j2 = j - ciVar2.f44776a;
                    sb2.append(str);
                    sb2.append('.');
                    sb2.append(j2);
                    sb2.append(',');
                }
            }
            this.f44784d.clear();
            if (!TextUtils.isEmpty(this.f44783c)) {
                sb2.append(this.f44783c);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo30900a(String str, String str2) {
        if (this.f44781a && !TextUtils.isEmpty(str2)) {
            C15796ca a = C14963ax.m30834d().mo28585a();
            if (a != null) {
                synchronized (this.f44782b) {
                    C15800ce a2 = a.mo30887a(str);
                    Map<String, String> map = this.f44785e;
                    map.put(str, a2.mo30895a((String) map.get(str), str2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Map<String, String> mo30904c() {
        synchronized (this.f44782b) {
            C15796ca a = C14963ax.m30834d().mo28585a();
            if (a != null) {
                if (this.f44786f != null) {
                    Map<String, String> a2 = a.mo30888a(this.f44785e, this.f44786f.mo30904c());
                    return a2;
                }
            }
            Map<String, String> map = this.f44785e;
            return map;
        }
    }
}
