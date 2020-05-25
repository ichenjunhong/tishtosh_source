package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26137r;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a;
import com.p683ss.android.ugc.aweme.commercialize.profile.C26184e.C26185a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget */
public final class AdFakeUserProfileBottomBarWidget extends AbsAdProfileWidget {

    /* renamed from: j */
    static final /* synthetic */ C52767h[] f70589j = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileBottomBarWidget.class), "mAdBottomLayout", "getMAdBottomLayout()Landroid/view/ViewGroup;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileBottomBarWidget.class), "mAdBottomUserAvatar", "getMAdBottomUserAvatar()Lcom/ss/android/ugc/aweme/base/ui/SmartRoundImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileBottomBarWidget.class), "mAdBottomTitle", "getMAdBottomTitle()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileBottomBarWidget.class), "mAdBottomDesc", "getMAdBottomDesc()Landroid/widget/TextView;"))};

    /* renamed from: k */
    public static final C26786a f70590k = new C26786a(null);

    /* renamed from: l */
    private final C52668f f70591l = C52732g.m112285a(new C26789d(this));

    /* renamed from: m */
    private final C52668f f70592m = C52732g.m112285a(new C26791f(this));

    /* renamed from: n */
    private final C52668f f70593n = C52732g.m112285a(new C26790e(this));

    /* renamed from: o */
    private final C52668f f70594o = C52732g.m112285a(new C26788c(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$a */
    public static final class C26786a {
        private C26786a() {
        }

        public /* synthetic */ C26786a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$b */
    static final class C26787b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f70595a;

        /* renamed from: b */
        final /* synthetic */ C26818c f70596b;

        C26787b(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget, C26818c cVar) {
            this.f70595a = adFakeUserProfileBottomBarWidget;
            this.f70596b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f70595a.f62235b;
            Aweme aweme = this.f70595a.f70586a;
            String str = this.f70596b.f70651c;
            if (aweme != null && aweme.isAd()) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String openUrl = aweme.getAwemeRawAd().getOpenUrl();
                String type = awemeRawAd.getType();
                if (!TextUtils.isEmpty(type)) {
                    char c = 65535;
                    switch (type.hashCode()) {
                        case -1354573786:
                            if (type.equals("coupon")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 96801:
                            if (type.equals("app")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 117588:
                            if (type.equals("web")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3083120:
                            if (type.equals("dial")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3148996:
                            if (type.equals("form")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 957829685:
                            if (type.equals("counsel")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1893962841:
                            if (type.equals("redpacket")) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                            if (!C25938a.m62898b(openUrl)) {
                                C26503d.m64058a(str);
                                C26088l.m63370k(context, aweme, "button");
                                C26088l.m63383t(context, aweme);
                                break;
                            } else {
                                C26088l.m63296a(context, "homepage_ad", "click_message", aweme, C26088l.m63263a(context, aweme, "raw ad click", false));
                                break;
                            }
                        case 2:
                            C26088l.m63370k(context, aweme, "button");
                            C26088l.m63343d(context, "click_coupon", aweme, C26088l.m63373m(context, aweme, "raw homepage ad coupon click"));
                            break;
                        case 4:
                            C26088l.m63385v(context, aweme);
                            C26088l.m63370k(context, aweme, "button");
                            break;
                        case 5:
                            C26088l.m63386w(context, aweme);
                            C26088l.m63370k(context, aweme, "button");
                            break;
                        case 6:
                            C26088l.m63370k(context, aweme, "button");
                            C26088l.m63388y(context, aweme);
                            break;
                    }
                    C26540w.m64253a(context, aweme, null, 8, null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$c */
    static final class C26788c extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f70597a;

        C26788c(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            this.f70597a = adFakeUserProfileBottomBarWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f70597a.mo54695a((int) R.id.dwg);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$d */
    static final class C26789d extends C52712l implements C52670a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f70598a;

        C26789d(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            this.f70598a = adFakeUserProfileBottomBarWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ViewGroup) this.f70598a.mo54695a((int) R.id.dwh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$e */
    static final class C26790e extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f70599a;

        C26790e(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            this.f70599a = adFakeUserProfileBottomBarWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f70599a.mo54695a((int) R.id.dwi);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$f */
    static final class C26791f extends C52712l implements C52670a<SmartRoundImageView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f70600a;

        C26791f(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            this.f70600a = adFakeUserProfileBottomBarWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SmartRoundImageView) this.f70600a.mo54695a((int) R.id.dwj);
        }
    }

    /* renamed from: d */
    private final ViewGroup m64766d() {
        return (ViewGroup) this.f70591l.getValue();
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        super.mo48241a(view);
        m64765a(true);
    }

    /* renamed from: a */
    private final void m64765a(boolean z) {
        ViewGroup d = m64766d();
        if (d != null) {
            d.animate().translationY((float) C23728o.m58241a(100.0d)).setDuration(0).start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo54697c(boolean z) {
        super.mo54697c(z);
        if (z) {
            ViewGroup d = m64766d();
            if (d != null) {
                d.animate().translationY((float) C23728o.m58241a(-16.0d)).setDuration(300).start();
            }
        } else {
            m64765a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54696a(C26818c cVar) {
        User user;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        C52711k.m112240b(cVar, "params");
        super.mo54696a(cVar);
        TextView textView = (TextView) this.f70593n.getValue();
        String str = null;
        if (textView != null) {
            Aweme aweme = this.f70586a;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    charSequence2 = awemeRawAd.getButtonText();
                    textView.setText(charSequence2);
                }
            }
            charSequence2 = null;
            textView.setText(charSequence2);
        }
        TextView textView2 = (TextView) this.f70594o.getValue();
        if (textView2 != null) {
            Aweme aweme2 = this.f70586a;
            if (aweme2 != null) {
                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    C26137r fakeAuthor = awemeRawAd2.getFakeAuthor();
                    if (fakeAuthor != null) {
                        charSequence = fakeAuthor.getButtonText();
                        textView2.setText(charSequence);
                    }
                }
            }
            charSequence = null;
            textView2.setText(charSequence);
        }
        Aweme aweme3 = this.f70586a;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        } else {
            user = null;
        }
        C12156a a = C26185a.m63494a(user);
        if (a != null) {
            C12203q.m24643a(a).mo23116a((C12197k) (SmartRoundImageView) this.f70592m.getValue()).mo23121a();
        }
        Aweme aweme4 = this.f70586a;
        if (aweme4 != null) {
            AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str = awemeRawAd3.getLearnMoreBgColor();
            }
        }
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int parseColor = Color.parseColor(str);
                ViewGroup d = m64766d();
                if (d != null) {
                    d.setBackground(new C25592b((float) C23728o.m58241a(4.0d), parseColor));
                }
            }
        }
        ViewGroup d2 = m64766d();
        if (d2 != null) {
            d2.setOnClickListener(new C26787b(this, cVar));
        }
    }
}
