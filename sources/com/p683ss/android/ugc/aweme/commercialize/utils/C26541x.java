package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p030v4.app.C0654k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25876ah;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.x */
public final class C26541x implements C25876ah {
    /* renamed from: b */
    public final boolean mo53198b(String str) {
        return C26540w.m64242c(str);
    }

    /* renamed from: a */
    public final boolean mo53194a(Uri uri) {
        return C26540w.m64227a(uri);
    }

    /* renamed from: a */
    public final boolean mo53195a(String str) {
        return C26540w.m64245d(str);
    }

    /* renamed from: a */
    public final void mo53188a(Context context, Aweme aweme) {
        C26540w.m64232b(context, aweme);
    }

    /* renamed from: d */
    public final void mo53200d(Context context, Aweme aweme) {
        C26540w.m64239c(context, aweme);
    }

    /* renamed from: a */
    public final void mo53189a(Context context, String str) {
        C26540w.m64206a(context, str);
    }

    /* renamed from: b */
    public final boolean mo53196b(Context context, Aweme aweme) {
        return C26540w.m64211a(context, aweme);
    }

    /* renamed from: c */
    public final boolean mo53199c(Context context, Aweme aweme) {
        return C26540w.m64257g(context, aweme);
    }

    /* renamed from: b */
    public final boolean mo53197b(Context context, String str) {
        return C26540w.m64256d(context, str);
    }

    /* renamed from: a */
    public final boolean mo53192a(Context context, String str, String str2) {
        return C26540w.m64222a(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo53193a(Context context, String str, boolean z) {
        return C26540w.m64226a(context, str, z);
    }

    /* renamed from: a */
    public final boolean mo53190a(Activity activity, Aweme aweme, C0654k kVar, int i) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return C26533q.m64219a((Context) activity, aweme.getAwemeRawAd().getFormUrl(), aweme, i);
    }

    /* renamed from: a */
    public final boolean mo53191a(Context context, Aweme aweme, C25908e eVar, int i, C25735b bVar) {
        return C26540w.m64253a(context, aweme, eVar, i, bVar);
    }
}
