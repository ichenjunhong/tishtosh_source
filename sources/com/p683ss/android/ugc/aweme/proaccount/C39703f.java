package com.p683ss.android.ugc.aweme.proaccount;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.DmtRtlViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.ViewPagerIndicatorLayout;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.proaccount.f */
public final class C39703f extends C23526a {

    /* renamed from: m */
    public static final C39704a f101324m = new C39704a(null);

    /* renamed from: a */
    C39705b f101325a;

    /* renamed from: b */
    int f101326b;

    /* renamed from: c */
    public long f101327c = -1;

    /* renamed from: d */
    long f101328d = -1;

    /* renamed from: e */
    public int f101329e;

    /* renamed from: j */
    public long f101330j;

    /* renamed from: k */
    public String f101331k = "";

    /* renamed from: l */
    public Boolean f101332l = Boolean.valueOf(false);

    /* renamed from: n */
    private C39711h<C39709g> f101333n;

    /* renamed from: o */
    private ProAccountEnableDetailInfo f101334o;

    /* renamed from: p */
    private HashMap f101335p;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.f$a */
    public static final class C39704a {
        private C39704a() {
        }

        public /* synthetic */ C39704a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.f$b */
    public interface C39705b {
        /* renamed from: c */
        void mo80754c();
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.f$c */
    static final class C39706c extends C52712l implements C52671b<WelcomePageTextStruct, Boolean> {

        /* renamed from: a */
        public static final C39706c f101336a = new C39706c();

        C39706c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m88412a((WelcomePageTextStruct) obj));
        }

