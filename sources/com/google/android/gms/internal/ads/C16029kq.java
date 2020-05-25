package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.C2240a;
import com.google.android.gms.ads.internal.C14963ax;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.kq */
public final class C16029kq {

    /* renamed from: a */
    final Map<C16030kr, C16031ks> f45113a = new HashMap();

    /* renamed from: b */
    final LinkedList<C16030kr> f45114b = new LinkedList<>();

    /* renamed from: c */
    C15997jl f45115c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31133a() {
        if (this.f45115c != null) {
            for (Entry entry : this.f45113a.entrySet()) {
                C16030kr krVar = (C16030kr) entry.getKey();
                C16031ks ksVar = (C16031ks) entry.getValue();
                if (abv.m32791a(2)) {
                    int a = ksVar.mo31137a();
                    int b = ksVar.mo31140b();
                    if (b < a) {
                        abv.m32494a(C2240a.m6772a("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(a - b), Integer.valueOf(a), krVar}));
                    }
                }
                int c = ksVar.mo31141c() + 0;
                while (true) {
                    if (ksVar.mo31137a() >= ((Integer) caf.m37099d().mo30717a(C15740bx.f44231aR)).intValue()) {
                        break;
                    }
                    m37925a("Pooling and loading one new interstitial for %s.", krVar);
                    if (ksVar.mo31139a(this.f45115c)) {
                        c++;
                    }
                }
                C16033ku.m37942a().mo31144a(c);
            }
            if (this.f45115c != null) {
                Editor edit = C35807d.m80935a(this.f45115c.mo31114a(), "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.f45113a.entrySet()) {
                    C16030kr krVar2 = (C16030kr) entry2.getKey();
                    C16031ks ksVar2 = (C16031ks) entry2.getValue();
                    if (ksVar2.f45121e) {
                        edit.putString(krVar2.toString(), new C16035kw(ksVar2).mo31146a());
                        m37925a("Saved interstitial queue for %s.", krVar2);
                    }
                }
                edit.putString("PoolKeys", m37928b());
                edit.apply();
            }
        }
    }

    /* renamed from: b */
    private final String m37928b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f45114b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((C16030kr) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    static String[] m37926a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    /* renamed from: b */
    static boolean m37929b(String str) {
        try {
            return Pattern.matches((String) caf.m37099d().mo30717a(C15740bx.f44233aT), str);
        } catch (RuntimeException e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: a */
    static Set<String> m37923a(zzyv zzyv) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzyv.f46319c.keySet());
        Bundle bundle = zzyv.f46329m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    static zzyv m37927b(zzyv zzyv) {
        zzyv d = m37932d(zzyv);
        String str = "_skipMediation";
        Bundle bundle = d.f46329m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        d.f46319c.putBoolean(str, true);
        return d;
    }

    /* renamed from: c */
    static zzyv m37930c(zzyv zzyv) {
        String[] split;
        zzyv d = m37932d(zzyv);
        for (String str : ((String) caf.m37099d().mo30717a(C15740bx.f44229aP)).split(",")) {
            m37924a(d.f46329m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m37924a(d.f46319c, str.replaceFirst(str2, ""));
            }
        }
        return d;
    }

    /* renamed from: c */
    static String m37931c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        } catch (RuntimeException unused) {
        }
        return str;
    }

    /* renamed from: d */
    private static zzyv m37932d(zzyv zzyv) {
        Parcel obtain = Parcel.obtain();
        zzyv.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzyv zzyv2 = (zzyv) zzyv.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzyv2.mo31643a();
    }

    /* renamed from: a */
    private static void m37924a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static void m37925a(String str, C16030kr krVar) {
        if (abv.m32791a(2)) {
            abv.m32494a(C2240a.m6772a(str, new Object[]{krVar}));
        }
    }
}
