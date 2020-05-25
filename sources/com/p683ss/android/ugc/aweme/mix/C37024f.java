package com.p683ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.p126ad.symphony.p139i.C2744c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.detail.DetailViewModel;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.utils.C31214w;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.mix.f */
public final class C37024f implements C0199s<Boolean>, C29689c {

    /* renamed from: c */
    public static final C37028a f94554c = new C37028a(null);

    /* renamed from: a */
    public boolean f94555a;

    /* renamed from: b */
    public final View f94556b;

    /* renamed from: d */
    private MixStruct f94557d;

    /* renamed from: e */
    private final C29686a f94558e;

    /* renamed from: f */
    private C39481c f94559f;

    /* renamed from: g */
    private String f94560g;

    /* renamed from: h */
    private final CheckableImageView f94561h;

    /* renamed from: i */
    private final DmtTextView f94562i;

    /* renamed from: j */
    private final String f94563j;

    /* renamed from: k */
    private final String f94564k;

    /* renamed from: l */
    private final boolean f94565l;

    /* renamed from: com.ss.android.ugc.aweme.mix.f$a */
    public static final class C37028a {
        private C37028a() {
        }

        public /* synthetic */ C37028a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo76341d() {
        C47718bf.m103291d(this);
    }

    /* renamed from: e */
    private final void m83252e() {
        this.f94555a = !this.f94555a;
    }

    /* renamed from: b */
    public final void mo76339b() {
        int i;
        CheckableImageView checkableImageView = this.f94561h;
        if (checkableImageView != null) {
            if (this.f94555a) {
                i = R.drawable.ag3;
            } else {
                i = R.drawable.dg0;
            }
            checkableImageView.setImageResource(i);
        }
    }

