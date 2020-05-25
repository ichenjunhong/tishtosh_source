package com.p683ss.android.ugc.aweme.follow.p1762a;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.follow.a.a */
public final class C31858a {

    /* renamed from: a */
    public static final String f83234a;

    /* renamed from: b */
    public static final String f83235b;

    /* renamed from: c */
    public static final C31858a f83236c = new C31858a();

    /* renamed from: d */
    private static File f83237d = C47723bk.m103306a(f83235b, true);

    /* renamed from: e */
    private static final C17971f f83238e = new C17971f();

    private C31858a() {
    }

    /* renamed from: a */
    public static boolean m74260a() {
        File file = f83237d;
        if (file != null && file.exists()) {
            return true;
        }
        C47723bk.m103306a(f83234a, false);
        File a = C47723bk.m103306a(f83235b, true);
        f83237d = a;
        if (a == null || !a.exists()) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C48016e.m103953e());
        sb.append(File.separator);
        sb.append("follow_feed_cache");
        f83234a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f83234a);
        sb2.append(File.separator);
        sb2.append("cache");
        f83235b = sb2.toString();
        C47723bk.m103306a(f83234a, false);
    }

    /* renamed from: a */
    public static FollowFeedList m74258a(String str) {
        try {
            return (FollowFeedList) f83238e.mo34884a(str, FollowFeedList.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m74259a(FollowFeedList followFeedList) {
        try {
            String b = f83238e.mo34889b(followFeedList);
            if (b == null) {
                return "";
            }
            return b;
        } catch (Exception unused) {
            return "";
        }
    }
}
