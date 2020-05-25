package com.p683ss.android.ugc.aweme.notice.api.utils;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.NoticeJediAB;

/* renamed from: com.ss.android.ugc.aweme.notice.api.utils.a */
public final class C38056a {

    /* renamed from: a */
    public static final C38056a f96830a = new C38056a();

    /* renamed from: b */
    private static final boolean f96831b;

    private C38056a() {
    }

    /* renamed from: a */
    public static final boolean m85123a() {
        return f96831b;
    }

    static {
        boolean z;
        if (C10181b.m20511a().mo18168a(NoticeJediAB.class, true, "notice_jedi_ab", 31744, 0) == NoticeJediAB.USE_JEDI) {
            z = true;
        } else {
            z = false;
        }
        f96831b = z;
    }
}
