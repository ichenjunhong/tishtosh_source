package com.p683ss.android.ugc.aweme.proaccount;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.C23330az;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29786b;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29787c;
import com.p683ss.android.ugc.aweme.proaccount.C39681c.C39684c;
import com.p683ss.android.ugc.aweme.proaccount.ProWelcomeActivity.C39672a;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.p2382c.C47550a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.aweme.web.C48374m;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.proaccount.e */
public final class C39695e extends C23526a implements C9382a, C39684c {

    /* renamed from: k */
    public static final C39696a f101305k = new C39696a(null);

    /* renamed from: a */
    public C9381g f101306a;

    /* renamed from: b */
    public int f101307b;

    /* renamed from: c */
    public String f101308c;

    /* renamed from: d */
    public String f101309d;

    /* renamed from: e */
    public long f101310e = -1;

    /* renamed from: j */
    public long f101311j = -1;

    /* renamed from: l */
    private WrapLinearLayoutManager f101312l;

    /* renamed from: m */
    private C39681c f101313m;

    /* renamed from: n */
    private List<C39675a> f101314n;

    /* renamed from: o */
    private HashMap f101315o;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.e$a */
    public static final class C39696a {
        private C39696a() {
        }

        public /* synthetic */ C39696a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.e$b */
    static final class C39697b implements C20840g {

        /* renamed from: a */
        final /* synthetic */ C39695e f101316a;

        /* renamed from: b */
        final /* synthetic */ int f101317b;

