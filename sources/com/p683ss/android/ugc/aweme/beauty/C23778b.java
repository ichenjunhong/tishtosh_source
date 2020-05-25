package com.p683ss.android.ugc.aweme.beauty;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.beauty.b */
public final class C23778b {

    /* renamed from: a */
    public static ComposerBeautyBuriedInfo f63365a;

    /* renamed from: b */
    public static final C23778b f63366b = new C23778b();

    /* renamed from: c */
    private static String f63367c;

    /* renamed from: d */
    private static String f63368d = "";

    private C23778b() {
    }

    /* renamed from: b */
    public static final int m58353b() {
        return m58354b(f63365a);
    }

    /* renamed from: a */
    public static final String m58351a() {
        String str = f63367c;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    public static final void m58356c() {
        f63365a = null;
        f63368d = "";
        f63367c = null;
    }

    /* renamed from: b */
    public static final int m58354b(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo == null || composerBeautyBuriedInfo.getBeautifyUsed() != 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public static final int m58355c(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo != null) {
            return composerBeautyBuriedInfo.isComposer();
        }
        return 0;
    }

    /* renamed from: a */
    public static final String m58352a(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        String str;
        List list;
        if (C52711k.m112239a((Object) composerBeautyBuriedInfo, (Object) f63365a)) {
            str = f63368d;
        } else {
            C17971f D = C39629l.m88232a().mo58566D();
            if (composerBeautyBuriedInfo != null) {
                list = composerBeautyBuriedInfo.getBeautifyInfo();
            } else {
                list = null;
            }
            str = D.mo34889b(list);
        }
        C52711k.m112236a((Object) str, "this");
        f63368d = str;
        if (composerBeautyBuriedInfo != null) {
            f63365a = ComposerBeautyBuriedInfo.copy$default(composerBeautyBuriedInfo, 0, 0, null, 7, null);
        }
        C52711k.m112236a((Object) str, "(if (info == curInfo) {\n…)\n            }\n        }");
        return str;
    }

    /* renamed from: d */
    public static void m58357d(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        C52711k.m112240b(composerBeautyBuriedInfo, "info");
        String a = m58352a(composerBeautyBuriedInfo);
        C47702b.f120193a.mo94984a("perf_record_video", C42438az.m93209a().mo86523a("beautify_used", m58354b(composerBeautyBuriedInfo)).mo86523a("is_composer", composerBeautyBuriedInfo.isComposer()).mo86526a("beautify_info", a).f107329a);
        if (m58351a() == null) {
            f63367c = a;
        }
    }
}
