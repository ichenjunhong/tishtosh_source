package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.link.C25947a;
import com.p683ss.android.ugc.aweme.commercialize.link.C25976k;
import com.p683ss.android.ugc.aweme.commercialize.link.C25976k.C25979c;
import com.p683ss.android.ugc.aweme.commercialize.link.C25976k.C25980d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae.C26111a;
import com.p683ss.android.ugc.aweme.commercialize.search.AbsSearchAdView;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26348d;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26364f;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchMixVideoDisplayStyle;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView */
public class SearchAdView extends AbsSearchAdView implements OnClickListener {

    /* renamed from: A */
    private final C26648b f70215A = new C26648b(this);

    /* renamed from: B */
    private float f70216B = 18.0f;

    /* renamed from: a */
    public DmtTextView f70217a;

    /* renamed from: b */
    C26110ae f70218b;

    /* renamed from: c */
    Rect f70219c;

    /* renamed from: d */
    boolean f70220d;

    /* renamed from: e */
    long f70221e;

    /* renamed from: f */
    long f70222f;

    /* renamed from: g */
    private RemoteImageView f70223g;

    /* renamed from: h */
    private RemoteImageView f70224h;

    /* renamed from: i */
    private TextView f70225i;

    /* renamed from: j */
    private TextView f70226j;

    /* renamed from: k */
    private LinearLayout f70227k;

    /* renamed from: l */
    private LinearLayout f70228l;

    /* renamed from: m */
    private KeepRatioLayout f70229m;

    /* renamed from: n */
    private KeepRatioLayout f70230n;

    /* renamed from: o */
    private RemoteImageView f70231o;

    /* renamed from: p */
    private ConstraintLayout f70232p;

    /* renamed from: q */
    private LinearLayout f70233q;

    /* renamed from: r */
    private DmtTextView f70234r;

    /* renamed from: s */
    private LinearLayout f70235s;

    /* renamed from: t */
    private DmtTextView f70236t;

    /* renamed from: u */
    private FrameLayout f70237u;

    /* renamed from: v */
    private View f70238v;

    /* renamed from: w */
    private View f70239w;

    /* renamed from: x */
    private C25976k f70240x;

    /* renamed from: y */
    private CountDownTimer f70241y;

    /* renamed from: z */
    private View f70242z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView$a */
    static class C26647a implements OnClickListener {

        /* renamed from: a */
        private final Context f70244a;

        /* renamed from: b */
        private final C26110ae f70245b;

        /* renamed from: c */
        private final C26111a f70246c;

        /* renamed from: d */
        private final int f70247d;

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String a = C2240a.m6773a(Locale.US, "sq_module%d", new Object[]{Integer.valueOf(this.f70247d + 1)});
            C26077e.m63190a().mo53582a("result_ad").mo53593b("click").mo53580a(Long.valueOf(this.f70245b.f68945id)).mo53602g(a).mo53604i(this.f70245b.logExtra).mo53586a(this.f70244a);
            C26348d.m63784a(this.f70244a, new C26326a().mo54030c(this.f70246c.f68949d).mo54024a(true).mo54039g(this.f70246c.f68950e).mo54022a(new C36961a().mo76225e(C26364f.m63807a(this.f70246c.f68949d, this.f70246c.f68950e)).mo76221a()).mo54035e(this.f70246c.f68948c).mo54037f(this.f70246c.f68947b).mo54020a(this.f70245b.f68945id).mo54027b(this.f70245b.logExtra).mo54040h("result_ad").mo54041i(a).f69476a).mo54089a();
        }

