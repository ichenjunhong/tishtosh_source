package com.p683ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.k */
final /* synthetic */ class C37407k implements C52682m {

    /* renamed from: a */
    static final C52682m f95418a = new C37407k();

    private C37407k() {
    }

    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}
