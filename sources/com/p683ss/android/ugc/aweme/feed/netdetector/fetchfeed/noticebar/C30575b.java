package com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30539a;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.b */
public final class C30575b implements C30574a {

    /* renamed from: a */
    public Activity f79862a;

    /* renamed from: b */
    public View f79863b;

    /* renamed from: c */
    public FeedTopNoticeView f79864c;

    /* renamed from: d */
    private int f79865d = -1;

    /* renamed from: e */
    private C52671b<Boolean, C52860x> f79866e = new C52671b<Boolean, C52860x>() {
        public final /* synthetic */ Object invoke(Object obj) {
            C23727n.m58238a(new C30577c(this, (Boolean) obj));
            return null;
        }
    };

    /* renamed from: b */
    public final void mo62761b() {
        if (this.f79864c != null) {
            FrameLayout frameLayout = this.f79864c.f79860a;
            C52711k.m112236a((Object) frameLayout, C42311c.f106865i);
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo62760a() {
        try {
            mo62761b();
            C30539a aVar = C30539a.f79807b;
            C52671b<Boolean, C52860x> bVar = this.f79866e;
            C52711k.m112240b(bVar, "unit");
            if (C30550b.m71531b()) {
                aVar.mo62735a().mo62750b(bVar);
            }
            this.f79866e = null;
            this.f79865d = -1;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C30575b m71562a(Activity activity, View view) {
        if (C30550b.m71531b()) {
            return new C30575b(activity, view);
        }
        return null;
    }

    private C30575b(Activity activity, View view) {
        this.f79862a = activity;
        this.f79863b = view;
        C30539a aVar = C30539a.f79807b;
        C52671b<Boolean, C52860x> bVar = this.f79866e;
        C52711k.m112240b(bVar, "unit");
        if (C30550b.m71531b()) {
            aVar.mo62735a().mo62747a(bVar);
        }
    }
}
