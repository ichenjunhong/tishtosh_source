package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.view.ViewStub;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32435h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.h */
public final class C37977h extends C32435h {
    /* renamed from: A */
    public final void mo65645A() {
    }

    /* renamed from: o */
    public final boolean mo65668o() {
        return true;
    }

    /* renamed from: w */
    public final void mo65680w() {
        this.f84408y.setVisibility(8);
    }

    /* renamed from: u */
    public final void mo65678u() {
        mo65646B();
        mo65683z();
        mo65645A();
    }

    /* renamed from: E */
    public final List<String> mo65649E() {
        ArrayList arrayList = new ArrayList();
        if (!C31190f.m72831a(this.f84362F) && C47915gg.m103646a(this.f84362F)) {
            arrayList.add(mo65546b().getString(R.string.f9m));
        }
        return arrayList;
    }

    /* renamed from: B */
    public final void mo65646B() {
        if (this.f84404u != null) {
            if (C31753a.m73743c(this.f84362F)) {
                this.f84404u.setImageResource(R.drawable.dge);
            } else {
                this.f84404u.setImageResource(R.drawable.dfc);
            }
        }
        if (this.f84405v != null) {
            this.f84405v.setVisibility(0);
            this.f84405v.setTextSize(1, 13.0f);
            if (C31753a.m73743c(this.f84362F)) {
                this.f84405v.setText(R.string.c7g);
                return;
            }
            this.f84405v.setText(R.string.fbv);
        }
    }

    /* renamed from: b */
    public final void mo65661b(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo65652a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo65652a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.a5b);
        mo65652a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cty);
        viewStub4.setLayoutResource(R.layout.a3n);
        mo65652a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cts);
        viewStub5.setLayoutResource(R.layout.b_u);
        mo65653a(viewStub5.inflate(), 16.0f, 20.0f);
    }

    public C37977h(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar) {
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f84406w.setDisplayType(true);
    }
}
