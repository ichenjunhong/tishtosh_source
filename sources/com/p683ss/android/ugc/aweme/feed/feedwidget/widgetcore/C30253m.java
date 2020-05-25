package com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.m */
public final class C30253m {

    /* renamed from: a */
    public static final C30253m f79038a = new C30253m();

    private C30253m() {
    }

    /* renamed from: a */
    public static boolean m71085a(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m71086b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null || aweme.getAuthor().isAdFake()) {
            return false;
        }
        return true;
    }
}
