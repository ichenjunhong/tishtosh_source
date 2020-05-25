package com.p683ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget */
public final class NewCommentAdWidget extends BaseCommentWidget implements C0199s<C23274a>, OnClickListener {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f67318i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mCommentAdLayout", "getMCommentAdLayout()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mCommentAdSourceTv", "getMCommentAdSourceTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mCommentAdDesTv", "getMCommentAdDesTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mCommentAdUserIv", "getMCommentAdUserIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mAdViewController", "getMAdViewController()Lcom/ss/android/ugc/aweme/commercialize/feed/AdViewController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NewCommentAdWidget.class), "mAdOpenCallBack", "getMAdOpenCallBack()Lcom/ss/android/ugc/aweme/commercialize/listener/AdOpenCallBack;"))};

    /* renamed from: j */
    public static final C25439a f67319j = new C25439a(null);

    /* renamed from: k */
    private final C25429a f67320k = m61852a((int) R.id.wz);

    /* renamed from: l */
    private final C25429a f67321l = m61852a((int) R.id.wy);

    /* renamed from: m */
    private final C25429a f67322m = m61852a((int) R.id.wx);

    /* renamed from: n */
    private final C25429a f67323n = m61852a((int) R.id.x0);

    /* renamed from: o */
    private final C25429a f67324o = m61852a((int) R.id.wv);

    /* renamed from: p */
    private final C52668f f67325p = C52732g.m112286a(C52757k.NONE, C25442c.f67332a);

    /* renamed from: q */
    private final C52668f f67326q = C52732g.m112286a(C52757k.NONE, C25440b.f67330a);

    /* renamed from: r */
    private boolean f67327r = true;

    /* renamed from: s */
    private boolean f67328s;

    /* renamed from: t */
    private final C52670a<C52860x> f67329t;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget$a */
    public static final class C25439a {
        private C25439a() {
        }

        public /* synthetic */ C25439a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget$b */
    static final class C25440b extends C52712l implements C52670a<C25735b> {

        /* renamed from: a */
        public static final C25440b f67330a = new C25440b();

        C25440b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C254411.f67331a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget$c */
    static final class C25442c extends C52712l implements C52670a<C25908e> {

        /* renamed from: a */
        public static final C25442c f67332a = new C25442c();

        C25442c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C25908e();
        }
    }

    /* renamed from: k */
    private final LinearLayout m61912k() {
        return (LinearLayout) this.f67320k.mo52036a(this, f67318i[0]);
    }

    /* renamed from: l */
    private final View m61913l() {
        return this.f67324o.mo52036a(this, f67318i[4]);
    }

    /* renamed from: m */
    private final C25908e m61914m() {
        return (C25908e) this.f67325p.getValue();
    }

    /* renamed from: a */
    public final int mo48238a() {
        return R.layout.byz;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        m61916o();
    }

    public final void onResume() {
        super.onResume();
        m61915n();
    }

    /* renamed from: p */
    private final void m61917p() {
        View k = m61912k();
        Context context = this.f62235b;
        C52711k.m112236a((Object) context, "mContext");
        m61911a(k, context.getResources().getDimensionPixelOffset(R.dimen.wf), 0, false);
    }

    /* renamed from: q */
    private final void m61918q() {
        View k = m61912k();
        Context context = this.f62235b;
        C52711k.m112236a((Object) context, "mContext");
        m61911a(k, context.getResources().getDimensionPixelOffset(R.dimen.wf), 300, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo52035j() {
        OnClickListener onClickListener = this;
        m61912k().setOnClickListener(onClickListener);
        m61913l().setOnClickListener(onClickListener);
        m61913l().setAlpha(0.5f);
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48227a("comment_ad_struct", sVar, true).mo48227a("comment_ad_view_state", sVar, true);
    }

    /* renamed from: n */
    private final void m61915n() {
        if (mo52030e() && mo52029d().isAppAd() && !C26503d.m64053E(mo52029d()) && !this.f67328s) {
            this.f67328s = true;
        }
    }

    /* renamed from: o */
    private final void m61916o() {
        if (mo52030e() && mo52029d().isAppAd() && mo52029d().getAwemeRawAd() != null && this.f67328s) {
            this.f67328s = false;
        }
    }

    public NewCommentAdWidget(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "hide");
        this.f67329t = aVar;
    }

    public final void onClick(View view) {
        LayoutParams layoutParams;
        ClickInstrumentation.onClick(view);
        LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof MarginLayoutParams) {
            layoutParams2 = layoutParams;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
        if (marginLayoutParams != null && marginLayoutParams.bottomMargin >= 0 && mo52030e()) {
            AwemeRawAd awemeRawAd = mo52029d().getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "aweme.awemeRawAd ?: return");
                int id = view.getId();
                boolean z = false;
                if (id == R.id.wz) {
                    CharSequence type = awemeRawAd.getType();
                    if (type == null || type.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        C26088l.m63321b(this.f62235b, awemeRawAd, "button");
                        if (C26540w.m64253a(this.f62235b, mo52029d(), m61914m(), 6, (C25735b) this.f67326q.getValue())) {
                            this.f67329t.invoke();
                        }
                        return;
                    }
                    return;
                }
                if (id == R.id.wv) {
                    this.f67327r = false;
                    Context context = this.f62235b;
                    C26088l.m63295a(context, "close", awemeRawAd, C26088l.m63265a(context, awemeRawAd, "raw feed comment end click close", true), "button");
                    m61918q();
                }
            }
        }
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f62242a;
            int hashCode = str.hashCode();
            if (hashCode != 566175283) {
                if (hashCode != 584899985) {
                    if (hashCode == 2016314694 && str.equals("comment_aweme_and_params")) {
                        this.f67327r = true;
                        m61917p();
                        C52847n nVar = (C52847n) aVar.mo48246a();
                        if (nVar != null) {
                            Aweme aweme = (Aweme) nVar.getFirst();
                            if (aweme != null) {
                                m61914m().mo53240a(this.f62235b, aweme);
                                m61916o();
                                m61915n();
                            }
                        }
                    }
                } else if (str.equals("comment_ad_struct")) {
                    C26129j jVar = (C26129j) aVar.mo48246a();
                    if (jVar != null) {
                        BaseCommentWidget baseCommentWidget = this;
                        ((DmtTextView) this.f67321l.mo52036a(baseCommentWidget, f67318i[1])).setText(jVar.getSource());
                        ((DmtTextView) this.f67322m.mo52036a(baseCommentWidget, f67318i[2])).setText(jVar.getTitle());
                        C23515d.m57669a((RemoteImageView) this.f67323n.mo52036a(baseCommentWidget, f67318i[3]), jVar.getAvatarIcon());
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(C9432q.m18687b(this.f62235b, 4.0f));
                        gradientDrawable.setColor(Color.parseColor(C26503d.m64078u(mo52029d())));
                        m61912k().setBackground(gradientDrawable);
                    }
                }
            } else if (str.equals("comment_ad_view_state")) {
                Object obj = (Integer) aVar.mo48246a();
                if (obj == null) {
                    obj = Boolean.valueOf(false);
                }
                if (C52711k.m112239a(obj, (Object) Integer.valueOf(0))) {
                    m61917p();
                } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(1))) {
                    if (this.f67327r) {
                        m61911a(m61912k(), C23728o.m58241a(16.0d), 300, true);
                    }
                } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(2))) {
                    m61918q();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m61911a(View view, int i, int i2, boolean z) {
        LayoutParams layoutParams;
        boolean z2;
        LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof MarginLayoutParams) {
            layoutParams2 = layoutParams;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
        if (marginLayoutParams != null) {
            int i3 = marginLayoutParams.bottomMargin;
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || z2) {
                if (!z && z2) {
                    C47795d.m103427a(view, i3, i, i2).start();
                }
                return;
            }
            C26088l.m63320b(this.f62235b, mo52029d().getAwemeRawAd());
            C47795d.m103427a(view, i3, i, i2).start();
        }
    }
}
