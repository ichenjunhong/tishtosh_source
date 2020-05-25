package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.antiaddic.p1353a.C22689a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ae */
public final class C26371ae {

    /* renamed from: a */
    public static List<String> f69577a = new ArrayList();

    /* renamed from: b */
    public static List<String> f69578b = new ArrayList();

    /* renamed from: c */
    public static String f69579c = "";

    /* renamed from: d */
    public static String f69580d;

    /* renamed from: e */
    public static final C26371ae f69581e;

    /* renamed from: f */
    private static final C22689a f69582f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ae$a */
    public static final class C26372a extends C22689a {

        /* renamed from: c */
        final /* synthetic */ C26371ae f69583c;

        /* renamed from: a */
        public final C23051bf<Long> mo47077a() {
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf<Long> adSouthNorthFirstSupportTime = inst.getAdSouthNorthFirstSupportTime();
            C52711k.m112236a((Object) adSouthNorthFirstSupportTime, "SharePrefCache.inst().adSouthNorthFirstSupportTime");
            return adSouthNorthFirstSupportTime;
        }

        C26372a(C26371ae aeVar, int i) {
            this.f69583c = aeVar;
            super(0);
        }
    }

    private C26371ae() {
    }

    static {
        C26371ae aeVar = new C26371ae();
        f69581e = aeVar;
        f69582f = new C26372a(aeVar, 0);
    }

    /* renamed from: a */
    public static String m63817a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (f69582f.mo47079b(currentTimeMillis)) {
            f69582f.mo47078a(currentTimeMillis);
            return null;
        }
        if (TextUtils.isEmpty(f69580d)) {
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf adSouthNorthFirstSupportTeam = inst.getAdSouthNorthFirstSupportTeam();
            C52711k.m112236a((Object) adSouthNorthFirstSupportTeam, "SharePrefCache.inst().adSouthNorthFirstSupportTeam");
            f69580d = (String) adSouthNorthFirstSupportTeam.mo47782d();
        }
        return f69580d;
    }

    /* renamed from: a */
    public static boolean m63818a(String str) {
        if (C52575l.m112125a((Iterable<? extends T>) f69577a, str) || C52575l.m112125a((Iterable<? extends T>) f69578b, str)) {
            return true;
        }
        return false;
    }
}