        /* renamed from: a */
        private static boolean m88412a(WelcomePageTextStruct welcomePageTextStruct) {
            C52711k.m112240b(welcomePageTextStruct, "it");
            try {
                if (welcomePageTextStruct.getDescription() == null || welcomePageTextStruct.getImageUrl() == null || welcomePageTextStruct.getTitle() == null) {
                    return false;
                }
                return true;
            } catch (C10174a unused) {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.f$d */
    public static final class C39707d implements C0997e {

        /* renamed from: a */
        final /* synthetic */ C39703f f101337a;

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C39707d(C39703f fVar) {
            this.f101337a = fVar;
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 1) {
                this.f101337a.f101331k = "scroll";
            }
        }

        public final void onPageSelected(int i) {
            Boolean bool = this.f101337a.f101332l;
            if (bool == null) {
                C52711k.m112234a();
            }
            if (!bool.booleanValue()) {
                this.f101337a.f101330j = System.currentTimeMillis() - this.f101337a.f101327c;
                int i2 = this.f101337a.f101329e + 1;
                StringBuilder sb = new StringBuilder("welcome screen");
                sb.append(i2);
                C39703f.m88409a(sb.toString(), this.f101337a.f101330j, this.f101337a.f101331k);
                this.f101337a.f101329e = i;
                this.f101337a.f101327c = System.currentTimeMillis();
            }
            this.f101337a.f101332l = Boolean.valueOf(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.f$e */
    static final class C39708e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39703f f101338a;

        C39708e(C39703f fVar) {
            this.f101338a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39703f fVar = this.f101338a;
            fVar.f101331k = "continue";
            DmtRtlViewPager dmtRtlViewPager = (DmtRtlViewPager) fVar.mo80780a(R.id.duz);
            C52711k.m112236a((Object) dmtRtlViewPager, "welcome_viewpager");
            if (dmtRtlViewPager.getCurrentItem() >= fVar.f101326b - 1) {
                IAccountUserService a = C20902b.m53242a();
                C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                User curUser = a.getCurUser();
                if (curUser != null && !curUser.isSecret()) {
                    C26890h.m65011a("click_welcome_continue", C23089d.m56640a().mo47829a("is_success", "1").mo47827a("duration", System.currentTimeMillis() - fVar.f101328d).f61491a);
                }
                C39705b bVar = fVar.f101325a;
                if (bVar == null) {
                    C52711k.m112237a("mContinueCallBack");
                }
                bVar.mo80754c();
                StringBuilder sb = new StringBuilder("welcome screen");
                sb.append(fVar.f101326b);
                C39703f.m88409a(sb.toString(), System.currentTimeMillis() - fVar.f101327c, fVar.f101331k);
                return;
            }
            DmtRtlViewPager dmtRtlViewPager2 = (DmtRtlViewPager) fVar.mo80780a(R.id.duz);
            DmtRtlViewPager dmtRtlViewPager3 = (DmtRtlViewPager) fVar.mo80780a(R.id.duz);
            C52711k.m112236a((Object) dmtRtlViewPager3, "welcome_viewpager");
            dmtRtlViewPager2.mo2956a(dmtRtlViewPager3.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: a */
    public final View mo80780a(int i) {
        if (this.f101335p == null) {
            this.f101335p = new HashMap();
        }
        View view = (View) this.f101335p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f101335p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f101335p != null) {
            this.f101335p.clear();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f101327c = System.currentTimeMillis();
        this.f101328d = System.currentTimeMillis();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ProWelcomeActivity) activity).f101250a = System.currentTimeMillis();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = b.getProAccountEnableDetailInfo();
            C52711k.m112236a((Object) proAccountEnableDetailInfo, "SettingsReader.get().proAccountEnableDetailInfo");
            this.f101334o = proAccountEnableDetailInfo;
        } catch (C10174a unused) {
        }
        ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = this.f101334o;
        if (proAccountEnableDetailInfo2 == null) {
            C52711k.m112237a("mWelcomePageInfo");
        }
        boolean z = false;
        if (proAccountEnableDetailInfo2 != null && !proAccountEnableDetailInfo2.getWelcomePageList().isEmpty()) {
            C52671b bVar = C39706c.f101336a;
            List welcomePageList = proAccountEnableDetailInfo2.getWelcomePageList();
            C52711k.m112236a((Object) welcomePageList, "welcomePageInfo.welcomePageList");
            Iterable iterable = welcomePageList;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WelcomePageTextStruct welcomePageTextStruct = (WelcomePageTextStruct) it.next();
                    C52711k.m112236a((Object) welcomePageTextStruct, "it");
                    if (!((Boolean) bVar.invoke(welcomePageTextStruct)).booleanValue()) {
                        break;
                    }
                }
            }
            z = true;
        }
        if (z) {
            ProAccountEnableDetailInfo proAccountEnableDetailInfo3 = this.f101334o;
            if (proAccountEnableDetailInfo3 == null) {
                C52711k.m112237a("mWelcomePageInfo");
            }
            list = proAccountEnableDetailInfo3.getWelcomePageList();
            C52711k.m112236a((Object) list, "mWelcomePageInfo.welcomePageList");
            this.f101326b = list.size();
        } else {
            this.f101326b = 2;
            list = new ArrayList();
        }
        C0654k childFragmentManager = getChildFragmentManager();
        C52711k.m112236a((Object) childFragmentManager, "childFragmentManager");
        this.f101333n = new C39711h<>(childFragmentManager, this.f101326b, list);
        DmtRtlViewPager dmtRtlViewPager = (DmtRtlViewPager) mo80780a(R.id.duz);
        C52711k.m112236a((Object) dmtRtlViewPager, "welcome_viewpager");
        C39711h<C39709g> hVar = this.f101333n;
        if (hVar == null) {
            C52711k.m112237a("mAdapter");
        }
        dmtRtlViewPager.setAdapter(hVar);
        ((DmtRtlViewPager) mo80780a(R.id.duz)).mo2957a((C0997e) new C39707d(this));
        ((ViewPagerIndicatorLayout) mo80780a(R.id.duu)).setUpViewPager((DmtRtlViewPager) mo80780a(R.id.duz));
        ((DmtTextView) mo80780a(R.id.duw)).setFontType(C10751d.f28903b);
        ((DmtTextView) mo80780a(R.id.duw)).setOnClickListener(new C39708e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.pc, viewGroup, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Boolean bool;
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            if (intent != null) {
                bool = Boolean.valueOf(intent.getBooleanExtra("BACK_FROM_CATEGORY", false));
            } else {
                bool = null;
            }
            this.f101332l = bool;
        }
    }

    /* renamed from: a */
    public static void m88409a(String str, long j, String str2) {
        C26890h.m65011a("change_screen", C23089d.m56640a().mo47829a("screen", str).mo47829a("duration", String.valueOf(j)).mo47829a("Type", str2).f61491a);
    }
}