    /* renamed from: c */
    public final void mo76340c() {
        int i;
        C39481c cVar = this.f94559f;
        if (cVar != null && !this.f94555a && cVar.isShowing()) {
            cVar.dismiss();
        }
        DmtTextView dmtTextView = this.f94562i;
        if (dmtTextView != null) {
            if (this.f94555a) {
                i = R.string.a4i;
            } else {
                i = R.string.a4a;
            }
            dmtTextView.setText(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76337a() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.favorites.c.a r0 = r10.f94558e
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r10.f94557d
            r3 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.mixId
            goto L_0x0016
        L_0x0015:
            r2 = r3
        L_0x0016:
            r4 = 1
            r1[r4] = r2
            r2 = 2
            boolean r5 = r10.f94555a
            r5 = r5 ^ r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r2] = r5
            r0.mo44934a_(r1)
            r10.m83252e()
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r0 = r10.f94561h
            if (r0 == 0) goto L_0x0030
            r0.mo76959b()
        L_0x0030:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            java.lang.String r1 = r10.f94560g
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAwemeById(r1)
            boolean r1 = r10.f94555a
            r1 = r1 ^ r4
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r10.f94557d
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r2.mixId
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r10.f94557d
            if (r4 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.author
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r4.getUid()
            goto L_0x0055
        L_0x0054:
            r4 = r3
        L_0x0055:
            java.lang.String r5 = r10.f94564k
            java.lang.String r6 = "compilation_detail"
            java.lang.String r7 = r10.f94563j
            java.lang.String r8 = "enterMethod"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r8)
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = "cancel_favourite_compilation"
            goto L_0x0067
        L_0x0065:
            java.lang.String r1 = "favourite_compilation"
        L_0x0067:
            com.ss.android.ugc.aweme.app.f.d r8 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r9 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r6 = r8.mo47829a(r9, r6)
            java.lang.String r8 = "compilation_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r6.mo47829a(r8, r2)
            java.lang.String r6 = "enter_method"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r6, r7)
            java.lang.String r6 = "author_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r6, r4)
            java.lang.String r4 = "feed_group_id"
            if (r0 == 0) goto L_0x008c
            java.lang.String r6 = r0.getAid()
            goto L_0x008d
        L_0x008c:
            r6 = r3
        L_0x008d:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r6)
            java.lang.String r4 = "feed_author_id"
            if (r0 == 0) goto L_0x0099
            java.lang.String r3 = r0.getAuthorUid()
        L_0x0099:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r3)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r4 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r0)
            java.lang.String r0 = r4.mo60161a(r0)
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37024f.mo76337a():void");
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        m83252e();
        mo76339b();
        mo76340c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.isCollected() == 1) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m83251a(com.p683ss.android.ugc.aweme.feed.model.MixStruct r2) {
        /*
            r1 = this;
            r1.f94557d = r2
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r1.f94557d
            r0 = 1
            if (r2 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.MixStatusStruct r2 = r2.status
            if (r2 == 0) goto L_0x0012
            int r2 = r2.isCollected()
            if (r2 != r0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r1.f94555a = r0
            r1.mo76339b()
            r1.mo76340c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37024f.m83251a(com.ss.android.ugc.aweme.feed.model.MixStruct):void");
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        C39481c cVar = this.f94559f;
        if (cVar != null && cVar.isShowing()) {
            cVar.dismiss();
        }
    }

    @C53771m
    public final void updateCollectStatus(C37030h hVar) {
        String str;
        C52711k.m112240b(hVar, "mixAddCollectEvent");
        if (hVar.f94570a != null && this.f94557d != null) {
            String str2 = hVar.f94570a;
            MixStruct mixStruct = this.f94557d;
            if (mixStruct != null) {
                str = mixStruct.mixId;
            } else {
                str = null;
            }
            if (C52830p.m112407a(str2, str, false, 2, null)) {
                MixStruct mixStruct2 = this.f94557d;
                if (mixStruct2 != null) {
                    MixStatusStruct mixStatusStruct = mixStruct2.status;
                    if (mixStatusStruct != null) {
                        mixStatusStruct.setCollected(hVar.f94571b);
                    }
                }
                m83251a(this.f94557d);
            }
        }
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        String str;
        Context context;
        boolean z = this.f94555a;
        MixStruct mixStruct = this.f94557d;
        if (mixStruct != null) {
            MixStatusStruct mixStatusStruct = mixStruct.status;
            if (mixStatusStruct != null) {
                mixStatusStruct.setCollected(z);
            }
        }
        if (this.f94560g != null) {
            Aweme awemeById = C23324d.m57378a().getAwemeById(this.f94560g);
            if (awemeById != null) {
                MixStruct mixInfo = awemeById.getMixInfo();
                if (mixInfo != null) {
                    MixStatusStruct mixStatusStruct2 = mixInfo.status;
                    if (mixStatusStruct2 != null) {
                        mixStatusStruct2.setCollected(z ? 1 : 0);
                    }
                }
            }
        }
        MixStruct mixStruct2 = this.f94557d;
        if (mixStruct2 != null) {
            str = mixStruct2.mixId;
        } else {
            str = null;
        }
        C47718bf.m103288a(new C37030h(str, this.f94555a ? 1 : 0));
        if (this.f94555a && !C31214w.m72902a("mix_collect_remind_flag")) {
            View view = this.f94556b;
            if (!(view == null || view.getContext() == null)) {
                ImageView imageView = new ImageView(this.f94556b.getContext());
                imageView.setBackgroundColor(this.f94556b.getResources().getColor(R.color.aso));
                imageView.setScaleType(ScaleType.FIT_XY);
                int a = (int) C2744c.m7835a(this.f94556b.getContext(), 6.0f);
                imageView.setPadding(a, a, a, a);
                imageView.setImageResource(R.drawable.b4l);
            }
            C31214w.m72899a("mix_collect_remind_flag", true);
        }
        if (this.f94555a) {
            DmtTextView dmtTextView = this.f94562i;
            if (dmtTextView != null) {
                context = dmtTextView.getContext();
            } else {
                context = null;
            }
            C23729p.m58248a(context);
            this.f94559f = null;
        }
    }

    /* renamed from: a */
    public final void mo76338a(MixStruct mixStruct, String str) {
        m83251a(mixStruct);
        this.f94560g = str;
    }

    public C37024f(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView, String str, String str2, final OnClickListener onClickListener, boolean z) {
        C52711k.m112240b(str, "mEnterMethod");
        this.f94556b = view;
        this.f94561h = checkableImageView;
        this.f94562i = dmtTextView;
        this.f94563j = str;
        this.f94564k = str2;
        this.f94565l = z;
        this.f94558e = new C29686a();
        C47718bf.m103290c(this);
        View view2 = this.f94556b;
        if (view2 != null) {
            view2.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C37024f f94566a;

                {
                    this.f94566a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    IAccountUserService a = C20902b.m53242a();
                    C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                    if (!a.isLogin()) {
                        C27965f.m66721a(C23729p.m58270d(this.f94566a.f94556b), "compilation_detail", "click_favorite_compilation", (Bundle) null, (C23505g) new C37029g(new C52670a<C52860x>(this.f94566a) {
                            public final String getName() {
                                return "requestCollect";
                            }

                            public final C52761d getOwner() {
                                return C52728w.m112245a(C37024f.class);
                            }

                            public final String getSignature() {
                                return "requestCollect()V";
                            }

                            public final /* synthetic */ Object invoke() {
                                ((C37024f) this.receiver).mo76337a();
                                return C52860x.f131107a;
                            }
                        }));
                        return;
                    }
                    this.f94566a.mo76337a();
                    OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
        CheckableImageView checkableImageView2 = this.f94561h;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new C37446a(this) {

                /* renamed from: a */
                final /* synthetic */ C37024f f94568a;

                /* renamed from: a */
                public final void mo50574a() {
                    this.f94568a.mo76340c();
                }

                {
                    this.f94568a = r1;
                }

                /* renamed from: a */
                public final void mo50575a(int i) {
                    if (i == 1) {
                        this.f94568a.mo76339b();
                    }
                }
            });
        }
        this.f94558e.mo54800a(this);
        Activity d = C23729p.m58270d(this.f94556b);
        if (d != null) {
            NextLiveData<Boolean> nextLiveData = ((DetailViewModel) C0214z.m440a((FragmentActivity) d).mo359a(DetailViewModel.class)).f72033a;
            Activity d2 = C23729p.m58270d(this.f94556b);
            if (d2 != null) {
                nextLiveData.observe((FragmentActivity) d2, this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public /* synthetic */ C37024f(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView, String str, String str2, OnClickListener onClickListener, boolean z, int i, C52707g gVar) {
        this(view, checkableImageView, dmtTextView, str, str2, null, false);
    }
}
