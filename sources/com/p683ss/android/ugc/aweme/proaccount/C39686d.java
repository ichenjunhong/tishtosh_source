package com.p683ss.android.ugc.aweme.proaccount;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
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
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29786b;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29787c;
import com.p683ss.android.ugc.aweme.proaccount.C39676b.C39679c;
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

/* renamed from: com.ss.android.ugc.aweme.proaccount.d */
public final class C39686d extends C23526a implements C9382a, C39679c {

    /* renamed from: m */
    public static final C39688b f101286m = new C39688b(null);

    /* renamed from: a */
    public C9381g f101287a;

    /* renamed from: b */
    public C39687a f101288b;

    /* renamed from: c */
    public C39676b f101289c;

    /* renamed from: d */
    public String f101290d;

    /* renamed from: e */
    public String f101291e;

    /* renamed from: j */
    public long f101292j = -1;

    /* renamed from: k */
    public boolean f101293k;

    /* renamed from: l */
    public int f101294l;

    /* renamed from: n */
    private WrapLinearLayoutManager f101295n;

    /* renamed from: o */
    private List<CategoryStruct> f101296o;

    /* renamed from: p */
    private HashMap f101297p;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.d$a */
    public interface C39687a {
        /* renamed from: a */
        void mo80753a(String str, String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.d$b */
    public static final class C39688b {
        private C39688b() {
        }

        /* renamed from: a */
        public static C39686d m88402a() {
            C39686d dVar = new C39686d();
            dVar.setArguments(new Bundle());
            return dVar;
        }

        public /* synthetic */ C39688b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.d$c */
    static final class C39689c implements C20840g {

        /* renamed from: a */
        final /* synthetic */ C39686d f101298a;

        C39689c(C39686d dVar) {
            this.f101298a = dVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 14 && i2 == 1) {
                IAccountUserService a = C20902b.m53242a();
                C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                User curUser = a.getCurUser();
                C52711k.m112236a((Object) curUser, "user");
                if (curUser.isSecret()) {
                    C9381g gVar = this.f101298a.f101287a;
                    if (gVar == null) {
                        C52711k.m112237a("mHandler");
                    }
                    C47550a.m102986a((Handler) gVar, "secret", "0", 0, 122);
                } else {
                    C20902b.m53242a().queryUser();
                    C26890h.m65011a("switch_to_pro_account_success", C23089d.m56640a().mo47829a("classes", C39686d.m88394a(this.f101298a)).f61491a);
                    I18nBridgeService.getBridgeService_Monster().openSettingFragment(this.f101298a.getContext());
                }
                C48374m a2 = C39672a.m88385a();
                if (a2 != null) {
                    a2.status(1, true);
                }
            } else {
                this.f101298a.mo80768a();
                if (this.f101298a.getContext() != null) {
                    C10691a.m21542b(this.f101298a.getContext(), (int) R.string.cg2).mo19066a();
                }
                C48374m a3 = C39672a.m88385a();
                if (a3 != null) {
                    a3.status(1, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.d$d */
    static final class C39690d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39686d f101299a;

        /* renamed from: b */
        final /* synthetic */ User f101300b;

        C39690d(C39686d dVar, User user) {
            this.f101299a = dVar;
            this.f101300b = user;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
            if (r11.isEmailVerified() != false) goto L_0x0171;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r11) {
            /*
                r10 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r11)
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                long r2 = r11.f101292j
                long r0 = r0 - r2
                java.lang.String r11 = "click_choose_done"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "is_success"
                java.lang.String r4 = "1"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "classes"
                com.ss.android.ugc.aweme.proaccount.d r4 = r10.f101299a
                java.lang.String r4 = com.p683ss.android.ugc.aweme.proaccount.C39686d.m88394a(r4)
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "duration"
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r11, r0)
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                boolean r11 = r11.f101293k
                if (r11 == 0) goto L_0x0095
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                int r11 = r11.f101294l
                if (r11 != 0) goto L_0x0095
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                r0 = 2132017945(0x7f140319, float:1.9674183E38)
                android.view.View r11 = r11.mo80767a(r0)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                if (r11 == 0) goto L_0x0057
                android.support.v7.widget.RecyclerView$n r11 = r11.getRecycledViewPool()
                if (r11 == 0) goto L_0x0057
                r11.mo5085a()
            L_0x0057:
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                android.view.View r11 = r11.mo80767a(r0)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                r1 = 0
                if (r11 == 0) goto L_0x0065
                r11.setLayoutManager(r1)
            L_0x0065:
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                android.view.View r11 = r11.mo80767a(r0)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                if (r11 == 0) goto L_0x0072
                r11.setAdapter(r1)
            L_0x0072:
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                r11.f101289c = r1
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                com.ss.android.ugc.aweme.proaccount.d$a r11 = r11.f101288b
                if (r11 != 0) goto L_0x0081
                java.lang.String r0 = "mCategoryCallBack"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0081:
                if (r11 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.proaccount.d r0 = r10.f101299a
                java.lang.String r0 = com.p683ss.android.ugc.aweme.proaccount.C39686d.m88394a(r0)
                com.ss.android.ugc.aweme.proaccount.d r1 = r10.f101299a
                java.lang.String r1 = com.p683ss.android.ugc.aweme.proaccount.C39686d.m88395b(r1)
                r11.mo80753a(r0, r1)
                goto L_0x0170
            L_0x0094:
                return
            L_0x0095:
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                boolean r11 = r11.isPhoneBinded()
                if (r11 != 0) goto L_0x0171
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                java.lang.String r11 = r11.getEmail()
                boolean r11 = com.bytedance.p879t.p882c.C13248c.m26638a(r11)
                if (r11 != 0) goto L_0x00c2
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                boolean r11 = r11.isEmailVerified()
                if (r11 == 0) goto L_0x00c2
                goto L_0x0171
            L_0x00c2:
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                java.lang.String r11 = r11.getEmail()
                boolean r11 = com.bytedance.p879t.p882c.C13248c.m26638a(r11)
                r0 = 1
                if (r11 != 0) goto L_0x0104
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r1 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
                boolean r11 = r11.isEmailVerified()
                if (r11 != 0) goto L_0x0104
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                java.lang.String r1 = "from_ProAccount"
                r11.putBoolean(r1, r0)
                com.ss.android.ugc.aweme.ak r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
                com.ss.android.ugc.aweme.proaccount.d r1 = r10.f101299a
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.app.Activity r1 = (android.app.Activity) r1
                java.lang.String r2 = "switchtoproaccount"
                com.ss.android.ugc.aweme.proaccount.d$d$1 r3 = new com.ss.android.ugc.aweme.proaccount.d$d$1
                r3.<init>(r10)
                com.ss.android.ugc.aweme.IAccountService$g r3 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r3
                r0.verifyEmail(r1, r2, r11, r3)
                return
            L_0x0104:
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r1 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
                boolean r11 = r11.isPhoneBinded()
                if (r11 != 0) goto L_0x0170
                com.ss.android.ugc.aweme.profile.model.User r11 = r10.f101300b
                java.lang.String r1 = "user"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
                java.lang.String r11 = r11.getEmail()
                boolean r11 = com.bytedance.p879t.p882c.C13248c.m26638a(r11)
                if (r11 == 0) goto L_0x0170
                com.ss.android.ugc.aweme.az r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53169i()
                boolean r11 = r11.enableNewPhoneBindFlow()
                if (r11 == 0) goto L_0x014f
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                java.lang.String r1 = "from_ProAccount"
                r11.putBoolean(r1, r0)
                com.ss.android.ugc.aweme.ak r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53165e()
                com.ss.android.ugc.aweme.proaccount.d r1 = r10.f101299a
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.app.Activity r1 = (android.app.Activity) r1
                java.lang.String r2 = "setting"
                com.ss.android.ugc.aweme.proaccount.d$d$2 r3 = new com.ss.android.ugc.aweme.proaccount.d$d$2
                r3.<init>(r10)
                com.ss.android.ugc.aweme.IAccountService$g r3 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r3
                r0.bindMobile(r1, r2, r11, r3)
                return
            L_0x014f:
                com.ss.android.ugc.aweme.az r4 = com.p683ss.android.ugc.aweme.account.C20854a.m53169i()
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                r5 = r11
                android.app.Activity r5 = (android.app.Activity) r5
                java.lang.String r6 = "setting"
                com.ss.android.ugc.aweme.proaccount.d$d$3 r11 = new com.ss.android.ugc.aweme.proaccount.d$d$3
                r11.<init>(r10)
                r7 = r11
                com.ss.android.ugc.aweme.IAccountService$g r7 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r7
                r8 = 1
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                java.lang.String r9 = com.p683ss.android.ugc.aweme.proaccount.C39686d.m88394a(r11)
                r4.bindProAccountMobile(r5, r6, r7, r8, r9)
            L_0x0170:
                return
            L_0x0171:
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                r0 = 2132017946(0x7f14031a, float:1.9674185E38)
                android.view.View r1 = r11.mo80767a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r1
                if (r1 == 0) goto L_0x0182
                r2 = 0
                r1.setVisibility(r2)
            L_0x0182:
                android.view.View r11 = r11.mo80767a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r11 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r11
                if (r11 == 0) goto L_0x018d
                r11.mo19212f()
            L_0x018d:
                com.ss.android.ugc.aweme.proaccount.d r11 = r10.f101299a
                com.ss.android.ugc.aweme.proaccount.d r0 = r10.f101299a
                java.lang.String r0 = com.p683ss.android.ugc.aweme.proaccount.C39686d.m88394a(r0)
                com.ss.android.ugc.aweme.proaccount.d r1 = r10.f101299a
                java.lang.String r1 = com.p683ss.android.ugc.aweme.proaccount.C39686d.m88395b(r1)
                r11.mo80770a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.proaccount.C39686d.C39690d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.d$e */
    static final class C39694e implements C20840g {

        /* renamed from: a */
        final /* synthetic */ C39686d f101304a;

        C39694e(C39686d dVar) {
            this.f101304a = dVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 7 && i2 == 1) {
                I18nBridgeService.getBridgeService_Monster().openSettingFragment(this.f101304a.getContext());
                C26890h.m65011a("switch_to_pro_account_success", C23089d.m56640a().mo47829a("classes", C39686d.m88394a(this.f101304a)).f61491a);
            }
        }
    }

    /* renamed from: a */
    public final View mo80767a(int i) {
        if (this.f101297p == null) {
            this.f101297p = new HashMap();
        }
        View view = (View) this.f101297p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f101297p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f101297p != null) {
            this.f101297p.clear();
        }
    }

    /* renamed from: a */
    public final void mo80768a() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo80767a((int) R.id.r2);
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo80767a((int) R.id.r2);
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo19220n();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f101292j = System.currentTimeMillis();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ProWelcomeActivity) activity).f101251b = System.currentTimeMillis();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity");
    }

    /* renamed from: a */
    public final void mo80769a(C39687a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f101288b = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ String m88394a(C39686d dVar) {
        String str = dVar.f101290d;
        if (str == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m88395b(C39686d dVar) {
        String str = dVar.f101291e;
        if (str == null) {
            C52711k.m112237a("mCategoryID");
        }
        return str;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f101287a = new C9381g(this);
        C47718bf.m103290c(this);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void switchToProAccountAfterEmail(C29787c cVar) {
        C52711k.m112240b(cVar, "proAccount");
        String str = this.f101290d;
        if (str == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        String str2 = this.f101291e;
        if (str2 == null) {
            C52711k.m112237a("mCategoryID");
        }
        mo80770a(str, str2);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void switchToBindMobile(C29786b bVar) {
        C52711k.m112240b(bVar, "phone");
        C23330az i = C20854a.m53169i();
        Activity activity = getActivity();
        String str = "setting";
        C20840g eVar = new C39694e(this);
        String str2 = this.f101290d;
        if (str2 == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        i.bindProAccountMobile(activity, str, eVar, 1, str2);
    }

    public final void handleMsg(Message message) {
        if (message == null) {
            C52711k.m112234a();
        }
        if (message.obj instanceof Exception) {
            mo80768a();
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
                    String str3 = this.f101290d;
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

    /* renamed from: a */
    public final void mo80770a(String str, String str2) {
        if (!this.f101293k) {
            this.f101294l = 0;
        }
        C20854a.m53169i().switchProAccount(1, str, str2, this.f101294l, new C39689c(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            super.onViewCreated(r7, r8)
            r7 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r8 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0020 }
            java.lang.String r0 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)     // Catch:{ a -> 0x0020 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo r8 = r8.getProAccountEnableDetailInfo()     // Catch:{ a -> 0x0020 }
            if (r8 == 0) goto L_0x001d
            java.util.List r8 = r8.getCategoryList()     // Catch:{ a -> 0x0020 }
            goto L_0x001e
        L_0x001d:
            r8 = r7
        L_0x001e:
            r6.f101296o = r8     // Catch:{ a -> 0x0020 }
        L_0x0020:
            java.util.List<com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct> r8 = r6.f101296o
            r0 = 0
            if (r8 != 0) goto L_0x03cd
            r8 = 19
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct[] r8 = new com.p683ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct[r8]
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r1 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r2 = r6.getContext()
            r3 = 2132542570(0x7f1c046a, float:2.0738249E38)
            if (r2 == 0) goto L_0x003f
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0040
        L_0x003f:
            r2 = r7
        L_0x0040:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x0051
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x0051
            java.lang.String r3 = r4.getString(r3)
            goto L_0x0052
        L_0x0051:
            r3 = r7
        L_0x0052:
            r1.<init>(r2, r3)
            r8[r0] = r1
            r1 = 1
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542584(0x7f1c0478, float:2.0738277E38)
            if (r3 == 0) goto L_0x006e
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = r3.getString(r4)
            goto L_0x006f
        L_0x006e:
            r3 = r7
        L_0x006f:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x0080
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0080
            java.lang.String r4 = r5.getString(r4)
            goto L_0x0081
        L_0x0080:
            r4 = r7
        L_0x0081:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 2
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542582(0x7f1c0476, float:2.0738273E38)
            if (r3 == 0) goto L_0x009d
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x009d
            java.lang.String r3 = r3.getString(r4)
            goto L_0x009e
        L_0x009d:
            r3 = r7
        L_0x009e:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x00af
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x00af
            java.lang.String r4 = r5.getString(r4)
            goto L_0x00b0
        L_0x00af:
            r4 = r7
        L_0x00b0:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 3
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542576(0x7f1c0470, float:2.073826E38)
            if (r3 == 0) goto L_0x00cc
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x00cc
            java.lang.String r3 = r3.getString(r4)
            goto L_0x00cd
        L_0x00cc:
            r3 = r7
        L_0x00cd:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x00de
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x00de
            java.lang.String r4 = r5.getString(r4)
            goto L_0x00df
        L_0x00de:
            r4 = r7
        L_0x00df:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 4
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542571(0x7f1c046b, float:2.073825E38)
            if (r3 == 0) goto L_0x00fb
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x00fb
            java.lang.String r3 = r3.getString(r4)
            goto L_0x00fc
        L_0x00fb:
            r3 = r7
        L_0x00fc:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x010d
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x010d
            java.lang.String r4 = r5.getString(r4)
            goto L_0x010e
        L_0x010d:
            r4 = r7
        L_0x010e:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 5
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542577(0x7f1c0471, float:2.0738263E38)
            if (r3 == 0) goto L_0x012a
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x012a
            java.lang.String r3 = r3.getString(r4)
            goto L_0x012b
        L_0x012a:
            r3 = r7
        L_0x012b:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x013c
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x013c
            java.lang.String r4 = r5.getString(r4)
            goto L_0x013d
        L_0x013c:
            r4 = r7
        L_0x013d:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 6
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542579(0x7f1c0473, float:2.0738267E38)
            if (r3 == 0) goto L_0x0159
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0159
            java.lang.String r3 = r3.getString(r4)
            goto L_0x015a
        L_0x0159:
            r3 = r7
        L_0x015a:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x016b
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x016b
            java.lang.String r4 = r5.getString(r4)
            goto L_0x016c
        L_0x016b:
            r4 = r7
        L_0x016c:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 7
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542586(0x7f1c047a, float:2.0738281E38)
            if (r3 == 0) goto L_0x0188
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0188
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0189
        L_0x0188:
            r3 = r7
        L_0x0189:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x019a
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x019a
            java.lang.String r4 = r5.getString(r4)
            goto L_0x019b
        L_0x019a:
            r4 = r7
        L_0x019b:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 8
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542575(0x7f1c046f, float:2.0738259E38)
            if (r3 == 0) goto L_0x01b8
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x01b8
            java.lang.String r3 = r3.getString(r4)
            goto L_0x01b9
        L_0x01b8:
            r3 = r7
        L_0x01b9:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x01ca
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x01ca
            java.lang.String r4 = r5.getString(r4)
            goto L_0x01cb
        L_0x01ca:
            r4 = r7
        L_0x01cb:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 9
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 2132542578(0x7f1c0472, float:2.0738265E38)
            if (r3 == 0) goto L_0x01e8
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x01e8
            java.lang.String r3 = r3.getString(r4)
            goto L_0x01e9
        L_0x01e8:
            r3 = r7
        L_0x01e9:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x01fa
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x01fa
            java.lang.String r4 = r5.getString(r4)
            goto L_0x01fb
        L_0x01fa:
            r4 = r7
        L_0x01fb:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 10
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0218
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0218
            r4 = 2132542587(0x7f1c047b, float:2.0738283E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0219
        L_0x0218:
            r3 = r7
        L_0x0219:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x022d
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x022d
            r5 = 2132542587(0x7f1c047b, float:2.0738283E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x022e
        L_0x022d:
            r4 = r7
        L_0x022e:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 11
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x024b
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x024b
            r4 = 2132542569(0x7f1c0469, float:2.0738247E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x024c
        L_0x024b:
            r3 = r7
        L_0x024c:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x0260
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x0260
            r5 = 2132542569(0x7f1c0469, float:2.0738247E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0261
        L_0x0260:
            r4 = r7
        L_0x0261:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 12
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x027e
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x027e
            r4 = 2132542585(0x7f1c0479, float:2.073828E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x027f
        L_0x027e:
            r3 = r7
        L_0x027f:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x0293
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x0293
            r5 = 2132542585(0x7f1c0479, float:2.073828E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0294
        L_0x0293:
            r4 = r7
        L_0x0294:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 13
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x02b1
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x02b1
            r4 = 2132542573(0x7f1c046d, float:2.0738255E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x02b2
        L_0x02b1:
            r3 = r7
        L_0x02b2:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x02c6
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x02c6
            r5 = 2132542573(0x7f1c046d, float:2.0738255E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x02c7
        L_0x02c6:
            r4 = r7
        L_0x02c7:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 14
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x02e4
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x02e4
            r4 = 2132542588(0x7f1c047c, float:2.0738285E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x02e5
        L_0x02e4:
            r3 = r7
        L_0x02e5:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x02f9
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x02f9
            r5 = 2132542588(0x7f1c047c, float:2.0738285E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x02fa
        L_0x02f9:
            r4 = r7
        L_0x02fa:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 15
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0317
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0317
            r4 = 2132542580(0x7f1c0474, float:2.0738269E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0318
        L_0x0317:
            r3 = r7
        L_0x0318:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x032c
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x032c
            r5 = 2132542580(0x7f1c0474, float:2.0738269E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x032d
        L_0x032c:
            r4 = r7
        L_0x032d:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 16
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x034a
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x034a
            r4 = 2132542574(0x7f1c046e, float:2.0738257E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x034b
        L_0x034a:
            r3 = r7
        L_0x034b:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x035f
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x035f
            r5 = 2132542574(0x7f1c046e, float:2.0738257E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0360
        L_0x035f:
            r4 = r7
        L_0x0360:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 17
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x037d
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x037d
            r4 = 2132542583(0x7f1c0477, float:2.0738275E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x037e
        L_0x037d:
            r3 = r7
        L_0x037e:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x0392
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x0392
            r5 = 2132542583(0x7f1c0477, float:2.0738275E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0393
        L_0x0392:
            r4 = r7
        L_0x0393:
            r2.<init>(r3, r4)
            r8[r1] = r2
            r1 = 18
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x03b0
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x03b0
            r4 = 2132542581(0x7f1c0475, float:2.073827E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x03b1
        L_0x03b0:
            r3 = r7
        L_0x03b1:
            android.content.Context r4 = r6.getContext()
            if (r4 == 0) goto L_0x03c4
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x03c4
            r7 = 2132542581(0x7f1c0475, float:2.073827E38)
            java.lang.String r7 = r4.getString(r7)
        L_0x03c4:
            r2.<init>(r3, r7)
            r8[r1] = r2
            java.util.List r8 = p2628d.p2629a.C52575l.m112101c(r8)
        L_0x03cd:
            r6.f101296o = r8
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r7 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r8 = r6.getContext()
            r7.<init>(r8)
            r6.f101295n = r7
            java.util.List<com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct> r7 = r6.f101296o
            if (r7 == 0) goto L_0x03fc
            com.ss.android.ugc.aweme.proaccount.b r7 = new com.ss.android.ugc.aweme.proaccount.b
            android.support.v4.app.FragmentActivity r8 = r6.getActivity()
            if (r8 != 0) goto L_0x03e9
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x03e9:
            java.lang.String r1 = "activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
            android.content.Context r8 = (android.content.Context) r8
            java.util.List<com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct> r1 = r6.f101296o
            if (r1 != 0) goto L_0x03f7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x03f7:
            r7.<init>(r8, r1)
            r6.f101289c = r7
        L_0x03fc:
            r7 = 2132017945(0x7f140319, float:1.9674183E38)
            android.view.View r8 = r6.mo80767a(r7)
            android.support.v7.widget.RecyclerView r8 = (android.support.p043v7.widget.RecyclerView) r8
            java.lang.String r1 = "category_rv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r1 = r6.f101295n
            if (r1 != 0) goto L_0x0413
            java.lang.String r2 = "mLinearLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0413:
            android.support.v7.widget.RecyclerView$i r1 = (android.support.p043v7.widget.RecyclerView.C1332i) r1
            r8.setLayoutManager(r1)
            android.view.View r7 = r6.mo80767a(r7)
            android.support.v7.widget.RecyclerView r7 = (android.support.p043v7.widget.RecyclerView) r7
            java.lang.String r8 = "category_rv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.proaccount.b r8 = r6.f101289c
            android.support.v7.widget.RecyclerView$a r8 = (android.support.p043v7.widget.RecyclerView.C1322a) r8
            r7.setAdapter(r8)
            com.ss.android.ugc.aweme.proaccount.b r7 = r6.f101289c
            if (r7 == 0) goto L_0x0438
            r8 = r6
            com.ss.android.ugc.aweme.proaccount.b$c r8 = (com.p683ss.android.ugc.aweme.proaccount.C39676b.C39679c) r8
            java.lang.String r1 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r1)
            r7.f101259a = r8
        L_0x0438:
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r8 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getCurUser()
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r8 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0462 }
            java.lang.String r1 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)     // Catch:{ a -> 0x0462 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo r8 = r8.getProAccountEnableDetailInfo()     // Catch:{ a -> 0x0462 }
            java.lang.Boolean r8 = r8.getCanSetProaccountGender()     // Catch:{ a -> 0x0462 }
            java.lang.String r1 = "SettingsReader.get().pro…tCanSetProaccountGender()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)     // Catch:{ a -> 0x0462 }
            boolean r8 = r8.booleanValue()     // Catch:{ a -> 0x0462 }
            r6.f101293k = r8     // Catch:{ a -> 0x0462 }
            goto L_0x0464
        L_0x0462:
            r6.f101293k = r0
        L_0x0464:
            java.lang.String r8 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            r7.getGender()
            boolean r8 = r6.f101293k
            r1 = 2132542469(0x7f1c0405, float:2.0738044E38)
            r2 = 2132017947(0x7f14031b, float:1.9674187E38)
            if (r8 == 0) goto L_0x0484
            int r8 = r6.f101294l
            if (r8 != 0) goto L_0x0484
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r8.setText(r1)
            goto L_0x04a0
        L_0x0484:
            boolean r8 = r7.isPhoneBinded()
            if (r8 != 0) goto L_0x0494
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r8.setText(r1)
            goto L_0x04a0
        L_0x0494:
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r1 = 2132542468(0x7f1c0404, float:2.0738042E38)
            r8.setText(r1)
        L_0x04a0:
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            java.lang.String r1 = "category_tv_next"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
            android.support.v4.app.FragmentActivity r1 = r6.getActivity()
            if (r1 != 0) goto L_0x04b4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x04b4:
            android.content.Context r1 = (android.content.Context) r1
            r3 = 2131952418(0x7f130322, float:1.9541278E38)
            android.graphics.drawable.Drawable r1 = android.support.p030v4.content.C0726c.m2091a(r1, r3)
            r8.setBackground(r1)
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            java.lang.String r1 = "category_tv_next"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
            r8.setEnabled(r0)
            r8 = 2132017946(0x7f14031a, float:1.9674185E38)
            android.view.View r8 = r6.mo80767a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r8
            if (r8 == 0) goto L_0x04e8
            android.content.Context r0 = r6.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r0.mo19223a()
            r8.setBuilder(r0)
        L_0x04e8:
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            java.lang.String r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28903b
            r8.setFontType(r0)
            android.view.View r8 = r6.mo80767a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.proaccount.d$d r0 = new com.ss.android.ugc.aweme.proaccount.d$d
            r0.<init>(r6, r7)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r8.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.proaccount.C39686d.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.pb, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo80763a(String str, String str2, boolean z) {
        boolean z2;
        C52711k.m112240b(str, "itemName");
        C52711k.m112240b(str2, "itemID");
        this.f101290d = str;
        this.f101291e = str2;
        String str3 = this.f101290d;
        if (str3 == null) {
            C52711k.m112237a("mCheckedCategory");
        }
        if (str3.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            DmtTextView dmtTextView = (DmtTextView) mo80767a((int) R.id.r3);
            C52711k.m112236a((Object) dmtTextView, "category_tv_next");
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            dmtTextView.setBackground(C0726c.m2091a((Context) activity, (int) R.drawable.om));
            DmtTextView dmtTextView2 = (DmtTextView) mo80767a((int) R.id.r3);
            C52711k.m112236a((Object) dmtTextView2, "category_tv_next");
            dmtTextView2.setEnabled(true);
            ((DmtTextView) mo80767a((int) R.id.r3)).setTextColor(getResources().getColor(R.color.auk));
        }
    }
}