        C26647a(Context context, C26110ae aeVar, C26111a aVar, int i) {
            this.f70244a = context;
            this.f70245b = aeVar;
            this.f70246c = aVar;
            this.f70247d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView$b */
    static class C26648b extends C1340m implements OnLayoutChangeListener {

        /* renamed from: a */
        private final SearchAdView f70248a;

        C26648b(SearchAdView searchAdView) {
            this.f70248a = searchAdView;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.f70248a.mo54471c();
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f70248a.mo54471c();
        }
    }

    /* renamed from: e */
    private boolean m64465e() {
        if (this.f70218b.nativeType == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m64466f() {
        if (this.f70218b.nativeType == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53833a() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f70230n.getLayoutParams();
        marginLayoutParams.topMargin = C23728o.m58241a(24.0d);
        this.f70230n.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: b */
    public final void mo53834b() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f70230n.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f70230n.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: c */
    public final void mo54471c() {
        this.f70221e = System.currentTimeMillis();
        postDelayed(new C26742k(this), 200);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo54472d() {
        if (m64465e() || m64466f()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        View view2 = this;
        while (true) {
            ViewParent parent = view2.getParent();
            if (parent != null) {
                if (!(parent instanceof RecyclerView)) {
                    if (!(parent instanceof View)) {
                        view = view2;
                        break;
                    }
                    view2 = (View) parent;
                } else {
                    view = (View) parent;
                    break;
                }
            } else {
                view = view2;
                break;
            }
        }
        this.f70242z = view;
        if (this.f70242z instanceof RecyclerView) {
            ((RecyclerView) this.f70242z).mo4801a((C1340m) this.f70215A);
        } else {
            this.f70242z.addOnLayoutChangeListener(this.f70215A);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f70242z instanceof RecyclerView) {
            ((RecyclerView) this.f70242z).mo4818b((C1340m) this.f70215A);
        } else {
            this.f70242z.removeOnLayoutChangeListener(this.f70215A);
        }
        this.f70242z = null;
        if (this.f70241y != null) {
            this.f70241y.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f70223g = (RemoteImageView) findViewById(R.id.cih);
        this.f70224h = (RemoteImageView) findViewById(R.id.ci9);
        this.f70225i = (TextView) findViewById(R.id.cim);
        this.f70226j = (TextView) findViewById(R.id.cil);
        this.f70227k = (LinearLayout) findViewById(R.id.ci8);
        this.f70228l = (LinearLayout) findViewById(R.id.c1);
        this.f70229m = (KeepRatioLayout) findViewById(R.id.c2);
        this.f70230n = (KeepRatioLayout) findViewById(R.id.cij);
        this.f70231o = (RemoteImageView) findViewById(R.id.cjq);
        this.f70232p = (ConstraintLayout) findViewById(R.id.cia);
        this.f70233q = (LinearLayout) findViewById(R.id.cif);
        this.f70234r = (DmtTextView) findViewById(R.id.cig);
        this.f70235s = (LinearLayout) findViewById(R.id.cib);
        this.f70236t = (DmtTextView) findViewById(R.id.cid);
        this.f70217a = (DmtTextView) findViewById(R.id.cic);
        try {
            this.f70217a.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "DIN-Condensed-Bold.otf"));
        } catch (Exception unused) {
        }
        this.f70237u = (FrameLayout) findViewById(R.id.cie);
        this.f70238v = findViewById(R.id.ci_);
        this.f70239w = findViewById(R.id.c7);
        this.f70230n.mo54439a(750, 272, 1);
        setOnClickListener(this);
        this.f70232p.setOnClickListener(this);
    }

    public SearchAdView(Context context) {
        super(context);
    }

    private void setupBottomDivideLine(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f70238v.getLayoutParams();
        layoutParams.topMargin = i;
        this.f70238v.setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view != null && this.f70218b != null && this.f70218b.adType != 1) {
            if (view.getId() != R.id.cia || mo54472d()) {
                if (mo54472d()) {
                    str = "flash";
                } else {
                    str = "card";
                }
                C26088l.m63325b(getContext(), Long.toString(this.f70218b.f68945id), str, this.f70218b.logExtra);
                C26060ay.f68819a.mo53545a("click", this.f70218b.clickTrackUrlList, Long.valueOf(this.f70218b.getCreativeId()), this.f70218b.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26741j<Object,Object,Object>(this));
                C26348d.m63784a(getContext(), new C26326a().mo54030c(this.f70218b.openUrl).mo54033d("result_ad").mo54024a(true).mo54039g(this.f70218b.mpUrl).mo54022a(new C36961a().mo76225e(C26364f.m63807a(this.f70218b.openUrl, this.f70218b.mpUrl)).mo76221a()).mo54035e(this.f70218b.webUrl).mo54037f(this.f70218b.webTitle).mo54020a(this.f70218b.f68945id).mo54027b(this.f70218b.logExtra).mo54040h("result_ad").mo54041i(str).f69476a).mo54089a();
                return;
            }
            C26088l.m63325b(getContext(), Long.toString(this.f70218b.f68945id), "photoname", this.f70218b.logExtra);
            if (this.f70218b.advertisementInfo != null) {
                UserProfileActivity.m89401a(getContext(), this.f70218b.advertisementInfo);
            }
        }
    }

    public void setup(C26110ae aeVar) {
        int i;
        int i2;
        int i3;
        C26110ae aeVar2 = aeVar;
        this.f70218b = aeVar2;
        if (aeVar2.adType == 2) {
            this.f70230n.setVisibility(8);
            this.f70229m.setVisibility(8);
            this.f70232p.setVisibility(8);
            this.f70238v.setVisibility(8);
        } else if (aeVar2.adType == 1) {
            this.f70230n.setVisibility(8);
            this.f70229m.setVisibility(8);
            this.f70232p.setVisibility(8);
            this.f70238v.setVisibility(0);
            setPadding(C23728o.m58241a(16.0d), 0, 0, 0);
            if (this.f70240x == null) {
                this.f70240x = new C25976k(this.f70239w);
            }
            C25976k kVar = this.f70240x;
            C26110ae aeVar3 = this.f70218b;
            C52711k.m112240b(aeVar3, "adData");
            kVar.f68567d = aeVar3;
            if (TextUtils.isEmpty(aeVar3.title)) {
                kVar.f68564a.setVisibility(8);
            } else {
                kVar.f68564a.setText(aeVar3.title);
                kVar.f68564a.setOnClickListener(new C25979c(kVar));
                kVar.f68564a.setVisibility(0);
                C26088l.m63297a(kVar.f68568e.getContext(), String.valueOf(aeVar3.f68945id), "link", aeVar3.logExtra);
                C26060ay.f68819a.mo53545a("show", aeVar3.trackUrlList, Long.valueOf(aeVar3.getCreativeId()), aeVar3.logExtra, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25980d<Object,Object,Object>(aeVar3));
            }
            if (C9376b.m18558a((Collection<T>) aeVar3.challengeList)) {
                kVar.f68565b.setVisibility(8);
            } else {
                if (kVar.f68566c == null) {
                    List<Challenge> list = aeVar3.challengeList;
                    C52711k.m112236a((Object) list, "adData.challengeList");
                    kVar.f68566c = new C25947a(list, kVar);
                    kVar.f68565b.setAdapter(kVar.f68566c);
                } else {
                    C25947a aVar = kVar.f68566c;
                    if (aVar != null) {
                        List<Challenge> list2 = aeVar3.challengeList;
                        C52711k.m112236a((Object) list2, "adData.challengeList");
                        C52711k.m112240b(list2, "list");
                        aVar.f68505a = list2;
                        aVar.notifyDataSetChanged();
                    }
                }
                kVar.f68565b.setVisibility(0);
            }
            this.f70239w.setVisibility(0);
        } else {
            this.f70230n.setVisibility(0);
            this.f70229m.setVisibility(0);
            this.f70239w.setVisibility(8);
            setPadding(C23728o.m58241a(16.0d), 0, C23728o.m58241a(16.0d), 0);
            if (aeVar2.imageList != null && !aeVar2.imageList.isEmpty()) {
                C23515d.m57669a(this.f70223g, (UrlModel) aeVar2.imageList.get(0));
            }
            IMiniAppService a = C36983a.m83185b().mo76294a();
            if (!TextUtils.isEmpty(aeVar2.openUrl)) {
                a.preloadMiniApp(aeVar2.openUrl);
            }
            if (!TextUtils.isEmpty(aeVar2.mpUrl)) {
                a.preloadMiniApp(aeVar2.mpUrl);
            }
            if (!TextUtils.isEmpty(aeVar2.label)) {
                this.f70226j.setText(aeVar2.label);
            } else {
                this.f70226j.setText(R.string.dx);
            }
            if (aeVar2.advertisementInfo == null || aeVar2.advertisementInfo.getAvatarThumb() == null) {
                this.f70224h.setVisibility(8);
            } else {
                C23515d.m57669a(this.f70224h, aeVar2.advertisementInfo.getAvatarThumb());
                this.f70224h.setVisibility(0);
            }
            if (!TextUtils.isEmpty(aeVar2.title)) {
                this.f70225i.setText(aeVar2.title);
                this.f70225i.setVisibility(0);
            } else {
                this.f70225i.setVisibility(8);
            }
            LinearLayout linearLayout = this.f70227k;
            if (!(this.f70224h.getVisibility() == 0 && this.f70225i.getVisibility() == 0) && !mo54472d()) {
                i = 8;
            } else {
                i = 0;
            }
            linearLayout.setVisibility(i);
            this.f70232p.setVisibility(this.f70227k.getVisibility());
            this.f70238v.setVisibility(this.f70227k.getVisibility());
            this.f70228l.removeAllViews();
            if (aeVar2.advancedInfoList != null && !aeVar2.advancedInfoList.isEmpty()) {
                LayoutInflater from = LayoutInflater.from(getContext());
                for (int i4 = 0; i4 < aeVar2.advancedInfoList.size(); i4++) {
                    C26111a aVar2 = (C26111a) aeVar2.advancedInfoList.get(i4);
                    if (aVar2 != null) {
                        if (!TextUtils.isEmpty(aVar2.f68949d)) {
                            a.preloadMiniApp(aVar2.f68949d);
                        }
                        if (!TextUtils.isEmpty(aVar2.f68950e)) {
                            a.preloadMiniApp(aVar2.f68950e);
                        }
                        if (this.f70228l.getChildCount() > 0) {
                            from.inflate(R.layout.zm, this.f70228l);
                        }
                        View inflate = from.inflate(R.layout.zl, this.f70228l, false);
                        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.cii);
                        View findViewById = inflate.findViewById(R.id.eu5);
                        DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.cik);
                        C23515d.m57669a(remoteImageView, aVar2.f68951f);
                        dmtTextView.setText(aVar2.f68946a);
                        inflate.setOnClickListener(new C26647a(getContext(), aeVar2, aVar2, i4));
                        if (TextUtils.isEmpty(aVar2.f68946a.trim())) {
                            findViewById.setVisibility(8);
                        }
                        this.f70228l.addView(inflate);
                    }
                }
            }
            if (this.f70228l.getChildCount() > 0) {
                this.f70229m.mo54439a(310, 76, 1);
            } else {
                KeepRatioLayout keepRatioLayout = this.f70229m;
                keepRatioLayout.mo54440b(0, 0, keepRatioLayout.f70166a);
            }
            if (this.f70231o != null) {
                if (!mo54472d() || aeVar2.imageList == null || aeVar2.imageList.isEmpty()) {
                    this.f70223g.setVisibility(0);
                    this.f70231o.setVisibility(8);
                } else {
                    this.f70223g.setVisibility(8);
                    this.f70231o.setVisibility(0);
                    C23515d.m57669a(this.f70231o, (UrlModel) aeVar2.imageList.get(0));
                }
            }
            if (this.f70233q != null) {
                if (TextUtils.isEmpty(this.f70218b.guideText) || !mo54472d()) {
                    this.f70233q.setVisibility(8);
                } else {
                    this.f70233q.setVisibility(0);
                    if (this.f70234r != null) {
                        this.f70234r.setText(this.f70218b.guideText);
                    }
                }
            }
            if (this.f70235s != null) {
                if (mo54472d()) {
                    if (this.f70236t != null) {
                        if (!TextUtils.isEmpty(this.f70218b.subText)) {
                            this.f70236t.setText(this.f70218b.subText);
                            this.f70236t.setVisibility(0);
                        } else {
                            this.f70236t.setVisibility(8);
                        }
                    }
                    if (this.f70217a != null) {
                        if (m64465e()) {
                            this.f70217a.setVisibility(0);
                            long currentTimeMillis = System.currentTimeMillis();
                            if ((this.f70218b.countDownTimeStamp * 1000) - currentTimeMillis > 0) {
                                C266461 r0 = new CountDownTimer((this.f70218b.countDownTimeStamp * 1000) - currentTimeMillis, 1000) {
                                    public final void onFinish() {
                                        SearchAdView.this.f70217a.setText("00 : 00 : 00");
                                    }

                                    public final void onTick(long j) {
                                        int i = (int) (j / 1000);
                                        int i2 = i / 60;
                                        SearchAdView.this.f70217a.setText(C2240a.m6773a(Locale.getDefault(), "%02d : %02d : %02d", new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)}));
                                    }
                                };
                                this.f70241y = r0;
                                this.f70241y.start();
                            } else {
                                this.f70217a.setText("00 : 00 : 00");
                            }
                        } else {
                            this.f70217a.setVisibility(8);
                        }
                    }
                    if (this.f70237u != null) {
                        this.f70237u.removeAllViews();
                        if (C9376b.m18558a((Collection<T>) this.f70218b.iconList) || !m64466f()) {
                            this.f70237u.setVisibility(8);
                        } else {
                            this.f70237u.setVisibility(0);
                            Context context = getContext();
                            int b = (int) C9432q.m18687b(context, 20.0f);
                            int b2 = (int) C9432q.m18687b(context, 16.0f);
                            int b3 = (int) C9432q.m18687b(context, 2.0f);
                            int size = (this.f70218b.iconList.size() - 1) * b2;
                            for (int size2 = this.f70218b.iconList.size() - 1; size2 >= 0; size2--) {
                                AvatarWithBorderView avatarWithBorderView = new AvatarWithBorderView(context);
                                avatarWithBorderView.setBorderColor(R.color.a4v);
                                avatarWithBorderView.setBorderWidthPx(b3);
                                C23515d.m57669a((RemoteImageView) avatarWithBorderView, (UrlModel) this.f70218b.iconList.get(size2));
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
                                layoutParams.setMargins(size, 0, 0, 0);
                                this.f70237u.addView(avatarWithBorderView, layoutParams);
                                size -= b2;
                            }
                        }
                    }
                    this.f70235s.setVisibility(8);
                    int childCount = this.f70235s.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= childCount) {
                            break;
                        }
                        View childAt = this.f70235s.getChildAt(i5);
                        if (childAt != null && childAt.getVisibility() == 0) {
                            this.f70235s.setVisibility(0);
                            break;
                        }
                        i5++;
                    }
                } else {
                    this.f70235s.setVisibility(8);
                }
            }
            if (this.f70235s != null) {
                if (this.f70235s.getVisibility() == 0) {
                    i3 = (int) C9432q.m18687b(getContext(), 12.0f);
                } else {
                    i3 = 0;
                }
                this.f70227k.setPadding(this.f70227k.getPaddingLeft(), i3, this.f70227k.getPaddingRight(), this.f70228l.getPaddingBottom());
            }
            if (this.f70232p != null) {
                if (mo54472d()) {
                    this.f70232p.setBackgroundResource(R.drawable.pq);
                    setupBottomDivideLine((int) C9432q.m18687b(getContext(), 16.0f));
                } else {
                    this.f70232p.setBackgroundColor(0);
                    setupBottomDivideLine(0);
                    View view = this.f70238v;
                    if (C10181b.m20511a().mo18168a(SearchMixVideoDisplayStyle.class, true, "search_mix_multi_mod", 31744, 0) == 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    if (this.f70238v != null && this.f70232p.getVisibility() == 8 && this.f70238v.getVisibility() == 0) {
                        setupBottomDivideLine((int) C9432q.m18687b(getContext(), this.f70216B));
                    }
                }
            }
            this.f70220d = false;
            mo54471c();
        }
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
