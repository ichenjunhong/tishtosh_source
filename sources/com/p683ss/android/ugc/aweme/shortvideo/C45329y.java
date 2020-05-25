package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y */
public final class C45329y {

    /* renamed from: a */
    public static final String f114610a;

    /* renamed from: b */
    public static final String f114611b;

    /* renamed from: c */
    public static final C45329y f114612c = new C45329y();

    /* renamed from: d */
    private static final String f114613d;

    private C45329y() {
    }

    /* renamed from: a */
    public static String m98809a() {
        return f114610a;
    }

    /* renamed from: b */
    public static String m98810b() {
        return f114611b;
    }

    /* renamed from: c */
    public static boolean m98811c() {
        return C39618d.f101152P.mo83103a(C40790a.UsingMixRecordButton);
    }

    /* renamed from: d */
    public static boolean m98812d() {
        if (!TextUtils.isEmpty(C39618d.f101151O.mo83121e(C40796a.StatusTabKey))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo91609e() {
        boolean a = C39618d.f101152P.mo83103a(C40790a.LongDurationRecordAsTab);
        if (!m98811c() || !a) {
            return false;
        }
        return true;
    }

    static {
        String string = C39618d.f101160a.getString(R.string.d5c);
        C52711k.m112236a((Object) string, "AVEnv.application.getStr….record_mode_combine_tag)");
        f114613d = string;
        String string2 = C39618d.f101160a.getString(R.string.d5a);
        C52711k.m112236a((Object) string2, "AVEnv.application.getStr…cord_mode_combine_15_tag)");
        f114610a = string2;
        String string3 = C39618d.f101160a.getString(R.string.d5b);
        C52711k.m112236a((Object) string3, "AVEnv.application.getStr…cord_mode_combine_60_tag)");
        f114611b = string3;
    }
}
