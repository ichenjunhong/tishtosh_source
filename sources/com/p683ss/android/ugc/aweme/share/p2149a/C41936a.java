package com.p683ss.android.ugc.aweme.share.p2149a;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.a.a */
public final class C41936a {

    /* renamed from: a */
    public final int f106131a = this.f106137g.getInt("page_type");

    /* renamed from: b */
    public final String f106132b;

    /* renamed from: c */
    public final Activity f106133c;

    /* renamed from: d */
    public final Aweme f106134d;

    /* renamed from: e */
    public final C30313ae<C30332aw> f106135e;

    /* renamed from: f */
    private final Fragment f106136f;

    /* renamed from: g */
    private final Bundle f106137g;

    public C41936a(Activity activity, Fragment fragment, Aweme aweme, C30313ae<C30332aw> aeVar, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(aeVar, "eventListener");
        C52711k.m112240b(bundle, "extras");
        this.f106133c = activity;
        this.f106136f = fragment;
        this.f106134d = aweme;
        this.f106135e = aeVar;
        this.f106137g = bundle;
        String string = this.f106137g.getString("event_type", "");
        C52711k.m112236a((Object) string, "extras.getString(Mob.Key.EVENT_TYPE, \"\")");
        this.f106132b = string;
    }
}
