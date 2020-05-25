package com.p683ss.android.ugc.aweme.profile.widgets;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11790ac;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11936w;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.router.SmartRouter;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a;
import com.p683ss.android.ugc.aweme.familiar.DuoshanSyncSetting;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29637d;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29641g;
import com.p683ss.android.ugc.aweme.familiar.service.C29654f;
import com.p683ss.android.ugc.aweme.familiar.service.C29655g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.C39717ac;
import com.p683ss.android.ugc.aweme.profile.C39806c;
import com.p683ss.android.ugc.aweme.profile.C39830d;
import com.p683ss.android.ugc.aweme.profile.C39877j;
import com.p683ss.android.ugc.aweme.profile.model.HomePageBottomToast;
import com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg;
import com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39801e;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40332dm;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UsedPhoneConfirmActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.NoticeButtonView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.NoticeButtonView.C40404b;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.service.C40027t;
import com.p683ss.android.ugc.aweme.profile.survey.C40030b;
import com.p683ss.android.ugc.aweme.profile.survey.C40031c;
import com.p683ss.android.ugc.aweme.profile.survey.C40032d;
import com.p683ss.android.ugc.aweme.profile.survey.C40036g;
import com.p683ss.android.ugc.aweme.profile.util.C40527ac;
import com.p683ss.android.ugc.aweme.profile.util.C40531af;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.p683ss.android.ugc.vcd.C50506f;
import com.p683ss.android.ugc.vcd.C50512k;
import com.p683ss.android.ugc.vcd.C50515n;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget */
public final class MyProfileGuideWidget extends ProfileWidget {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f103606g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MyProfileGuideWidget.class), "noPublishWarnStub", "getNoPublishWarnStub()Landroid/view/ViewStub;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MyProfileGuideWidget.class), "gpWarningStub", "getGpWarningStub()Landroid/view/ViewStub;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MyProfileGuideWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MyProfileGuideViewModel;"))};

    /* renamed from: p */
    public static final boolean f103607p = false;

    /* renamed from: q */
    public static final C40664d f103608q = new C40664d(null);

    /* renamed from: A */
    private final WidgetLifecycleAwareLazy f103609A;

    /* renamed from: h */
    public final String f103610h = MyProfileGuideWidget.class.getSimpleName();

    /* renamed from: i */
    public View f103611i;

    /* renamed from: j */
    Object f103612j;

    /* renamed from: k */
    C40036g f103613k;

    /* renamed from: l */
    public ObjectAnimator f103614l;

    /* renamed from: m */
    public View f103615m;

    /* renamed from: n */
    public AnimatorSet f103616n;

    /* renamed from: o */
    public long f103617o;

    /* renamed from: t */
    private final C52668f f103618t = C52732g.m112286a(C52757k.NONE, new C40676n(this));

    /* renamed from: u */
    private C40332dm f103619u;

    /* renamed from: v */
    private Object f103620v;

    /* renamed from: w */
    private Object f103621w;

    /* renamed from: x */
    private final C52668f f103622x = C52732g.m112286a(C52757k.NONE, new C40668h(this));

    /* renamed from: y */
    private View f103623y;

    /* renamed from: z */
    private C10660a f103624z;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$a */
    public static final class C40634a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ Widget f103625a;

        /* renamed from: b */
        final /* synthetic */ C52760c f103626b;

        public C40634a(Widget widget, C52760c cVar) {
            this.f103625a = widget;
            this.f103626b = cVar;
            super(0);
        }

        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f103625a.getClass().getName());
            sb.append('_');
            sb.append(C52669a.m112219a(this.f103626b).getName());
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aa */
    public static final class C40635aa implements C28448a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103627a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103628b;

        /* renamed from: b */
        public final void mo51946b() {
            C40026s.f101964a.logShowProfileDiskManagerGuideView();
            this.f103628b.setVisibility(8);
        }

        /* renamed from: a */
        public final void mo51945a() {
            C40026s.f101964a.logShowProfileDiskManagerGuideView();
            C40026s.f101964a.startDiskManagerActivity(this.f103627a.mo83008w());
            this.f103628b.setVisibility(8);
        }

        C40635aa(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103627a = myProfileGuideWidget;
            this.f103628b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ab */
    public static final class C40636ab extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103629a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103630b;

        /* renamed from: c */
        final /* synthetic */ MyProfileGuideState f103631c;

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            this.f103630b.setVisibility(8);
            C40026s sVar = C40026s.f101964a;
            Activity w = this.f103629a.mo83008w();
            Integer currentDownloadSetting = this.f103631c.getCurrentDownloadSetting();
            if (currentDownloadSetting == null) {
                C52711k.m112234a();
            }
            sVar.startDownloadControlSettingActivity(w, currentDownloadSetting.intValue());
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setColor(this.f103629a.mo83008w().getResources().getColor(R.color.c));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        C40636ab(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
            this.f103629a = myProfileGuideWidget;
            this.f103630b = noticeView;
            this.f103631c = myProfileGuideState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ac */
    public static final class C40637ac implements C28448a {

        /* renamed from: a */
        final /* synthetic */ NoticeView f103632a;

        /* renamed from: a */
        public final void mo51945a() {
        }

        /* renamed from: b */
        public final void mo51946b() {
            this.f103632a.setVisibility(8);
        }

        C40637ac(NoticeView noticeView) {
            this.f103632a = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ad */
    static final class C40638ad<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        public static final C40638ad f103633a = new C40638ad();

        C40638ad() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ae */
    static final class C40639ae<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C40639ae f103634a = new C40639ae();

        C40639ae() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc != null) {
                C32458a.m75143a(exc);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$af */
    public static final class C40640af implements C28448a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103635a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103636b;

        /* renamed from: b */
        public final void mo51946b() {
            this.f103636b.setVisibility(8);
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf F = a.mo47895F();
            C52711k.m112236a((Object) F, "CommonSharePrefCache.inst().ftcReportShow");
            F.mo47776a(Long.valueOf(System.currentTimeMillis()));
            C23183v a2 = C23183v.m56778a();
            C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
            C23051bf G = a2.mo47896G();
            C52711k.m112236a((Object) G, "CommonSharePrefCache.inst().ftcReportFistShow");
            Long l = (Long) G.mo47782d();
            if (l != null && l.longValue() == 0) {
                C23183v a3 = C23183v.m56778a();
                C52711k.m112236a((Object) a3, "CommonSharePrefCache.inst()");
                C23051bf G2 = a3.mo47896G();
                C52711k.m112236a((Object) G2, "CommonSharePrefCache.inst().ftcReportFistShow");
                G2.mo47776a(Long.valueOf(System.currentTimeMillis()));
            }
            this.f103635a.mo82967a(false);
        }

        /* renamed from: a */
        public final void mo51945a() {
            this.f103636b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f103635a.mo83008w(), "//webview").withParam("url", "https://www.tiktok.com/aweme/inapp/v2/c_feedback").withParam("hide_nav_bar", true).open();
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf F = a.mo47895F();
            C52711k.m112236a((Object) F, "CommonSharePrefCache.inst().ftcReportShow");
            F.mo47776a(Long.valueOf(System.currentTimeMillis()));
            C23183v a2 = C23183v.m56778a();
            C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
            C23051bf G = a2.mo47896G();
            C52711k.m112236a((Object) G, "CommonSharePrefCache.inst().ftcReportFistShow");
            Long l = (Long) G.mo47782d();
            if (l != null && l.longValue() == 0) {
                C23183v a3 = C23183v.m56778a();
                C52711k.m112236a((Object) a3, "CommonSharePrefCache.inst()");
                C23051bf G2 = a3.mo47896G();
                C52711k.m112236a((Object) G2, "CommonSharePrefCache.inst().ftcReportFistShow");
                G2.mo47776a(Long.valueOf(System.currentTimeMillis()));
            }
            this.f103635a.mo82967a(false);
        }

        C40640af(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103635a = myProfileGuideWidget;
            this.f103636b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ag */
    static final class C40641ag implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103637a;

        /* renamed from: b */
        final /* synthetic */ View f103638b;

        C40641ag(MyProfileGuideWidget myProfileGuideWidget, View view) {
            this.f103637a = myProfileGuideWidget;
            this.f103638b = view;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                View view2 = this.f103638b;
                C52711k.m112236a((Object) view2, "gpWarningView");
                view2.setVisibility(8);
                C40026s.f101964a.onPunishWarningClick(this.f103637a.mo83008w());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ah */
    static final class C40642ah implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103639a;

        /* renamed from: b */
        final /* synthetic */ View f103640b;

        C40642ah(MyProfileGuideWidget myProfileGuideWidget, View view) {
            this.f103639a = myProfileGuideWidget;
            this.f103640b = view;
        }

        public final void run() {
            MyProfileGuideWidget myProfileGuideWidget = this.f103639a;
            C22453b a = C22453b.m55505a();
            C52711k.m112236a((Object) a, "AdaptationManager.getInstance()");
            myProfileGuideWidget.f103614l = ObjectAnimator.ofFloat(this.f103640b, "translationY", new float[]{0.0f, -((float) a.mo46745b())});
            ObjectAnimator objectAnimator = this.f103639a.f103614l;
            if (objectAnimator != null) {
                ObjectAnimator duration = objectAnimator.setDuration(200);
                if (duration != null) {
                    duration.start();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ai */
    static final class C40643ai extends C52712l implements C52687r<C11866f, Integer, Boolean, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103641a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103642b;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ai$a */
        static final /* synthetic */ class C40644a extends C52710j implements C52671b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C40644a f103643a = new C40644a();

            C40644a() {
                super(1);
            }

            public final String getName() {
                return "identity";
            }

            public final C52761d getOwner() {
                return C52728w.m112246a(C39830d.class, "profile_tiktokI18nRelease");
            }

            public final String getSignature() {
                return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ProfileState profileState = (ProfileState) obj;
                C52711k.m112240b(profileState, "p1");
                return (ProfileState) C39830d.m88579a(profileState);
            }
        }

        C40643ai(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103641a = myProfileGuideWidget;
            this.f103642b = noticeView;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            C11866f fVar = (C11866f) obj;
            int intValue = ((Number) obj2).intValue();
            Boolean bool = (Boolean) obj3;
            Boolean bool2 = (Boolean) obj4;
            C52711k.m112240b(fVar, "$receiver");
            ProfileState profileState = (ProfileState) fVar.mo22552a(this.f103641a.mo83009x(), C40644a.f103643a);
            if (intValue != 0 || !MyProfileGuideWidget.m90053b(profileState)) {
                this.f103641a.mo82962a(8, false);
                NoticeView noticeView = this.f103642b;
                if (noticeView != null) {
                    noticeView.setVisibility(4);
                }
            } else {
                this.f103641a.mo82962a(0, false);
                this.f103641a.mo82985t();
                NoticeView noticeView2 = this.f103642b;
                if (noticeView2 != null) {
                    noticeView2.setVisibility(4);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aj */
    public static final class C40645aj implements C40404b {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103644a;

        /* renamed from: b */
        final /* synthetic */ NoticeButtonView f103645b;

        /* renamed from: b */
        public final void mo82658b() {
            this.f103645b.setVisibility(8);
            C39806c.m88518a().mo80880b(true);
            C26890h.m65011a("banner_click", C23089d.m56640a().mo47829a("banner_type", "coupon_fission").mo47829a("banner_name", "tiktok_rewards").mo47829a("enter_from", "personal_homepage").mo47829a("click_position", "cross").f61491a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0062  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo82657a() {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView r0 = r6.f103645b
                r1 = 8
                r0.setVisibility(r1)
                com.ss.android.ugc.aweme.profile.c r0 = com.p683ss.android.ugc.aweme.profile.C39806c.m88518a()
                r1 = 1
                r0.mo80880b(r1)
                java.lang.String r0 = "banner_click"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "banner_type"
                java.lang.String r4 = "coupon_fission"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "banner_name"
                java.lang.String r4 = "tiktok_rewards"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "enter_from"
                java.lang.String r4 = "personal_homepage"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "click_position"
                java.lang.String r4 = "join"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r0 = r6.f103644a
                android.app.Activity r0 = r0.mo83008w()
                android.content.Context r0 = (android.content.Context) r0
                java.lang.String r2 = "//webview"
                com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r2)
                java.lang.String r2 = "url"
                r3 = 0
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x005f }
                java.lang.String r5 = "SettingsReader.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ a -> 0x005f }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r4 = r4.getAwemeActivitySetting()     // Catch:{ a -> 0x005f }
                if (r4 == 0) goto L_0x005f
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r4 = r4.getProfileActivityButton()     // Catch:{ a -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r4 = r3
            L_0x0060:
                if (r4 == 0) goto L_0x0066
                java.lang.String r3 = r4.getH5Link()
            L_0x0066:
                com.bytedance.router.SmartRoute r0 = r0.withParam(r2, r3)
                java.lang.String r2 = "hide_nav_bar"
                com.bytedance.router.SmartRoute r0 = r0.withParam(r2, r1)
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                com.bytedance.router.SmartRoute r0 = r0.addFlags(r1)
                r0.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40645aj.mo82657a():void");
        }

        C40645aj(MyProfileGuideWidget myProfileGuideWidget, NoticeButtonView noticeButtonView) {
            this.f103644a = myProfileGuideWidget;
            this.f103645b = noticeButtonView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ak */
    static final class C40646ak implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103646a;

        /* renamed from: b */
        final /* synthetic */ View f103647b;

        C40646ak(MyProfileGuideWidget myProfileGuideWidget, View view) {
            this.f103646a = myProfileGuideWidget;
            this.f103647b = view;
        }

        public final void run() {
            this.f103646a.f103616n = new AnimatorSet();
            View view = this.f103646a.f103615m;
            if (view == null) {
                C52711k.m112234a();
            }
            C22453b a = C22453b.m55505a();
            C52711k.m112236a((Object) a, "AdaptationManager.getInstance()");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) a.mo46745b(), 0.0f});
            View view2 = this.f103646a.f103615m;
            if (view2 == null) {
                C52711k.m112234a();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = this.f103646a.f103616n;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
            }
            AnimatorSet animatorSet2 = this.f103646a.f103616n;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(200);
            }
            AnimatorSet animatorSet3 = this.f103646a.f103616n;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            this.f103647b.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$al */
    static final class C40647al extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C40647al f103648a = new C40647al();

        C40647al() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, null, null, null, false, null, true, false, 6143, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$am */
    public static final class C40648am implements C28448a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103649a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103650b;

        /* renamed from: b */
        public final void mo51946b() {
            this.f103650b.setVisibility(8);
            this.f103649a.mo82967a(false);
        }

        /* renamed from: a */
        public final void mo51945a() {
            this.f103650b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f103649a.mo83008w(), "aweme://privacy/setting").open();
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
            C52711k.m112236a((Object) shouldShowPrivateAccountTipInProfile, "SharePrefCache.inst().sh…rivateAccountTipInProfile");
            shouldShowPrivateAccountTipInProfile.mo47776a(Boolean.valueOf(false));
            C26890h.m65011a("privacy_floating_bar_click", C23089d.m56640a().f61491a);
            this.f103649a.mo82967a(false);
        }

        C40648am(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103649a = myProfileGuideWidget;
            this.f103650b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$an */
    static final class C40649an implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103651a;

        C40649an(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103651a = myProfileGuideWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C41302w.m91042a().mo83858a(this.f103651a.mo83008w(), "aweme://profile_edit");
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            inst.getIsProfileBubbleShown().mo47776a(Boolean.valueOf(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ao */
    static final /* synthetic */ class C40650ao extends C52710j implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        public static final C40650ao f103652a = new C40650ao();

        C40650ao() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C52761d getOwner() {
            return C52728w.m112246a(C39830d.class, "profile_tiktokI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            C52711k.m112240b(profileState, "p1");
            return (ProfileState) C39830d.m88579a(profileState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ap */
    static final class C40651ap implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103653a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103654b;

        /* renamed from: c */
        final /* synthetic */ SafeInfoNoticeMsg f103655c;

        C40651ap(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView, SafeInfoNoticeMsg safeInfoNoticeMsg) {
            this.f103653a = myProfileGuideWidget;
            this.f103654b = noticeView;
            this.f103655c = safeInfoNoticeMsg;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f103654b.setVisibility(8);
            if (TextUtils.equals(this.f103655c.noticeType, "mno_mobile")) {
                this.f103653a.mo83008w().startActivity(new Intent(this.f103653a.mo83008w(), UsedPhoneConfirmActivity.class));
            } else {
                C40531af.m89936a(this.f103653a.mo83008w(), this.f103654b, this.f103655c);
            }
            C26890h.m65011a("enter_secondhand_confirm_page", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("enter_method", "bubble").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aq */
    public static final class C40652aq implements C28448a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103656a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103657b;

        /* renamed from: c */
        final /* synthetic */ SafeInfoNoticeMsg f103658c;

        /* renamed from: a */
        public final void mo51945a() {
            this.f103657b.setVisibility(8);
            if (TextUtils.equals(this.f103658c.noticeType, "mno_mobile")) {
                this.f103656a.mo83008w().startActivity(new Intent(this.f103656a.mo83008w(), UsedPhoneConfirmActivity.class));
            } else {
                C40531af.m89936a(this.f103656a.mo83008w(), this.f103657b, this.f103658c);
            }
            C26890h.m65011a("enter_secondhand_confirm_page", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("enter_method", "bubble").f61491a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (r3 == null) goto L_0x0065;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51946b() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.discover.ui.NoticeView r0 = r5.f103657b
                r1 = 8
                r0.setVisibility(r1)
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r0 = r5.f103658c
                java.lang.String r0 = r0.noticeModel
                if (r0 == 0) goto L_0x0023
                java.lang.String r1 = "default"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0023
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r0 = r5.f103656a
                android.app.Activity r0 = r0.mo83008w()
                com.ss.android.ugc.aweme.discover.ui.NoticeView r1 = r5.f103657b
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r2 = r5.f103658c
                com.p683ss.android.ugc.aweme.profile.util.C40531af.m89936a(r0, r1, r2)
                return
            L_0x0023:
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r0 = r5.f103658c
                java.lang.Long r0 = r0.noticeId
                if (r0 == 0) goto L_0x002e
                long r0 = r0.longValue()
                goto L_0x0030
            L_0x002e:
                r0 = 0
            L_0x0030:
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r2 = r5.f103658c
                java.lang.String r2 = r2.noticeType
                if (r2 != 0) goto L_0x0038
                java.lang.String r2 = ""
            L_0x0038:
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r3 = r5.f103658c
                java.lang.String r3 = r3.noticeTag
                if (r3 != 0) goto L_0x0040
                java.lang.String r3 = ""
            L_0x0040:
                java.lang.String r4 = "cancel"
                com.p683ss.android.ugc.aweme.profile.util.C40531af.m89935a(r0, r2, r3, r4)
                java.lang.String r0 = "security_alert_click"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "click_button"
                java.lang.String r3 = "exit"
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "notice_id"
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r3 = r5.f103658c
                java.lang.Long r3 = r3.noticeId
                if (r3 == 0) goto L_0x0065
                long r3 = r3.longValue()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                if (r3 != 0) goto L_0x0067
            L_0x0065:
                java.lang.String r3 = ""
            L_0x0067:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "notice_type"
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r3 = r5.f103658c
                java.lang.String r3 = r3.noticeType
                if (r3 != 0) goto L_0x0075
                java.lang.String r3 = ""
            L_0x0075:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "notice_model"
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r3 = r5.f103658c
                java.lang.String r3 = r3.noticeModel
                if (r3 != 0) goto L_0x0083
                java.lang.String r3 = ""
            L_0x0083:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "notice_tag"
                com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r3 = r5.f103658c
                java.lang.String r3 = r3.noticeTag
                if (r3 != 0) goto L_0x0091
                java.lang.String r3 = ""
            L_0x0091:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40652aq.mo51946b():void");
        }

        C40652aq(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView, SafeInfoNoticeMsg safeInfoNoticeMsg) {
            this.f103656a = myProfileGuideWidget;
            this.f103657b = noticeView;
            this.f103658c = safeInfoNoticeMsg;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ar */
    static final /* synthetic */ class C40653ar extends C52710j implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C40653ar f103659a = new C40653ar();

        C40653ar() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C52761d getOwner() {
            return C52728w.m112246a(C39830d.class, "profile_tiktokI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "p1");
            return (MyProfileGuideState) C39830d.m88579a(myProfileGuideState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$as */
    public static final class C40654as extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103660a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103661b;

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            this.f103660a.mo82969b(this.f103661b);
        }

        C40654as(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103660a = myProfileGuideWidget;
            this.f103661b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$at */
    public static final class C40655at extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103662a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103663b;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$at$a */
        public static final class C40656a implements C29654f {

            /* renamed from: a */
            final /* synthetic */ C40655at f103664a;

            C40656a(C40655at atVar) {
                this.f103664a = atVar;
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            MyProfileGuideWidget.m90050a("click", -1);
            if (DuoshanSyncSetting.INSTANCE.isRegisterDuoshan()) {
                C29655g.f77512b.syncToDuoshan(new C40656a(this));
                return;
            }
            Activity w = this.f103662a.mo83008w();
            if (w instanceof FragmentActivity) {
                this.f103663b.setVisibility(8);
                C29655g.f77512b.tryShowHomePageSyncToDuoshanDialog(((FragmentActivity) w).getSupportFragmentManager(), 1);
            }
        }

        C40655at(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103662a = myProfileGuideWidget;
            this.f103663b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$au */
    public static final class C40657au implements C28448a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103665a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103666b;

        /* renamed from: a */
        public final void mo51945a() {
        }

        /* renamed from: b */
        public final void mo51946b() {
            this.f103666b.setVisibility(8);
            MyProfileGuideWidget.m90050a("close", System.currentTimeMillis() - this.f103665a.f103617o);
            C29655g.f77512b.setUserCloseHomePageGuide();
        }

        C40657au(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103665a = myProfileGuideWidget;
            this.f103666b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$av */
    public static final class C40658av implements C29637d {
        C40658av() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aw */
    public static final class C40659aw implements C28448a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103667a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103668b;

        /* renamed from: c */
        final /* synthetic */ C52725c f103669c;

        /* renamed from: d */
        final /* synthetic */ C52723a f103670d;

        /* renamed from: e */
        final /* synthetic */ C50515n f103671e;

        /* renamed from: f */
        final /* synthetic */ MyProfileGuideState f103672f;

        /* renamed from: g */
        final /* synthetic */ C52725c f103673g;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aw$a */
        static final class C40660a extends C52712l implements C52671b<C50512k, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C40659aw f103674a;

            C40660a(C40659aw awVar) {
                this.f103674a = awVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C50512k kVar = (C50512k) obj;
                C52711k.m112240b(kVar, "it");
                if (kVar.f126623a || kVar.f126624b) {
                    this.f103674a.f103668b.setVisibility(8);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: b */
        public final void mo51946b() {
            this.f103668b.setVisibility(8);
            C50506f.m108851a();
        }

        /* renamed from: a */
        public final void mo51945a() {
            new C40660a(this);
            if (this.f103670d.element) {
                C50506f.m108851a();
                this.f103667a.mo83008w();
                this.f103672f.getVcdGuideData();
                C26883g.m64995a("vcd_account_auth_bar_confirm", null);
            } else {
                C50506f.m108851a();
                this.f103667a.mo83008w();
            }
            C50506f.m108851a();
        }

        C40659aw(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView, C52725c cVar, C52723a aVar, C50515n nVar, MyProfileGuideState myProfileGuideState, C52725c cVar2) {
            this.f103667a = myProfileGuideWidget;
            this.f103668b = noticeView;
            this.f103669c = cVar;
            this.f103670d = aVar;
            this.f103671e = nVar;
            this.f103672f = myProfileGuideState;
            this.f103673g = cVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ax */
    public static final class C40661ax implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103675a;

        public final void onAnimationRepeat(Animation animation) {
            C52711k.m112240b(animation, "animation");
        }

        public final void onAnimationStart(Animation animation) {
            C52711k.m112240b(animation, "animation");
        }

        C40661ax(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103675a = myProfileGuideWidget;
        }

        public final void onAnimationEnd(Animation animation) {
            C52711k.m112240b(animation, "animation");
            View view = this.f103675a.f103611i;
            if (view != null) {
                view.setLayerType(0, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$b */
    public static final class C40662b extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {
        public static final C40662b INSTANCE = new C40662b();

        public C40662b() {
            super(1);
        }

        public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return myProfileGuideState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$c */
    public static final class C40663c extends C52712l implements C52670a<MyProfileGuideViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f103676a;

        /* renamed from: b */
        final /* synthetic */ C52670a f103677b;

        /* renamed from: c */
        final /* synthetic */ C52760c f103678c;

        /* renamed from: d */
        final /* synthetic */ C52671b f103679d;

        public C40663c(Widget widget, C52670a aVar, C52760c cVar, C52671b bVar) {
            this.f103676a = widget;
            this.f103677b = aVar;
            this.f103678c = cVar;
            this.f103679d = bVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel, java.lang.Object]
          mth insns count: 36
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.widget.Widget r0 = r3.f103676a
                java.lang.Object r0 = r0.mo25062n()
                boolean r1 = r0 instanceof android.support.p030v4.app.Fragment
                if (r1 == 0) goto L_0x0019
                android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                com.bytedance.widget.Widget r1 = r3.f103676a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                goto L_0x002b
            L_0x0019:
                boolean r1 = r0 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0057
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                com.bytedance.widget.Widget r1 = r3.f103676a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
            L_0x002b:
                d.f.a.a r1 = r3.f103677b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f103678c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel> r2 = com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0051
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0051:
                d.f.a.b r1 = r3.f103679d
                r0.mo22526a(r1)
                return r0
            L_0x0057:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40663c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$d */
    public static final class C40664d {
        private C40664d() {
        }

        public /* synthetic */ C40664d(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$e */
    static final class C40665e<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C40665e f103680a = new C40665e();

        C40665e() {
        }

        public final /* synthetic */ Object call() {
            Keva repo = Keva.getRepo("keva_repo_profile_component");
            int i = repo.getInt("show_yt_removed_toast", -1);
            if (i == 1) {
                repo.storeInt("show_yt_removed_toast", 0);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$f */
    static final class C40666f<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103681a;

        C40666f(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103681a = myProfileGuideWidget;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (C47957v.m103770a(iVar)) {
                C52711k.m112236a((Object) iVar, "it");
                Integer num = (Integer) iVar.mo34e();
                if (num != null && num.intValue() == 1) {
                    C10691a.m21548c((Context) this.f103681a.mo83008w(), (int) R.string.h5y).mo19066a();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$g */
    static final class C40667g extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C40667g f103682a = new C40667g();

        C40667g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, true, null, null, null, null, null, false, null, false, false, 8167, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$h */
    static final class C40668h extends C52712l implements C52670a<ViewStub> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103683a;

        C40668h(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103683a = myProfileGuideWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f103683a.f34862e;
            if (view == null) {
                C52711k.m112234a();
            }
            return (ViewStub) view.findViewById(R.id.eml);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$i */
    public static final class C40669i implements C1674ab<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103684a;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$i$a */
        static final class C40670a extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C40670a f103685a = new C40670a();

            C40670a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                C52711k.m112240b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, Boolean.valueOf(false), null, null, null, false, null, false, false, 8159, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$i$b */
        static final class C40671b extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            final /* synthetic */ boolean f103686a;

            C40671b(boolean z) {
                this.f103686a = z;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                C52711k.m112240b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, Boolean.valueOf(this.f103686a), null, null, null, false, null, false, false, 8159, null);
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C40669i(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103684a = myProfileGuideWidget;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f103684a.mo82983r().mo82895g(C40670a.f103685a);
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.f103684a.mo82983r().mo82895g(new C40671b(((Boolean) obj).booleanValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$j */
    public static final class C40672j implements C40031c {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103687a;

        /* renamed from: b */
        final /* synthetic */ C40036g f103688b;

        /* renamed from: a */
        public final void mo82060a() {
            this.f103688b.mo82068d();
        }

        /* renamed from: a */
        public final void mo82061a(C24047a aVar) {
            String str;
            C52711k.m112240b(aVar, "surveyData");
            String str2 = "pop_survey_show";
            C23089d a = C23089d.m56640a().mo47829a("pop_survey_id", String.valueOf(aVar.f63822a));
            String str3 = "pop_survey_question";
            if (!TextUtils.isEmpty(aVar.f63829h)) {
                str = aVar.f63829h;
            } else {
                str = aVar.f63824c;
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("original_id", aVar.f63830i).f61491a);
        }

        C40672j(MyProfileGuideWidget myProfileGuideWidget, C40036g gVar) {
            this.f103687a = myProfileGuideWidget;
            this.f103688b = gVar;
        }

        /* renamed from: a */
        public final void mo82062a(C24047a aVar, int i, String str) {
            C52711k.m112240b(aVar, "surveyData");
            C52711k.m112240b(str, "answerText");
            switch (i) {
                case 1:
                    this.f103688b.mo82069e();
                    break;
                case 2:
                    this.f103688b.mo82069e();
                    break;
                case 3:
                    this.f103688b.mo82068d();
                    break;
            }
            C40032d.m89003a();
            C40032d.m89004a(new C40030b(i, aVar.f63822a, aVar.f63830i));
            C47957v.m103769a(new C40675m(i, aVar, str), this.f103687a.f103610h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$k */
    static final class C40673k extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        final /* synthetic */ SafeInfoNoticeMsgResponse f103689a;

        C40673k(SafeInfoNoticeMsgResponse safeInfoNoticeMsgResponse) {
            this.f103689a = safeInfoNoticeMsgResponse;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Boolean valueOf;
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            SafeInfoNoticeMsg safeInfoNoticeMsg = this.f103689a.data;
            if (safeInfoNoticeMsg != null) {
                valueOf = Boolean.valueOf(safeInfoNoticeMsg.has_notice);
            } else {
                valueOf = Boolean.valueOf(false);
            }
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, valueOf, this.f103689a.data, null, false, null, false, false, 7999, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$l */
    static final class C40674l extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C40674l f103690a = new C40674l();

        C40674l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, Boolean.valueOf(false), null, null, false, null, false, false, 8127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$m */
    static final class C40675m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f103691a;

        /* renamed from: b */
        final /* synthetic */ C24047a f103692b;

        /* renamed from: c */
        final /* synthetic */ String f103693c;

        C40675m(int i, C24047a aVar, String str) {
            this.f103691a = i;
            this.f103692b = aVar;
            this.f103693c = str;
        }

        public final void run() {
            String str;
            String str2;
            if (this.f103691a == 3) {
                String str3 = "pop_survey_close";
                C23089d a = C23089d.m56640a().mo47829a("pop_survey_id", String.valueOf(this.f103692b.f63822a));
                String str4 = "pop_survey_question";
                if (!TextUtils.isEmpty(this.f103692b.f63829h)) {
                    str2 = this.f103692b.f63829h;
                } else {
                    str2 = this.f103692b.f63824c;
                }
                C26890h.m65011a(str3, a.mo47829a(str4, str2).mo47826a("original_id", this.f103692b.f63830i).f61491a);
                return;
            }
            if (this.f103691a == 1 || this.f103691a == 2) {
                String str5 = "pop_survey_answer";
                C23089d a2 = C23089d.m56640a().mo47829a("pop_survey_id", String.valueOf(this.f103692b.f63822a));
                String str6 = "pop_survey_question";
                if (!TextUtils.isEmpty(this.f103692b.f63829h)) {
                    str = this.f103692b.f63829h;
                } else {
                    str = this.f103692b.f63824c;
                }
                C26890h.m65011a(str5, a2.mo47829a(str6, str).mo47826a("original_id", this.f103692b.f63830i).mo47829a("pop_survey_answer", this.f103693c).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$n */
    static final class C40676n extends C52712l implements C52670a<ViewStub> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103694a;

        C40676n(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103694a = myProfileGuideWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f103694a.f34862e;
            if (view == null) {
                C52711k.m112234a();
            }
            return (ViewStub) view.findViewById(R.id.br3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$o */
    static final class C40677o extends C52712l implements C52688s<C11866f, Boolean, C11787a<? extends C52847n<? extends UrlModel, ? extends C12200n>>, String, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103695a;

        C40677o(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103695a = myProfileGuideWidget;
            super(5);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo58987a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            C11866f fVar = (C11866f) obj;
            final Boolean bool = (Boolean) obj2;
            final C11787a aVar = (C11787a) obj3;
            String str = (String) obj4;
            final Integer num = (Integer) obj5;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(aVar, "loadAvatar");
            if (!((MyProfileGuideState) fVar.mo22552a(this.f103695a.mo82983r(), C406781.f103696a)).getHasGuideShowed() && !(!C52711k.m112239a((Object) str, (Object) "from_main"))) {
                this.f103695a.mo82983r().mo82895g(new C52671b<MyProfileGuideState, MyProfileGuideState>() {
                    public final /* synthetic */ Object invoke(Object obj) {
                        boolean z;
                        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                        C52711k.m112240b(myProfileGuideState, "$receiver");
                        if (bool != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return MyProfileGuideState.copy$default(myProfileGuideState, false, z, false, false, null, null, null, null, null, false, null, false, false, 8189, null);
                    }
                });
                this.f103695a.mo82983r().mo82895g(new C52671b<MyProfileGuideState, MyProfileGuideState>() {
                    public final /* synthetic */ Object invoke(Object obj) {
                        boolean z;
                        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                        C52711k.m112240b(myProfileGuideState, "$receiver");
                        if (!(aVar instanceof C11790ac)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return MyProfileGuideState.copy$default(myProfileGuideState, false, false, z, false, null, null, null, null, null, false, null, false, false, 8187, null);
                    }
                });
                this.f103695a.mo82983r().mo82895g(new C52671b<MyProfileGuideState, MyProfileGuideState>() {
                    public final /* synthetic */ Object invoke(Object obj) {
                        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                        C52711k.m112240b(myProfileGuideState, "$receiver");
                        return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, null, null, num, false, null, false, false, 7935, null);
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$p */
    static final class C40682p extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103700a;

        C40682p(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103700a = myProfileGuideWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                this.f103700a.mo82986u();
            } else {
                this.f103700a.mo82984s();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q */
    static final class C40683q extends C52712l implements C52682m<C11866f, MyProfileGuideState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103701a;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$a */
        static final class C40706a extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C40706a f103727a = new C40706a();

            C40706a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                C52711k.m112240b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, true, false, false, false, null, null, null, null, null, false, null, false, false, 8190, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$b */
        static final /* synthetic */ class C40707b extends C52710j implements C52671b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C40707b f103728a = new C40707b();

            C40707b() {
                super(1);
            }

            public final String getName() {
                return "identity";
            }

            public final C52761d getOwner() {
                return C52728w.m112246a(C39830d.class, "profile_tiktokI18nRelease");
            }

            public final String getSignature() {
                return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ProfileState profileState = (ProfileState) obj;
                C52711k.m112240b(profileState, "p1");
                return (ProfileState) C39830d.m88579a(profileState);
            }
        }

        C40683q(MyProfileGuideWidget myProfileGuideWidget) {
            this.f103701a = myProfileGuideWidget;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b3, code lost:
            if ((r7 - r5.longValue()) <= java.util.concurrent.TimeUnit.DAYS.toMillis(30)) goto L_0x00b5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x03fe  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0448  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0479  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x047b  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x048c  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x04f3  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0229  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0252  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0284  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0287  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x02a6  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x02e6 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0313  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0330  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x03c2  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x03f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                r12 = this;
                com.bytedance.jedi.arch.f r13 = (com.bytedance.jedi.arch.C11866f) r13
                com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState r14 = (com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState) r14
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                java.lang.String r0 = "myProfileGuideState"
                p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r0 = r12.f103701a
                com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r0 = r0.mo82983r()
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$1 r1 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40683q.C406841.f103702a
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                java.lang.Object r0 = r13.mo22552a(r0, r1)
                com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState r0 = (com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState) r0
                boolean r0 = r0.getHasGuideShowed()
                if (r0 != 0) goto L_0x0503
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r0 = r12.f103701a
                com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel r0 = r0.mo83009x()
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$b r1 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40683q.C40707b.f103728a
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                java.lang.Object r13 = r13.mo22552a(r0, r1)
                com.ss.android.ugc.aweme.profile.viewmodel.ProfileState r13 = (com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState) r13
                r0 = 21
                com.bytedance.jedi.arch.aa[] r0 = new com.bytedance.jedi.arch.C11788aa[r0]
                com.bytedance.jedi.arch.aa r1 = new com.bytedance.jedi.arch.aa
                r2 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.String r5 = r13.getFrom()
                java.lang.String r6 = "from_main"
                boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
                r5 = r5 ^ r2
                r6 = 0
                if (r5 == 0) goto L_0x0058
            L_0x0055:
                r5 = 0
                goto L_0x00e8
            L_0x0058:
                boolean r5 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
                if (r5 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r7 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
                java.lang.String r7 = "AccountProxyService.userService().curUser"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                int r5 = r5.getUserPeriod()
                if (r5 != r2) goto L_0x0055
                com.ss.android.ugc.aweme.app.v r5 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
                java.lang.String r7 = "CommonSharePrefCache.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                com.ss.android.ugc.aweme.app.bf r5 = r5.mo47896G()
                java.lang.String r7 = "CommonSharePrefCache.inst().ftcReportFistShow"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.Object r5 = r5.mo47782d()
                java.lang.Long r5 = (java.lang.Long) r5
                if (r5 != 0) goto L_0x0091
                goto L_0x009b
            L_0x0091:
                long r7 = r5.longValue()
                r9 = 0
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 == 0) goto L_0x00b5
            L_0x009b:
                long r7 = java.lang.System.currentTimeMillis()
                java.lang.String r9 = "firstShowTime"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
                long r9 = r5.longValue()
                long r7 = r7 - r9
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS
                r9 = 30
                long r9 = r5.toMillis(r9)
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 > 0) goto L_0x0055
            L_0x00b5:
                com.ss.android.ugc.aweme.app.v r5 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
                java.lang.String r7 = "CommonSharePrefCache.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                com.ss.android.ugc.aweme.app.bf r5 = r5.mo47895F()
                java.lang.String r7 = "CommonSharePrefCache.inst().ftcReportShow"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.Object r5 = r5.mo47782d()
                java.lang.Long r5 = (java.lang.Long) r5
                long r7 = java.lang.System.currentTimeMillis()
                java.lang.String r9 = "lastShowTime"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
                long r9 = r5.longValue()
                long r7 = r7 - r9
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS
                r9 = 1
                long r9 = r5.toMillis(r9)
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 <= 0) goto L_0x0055
                r5 = 1
            L_0x00e8:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$12 r7 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$12
                r7.<init>(r12)
                r1.<init>(r3, r4, r5, r7)
                r0[r6] = r1
                com.bytedance.jedi.arch.aa r1 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.String r5 = r13.getFrom()
                java.lang.String r7 = "from_main"
                boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r7)
                if (r5 == 0) goto L_0x0158
                com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r7 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                boolean r5 = r5.isLogin()
                if (r5 == 0) goto L_0x0158
                com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r7 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
                java.lang.String r7 = "AccountProxyService.userService().curUser"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                boolean r5 = r5.isSecret()
                if (r5 == 0) goto L_0x0158
                com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
                java.lang.String r7 = "SharePrefCache.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                com.ss.android.ugc.aweme.app.bf r5 = r5.getShouldShowPrivateAccountTipInProfile()
                java.lang.String r7 = "SharePrefCache.inst().sh…rivateAccountTipInProfile"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.Object r5 = r5.mo47782d()
                java.lang.String r7 = "SharePrefCache.inst().sh…AccountTipInProfile.cache"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0158
                r5 = 1
                goto L_0x0159
            L_0x0158:
                r5 = 0
            L_0x0159:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$16 r7 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$16
                r7.<init>(r12)
                r1.<init>(r3, r4, r5, r7)
                r0[r2] = r1
                r1 = 2
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                com.ss.android.ugc.aweme.profile.service.c r7 = com.p683ss.android.ugc.aweme.profile.service.C40010c.f101950a
                boolean r7 = r7.mo82034f()
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$17 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$17
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 3
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                boolean r7 = com.p683ss.android.ugc.aweme.profile.C40730x.f103763a
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$18 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$18
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 4
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                boolean r7 = r14.getNeedCheckI18nRecommendUserDialog()
                if (r7 == 0) goto L_0x01c8
                java.lang.String r7 = r13.getFrom()
                java.lang.String r8 = "from_main"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                if (r7 == 0) goto L_0x01c8
                com.ss.android.ugc.aweme.profile.service.c r7 = com.p683ss.android.ugc.aweme.profile.service.C40010c.f101950a
                boolean r7 = r7.mo82036h()
                if (r7 == 0) goto L_0x01c8
                r7 = 1
                goto L_0x01c9
            L_0x01c8:
                r7 = 0
            L_0x01c9:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$19 r8 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40683q.C4069419.f103712a
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 5
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                boolean r7 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90051a(r13)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$20 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$20
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 6
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                boolean r5 = r14.getPostListHasLoaded()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                boolean r7 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90055e(r13)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$21 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$21
                r8.<init>(r12, r14)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 7
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                java.lang.String r7 = r13.getFrom()
                java.lang.String r8 = "from_main"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                if (r7 == 0) goto L_0x0233
                com.ss.android.ugc.aweme.profile.service.s r7 = com.p683ss.android.ugc.aweme.profile.service.C40026s.f101964a
                boolean r7 = r7.shouldShowGradientPunishWarningBubble()
                if (r7 == 0) goto L_0x0233
                r7 = 1
                goto L_0x0234
            L_0x0233:
                r7 = 0
            L_0x0234:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$22 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$22
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 8
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = r14.getHasSafeInfoNoticeMsg()
                if (r5 == 0) goto L_0x0252
                r5 = 1
                goto L_0x0253
            L_0x0252:
                r5 = 0
            L_0x0253:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.Boolean r7 = r14.getHasSafeInfoNoticeMsg()
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$2 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$2
                r8.<init>(r12, r14)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 9
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                com.ss.android.ugc.vcd.j r7 = r14.getVcdGuideData()
                r8 = 0
                if (r7 == 0) goto L_0x0287
                com.ss.android.ugc.vcd.n r7 = r7.f126616e
                goto L_0x0288
            L_0x0287:
                r7 = r8
            L_0x0288:
                boolean r7 = com.p683ss.android.ugc.vcd.C50515n.C50516a.m108858a(r7)
                if (r7 != 0) goto L_0x02a1
                com.ss.android.ugc.vcd.j r7 = r14.getVcdGuideData()
                if (r7 == 0) goto L_0x0297
                com.ss.android.ugc.vcd.n r7 = r7.f126617f
                goto L_0x0298
            L_0x0297:
                r7 = r8
            L_0x0298:
                boolean r7 = com.p683ss.android.ugc.vcd.C50515n.C50516a.m108858a(r7)
                if (r7 == 0) goto L_0x029f
                goto L_0x02a1
            L_0x029f:
                r7 = 0
                goto L_0x02a2
            L_0x02a1:
                r7 = 1
            L_0x02a2:
                boolean r9 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.f103607p
                if (r9 == 0) goto L_0x02e0
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r10 = "Profile guide | shouldShowVcdGuide, loaded : "
                r9.<init>(r10)
                boolean r10 = r14.getVcdGuideLoaded()
                r9.append(r10)
                java.lang.String r10 = ", account valid: "
                r9.append(r10)
                com.ss.android.ugc.vcd.j r10 = r14.getVcdGuideData()
                if (r10 == 0) goto L_0x02c2
                com.ss.android.ugc.vcd.n r10 = r10.f126616e
                goto L_0x02c3
            L_0x02c2:
                r10 = r8
            L_0x02c3:
                boolean r10 = com.p683ss.android.ugc.vcd.C50515n.C50516a.m108858a(r10)
                r9.append(r10)
                java.lang.String r10 = ", relation valid: "
                r9.append(r10)
                com.ss.android.ugc.vcd.j r10 = r14.getVcdGuideData()
                if (r10 == 0) goto L_0x02d8
                com.ss.android.ugc.vcd.n r10 = r10.f126617f
                goto L_0x02d9
            L_0x02d8:
                r10 = r8
            L_0x02d9:
                boolean r10 = com.p683ss.android.ugc.vcd.C50515n.C50516a.m108858a(r10)
                r9.append(r10)
            L_0x02e0:
                boolean r9 = r14.getVcdGuideLoaded()
                if (r9 == 0) goto L_0x02f6
                if (r7 == 0) goto L_0x02f6
                java.lang.String r7 = r13.getFrom()
                java.lang.String r9 = "from_main"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r9)
                if (r7 == 0) goto L_0x02f6
                r7 = 1
                goto L_0x02f7
            L_0x02f6:
                r7 = 0
            L_0x02f7:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$3 r9 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$3
                r9.<init>(r12, r14)
                r3.<init>(r4, r5, r7, r9)
                r0[r1] = r3
                r1 = 10
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                boolean r5 = r14.getPostListHasLoaded()
                if (r5 == 0) goto L_0x031b
                java.lang.Boolean r5 = r13.isPostGuideShow()
                if (r5 == 0) goto L_0x031b
                r5 = 1
                goto L_0x031c
            L_0x031b:
                r5 = 0
            L_0x031c:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r7 = r12.f103701a
                java.lang.Boolean r7 = r13.isPostGuideShow()
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r9)
                if (r7 == 0) goto L_0x0338
                boolean r7 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90053b(r13)
                if (r7 == 0) goto L_0x0338
                r7 = 1
                goto L_0x0339
            L_0x0338:
                r7 = 0
            L_0x0339:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$4 r9 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$4
                r9.<init>(r12)
                r3.<init>(r4, r5, r7, r9)
                r0[r1] = r3
                r1 = 11
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                boolean r7 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90054c(r13)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$5 r9 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$5
                r9.<init>(r12)
                r3.<init>(r4, r5, r7, r9)
                r0[r1] = r3
                r1 = 12
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r9 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
                com.ss.android.ugc.aweme.profile.model.User r7 = r7.getCurUser()
                java.lang.String r9 = "AccountProxyService.userService().curUser"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
                r7.getAwemeCount()
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$6 r9 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$6
                r9.<init>(r12)
                r3.<init>(r4, r5, r7, r9)
                r0[r1] = r3
                r1 = 13
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$7 r9 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$7
                r9.<init>(r12)
                r3.<init>(r4, r5, r7, r9)
                r0[r1] = r3
                r1 = 14
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                com.ss.android.ugc.aweme.profile.service.s r7 = com.p683ss.android.ugc.aweme.profile.service.C40026s.f101964a
                boolean r7 = r7.needShowProfileGuideToFillAvatarAndNickname()
                if (r7 == 0) goto L_0x03d2
                java.lang.Boolean r7 = r13.isPostGuideShow()
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r9)
                if (r7 == 0) goto L_0x03d2
                r7 = 1
                goto L_0x03d3
            L_0x03d2:
                r7 = 0
            L_0x03d3:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$8 r9 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$8
                r9.<init>(r12)
                r3.<init>(r4, r5, r7, r9)
                r0[r1] = r3
                r1 = 15
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                boolean r5 = r14.getAvatarHasLoaded()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                com.bytedance.jedi.arch.a r7 = r13.getLoadAvatar()
                boolean r9 = r7 instanceof com.bytedance.jedi.arch.C11936w
                if (r9 != 0) goto L_0x03fa
                r7 = r8
            L_0x03fa:
                com.bytedance.jedi.arch.w r7 = (com.bytedance.jedi.arch.C11936w) r7
                if (r7 == 0) goto L_0x0404
                java.lang.Object r7 = r7.mo22538a()
                d.n r7 = (p2628d.C52847n) r7
            L_0x0404:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$9 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$9
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 16
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$10 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$10
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 17
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                boolean r5 = r14.getHasSurveyDetermined()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.String r7 = r13.getFrom()
                java.lang.String r8 = "from_main"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                if (r7 == 0) goto L_0x045c
                com.ss.android.ugc.aweme.profile.service.t r7 = com.p683ss.android.ugc.aweme.profile.service.C40027t.f101966a
                boolean r7 = r7.mo47106c()
                if (r7 != 0) goto L_0x045c
                com.ss.android.ugc.aweme.bs.a r7 = r14.getSurveyData()
                boolean r7 = com.p683ss.android.ugc.aweme.profile.survey.C40036g.m89007a(r7)
                if (r7 == 0) goto L_0x045c
                r7 = 1
                goto L_0x045d
            L_0x045c:
                r7 = 0
            L_0x045d:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$11 r8 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$11
                r8.<init>(r12)
                r3.<init>(r4, r5, r7, r8)
                r0[r1] = r3
                r1 = 18
                com.bytedance.jedi.arch.aa r3 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r5 = r14.getNeedShowDiskManagerGuide()
                if (r5 == 0) goto L_0x047b
                r5 = 1
                goto L_0x047c
            L_0x047b:
                r5 = 0
            L_0x047c:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.String r7 = r13.getFrom()
                java.lang.String r8 = "from_main"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                if (r7 == 0) goto L_0x04a4
                com.ss.android.ugc.aweme.profile.service.s r7 = com.p683ss.android.ugc.aweme.profile.service.C40026s.f101964a
                boolean r7 = r7.isEnableSettingDiskManager()
                if (r7 == 0) goto L_0x04a4
                java.lang.Boolean r14 = r14.getNeedShowDiskManagerGuide()
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                boolean r14 = p2628d.p2639f.p2641b.C52711k.m112239a(r14, r7)
                if (r14 == 0) goto L_0x04a4
                r14 = 1
                goto L_0x04a5
            L_0x04a4:
                r14 = 0
            L_0x04a5:
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$13 r7 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$13
                r7.<init>(r12)
                r3.<init>(r4, r5, r14, r7)
                r0[r1] = r3
                r14 = 19
                com.bytedance.jedi.arch.aa r1 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r5 = r12.f103701a
                boolean r13 = r5.mo82974d(r13)
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$14 r5 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$14
                r5.<init>(r12)
                r1.<init>(r3, r4, r13, r5)
                r0[r14] = r1
                r13 = 20
                com.bytedance.jedi.arch.aa r14 = new com.bytedance.jedi.arch.aa
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$15 r4 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$15
                r4.<init>(r12)
                r14.<init>(r1, r2, r3, r4)
                r0[r13] = r14
                d.f.a.a r13 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90047a((com.bytedance.jedi.arch.C11788aa<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, p2628d.p2639f.p2640a.C52670a<p2628d.C52860x>>[]) r0)
                if (r13 == 0) goto L_0x0503
                r13.invoke()
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r13 = r12.f103701a
                com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r13 = r13.mo82983r()
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q$a r14 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40683q.C40706a.f103727a
                d.f.a.b r14 = (p2628d.p2639f.p2640a.C52671b) r14
                r13.mo82895g(r14)
            L_0x0503:
                d.x r13 = p2628d.C52860x.f131107a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40683q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$r */
    static final /* synthetic */ class C40708r extends C52710j implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        public static final C40708r f103729a = new C40708r();

        C40708r() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C52761d getOwner() {
            return C52728w.m112246a(C39830d.class, "profile_tiktokI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            C52711k.m112240b(profileState, "p1");
            return (ProfileState) C39830d.m88579a(profileState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$s */
    static final class C40709s extends C52712l implements C52671b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C40709s f103730a = new C40709s();

        C40709s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
            C52711k.m112240b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, null, null, null, false, null, false, false, 4095, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$t */
    static final /* synthetic */ class C40710t extends C52710j implements C52671b<ProfileState, ProfileState> {

        /* renamed from: a */
        public static final C40710t f103731a = new C40710t();

        C40710t() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C52761d getOwner() {
            return C52728w.m112246a(C39830d.class, "profile_tiktokI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProfileState profileState = (ProfileState) obj;
            C52711k.m112240b(profileState, "p1");
            return (ProfileState) C39830d.m88579a(profileState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$u */
    public static final class C40711u implements C28448a {

        /* renamed from: a */
        final /* synthetic */ HomePageBottomToast f103732a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103733b;

        /* renamed from: c */
        final /* synthetic */ Set f103734c;

        /* renamed from: d */
        final /* synthetic */ String f103735d;

        /* renamed from: e */
        final /* synthetic */ User f103736e;

        /* renamed from: b */
        public final void mo51946b() {
            this.f103733b.setVisibility(8);
            this.f103734c.add(String.valueOf(this.f103732a.getToastType()));
            Keva.getRepo("keva_repo_homepage_bottomtoast").storeStringSet(this.f103735d, this.f103734c);
        }

        /* renamed from: a */
        public final void mo51945a() {
            C41302w.m91042a().mo83861a(this.f103732a.getJumpUrl());
            this.f103733b.setVisibility(8);
            this.f103734c.add(String.valueOf(this.f103732a.getToastType()));
            Keva.getRepo("keva_repo_homepage_bottomtoast").storeStringSet(this.f103735d, this.f103734c);
            User user = this.f103736e;
            C52711k.m112236a((Object) user, "currentUser");
            C26890h.m65011a("click_link", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("link_type", "elite_guide_link").mo47829a("author_id", user.getUid()).mo47829a("link_id", String.valueOf(this.f103732a.getToastType())).f61491a);
        }

        C40711u(HomePageBottomToast homePageBottomToast, NoticeView noticeView, Set set, String str, User user) {
            this.f103732a = homePageBottomToast;
            this.f103733b = noticeView;
            this.f103734c = set;
            this.f103735d = str;
            this.f103736e = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$v */
    static final class C40712v extends C52712l implements C52682m<C11866f, User, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103737a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103738b;

        C40712v(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103737a = myProfileGuideWidget;
            this.f103738b = noticeView;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            User user = (User) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            MyProfileGuideWidget myProfileGuideWidget = this.f103737a;
            NoticeView noticeView = this.f103738b;
            if (user == null) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                user = g.getCurUser();
                C52711k.m112236a((Object) user, "AccountProxyService.userService().curUser");
            }
            myProfileGuideWidget.mo82964a(noticeView, user);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$w */
    public static final class C40713w extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103739a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103740b;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setColor(this.f103739a.mo83008w().getResources().getColor(R.color.a0z));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            this.f103740b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f103739a.mo83008w(), "aweme://profile_edit").open();
            C26890h.m65011a("edit_profile", C23089d.m56640a().mo47829a("enter_method", "info_bar").mo47829a("enter_from", "personal_homepage").f61491a);
        }

        C40713w(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103739a = myProfileGuideWidget;
            this.f103740b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$x */
    public static final class C40714x implements C28448a {

        /* renamed from: a */
        final /* synthetic */ NoticeView f103741a;

        /* renamed from: a */
        public final void mo51945a() {
        }

        /* renamed from: b */
        public final void mo51946b() {
            this.f103741a.setVisibility(8);
            Keva.getRepo("keva_repo_profile_component").storeBoolean(C39877j.f101725a.mo80973d(), true);
        }

        C40714x(NoticeView noticeView) {
            this.f103741a = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$y */
    static final class C40715y implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f103742a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f103743b;

        C40715y(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f103742a = myProfileGuideWidget;
            this.f103743b = noticeView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f103743b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f103742a.mo83008w(), "aweme://profile_edit").open();
            C26890h.m65011a("edit_profile", C23089d.m56640a().mo47829a("enter_method", "info_bar").mo47829a("enter_from", "personal_homepage").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$z */
    static final class C40716z implements OnClickListener {

        /* renamed from: a */
        public static final C40716z f103744a = new C40716z();

        C40716z() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Keva.getRepo("keva_repo_profile_component").storeBoolean(C39877j.f101725a.mo80973d(), true);
        }
    }

    /* renamed from: y */
    private final ViewStub m90056y() {
        return (ViewStub) this.f103618t.getValue();
    }

    /* renamed from: r */
    public final MyProfileGuideViewModel mo82983r() {
        return (MyProfileGuideViewModel) this.f103609A.getValue();
    }

    /* renamed from: a */
    public final void mo82966a(NoticeButtonView noticeButtonView) {
        noticeButtonView.setOnInternalClickListener(new C40645aj(this, noticeButtonView));
        mo82968b((View) noticeButtonView);
        C26890h.m65011a("banner_show", C23089d.m56640a().mo47829a("banner_type", "coupon_fission").mo47829a("banner_name", "tiktok_rewards").mo47829a("enter_from", "personal_homepage").f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        if (r2 == null) goto L_0x011d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82965a(com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView r14, com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState r15) {
        /*
            r13 = this;
            java.lang.String r0 = "keva_repo_profile_component"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            com.ss.android.ugc.aweme.profile.j r1 = com.p683ss.android.ugc.aweme.profile.C39877j.f101725a
            java.lang.String r1 = r1.mo80977h()
            r0.erase(r1)
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r15 = r15.getSafeInfoNoticeMsg()
            if (r15 != 0) goto L_0x0016
            return
        L_0x0016:
            java.lang.String r0 = r15.noticeModel
            if (r0 == 0) goto L_0x0028
            java.lang.String r1 = "default"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            r0 = 2131954506(0x7f130b4a, float:1.9545513E38)
            r14.setCloseImage(r0)
        L_0x0028:
            r0 = 2131955017(0x7f130d49, float:1.954655E38)
            r14.setIconImage(r0)
            java.lang.String r0 = r15.notice
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = ""
        L_0x0034:
            r1 = r0
            java.lang.String r2 = "%s"
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs r0 = r15.args
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.mobile
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r3 = r0
            goto L_0x0045
        L_0x0042:
            java.lang.String r0 = ""
            goto L_0x0040
        L_0x0045:
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r1, r2, r3, r4, r5, r6)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r1.<init>(r8)
            java.util.List<com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight> r2 = r15.highlight
            r9 = 0
            if (r2 == 0) goto L_0x00d7
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r10 = r2.iterator()
        L_0x005f:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r2 = r10.next()
            r11 = r2
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight r11 = (com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight) r11
            android.app.Activity r12 = r13.mo83008w()
            java.lang.String r2 = "sourceSpannableBuilder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.String r2 = "sourceText"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "highlight"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r2)
            java.lang.String r2 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r2)
            java.lang.String r2 = "noticeBar"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r2)
            java.lang.String r2 = "noticeMsg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r2)
            java.lang.String r2 = r11.content
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 1
            if (r2 == 0) goto L_0x009e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r2 = 0
            goto L_0x009f
        L_0x009e:
            r2 = 1
        L_0x009f:
            if (r2 != 0) goto L_0x005f
            java.lang.String r2 = r11.scheme
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00af
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r3 == 0) goto L_0x00b2
            goto L_0x005f
        L_0x00b2:
            java.lang.String r3 = r11.content
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            int r2 = p2628d.p2650m.C52830p.m112419a(r2, r3, r4, r5, r6, r7)
            if (r2 >= 0) goto L_0x00c5
            java.lang.String r2 = r11.content
            int r2 = r2.length()
        L_0x00c5:
            com.ss.android.ugc.aweme.profile.util.ae r3 = new com.ss.android.ugc.aweme.profile.util.ae
            r3.<init>(r11, r12, r14, r15)
            java.lang.String r4 = r11.content
            int r4 = r4.length()
            int r4 = r4 + r2
            r5 = 18
            r1.setSpan(r3, r2, r4, r5)
            goto L_0x005f
        L_0x00d7:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r14.setTitleText(r1)
            android.widget.TextView r0 = r14.getTitleTextView()
            java.lang.String r1 = "noticeBar.titleTextView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r14.getTitleTextView()
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ap r1 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ap
            r1.<init>(r13, r14, r15)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aq r0 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aq
            r0.<init>(r13, r14, r15)
            com.ss.android.ugc.aweme.discover.ui.NoticeView$a r0 = (com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a) r0
            r14.setOnInternalClickListener(r0)
            r14.setVisibility(r9)
            java.lang.String r14 = "security_alert_notify"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "notice_id"
            java.lang.Long r2 = r15.noticeId
            if (r2 == 0) goto L_0x011d
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x011f
        L_0x011d:
            java.lang.String r2 = ""
        L_0x011f:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "notice_type"
            java.lang.String r2 = r15.noticeType
            if (r2 != 0) goto L_0x012b
            java.lang.String r2 = ""
        L_0x012b:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "notice_model"
            java.lang.String r2 = r15.noticeModel
            if (r2 != 0) goto L_0x0137
            java.lang.String r2 = ""
        L_0x0137:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "notice_tag"
            java.lang.String r15 = r15.noticeTag
            if (r15 != 0) goto L_0x0143
            java.lang.String r15 = ""
        L_0x0143:
            com.ss.android.ugc.aweme.app.f.d r15 = r0.mo47829a(r1, r15)
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r15)
            java.lang.String r14 = "secondhand_bubble_show"
            com.ss.android.ugc.aweme.app.f.d r15 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "personal_homepage"
            com.ss.android.ugc.aweme.app.f.d r15 = r15.mo47829a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.mo82965a(com.ss.android.ugc.aweme.discover.ui.NoticeView, com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState):void");
    }

    /* renamed from: a */
    public final void mo82964a(NoticeView noticeView, User user) {
        noticeView.setIconImage((int) R.drawable.dpi);
        if (user.getProfilePv() > 0) {
            Activity w = mo83008w();
            Object[] objArr = new Object[1];
            objArr[0] = user.getProfilePv() > 99 ? "99+" : String.valueOf(user.getProfilePv());
            String string = w.getString(R.string.gx_, objArr);
            String string2 = mo83008w().getString(R.string.agz);
            C52711k.m112236a((Object) string, C42311c.f106865i);
            CharSequence charSequence = string;
            C52711k.m112236a((Object) string2, "highlight");
            int a = C52830p.m112419a(charSequence, string2, 0, false, 6, (Object) null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new C40713w(this, noticeView), a, string2.length() + a, 17);
            noticeView.setTitleText((CharSequence) spannableStringBuilder);
            TextView textView = (TextView) noticeView.findViewById(R.id.dhb);
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            View findViewById = noticeView.findViewById(R.id.d17);
            if (findViewById != null) {
                findViewById.setClickable(false);
            }
            noticeView.setOnInternalClickListener(new C40714x(noticeView));
        } else {
            this.f103621w = C40026s.f101964a.showProfileCompleteView(noticeView, (Context) mo83008w(), (OnClickListener) new C40715y(this, noticeView), (OnClickListener) C40716z.f103744a, user.getProfileCompletion(), !user.avatarUpdateReminder());
        }
        noticeView.setVisibility(0);
    }

    /* renamed from: m */
    public final void mo25061m() {
        super.mo25061m();
        C40032d.m89003a().f101976b = null;
        C47718bf.m103291d(this);
    }

    /* renamed from: z */
    private final void m90057z() {
        if (this.f103611i == null) {
            this.f103611i = m90056y().inflate();
            View view = this.f103611i;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: l */
    public final void mo25060l() {
        super.mo25060l();
        mo22552a(mo83009x(), C40710t.f103731a);
        if (!C11016e.m22313h()) {
            mo82986u();
        }
    }

    /* renamed from: p */
    public final NoticeView mo52026p() {
        View view = this.f34862e;
        if (view == null) {
            C52711k.m112234a();
        }
        return (NoticeView) view.findViewById(R.id.f7_);
    }

    /* renamed from: q */
    public final NoticeButtonView mo82982q() {
        View view = this.f34862e;
        if (view == null) {
            C52711k.m112234a();
        }
        return (NoticeButtonView) view.findViewById(R.id.f7e);
    }

    /* renamed from: t */
    public final void mo82985t() {
        C0654k kVar;
        if (C40026s.f101964a.needShowProfileGuideToFillAvatarAndNickname()) {
            C40026s sVar = C40026s.f101964a;
            Activity w = mo83008w();
            if (!(w instanceof FragmentActivity)) {
                w = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) w;
            if (fragmentActivity != null) {
                kVar = fragmentActivity.getSupportFragmentManager();
            } else {
                kVar = null;
            }
            sVar.showProfileGuideToFillAvatarAndNickname(kVar, null);
        }
    }

    /* renamed from: u */
    public final void mo82986u() {
        C40036g gVar = this.f103613k;
        if (gVar != null && gVar.f101988i) {
            C40036g gVar2 = this.f103613k;
            if (gVar2 == null) {
                C52711k.m112234a();
            }
            gVar2.mo82068d();
            C40032d.m89003a();
            C40036g gVar3 = this.f103613k;
            if (gVar3 == null) {
                C52711k.m112234a();
            }
            int f = gVar3.mo82070f();
            C40036g gVar4 = this.f103613k;
            if (gVar4 == null) {
                C52711k.m112234a();
            }
            C40032d.m89004a(new C40030b(3, f, gVar4.mo82071g()));
        }
    }

    /* renamed from: k */
    public final void mo25059k() {
        super.mo25059k();
        View view = this.f103611i;
        if (view != null) {
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.cancel();
                animation.reset();
            }
        }
        if (VERSION.SDK_INT >= 19) {
            ObjectAnimator objectAnimator = this.f103614l;
            if (objectAnimator != null) {
                if (!objectAnimator.isRunning()) {
                    objectAnimator = null;
                }
                if (objectAnimator != null) {
                    objectAnimator.pause();
                }
            }
        }
        View view2 = this.f103615m;
        if (view2 != null) {
            Animation animation2 = view2.getAnimation();
            if (animation2 != null) {
                animation2.cancel();
                animation2.reset();
            }
        }
        if (VERSION.SDK_INT >= 19) {
            AnimatorSet animatorSet = this.f103616n;
            if (animatorSet != null) {
                if (!animatorSet.isRunning()) {
                    animatorSet = null;
                }
                if (animatorSet != null) {
                    animatorSet.pause();
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo82984s() {
        NoticeButtonView q = mo82982q();
        if (q != null && q.getVisibility() == 0) {
            C39806c a = C39806c.m88518a();
            C52711k.m112236a((Object) a, "CouponKeva.getInstance()");
            if (a.mo80884d()) {
                NoticeButtonView q2 = mo82982q();
                if (q2 != null) {
                    q2.setVisibility(8);
                }
            }
            C39806c.m88518a().mo80882c();
            C39806c a2 = C39806c.m88518a();
            C52711k.m112236a((Object) a2, "CouponKeva.getInstance()");
            if (a2.mo80884d()) {
                NoticeButtonView q3 = mo82982q();
                if (q3 != null) {
                    q3.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo82987v() {
        try {
            View inflate = ((ViewStub) this.f103622x.getValue()).inflate();
            this.f103623y = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.f2f);
            C52711k.m112236a((Object) textView, "tvContent");
            textView.setText(C40026s.f101964a.getGradientPunishWarningSettingsBubbleText());
            inflate.setOnClickListener(new C40641ag(this, inflate));
            C52711k.m112236a((Object) inflate, "gpWarningView");
            inflate.setVisibility(0);
            inflate.post(new C40642ah(this, inflate));
            C40026s.f101964a.onPunishWarningShow();
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* renamed from: j */
    public final void mo25058j() {
        boolean z;
        boolean z2;
        boolean z3;
        super.mo25058j();
        View view = this.f103611i;
        boolean z4 = false;
        if (view != null) {
            if (view.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                view = null;
            }
            if (view != null) {
                Animation animation = view.getAnimation();
                if (animation != null) {
                    animation.start();
                }
            }
        }
        if (VERSION.SDK_INT >= 19) {
            ObjectAnimator objectAnimator = this.f103614l;
            if (objectAnimator != null) {
                View view2 = this.f103611i;
                if (view2 == null || view2.getVisibility() != 0 || !objectAnimator.isPaused()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    objectAnimator = null;
                }
                if (objectAnimator != null) {
                    objectAnimator.resume();
                }
            }
        }
        View view3 = this.f103615m;
        if (view3 != null) {
            if (view3.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                view3 = null;
            }
            if (view3 != null) {
                Animation animation2 = view3.getAnimation();
                if (animation2 != null) {
                    animation2.start();
                }
            }
        }
        if (VERSION.SDK_INT >= 19) {
            AnimatorSet animatorSet = this.f103616n;
            if (animatorSet != null) {
                View view4 = this.f103615m;
                if (view4 != null && view4.getVisibility() == 0 && animatorSet.isPaused()) {
                    z4 = true;
                }
                if (!z4) {
                    animatorSet = null;
                }
                if (animatorSet != null) {
                    animatorSet.resume();
                }
            }
        }
        mo82984s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a5 A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25057g() {
        /*
            r9 = this;
            super.mo25057g()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r9)
            com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel r0 = r9.mo83009x()
            r2 = r0
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.aweme.profile.widgets.C40718a.f103751a
            d.k.j r4 = com.p683ss.android.ugc.aweme.profile.widgets.C40719b.f103752a
            d.k.j r5 = com.p683ss.android.ugc.aweme.profile.widgets.C40720c.f103753a
            d.k.j r6 = com.p683ss.android.ugc.aweme.profile.widgets.C40721d.f103754a
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$o r0 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$o
            r0.<init>(r9)
            r8 = r0
            d.f.a.s r8 = (p2628d.p2639f.p2640a.C52688s) r8
            com.bytedance.jedi.arch.u r7 = com.bytedance.jedi.arch.internal.C11896i.m24255a()
            r1 = r9
            r1.mo22551a(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel r0 = r9.mo83009x()
            r2 = r0
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.aweme.profile.widgets.C40722e.f103755a
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$p r0 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$p
            r0.<init>(r9)
            r5 = r0
            d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
            r4 = 0
            r6 = 2
            r7 = 0
            r1.mo22547a(r2, r3, com.bytedance.jedi.arch.internal.C11896i.m24255a(), r5)
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r0 = r9.mo82983r()
            r2 = r0
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q r0 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q
            r0.<init>(r9)
            r4 = r0
            d.f.a.m r4 = (p2628d.p2639f.p2640a.C52682m) r4
            r3 = 0
            r5 = 1
            r6 = 0
            r1.mo22546a(r2, com.bytedance.jedi.arch.internal.C11896i.m24255a(), r4)
            com.ss.android.ugc.aweme.profile.service.t r0 = com.p683ss.android.ugc.aweme.profile.service.C40027t.f101966a
            boolean r0 = r0.mo47106c()
            if (r0 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r0 = r9.mo82983r()
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$g r1 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40667g.f103682a
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            r0.mo82895g(r1)
        L_0x0064:
            com.ss.android.ugc.aweme.profile.survey.d r0 = com.p683ss.android.ugc.aweme.profile.survey.C40032d.m89003a()
            com.ss.android.ugc.aweme.profile.widgets.j r1 = new com.ss.android.ugc.aweme.profile.widgets.j
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r2 = r9.mo82983r()
            r1.<init>(r2)
            com.ss.android.ugc.aweme.profile.survey.d$a r1 = (com.p683ss.android.ugc.aweme.profile.survey.C40032d.C40033a) r1
            r0.f101976b = r1
            com.ss.android.ugc.aweme.profile.survey.d r0 = com.p683ss.android.ugc.aweme.profile.survey.C40032d.m89003a()
            a.i r1 = com.p683ss.android.ugc.aweme.profile.survey.SurveyApi.m88997a()
            if (r1 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.profile.survey.e r2 = new com.ss.android.ugc.aweme.profile.survey.e
            r2.<init>(r0)
            r1.mo19a(r2)
        L_0x0087:
            com.ss.android.ugc.aweme.profile.service.s r0 = com.p683ss.android.ugc.aweme.profile.service.C40026s.f101964a
            c.a.v r0 = r0.needShowDiskManagerGuideView()
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$i r1 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$i
            r1.<init>(r9)
            c.a.ab r1 = (p064c.p065a.C1674ab) r1
            r0.mo6314a(r1)
            com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel r0 = r9.mo83009x()
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$r r1 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40708r.f103729a
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            java.lang.Object r0 = r9.mo22552a(r0, r1)
            com.ss.android.ugc.aweme.profile.viewmodel.ProfileState r0 = (com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState) r0
            java.lang.String r1 = "keva_repo_profile_component"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r1)
            com.ss.android.ugc.aweme.profile.j r2 = com.p683ss.android.ugc.aweme.profile.C39877j.f101725a
            java.lang.String r2 = r2.mo80977h()
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 1
            if (r2 == 0) goto L_0x00c8
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r2 = 0
            goto L_0x00c9
        L_0x00c8:
            r2 = 1
        L_0x00c9:
            if (r2 != 0) goto L_0x00ef
            com.ss.android.ugc.aweme.utils.GsonProvider r2 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r4 = "GsonProvider.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ Exception -> 0x00ef }
            com.google.gson.f r2 = r2.getGson()     // Catch:{ Exception -> 0x00ef }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse> r4 = com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse.class
            java.lang.Object r1 = r2.mo34884a(r1, r4)     // Catch:{ Exception -> 0x00ef }
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse r1 = (com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse) r1     // Catch:{ Exception -> 0x00ef }
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r2 = r9.mo82983r()     // Catch:{ Exception -> 0x00ef }
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$k r4 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$k     // Catch:{ Exception -> 0x00ef }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00ef }
            d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4     // Catch:{ Exception -> 0x00ef }
            r2.mo82895g(r4)     // Catch:{ Exception -> 0x00ef }
            goto L_0x0135
        L_0x00ef:
            java.lang.System.currentTimeMillis()
            java.lang.String r1 = "keva_repo_profile_component"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r1)
            java.lang.String r2 = "last_time_fetch_used_phone_msg"
            java.lang.String r2 = m90048a(r2)
            r4 = 0
            r1.getLong(r2, r4)
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Long r1 = r1.getReusePhoneCheckInterval()
            java.lang.String r2 = "SettingsReader.get().reusePhoneCheckInterval"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.longValue()
            java.lang.String r0 = r0.getFrom()
            java.lang.String r1 = "from_main"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            r0 = r0 ^ r3
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.profile.service.t r0 = com.p683ss.android.ugc.aweme.profile.service.C40027t.f101966a
            r0.mo47103a()
        L_0x012a:
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r0 = r9.mo82983r()
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$l r1 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40674l.f103690a
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            r0.mo82895g(r1)
        L_0x0135:
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$e r0 = com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C40665e.f103680a
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            a.i r0 = p001a.C0013i.m16a(r0)
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$f r1 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$f
            r1.<init>(r9)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r2 = p001a.C0013i.f25b
            r0.mo20a(r1, r2)
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel r0 = r9.mo82983r()
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = "myProfileGuideViewModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.p683ss.android.ugc.aweme.profile.C40730x.f103764b = r1
        L_0x015b:
            com.ss.android.ugc.aweme.discover.ui.NoticeView r0 = r9.mo52026p()
            r1 = 0
            if (r0 == 0) goto L_0x0167
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0168
        L_0x0167:
            r0 = r1
        L_0x0168:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto L_0x016d
            r0 = r1
        L_0x016d:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 == 0) goto L_0x0180
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            java.lang.String r3 = "AdaptationManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            int r2 = r2.mo46745b()
            r0.bottomMargin = r2
        L_0x0180:
            com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView r0 = r9.mo82982q()
            if (r0 == 0) goto L_0x018b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x018c
        L_0x018b:
            r0 = r1
        L_0x018c:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto L_0x0191
            r0 = r1
        L_0x0191:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 == 0) goto L_0x01a5
            com.ss.android.ugc.aweme.adaptation.b r1 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            java.lang.String r2 = "AdaptationManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            int r1 = r1.mo46745b()
            r0.bottomMargin = r1
            return
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.mo25057g():void");
    }

    /* renamed from: b */
    private static String m90052b(String str) {
        return new C52820l("(.)").replace((CharSequence) str, "⁠");
    }

    /* renamed from: a */
    public final void mo82967a(boolean z) {
        Keva.getRepo("account_security_keva_name").storeBoolean(m90048a("prior_to_safe_info"), z);
        C47718bf.m103288a(new C39717ac(z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo82968b(View view) {
        this.f103615m = view;
        View view2 = this.f103615m;
        if (view2 != null) {
            view2.post(new C40646ak(this, view));
        }
    }

    /* renamed from: d */
    public final void mo82973d(NoticeView noticeView) {
        mo22550a(mo83009x(), C40724g.f103757a, C40725h.f103758a, C40726i.f103759a, C11896i.m24255a(), new C40643ai<>(this, noticeView));
    }

    /* renamed from: f */
    public final void mo82976f(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.dp7);
        noticeView.setTitleText((int) R.string.si);
        this.f103620v = C40026s.f101964a.showBindPhoneDialog(noticeView, mo83008w());
    }

    @C53771m
    public final void onI18nRecommendUserDialogDissmissEvent(C39801e eVar) {
        C52711k.m112240b(eVar, "event");
        mo82983r().mo82895g(C40709s.f103730a);
    }

    /* renamed from: a */
    public static String m90048a(String str) {
        C52711k.m112240b(str, "$this$appendCurUid");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        sb.append(g.getCurUserId());
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo82971c(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.do7);
        noticeView.setTitleText((int) R.string.aye);
        noticeView.setOnInternalClickListener(new C40648am(this, noticeView));
        mo82968b((View) noticeView);
        C26890h.m65011a("privacy_floating_bar_show", C23089d.m56640a().f61491a);
        mo82967a(true);
    }

    public MyProfileGuideWidget(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "contentView");
        this.f34862e = viewGroup;
        C52760c a = C52728w.m112245a(MyProfileGuideViewModel.class);
        C52670a aVar = new C40634a(this, a);
        this.f103609A = new WidgetLifecycleAwareLazy(this, aVar, new C40663c(this, aVar, a, C40662b.INSTANCE));
    }

    /* renamed from: a */
    public static C52670a<C52860x> m90047a(C11788aa<Boolean, Boolean, Boolean, C52670a<C52860x>>[] aaVarArr) {
        boolean z = true;
        for (int i = 0; i < 21; i++) {
            C11788aa<Boolean, Boolean, Boolean, C52670a<C52860x>> aaVar = aaVarArr[i];
            if (z && ((Boolean) aaVar.f31294a).booleanValue() && ((Boolean) aaVar.f31295b).booleanValue() && ((Boolean) aaVar.f31296c).booleanValue()) {
                return (C52670a) aaVar.f31297d;
            }
            if (((Boolean) aaVar.f31294a).booleanValue()) {
                if (!z || !((Boolean) aaVar.f31295b).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r3.isPostAwemeEmptyWhenPrivateShow(), (java.lang.Object) java.lang.Boolean.valueOf(true)) != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r0.getAwemeCount() != 0) goto L_0x0041;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90053b(com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState r3) {
        /*
            com.ss.android.ugc.aweme.profile.service.t r0 = com.p683ss.android.ugc.aweme.profile.service.C40027t.f101966a
            boolean r0 = r0.mo47103a()
            if (r0 != 0) goto L_0x0056
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r3.getFrom()
            java.lang.String r1 = "from_main"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r0 = r3.isPostAwemeEmpty()
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r0 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r2 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            int r0 = r0.getAwemeCount()
            if (r0 == 0) goto L_0x0055
        L_0x0041:
            boolean r0 = com.p683ss.android.ugc.aweme.profile.experiment.C39868b.m88638a()
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r3 = r3.isPostAwemeEmptyWhenPrivateShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r0)
            if (r3 == 0) goto L_0x0056
        L_0x0055:
            return r1
        L_0x0056:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90053b(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState):boolean");
    }

    /* renamed from: c */
    public static boolean m90054c(ProfileState profileState) {
        boolean z;
        C40527ac.m89932a();
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        if (curUser == null || curUser.getUserRate() < 2 || curUser.getUserRate() > 6) {
            z = false;
        } else {
            z = true;
        }
        if (z && C52711k.m112239a((Object) profileState.getFrom(), (Object) "from_main") && !C40027t.f101966a.mo47103a()) {
            IAccountUserService g2 = C20854a.m53167g();
            C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
            C40332dm.m89687a(g2.getCurUser().userRateRemindInfo);
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m90055e(ProfileState profileState) {
        Integer num;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            num = b.getDownloadSettingEnable();
        } catch (C10174a unused) {
            num = Integer.valueOf(0);
        }
        if (!C52711k.m112239a((Object) profileState.getFrom(), (Object) "from_main") || !C52711k.m112239a((Object) profileState.isPostAwemeEmpty(), (Object) Boolean.valueOf(false)) || profileState.getCurrentDownloadSetting() == null || C47915gg.m103651b() || num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo82978h(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.dpi);
        mo22547a(mo83009x(), C40723f.f103756a, C11896i.m24255a(), new C40712v(this, noticeView));
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
        mo82964a(noticeView, curUser);
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        repo.storeInt(C39877j.f101725a.mo80971b(), repo.getInt(C39877j.f101725a.mo80971b(), 0) + 1);
        repo.storeLong(C39877j.f101725a.mo80972c(), System.currentTimeMillis());
    }

    /* renamed from: i */
    public final void mo82979i(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.do3);
        noticeView.setTitleText((int) R.string.dga);
        String string = mo83008w().getString(R.string.dg8);
        C52711k.m112236a((Object) string, "activity.getString(R.str…ting_storage_mgmt_manage)");
        SpannableString spannableString = new SpannableString(m90052b(string));
        spannableString.setSpan(new ForegroundColorSpan(mo83008w().getResources().getColor(R.color.a0y)), 0, spannableString.length(), 18);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
        noticeView.setTitleText((CharSequence) new SpannableStringBuilder(mo83008w().getString(R.string.dga)).append(spannableString));
        noticeView.setOnInternalClickListener(new C40635aa(this, noticeView));
        noticeView.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo82969b(NoticeView noticeView) {
        String str;
        C10660a aVar = this.f103624z;
        if (aVar == null || !aVar.isShowing()) {
            TextView titleTextView = noticeView.getTitleTextView();
            if (!TextUtils.isEmpty(DuoshanSyncSetting.getCmplToast())) {
                str = DuoshanSyncSetting.getCmplToast();
                if (str == null) {
                    str = "";
                }
            } else {
                str = mo83008w().getString(R.string.hli);
            }
            C10661a aVar2 = new C10661a(mo83008w());
            C52711k.m112236a((Object) str, "bubbleText");
            this.f103624z = aVar2.mo19012a(str).mo19010a(5000).mo19013a(false).mo19014a();
            C10660a aVar3 = this.f103624z;
            if (aVar3 != null && !aVar3.isShowing()) {
                aVar3.mo18996a();
                C52711k.m112236a((Object) titleTextView, "titleTextView");
                aVar3.mo18998a(titleTextView, 48, (int) noticeView.getX(), (((int) noticeView.getY()) + ((int) titleTextView.getY())) - aVar3.mo19002c(), titleTextView.getX() + C9432q.m18687b((Context) mo83008w(), 8.0f));
            }
            return;
        }
        C10660a aVar4 = this.f103624z;
        if (aVar4 != null) {
            aVar4.dismiss();
        }
    }

    /* renamed from: d */
    public final boolean mo82974d(ProfileState profileState) {
        Object obj;
        boolean z;
        if ((!C52711k.m112239a((Object) profileState.getFrom(), (Object) "from_main")) || C40027t.f101966a.mo47103a() || (!C35837h.m80977b())) {
            return false;
        }
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        StringBuilder sb = new StringBuilder("key_homepage_bottomtoast_toasttype_user_close_record");
        C52711k.m112236a((Object) curUser, "currentUser");
        sb.append(curUser.getUid());
        Set stringSet = Keva.getRepo("keva_repo_homepage_bottomtoast").getStringSet(sb.toString(), new HashSet());
        if (stringSet == null) {
            C52711k.m112234a();
        }
        if (stringSet.size() >= 2) {
            return false;
        }
        List homepageBottomToast = curUser.getHomepageBottomToast();
        if (homepageBottomToast != null) {
            Iterator it = homepageBottomToast.iterator();
            while (true) {
                Integer num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                HomePageBottomToast homePageBottomToast = (HomePageBottomToast) obj;
                if (homePageBottomToast != null) {
                    num = homePageBottomToast.getToastType();
                }
                if (num == null || stringSet.contains(String.valueOf(homePageBottomToast.getToastType()))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            HomePageBottomToast homePageBottomToast2 = (HomePageBottomToast) obj;
            if (homePageBottomToast2 != null) {
                int i = Keva.getRepo("keva_repo_homepage_bottomtoast").getInt("key_homepage_bottomtoast_lasttoast_type", -1);
                Integer toastType = homePageBottomToast2.getToastType();
                if (toastType == null || i != toastType.intValue()) {
                    long j = Keva.getRepo("keva_repo_homepage_bottomtoast").getLong("key_homepage_bottomtoast_lasttoast_firstshowtime", 0);
                    Calendar instance = Calendar.getInstance();
                    C52711k.m112236a((Object) instance, "Calendar.getInstance()");
                    if (instance.getTimeInMillis() < j + 604800000) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo82977g(NoticeView noticeView) {
        int i;
        int i2;
        C11787a loadAvatar = ((ProfileState) mo22552a(mo83009x(), C40650ao.f103652a)).getLoadAvatar();
        if (!(loadAvatar instanceof C11936w)) {
            loadAvatar = null;
        }
        C11936w wVar = (C11936w) loadAvatar;
        if (wVar != null) {
            C52847n nVar = (C52847n) wVar.mo22538a();
            if (nVar != null) {
                noticeView.setIconImage((int) R.drawable.dpi);
                noticeView.setTitleText((int) R.string.cnr);
                C40026s sVar = C40026s.f101964a;
                Context w = mo83008w();
                OnClickListener anVar = new C40649an(this);
                List urlList = ((UrlModel) nVar.getFirst()).getUrlList();
                C52711k.m112236a((Object) urlList, "loadAvatar.first.urlList");
                C12200n nVar2 = (C12200n) nVar.getSecond();
                if (nVar2 != null) {
                    i = nVar2.f32140b;
                } else {
                    i = 0;
                }
                C12200n nVar3 = (C12200n) nVar.getSecond();
                if (nVar3 != null) {
                    i2 = nVar3.f32139a;
                } else {
                    i2 = 0;
                }
                this.f103621w = sVar.showProfileCompleteView(noticeView, w, anVar, urlList, i, i2);
                C26890h.m65011a("profile_alert_show", C23089d.m56640a().f61491a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90051a(com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState r4) {
        /*
            java.lang.String r4 = r4.getFrom()
            java.lang.String r0 = "from_main"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r0)
            r0 = 0
            if (r4 == 0) goto L_0x007a
            java.lang.Boolean r4 = com.p683ss.android.ugc.aweme.profile.C39796b.f101570a
            java.lang.String r1 = "BuildConfig.SHOW_NOTICE_ENABLE_REWARD"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x007a
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r4 != 0) goto L_0x007a
            com.ss.android.ugc.aweme.profile.c r4 = com.p683ss.android.ugc.aweme.profile.C39806c.m88518a()
            java.lang.String r1 = "CouponKeva.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
            boolean r4 = r4.mo80884d()
            if (r4 != 0) goto L_0x007a
            com.ss.android.ugc.aweme.profile.c r4 = com.p683ss.android.ugc.aweme.profile.C39806c.m88518a()
            com.bytedance.keva.Keva r1 = r4.f101577b
            java.lang.String r2 = "show_bubble"
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 == 0) goto L_0x004a
            com.bytedance.keva.Keva r4 = r4.f101577b
            java.lang.String r1 = "show_bar"
            boolean r4 = r4.getBoolean(r1, r0)
            if (r4 != 0) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            if (r4 == 0) goto L_0x007a
            r4 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0062 }
            java.lang.String r3 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)     // Catch:{ a -> 0x0062 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r1.getAwemeActivitySetting()     // Catch:{ a -> 0x0062 }
            if (r1 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r1 = r1.getProfileActivityButton()     // Catch:{ a -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r1 = r4
        L_0x0063:
            if (r1 == 0) goto L_0x0069
            java.lang.String r4 = r1.getH5Link()
        L_0x0069:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0076
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r4 = 0
            goto L_0x0077
        L_0x0076:
            r4 = 1
        L_0x0077:
            if (r4 != 0) goto L_0x007a
            return r2
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m90051a(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r3 == false) goto L_0x006f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82975e(com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r0 = r0.getUserRateRemindInfo()
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            r1 = 2131955016(0x7f130d48, float:1.9546548E38)
            r9.setIconImage(r1)
            r1 = 2132551737(0x7f1c2839, float:2.0756842E38)
            r9.setTitleText(r1)
            com.ss.android.ugc.aweme.profile.ui.dm r1 = new com.ss.android.ugc.aweme.profile.ui.dm
            r1.<init>(r9)
            r8.f103619u = r1
            r2 = r1
            com.ss.android.ugc.aweme.discover.ui.NoticeView$a r2 = (com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a) r2
            r9.setOnInternalClickListener(r2)
            android.app.Activity r9 = r8.mo83008w()
            android.content.Context r9 = (android.content.Context) r9
            r1.f102952d = r9
            r1.f102949a = r0
            com.ss.android.ugc.aweme.discover.ui.NoticeView r9 = r1.f102950b
            if (r9 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r9 = r1.f102949a
            r0 = 1
            r2 = 0
            if (r9 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r9 = r1.f102949a
            java.lang.String r9 = r9.getRemindText()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x004f
            r9 = 1
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            if (r9 == 0) goto L_0x012b
            boolean r9 = r1.f102951c
            if (r9 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r9 = r9.getCurUser()
            if (r9 != 0) goto L_0x006f
            int r3 = r9.getUserRate()
            r4 = 2
            if (r3 < r4) goto L_0x006c
            r4 = 6
            if (r3 > r4) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 != 0) goto L_0x012b
        L_0x006f:
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r3 = r1.f102949a
            boolean r3 = com.p683ss.android.ugc.aweme.profile.p2090ui.C40332dm.m89687a(r3)
            if (r3 == 0) goto L_0x012b
            android.text.SpannableString r3 = new android.text.SpannableString     // Catch:{ Exception -> 0x012b }
            r4 = 2132551738(0x7f1c283a, float:2.0756844E38)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.base.utils.C23723j.m58219b(r4)     // Catch:{ Exception -> 0x012b }
            r3.<init>(r4)     // Catch:{ Exception -> 0x012b }
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r4 = r1.f102949a     // Catch:{ Exception -> 0x012b }
            java.lang.String r4 = r4.getRemindText()     // Catch:{ Exception -> 0x012b }
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x012b }
            r5.<init>(r4)     // Catch:{ Exception -> 0x012b }
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r4 = r1.f102949a     // Catch:{ Exception -> 0x012b }
            int r4 = com.p683ss.android.ugc.aweme.profile.p2090ui.C40332dm.m89688b(r4)     // Catch:{ Exception -> 0x012b }
            if (r4 == 0) goto L_0x00b8
            android.content.Context r4 = r1.f102952d     // Catch:{ Exception -> 0x012b }
            if (r4 == 0) goto L_0x00b8
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x012b }
            android.content.Context r6 = r1.f102952d     // Catch:{ Exception -> 0x012b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x012b }
            r7 = 2131821791(0x7f1104df, float:1.9276335E38)
            int r6 = r6.getColor(r7)     // Catch:{ Exception -> 0x012b }
            r4.<init>(r6)     // Catch:{ Exception -> 0x012b }
            int r6 = r3.length()     // Catch:{ Exception -> 0x012b }
            r7 = 34
            r3.setSpan(r4, r2, r6, r7)     // Catch:{ Exception -> 0x012b }
            r5.append(r3)     // Catch:{ Exception -> 0x012b }
        L_0x00b8:
            com.ss.android.ugc.aweme.discover.ui.NoticeView r3 = r1.f102950b     // Catch:{ Exception -> 0x012b }
            r3.setTitleText(r5)     // Catch:{ Exception -> 0x012b }
            java.lang.String r3 = r9.getUid()     // Catch:{ Exception -> 0x012b }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x012b }
            if (r3 != 0) goto L_0x012a
            java.lang.String r9 = r9.getUid()     // Catch:{ Exception -> 0x012b }
            java.util.List r3 = com.p683ss.android.ugc.aweme.profile.p2090ui.C40332dm.m89689c()     // Catch:{ Exception -> 0x012b }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ Exception -> 0x012b }
        L_0x00d3:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x012b }
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x012b }
            com.ss.android.ugc.aweme.profile.ui.dm$a r5 = (com.p683ss.android.ugc.aweme.profile.p2090ui.C40332dm.C40333a) r5     // Catch:{ Exception -> 0x012b }
            if (r5 == 0) goto L_0x00d3
            java.lang.String r6 = r5.f102953a     // Catch:{ Exception -> 0x012b }
            boolean r6 = android.text.TextUtils.equals(r6, r9)     // Catch:{ Exception -> 0x012b }
            if (r6 == 0) goto L_0x00d3
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012b }
            r5.f102954b = r6     // Catch:{ Exception -> 0x012b }
            goto L_0x00f1
        L_0x00f0:
            r0 = 0
        L_0x00f1:
            if (r0 != 0) goto L_0x0103
            com.ss.android.ugc.aweme.profile.ui.dm$a r0 = new com.ss.android.ugc.aweme.profile.ui.dm$a     // Catch:{ Exception -> 0x012b }
            r0.<init>()     // Catch:{ Exception -> 0x012b }
            r0.f102953a = r9     // Catch:{ Exception -> 0x012b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012b }
            r0.f102954b = r4     // Catch:{ Exception -> 0x012b }
            r3.add(r0)     // Catch:{ Exception -> 0x012b }
        L_0x0103:
            r1.mo82587a(r3)     // Catch:{ Exception -> 0x012b }
            com.ss.android.ugc.aweme.discover.ui.NoticeView r9 = r1.f102950b     // Catch:{ Exception -> 0x012b }
            r9.setVisibility(r2)     // Catch:{ Exception -> 0x012b }
            java.lang.String r9 = "toast_show"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Exception -> 0x012b }
            java.lang.String r2 = "toast_type"
            java.lang.String r3 = "publisher_block"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)     // Catch:{ Exception -> 0x012b }
            java.lang.String r2 = "have_view_more"
            com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo r1 = r1.f102949a     // Catch:{ Exception -> 0x012b }
            int r1 = com.p683ss.android.ugc.aweme.profile.p2090ui.C40332dm.m89688b(r1)     // Catch:{ Exception -> 0x012b }
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r2, r1)     // Catch:{ Exception -> 0x012b }
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a     // Catch:{ Exception -> 0x012b }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r0)     // Catch:{ Exception -> 0x012b }
        L_0x012a:
            return
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.mo82975e(com.ss.android.ugc.aweme.discover.ui.NoticeView):void");
    }

    /* renamed from: j */
    public final void mo82980j(NoticeView noticeView) {
        Object obj;
        String str;
        String str2;
        boolean z;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        StringBuilder sb = new StringBuilder("key_homepage_bottomtoast_toasttype_user_close_record");
        C52711k.m112236a((Object) curUser, "currentUser");
        sb.append(curUser.getUid());
        String sb2 = sb.toString();
        Set stringSet = Keva.getRepo("keva_repo_homepage_bottomtoast").getStringSet(sb2, new HashSet());
        if (stringSet == null) {
            C52711k.m112234a();
        }
        List homepageBottomToast = curUser.getHomepageBottomToast();
        if (homepageBottomToast != null) {
            Iterator it = homepageBottomToast.iterator();
            while (true) {
                Integer num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                HomePageBottomToast homePageBottomToast = (HomePageBottomToast) obj;
                if (homePageBottomToast != null) {
                    num = homePageBottomToast.getToastType();
                }
                if (num == null || stringSet.contains(String.valueOf(homePageBottomToast.getToastType()))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            HomePageBottomToast homePageBottomToast2 = (HomePageBottomToast) obj;
            if (homePageBottomToast2 != null) {
                Calendar instance = Calendar.getInstance();
                C52711k.m112236a((Object) instance, "Calendar.getInstance()");
                Keva.getRepo("keva_repo_homepage_bottomtoast").storeLong("key_homepage_bottomtoast_lasttoast_firstshowtime", instance.getTimeInMillis());
                Keva repo = Keva.getRepo("keva_repo_homepage_bottomtoast");
                String str3 = "key_homepage_bottomtoast_lasttoast_type";
                Integer toastType = homePageBottomToast2.getToastType();
                if (toastType == null) {
                    C52711k.m112234a();
                }
                repo.storeInt(str3, toastType.intValue());
                if (homePageBottomToast2.getToast() != null) {
                    str = homePageBottomToast2.getToast();
                } else {
                    str = "";
                }
                if (homePageBottomToast2.getJumpUrlTitle() != null) {
                    str2 = homePageBottomToast2.getJumpUrlTitle();
                } else {
                    str2 = mo83008w().getString(R.string.b9e);
                }
                if (str2 == null) {
                    C52711k.m112234a();
                }
                SpannableString spannableString = new SpannableString(m90052b(str2));
                spannableString.setSpan(new ForegroundColorSpan(mo83008w().getResources().getColor(R.color.a0z)), 0, spannableString.length(), 18);
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                noticeView.setTitleText((CharSequence) new SpannableStringBuilder(str).append(spannableString));
                noticeView.setIconImage(homePageBottomToast2.getIconUrl());
                C40711u uVar = new C40711u(homePageBottomToast2, noticeView, stringSet, sb2, curUser);
                noticeView.setOnInternalClickListener(uVar);
                C26890h.m65011a("show_link", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("link_type", "elite_guide_link").mo47829a("author_id", curUser.getUid()).mo47829a("link_id", String.valueOf(homePageBottomToast2.getToastType())).f61491a);
                noticeView.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo82963a(NoticeView noticeView) {
        String str;
        m90050a("impression", -1);
        this.f103617o = System.currentTimeMillis();
        noticeView.setIconImage((int) R.drawable.dp1);
        if (!TextUtils.isEmpty(DuoshanSyncSetting.getRelationToast())) {
            StringBuilder sb = new StringBuilder(" ");
            sb.append(DuoshanSyncSetting.getRelationToast());
            sb.append(12290);
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(mo83008w().getString(R.string.g_1));
            sb2.append(12290);
            str = sb2.toString();
        }
        SpannableString spannableString = new SpannableString(str);
        Drawable a = C0726c.m2091a((Context) mo83008w(), (int) R.drawable.dp0);
        if (a != null) {
            C52711k.m112236a((Object) a, "ContextCompat.getDrawabl…e_ic_sync_hint) ?: return");
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
            spannableString.setSpan(new C29641g(a, 1, new C40658av()), 0, 1, 33);
            spannableString.setSpan(new C40654as(this, noticeView), 0, 1, 33);
            SpannableString spannableString2 = new SpannableString(mo83008w().getString(R.string.hlk));
            spannableString2.setSpan(new ForegroundColorSpan(mo83008w().getResources().getColor(R.color.a0z)), 0, spannableString2.length(), 18);
            spannableString2.setSpan(new C40655at(this, noticeView), 0, spannableString2.length(), 18);
            noticeView.setTitleText((CharSequence) new SpannableStringBuilder(spannableString).append(spannableString2));
            TextView titleTextView = noticeView.getTitleTextView();
            C52711k.m112236a((Object) titleTextView, "bottomNoticeBar.titleTextView");
            titleTextView.setMovementMethod(LinkMovementMethod.getInstance());
            noticeView.setOnInternalClickListener(new C40657au(this, noticeView));
            noticeView.setVisibility(0);
            C29655g.f77512b.increaseGuideShowCnt();
            C29655g.f77512b.saveGuideShowTime();
            C29655g.f77511a = true;
        }
    }

    /* renamed from: a */
    public static void m90050a(String str, long j) {
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("event_type", str);
        if (j != -1) {
            a.mo47827a("duration", j);
        }
        C26890h.m65011a("sync_duoshan_guide", a.f61491a);
    }

    /* renamed from: c */
    public final void mo82972c(NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
        String string = mo83008w().getString(R.string.cws);
        String string2 = mo83008w().getString(R.string.cwt);
        noticeView.setIconImage((int) R.drawable.do7);
        noticeView.setTitleText((int) R.string.cws);
        CharSequence charSequence = string;
        SpannableString spannableString = new SpannableString(charSequence);
        C40636ab abVar = new C40636ab(this, noticeView, myProfileGuideState);
        C52711k.m112236a((Object) string, C42311c.f106865i);
        C52711k.m112236a((Object) string2, "highlight");
        int a = C52830p.m112419a(charSequence, string2, 0, false, 6, (Object) null);
        if (a < 0) {
            a = string.length();
        }
        spannableString.setSpan(abVar, a, string.length(), 17);
        noticeView.setTitleText((CharSequence) spannableString);
        TextView textView = (TextView) noticeView.findViewById(R.id.dhb);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = noticeView.findViewById(R.id.d17);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        noticeView.setOnInternalClickListener(new C40637ac(noticeView));
        C40026s.f101964a.setPrivateSettingItem("download_prompt", 1).mo6152a((C1710e<? super T>) C40638ad.f103633a, (C1710e<? super Throwable>) C40639ae.f103634a);
        mo82968b((View) noticeView);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82970b(com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView r14, com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState r15) {
        /*
            r13 = this;
            d.f.b.v$a r8 = new d.f.b.v$a
            r8.<init>()
            r9 = 0
            r8.element = r9
            d.f.b.v$c r3 = new d.f.b.v$c
            r3.<init>()
            r3.element = r9
            d.f.b.v$c r7 = new d.f.b.v$c
            r7.<init>()
            r7.element = r9
            com.ss.android.ugc.vcd.j r0 = r15.getVcdGuideData()
            r10 = 0
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.vcd.n r0 = r0.f126616e
            goto L_0x0021
        L_0x0020:
            r0 = r10
        L_0x0021:
            boolean r0 = com.p683ss.android.ugc.vcd.C50515n.C50516a.m108858a(r0)
            r1 = 1
            if (r0 == 0) goto L_0x003c
            r8.element = r1
            r0 = 1003(0x3eb, float:1.406E-42)
            r3.element = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r7.element = r0
            com.ss.android.ugc.vcd.j r0 = r15.getVcdGuideData()
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.vcd.n r0 = r0.f126616e
        L_0x003a:
            r11 = r0
            goto L_0x005e
        L_0x003c:
            com.ss.android.ugc.vcd.j r0 = r15.getVcdGuideData()
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.vcd.n r0 = r0.f126617f
            goto L_0x0046
        L_0x0045:
            r0 = r10
        L_0x0046:
            boolean r0 = com.p683ss.android.ugc.vcd.C50515n.C50516a.m108858a(r0)
            if (r0 == 0) goto L_0x005d
            r0 = 1013(0x3f5, float:1.42E-42)
            r3.element = r0
            r0 = 1012(0x3f4, float:1.418E-42)
            r7.element = r0
            com.ss.android.ugc.vcd.j r0 = r15.getVcdGuideData()
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.vcd.n r0 = r0.f126617f
            goto L_0x003a
        L_0x005d:
            r11 = r10
        L_0x005e:
            boolean r0 = f103607p
            if (r0 == 0) goto L_0x00d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Vcd profile guide, dialogTitle: "
            r0.<init>(r2)
            if (r11 == 0) goto L_0x006e
            java.lang.String r2 = r11.f126634d
            goto L_0x006f
        L_0x006e:
            r2 = r10
        L_0x006f:
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            java.lang.String r2 = "dialogText: "
            r0.append(r2)
            if (r11 == 0) goto L_0x0081
            java.lang.String r2 = r11.f126635e
            goto L_0x0082
        L_0x0081:
            r2 = r10
        L_0x0082:
            r0.append(r2)
            java.lang.String r2 = ", barTitle: "
            r0.append(r2)
            if (r11 == 0) goto L_0x008f
            java.lang.String r2 = r11.f126632b
            goto L_0x0090
        L_0x008f:
            r2 = r10
        L_0x0090:
            r0.append(r2)
            java.lang.String r2 = ", barText: "
            r0.append(r2)
            if (r11 == 0) goto L_0x009d
            java.lang.String r2 = r11.f126633c
            goto L_0x009e
        L_0x009d:
            r2 = r10
        L_0x009e:
            r0.append(r2)
            java.lang.String r2 = ", barIcon: "
            r0.append(r2)
            if (r11 == 0) goto L_0x00cc
            com.ss.android.ugc.vcd.e r2 = r11.f126631a
            if (r2 == 0) goto L_0x00cc
            java.lang.String[] r2 = r2.f126604b
            if (r2 == 0) goto L_0x00cc
            java.lang.String r4 = "$this$first"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            int r4 = r2.length
            if (r4 != 0) goto L_0x00ba
            r4 = 1
            goto L_0x00bb
        L_0x00ba:
            r4 = 0
        L_0x00bb:
            if (r4 != 0) goto L_0x00c2
            r2 = r2[r9]
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00cd
        L_0x00c2:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "Array is empty."
            r14.<init>(r15)
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            throw r14
        L_0x00cc:
            r2 = r10
        L_0x00cd:
            r0.append(r2)
        L_0x00d0:
            if (r11 != 0) goto L_0x00d3
            return
        L_0x00d3:
            boolean r0 = r8.element
            if (r0 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.profile.service.t r0 = com.p683ss.android.ugc.aweme.profile.service.C40027t.f101966a
            boolean r0 = r0.mo47103a()
            if (r0 == 0) goto L_0x00e0
            return
        L_0x00e0:
            com.ss.android.ugc.aweme.utils.cr$a r0 = new com.ss.android.ugc.aweme.utils.cr$a
            r0.<init>()
            android.app.Activity r2 = r13.mo83008w()
            boolean r4 = r8.element
            if (r4 == 0) goto L_0x00f1
            r4 = 2132542831(0x7f1c056f, float:2.0738778E38)
            goto L_0x00f4
        L_0x00f1:
            r4 = 2132542130(0x7f1c02b2, float:2.0737356E38)
        L_0x00f4:
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r4 = r11.f126633c
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.mo95037a(r4, r10, r9)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.app.Activity r4 = r13.mo83008w()
            android.content.Context r4 = (android.content.Context) r4
            r5 = 2131821790(0x7f1104de, float:1.9276333E38)
            int r4 = android.support.p030v4.content.C0726c.m2098c(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.mo95037a(r2, r4, r1)
            android.text.Spannable r0 = r0.mo95036a()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r14.setTitleText(r0)
            r0 = 2131954999(0x7f130d37, float:1.9546513E38)
            r14.setIconImage(r0)
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aw r12 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aw
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r8
            r5 = r11
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.discover.ui.NoticeView$a r12 = (com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a) r12
            r14.setOnInternalClickListener(r12)
            java.lang.String r15 = "profile"
            r11.f126638h = r15
            r14.setVisibility(r9)
            boolean r14 = r8.element
            if (r14 == 0) goto L_0x0144
            java.lang.String r14 = "vcd_account_auth_bar_show"
            com.p683ss.android.ugc.aweme.common.C26883g.m64995a(r14, r10)
        L_0x0144:
            com.p683ss.android.ugc.vcd.C50506f.m108851a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.mo82970b(com.ss.android.ugc.aweme.discover.ui.NoticeView, com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState):void");
    }

    /* renamed from: a */
    public final void mo82962a(int i, boolean z) {
        if (i == 0) {
            View view = this.f103611i;
            if (view == null || view.getVisibility() != 0) {
                m90057z();
                View view2 = this.f103611i;
                if (view2 != null) {
                    view2.setVisibility(i);
                    view2.setScaleX(0.8f);
                    view2.setScaleY(0.8f);
                    Context w = mo83008w();
                    m90057z();
                    if (this.f103611i != null) {
                        View view3 = this.f103611i;
                        if (view3 != null) {
                            view3.setLayerType(2, null);
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(w, R.anim.b9);
                        C52711k.m112236a((Object) loadAnimation, "animation");
                        loadAnimation.setRepeatMode(2);
                        loadAnimation.setRepeatCount(-1);
                        loadAnimation.setAnimationListener(new C40661ax(this));
                        View view4 = this.f103611i;
                        if (view4 != null) {
                            view4.startAnimation(loadAnimation);
                        }
                    }
                }
            }
        } else if (this.f103611i != null) {
            View view5 = this.f103611i;
            if (view5 != null) {
                view5.setVisibility(i);
            }
            View view6 = this.f103611i;
            if (view6 != null) {
                view6.clearAnimation();
            }
        }
    }
}
