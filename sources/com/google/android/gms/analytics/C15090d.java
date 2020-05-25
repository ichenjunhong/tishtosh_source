package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.p1031a.C15085a;
import com.google.android.gms.analytics.p1031a.C15086b;
import com.google.android.gms.analytics.p1031a.C15087c;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16529a;
import com.google.android.gms.internal.measurement.C16556b;
import com.google.android.gms.internal.measurement.C16564bh;
import com.google.android.gms.internal.measurement.C16583c;
import com.google.android.gms.internal.measurement.C16585cb;
import com.google.android.gms.internal.measurement.C16613d;
import com.google.android.gms.internal.measurement.C16645e;
import com.google.android.gms.internal.measurement.C16672f;
import com.google.android.gms.internal.measurement.C16699g;
import com.google.android.gms.internal.measurement.C16732h;
import com.google.android.gms.internal.measurement.C16764i;
import com.google.android.gms.internal.measurement.C16791j;
import com.google.android.gms.internal.measurement.C16808jq;
import com.google.android.gms.internal.measurement.C16840kr;
import com.google.android.gms.internal.measurement.C16854le;
import com.google.android.gms.internal.measurement.C16859q;
import com.google.android.gms.internal.measurement.C16861s;
import com.google.android.gms.internal.measurement.C16862t;
import com.google.android.gms.internal.measurement.C16865w;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.d */
public final class C15090d extends C16859q implements C15104o {

    /* renamed from: a */
    private static DecimalFormat f38950a;

    /* renamed from: c */
    private final C16862t f38951c;

    /* renamed from: d */
    private final String f38952d;

    /* renamed from: e */
    private final Uri f38953e;

    public C15090d(C16862t tVar, String str) {
        this(tVar, str, true, false);
    }

    private C15090d(C16862t tVar, String str, boolean z, boolean z2) {
        super(tVar);
        C15464q.m32125a(str);
        this.f38951c = tVar;
        this.f38952d = str;
        this.f38953e = m31234a(this.f38952d);
    }

