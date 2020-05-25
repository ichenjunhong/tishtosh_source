package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.ILegacyService;
import com.p683ss.android.ugc.aweme.LegacyServiceImpl;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.feed.experiment.FollowLiveSkylightExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37922a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37923b;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTTutorialVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d.C38054a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38055e;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38092f;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38101n;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService;
import com.p683ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService;
import com.p683ss.android.ugc.aweme.notification.model.RecommendAvatarsModel;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38419h.C38420a;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38419h.C38421b;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38249a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e.C38259a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38266h;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2024a.C38318a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2025b.C38321a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2025b.C38322b;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38337f;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2028e.C38346b;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38367ap.C38368a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2030g.C38417a;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38142v;
import com.p683ss.android.ugc.aweme.notification.p2015e.C38178a;
import com.p683ss.android.ugc.aweme.notification.p2018g.C38206a;
import com.p683ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38437f;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p683ss.android.ugc.aweme.notification.view.p2032a.C38460a;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a.C41050a;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52767h;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c */
public final class C38297c extends C23526a implements C1091b, C23452y<User>, C26846a, C26877c<MusNotice>, C38259a, C38266h, C38322b, C38368a, C39981o {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f97491a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38297c.class), "mFollowRequestPresenter", "getMFollowRequestPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/followrequest/presenter/FollowRequestPresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38297c.class), "mNoticeMultiPresenter", "getMNoticeMultiPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/presenter/MusNotificationMultiPresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38297c.class), "mNoticeModel", "getMNoticeModel()Lcom/ss/android/ugc/aweme/notification/newstyle/model/MusNewNotificationModel;"))};

    /* renamed from: j */
    public static final C38298a f97492j = new C38298a(null);

    /* renamed from: A */
    private boolean f97493A;

    /* renamed from: B */
    private boolean f97494B;

    /* renamed from: C */
    private boolean f97495C;

    /* renamed from: D */
    private HashMap f97496D;

    /* renamed from: b */
    public C38258e f97497b;

    /* renamed from: c */
    C38417a f97498c;

    /* renamed from: d */
    final List<C38092f> f97499d;

    /* renamed from: e */
    public boolean f97500e;

    /* renamed from: k */
    private final C52668f f97501k = C52732g.m112285a(C38308k.f97525a);

    /* renamed from: l */
    private final C52668f f97502l = C52732g.m112285a(C38310m.f97527a);

    /* renamed from: m */
    private final C52668f f97503m = C52732g.m112285a(C38309l.f97526a);

    /* renamed from: n */
    private C39993z f97504n;

    /* renamed from: o */
    private AnalysisStayTimeFragmentComponent f97505o;

    /* renamed from: p */
    private RecommendAvatarsModel f97506p;

    /* renamed from: q */
    private TutorialVideoViewModel f97507q;

    /* renamed from: r */
    private LinearLayoutManager f97508r;

    /* renamed from: s */
    private int f97509s;

    /* renamed from: t */
    private int f97510t;

    /* renamed from: u */
    private final String f97511u;

    /* renamed from: v */
    private final AtomicInteger f97512v;

    /* renamed from: w */
    private boolean f97513w;

    /* renamed from: x */
    private C37920f f97514x;

    /* renamed from: y */
    private List<MusNotice> f97515y;

    /* renamed from: z */
    private boolean f97516z;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$a */
    public static final class C38298a {
        private C38298a() {
        }

        public /* synthetic */ C38298a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$b */
    static final class C38299b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38297c f97517a;

        C38299b(C38297c cVar) {
            this.f97517a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C38297c cVar = this.f97517a;
            RelativeLayout relativeLayout = (RelativeLayout) this.f97517a.mo78256a((int) R.id.et4);
            C52711k.m112236a((Object) relativeLayout, "rl_title_bar");
            View view2 = relativeLayout;
            if (cVar.isViewValid()) {
                if (cVar.f97498c == null) {
                    Context context = cVar.getContext();
                    if (context == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) context, "this.context!!");
                    cVar.f97498c = new C38417a(context, cVar);
                    C38417a aVar = cVar.f97498c;
                    if (aVar != null) {
                        List<C38092f> list = cVar.f97499d;
                        C52711k.m112240b(list, "list");
                        C38249a aVar2 = aVar.f97777a;
                        if (aVar2 == null) {
                            C52711k.m112237a("mAdapter");
                        }
                        aVar2.mo50303a(list);
                    }
                    C38417a aVar3 = cVar.f97498c;
                    if (aVar3 != null) {
                        aVar3.setOnDismissListener(new C38316s(cVar));
                    }
                }
                C38417a aVar4 = cVar.f97498c;
                if (aVar4 != null) {
                    aVar4.showAsDropDown(view2);
                }
                View a = cVar.mo78256a((int) R.id.f6_);
                C52711k.m112236a((Object) a, "v_title_line");
                a.setVisibility(0);
                ImageView imageView = (ImageView) cVar.mo78256a((int) R.id.eg5);
                C52711k.m112236a((Object) imageView, "iv_title_dot");
                imageView.setVisibility(8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) cVar.mo78256a((int) R.id.eet), "rotation", new float[]{0.0f, 180.0f});
                C52711k.m112236a((Object) ofFloat, "animator");
                ofFloat.setDuration(200);
                ofFloat.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$c */
    static final class C38300c implements OnClickListener {

        /* renamed from: a */
        public static final C38300c f97518a = new C38300c();

        C38300c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$d */
    static final class C38301d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38297c f97519a;

        C38301d(C38297c cVar) {
            this.f97519a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f97519a.mo78256a((int) R.id.eyy);
            dmtStatusView.mo19213g();
            dmtStatusView.setFocusable(false);
            dmtStatusView.setFocusableInTouchMode(false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$e */
    static final class C38302e<T> implements C0199s<C38101n> {

        /* renamed from: a */
        final /* synthetic */ C38297c f97520a;

        C38302e(C38297c cVar) {
            this.f97520a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C38297c.m85553a(this.f97520a).mo78233a((C38101n) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$f */
    static final class C38303f<T> implements C0199s<TutorialVideoResp> {

        /* renamed from: a */
        final /* synthetic */ C38297c f97521a;

        C38303f(C38297c cVar) {
            this.f97521a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) obj;
            try {
                C38055e eVar = (C38055e) C38054a.m85114a(C38055e.class);
                str3 = eVar.mo48439a("");
                String string = this.f97521a.getString(R.string.cgb);
                C52711k.m112236a((Object) string, "getString(R.string.new_feature_notification)");
                str2 = eVar.mo48441c(string);
                String string2 = this.f97521a.getString(R.string.cgc);
                C52711k.m112236a((Object) string2, "getString(R.string.new_feature_notification2)");
                str = eVar.mo48443e(string2);
                String string3 = this.f97521a.getString(R.string.cgd);
                C52711k.m112236a((Object) string3, "getString(R.string.new_feature_watch)");
                str4 = eVar.mo48445g(string3);
            } catch (Exception unused) {
                str3 = "";
                str2 = this.f97521a.getString(R.string.cgb);
                C52711k.m112236a((Object) str2, "getString(R.string.new_feature_notification)");
                str = this.f97521a.getString(R.string.cgb);
                C52711k.m112236a((Object) str, "getString(R.string.new_feature_notification)");
                str4 = this.f97521a.getString(R.string.cgb);
                C52711k.m112236a((Object) str4, "getString(R.string.new_feature_notification)");
            }
            if (!TextUtils.isEmpty(str3)) {
                C38297c.m85553a(this.f97521a).mo78232a(new TutorialVideoResp(new TutorialVideoInfo(str3, str2, str, str4), 0));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$g */
    public static final class C38304g implements C38420a {

        /* renamed from: a */
        final /* synthetic */ C38297c f97522a;

        C38304g(C38297c cVar) {
            this.f97522a = cVar;
        }

        /* renamed from: a */
        public final void mo78264a(int i) {
            C38297c.m85553a(this.f97522a).mo78237e(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$h */
    public static final class C38305h implements C37923b {
        C38305h() {
        }

        /* renamed from: a */
        public final void mo65249a(Context context) {
            C23794bh.m58408v().mo49251e(context);
        }

        /* renamed from: b */
        public final boolean mo65250b(Context context) {
            return C23794bh.m58408v().mo49252f(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$i */
    static final class C38306i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38297c f97523a;

        C38306i(C38297c cVar) {
            this.f97523a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C41049a.f104381a.mo83571a().openSessionListActivity(this.f97523a.getContext());
            C38046d.m85103c(997);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$j */
    static final class C38307j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38297c f97524a;

        C38307j(C38297c cVar) {
            this.f97524a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C38046d.f96822b.mo77575c().shouldRedictToTipsPage()) {
                C38046d.f96822b.mo77575c().goToTipsPage();
                return;
            }
            C41049a.f104381a.mo83571a().openSessionListActivity(this.f97524a.getContext());
            C38046d.m85103c(997);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$k */
    static final class C38308k extends C52712l implements C52670a<C38321a> {

        /* renamed from: a */
        public static final C38308k f97525a = new C38308k();

        C38308k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C38321a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$l */
    static final class C38309l extends C52712l implements C52670a<C38337f> {

        /* renamed from: a */
        public static final C38309l f97526a = new C38309l();

        C38309l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C38337f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$m */
    static final class C38310m extends C52712l implements C52670a<C38346b> {

        /* renamed from: a */
        public static final C38310m f97527a = new C38310m();

        C38310m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C38346b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$n */
    static final class C38311n<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38297c f97528a;

        C38311n(C38297c cVar) {
            this.f97528a = cVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (this.f97528a.isViewValid()) {
                this.f97528a.mo78258i();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$o */
    public static final class C38312o extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Dialog f97529a;

        /* renamed from: b */
        final /* synthetic */ C38297c f97530b;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setColor(this.f97530b.getResources().getColor(R.color.avn));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "view");
            if (this.f97529a != null && this.f97529a.isShowing()) {
                C38344e.m85633a(this.f97529a);
            }
            SmartRouter.buildRoute((Context) this.f97530b.getActivity(), "//privacy/setting").open();
        }

        C38312o(Dialog dialog, C38297c cVar) {
            this.f97529a = dialog;
            this.f97530b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$p */
    public static final class C38313p extends C52712l implements C52671b<Object, Boolean> {
        public static final C38313p INSTANCE = new C38313p();

        public C38313p() {
            super(1);
        }

        public final boolean invoke(Object obj) {
            return obj instanceof C38142v;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$q */
    static final class C38314q extends C52712l implements C52671b<Integer, C1352v> {

        /* renamed from: a */
        final /* synthetic */ C38297c f97531a;

        C38314q(C38297c cVar) {
            this.f97531a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return ((RecyclerView) this.f97531a.mo78256a((int) R.id.cg7)).mo4847f(((Number) obj).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$r */
    static final class C38315r implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38297c f97532a;

        C38315r(C38297c cVar) {
            this.f97532a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97532a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c$s */
    static final class C38316s implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C38297c f97533a;

        C38316s(C38297c cVar) {
            this.f97533a = cVar;
        }

        public final void onDismiss() {
            View a = this.f97533a.mo78256a((int) R.id.f6_);
            C52711k.m112236a((Object) a, "v_title_line");
            a.setVisibility(4);
            this.f97533a.mo78257h();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) this.f97533a.mo78256a((int) R.id.eet), "rotation", new float[]{180.0f, 0.0f});
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setDuration(200);
            ofFloat.start();
        }
    }

    /* renamed from: l */
    private final C38321a m85562l() {
        return (C38321a) this.f97501k.getValue();
    }

    /* renamed from: m */
    private final C38346b m85563m() {
        return (C38346b) this.f97502l.getValue();
    }

    /* renamed from: n */
    private final C38337f m85564n() {
        return (C38337f) this.f97503m.getValue();
    }

    /* renamed from: a */
    public final View mo78256a(int i) {
        if (this.f97496D == null) {
            this.f97496D = new HashMap();
        }
        View view = (View) this.f97496D.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f97496D.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo78220a(List<User> list, boolean z, boolean z2) {
        C52711k.m112240b(list, "list");
    }

    /* renamed from: a */
    public final void mo78221a(boolean z) {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<MusNotice> list, boolean z) {
    }

    /* renamed from: a */
    public final void mo47018a(List<MusNotice> list, boolean z) {
        Object obj;
        boolean z2;
        Collection collection = list;
        if (!(collection == null || collection.isEmpty()) && C36782d.m82775a().mo75940c(61) > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MusNotice) obj).getTcmNotice() != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            MusNotice musNotice = (MusNotice) obj;
            if (musNotice != null) {
                list.remove(musNotice);
                list.add(0, musNotice);
            }
        }
        if (!(collection == null || collection.isEmpty()) && C10181b.m20511a().mo18168a(FollowLiveSkylightExperiment.class, true, "i18n_following_live_skylight_type", 31744, 0) == 1) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((MusNotice) it2.next()).getType() == 1001) {
                    it2.remove();
                }
            }
        }
        if (isViewValid()) {
            this.f97512v.decrementAndGet();
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.mo54798c(true);
            C38258e eVar2 = this.f97497b;
            if (eVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar2.f97398k = m85564n().f97572d;
            if (m85573w()) {
                this.f97515y = list;
                this.f97495C = false;
                if (!z) {
                    C39993z zVar = this.f97504n;
                    if (zVar != null) {
                        zVar.mo81925e();
                    }
                    C39993z zVar2 = this.f97504n;
                    if (zVar2 != null) {
                        IAccountUserService g = C20854a.m53167g();
                        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                        zVar2.mo81920a(20, g.getCurUserId(), 4, C47945d.m103731a(), (String) null, C47945d.m103733b(), "0");
                    }
                    this.f97516z = false;
                    this.f97494B = true;
                    return;
                }
                C38258e eVar3 = this.f97497b;
                if (eVar3 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar3.ao_();
                RecyclerView recyclerView = (RecyclerView) mo78256a((int) R.id.cg7);
                C52711k.m112236a((Object) recyclerView, "rv_list");
                recyclerView.getVisibility();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
                C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
                swipeRefreshLayout.setRefreshing(false);
                C38258e eVar4 = this.f97497b;
                if (eVar4 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar4.mo50303a(list);
                ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
                ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
                DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
                C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
                dmtStatusView.setVisibility(8);
                ((RecyclerView) mo78256a((int) R.id.cg7)).mo4814b(0);
                this.f97516z = true;
                return;
            }
            if (!z) {
                m85569s();
            } else {
                C38258e eVar5 = this.f97497b;
                if (eVar5 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar5.ao_();
                RecyclerView recyclerView2 = (RecyclerView) mo78256a((int) R.id.cg7);
                C52711k.m112236a((Object) recyclerView2, "rv_list");
                recyclerView2.getVisibility();
            }
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
            C52711k.m112236a((Object) swipeRefreshLayout2, "srl_refresh_layout");
            swipeRefreshLayout2.setRefreshing(false);
            C38258e eVar6 = this.f97497b;
            if (eVar6 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar6.mo50303a(list);
            ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo78256a((int) R.id.eyz);
            C52711k.m112236a((Object) dmtStatusView2, "sv_status_view_top");
            dmtStatusView2.setVisibility(8);
            ((RecyclerView) mo78256a((int) R.id.cg7)).mo4814b(0);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<MusNotice> list, boolean z) {
        if (isViewValid()) {
            if (C9376b.m18558a((Collection<T>) list)) {
                z = false;
            }
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.f97398k = m85564n().f97572d;
            if (m85573w()) {
                this.f97515y = list;
                this.f97495C = false;
                if (!z) {
                    C39993z zVar = this.f97504n;
                    if (zVar != null) {
                        zVar.mo81925e();
                    }
                    C39993z zVar2 = this.f97504n;
                    if (zVar2 != null) {
                        IAccountUserService g = C20854a.m53167g();
                        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                        zVar2.mo81920a(20, g.getCurUserId(), 4, C47945d.m103731a(), (String) null, C47945d.m103733b(), "0");
                    }
                    this.f97494B = true;
                    return;
                }
                C38258e eVar2 = this.f97497b;
                if (eVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar2.ao_();
                C38258e eVar3 = this.f97497b;
                if (eVar3 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar3.mo50304b(list);
                return;
            }
            if (!z) {
                m85569s();
            } else {
                C38258e eVar4 = this.f97497b;
                if (eVar4 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar4.ao_();
            }
            C38258e eVar5 = this.f97497b;
            if (eVar5 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar5.mo50304b(list);
        }
    }

    /* renamed from: a */
    public final void mo78219a(List<User> list, int i) {
        C52711k.m112240b(list, "list");
        this.f97512v.decrementAndGet();
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.mo78235a(list, i, this.f97509s);
        if (this.f97512v.get() == 0) {
            ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
            C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo78218a(Exception exc, boolean z) {
        this.f97512v.decrementAndGet();
        if (this.f97513w) {
            mo78258i();
        } else {
            m85571u();
        }
    }

    /* renamed from: a */
    public final void mo78239a(List<MusNotice> list) {
        if (m85573w() && !this.f97494B) {
            this.f97495C = true;
            this.f97515y = list;
            C39993z zVar = this.f97504n;
            if (zVar != null) {
                zVar.mo81925e();
            }
            C39993z zVar2 = this.f97504n;
            if (zVar2 != null) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                zVar2.mo81920a(20, g.getCurUserId(), 4, C47945d.m103731a(), (String) null, C47945d.m103733b(), "0");
            }
        }
    }

    /* renamed from: w */
    private static boolean m85573w() {
        return AccountSuggestionExperiment.m75371b();
    }

    public final void onPause() {
        super.onPause();
        m85557b(false);
    }

    /* renamed from: s */
    private final void m85569s() {
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.mo54798c(false);
    }

    /* renamed from: e */
    public final void mo47031e() {
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.am_();
    }

    /* renamed from: p */
    private final void m85566p() {
        DmtTextView dmtTextView = (DmtTextView) mo78256a((int) R.id.f3b);
        C52711k.m112236a((Object) dmtTextView, "tv_message_count");
        dmtTextView.setVisibility(8);
        m85560c(false);
    }

    /* renamed from: r */
    private static boolean m85568r() {
        return C38046d.m85102b(11, 997);
    }

    /* renamed from: v */
    private final void m85572v() {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to_tab_name", mo78259j());
        C26890h.m65011a("change_notification_tab", linkedHashMap);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        RecyclerView recyclerView = (RecyclerView) mo78256a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        recyclerView.getVisibility();
    }

    public final Analysis getAnalysis() {
        Analysis labelName = new Analysis().setLabelName("message");
        C52711k.m112236a((Object) labelName, "Analysis().setLabelName(NoticeMob.Label.MESSAGE)");
        return labelName;
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        I18nNoticeBridgeService.createINoticeBridgeServicebyMonsterPlugin().recordGuideBundle(null, 0);
    }

    public final void onStart() {
        super.onStart();
        ILegacyService createILegacyServicebyMonsterPlugin = LegacyServiceImpl.createILegacyServicebyMonsterPlugin();
        C52711k.m112236a((Object) createILegacyServicebyMonsterPlugin, "ServiceManager.get().get…egacyService::class.java)");
        createILegacyServicebyMonsterPlugin.getUgAllService().mo49249d(getContext());
    }

    /* renamed from: j */
    public final String mo78259j() {
        int i = this.f97510t;
        if (i == 3) {
            return "likes";
        }
        if (i == 7) {
            return "followers";
        }
        if (i == 26) {
            return "mentions";
        }
        if (i == 37) {
            return "official";
        }
        if (i != 44) {
            return "all";
        }
        return "comments";
    }

    public final void onDestroyView() {
        super.onDestroyView();
        m85563m().aq_();
        m85563m().mo46991S_();
        m85562l().aq_();
        m85562l().mo46991S_();
        C39993z zVar = this.f97504n;
        if (zVar != null) {
            zVar.mo77195c();
        }
        if (this.f97496D != null) {
            this.f97496D.clear();
        }
    }

    /* renamed from: o */
    private final void m85565o() {
        List a = m85564n().mo78282a(this.f97510t);
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.mo50303a(a);
        C38258e eVar2 = this.f97497b;
        if (eVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar2.notifyDataSetChanged();
        if (!C38326d.m85622a(getActivity())) {
            this.f97512v.set(0);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C10691a.m21542b((Context) activity, (int) R.string.cg1).mo19066a();
            if (isViewValid()) {
                mo78258i();
                return;
            }
            return;
        }
        C38258e eVar3 = this.f97497b;
        if (eVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (eVar3.getItemCount() > 0) {
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19212f();
        }
        onRefresh();
    }

    /* renamed from: q */
    private final void m85567q() {
        if (isViewValid()) {
            this.f97512v.decrementAndGet();
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            if (eVar.f70699x) {
                C38258e eVar2 = this.f97497b;
                if (eVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar2.notifyDataSetChanged();
                m85569s();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
            C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            m85571u();
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
            C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: t */
    private final boolean m85570t() {
        boolean z;
        int i;
        boolean z2;
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        Collection a = eVar.mo50673a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C38258e eVar2 = this.f97497b;
            if (eVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            List a2 = eVar2.mo50673a();
            C52711k.m112236a((Object) a2, "mAdapter.data");
            Iterable<MusNotice> iterable = a2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i = 0;
                for (MusNotice musNotice : iterable) {
                    C52711k.m112236a((Object) musNotice, "it");
                    if (musNotice.getType() != 50) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i++;
                        if (i < 0) {
                            C52575l.m112102c();
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private final void m85571u() {
        if (this.f97512v.get() == 0) {
            ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
            C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
            C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            if (m85570t()) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) mo78256a((int) R.id.eyy);
                dmtStatusView2.mo19213g();
                dmtStatusView2.setFocusable(false);
                dmtStatusView2.setFocusableInTouchMode(false);
            }
        }
    }

    public final void aJ_() {
        if (m85573w()) {
            this.f97493A = true;
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.mo54798c(true);
            C39993z zVar = this.f97504n;
            if (zVar != null) {
                zVar.mo81925e();
            }
            C39993z zVar2 = this.f97504n;
            if (zVar2 != null) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                zVar2.mo81920a(20, g.getCurUserId(), 4, C47945d.m103731a(), (String) null, C47945d.m103733b(), "0");
            }
        } else {
            m85567q();
        }
    }

    /* renamed from: h */
    public final void mo78257h() {
        if (this.f97510t != 36) {
            int a = C38046d.m85098a(36);
            int a2 = C38046d.m85098a(this.f97510t);
            if (a > 0 && a > a2) {
                ImageView imageView = (ImageView) mo78256a((int) R.id.eg5);
                C52711k.m112236a((Object) imageView, "iv_title_dot");
                imageView.setVisibility(0);
                return;
            }
        }
        ImageView imageView2 = (ImageView) mo78256a((int) R.id.eg5);
        C52711k.m112236a((Object) imageView2, "iv_title_dot");
        imageView2.setVisibility(8);
    }

    /* renamed from: i */
    public final void mo78258i() {
        if (this.f97512v.get() == 0) {
            ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
            C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
            C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            if (m85570t()) {
                ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19214h();
                RecyclerView recyclerView = (RecyclerView) mo78256a((int) R.id.cg7);
                C52711k.m112236a((Object) recyclerView, "rv_list");
                recyclerView.getVisibility();
            }
        }
    }

    public C38297c() {
        List<C38092f> arrayList = new ArrayList<>();
        C38092f fVar = new C38092f(36, R.string.cjz, R.drawable.ckn, R.string.cj4, R.string.cjr, R.drawable.cl7);
        arrayList.add(fVar);
        C38092f fVar2 = new C38092f(3, R.string.ck5, R.drawable.ckr, R.string.ckb, R.string.cka, R.drawable.cla);
        arrayList.add(fVar2);
        C38092f fVar3 = new C38092f(44, R.string.ck2, R.drawable.ckp, R.string.cjb, R.string.cja, R.drawable.cl9);
        arrayList.add(fVar3);
        C38092f fVar4 = new C38092f(26, R.string.ck1, R.drawable.cko, R.string.ckh, R.string.ckg, R.drawable.cl8);
        arrayList.add(fVar4);
        C38092f fVar5 = new C38092f(7, R.string.ck3, R.drawable.ckq, R.string.cjx, R.string.cjw, R.drawable.cl_);
        arrayList.add(fVar5);
        C38092f fVar6 = new C38092f(37, R.string.ck6, R.drawable.cks, R.string.ckp, R.string.cko, R.drawable.clb);
        arrayList.add(fVar6);
        this.f97499d = arrayList;
        this.f97510t = 36;
        this.f97511u = "99+";
        this.f97512v = new AtomicInteger(2);
        this.f97515y = new ArrayList();
    }

    public final void ar_() {
        if (isViewValid() && !m85563m().mo54804o()) {
            if (!m85573w()) {
                m85563m().mo44934a_(Integer.valueOf(4), Integer.valueOf(this.f97510t), null);
            } else if (!this.f97494B) {
                C38258e eVar = this.f97497b;
                if (eVar == null) {
                    C52711k.m112237a("mAdapter");
                }
                if (!eVar.f97393f) {
                    m85563m().mo44934a_(Integer.valueOf(4), Integer.valueOf(this.f97510t), null);
                    return;
                }
                mo47031e();
                C39993z zVar = this.f97504n;
                if (zVar != null) {
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    zVar.mo81917a(20, g.getCurUserId(), 4, C47945d.m103731a(), C47945d.m103733b(), "0");
                }
            } else {
                mo47031e();
                C39993z zVar2 = this.f97504n;
                if (zVar2 != null) {
                    IAccountUserService g2 = C20854a.m53167g();
                    C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                    zVar2.mo81917a(20, g2.getCurUserId(), 4, C47945d.m103731a(), C47945d.m103733b(), "0");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo78222b() {
        this.f97512v.decrementAndGet();
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.mo78235a((List<User>) new ArrayList<User>(), 0, 0);
        if (this.f97513w) {
            mo78258i();
        } else {
            m85571u();
        }
    }

    public final void onResume() {
        super.onResume();
        m85557b(true);
        if (isViewValid()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("label");
                String stringExtra2 = intent.getStringExtra("uid");
                if (intent.getBooleanExtra("is_from_push", false) && this.f97510t != 36) {
                    C38417a aVar = this.f97498c;
                    if (aVar != null) {
                        C38249a aVar2 = aVar.f97777a;
                        if (aVar2 == null) {
                            C52711k.m112237a("mAdapter");
                        }
                        aVar2.f97353a = 36;
                        C38249a aVar3 = aVar.f97777a;
                        if (aVar3 == null) {
                            C52711k.m112237a("mAdapter");
                        }
                        aVar3.notifyDataSetChanged();
                    }
                    mo78243a((C38092f) this.f97499d.get(0));
                }
                intent.putExtra("label", "");
                if (TextUtils.equals(stringExtra, "follow_request")) {
                    startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").withParam("label", stringExtra).withParam("uid", stringExtra2).buildIntent(), PreloadTask.BYTE_UNIT_NUMBER);
                }
            }
        }
        if (this.f97500e) {
            onRefresh();
            this.f97500e = false;
        }
    }

    /* renamed from: k */
    public final void mo78260k() {
        Display display;
        if (getActivity() != null) {
            LayoutParams layoutParams = null;
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.b3b, null);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(acti…suggest_tab_dialog, null)");
            View findViewById = inflate.findViewById(R.id.f4q);
            C52711k.m112236a((Object) findViewById, "dialogView.findViewById(R.id.tv_suggest)");
            DmtTextView dmtTextView = (DmtTextView) findViewById;
            dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
            dmtTextView.setHighlightColor(getResources().getColor(R.color.a8w));
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            Activity activity2 = activity;
            C52711k.m112240b(activity2, "context");
            C52711k.m112240b(inflate, "view");
            Dialog dialog = new Dialog(activity2, R.style.a4i);
            dialog.setCancelable(true);
            dialog.setContentView(inflate);
            WindowManager windowManager = activity2.getWindowManager();
            if (windowManager != null) {
                display = windowManager.getDefaultDisplay();
            } else {
                display = null;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            }
            if (layoutParams != null) {
                layoutParams.x = 0;
            }
            if (layoutParams != null) {
                layoutParams.gravity = 80;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.a4g;
            }
            Point point = new Point();
            if (display != null) {
                display.getSize(point);
            }
            if (layoutParams != null) {
                layoutParams.width = point.x;
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
            dialog.setCanceledOnTouchOutside(true);
            String string = getResources().getString(R.string.hl3);
            String string2 = getResources().getString(R.string.hl2, new Object[]{string});
            C52711k.m112236a((Object) string2, "hintContent");
            CharSequence charSequence = string2;
            C52711k.m112236a((Object) string, "suggestReason");
            int a = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
            int length = string.length() + a;
            SpannableString spannableString = new SpannableString(charSequence);
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(string) && a >= 0) {
                spannableString.setSpan(new C38312o(dialog, this), a, length, 34);
                spannableString.setSpan(new StyleSpan(1), a, length, 34);
            }
            dmtTextView.setText(spannableString);
            dialog.show();
        }
        C26890h.m65011a("click_suggested_account_information", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("tab_name", mo78259j()).f61491a);
    }

    public final void onRefresh() {
        if (isViewValid()) {
            if (C38455d.m85779a()) {
                this.f97512v.set(0);
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
                C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
                swipeRefreshLayout.setRefreshing(false);
                m85571u();
                return;
            }
            if (C38326d.m85622a(getActivity())) {
                this.f97513w = false;
                C38258e eVar = this.f97497b;
                if (eVar == null) {
                    C52711k.m112237a("mAdapter");
                }
                if (eVar.getItemCount() == 0) {
                    ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19212f();
                }
                C38258e eVar2 = this.f97497b;
                if (eVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar2.f97389b = C38046d.m85098a(this.f97510t);
                if (C36782d.m82775a().mo75940c(61) > 0) {
                    C38258e eVar3 = this.f97497b;
                    if (eVar3 == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    eVar3.f97389b++;
                }
                if (this.f97510t == 36) {
                    this.f97512v.set(2);
                    RecommendAvatarsModel recommendAvatarsModel = this.f97506p;
                    if (recommendAvatarsModel == null) {
                        C52711k.m112237a("mRecommendAvatarsModel");
                    }
                    recommendAvatarsModel.startFetch();
                    if (!C38455d.m85779a() && C10181b.m20511a().mo18172a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", 31744, false)) {
                        TutorialVideoViewModel tutorialVideoViewModel = this.f97507q;
                        if (tutorialVideoViewModel == null) {
                            C52711k.m112237a("mTutorialVideoModel");
                        }
                        tutorialVideoViewModel.mo78321a(1);
                    }
                    m85562l().mo78274e();
                } else {
                    this.f97512v.set(1);
                }
                this.f97516z = false;
                this.f97515y = new ArrayList();
                this.f97493A = false;
                this.f97494B = false;
                this.f97495C = false;
                m85563m().mo44934a_(Integer.valueOf(1), Integer.valueOf(this.f97510t), null);
                m85556b(this.f97510t);
                if (MTNotificationTabMergeExperiment.m85061a()) {
                    C47718bf.m103288a(new C38041h(6, 0));
                }
            } else {
                this.f97512v.set(0);
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                C10691a.m21542b((Context) activity, (int) R.string.cg1).mo19066a();
                C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C38311n<TResult,TContinuationResult>(this), C0013i.f25b);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ C38258e m85553a(C38297c cVar) {
        C38258e eVar = cVar.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        return eVar;
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.mo54793i();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f97505o = new AnalysisStayTimeFragmentComponent(this, true);
    }

    /* renamed from: a */
    private static void m85555a(View view) {
        int b = (int) C9432q.m18687b(view.getContext(), 5.0f);
        float f = (float) b;
        C38437f.m85755a(view, b, b, f, f);
    }

    /* renamed from: c */
    private final List<MusNotice> m85558c(List<? extends MusNotice> list) {
        List<MusNotice> arrayList = new ArrayList<>();
        if (this.f97515y != null) {
            List<MusNotice> list2 = this.f97515y;
            if (list2 == null) {
                C52711k.m112234a();
            }
            arrayList.addAll(list2);
        }
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: b */
    private final void m85557b(boolean z) {
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        C38142v vVar = (C38142v) C52786h.m112349d(C52786h.m112340a(C52786h.m112351e(C52575l.m112148k(C52753d.m112320b(0, eVar.getItemCount())), new C38314q(this)), (C52671b<? super T, Boolean>) C38313p.INSTANCE));
        if (vVar != null) {
            if (z) {
                vVar.mo78115e();
            } else {
                vVar.mo78114d();
            }
        }
    }

    /* renamed from: c */
    private final void m85560c(boolean z) {
        if (C38455d.m85779a() || !z) {
            ImageView imageView = (ImageView) mo78256a((int) R.id.ef7);
            C52711k.m112236a((Object) imageView, "iv_message_dot");
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) mo78256a((int) R.id.ef7);
        C52711k.m112236a((Object) imageView2, "iv_message_dot");
        imageView2.setVisibility(0);
    }

    /* renamed from: b */
    private final void m85556b(int i) {
        if (i == 2) {
            C38046d.m85103c(2);
        } else if (i == 26) {
            C38046d.m85103c(6, 14, 26);
        } else if (i != 36) {
            C38046d.m85103c(i);
        } else {
            this.f97509s = C38046d.m85098a(12);
            C38046d.m85103c(7, 3, 6, 9, 2, 43, 21, 14, 12, 13, 47, 62, 46, 37, 26, 1000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (com.p683ss.android.ugc.aweme.notice.api.C38046d.m85102b(101) != false) goto L_0x003d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m85561d(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x001a
            r4.m85566p()
            return
        L_0x001a:
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 99
            r3 = 0
            r1[r3] = r2
            boolean r1 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85102b(r1)
            if (r1 == 0) goto L_0x0029
            return
        L_0x0029:
            if (r5 != 0) goto L_0x0046
            boolean r1 = m85568r()
            if (r1 != 0) goto L_0x003d
            int[] r0 = new int[r0]
            r1 = 101(0x65, float:1.42E-43)
            r0[r3] = r1
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85102b(r0)
            if (r0 == 0) goto L_0x0046
        L_0x003d:
            r5 = 4
            java.lang.String r0 = "DmHelper"
            java.lang.String r1 = "handleTvMessageDot return cause NOTIFICATION_IM_NOTICE_DOT here"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r5, r0, r1)
            return
        L_0x0046:
            r4.m85560c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.C38297c.m85561d(boolean):void");
    }

    /* renamed from: a */
    public final void mo78243a(C38092f fVar) {
        C52711k.m112240b(fVar, "struct");
        this.f97510t = fVar.f96902a;
        m85564n().f97569a = this.f97510t;
        C38258e eVar = this.f97497b;
        if (eVar == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar.mo78236c(this.f97510t);
        if (this.f97510t == 36) {
            DmtTextView dmtTextView = (DmtTextView) mo78256a((int) R.id.f2i);
            C52711k.m112236a((Object) dmtTextView, "tv_group_title");
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            dmtTextView.setText(context.getString(R.string.cj4));
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) mo78256a((int) R.id.f2i);
            C52711k.m112236a((Object) dmtTextView2, "tv_group_title");
            Context context2 = getContext();
            if (context2 == null) {
                C52711k.m112234a();
            }
            dmtTextView2.setText(context2.getString(fVar.f96903b));
        }
        m85554a(fVar.f96905d, fVar.f96906e, fVar.f96907f);
        m85565o();
        C38417a aVar = this.f97498c;
        if (aVar != null) {
            aVar.dismiss();
        }
        m85572v();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isViewValid()) {
            if (!z) {
                C38258e eVar = this.f97497b;
                if (eVar == null) {
                    C52711k.m112237a("mAdapter");
                }
                if (!C9376b.m18558a((Collection<T>) eVar.mo50673a())) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
                    C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
                    if (!swipeRefreshLayout.mRefreshing) {
                        onRefresh();
                    }
                }
            }
            mo78257h();
            m85557b(!z);
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f97505o;
            if (analysisStayTimeFragmentComponent == null) {
                C52711k.m112237a("mStayTimeFragmentComponent");
            }
            analysisStayTimeFragmentComponent.mo78345a(z);
            if (!z && C38206a.f97273b.getEnablePushGuide() != 0) {
                C37920f fVar = this.f97514x;
                if (fVar != null) {
                    fVar.mo77382a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != 101) goto L_0x007c;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNotificationIndicatorEvent(com.p683ss.android.ugc.aweme.notice.api.bean.C38041h r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            boolean r0 = r3.isViewValid()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            int r0 = r4.f96815a
            r1 = 11
            if (r0 == r1) goto L_0x0057
            r1 = 99
            if (r0 == r1) goto L_0x001b
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L_0x0057
            goto L_0x007c
        L_0x001b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UnReadCountMonitor MusNewNotification receive IM: "
            r0.<init>(r1)
            int r1 = r4.f96816b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
            int r0 = r4.f96815a
            int r4 = r4.f96816b
            boolean r1 = r3.isViewValid()
            if (r1 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            boolean r1 = r1.isLogin()
            if (r1 != 0) goto L_0x004b
            r3.m85566p()
            goto L_0x007c
        L_0x004b:
            if (r4 >= 0) goto L_0x0050
            r3.m85566p()
        L_0x0050:
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r0, r4)
            r3.m85559c(r4)
            goto L_0x007c
        L_0x0057:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UnReadCountMonitor MusNewNotification receive IM DOT: "
            r0.<init>(r1)
            int r1 = r4.f96816b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
            int r0 = r4.f96815a
            int r1 = r4.f96816b
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r0, r1)
            int r4 = r4.f96816b
            r0 = -1
            if (r4 == r0) goto L_0x0078
            r4 = 1
            goto L_0x0079
        L_0x0078:
            r4 = 0
        L_0x0079:
            r3.m85561d(r4)
        L_0x007c:
            r3.mo78257h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.C38297c.onNotificationIndicatorEvent(com.ss.android.ugc.aweme.notice.api.bean.h):void");
    }

    /* renamed from: c */
    private final void m85559c(int i) {
        String valueOf;
        int i2;
        if (i <= 0) {
            DmtTextView dmtTextView = (DmtTextView) mo78256a((int) R.id.f3b);
            C52711k.m112236a((Object) dmtTextView, "tv_message_count");
            dmtTextView.setVisibility(8);
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) mo78256a((int) R.id.f3b);
            C52711k.m112236a((Object) dmtTextView2, "tv_message_count");
            if (i > 99) {
                valueOf = this.f97511u;
            } else {
                valueOf = String.valueOf(i);
            }
            dmtTextView2.setText(valueOf);
            if (!C41050a.m90718b() || C38455d.m85779a()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            ImageView imageView = (ImageView) mo78256a((int) R.id.f3a);
            C52711k.m112236a((Object) imageView, "tv_message_box");
            imageView.setVisibility(i2);
            DmtTextView dmtTextView3 = (DmtTextView) mo78256a((int) R.id.f3b);
            C52711k.m112236a((Object) dmtTextView3, "tv_message_count");
            dmtTextView3.setVisibility(i2);
            m85560c(false);
        }
        StringBuilder sb = new StringBuilder("UnReadCountMonitor MusNewNotification setTvMessageCount: ");
        sb.append(i);
        C32458a.m75144a(sb.toString());
        DmtTextView dmtTextView4 = (DmtTextView) mo78256a((int) R.id.f3b);
        C52711k.m112236a((Object) dmtTextView4, "tv_message_count");
        m85555a((View) dmtTextView4);
        ImageView imageView2 = (ImageView) mo78256a((int) R.id.f3a);
        C52711k.m112236a((Object) imageView2, "tv_message_box");
        m85555a((View) imageView2);
    }

    /* renamed from: a */
    public final void mo60634a(RecommendList recommendList) {
        boolean z;
        boolean z2;
        if (isViewValid()) {
            List<MusNotice> arrayList = new ArrayList<>();
            if (recommendList == null || C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
                z = false;
            } else {
                z = recommendList.hasMore();
                arrayList.add(new C38178a(2000, null));
                for (User aVar : recommendList.getUserList()) {
                    arrayList.add(new C38178a(2001, aVar));
                }
            }
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.f97397j = arrayList;
            if (this.f97493A) {
                Collection collection = this.f97515y;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList.isEmpty()) {
                        m85567q();
                        return;
                    }
                    List<MusNotice> list = this.f97515y;
                    if (list != null) {
                        list.add(new C38178a(2003, null));
                    }
                }
            }
            if (!z) {
                m85569s();
            } else {
                C38258e eVar2 = this.f97497b;
                if (eVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar2.ao_();
                RecyclerView recyclerView = (RecyclerView) mo78256a((int) R.id.cg7);
                C52711k.m112236a((Object) recyclerView, "rv_list");
                recyclerView.getVisibility();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
            C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            if (!this.f97516z) {
                C38258e eVar3 = this.f97497b;
                if (eVar3 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar3.mo50303a(m85558c(arrayList));
                ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
                ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
                DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
                C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
                dmtStatusView.setVisibility(8);
                ((RecyclerView) mo78256a((int) R.id.cg7)).mo4814b(0);
            } else if (this.f97495C) {
                C38258e eVar4 = this.f97497b;
                if (eVar4 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar4.mo78238e(m85558c(arrayList));
            } else {
                C38258e eVar5 = this.f97497b;
                if (eVar5 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar5.mo50304b(m85558c(arrayList));
            }
        }
    }

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
        if (isViewValid()) {
            this.f97516z = true;
            List<MusNotice> arrayList = new ArrayList<>();
            boolean z = false;
            if (recommendList != null && !C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
                z = recommendList.hasMore();
                arrayList.add(new C38178a(2000, null));
                for (User aVar : recommendList.getUserList()) {
                    arrayList.add(new C38178a(2001, aVar));
                }
            }
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.f97397j = arrayList;
            if (!z) {
                m85569s();
            } else {
                C38258e eVar2 = this.f97497b;
                if (eVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar2.ao_();
            }
            if (this.f97495C) {
                C38258e eVar3 = this.f97497b;
                if (eVar3 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar3.mo78238e(m85558c(arrayList));
                return;
            }
            C38258e eVar4 = this.f97497b;
            if (eVar4 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar4.mo50304b(m85558c(arrayList));
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.f97513w = true;
            this.f97512v.decrementAndGet();
            C38460a.m85792a(getContext(), exc);
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            if (eVar.f70699x) {
                C38258e eVar2 = this.f97497b;
                if (eVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar2.mo54798c(false);
                C38258e eVar3 = this.f97497b;
                if (eVar3 == null) {
                    C52711k.m112237a("mAdapter");
                }
                eVar3.notifyDataSetChanged();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
            C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
            DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
            C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
            dmtStatusView.setVisibility(8);
            ((RecyclerView) mo78256a((int) R.id.cg7)).mo4814b(0);
            mo78258i();
        }
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        boolean z;
        m85569s();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78256a((int) R.id.ewj);
        C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        if (this.f97516z) {
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.ao_();
            RecyclerView recyclerView = (RecyclerView) mo78256a((int) R.id.cg7);
            C52711k.m112236a((Object) recyclerView, "rv_list");
            recyclerView.getVisibility();
            C38258e eVar2 = this.f97497b;
            if (eVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar2.mo50304b(this.f97515y);
            return;
        }
        Collection collection = this.f97515y;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m85569s();
            return;
        }
        C38258e eVar3 = this.f97497b;
        if (eVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        eVar3.mo50303a(this.f97515y);
        ((DmtStatusView) mo78256a((int) R.id.eyy)).mo19209d();
        ((DmtStatusView) mo78256a((int) R.id.eyz)).mo19209d();
        DmtStatusView dmtStatusView = (DmtStatusView) mo78256a((int) R.id.eyz);
        C52711k.m112236a((Object) dmtStatusView, "sv_status_view_top");
        dmtStatusView.setVisibility(8);
        ((RecyclerView) mo78256a((int) R.id.cg7)).mo4814b(0);
    }

    /* renamed from: b */
    public final void mo78240b(List<MusNotice> list) {
        if (m85573w()) {
            this.f97495C = true;
            if (this.f97494B) {
                C39993z zVar = this.f97504n;
                if (zVar != null) {
                    zVar.mo81925e();
                }
                C39993z zVar2 = this.f97504n;
                if (zVar2 != null) {
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    zVar2.mo81920a(20, g.getCurUserId(), 4, C47945d.m103731a(), (String) null, C47945d.m103733b(), "0");
                }
                this.f97515y = list;
            } else {
                ar_();
            }
            C26890h.m65011a("click_see_all_activities", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("tab_name", mo78259j()).f61491a);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C38432d.m85746b(view.getContext());
        if (VERSION.SDK_INT >= 19) {
            View a = mo78256a((int) R.id.f69);
            C52711k.m112236a((Object) a, "v_status_bar");
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            layoutParams.height = C11065a.m22390a((Context) activity);
        }
        this.f97508r = new FixedLinearlayoutManager(getContext());
        RecyclerView recyclerView = (RecyclerView) mo78256a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        LinearLayoutManager linearLayoutManager = this.f97508r;
        if (linearLayoutManager == null) {
            C52711k.m112237a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) mo78256a((int) R.id.cg7)).mo4801a((C1340m) new C32461a(getContext()));
        C38422i.m85735a((RecyclerView) mo78256a((int) R.id.cg7), (SwipeRefreshLayout) mo78256a((int) R.id.ewj));
        ((SwipeRefreshLayout) mo78256a((int) R.id.ewj)).setOnRefreshListener(this);
        int a2 = C38046d.m85098a(99);
        if (a2 > 0 || !C41050a.m90718b()) {
            m85559c(a2);
        } else if (m85568r()) {
            m85560c(true);
        } else {
            if (C38046d.m85102b(101)) {
                m85560c(true);
            }
        }
        if (C38455d.m85779a()) {
            DmtTextView dmtTextView = (DmtTextView) mo78256a((int) R.id.f3b);
            C52711k.m112236a((Object) dmtTextView, "tv_message_count");
            dmtTextView.setVisibility(8);
            ImageView imageView = (ImageView) mo78256a((int) R.id.f3a);
            C52711k.m112236a((Object) imageView, "tv_message_box");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) mo78256a((int) R.id.eet);
            C52711k.m112236a((Object) imageView2, "iv_filter_arrow");
            imageView2.setVisibility(8);
        }
        ((DmtTextView) mo78256a((int) R.id.f3b)).setOnClickListener(new C38306i(this));
        C38446k.m85764a((DmtTextView) mo78256a((int) R.id.f3b));
        ((ImageView) mo78256a((int) R.id.f3a)).setOnClickListener(new C38307j(this));
        C38446k.m85764a((ImageView) mo78256a((int) R.id.f3a));
        if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.IM)) {
            ImageView imageView3 = (ImageView) mo78256a((int) R.id.f3a);
            C52711k.m112236a((Object) imageView3, "tv_message_box");
            imageView3.setVisibility(8);
        }
        if (!C38455d.m85779a()) {
            C38446k.m85764a((ConstraintLayout) mo78256a((int) R.id.b_d));
            ((ConstraintLayout) mo78256a((int) R.id.b_d)).setOnClickListener(new C38299b(this));
        }
        ((RelativeLayout) mo78256a((int) R.id.et4)).setOnClickListener(C38300c.f97518a);
        m85554a((int) R.string.cj4, (int) R.string.cjr, (int) R.drawable.cl7);
        ((DmtStatusView) mo78256a((int) R.id.eyz)).setBuilder(C10719a.m21676a((Context) getActivity()));
        m85563m().mo54799a(m85564n());
        m85563m().mo54800a((C26877c<?>) this);
        m85562l().mo54799a(new C38318a());
        m85562l().mo54800a(this);
        this.f97504n = new C39993z(new RecommendCommonUserModel(), this);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity2, "activity!!");
        Intent intent = activity2.getIntent();
        if (intent != null) {
            if (intent.getBooleanExtra("is_from_push", false)) {
                str = "push";
            } else {
                str = "message";
            }
            Fragment fragment = this;
            this.f97497b = new C38258e(fragment, str, new C38301d(this));
            C38258e eVar = this.f97497b;
            if (eVar == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar.mo54788a((C26846a) this);
            C38258e eVar2 = this.f97497b;
            if (eVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar2.mo54798c(true);
            C38258e eVar3 = this.f97497b;
            if (eVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            eVar3.mo54792d(0);
            m85569s();
            RecyclerView recyclerView2 = (RecyclerView) mo78256a((int) R.id.cg7);
            C52711k.m112236a((Object) recyclerView2, "rv_list");
            C38258e eVar4 = this.f97497b;
            if (eVar4 == null) {
                C52711k.m112237a("mAdapter");
            }
            recyclerView2.setAdapter(eVar4);
            RecyclerView recyclerView3 = (RecyclerView) mo78256a((int) R.id.cg7);
            C52711k.m112236a((Object) recyclerView3, "rv_list");
            C26052as.m63104a().startRecyclerViewFpsMonitor("mus_new_notification", recyclerView3);
            C0209x a3 = C0214z.m438a(fragment).mo359a(RecommendAvatarsModel.class);
            C52711k.m112236a((Object) a3, "ViewModelProviders.of(th…AvatarsModel::class.java)");
            this.f97506p = (RecommendAvatarsModel) a3;
            RecommendAvatarsModel recommendAvatarsModel = this.f97506p;
            if (recommendAvatarsModel == null) {
                C52711k.m112237a("mRecommendAvatarsModel");
            }
            C0184k kVar = this;
            recommendAvatarsModel.liveData.observe(kVar, new C38302e(this));
            C0209x a4 = C0214z.m438a(fragment).mo359a(TutorialVideoViewModel.class);
            C52711k.m112236a((Object) a4, "ViewModelProviders.of(th…deoViewModel::class.java)");
            this.f97507q = (TutorialVideoViewModel) a4;
            TutorialVideoViewModel tutorialVideoViewModel = this.f97507q;
            if (tutorialVideoViewModel == null) {
                C52711k.m112237a("mTutorialVideoModel");
            }
            tutorialVideoViewModel.f97795a.observe(kVar, new C38303f(this));
            C38419h hVar = new C38419h();
            RecyclerView recyclerView4 = (RecyclerView) mo78256a((int) R.id.cg7);
            C52711k.m112236a((Object) recyclerView4, "rv_list");
            LinearLayoutManager linearLayoutManager2 = this.f97508r;
            if (linearLayoutManager2 == null) {
                C52711k.m112237a("mLinearLayoutManager");
            }
            C38420a gVar = new C38304g(this);
            C52711k.m112240b(recyclerView4, "recyclerView");
            C52711k.m112240b(linearLayoutManager2, "layoutManager");
            C52711k.m112240b(gVar, "listener");
            hVar.f97783a = recyclerView4;
            hVar.f97784b = linearLayoutManager2;
            hVar.f97789g = gVar;
            RecyclerView recyclerView5 = hVar.f97783a;
            if (recyclerView5 == null) {
                C52711k.m112237a("mRecyclerView");
            }
            recyclerView5.mo4801a((C1340m) new C38421b(hVar));
            ((NoticeView) mo78256a((int) R.id.e_z)).setIconImage((int) R.drawable.ckm);
            SpannableString spannableString = new SpannableString(C23723j.m58219b(R.string.br0));
            String b = C23723j.m58219b(R.string.br1);
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(" ");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            if (getContext() != null) {
                Context context = getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "getContext()!!");
                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.c)), 0, spannableString.length(), 34);
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                spannableStringBuilder.append(spannableString);
            }
            ((NoticeView) mo78256a((int) R.id.e_z)).setTitleText((CharSequence) spannableStringBuilder);
            INoticeBridgeService createINoticeBridgeServicebyMonsterPlugin = I18nNoticeBridgeService.createINoticeBridgeServicebyMonsterPlugin();
            NoticeView noticeView = (NoticeView) mo78256a((int) R.id.e_z);
            C52711k.m112236a((Object) noticeView, "go_enable_push_settings_guide");
            createINoticeBridgeServicebyMonsterPlugin.recordNoticeView(noticeView);
            this.f97514x = new C37920f((NoticeView) mo78256a((int) R.id.e_z), new C38305h());
            C37920f fVar = this.f97514x;
            if (fVar != null) {
                fVar.f96571f = C37922a.Message;
            }
            if (C38206a.f97273b.getEnablePushGuide() != 0) {
                C37920f fVar2 = this.f97514x;
                if (fVar2 != null) {
                    fVar2.mo77382a();
                }
            }
            if (C38046d.f96822b.mo77575c().isChatFunOfflineUnder16()) {
                RelativeLayout relativeLayout = (RelativeLayout) mo78256a((int) R.id.esh);
                C52711k.m112236a((Object) relativeLayout, "right_top_box");
                relativeLayout.setVisibility(8);
            }
            C38258e eVar5 = this.f97497b;
            if (eVar5 == null) {
                C52711k.m112237a("mAdapter");
            }
            C38368a aVar = this;
            C52711k.m112240b(aVar, "iconListener");
            eVar5.f97391d = aVar;
            C38258e eVar6 = this.f97497b;
            if (eVar6 == null) {
                C52711k.m112237a("mAdapter");
            }
            C23452y<User> yVar = this;
            C52711k.m112240b(yVar, "recommendListener");
            eVar6.f97390c = yVar;
            C38258e eVar7 = this.f97497b;
            if (eVar7 == null) {
                C52711k.m112237a("mAdapter");
            }
            C38259a aVar2 = this;
            C52711k.m112240b(aVar2, "listener");
            eVar7.f97396i = aVar2;
        }
        onRefresh();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024) {
            this.f97512v.incrementAndGet();
            m85562l().mo78274e();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.b2n, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…on_new, container, false)");
        inflate.setBackgroundColor(getResources().getColor(R.color.as0));
        return inflate;
    }

    /* renamed from: a */
    private final void m85554a(int i, int i2, int i3) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        MtEmptyView a = MtEmptyView.m21697a((Context) activity);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C52711k.m112234a();
        }
        a.setStatus(new C10723a(activity2).mo19277a(i3).mo19280b(i).mo19282c(i2).f28711a);
        FragmentActivity activity3 = getActivity();
        if (activity3 == null) {
            C52711k.m112234a();
        }
        C10722c cVar = new C10723a(activity3).mo19280b((int) R.string.goh).mo19281b("").f28711a;
        C10719a a2 = C10719a.m21676a((Context) getActivity()).mo19223a().mo19226a(R.drawable.dgk, R.string.f5o, R.string.f5k, R.string.f5u, new C38315r(this));
        if (!C38455d.m85779a()) {
            a2.mo19231b((View) a);
        } else {
            a2.mo19229a(cVar);
        }
        ((DmtStatusView) mo78256a((int) R.id.eyy)).setBuilder(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        if (r1 == null) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo48614a(int r4, java.lang.Object r5, int r6, android.view.View r7, java.lang.String r8) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
            boolean r6 = r3.isViewValid()
            if (r6 == 0) goto L_0x025e
            int r6 = com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a.m75531a()
            r7 = 0
            r8 = 1
            if (r4 != r6) goto L_0x00d5
            if (r5 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.router.w r4 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            android.support.v4.app.FragmentActivity r6 = r3.getActivity()
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://user/profile/"
            r0.<init>(r1)
            java.lang.String r1 = r5.getUid()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.router.y r0 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r0)
            java.lang.String r1 = "sec_user_id"
            java.lang.String r2 = r5.getSecUid()
            com.ss.android.ugc.aweme.router.y r0 = r0.mo83870a(r1, r2)
            java.lang.String r1 = "from_recommend_card"
            com.ss.android.ugc.aweme.router.y r0 = r0.mo83868a(r1, r8)
            java.lang.String r1 = "need_track_compare_recommend_reason"
            com.ss.android.ugc.aweme.router.y r8 = r0.mo83868a(r1, r8)
            java.lang.String r0 = "previous_recommend_reason"
            java.lang.String r1 = r5.getRecommendReason()
            com.ss.android.ugc.aweme.router.y r8 = r8.mo83870a(r0, r1)
            java.lang.String r0 = "recommend_from_type"
            java.lang.String r1 = "list"
            com.ss.android.ugc.aweme.router.y r8 = r8.mo83870a(r0, r1)
            java.lang.String r0 = "enter_from_request_id"
            com.ss.android.ugc.aweme.profile.presenter.z r1 = r3.f97504n
            if (r1 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.friends.model.RecommendList r1 = r1.mo81924d()
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r1.getRid()
            if (r1 != 0) goto L_0x006e
        L_0x006c:
            java.lang.String r1 = ""
        L_0x006e:
            com.ss.android.ugc.aweme.router.y r8 = r8.mo83870a(r0, r1)
            java.lang.String r8 = r8.mo83871a()
            r4.mo83858a(r6, r8)
            java.lang.String r4 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "enter_from"
            java.lang.String r0 = "notification_page"
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "rec_type"
            java.lang.String r0 = r5.getRecType()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "to_user_id"
            java.lang.String r0 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "impr_order"
            com.ss.android.ugc.aweme.profile.presenter.z r0 = r3.f97504n
            if (r0 == 0) goto L_0x00ad
            java.lang.String r7 = r5.getUid()
            int r7 = r0.mo81913a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x00ad:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47828a(r8, r7)
            java.lang.String r7 = "tab_name"
            java.lang.String r8 = r3.mo78259j()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "req_id"
            java.lang.String r8 = r5.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "impr_id"
            java.lang.String r5 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r7, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r5)
        L_0x00d4:
            return
        L_0x00d5:
            int r6 = com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a.m75535e()
            r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
            if (r4 != r6) goto L_0x015f
            boolean r4 = r3.isViewValid()
            if (r4 == 0) goto L_0x015e
            android.content.Context r4 = r3.getContext()
            boolean r4 = com.p683ss.android.ugc.aweme.notification.newstyle.C38326d.m85622a(r4)
            if (r4 != 0) goto L_0x00fb
            android.content.Context r4 = r3.getContext()
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r4, r0)
            r4.mo19066a()
            goto L_0x025e
        L_0x00fb:
            if (r5 == 0) goto L_0x015e
            java.lang.String r4 = "single"
            int r6 = r5.getFollowerStatus()
            if (r6 != r8) goto L_0x0107
            java.lang.String r4 = "mutual"
        L_0x0107:
            java.lang.String r6 = "follow"
            com.ss.android.ugc.aweme.app.f.d r8 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "notification_page"
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r0, r1)
            java.lang.String r0 = "rec_type"
            java.lang.String r1 = r5.getRecType()
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r0, r1)
            java.lang.String r0 = "to_user_id"
            java.lang.String r1 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r0, r1)
            java.lang.String r0 = "impr_order"
            com.ss.android.ugc.aweme.profile.presenter.z r1 = r3.f97504n
            if (r1 == 0) goto L_0x013b
            java.lang.String r7 = r5.getUid()
            int r7 = r1.mo81913a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x013b:
            com.ss.android.ugc.aweme.app.f.d r7 = r8.mo47828a(r0, r7)
            java.lang.String r8 = "tab_name"
            java.lang.String r0 = r3.mo78259j()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r0)
            java.lang.String r8 = "req_id"
            java.lang.String r5 = r5.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r5 = r7.mo47829a(r8, r5)
            java.lang.String r7 = "follow_type"
            com.ss.android.ugc.aweme.app.f.d r4 = r5.mo47829a(r7, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r4)
        L_0x015e:
            return
        L_0x015f:
            int r6 = com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a.m75533c()
            if (r4 != r6) goto L_0x01f4
            boolean r4 = r3.isViewValid()
            if (r4 == 0) goto L_0x01f3
            android.content.Context r4 = r3.getContext()
            boolean r4 = com.p683ss.android.ugc.aweme.notification.newstyle.C38326d.m85622a(r4)
            if (r4 != 0) goto L_0x0182
            android.content.Context r4 = r3.getContext()
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r4, r0)
            r4.mo19066a()
            goto L_0x025e
        L_0x0182:
            if (r5 == 0) goto L_0x01f3
            com.ss.android.ugc.aweme.notification.newstyle.a.e r4 = r3.f97497b
            if (r4 != 0) goto L_0x018d
            java.lang.String r6 = "mAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x018d:
            r4.mo78234a(r5)
            com.ss.android.ugc.aweme.friends.service.c r4 = com.p683ss.android.ugc.aweme.friends.service.C32616c.f84865a
            java.lang.String r6 = r5.getUid()
            java.lang.String r8 = "user.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            java.lang.String r8 = r5.getSecUid()
            r4.dislikeRecommendUser(r6, r8)
            java.lang.String r4 = "close_recommend_user_cell"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "enter_from"
            java.lang.String r0 = "notification_page"
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "rec_type"
            java.lang.String r0 = r5.getRecType()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "rec_uid"
            java.lang.String r0 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "impr_order"
            com.ss.android.ugc.aweme.profile.presenter.z r0 = r3.f97504n
            if (r0 == 0) goto L_0x01d6
            java.lang.String r7 = r5.getUid()
            int r7 = r0.mo81913a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x01d6:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47828a(r8, r7)
            java.lang.String r7 = "tab_name"
            java.lang.String r8 = r3.mo78259j()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "req_id"
            java.lang.String r5 = r5.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r7, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r5)
        L_0x01f3:
            return
        L_0x01f4:
            int r6 = com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a.m75534d()
            if (r4 != r6) goto L_0x025e
            if (r5 == 0) goto L_0x025e
            boolean r4 = r5.isShould_write_impr()
            if (r4 == 0) goto L_0x020d
            com.ss.android.ugc.aweme.newfollow.util.g r4 = com.p683ss.android.ugc.aweme.newfollow.util.C37940g.m84832a()
            java.lang.String r6 = r5.getUid()
            r4.mo77415a(r8, r6)
        L_0x020d:
            java.lang.String r4 = "show_recommend_user_cell"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "enter_from"
            java.lang.String r0 = "notification_page"
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "rec_type"
            java.lang.String r0 = r5.getRecType()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "rec_uid"
            java.lang.String r0 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r0)
            java.lang.String r8 = "impr_order"
            com.ss.android.ugc.aweme.profile.presenter.z r0 = r3.f97504n
            if (r0 == 0) goto L_0x0241
            java.lang.String r7 = r5.getUid()
            int r7 = r0.mo81913a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x0241:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47828a(r8, r7)
            java.lang.String r7 = "tab_name"
            java.lang.String r8 = r3.mo78259j()
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "req_id"
            java.lang.String r5 = r5.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r7, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r5)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.C38297c.mo48614a(int, java.lang.Object, int, android.view.View, java.lang.String):void");
    }
}
