package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.C21042a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.p683ss.android.ugc.aweme.account.utils.C22300g;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity */
public class I18nSignUpActivity extends AmeActivity implements C20977b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f57174a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(I18nSignUpActivity.class), "enterFrom", "getEnterFrom()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(I18nSignUpActivity.class), "enterMethod", "getEnterMethod()Ljava/lang/String;"))};

    /* renamed from: e */
    public static final C21028a f57175e = new C21028a(null);

    /* renamed from: b */
    public boolean f57176b;

    /* renamed from: c */
    public String f57177c;

    /* renamed from: d */
    final C52668f f57178d = C52732g.m112285a(new C21030c(this));

    /* renamed from: f */
    private final C52668f f57179f = C52732g.m112285a(new C21029b(this));

    /* renamed from: g */
    private HashMap f57180g;

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$a */
    public static final class C21028a {
        private C21028a() {
        }

        public /* synthetic */ C21028a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$b */
    static final class C21029b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57181a;

        C21029b(I18nSignUpActivity i18nSignUpActivity) {
            this.f57181a = i18nSignUpActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.f57181a.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("sign_up_data");
                if (bundleExtra != null) {
                    String string = bundleExtra.getString("enter_from");
                    if (string != null) {
                        return string;
                    }
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$c */
    static final class C21030c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57182a;

        C21030c(I18nSignUpActivity i18nSignUpActivity) {
            this.f57182a = i18nSignUpActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.f57182a.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("sign_up_data");
                if (bundleExtra != null) {
                    String string = bundleExtra.getString("enter_method");
                    if (string != null) {
                        return string;
                    }
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$d */
    static final class C21031d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57183a;

        C21031d(I18nSignUpActivity i18nSignUpActivity) {
            this.f57183a = i18nSignUpActivity;
        }

        public final void run() {
            if (TextUtils.equals(C23826bi.m58463d(), this.f57183a.f57177c) && !this.f57183a.f57176b) {
                C23826bi.m58451a(1, 3, (Object) "");
                C23826bi.m58472m();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$e */
    public static final class C21032e extends C21042a {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57184a;

        /* renamed from: b */
        final /* synthetic */ C52725c f57185b;

        /* renamed from: a */
        public final void mo45013a(View view, float f) {
            C52711k.m112240b(view, "p0");
        }

        C21032e(I18nSignUpActivity i18nSignUpActivity, C52725c cVar) {
            this.f57184a = i18nSignUpActivity;
            this.f57185b = cVar;
        }

        /* renamed from: a */
        public final void mo45014a(View view, int i) {
            C52711k.m112240b(view, "p0");
            if (i == 5) {
                this.f57184a.getWindow().setDimAmount(0.0f);
                this.f57184a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$f */
    public static final class C21033f extends C0677p {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57186a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f57187b;

        public final int getCount() {
            return 2;
        }

        /* renamed from: a */
        public final Fragment mo2309a(int i) {
            C21466t tVar = new C21466t();
            this.f57187b.add(tVar);
            Bundle bundle = new Bundle();
            if (i == 0) {
                bundle.putBoolean("view_type", true);
            } else {
                bundle.putBoolean("view_type", false);
            }
            if (this.f57186a.getIntent().getBundleExtra("sign_up_data") != null) {
                bundle.putBundle("sign_up_data", new Bundle(this.f57186a.getIntent().getBundleExtra("sign_up_data")));
            }
            tVar.setArguments(bundle);
            return tVar;
        }

        C21033f(I18nSignUpActivity i18nSignUpActivity, ArrayList arrayList, C0654k kVar) {
            this.f57186a = i18nSignUpActivity;
            this.f57187b = arrayList;
            super(kVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$g */
    public static final class C21034g implements C0997e {

        /* renamed from: a */
        public int f57188a;

        /* renamed from: b */
        public float f57189b;

        /* renamed from: c */
        public int f57190c;

        /* renamed from: d */
        final /* synthetic */ I18nSignUpActivity f57191d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f57192e;

        public final void onPageSelected(int i) {
            int i2 = 1 - i;
            if (i2 >= 0 && i2 < this.f57192e.size()) {
                C21466t tVar = (C21466t) this.f57192e.get(i2);
                if (tVar.isViewValid()) {
                    C21357j jVar = tVar.f58239a;
                    if (jVar != null) {
                        jVar.mo45501a().mo4814b(0);
                    }
                }
            }
        }

        public final void onPageScrollStateChanged(int i) {
            if (this.f57188a == 0 && i == 1) {
                DmtTextView dmtTextView = (DmtTextView) this.f57191d.mo45009b(R.id.d10);
                C52711k.m112236a((Object) dmtTextView, "title_bar");
                this.f57189b = dmtTextView.getAlpha();
            } else if (i == 0) {
                NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) this.f57191d.mo45009b(R.id.ds2);
                C52711k.m112236a((Object) nonSwipeableViewPager, "viewpager");
                if (nonSwipeableViewPager.getCurrentItem() == 0) {
                    DmtTextView dmtTextView2 = (DmtTextView) this.f57191d.mo45009b(R.id.d10);
                    C52711k.m112236a((Object) dmtTextView2, "title_bar");
                    dmtTextView2.setText(this.f57191d.getString(R.string.afc));
                } else {
                    DmtTextView dmtTextView3 = (DmtTextView) this.f57191d.mo45009b(R.id.d10);
                    C52711k.m112236a((Object) dmtTextView3, "title_bar");
                    dmtTextView3.setText(this.f57191d.getString(R.string.adx));
                }
                NonSwipeableViewPager nonSwipeableViewPager2 = (NonSwipeableViewPager) this.f57191d.mo45009b(R.id.ds2);
                C52711k.m112236a((Object) nonSwipeableViewPager2, "viewpager");
                this.f57190c = nonSwipeableViewPager2.getCurrentItem();
            }
            this.f57188a = i;
        }

        C21034g(I18nSignUpActivity i18nSignUpActivity, ArrayList arrayList) {
            this.f57191d = i18nSignUpActivity;
            this.f57192e = arrayList;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f57189b != 0.0f && f != 0.0f) {
                DmtTextView dmtTextView = (DmtTextView) this.f57191d.mo45009b(R.id.d10);
                C52711k.m112236a((Object) dmtTextView, "title_bar");
                float f2 = this.f57189b;
                if (this.f57190c == 0) {
                    f = 1.0f - f;
                }
                dmtTextView.setAlpha(f2 * f);
                View b = this.f57191d.mo45009b(R.id.a6h);
                C52711k.m112236a((Object) b, "divider");
                DmtTextView dmtTextView2 = (DmtTextView) this.f57191d.mo45009b(R.id.d10);
                C52711k.m112236a((Object) dmtTextView2, "title_bar");
                b.setAlpha(dmtTextView2.getAlpha());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$h */
    static final class C21035h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57193a;

        /* renamed from: b */
        final /* synthetic */ C52725c f57194b;

        /* renamed from: c */
        final /* synthetic */ ViewPagerBottomSheetBehavior f57195c;

        C21035h(I18nSignUpActivity i18nSignUpActivity, C52725c cVar, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f57193a = i18nSignUpActivity;
            this.f57194b = cVar;
            this.f57195c = viewPagerBottomSheetBehavior;
        }

        public final void run() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f57193a.mo45009b(R.id.cfc);
            C52711k.m112236a((Object) relativeLayout, "root");
            if (relativeLayout.getHeight() != this.f57194b.element) {
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f57195c;
                C52711k.m112236a((Object) viewPagerBottomSheetBehavior, "bottomSheetBehavior");
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f57193a.mo45009b(R.id.cfc);
                C52711k.m112236a((Object) relativeLayout2, "root");
                viewPagerBottomSheetBehavior.mo45058a(relativeLayout2.getHeight());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$i */
    static final class C21036i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57196a;

        C21036i(I18nSignUpActivity i18nSignUpActivity) {
            this.f57196a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            Context context = this.f57196a;
            if (this.f57196a.mo45008a()) {
                str = "signup_login_homepage";
            } else {
                str = "login_homepage";
            }
            C22300g.m55188a(context, str, (String) this.f57196a.f57178d.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$j */
    static final class C21037j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f57197a;

        C21037j(I18nSignUpActivity i18nSignUpActivity) {
            this.f57197a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57197a.finish();
        }
    }

    /* renamed from: b */
    public final View mo45009b(int i) {
        if (this.f57180g == null) {
            this.f57180g = new HashMap();
        }
        View view = (View) this.f57180g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f57180g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.a8w);
    }

    public void onDestroy() {
        C20975a.m53341b(this);
        super.onDestroy();
    }

    public boolean useImmerseMode() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public I18nSignUpActivity() {
        String d = C23826bi.m58463d();
        C52711k.m112236a((Object) d, "ModuleStore.getCurUserId()");
        this.f57177c = d;
    }

    /* renamed from: a */
    public final boolean mo45008a() {
        NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) mo45009b(R.id.ds2);
        if (nonSwipeableViewPager == null || nonSwipeableViewPager.getCurrentItem() != 0) {
            return false;
        }
        return true;
    }

    public void finish() {
        super.finish();
        C23826bi.m58452a(10, 4, "");
        new Handler().postDelayed(new C21031d(this), 200);
        overridePendingTransition(0, R.anim.dh);
    }

    public void onBackPressed() {
        if (!mo45008a()) {
            NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) mo45009b(R.id.ds2);
            if (nonSwipeableViewPager != null) {
                nonSwipeableViewPager.setCurrentItem(0);
            }
            C21377l.m53997a((String) this.f57179f.getValue(), "click_back");
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: a */
    public final void mo45007a(boolean z) {
        if (z) {
            NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) mo45009b(R.id.ds2);
            if (nonSwipeableViewPager != null) {
                nonSwipeableViewPager.setCurrentItem(1);
            }
            return;
        }
        NonSwipeableViewPager nonSwipeableViewPager2 = (NonSwipeableViewPager) mo45009b(R.id.ds2);
        if (nonSwipeableViewPager2 != null) {
            nonSwipeableViewPager2.setCurrentItem(0);
        }
    }

    /* renamed from: a_ */
    public final void mo44975a_(int i) {
        if (i == 11 || i == 10) {
            if (i == 11) {
                this.f57176b = true;
            }
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r10)
            r10 = r9
            com.ss.android.ugc.aweme.account.g.a$b r10 = (com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b) r10
            com.p683ss.android.ugc.aweme.account.p1274g.C20975a.m53339a(r10)
            r9.supportRequestWindowFeature(r2)
            r10 = 2132214046(0x7f17011e, float:2.0071923E38)
            r9.setContentView(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0 = 2132024610(0x7f141d22, float:1.96877E38)
            android.view.View r1 = r9.mo45009b(r0)
            com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager r1 = (com.p683ss.android.ugc.aweme.account.login.NonSwipeableViewPager) r1
            java.lang.String r3 = "viewpager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$f r3 = new com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$f
            android.support.v4.app.k r4 = r9.getSupportFragmentManager()
            r3.<init>(r9, r10, r4)
            android.support.v4.view.PagerAdapter r3 = (android.support.p030v4.view.PagerAdapter) r3
            r1.setAdapter(r3)
            java.lang.String r1 = ""
            r3 = 10
            com.p683ss.android.ugc.aweme.C23826bi.m58452a(r3, r2, r1)
            d.f.b.v$c r1 = new d.f.b.v$c
            r1.<init>()
            r3 = r9
            android.app.Activity r3 = (android.app.Activity) r3
            int r4 = com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.m21584a(r3)
            r5 = r9
            android.content.Context r5 = (android.content.Context) r5
            int r6 = com.bytedance.common.utility.C9432q.m18695e(r5)
            int r4 = r4 - r6
            r1.element = r4
            boolean r4 = com.p683ss.android.common.util.C18920g.m46054c()
            r6 = 0
            if (r4 == 0) goto L_0x007a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r4 < r7) goto L_0x0070
            android.content.ContentResolver r4 = r5.getContentResolver()
            java.lang.String r5 = "force_fsg_nav_bar"
            int r4 = android.provider.Settings.Global.getInt(r4, r5, r6)
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 != r2) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r4 == 0) goto L_0x007a
            r4 = 1
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            if (r4 == 0) goto L_0x0099
            int r4 = r1.element
            java.lang.String r5 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r5)
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r5 = "navigation_bar_height"
            java.lang.String r7 = "dimen"
            java.lang.String r8 = "android"
            int r5 = r3.getIdentifier(r5, r7, r8)
            int r3 = r3.getDimensionPixelSize(r5)
            int r4 = r4 + r3
            r1.element = r4
        L_0x0099:
            android.view.Window r3 = r9.getWindow()
            r4 = 80
            r3.setGravity(r4)
            r4 = -1
            r3.setLayout(r4, r4)
            r3 = 2132022394(0x7f14147a, float:1.9683206E38)
            android.view.View r5 = r9.mo45009b(r3)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior r5 = com.p683ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.m53462b(r5)
            java.lang.String r7 = "this"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            boolean r7 = r5.f57215c
            if (r7 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            int r4 = r5.f57214b
        L_0x00bf:
            r1.element = r4
            r5.f57219g = r2
            int r2 = r5.f57221i
            r4 = 3
            if (r4 == r2) goto L_0x00f7
            java.lang.ref.WeakReference<V> r2 = r5.f57224l
            if (r2 != 0) goto L_0x00cf
            r5.f57221i = r4
            goto L_0x00f7
        L_0x00cf:
            java.lang.ref.WeakReference<V> r2 = r5.f57224l
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x00f7
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L_0x00f4
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x00f4
            boolean r7 = android.support.p030v4.view.C1056u.m3018B(r2)
            if (r7 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$1 r7 = new com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$1
            r7.<init>(r2, r4)
            r2.post(r7)
            goto L_0x00f7
        L_0x00f4:
            r5.mo45059a(r2, r4)
        L_0x00f7:
            com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$e r2 = new com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$e
            r2.<init>(r9, r1)
            com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$a r2 = (com.p683ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.C21042a) r2
            r5.f57226n = r2
            android.view.View r2 = r9.mo45009b(r0)
            com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager r2 = (com.p683ss.android.ugc.aweme.account.login.NonSwipeableViewPager) r2
            com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$g r4 = new com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$g
            r4.<init>(r9, r10)
            android.support.v4.view.ViewPager$e r4 = (android.support.p030v4.view.ViewPager.C0997e) r4
            r2.addOnPageChangeListener(r4)
            android.view.View r10 = r9.mo45009b(r0)
            com.ss.android.ugc.aweme.account.login.NonSwipeableViewPager r10 = (com.p683ss.android.ugc.aweme.account.login.NonSwipeableViewPager) r10
            com.p683ss.android.ugc.aweme.account.login.C21131d.m53617a(r10)
            android.view.View r10 = r9.mo45009b(r3)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$h r0 = new com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$h
            r0.<init>(r9, r1, r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r10.post(r0)
            r10 = 2132019477(0x7f140915, float:1.967729E38)
            android.view.View r10 = r9.mo45009b(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$i r0 = new com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$i
            r0.<init>(r9)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r10.setOnClickListener(r0)
            r10 = 2132018095(0x7f1403af, float:1.9674487E38)
            android.view.View r10 = r9.mo45009b(r10)
            com.ss.android.ugc.aweme.account.views.AutoRTLImageView r10 = (com.p683ss.android.ugc.aweme.account.views.AutoRTLImageView) r10
            com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$j r0 = new com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$j
            r0.<init>(r9)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r10.setOnClickListener(r0)
            java.lang.String r10 = "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity"
            java.lang.String r0 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r10, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.I18nSignUpActivity.onCreate(android.os.Bundle):void");
    }
}