    /* renamed from: a */
    static Uri m31234a(String str) {
        C15464q.m32125a(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: a */
    public final Uri mo27832a() {
        return this.f38953e;
    }

    /* renamed from: a */
    public final void mo27833a(C15095i iVar) {
        int i;
        C15095i iVar2 = iVar;
        C15464q.m32123a(iVar);
        C15464q.m32134b(iVar2.f38958b, "Can't deliver not submitted measurement");
        C15464q.m32136c("deliver should be called on worker thread");
        C15095i a = iVar.mo27836a();
        C16699g gVar = (C16699g) a.mo27839b(C16699g.class);
        if (TextUtils.isEmpty(gVar.f46942a)) {
            mo32507h().mo31827a(m31240b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(gVar.f46943b)) {
            mo32507h().mo31827a(m31240b(a), "Ignoring measurement without client id");
        } else if (!this.f38951c.mo32521d().f38943d) {
            double d = gVar.f46949h;
            String str = gVar.f46943b;
            boolean z = false;
            if (d > ProfileUiInitOptimizeEnterThreshold.DEFAULT && d < 100.0d) {
                if (!TextUtils.isEmpty(str)) {
                    i = 0;
                    for (int length = str.length() - 1; length >= 0; length--) {
                        char charAt = str.charAt(length);
                        i = ((i << 6) & 65535) + charAt + (charAt << 14);
                        int i2 = 266338304 & i;
                        if (i2 != 0) {
                            i ^= i2 >> 21;
                        }
                    }
                } else {
                    i = 1;
                }
                if (((double) (i % 10000)) >= 100.0d * d) {
                    z = true;
                }
            }
            if (z) {
                mo32494b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                return;
            }
            Map b = m31240b(a);
            b.put("v", "1");
            b.put("_v", C16861s.f47332b);
            b.put("tid", this.f38952d);
            if (this.f38951c.mo32521d().f38942c) {
                StringBuilder sb = new StringBuilder();
                for (Entry entry : b.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                String sb2 = sb.toString();
                super.mo32489a(4, "Dry run is enabled. GoogleAnalytics would have sent", sb2, null, null);
                return;
            }
            HashMap hashMap = new HashMap();
            C16585cb.m39589a((Map<String, String>) hashMap, "uid", gVar.f46944c);
            C16808jq jqVar = (C16808jq) iVar2.mo27837a(C16808jq.class);
            if (jqVar != null) {
                C16585cb.m39589a((Map<String, String>) hashMap, "an", jqVar.f47209a);
                C16585cb.m39589a((Map<String, String>) hashMap, "aid", jqVar.f47211c);
                C16585cb.m39589a((Map<String, String>) hashMap, "av", jqVar.f47210b);
                C16585cb.m39589a((Map<String, String>) hashMap, "aiid", jqVar.f47212d);
            }
            C16865w wVar = new C16865w(0, gVar.f46943b, this.f38952d, !TextUtils.isEmpty(gVar.f46945d), 0, hashMap);
            b.put("_s", String.valueOf(mo32510k().mo32470a(wVar)));
            C16564bh bhVar = new C16564bh(mo32507h(), b, iVar2.f38959c, true);
            mo32510k().mo32472a(bhVar);
        }
    }

    /* renamed from: b */
    private static Map<String, String> m31240b(C15095i iVar) {
        HashMap hashMap = new HashMap();
        C16556b bVar = (C16556b) iVar.mo27837a(C16556b.class);
        if (bVar != null) {
            for (Entry entry : bVar.mo31820a().entrySet()) {
                Object value = entry.getValue();
                String str = null;
                if (value != null) {
                    if (value instanceof String) {
                        String str2 = (String) value;
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        }
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                            str = m31235a(d.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        str = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        str = "1";
                    }
                }
                if (str != null) {
                    hashMap.put((String) entry.getKey(), str);
                }
            }
        }
        C16699g gVar = (C16699g) iVar.mo27837a(C16699g.class);
        if (gVar != null) {
            m31238a((Map<String, String>) hashMap, "t", gVar.f46942a);
            m31238a((Map<String, String>) hashMap, "cid", gVar.f46943b);
            m31238a((Map<String, String>) hashMap, "uid", gVar.f46944c);
            m31238a((Map<String, String>) hashMap, "sc", gVar.f46947f);
            m31236a((Map<String, String>) hashMap, "sf", gVar.f46949h);
            m31239a((Map<String, String>) hashMap, "ni", gVar.f46948g);
            m31238a((Map<String, String>) hashMap, "adid", gVar.f46945d);
            m31239a((Map<String, String>) hashMap, "ate", gVar.f46946e);
        }
        C16732h hVar = (C16732h) iVar.mo27837a(C16732h.class);
        if (hVar != null) {
            m31238a((Map<String, String>) hashMap, "cd", hVar.f47073a);
            m31236a((Map<String, String>) hashMap, "a", (double) hVar.f47074b);
            m31238a((Map<String, String>) hashMap, C43225dr.f109315r, hVar.f47075c);
        }
        C16645e eVar = (C16645e) iVar.mo27837a(C16645e.class);
        if (eVar != null) {
            m31238a((Map<String, String>) hashMap, "ec", eVar.f46779a);
            m31238a((Map<String, String>) hashMap, "ea", eVar.f46780b);
            m31238a((Map<String, String>) hashMap, "el", eVar.f46781c);
            m31236a((Map<String, String>) hashMap, "ev", (double) eVar.f46782d);
        }
        C16840kr krVar = (C16840kr) iVar.mo27837a(C16840kr.class);
        if (krVar != null) {
            m31238a((Map<String, String>) hashMap, "cn", krVar.f47275a);
            m31238a((Map<String, String>) hashMap, "cs", krVar.f47276b);
            m31238a((Map<String, String>) hashMap, "cm", krVar.f47277c);
            m31238a((Map<String, String>) hashMap, "ck", krVar.f47278d);
            m31238a((Map<String, String>) hashMap, "cc", krVar.f47279e);
            m31238a((Map<String, String>) hashMap, "ci", krVar.f47280f);
            m31238a((Map<String, String>) hashMap, "anid", krVar.f47281g);
            m31238a((Map<String, String>) hashMap, "gclid", krVar.f47282h);
            m31238a((Map<String, String>) hashMap, "dclid", krVar.f47283i);
            m31238a((Map<String, String>) hashMap, "aclid", krVar.f47284j);
        }
        C16672f fVar = (C16672f) iVar.mo27837a(C16672f.class);
        if (fVar != null) {
            m31238a((Map<String, String>) hashMap, "exd", fVar.f46907a);
            m31239a((Map<String, String>) hashMap, "exf", fVar.f46908b);
        }
        C16764i iVar2 = (C16764i) iVar.mo27837a(C16764i.class);
        if (iVar2 != null) {
            m31238a((Map<String, String>) hashMap, "sn", iVar2.f47134a);
            m31238a((Map<String, String>) hashMap, "sa", iVar2.f47135b);
            m31238a((Map<String, String>) hashMap, "st", iVar2.f47136c);
        }
        C16791j jVar = (C16791j) iVar.mo27837a(C16791j.class);
        if (jVar != null) {
            m31238a((Map<String, String>) hashMap, "utv", jVar.f47180a);
            m31236a((Map<String, String>) hashMap, "utt", (double) jVar.f47181b);
            m31238a((Map<String, String>) hashMap, "utc", jVar.f47182c);
            m31238a((Map<String, String>) hashMap, "utl", jVar.f47183d);
        }
        C16854le leVar = (C16854le) iVar.mo27837a(C16854le.class);
        if (leVar != null) {
            for (Entry entry2 : leVar.mo32483a().entrySet()) {
                String a = C15092f.m31243a(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, (String) entry2.getValue());
                }
            }
        }
        C16529a aVar = (C16529a) iVar.mo27837a(C16529a.class);
        if (aVar != null) {
            for (Entry entry3 : aVar.mo31756a().entrySet()) {
                String b = C15092f.m31245b(((Integer) entry3.getKey()).intValue());
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put(b, m31235a(((Double) entry3.getValue()).doubleValue()));
                }
            }
        }
        C16613d dVar = (C16613d) iVar.mo27837a(C16613d.class);
        if (dVar != null) {
            C15086b bVar2 = dVar.f46678b;
            if (bVar2 != null) {
                for (Entry entry4 : bVar2.mo27824a().entrySet()) {
                    if (((String) entry4.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry4.getKey()).substring(1), (String) entry4.getValue());
                    } else {
                        hashMap.put((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
            int i = 1;
            for (C15087c a2 : dVar.mo31915b()) {
                hashMap.putAll(a2.mo27826a(C15092f.m31247d(i)));
                i++;
            }
            int i2 = 1;
            for (C15085a a3 : dVar.mo31914a()) {
                hashMap.putAll(a3.mo27822a(C15092f.m31246c(i2)));
                i2++;
            }
            int i3 = 1;
            for (Entry entry5 : dVar.f46677a.entrySet()) {
                List<C15085a> list = (List) entry5.getValue();
                String f = C15092f.m31249f(i3);
                int i4 = 1;
                for (C15085a aVar2 : list) {
                    String valueOf = String.valueOf(f);
                    String valueOf2 = String.valueOf(C15092f.m31248e(i4));
                    hashMap.putAll(aVar2.mo27822a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry5.getKey())) {
                    String valueOf3 = String.valueOf(f);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry5.getKey());
                }
                i3++;
            }
        }
        C16583c cVar = (C16583c) iVar.mo27837a(C16583c.class);
        if (cVar != null) {
            m31238a((Map<String, String>) hashMap, "ul", cVar.f46596a);
            m31236a((Map<String, String>) hashMap, "sd", (double) cVar.f46597b);
            m31237a(hashMap, "sr", cVar.f46598c, cVar.f46599d);
            m31237a(hashMap, "vp", cVar.f46600e, cVar.f46601f);
        }
        C16808jq jqVar = (C16808jq) iVar.mo27837a(C16808jq.class);
        if (jqVar != null) {
            m31238a((Map<String, String>) hashMap, "an", jqVar.f47209a);
            m31238a((Map<String, String>) hashMap, "aid", jqVar.f47211c);
            m31238a((Map<String, String>) hashMap, "aiid", jqVar.f47212d);
            m31238a((Map<String, String>) hashMap, "av", jqVar.f47210b);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m31238a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private static String m31235a(double d) {
        if (f38950a == null) {
            f38950a = new DecimalFormat("0.######");
        }
        return f38950a.format(d);
    }

    /* renamed from: a */
    private static void m31236a(Map<String, String> map, String str, double d) {
        if (d != ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            map.put(str, m31235a(d));
        }
    }

    /* renamed from: a */
    private static void m31239a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: a */
    private static void m31237a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            map.put(str, sb.toString());
        }
    }
}
