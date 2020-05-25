package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a.C29693a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.a */
public final class C29765a extends C1352v implements OnClickListener, C29693a {

    /* renamed from: a */
    public TextView f77751a;

    /* renamed from: b */
    public RemoteImageView f77752b;

    /* renamed from: c */
    RelativeLayout f77753c;

    /* renamed from: d */
    LinearLayout f77754d;

    /* renamed from: e */
    LinearLayout f77755e;

    /* renamed from: f */
    public TextView f77756f;

    /* renamed from: g */
    public Challenge f77757g;

    /* renamed from: h */
    public Activity f77758h;

    /* renamed from: a */
    public final void mo59961a() {
        if (this.f77757g != null) {
            C29692a.m69734a(1, this.f77757g.getCid());
        }
    }

    public C29765a(View view) {
        super(view);
        this.f77751a = (TextView) view.findViewById(R.id.s4);
        this.f77752b = (RemoteImageView) view.findViewById(R.id.ci1);
        this.f77753c = (RelativeLayout) view.findViewById(R.id.cds);
        this.f77754d = (LinearLayout) view.findViewById(R.id.bgn);
        this.f77754d.setOnClickListener(this);
        this.f77755e = (LinearLayout) view.findViewById(R.id.s2);
        this.f77756f = (TextView) view.findViewById(R.id.di_);
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.bgn) {
            Activity activity = this.f77758h;
            Challenge challenge = this.f77757g;
            String str2 = "collection_tag";
            String str3 = "";
            if (challenge != null) {
                String uuid = UUID.randomUUID().toString();
                SmartRoute withParam = SmartRouter.buildRoute((Context) activity, "aweme://challenge/detail/").withParam("id", challenge.getCid());
                String str4 = "is_commerce";
                if (C26403au.m63866b(challenge)) {
                    str = "1";
                } else {
                    str = "0";
                }
                withParam.withParam(str4, str).withParam("enter_from", str2).withParam("process_id", uuid).open();
                String cid = challenge.getCid();
                C23089d a = C23089d.m56640a();
                if (!TextUtils.isEmpty(str3)) {
                    a.mo47829a("tab_name", str3);
                }
                C26890h.m65011a("enter_tag_detail", a.mo47829a("enter_from", str2).mo47829a("enter_method", "click_collection_tag").mo47829a("tag_id", cid).mo47829a("process_id", uuid).f61491a);
                String cid2 = challenge.getCid();
                C23089d a2 = C23089d.m56640a();
                if (!TextUtils.isEmpty(str3)) {
                    a2.mo47829a("tab_name", str3);
                }
                C26890h.m65011a("click_personal_collection", a2.mo47829a("enter_from", str2).mo47829a(C42311c.f106865i, "tag").mo47829a("tag_id", cid2).f61491a);
            }
        }
    }
}
