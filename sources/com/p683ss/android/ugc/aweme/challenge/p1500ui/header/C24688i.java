package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p683ss.android.ugc.aweme.C22570am;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.DetailViewModel;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.i */
public final class C24688i implements C0199s<Boolean>, C29689c {

    /* renamed from: a */
    Challenge f65340a;

    /* renamed from: b */
    C24706l f65341b;

    /* renamed from: c */
    public boolean f65342c;

    /* renamed from: d */
    public boolean f65343d;

    /* renamed from: e */
    boolean f65344e;

    /* renamed from: f */
    public final View f65345f;

    /* renamed from: g */
    private final C29686a f65346g;

    /* renamed from: h */
    private C39481c f65347h;

    /* renamed from: i */
    private final CheckableImageView f65348i;

    /* renamed from: j */
    private final DmtTextView f65349j;

    /* renamed from: k */
    private final ChallengeDetailParam f65350k;

    /* renamed from: e */
    private final void m60191e() {
    }

    /* renamed from: d */
    private final void m60190d() {
        this.f65344e = !this.f65344e;
    }

    /* renamed from: a */
    public final void mo50567a() {
        int i;
        CheckableImageView checkableImageView;
        if (C24531a.m59939a(this.f65350k)) {
            checkableImageView = this.f65348i;
            i = 0;
        } else {
            checkableImageView = this.f65348i;
            if (this.f65344e) {
                i = R.drawable.dfz;
            } else {
                i = R.drawable.dg0;
            }
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo50571b() {
        int i;
        DmtTextView dmtTextView = this.f65349j;
        if (dmtTextView != null) {
            if (this.f65344e) {
                i = R.string.f6;
            } else {
                i = R.string.f0;
            }
            dmtTextView.setText(i);
        }
        C39481c cVar = this.f65347h;
        if (cVar != null && !this.f65344e && cVar.isShowing()) {
            cVar.dismiss();
        }
        if (this.f65344e) {
            this.f65343d = true;
            m60191e();
        }
    }

    /* renamed from: c */
    public final void mo50572c() {
        C29686a aVar = this.f65346g;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(3);
        Challenge challenge = this.f65340a;
        if (challenge == null) {
            C52711k.m112237a("mData");
        }
        objArr[1] = challenge.getCid();
        objArr[2] = Integer.valueOf(true ^ this.f65344e ? 1 : 0);
        aVar.mo44934a_(objArr);
        m60190d();
        this.f65348i.mo76959b();
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
        m60190d();
        mo50567a();
        mo50571b();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        C39481c cVar = this.f65347h;
        if (cVar != null && cVar.isShowing()) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        Challenge challenge = this.f65340a;
        if (challenge == null) {
            C52711k.m112237a("mData");
        }
        challenge.setCollectStatus(this.f65344e ? 1 : 0);
        if (this.f65344e) {
            this.f65342c = true;
            m60191e();
        }
    }

    /* renamed from: a */
    public final void mo50569a(Challenge challenge, C24706l lVar) {
        C52711k.m112240b(challenge, "data");
        C52711k.m112240b(lVar, "headerParam");
        this.f65340a = challenge;
        this.f65341b = lVar;
        boolean z = true;
        if (challenge.getCollectStatus() != 1) {
            z = false;
        }
        this.f65344e = z;
        mo50567a();
        mo50571b();
    }

    private C24688i(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView, ChallengeDetailParam challengeDetailParam) {
        C52711k.m112240b(view, "container");
        C52711k.m112240b(checkableImageView, "collectIv");
        this.f65345f = view;
        this.f65348i = checkableImageView;
        this.f65349j = dmtTextView;
        this.f65350k = challengeDetailParam;
        this.f65346g = new C29686a();
        if (C24531a.m59939a(this.f65350k)) {
            this.f65346g.f77597d = false;
        }
        this.f65345f.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C24688i f65351a;

            {
                this.f65351a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                C24688i iVar = this.f65351a;
                if (iVar.f65344e) {
                    str = "cancel_favourite_challenge";
                } else {
                    str = "favourite_challenge";
                }
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "challenge");
                String str2 = "tag_id";
                Challenge challenge = iVar.f65340a;
                if (challenge == null) {
                    C52711k.m112237a("mData");
                }
                C23089d a2 = a.mo47829a(str2, challenge.getCid());
                String str3 = "challenge_id";
                Challenge challenge2 = iVar.f65340a;
                if (challenge2 == null) {
                    C52711k.m112237a("mData");
                }
                C23089d a3 = a2.mo47829a(str3, challenge2.getCid());
                String str4 = "process_id";
                C24706l lVar = iVar.f65341b;
                if (lVar == null) {
                    C52711k.m112237a("mHeaderParam");
                }
                C26890h.m65011a(str, a3.mo47829a(str4, lVar.f65425e).f61491a);
                C24706l lVar2 = iVar.f65341b;
                if (lVar2 == null) {
                    C52711k.m112237a("mHeaderParam");
                }
                boolean equals = TextUtils.equals(lVar2.f65424d, "search_result");
                C24706l lVar3 = iVar.f65341b;
                if (lVar3 == null) {
                    C52711k.m112237a("mHeaderParam");
                }
                boolean equals2 = TextUtils.equals(lVar3.f65424d, "general_search");
                if ((equals || equals2) && !iVar.f65344e) {
                    C22570am H = C23794bh.m58382H();
                    String str5 = "search_favourite";
                    String str6 = "challenge";
                    Challenge challenge3 = iVar.f65340a;
                    if (challenge3 == null) {
                        C52711k.m112237a("mData");
                    }
                    H.mo46912a(str5, str6, challenge3.getCid(), equals);
                }
                this.f65351a.f65342c = false;
                this.f65351a.f65343d = false;
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66721a(C23729p.m58270d(this.f65351a.f65345f), "challenge", "click_favorite_challenge", (Bundle) null, (C23505g) new C24692j(new C52670a<C52860x>(this.f65351a) {
                        public final String getName() {
                            return "requestCollect";
                        }

                        public final C52761d getOwner() {
                            return C52728w.m112245a(C24688i.class);
                        }

                        public final String getSignature() {
                            return "requestCollect()V";
                        }

                        public final /* synthetic */ Object invoke() {
                            ((C24688i) this.receiver).mo50572c();
                            return C52860x.f131107a;
                        }
                    }));
                } else {
                    this.f65351a.mo50572c();
                }
            }
        });
        this.f65348i.setOnStateChangeListener(new C37446a(this) {

            /* renamed from: a */
            final /* synthetic */ C24688i f65352a;

            /* renamed from: a */
            public final void mo50574a() {
            }

            {
                this.f65352a = r1;
            }

            /* renamed from: a */
            public final void mo50575a(int i) {
                if (i == 1) {
                    this.f65352a.mo50567a();
                    this.f65352a.mo50571b();
                }
            }
        });
        this.f65346g.mo54800a(this);
        Activity d = C23729p.m58270d(this.f65345f);
        if (d != null) {
            NextLiveData<Boolean> nextLiveData = ((DetailViewModel) C0214z.m440a((FragmentActivity) d).mo359a(DetailViewModel.class)).f72033a;
            Activity d2 = C23729p.m58270d(this.f65345f);
            if (d2 != null) {
                nextLiveData.observe((FragmentActivity) d2, this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public /* synthetic */ C24688i(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView, ChallengeDetailParam challengeDetailParam, int i, C52707g gVar) {
        this(view, checkableImageView, dmtTextView, null);
    }
}
