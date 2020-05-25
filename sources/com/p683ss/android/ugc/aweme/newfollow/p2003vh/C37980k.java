package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p1995b.C37852b.C37853a;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.profile.C39876i;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.k */
public final class C37980k extends C1352v {

    /* renamed from: a */
    public C39876i f96688a;

    /* renamed from: b */
    public final Activity f96689b;

    /* renamed from: c */
    public final String f96690c;

    /* renamed from: d */
    public final C37997r f96691d;

    /* renamed from: e */
    public final C37837a f96692e;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.k$a */
    public static final class C37981a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37980k f96693a;

        public C37981a(C37980k kVar) {
            this.f96693a = kVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity activity = this.f96693a.f96689b;
            C37853a r0 = new C37853a(this) {

                /* renamed from: a */
                final /* synthetic */ C37981a f96694a;

                {
                    this.f96694a = r1;
                }

                /* renamed from: a */
                public final void mo77296a() {
                    this.f96694a.f96693a.f96691d.mo77466m();
                    this.f96694a.f96693a.f96692e.f96349V = false;
                }
            };
            C37879b.m84595d();
            if (activity != null) {
                if (C47673an.m103185b(activity)) {
                    activity.startActivityForResult(ContactsActivity.m75414a(activity, null, false), 1);
                    r0.mo77296a();
                    return;
                }
                C10691a.m21548c((Context) activity, (int) R.string.hd).mo19066a();
                C47673an.m103184a(activity, new C32753b(activity, r0) {

                    /* renamed from: a */
                    final /* synthetic */ Activity f96364a;

                    /* renamed from: b */
                    final /* synthetic */ C37853a f96365b;

                    /* renamed from: b */
                    public final void mo60073b() {
                    }

                    /* renamed from: a */
                    public final void mo60072a() {
                        this.f96364a.startActivityForResult(ContactsActivity.m75414a(this.f96364a, null, true), 1);
                        if (this.f96365b != null) {
                            this.f96365b.mo77296a();
                        }
                    }

                    {
                        this.f96364a = r1;
                        this.f96365b = r2;
                    }
                });
            }
        }
    }

    public C37980k(View view, Activity activity, String str, C37997r rVar, C37837a aVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "mTabType");
        C52711k.m112240b(rVar, "followFeedViewHolder");
        C52711k.m112240b(aVar, "adapter");
        super(view);
        this.f96689b = activity;
        this.f96690c = str;
        this.f96691d = rVar;
        this.f96692e = aVar;
        C39876i createThirdPartyAddFriendView = I18nBridgeService.getBridgeService_Monster().createThirdPartyAddFriendView(this.f96689b);
        C52711k.m112236a((Object) createThirdPartyAddFriendView, "ServiceManager.get().get…tyAddFriendView(activity)");
        this.f96688a = createThirdPartyAddFriendView;
        ((ViewGroup) view).addView(I18nBridgeService.getBridgeService_Monster().createFollowFeedEmptyHeadView(this.f96689b, this.f96690c, this.f96688a));
    }
}
