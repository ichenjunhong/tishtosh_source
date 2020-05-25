package com.bytedance.android.live.wallet.p261d;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.live.wallet.C4311b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip;
import com.bytedance.android.live.wallet.model.C4467f;
import com.bytedance.android.live.wallet.p258a.C4287a.C4289b;
import com.bytedance.android.live.wallet.p260c.C4374k;
import com.bytedance.android.live.wallet.p260c.C4374k.C4375a;
import com.bytedance.android.live.wallet.p264g.p265a.C4429d;
import com.bytedance.android.live.wallet.p264g.p266b.C4452c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4579ar;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;
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

/* renamed from: com.bytedance.android.live.wallet.d.b */
public final class C4387b extends C3846a implements C4452c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f12014a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4387b.class), "extJson", "getExtJson()Lorg/json/JSONObject;"))};

    /* renamed from: g */
    public static final C4388a f12015g = new C4388a(null);

    /* renamed from: b */
    public C4429d f12016b;

    /* renamed from: c */
    public ProgressDialog f12017c;

    /* renamed from: d */
    public List<? extends C4467f> f12018d;

    /* renamed from: e */
    public ChargeDeal f12019e;

    /* renamed from: f */
    public C8807k f12020f;

    /* renamed from: h */
    private boolean f12021h;

    /* renamed from: i */
    private final C52668f f12022i = C52732g.m112285a(C4389b.f12025a);

    /* renamed from: j */
    private TextView f12023j;

    /* renamed from: k */
    private HashMap f12024k;

    /* renamed from: com.bytedance.android.live.wallet.d.b$a */
    public static final class C4388a {
        private C4388a() {
        }

        public /* synthetic */ C4388a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$b */
    static final class C4389b extends C52712l implements C52670a<JSONObject> {

        /* renamed from: a */
        public static final C4389b f12025a = new C4389b();

        C4389b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new JSONObject();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$c */
    static final class C4390c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4387b f12026a;

        C4390c(C4387b bVar) {
            this.f12026a = bVar;
        }

        public final void onClick(View view) {
            C4429d dVar = this.f12026a.f12016b;
            if (dVar != null) {
                dVar.mo10229b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$d */
    static final class C4391d implements OnClickListener {

        /* renamed from: a */
        public static final C4391d f12027a = new C4391d();

        C4391d() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$e */
    static final class C4392e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4387b f12028a;

        C4392e(C4387b bVar) {
            this.f12028a = bVar;
        }

        public final void onClick(View view) {
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(this.f12028a.getContext(), C4704c.m11227b("https://m.helo-app.com/magic/page/ejs/5cf7382f4a9c33022159d5a6?appType=Helo"));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$f */
    static final class C4393f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4387b f12029a;

        C4393f(C4387b bVar) {
            this.f12029a = bVar;
        }

        public final void onClick(View view) {
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(this.f12029a.getContext(), C4704c.m11227b("https://webcast-helo.sgsnssdk.com/falcon/webcast_helo/page/record/recharge/index.html").mo10505a(C3922z.m9903a((int) R.string.ezj)));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$g */
    static final class C4394g<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C4387b f12030a;

        /* renamed from: b */
        final /* synthetic */ View f12031b;

        C4394g(C4387b bVar, View view) {
            this.f12030a = bVar;
            this.f12031b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            C4387b bVar = this.f12030a;
            View view = this.f12031b;
            C52711k.m112236a((Object) view, "rootView");
            bVar.mo10212a(view);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$h */
    public static final class C4395h implements C4289b {

        /* renamed from: a */
        final /* synthetic */ C4387b f12032a;

        /* renamed from: com.bytedance.android.live.wallet.d.b$h$a */
        static final class C4396a implements C4375a {

            /* renamed from: a */
            final /* synthetic */ C4395h f12033a;

            /* renamed from: b */
            final /* synthetic */ ChargeDeal f12034b;

            /* renamed from: c */
            final /* synthetic */ C8807k f12035c;

            C4396a(C4395h hVar, ChargeDeal chargeDeal, C8807k kVar) {
                this.f12033a = hVar;
                this.f12034b = chargeDeal;
                this.f12035c = kVar;
            }

            /* renamed from: a */
            public final void mo10159a(String str) {
                C52711k.m112240b(str, "email");
                C4429d dVar = this.f12033a.f12032a.f12016b;
                if (dVar != null) {
                    dVar.mo10228a(this.f12034b, this.f12035c, str);
                }
            }
        }

        C4395h(C4387b bVar) {
            this.f12032a = bVar;
        }

        /* renamed from: a */
        public final void mo10042a(C8807k kVar, ChargeDeal chargeDeal, int i) {
            String str;
            C52711k.m112240b(kVar, "channel");
            C52711k.m112240b(chargeDeal, "deal");
            this.f12032a.f12019e = chargeDeal;
            this.f12032a.f12020f = kVar;
            Map hashMap = new HashMap();
            hashMap.put("money", String.valueOf(chargeDeal.f23691e + chargeDeal.f23692f));
            hashMap.put("request_page", "my_profile");
            String str2 = "pay_method";
            if (kVar == C8807k.GOOGLE) {
                str = "google_pay";
            } else {
                str = kVar.getValue();
            }
            C52711k.m112236a((Object) str, "if (channel == PayChanne…l.value\n                }");
            hashMap.put(str2, str);
            C8049c.m15979a().mo14202a("livesdk_recharge_click", hashMap, new Object[0]);
            switch (C4398c.f12037a[kVar.ordinal()]) {
                case 1:
                    C4429d dVar = this.f12032a.f12016b;
                    if (dVar != null) {
                        dVar.mo10228a(chargeDeal, C8807k.GOOGLE, "");
                        break;
                    } else {
                        return;
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                    if (i == 1) {
                        this.f12032a.getChildFragmentManager().mo2225a().mo2178a((Fragment) C4374k.m10673a(new C4396a(this, chargeDeal, kVar)), "VIGO_PAY_INPUT_DIALOG_FRAGMENT_TAG").mo2195c();
                        return;
                    }
                    C4429d dVar2 = this.f12032a.f12016b;
                    if (dVar2 != null) {
                        dVar2.mo10228a(chargeDeal, kVar, "");
                        break;
                    } else {
                        return;
                    }
                case 6:
                    C4429d dVar3 = this.f12032a.f12016b;
                    if (dVar3 != null) {
                        dVar3.mo10228a(chargeDeal, C8807k.HUOLI, "");
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.b$i */
    static final class C4397i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4387b f12036a;

        C4397i(C4387b bVar) {
            this.f12036a = bVar;
        }

        public final void run() {
            Boolean bool;
            C4526c<Boolean> cVar = C4525b.f12353aV;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
            if (!((Boolean) cVar.mo10345a()).booleanValue()) {
                View view = this.f12036a.getView();
                if (view != null) {
                    WalletPagerSlidingTabStrip walletPagerSlidingTabStrip = (WalletPagerSlidingTabStrip) view.findViewById(R.id.be9);
                    if (walletPagerSlidingTabStrip != null) {
                        bool = Boolean.valueOf(walletPagerSlidingTabStrip.mo10167a());
                        C4526c<Boolean> cVar2 = C4525b.f12353aV;
                        C52711k.m112236a((Object) cVar2, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
                        cVar2.mo10346a(bool);
                    }
                }
                bool = null;
                C4526c<Boolean> cVar22 = C4525b.f12353aV;
                C52711k.m112236a((Object) cVar22, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
                cVar22.mo10346a(bool);
            }
        }
    }

    /* renamed from: d */
    public final void mo10132d() {
    }

    /* renamed from: c */
    public final void mo10131c() {
        ProgressDialog progressDialog = this.f12017c;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f12017c;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
        }
    }

    /* renamed from: e */
    public final void mo10155e() {
        View view = getView();
        if (view != null) {
            LoadingStatusView loadingStatusView = (LoadingStatusView) view.findViewById(R.id.csv);
            if (loadingStatusView != null) {
                loadingStatusView.mo9843b();
            }
        }
    }

    /* renamed from: f */
    public final void mo10156f() {
        View view = getView();
        if (view != null) {
            LoadingStatusView loadingStatusView = (LoadingStatusView) view.findViewById(R.id.csv);
            if (loadingStatusView != null) {
                loadingStatusView.mo9842a();
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C4429d dVar = this.f12016b;
        if (dVar != null) {
            dVar.mo8247a();
        }
        this.f12016b = null;
        if (this.f12024k != null) {
            this.f12024k.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo10127a(Exception exc) {
        mo10128a(exc, 0);
    }

    /* renamed from: a */
    public final void mo10122a(int i) {
        if (this.f12017c == null) {
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing()) {
                ProgressDialog a = C4579ar.m10999a(getActivity());
                a.setCancelable(false);
                a.setCanceledOnTouchOutside(false);
                this.f12017c = a;
            }
        }
        ProgressDialog progressDialog = this.f12017c;
        if (progressDialog != null && !progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f12017c;
            if (progressDialog2 != null) {
                progressDialog2.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo10212a(View view) {
        C52711k.m112240b(view, "view");
        TextView textView = this.f12023j;
        if (textView != null) {
            C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
            C52711k.m112236a((Object) walletCenter, "ServiceManager.getServic…          .walletCenter()");
            textView.setText(String.valueOf(walletCenter.mo10092b()));
        }
    }

    /* renamed from: a */
    public final void mo10126a(C8685b bVar) {
        int i;
        if (bVar != null) {
            if (bVar.f23720c == C8807k.ONECARD) {
                i = R.string.f3c;
            } else if (bVar.f23720c == C8807k.BOKU) {
                i = R.string.f3d;
            } else {
                i = R.string.f3_;
            }
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(getContext(), C4704c.m11227b(bVar.f23719b).mo10505a(C3922z.m9903a(i)));
        }
    }

    /* renamed from: b */
    public final void mo10154b(Exception exc, int i) {
        View view = getView();
        if (view != null) {
            LoadingStatusView loadingStatusView = (LoadingStatusView) view.findViewById(R.id.csv);
            if (loadingStatusView != null) {
                loadingStatusView.mo9845d();
            }
        }
        if (exc instanceof C2949a) {
            C2949a aVar = (C2949a) exc;
            if (!TextUtils.isEmpty(aVar.getPrompt())) {
                C4204a.m10423a(getContext(), aVar.getPrompt());
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C52711k.m112236a((Object) activity, "this");
            this.f12016b = new C4429d(activity);
        }
        C4429d dVar = this.f12016b;
        if (dVar != null) {
            dVar.mo8520a(this);
        }
        C4429d dVar2 = this.f12016b;
        if (dVar2 != null) {
            dVar2.mo10229b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10123a(int r6, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult r7) {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.android.live.user.a> r7 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)
            com.bytedance.android.live.user.a r7 = (com.bytedance.android.live.user.C4282a) r7
            com.bytedance.android.livesdk.user.e r7 = r7.user()
            java.lang.String r0 = "ServiceManager.getServic…rvice::class.java).user()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.bytedance.android.live.base.model.user.i r7 = r7.mo14521a()
            java.lang.String r0 = "ServiceManager.getServic….java).user().currentUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            long r0 = r7.getPayScores()
            r7 = 0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0045
            android.support.v4.app.k r0 = r5.getChildFragmentManager()
            java.lang.String r1 = "FIRST_RECHARGE_TAG"
            android.support.v4.app.Fragment r0 = r0.mo2224a(r1)
            if (r0 == 0) goto L_0x0045
            android.content.Context r0 = r5.getContext()
            r1 = 2132550600(0x7f1c23c8, float:2.0754535E38)
            java.lang.String r1 = r5.getString(r1)
            com.bytedance.android.live.uikit.p257c.C4204a.m10423a(r0, r1)
            goto L_0x0053
        L_0x0045:
            android.content.Context r0 = r5.getContext()
            r1 = 2132550046(0x7f1c219e, float:2.0753412E38)
            java.lang.String r1 = r5.getString(r1)
            com.bytedance.android.live.uikit.p257c.C4204a.m10423a(r0, r1)
        L_0x0053:
            com.bytedance.android.livesdk.aa.a r0 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.k.e r1 = new com.bytedance.android.livesdk.k.e
            r1.<init>(r6)
            r0.mo10301a(r1)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r6 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.p245d.C4116c.m10249a(r6)
            com.bytedance.android.live.wallet.IWalletService r6 = (com.bytedance.android.live.wallet.IWalletService) r6
            com.bytedance.android.live.wallet.b r6 = r6.walletCenter()
            r6.mo10097e()
            com.bytedance.android.live.wallet.g.a.d r6 = r5.f12016b
            if (r6 == 0) goto L_0x0075
            r6.mo10229b()
        L_0x0075:
            android.view.View r6 = r5.getView()
            if (r6 == 0) goto L_0x008b
            r0 = 2132019234(0x7f140822, float:1.9676797E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x008b
            r0 = 8
            r6.setVisibility(r0)
        L_0x008b:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = "money"
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r1 = r5.f12019e
            if (r1 == 0) goto L_0x009b
            int r1 = r1.f23692f
            goto L_0x009c
        L_0x009b:
            r1 = 0
        L_0x009c:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r2 = r5.f12019e
            if (r2 == 0) goto L_0x00a3
            int r2 = r2.f23691e
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            int r1 = r1 + r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6.put(r0, r1)
            java.lang.String r0 = "pay_method"
            com.bytedance.android.livesdkapi.host.k r1 = r5.f12020f
            com.bytedance.android.livesdkapi.host.k r2 = com.bytedance.android.livesdkapi.host.C8807k.GOOGLE
            if (r1 != r2) goto L_0x00b7
            java.lang.String r1 = "google_pay"
            goto L_0x00c3
        L_0x00b7:
            com.bytedance.android.livesdkapi.host.k r1 = r5.f12020f
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r1.getValue()
            if (r1 != 0) goto L_0x00c3
        L_0x00c1:
            java.lang.String r1 = ""
        L_0x00c3:
            r6.put(r0, r1)
            java.lang.String r0 = "request_page"
            java.lang.String r1 = "my_profile"
            r6.put(r0, r1)
            com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r1 = "livesdk_recharge_success"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r0.mo14202a(r1, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p261d.C4387b.mo10123a(int, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult):void");
    }

    /* renamed from: a */
    public final void mo10128a(Exception exc, int i) {
        if (exc instanceof C2949a) {
            C2949a aVar = (C2949a) exc;
            if (!TextUtils.isEmpty(aVar.getPrompt())) {
                C4204a.m10423a(getContext(), aVar.getPrompt());
                return;
            }
        }
        if (i != 0) {
            C4204a.m10421a(getContext(), i);
        } else {
            C4204a.m10421a(getContext(), (int) R.string.e_t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0238 A[LOOP:3: B:66:0x012b->B:141:0x0238, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0186 A[EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  
    EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  
    EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0186 A[EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  
    EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0186 A[EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0197  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10152a(java.lang.String r18, java.util.List<com.bytedance.android.live.wallet.model.C4467f> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "currencyCode"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.lang.String r3 = "vigoRechargeList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            boolean r3 = r0.f12021h
            r4 = 1
            if (r3 != 0) goto L_0x0041
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x0022:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.bytedance.android.live.wallet.model.f r6 = (com.bytedance.android.live.wallet.model.C4467f) r6
            java.lang.String r6 = r6.f12197a
            java.lang.String r7 = "Huoli"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r7)
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0022
            r3.add(r5)
            goto L_0x0022
        L_0x003e:
            r2 = r3
            java.util.List r2 = (java.util.List) r2
        L_0x0041:
            android.view.View r3 = r17.getView()
            r5 = 0
            if (r3 == 0) goto L_0x0056
            r6 = 2132020770(0x7f140e22, float:1.9679913E38)
            android.view.View r3 = r3.findViewById(r6)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            if (r3 == 0) goto L_0x0056
            r3.setVisibility(r5)
        L_0x0056:
            android.view.View r3 = r17.getView()
            r6 = 2132020738(0x7f140e02, float:1.9679848E38)
            if (r3 == 0) goto L_0x0074
            android.view.View r3 = r3.findViewById(r6)
            com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip r3 = (com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip) r3
            if (r3 == 0) goto L_0x0074
            int r7 = r2.size()
            if (r7 <= r4) goto L_0x006f
            r7 = 0
            goto L_0x0071
        L_0x006f:
            r7 = 8
        L_0x0071:
            r3.setVisibility(r7)
        L_0x0074:
            boolean r3 = r2.isEmpty()
            r7 = 0
            if (r3 == 0) goto L_0x007f
            r0.mo10154b(r7, r5)
            return
        L_0x007f:
            r0.f12018d = r2
            android.view.View r3 = r17.getView()
            r8 = 2132024585(0x7f141d09, float:1.968765E38)
            if (r3 == 0) goto L_0x00a3
            android.view.View r3 = r3.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r3 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r3
            if (r3 == 0) goto L_0x00a3
            com.bytedance.android.live.wallet.a.b r9 = new com.bytedance.android.live.wallet.a.b
            com.bytedance.android.live.wallet.d.b$h r10 = new com.bytedance.android.live.wallet.d.b$h
            r10.<init>(r0)
            com.bytedance.android.live.wallet.a.a$b r10 = (com.bytedance.android.live.wallet.p258a.C4287a.C4289b) r10
            r9.<init>(r2, r10)
            android.support.v4.view.PagerAdapter r9 = (android.support.p030v4.view.PagerAdapter) r9
            r3.setAdapter(r9)
        L_0x00a3:
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r9 = r3.iterator()
            r10 = 0
            r11 = 0
        L_0x00ac:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00c6
            java.lang.Object r12 = r9.next()
            int r13 = r10 + 1
            if (r10 >= 0) goto L_0x00bd
            p2628d.p2629a.C52575l.m112100b()
        L_0x00bd:
            com.bytedance.android.live.wallet.model.f r12 = (com.bytedance.android.live.wallet.model.C4467f) r12
            int r12 = r12.f12209m
            if (r12 != r4) goto L_0x00c4
            r11 = r10
        L_0x00c4:
            r10 = r13
            goto L_0x00ac
        L_0x00c6:
            java.util.Iterator r3 = r3.iterator()
            boolean r9 = r3.hasNext()
            if (r9 != 0) goto L_0x00d3
            r9 = r7
            goto L_0x0186
        L_0x00d3:
            java.lang.Object r9 = r3.next()
            boolean r10 = r3.hasNext()
            if (r10 != 0) goto L_0x00df
            goto L_0x0186
        L_0x00df:
            r10 = r9
            com.bytedance.android.live.wallet.model.f r10 = (com.bytedance.android.live.wallet.model.C4467f) r10
            java.lang.String r12 = r10.f12197a
            java.lang.String r13 = "Pay by mobile"
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r13)
            if (r12 == 0) goto L_0x0123
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r10 = r10.f12206j
            if (r10 == 0) goto L_0x0121
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r10 = r10.iterator()
        L_0x00fd:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x011a
            java.lang.Object r13 = r10.next()
            r14 = r13
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r14 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal) r14
            if (r14 == 0) goto L_0x010f
            java.lang.String r14 = r14.f23693g
            goto L_0x0110
        L_0x010f:
            r14 = r7
        L_0x0110:
            boolean r14 = p2628d.p2639f.p2641b.C52711k.m112239a(r14, r1)
            if (r14 == 0) goto L_0x00fd
            r12.add(r13)
            goto L_0x00fd
        L_0x011a:
            java.util.List r12 = (java.util.List) r12
            int r10 = r12.size()
            goto L_0x012b
        L_0x0121:
            r10 = 0
            goto L_0x012b
        L_0x0123:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r10 = r10.f12206j
            if (r10 == 0) goto L_0x0121
            int r10 = r10.size()
        L_0x012b:
            java.lang.Object r12 = r3.next()
            r13 = r12
            com.bytedance.android.live.wallet.model.f r13 = (com.bytedance.android.live.wallet.model.C4467f) r13
            java.lang.String r14 = r13.f12197a
            java.lang.String r15 = "Pay by mobile"
            boolean r14 = p2628d.p2639f.p2641b.C52711k.m112239a(r14, r15)
            if (r14 == 0) goto L_0x0174
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r13 = r13.f12206j
            if (r13 == 0) goto L_0x0172
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.Iterator r13 = r13.iterator()
        L_0x014d:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x016b
            java.lang.Object r15 = r13.next()
            r7 = r15
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r7 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal) r7
            if (r7 == 0) goto L_0x015f
            java.lang.String r7 = r7.f23693g
            goto L_0x0160
        L_0x015f:
            r7 = 0
        L_0x0160:
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r1)
            if (r7 == 0) goto L_0x0169
            r14.add(r15)
        L_0x0169:
            r7 = 0
            goto L_0x014d
        L_0x016b:
            java.util.List r14 = (java.util.List) r14
            int r7 = r14.size()
            goto L_0x017c
        L_0x0172:
            r7 = 0
            goto L_0x017c
        L_0x0174:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r7 = r13.f12206j
            if (r7 == 0) goto L_0x0172
            int r7 = r7.size()
        L_0x017c:
            if (r10 >= r7) goto L_0x0180
            r10 = r7
            r9 = r12
        L_0x0180:
            boolean r7 = r3.hasNext()
            if (r7 != 0) goto L_0x0238
        L_0x0186:
            com.bytedance.android.live.wallet.model.f r9 = (com.bytedance.android.live.wallet.model.C4467f) r9
            if (r9 == 0) goto L_0x0193
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r1 = r9.f12206j
            if (r1 == 0) goto L_0x0193
            int r1 = r1.size()
            goto L_0x0194
        L_0x0193:
            r1 = 0
        L_0x0194:
            r3 = 6
            if (r1 <= r3) goto L_0x01d1
            android.view.View r3 = r17.getView()
            if (r3 == 0) goto L_0x01d1
            android.view.View r3 = r3.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r3 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r3
            if (r3 == 0) goto L_0x01d1
            android.view.View r7 = r17.getView()
            if (r7 == 0) goto L_0x01cd
            android.view.View r7 = r7.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r7 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r7
            if (r7 == 0) goto L_0x01cd
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 == 0) goto L_0x01cd
            int r9 = r1 % 3
            if (r9 != 0) goto L_0x01c0
            int r1 = r1 / 3
            goto L_0x01c3
        L_0x01c0:
            int r1 = r1 / 3
            int r1 = r1 + r4
        L_0x01c3:
            int r1 = r1 * 72
            float r1 = (float) r1
            int r1 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r1)
            r7.height = r1
            goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            r3.setLayoutParams(r7)
        L_0x01d1:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x01e6
            android.view.View r1 = r1.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r1 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r1
            if (r1 == 0) goto L_0x01e6
            int r2 = r2.size()
            r1.setOffscreenPageLimit(r2)
        L_0x01e6:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip r1 = (com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip) r1
            if (r1 == 0) goto L_0x020d
            android.view.View r2 = r17.getView()
            if (r2 == 0) goto L_0x0204
            android.view.View r2 = r2.findViewById(r8)
            r7 = r2
            com.bytedance.android.live.uikit.rtl.RtlViewPager r7 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r7
            r16 = r7
            goto L_0x0206
        L_0x0204:
            r16 = 0
        L_0x0206:
            r2 = r16
            android.support.v4.view.ViewPager r2 = (android.support.p030v4.view.ViewPager) r2
            r1.setViewPager(r2)
        L_0x020d:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x021e
            android.view.View r1 = r1.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r1 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r1
            if (r1 == 0) goto L_0x021e
            r1.setCurrentItem(r11, r5)
        L_0x021e:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x0237
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip r1 = (com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip) r1
            if (r1 == 0) goto L_0x0237
            com.bytedance.android.live.wallet.d.b$i r2 = new com.bytedance.android.live.wallet.d.b$i
            r2.<init>(r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
            return
        L_0x0237:
            return
        L_0x0238:
            r7 = 0
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p261d.C4387b.mo10152a(java.lang.String, java.util.List):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 666) {
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
            C4429d dVar = this.f12016b;
            if (dVar != null) {
                dVar.mo10229b();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ak2, viewGroup, false);
        Map hashMap = new HashMap();
        hashMap.put("request_page", "wallet");
        C8049c.m15979a().mo14202a("livesdk_diamond_page_show", hashMap, new Object[0]);
        C52711k.m112236a((Object) inflate, "rootView");
        this.f12023j = (TextView) inflate.findViewById(R.id.db0);
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.ant, (LoadingStatusView) inflate.findViewById(R.id.csv), false);
        inflate2.setOnClickListener(new C4390c(this));
        ((LoadingStatusView) inflate.findViewById(R.id.csv)).setBuilder(C4239a.m10480a(getContext()).mo9850b((int) R.string.e_b).mo9852c(inflate2).mo9847a(getResources().getDimensionPixelSize(R.dimen.o4)));
        TextView textView = (TextView) inflate.findViewById(R.id.d5v);
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            C52711k.m112236a((Object) paint, "paint");
            paint.setFlags(8);
            TextPaint paint2 = textView.getPaint();
            C52711k.m112236a((Object) paint2, "paint");
            paint2.setAntiAlias(true);
            textView.setOnClickListener(C4391d.f12027a);
        }
        inflate.findViewById(R.id.d__);
        View findViewById = inflate.findViewById(R.id.a5j);
        View findViewById2 = inflate.findViewById(R.id.c9u);
        findViewById.setOnClickListener(new C4392e(this));
        findViewById2.setOnClickListener(new C4393f(this));
        mo10212a(inflate);
        ((C4002ac) ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9405a((C1710e<? super T>) new C4394g<Object>(this, inflate));
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        return inflate;
    }
}
