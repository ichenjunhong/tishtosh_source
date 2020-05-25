package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32397h;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.h */
public class C32435h extends BaseForwardViewHolder {

    /* renamed from: R */
    TextView f84450R;

    /* renamed from: S */
    ViewStub f84451S;

    /* renamed from: k */
    public final void mo56247k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65674s() {
        super.mo65674s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo65647C() {
        if (VERSION.SDK_INT >= 21) {
            this.f84450R.setOutlineProvider(new C47856en(this.f84450R.getResources().getDimensionPixelOffset(R.dimen.zu)));
            this.f84450R.setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65651a(View view) {
        super.mo65651a(view);
        this.f84450R = (TextView) view.findViewById(R.id.d8j);
        this.f84451S = (ViewStub) view.findViewById(R.id.ctv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65661b(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo65652a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo65652a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.ba7);
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

    public C32435h(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar) {
        super(followFeedLayout, bVar, eVar, aVar);
        this.f84369M = new C32397h(this, jVar);
    }
}
