package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.main.dz */
public final class C36616dz {

    /* renamed from: a */
    public static final C36616dz f93726a = new C36616dz();

    private C36616dz() {
    }

    /* renamed from: a */
    public static final boolean m82505a(int i, boolean z) {
        return z ? i == 99 || i == 7 || i == 3 || i == 6 || i == 2 : i == 47 || i == 62 || i == 61 || i == 99 || i == 21 || i == 7 || i == 3 || i == 6 || i == 44;
    }

    /* renamed from: c */
    public static boolean m82509c(int i) {
        return i == 46 || i == 1000 || i == 101;
    }

    /* renamed from: d */
    public static boolean m82511d(int i) {
        return i == 99 || i == 7 || i == 12 || i == 13 || i == 2 || i == 6 || i == 3 || i == 14 || i == 43 || i == 47 || i == 62 || i == 21 || i == 69;
    }

    /* renamed from: e */
    public static final boolean m82512e() {
        if (C38046d.m85102b(12)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m82506b() {
        return C38046d.m85098a(7, 3, 6, 44);
    }

    /* renamed from: c */
    public static final int m82508c() {
        return C38046d.m85098a(99, 7, 3, 6, 2);
    }

    /* renamed from: f */
    public static boolean m82513f() {
        return C38046d.m85102b(46, 1000, BaseNotice.HASHTAG);
    }

    /* renamed from: h */
    public static int m82515h() {
        return C38046d.m85098a(3, 2, 6, 14, 7, 12, 99);
    }

    /* renamed from: a */
    public static final int m82503a() {
        return C38046d.m85098a(99) + C38046d.m85098a(47, 7, 3, 6, 44, 62);
    }

    /* renamed from: g */
    public static int m82514g() {
        return C38046d.m85098a(99, 7, 12, 13, 2, 6, 3, 14, 43, 47, 62, 21, 69);
    }

    /* renamed from: d */
    public static final boolean m82510d() {
        if (MTNotificationTabMergeExperiment.m85063c()) {
            return C38046d.m85102b(43, 12, 13, 47, 62, 61, 46, 14, 21, 11, BaseNotice.HASHTAG, 1000);
        }
        return C38046d.m85102b(46, 11, 12, BaseNotice.HASHTAG, 1000);
    }

    /* renamed from: a */
    public static final boolean m82504a(int i) {
        return m82505a(i, MTNotificationTabMergeExperiment.m85063c());
    }

    /* renamed from: b */
    public static final boolean m82507b(int i) {
        if (MTNotificationTabMergeExperiment.m85063c()) {
            if (i == 43 || i == 12 || i == 13 || i == 47 || i == 62 || i == 61 || i == 46 || i == 14 || i == 21 || i == 11 || i == 101 || i == 1000) {
                return true;
            }
            return false;
        } else if (i == 46 || i == 11 || i == 101 || i == 1000) {
            return true;
        } else {
            return false;
        }
    }
}
