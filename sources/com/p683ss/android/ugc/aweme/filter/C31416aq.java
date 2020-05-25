package com.p683ss.android.ugc.aweme.filter;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.filter.aq */
public final class C31416aq {

    /* renamed from: a */
    private static final String f82250a = new File(C39618d.f101160a.getFilesDir(), "filter").getAbsolutePath();

    /* renamed from: b */
    private static final String f82251b = new File(f82250a, "share").getAbsolutePath();

    /* renamed from: a */
    public static String m73202a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f82251b);
        sb.append(File.separator);
        return sb.toString();
    }

    static {
        File file = new File(f82251b);
        if (file.exists()) {
            file.mkdirs();
        }
        m73203b();
        C39618d.f101151O.mo83113a(C40796a.EffectResourceVersion, 3);
    }

    /* renamed from: b */
    private static boolean m73203b() {
        if (C39618d.f101151O.mo83118b(C40796a.EffectResourceVersion) == 3 && C39618d.f101151O.mo83117a(C40796a.EffectShareCopied)) {
            return true;
        }
        try {
            C50205i.m108369a(C39618d.f101160a.getAssets().open("share.zip"), f82251b);
            C39618d.f101151O.mo83116a(C40796a.EffectShareCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }
}
