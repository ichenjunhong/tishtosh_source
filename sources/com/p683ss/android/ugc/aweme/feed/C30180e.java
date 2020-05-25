package com.p683ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.comment.list.C25255d;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.share.C42206m;

/* renamed from: com.ss.android.ugc.aweme.feed.e */
public abstract class C30180e extends C30181a implements C25255d, C42206m {
    /* renamed from: a */
    public abstract void mo60465a();

    /* renamed from: a */
    public abstract void mo60466a(String str);

    /* renamed from: a */
    public abstract void mo60467a(String str, String str2, String str3, String str4);

    public C30180e(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public final void mo52903a(Activity activity, Fragment fragment) {
        if (activity == null) {
            C25069a.m60928b("ATTACH ACTIVITY == NULL");
        }
        this.f78758c = activity;
        this.f78759d = fragment;
    }
}
