package com.p683ss.android.ugc.aweme.newfollow.p1994a;

import android.view.View;
import android.view.ViewStub;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32396g;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32432e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a.c */
public class C37842c extends C32432e {

    /* renamed from: X */
    private boolean f96363X = true;

    /* renamed from: o */
    public boolean mo65668o() {
        return this.f96363X;
    }

    /* renamed from: a */
    public final C32396g mo65693a(C31848j jVar) {
        return new C37845f(this, jVar);
    }

    /* renamed from: b */
    public void mo65661b(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo65652a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo65652a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.a3r);
        mo65652a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cty);
        viewStub4.setLayoutResource(R.layout.b_s);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cts);
        viewStub5.setLayoutResource(R.layout.b_u);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.cu0);
        viewStub6.setLayoutResource(R.layout.b_y);
        mo65652a(viewStub6.inflate(), 12.0f);
    }

    public C37842c(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, eVar, aVar);
    }
}
