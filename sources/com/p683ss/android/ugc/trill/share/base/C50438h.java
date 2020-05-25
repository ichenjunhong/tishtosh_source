package com.p683ss.android.ugc.trill.share.base;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30531a;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30532b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.share.base.h */
public final class C50438h {

    /* renamed from: com.ss.android.ugc.trill.share.base.h$a */
    public static final class C50439a extends C30531a {

        /* renamed from: a */
        final /* synthetic */ C30532b f126482a;

        /* renamed from: b */
        final /* synthetic */ Activity f126483b;

        /* renamed from: a */
        public final void mo62728a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f126482a.mo62728a(str);
            }
        }

        C50439a(C30532b bVar, Activity activity, Context context) {
            this.f126482a = bVar;
            this.f126483b = activity;
            super(context);
        }
    }

    /* renamed from: a */
    public static final void m108757a(Activity activity, Aweme aweme, boolean z, int i, String str, C30532b bVar, String str2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "channelKey");
        C52711k.m112240b(bVar, "listener");
        C52711k.m112240b(str2, "enterFrom");
        Context context = activity;
        C50418a aVar = new C50418a(context, z, i, str);
        aVar.f126411E = str2;
        aVar.f126435k = new C50439a(bVar, activity, context);
        aVar.mo98331a(aweme);
    }
}
