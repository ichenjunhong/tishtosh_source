package com.p683ss.android.ugc.aweme.profile.p2090ui;

import com.p683ss.android.ugc.aweme.profile.model.UrlModelWrap;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ci */
final /* synthetic */ class C40297ci implements Comparator {

    /* renamed from: a */
    static final Comparator f102894a = new C40297ci();

    private C40297ci() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((UrlModelWrap) obj).getPosition() - ((UrlModelWrap) obj2).getPosition();
    }
}
