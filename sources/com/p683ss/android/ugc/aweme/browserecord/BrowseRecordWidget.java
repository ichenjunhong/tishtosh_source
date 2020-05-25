package com.p683ss.android.ugc.aweme.browserecord;

import android.view.View;
import com.p683ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.BrowseRecordWidget */
public final class BrowseRecordWidget extends AbsFeedWidget {

    /* renamed from: a */
    public C24032i f63657a;

    /* renamed from: h */
    private final C30313ae<C30332aw> f63658h;

    /* renamed from: a */
    public final int mo48238a() {
        return R.layout.b8z;
    }

    public BrowseRecordWidget(C30313ae<C30332aw> aeVar) {
        this.f63658h = aeVar;
    }

    /* renamed from: b */
    public final C31009h mo49728b(View view) {
        C52711k.m112240b(view, "view");
        this.f63657a = new C24032i(view, this.f63658h);
        C24032i iVar = this.f63657a;
        if (iVar == null) {
            C52711k.m112237a("mView");
        }
        return iVar;
    }
}