        C39697b(C39695e eVar, int i) {
            this.f101316a = eVar;
            this.f101317b = i;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 14 && i2 == 1) {
                IAccountUserService a = C20902b.m53242a();
                C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                User curUser = a.getCurUser();
                C52711k.m112236a((Object) curUser, "user");
                if (curUser.isSecret()) {
                    C9381g gVar = this.f101316a.f101306a;
                    if (gVar == null) {
                        C52711k.m112237a("mHandler");
                    }
                    C47550a.m102986a((Handler) gVar, "secret", "0", 0, 122);
                    return;
                }
                C20902b.m53242a().queryUser();
                C26890h.m65011a("switch_to_pro_account_success", C23089d.m56640a().mo47829a("classes", C39695e.m88403a(this.f101316a)).f61491a);
                I18nBridgeService.getBridgeService_Monster().openSettingFragment(this.f101316a.getContext());
                C26890h.m65011a("choose_gender_done", C23089d.m56640a().mo47826a("gender", this.f101317b).mo47827a("stay_time", System.currentTimeMillis() - this.f101316a.f101311j).f61491a);
                C48374m a2 = C39672a.m88385a();
                if (a2 != null) {
                    a2.status(1, true);
                }
            } else {
                this.f101316a.mo80775a();
                if (this.f101316a.getContext() != null) {
                    C10691a.m21542b(this.f101316a.getContext(), (int) R.string.cg2).mo19066a();
                }
                C48374m a3 = C39672a.m88385a();
                if (a3 != null) {
                    a3.status(1, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.e$c */
    static final class C39698c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39695e f101318a;

        /* renamed from: b */
        final /* synthetic */ User f101319b;

        C39698c(C39695e eVar, User user) {
            this.f101318a = eVar;
            this.f101319b = user;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x005e, code lost:
            if (r11.isEmailVerified() != false) goto L_0x0111;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r11) {
            /*
                r10 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r11)
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.proaccount.e r11 = r10.f101318a
                long r2 = r11.f101310e
                long r0 = r0 - r2
                java.lang.String r11 = "click_choose_done"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "is_success"
                java.lang.String r4 = "1"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "classes"
                com.ss.android.ugc.aweme.proaccount.e r4 = r10.f101318a
                java.lang.String r4 = com.p683ss.android.ugc.aweme.proaccount.C39695e.m88403a(r4)
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "duration"
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r11, r0)
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                boolean r11 = r11.isPhoneBinded()
                if (r11 != 0) goto L_0x0111
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                java.lang.String r11 = r11.getEmail()
                boolean r11 = com.bytedance.p879t.p882c.C13248c.m26638a(r11)
                if (r11 != 0) goto L_0x0062
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                boolean r11 = r11.isEmailVerified()
                if (r11 == 0) goto L_0x0062
                goto L_0x0111
            L_0x0062:
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                java.lang.String r11 = r11.getEmail()
                boolean r11 = com.bytedance.p879t.p882c.C13248c.m26638a(r11)
                r0 = 1
                if (r11 != 0) goto L_0x00a4
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r1 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
                boolean r11 = r11.isEmailVerified()
                if (r11 != 0) goto L_0x00a4
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                java.lang.String r1 = "from_ProAccount"
                r11.putBoolean(r1, r0)
                com.ss.android.ugc.aweme.ak r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
                com.ss.android.ugc.aweme.proaccount.e r1 = r10.f101318a
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.app.Activity r1 = (android.app.Activity) r1
                java.lang.String r2 = "switchtoproaccount"
                com.ss.android.ugc.aweme.proaccount.e$c$1 r3 = new com.ss.android.ugc.aweme.proaccount.e$c$1
                r3.<init>(r10)
                com.ss.android.ugc.aweme.IAccountService$g r3 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r3
                r0.verifyEmail(r1, r2, r11, r3)
                return
            L_0x00a4:
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r1 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
                boolean r11 = r11.isPhoneBinded()
                if (r11 != 0) goto L_0x0110
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101319b
                java.lang.String r1 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
                java.lang.String r11 = r11.getEmail()
                boolean r11 = com.bytedance.p879t.p882c.C13248c.m26638a(r11)
                if (r11 == 0) goto L_0x0110
                com.ss.android.ugc.aweme.az r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53169i()
                boolean r11 = r11.enableNewPhoneBindFlow()
                if (r11 == 0) goto L_0x00ef
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                java.lang.String r1 = "from_ProAccount"
                r11.putBoolean(r1, r0)
                com.ss.android.ugc.aweme.ak r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
                com.ss.android.ugc.aweme.proaccount.e r1 = r10.f101318a
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.app.Activity r1 = (android.app.Activity) r1
                java.lang.String r2 = "setting"
                com.ss.android.ugc.aweme.proaccount.e$c$2 r3 = new com.ss.android.ugc.aweme.proaccount.e$c$2
                r3.<init>(r10)
                com.ss.android.ugc.aweme.IAccountService$g r3 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r3
                r0.bindMobile(r1, r2, r11, r3)
                return
            L_0x00ef:
                com.ss.android.ugc.aweme.az r4 = com.p683ss.android.ugc.aweme.account.C20854a.m53169i()
                com.ss.android.ugc.aweme.proaccount.e r11 = r10.f101318a
                android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                r5 = r11
                android.app.Activity r5 = (android.app.Activity) r5
                java.lang.String r6 = "setting"
                com.ss.android.ugc.aweme.proaccount.e$c$3 r11 = new com.ss.android.ugc.aweme.proaccount.e$c$3
                r11.<init>(r10)
                r7 = r11
                com.ss.android.ugc.aweme.IAccountService$g r7 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r7
                r8 = 1
                com.ss.android.ugc.aweme.proaccount.e r11 = r10.f101318a
                java.lang.String r9 = com.p683ss.android.ugc.aweme.proaccount.C39695e.m88403a(r11)
                r4.bindProAccountMobile(r5, r6, r7, r8, r9)
            L_0x0110:
                return
            L_0x0111:
                com.ss.android.ugc.aweme.proaccount.e r11 = r10.f101318a
                r0 = 2132017946(0x7f14031a, float:1.9674185E38)
                android.view.View r1 = r11.mo80774a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r1
                if (r1 == 0) goto L_0x0122
                r2 = 0
                r1.setVisibility(r2)
            L_0x0122:
                android.view.View r11 = r11.mo80774a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r11 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r11
                if (r11 == 0) goto L_0x012d
                r11.mo19212f()
            L_0x012d:
                com.ss.android.ugc.aweme.proaccount.e r11 = r10.f101318a
                com.ss.android.ugc.aweme.proaccount.e r0 = r10.f101318a
                java.lang.String r0 = com.p683ss.android.ugc.aweme.proaccount.C39695e.m88403a(r0)
                com.ss.android.ugc.aweme.proaccount.e r1 = r10.f101318a
                java.lang.String r1 = com.p683ss.android.ugc.aweme.proaccount.C39695e.m88404b(r1)
                com.ss.android.ugc.aweme.proaccount.e r2 = r10.f101318a
                int r2 = r2.f101307b
                r11.mo80776a(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.proaccount.C39695e.C39698c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.e$d */
    static final class C39702d implements C20840g {

        /* renamed from: a */
        final /* synthetic */ C39695e f101323a;

        C39702d(C39695e eVar) {
            this.f101323a = eVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 7 && i2 == 1) {
                I18nBridgeService.getBridgeService_Monster().openSettingFragment(this.f101323a.getContext());
                C26890h.m65011a("switch_to_pro_account_success", C23089d.m56640a().mo47829a("classes", C39695e.m88403a(this.f101323a)).f61491a);
            }
        }
    }

    /* renamed from: a */
    public final View mo80774a(int i) {
        if (this.f101315o == null) {
            this.f101315o = new HashMap();
        }
        View view = (View) this.f101315o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f101315o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f101315o != null) {
            this.f101315o.clear();
        }
    }

    /* renamed from: a */
    public final void mo80775a() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo80774a((int) R.id.r2);
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo80774a((int) R.id.r2);
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo19220n();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f101310e = System.currentTimeMillis();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ProWelcomeActivity) activity).f101251b = System.currentTimeMillis();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ String m88403a(C39695e eVar) {
        String str = eVar.f101308c;
        if (str == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m88404b(C39695e eVar) {
        String str = eVar.f101309d;
        if (str == null) {
            C52711k.m112237a("mCategoryID");
        }
        return str;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f101306a = new C9381g(this);
        C47718bf.m103290c(this);
        this.f101311j = System.currentTimeMillis();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void switchToProAccountAfterEmail(C29787c cVar) {
        C52711k.m112240b(cVar, "proAccount");
        String str = this.f101308c;
        if (str == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        String str2 = this.f101309d;
        if (str2 == null) {
            C52711k.m112237a("mCategoryID");
        }
        mo80776a(str, str2, this.f101307b);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void switchToBindMobile(C29786b bVar) {
        C52711k.m112240b(bVar, "phone");
        C23330az i = C20854a.m53169i();
        Activity activity = getActivity();
        String str = "setting";
        C20840g dVar = new C39702d(this);
        String str2 = this.f101308c;
        if (str2 == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        i.bindProAccountMobile(activity, str, dVar, 1, str2);
    }

    /* renamed from: a */
    public final void mo80765a(C39675a aVar) {
        boolean z;
        C52711k.m112240b(aVar, "gender");
        this.f101307b = aVar.f101257b;
        String str = this.f101308c;
        if (str == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtTextView dmtTextView = (DmtTextView) mo80774a((int) R.id.r3);
            C52711k.m112236a((Object) dmtTextView, "category_tv_next");
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            dmtTextView.setBackground(C0726c.m2091a((Context) activity, (int) R.drawable.om));
            DmtTextView dmtTextView2 = (DmtTextView) mo80774a((int) R.id.r3);
            C52711k.m112236a((Object) dmtTextView2, "category_tv_next");
            dmtTextView2.setEnabled(true);
            ((DmtTextView) mo80774a((int) R.id.r3)).setTextColor(getResources().getColor(R.color.auk));
        }
    }

    public final void handleMsg(Message message) {
        if (message == null) {
            C52711k.m112234a();
        }
        if (message.obj instanceof Exception) {
            mo80775a();
            if (getContext() != null) {
                C10691a.m21542b(getContext(), (int) R.string.cg2).mo19066a();
            }
            return;
        }
        if (message.obj instanceof UserResponse) {
            Object obj = message.obj;
            if (obj != null) {
                UserResponse userResponse = (UserResponse) obj;
                if (message.what == 122) {
                    C52711k.m112236a((Object) userResponse.getUser(), "resp.user");
                    C20902b.m53242a().queryUser();
                    String str = "switch_to_pro_account_success";
                    C23089d a = C23089d.m56640a();
                    String str2 = "classes";
                    String str3 = this.f101308c;
                    if (str3 == null) {
                        C52711k.m112237a("mCheckedCategory");
                    }
                    C26890h.m65011a(str, a.mo47829a(str2, str3).f61491a);
                    I18nBridgeService.getBridgeService_Monster().openSettingFragment(getContext());
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r2 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            super.onViewCreated(r5, r6)
            r5 = 4
            com.ss.android.ugc.aweme.proaccount.a[] r5 = new com.p683ss.android.ugc.aweme.proaccount.C39675a[r5]
            com.ss.android.ugc.aweme.proaccount.a r6 = new com.ss.android.ugc.aweme.proaccount.a
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0022
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0022
            r1 = 2132547868(0x7f1c191c, float:2.0748994E38)
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            java.lang.String r0 = ""
        L_0x0024:
            r1 = 2
            r6.<init>(r0, r1)
            r0 = 0
            r5[r0] = r6
            com.ss.android.ugc.aweme.proaccount.a r6 = new com.ss.android.ugc.aweme.proaccount.a
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x0042
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x0042
            r3 = 2132547869(0x7f1c191d, float:2.0748996E38)
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x0044
        L_0x0042:
            java.lang.String r2 = ""
        L_0x0044:
            r3 = 1
            r6.<init>(r2, r3)
            r5[r3] = r6
            com.ss.android.ugc.aweme.proaccount.a r6 = new com.ss.android.ugc.aweme.proaccount.a
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x0061
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x0061
            r3 = 2132547870(0x7f1c191e, float:2.0748998E38)
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x0063
        L_0x0061:
            java.lang.String r2 = ""
        L_0x0063:
            r3 = 3
            r6.<init>(r2, r3)
            r5[r1] = r6
            com.ss.android.ugc.aweme.proaccount.a r6 = new com.ss.android.ugc.aweme.proaccount.a
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x0080
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0080
            r2 = 2132547871(0x7f1c191f, float:2.0749E38)
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L_0x0082
        L_0x0080:
            java.lang.String r1 = ""
        L_0x0082:
            r6.<init>(r1, r0)
            r5[r3] = r6
            java.util.List r5 = p2628d.p2629a.C52575l.m112101c(r5)
            r4.f101314n = r5
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r5 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6)
            r4.f101312l = r5
            java.util.List<com.ss.android.ugc.aweme.proaccount.a> r5 = r4.f101314n
            if (r5 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.proaccount.c r5 = new com.ss.android.ugc.aweme.proaccount.c
            android.support.v4.app.FragmentActivity r6 = r4.getActivity()
            if (r6 != 0) goto L_0x00a7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a7:
            java.lang.String r1 = "activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r1)
            android.content.Context r6 = (android.content.Context) r6
            java.util.List<com.ss.android.ugc.aweme.proaccount.a> r1 = r4.f101314n
            if (r1 != 0) goto L_0x00b5
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b5:
            r5.<init>(r6, r1)
            r4.f101313m = r5
        L_0x00ba:
            r5 = 2132017945(0x7f140319, float:1.9674183E38)
            android.view.View r6 = r4.mo80774a(r5)
            android.support.v7.widget.RecyclerView r6 = (android.support.p043v7.widget.RecyclerView) r6
            java.lang.String r1 = "category_rv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r1)
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r1 = r4.f101312l
            if (r1 != 0) goto L_0x00d1
            java.lang.String r2 = "mLinearLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00d1:
            android.support.v7.widget.RecyclerView$i r1 = (android.support.p043v7.widget.RecyclerView.C1332i) r1
            r6.setLayoutManager(r1)
            android.view.View r5 = r4.mo80774a(r5)
            android.support.v7.widget.RecyclerView r5 = (android.support.p043v7.widget.RecyclerView) r5
            java.lang.String r6 = "category_rv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.proaccount.c r6 = r4.f101313m
            if (r6 != 0) goto L_0x00ea
            java.lang.String r1 = "mAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00ea:
            android.support.v7.widget.RecyclerView$a r6 = (android.support.p043v7.widget.RecyclerView.C1322a) r6
            r5.setAdapter(r6)
            com.ss.android.ugc.aweme.proaccount.c r5 = r4.f101313m
            if (r5 != 0) goto L_0x00f8
            java.lang.String r6 = "mAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00f8:
            r6 = r4
            com.ss.android.ugc.aweme.proaccount.c$c r6 = (com.p683ss.android.ugc.aweme.proaccount.C39681c.C39684c) r6
            java.lang.String r1 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r1)
            r5.f101274a = r6
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
            java.lang.String r6 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            boolean r6 = r5.isPhoneBinded()
            r1 = 2132017947(0x7f14031b, float:1.9674187E38)
            if (r6 == 0) goto L_0x012a
            android.view.View r6 = r4.mo80774a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r2 = 2132542468(0x7f1c0404, float:2.0738042E38)
            r6.setText(r2)
            goto L_0x0136
        L_0x012a:
            android.view.View r6 = r4.mo80774a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r2 = 2132542469(0x7f1c0405, float:2.0738044E38)
            r6.setText(r2)
        L_0x0136:
            android.view.View r6 = r4.mo80774a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r2 = "category_tv_next"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r2)
            android.support.v4.app.FragmentActivity r2 = r4.getActivity()
            if (r2 != 0) goto L_0x014a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x014a:
            android.content.Context r2 = (android.content.Context) r2
            r3 = 2131952418(0x7f130322, float:1.9541278E38)
            android.graphics.drawable.Drawable r2 = android.support.p030v4.content.C0726c.m2091a(r2, r3)
            r6.setBackground(r2)
            android.view.View r6 = r4.mo80774a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r2 = "category_tv_next"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r2)
            r6.setEnabled(r0)
            r6 = 2132017946(0x7f14031a, float:1.9674185E38)
            android.view.View r6 = r4.mo80774a(r6)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r6
            if (r6 == 0) goto L_0x017e
            android.content.Context r0 = r4.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r0.mo19223a()
            r6.setBuilder(r0)
        L_0x017e:
            android.view.View r6 = r4.mo80774a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28903b
            r6.setFontType(r0)
            android.view.View r6 = r4.mo80774a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            com.ss.android.ugc.aweme.proaccount.e$c r0 = new com.ss.android.ugc.aweme.proaccount.e$c
            r0.<init>(r4, r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.proaccount.C39695e.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r4 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r3 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
        /*
            r1 = this;
            java.lang.String r4 = "inflater"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            r4 = 2132214643(0x7f170373, float:2.0073134E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            android.os.Bundle r3 = r1.getArguments()
            if (r3 == 0) goto L_0x001b
            java.lang.String r4 = "GATEGORY_NAME"
            java.lang.String r4 = r3.getString(r4)
            if (r4 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r4 = ""
        L_0x001d:
            r1.f101308c = r4
            if (r3 == 0) goto L_0x0029
            java.lang.String r4 = "GATEGORY_ID"
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r3 = ""
        L_0x002b:
            r1.f101309d = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.proaccount.C39695e.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: a */
    public final void mo80776a(String str, String str2, int i) {
        C20854a.m53169i().switchProAccount(1, str, str2, i, new C39697b(this, i));
    }
}
