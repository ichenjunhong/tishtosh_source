package com.p683ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity.C24610a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.b */
public final class C25950b extends C1352v {

    /* renamed from: a */
    public Challenge f68523a;

    /* renamed from: b */
    public int f68524b;

    /* renamed from: c */
    public final C25975j f68525c;

    public C25950b(final View view, C25975j jVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(jVar, "challengeCallback");
        super(view);
        this.f68525c = jVar;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C25950b f68526a;

            {
                this.f68526a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                Challenge challenge = this.f68526a.f68523a;
                if (challenge != null) {
                    C26403au.m63862a(challenge);
                    C24610a aVar = ChallengeDetailActivity.f65105c;
                    Context context = view.getContext();
                    C52711k.m112236a((Object) context, "itemView.context");
                    String cid = challenge.getCid();
                    C52711k.m112236a((Object) cid, "it.cid");
                    aVar.mo50438a(context, cid, "general_search", 0, false);
                    this.f68526a.f68525c.mo53337a(this.f68526a.f68524b);
                }
            }
        });
    }
}
