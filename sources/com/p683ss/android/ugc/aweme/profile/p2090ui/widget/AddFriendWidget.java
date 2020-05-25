package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a.C24482a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.api.NewUserApiManager;
import com.p683ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p683ss.android.ugc.aweme.profile.p2090ui.RecommendPointView;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AddFriendWidget */
public final class AddFriendWidget extends Widget implements C0199s<C24481a<NewUserCount>> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f103095g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AddFriendWidget.class), "mRecommendDot", "getMRecommendDot()Lcom/ss/android/ugc/aweme/profile/ui/RecommendPointView;"))};

    /* renamed from: h */
    public int f103096h;

    /* renamed from: i */
    private final C0198r<C24481a<NewUserCount>> f103097i = new C0198r<>();

    /* renamed from: j */
    private final C52668f f103098j = C52732g.m112285a(new C40400b(this));

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AddFriendWidget$a */
    static final class C40399a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFriendWidget f103099a;

        C40399a(AddFriendWidget addFriendWidget) {
            this.f103099a = addFriendWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                this.f103099a.mo82629a().startActivity(I18nBridgeService.getBridgeService_Monster().getAddFriendsActivityIntent(this.f103099a.mo82629a(), this.f103099a.f103096h, 21, "", "homepage_familiar"));
                this.f103099a.mo82630a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AddFriendWidget$b */
    static final class C40400b extends C52712l implements C52670a<RecommendPointView> {

        /* renamed from: a */
        final /* synthetic */ AddFriendWidget f103100a;

        C40400b(AddFriendWidget addFriendWidget) {
            this.f103100a = addFriendWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecommendPointView) this.f103100a.mo25053b().findViewById(R.id.erf);
        }
    }

    /* renamed from: c */
    private final RecommendPointView m89774c() {
        return (RecommendPointView) this.f103098j.getValue();
    }

    /* renamed from: e */
    public final int mo25056e() {
        return R.layout.byk;
    }

    /* renamed from: a */
    public final Context mo82629a() {
        Context context = mo25053b().getContext();
        C52711k.m112236a((Object) context, "container.context");
        return context;
    }

    /* renamed from: j */
    public final void mo25058j() {
        super.mo25058j();
        NewUserApiManager.m88500a(this.f103097i);
    }

    /* renamed from: m */
    public final void mo25061m() {
        super.mo25061m();
        this.f103097i.removeObserver(this);
    }

    /* renamed from: g */
    public final void mo25057g() {
        super.mo25057g();
        mo25053b().setOnClickListener(new C40399a(this));
        this.f103097i.observe(this, this);
    }

    /* renamed from: a */
    public final void mo82630a(int i) {
        if (i <= 0 || TimeLockRuler.isTeenModeON()) {
            m89774c().setVisibility(8);
        } else {
            m89774c().setVisibility(0);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C24482a aVar;
        int i;
        C24481a aVar2 = (C24481a) obj;
        if (aVar2 != null) {
            aVar = aVar2.f64867a;
        } else {
            aVar = null;
        }
        if (aVar == C24482a.SUCCESS) {
            NewUserCount newUserCount = (NewUserCount) aVar2.f64868b;
            if (newUserCount != null) {
                i = newUserCount.count;
            } else {
                i = 0;
            }
            this.f103096h = i;
            if (this.f103096h <= 0) {
                mo82630a(0);
                return;
            }
            mo82630a(this.f103096h);
        }
    }
}
