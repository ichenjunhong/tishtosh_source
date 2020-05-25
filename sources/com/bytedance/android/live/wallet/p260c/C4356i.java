package com.bytedance.android.live.wallet.p260c;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.C4311b;
import com.bytedance.android.live.wallet.C4335c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip;
import com.bytedance.android.live.wallet.model.C4467f;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p258a.C4287a.C4289b;
import com.bytedance.android.live.wallet.p258a.C4293b;
import com.bytedance.android.live.wallet.p260c.C4374k.C4375a;
import com.bytedance.android.live.wallet.p264g.p265a.C4429d;
import com.bytedance.android.live.wallet.p264g.p266b.C4452c;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4579ar;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.live.C8664n;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.wallet.c.i */
public final class C4356i extends C6736d implements C4452c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f11930a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4356i.class), "mIsVertical", "getMIsVertical()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4356i.class), "mIsAnchor", "getMIsAnchor()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4356i.class), "mChargeReason", "getMChargeReason()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4356i.class), "mRequestPage", "getMRequestPage()Ljava/lang/String;"))};

    /* renamed from: i */
    public static final C4357a f11931i = new C4357a(null);

    /* renamed from: o */
    private static final int f11932o = 72;

    /* renamed from: b */
    public Activity f11933b;

    /* renamed from: c */
    public C4293b f11934c;

    /* renamed from: d */
    public ProgressDialog f11935d;

    /* renamed from: e */
    public C4429d f11936e;

    /* renamed from: f */
    public ChargeDeal f11937f;

    /* renamed from: g */
    public C8807k f11938g;

    /* renamed from: h */
    public C4335c f11939h;

    /* renamed from: k */
    private final C52668f f11940k = C52732g.m112285a(new C4364g(this));

    /* renamed from: l */
    private final C52668f f11941l = C52732g.m112285a(new C4363f(this));

    /* renamed from: m */
    private final C52668f f11942m = C52732g.m112285a(new C4362e(this));

    /* renamed from: n */
    private final C52668f f11943n = C52732g.m112285a(new C4365h(this));

    /* renamed from: p */
    private HashMap f11944p;

    /* renamed from: com.bytedance.android.live.wallet.c.i$a */
    public static final class C4357a {
        private C4357a() {
        }

        public /* synthetic */ C4357a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C4356i m10670a(Activity activity, Bundle bundle, DataCenter dataCenter, C4335c cVar, C8664n nVar) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(bundle, "bundle");
            C4356i iVar = new C4356i();
            iVar.f11933b = activity;
            iVar.f11939h = cVar;
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$b */
    static final class C4358b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4356i f11945a;

        C4358b(C4356i iVar) {
            this.f11945a = iVar;
        }

        public final void onClick(View view) {
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(this.f11945a.getContext(), C4704c.m11227b("https://api.hypstar.com/hotsoon/in_app/charge_agreement/").mo10505a(C3922z.m9903a((int) R.string.e4i)));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$c */
    public static final class C4359c implements C4289b {

        /* renamed from: a */
        final /* synthetic */ C4356i f11946a;

        /* renamed from: com.bytedance.android.live.wallet.c.i$c$a */
        static final class C4360a implements C4375a {

            /* renamed from: a */
            final /* synthetic */ C4359c f11947a;

            /* renamed from: b */
            final /* synthetic */ ChargeDeal f11948b;

            /* renamed from: c */
            final /* synthetic */ C8807k f11949c;

            C4360a(C4359c cVar, ChargeDeal chargeDeal, C8807k kVar) {
                this.f11947a = cVar;
                this.f11948b = chargeDeal;
                this.f11949c = kVar;
            }

            /* renamed from: a */
            public final void mo10159a(String str) {
                C52711k.m112240b(str, "email");
                C4429d dVar = this.f11947a.f11946a.f11936e;
                if (dVar != null) {
                    dVar.mo10228a(this.f11948b, this.f11949c, str);
                }
            }
        }

        C4359c(C4356i iVar) {
            this.f11946a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
            if (r5 == null) goto L_0x00d0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10042a(com.bytedance.android.livesdkapi.host.C8807k r8, com.bytedance.android.livesdkapi.depend.model.ChargeDeal r9, int r10) {
            /*
                r7 = this;
                java.lang.String r0 = "channel"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                java.lang.String r0 = "deal"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
                com.bytedance.android.live.wallet.c.i r0 = r7.f11946a
                r0.f11937f = r9
                int[] r0 = com.bytedance.android.live.wallet.p260c.C4373j.f11962a
                int r1 = r8.ordinal()
                r0 = r0[r1]
                r1 = 1
                switch(r0) {
                    case 1: goto L_0x006f;
                    case 2: goto L_0x002f;
                    case 3: goto L_0x002f;
                    case 4: goto L_0x002f;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x001b;
                    default: goto L_0x001a;
                }
            L_0x001a:
                goto L_0x0082
            L_0x001b:
                com.bytedance.android.live.wallet.c.i r8 = r7.f11946a
                com.bytedance.android.livesdkapi.host.k r10 = com.bytedance.android.livesdkapi.host.C8807k.HUOLI
                r8.f11938g = r10
                com.bytedance.android.live.wallet.c.i r8 = r7.f11946a
                com.bytedance.android.live.wallet.g.a.d r8 = r8.f11936e
                if (r8 == 0) goto L_0x0082
                com.bytedance.android.livesdkapi.host.k r10 = com.bytedance.android.livesdkapi.host.C8807k.HUOLI
                java.lang.String r0 = ""
                r8.mo10228a(r9, r10, r0)
                goto L_0x0082
            L_0x002f:
                com.bytedance.android.live.wallet.c.i r0 = r7.f11946a
                r0.f11938g = r8
                if (r10 != r1) goto L_0x0063
                com.bytedance.android.live.wallet.c.i$c$a r10 = new com.bytedance.android.live.wallet.c.i$c$a
                r10.<init>(r7, r9, r8)
                com.bytedance.android.live.wallet.c.k$a r10 = (com.bytedance.android.live.wallet.p260c.C4374k.C4375a) r10
                com.bytedance.android.live.wallet.c.k r8 = com.bytedance.android.live.wallet.p260c.C4374k.m10673a(r10)
                com.bytedance.android.live.wallet.c.i r10 = r7.f11946a
                android.app.Activity r10 = r10.f11933b
                boolean r0 = r10 instanceof android.support.p030v4.app.FragmentActivity
                if (r0 != 0) goto L_0x0049
                r10 = 0
            L_0x0049:
                android.support.v4.app.FragmentActivity r10 = (android.support.p030v4.app.FragmentActivity) r10
                if (r10 == 0) goto L_0x0082
                android.support.v4.app.k r10 = r10.getSupportFragmentManager()
                if (r10 == 0) goto L_0x0082
                android.support.v4.app.r r10 = r10.mo2225a()
                android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
                java.lang.String r0 = "VIGO_PAY_INPUT_DIALOG_FRAGMENT_TAG"
                android.support.v4.app.r r8 = r10.mo2178a(r8, r0)
                r8.mo2195c()
                goto L_0x0082
            L_0x0063:
                com.bytedance.android.live.wallet.c.i r10 = r7.f11946a
                com.bytedance.android.live.wallet.g.a.d r10 = r10.f11936e
                if (r10 == 0) goto L_0x0082
                java.lang.String r0 = ""
                r10.mo10228a(r9, r8, r0)
                goto L_0x0082
            L_0x006f:
                com.bytedance.android.live.wallet.c.i r8 = r7.f11946a
                com.bytedance.android.livesdkapi.host.k r10 = com.bytedance.android.livesdkapi.host.C8807k.GOOGLE
                r8.f11938g = r10
                com.bytedance.android.live.wallet.c.i r8 = r7.f11946a
                com.bytedance.android.live.wallet.g.a.d r8 = r8.f11936e
                if (r8 == 0) goto L_0x0082
                com.bytedance.android.livesdkapi.host.k r10 = com.bytedance.android.livesdkapi.host.C8807k.GOOGLE
                java.lang.String r0 = ""
                r8.mo10228a(r9, r10, r0)
            L_0x0082:
                int r8 = r9.f23691e
                int r9 = r9.f23692f
                int r8 = r8 + r9
                com.bytedance.android.livesdk.o.c r9 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                java.lang.String r10 = "livesdk_recharge_click"
                r0 = 5
                d.n[] r0 = new p2628d.C52847n[r0]
                java.lang.String r2 = "money"
                java.lang.String r8 = java.lang.String.valueOf(r8)
                d.n r8 = p2628d.C52856t.m112465a(r2, r8)
                r2 = 0
                r0[r2] = r8
                java.lang.String r8 = "request_page"
                com.bytedance.android.live.wallet.c.i r3 = r7.f11946a
                java.lang.String r3 = r3.mo10153b()
                d.n r8 = p2628d.C52856t.m112465a(r8, r3)
                r0[r1] = r8
                java.lang.String r8 = "charge_style"
                java.lang.String r3 = "window"
                d.n r8 = p2628d.C52856t.m112465a(r8, r3)
                r3 = 2
                r0[r3] = r8
                r8 = 3
                java.lang.String r4 = "pay_method"
                com.bytedance.android.live.wallet.c.i r5 = r7.f11946a
                com.bytedance.android.livesdkapi.host.k r5 = r5.f11938g
                com.bytedance.android.livesdkapi.host.k r6 = com.bytedance.android.livesdkapi.host.C8807k.GOOGLE
                if (r5 != r6) goto L_0x00c4
                java.lang.String r5 = "google_pay"
                goto L_0x00d2
            L_0x00c4:
                com.bytedance.android.live.wallet.c.i r5 = r7.f11946a
                com.bytedance.android.livesdkapi.host.k r5 = r5.f11938g
                if (r5 == 0) goto L_0x00d0
                java.lang.String r5 = r5.getValue()
                if (r5 != 0) goto L_0x00d2
            L_0x00d0:
                java.lang.String r5 = ""
            L_0x00d2:
                d.n r4 = p2628d.C52856t.m112465a(r4, r5)
                r0[r8] = r4
                r8 = 4
                java.lang.String r4 = "charge_reason"
                com.bytedance.android.live.wallet.c.i r5 = r7.f11946a
                java.lang.String r5 = r5.mo10150a()
                d.n r4 = p2628d.C52856t.m112465a(r4, r5)
                r0[r8] = r4
                java.util.Map r8 = p2628d.p2629a.C52550ab.m112050a(r0)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Class<com.bytedance.android.livesdk.o.c.j> r3 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
                r0[r2] = r3
                java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                r0[r1] = r2
                r9.mo14202a(r10, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4356i.C4359c.mo10042a(com.bytedance.android.livesdkapi.host.k, com.bytedance.android.livesdkapi.depend.model.ChargeDeal, int):void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$d */
    static final class C4361d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4356i f11950a;

        C4361d(C4356i iVar) {
            this.f11950a = iVar;
        }

        public final void onClick(View view) {
            C4429d dVar = this.f11950a.f11936e;
            if (dVar != null) {
                dVar.mo10229b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$e */
    static final class C4362e extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11951a;

        C4362e(C4356i iVar) {
            this.f11951a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f11951a.getArguments();
            if (arguments != null) {
                String string = arguments.getString(IWalletService.KEY_BUNDLE_CHARGE_REASON);
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$f */
    static final class C4363f extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11952a;

        C4363f(C4356i iVar) {
            this.f11952a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f11952a.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$g */
    static final class C4364g extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11953a;

        C4364g(C4356i iVar) {
            this.f11953a = iVar;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
            if (r0.orientation == 1) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r2 = this;
                com.bytedance.android.live.wallet.c.i r0 = r2.f11953a
                android.app.Activity r0 = r0.f11933b
                r1 = 1
                if (r0 == 0) goto L_0x0018
                android.content.res.Resources r0 = r0.getResources()
                if (r0 == 0) goto L_0x0018
                android.content.res.Configuration r0 = r0.getConfiguration()
                if (r0 == 0) goto L_0x0018
                int r0 = r0.orientation
                if (r0 != r1) goto L_0x0018
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4356i.C4364g.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$h */
    static final class C4365h extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11954a;

        C4365h(C4356i iVar) {
            this.f11954a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f11954a.getArguments();
            if (arguments != null) {
                String string = arguments.getString(IWalletService.KEY_BUNDLE_REQUEST_PAGE);
                if (string != null) {
                    return string;
                }
            }
            return "live_detail";
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$i */
    static final class C4366i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4356i f11955a;

        C4366i(C4356i iVar) {
            this.f11955a = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.bytedance.android.live.wallet.c.i r0 = r3.f11955a
                android.view.View r0 = r0.getView()
                if (r0 == 0) goto L_0x0018
                r1 = 2132020776(0x7f140e28, float:1.9679925E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getHeight()
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x003f
                com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12405bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Object r1 = r1.mo10345a()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L_0x002b
                goto L_0x0031
            L_0x002b:
                int r1 = r1.intValue()
                if (r1 == r0) goto L_0x003f
            L_0x0031:
                com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12405bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.mo10346a(r0)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4356i.C4366i.run():void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$j */
    static final class C4367j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4356i f11956a;

        C4367j(C4356i iVar) {
            this.f11956a = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.bytedance.android.live.wallet.c.i r0 = r3.f11956a
                android.view.View r0 = r0.getView()
                if (r0 == 0) goto L_0x0018
                r1 = 2132020776(0x7f140e28, float:1.9679925E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getHeight()
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x003f
                com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12405bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Object r1 = r1.mo10345a()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L_0x002b
                goto L_0x0031
            L_0x002b:
                int r1 = r1.intValue()
                if (r1 == r0) goto L_0x003f
            L_0x0031:
                com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12405bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.mo10346a(r0)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4356i.C4367j.run():void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$k */
    static final class C4368k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4356i f11957a;

        C4368k(C4356i iVar) {
            this.f11957a = iVar;
        }

        public final void run() {
            Boolean bool;
            C4526c<Boolean> cVar = C4525b.f12353aV;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
            if (!((Boolean) cVar.mo10345a()).booleanValue()) {
                View view = this.f11957a.getView();
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

    /* renamed from: com.bytedance.android.live.wallet.c.i$l */
    static final class C4369l<T> implements C1710e<C7713e> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11958a;

        C4369l(C4356i iVar) {
            this.f11958a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f11958a.onEvent((C7713e) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$m */
    static final class C4370m<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11959a;

        C4370m(C4356i iVar) {
            this.f11959a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            View view = this.f11959a.getView();
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.d9f);
                if (textView != null) {
                    C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
                    C52711k.m112236a((Object) walletCenter, "ServiceManager.getServic…          .walletCenter()");
                    textView.setText(String.valueOf(walletCenter.mo10092b()));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$n */
    static final class C4371n<T> implements C1710e<C3009i> {

        /* renamed from: a */
        final /* synthetic */ C4356i f11960a;

        C4371n(C4356i iVar) {
            this.f11960a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f11960a.mo10151a((C3009i) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.c.i$o */
    static final class C4372o<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C4372o f11961a = new C4372o();

        C4372o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    public static final C4356i m10651a(Activity activity, Bundle bundle, DataCenter dataCenter, C4335c cVar, C8664n nVar) {
        return C4357a.m10670a(activity, bundle, dataCenter, cVar, nVar);
    }

    /* renamed from: i */
    private boolean m10654i() {
        return ((Boolean) this.f11940k.getValue()).booleanValue();
    }

    /* renamed from: j */
    private boolean m10655j() {
        return ((Boolean) this.f11941l.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final String mo10150a() {
        return (String) this.f11942m.getValue();
    }

    /* renamed from: b */
    public final String mo10153b() {
        return (String) this.f11943n.getValue();
    }

    /* renamed from: d */
    public final void mo10132d() {
    }

    /* renamed from: a */
    public final void mo10152a(String str, List<? extends C4467f> list) {
        LayoutParams layoutParams;
        int i;
        int i2;
        Object obj;
        C52711k.m112240b(str, "currencyCode");
        C52711k.m112240b(list, "rechargeList");
        if (this.f11933b instanceof FragmentActivity) {
            View view = getView();
            int i3 = 0;
            if (view != null) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bgj);
                if (linearLayout != null) {
                    linearLayout.setVisibility(list.size() > 1 ? 0 : 8);
                }
            }
            RtlViewPager rtlViewPager = null;
            if (list.isEmpty()) {
                mo10154b(null, 0);
                return;
            }
            if (m10654i()) {
                View view2 = getView();
                if (view2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.bf8);
                    if (linearLayout2 != null) {
                        LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = -2;
                            View view3 = getView();
                            if (view3 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.bf8);
                                if (linearLayout3 != null) {
                                    linearLayout3.setLayoutParams(layoutParams2);
                                }
                            }
                        }
                    }
                }
            }
            Iterable<C4467f> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C4467f fVar : iterable) {
                if (C52711k.m112239a((Object) fVar.f12197a, (Object) "Pay by mobile")) {
                    List<ChargeDeal> list2 = fVar.f12206j;
                    if (list2 != null) {
                        Iterable iterable2 = list2;
                        Collection arrayList2 = new ArrayList();
                        for (Object next : iterable2) {
                            ChargeDeal chargeDeal = (ChargeDeal) next;
                            if (chargeDeal != null) {
                                obj = chargeDeal.f23693g;
                            } else {
                                obj = null;
                            }
                            if (C52711k.m112239a(obj, (Object) str)) {
                                arrayList2.add(next);
                            }
                        }
                        i2 = ((List) arrayList2).size();
                        arrayList.add(Integer.valueOf(i2));
                    }
                } else {
                    List<ChargeDeal> list3 = fVar.f12206j;
                    if (list3 != null) {
                        i2 = list3.size();
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                i2 = 0;
                arrayList.add(Integer.valueOf(i2));
            }
            Integer num = (Integer) C52575l.m112146i((List) arrayList);
            if (num != null) {
                i3 = num.intValue();
            }
            if (i3 > 6) {
                View view4 = getView();
                if (view4 != null) {
                    RtlViewPager rtlViewPager2 = (RtlViewPager) view4.findViewById(R.id.drk);
                    if (rtlViewPager2 != null) {
                        View view5 = getView();
                        if (view5 != null) {
                            RtlViewPager rtlViewPager3 = (RtlViewPager) view5.findViewById(R.id.drk);
                            if (rtlViewPager3 != null) {
                                layoutParams = rtlViewPager3.getLayoutParams();
                                if (layoutParams != null) {
                                    if (i3 % 3 == 0) {
                                        i = i3 / 3;
                                    } else {
                                        i = (i3 / 3) + 1;
                                    }
                                    layoutParams.height = C3922z.m9899a((float) (f11932o * i));
                                    rtlViewPager2.setLayoutParams(layoutParams);
                                }
                            }
                        }
                        layoutParams = null;
                        rtlViewPager2.setLayoutParams(layoutParams);
                    }
                }
            }
            if (m10654i()) {
                View view6 = getView();
                if (view6 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) view6.findViewById(R.id.bf8);
                    if (linearLayout4 != null) {
                        linearLayout4.post(new C4367j(this));
                    }
                }
            }
            C4293b bVar = this.f11934c;
            if (bVar != null) {
                C52711k.m112240b(str, "<set-?>");
                bVar.f11789a = str;
            }
            C4293b bVar2 = this.f11934c;
            if (bVar2 != null) {
                bVar2.mo10045a(list);
            }
            C4293b bVar3 = this.f11934c;
            if (bVar3 != null) {
                bVar3.notifyDataSetChanged();
            }
            View view7 = getView();
            if (view7 != null) {
                RtlViewPager rtlViewPager4 = (RtlViewPager) view7.findViewById(R.id.drk);
                if (rtlViewPager4 != null) {
                    rtlViewPager4.setOffscreenPageLimit(list.size());
                }
            }
            View view8 = getView();
            if (view8 != null) {
                WalletPagerSlidingTabStrip walletPagerSlidingTabStrip = (WalletPagerSlidingTabStrip) view8.findViewById(R.id.be9);
                if (walletPagerSlidingTabStrip != null) {
                    View view9 = getView();
                    if (view9 != null) {
                        rtlViewPager = (RtlViewPager) view9.findViewById(R.id.drk);
                    }
                    walletPagerSlidingTabStrip.setViewPager(rtlViewPager);
                }
            }
            View view10 = getView();
            if (view10 != null) {
                WalletPagerSlidingTabStrip walletPagerSlidingTabStrip2 = (WalletPagerSlidingTabStrip) view10.findViewById(R.id.be9);
                if (walletPagerSlidingTabStrip2 != null) {
                    walletPagerSlidingTabStrip2.post(new C4368k(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10128a(Exception exc, int i) {
        m10653b(exc);
    }

    public final void dismiss() {
        C4429d dVar = this.f11936e;
        if (dVar != null) {
            dVar.mo8247a();
        }
        super.dismiss();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f11944p != null) {
            this.f11944p.clear();
        }
    }

    /* renamed from: c */
    public final void mo10131c() {
        ProgressDialog progressDialog = this.f11935d;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f11935d;
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

    /* renamed from: a */
    public final void mo10127a(Exception exc) {
        m10653b(exc);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10654i();
        setStyle(1, R.style.xy);
    }

    public final void onEvent(C7713e eVar) {
        if (eVar != null && eVar.f21219c) {
            m10652a(eVar.f21218b, (CheckOrderOriginalResult) null, false);
        }
    }

    /* renamed from: b */
    private final void m10653b(Exception exc) {
        Context context = this.f11933b;
        if (exc == null) {
            exc = new Exception();
        }
        C4602l.m11047a(context, (Throwable) exc, (int) R.string.e4j);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C4429d dVar = this.f11936e;
        if (dVar != null) {
            dVar.mo8247a();
        }
        if (this.f11939h != null) {
            C4335c cVar = this.f11939h;
            if (cVar == null) {
                C52711k.m112234a();
            }
            cVar.mo10120a(dialogInterface);
        }
    }

    /* renamed from: a */
    public final void mo10122a(int i) {
        if (this.f11935d == null) {
            ProgressDialog a = C4579ar.m10999a(this.f11933b);
            a.setCancelable(false);
            a.setCanceledOnTouchOutside(false);
            this.f11935d = a;
        }
        ProgressDialog progressDialog = this.f11935d;
        if (progressDialog != null && !progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f11935d;
            if (progressDialog2 != null) {
                progressDialog2.show();
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            if (m10654i()) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (m10654i()) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-2, -1);
            }
        }
        return onCreateDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r7 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10151a(com.bytedance.android.live.base.model.user.C3009i r14) {
        /*
            r13 = this;
            boolean r0 = r13.m10655j()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002d
            if (r14 == 0) goto L_0x000f
            long r3 = r14.getPayScores()
            goto L_0x0011
        L_0x000f:
            r3 = 1
        L_0x0011:
            r5 = 0
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x002d
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdkapi.i.b> r14 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2
            java.lang.String r0 = "LiveSettingKeys.LIVE_FIR…_CHARGE_REWARD_PACKAGE_V2"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            java.lang.Object r14 = r14.mo9431a()
            if (r14 == 0) goto L_0x002d
            android.view.View r14 = r13.getView()
            if (r14 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r14 = 1
            goto L_0x002e
        L_0x002d:
            r14 = 0
        L_0x002e:
            r0 = 8
            r3 = 2132019234(0x7f140822, float:1.9676797E38)
            if (r14 == 0) goto L_0x0156
            android.view.View r4 = r13.getView()
            if (r4 == 0) goto L_0x0156
            android.view.View r4 = r4.findViewById(r3)
            if (r4 == 0) goto L_0x0156
            int r4 = r4.getVisibility()
            if (r4 != r0) goto L_0x0156
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdkapi.i.b> r4 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2
            java.lang.String r5 = "LiveSettingKeys.LIVE_FIR…_CHARGE_REWARD_PACKAGE_V2"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Object r4 = r4.mo9431a()
            com.bytedance.android.livesdkapi.i.b r4 = (com.bytedance.android.livesdkapi.p455i.C8811b) r4
            android.view.View r5 = r13.getView()
            r6 = 0
            if (r5 == 0) goto L_0x0065
            r7 = 2132019166(0x7f1407de, float:1.967666E38)
            android.view.View r5 = r5.findViewById(r7)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0066
        L_0x0065:
            r5 = r6
        L_0x0066:
            java.lang.String r7 = "value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r7 = r4.f24049b
            java.lang.String r8 = "value.chargeDeal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal$CurrencyPrice> r7 = r7.f23694h
            java.lang.String r8 = "value.chargeDeal.currencyPrice"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009c
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal$CurrencyPrice r9 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal.CurrencyPrice) r9
            java.lang.String r10 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.String r9 = r9.f23698a
            java.lang.String r10 = "USD"
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r10)
            if (r9 == 0) goto L_0x007f
            goto L_0x009d
        L_0x009c:
            r8 = r6
        L_0x009d:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal$CurrencyPrice r8 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal.CurrencyPrice) r8
            if (r8 == 0) goto L_0x00a5
            java.lang.String r7 = r8.f23700c
            if (r7 != 0) goto L_0x00a7
        L_0x00a5:
            java.lang.String r7 = ""
        L_0x00a7:
            android.view.View r8 = r13.getView()
            if (r8 == 0) goto L_0x00c8
            r9 = 2132023808(0x7f141a00, float:1.9686074E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x00c8
            r9 = 2132550341(0x7f1c22c5, float:2.075401E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.String r1 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r9, r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.setText(r1)
        L_0x00c8:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 2132550226(0x7f1c2252, float:2.0753777E38)
            java.lang.String r8 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r8)
            r7.append(r8)
            java.lang.String r8 = "x"
            r7.append(r8)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r8 = r4.f24049b
            java.lang.String r9 = "value.chargeDeal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            int r8 = r8.f23691e
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r9 = r4.f24049b
            java.lang.String r10 = "value.chargeDeal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            int r9 = r9.f23692f
            int r8 = r8 + r9
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.<init>(r7)
            android.text.Spannable r1 = (android.text.Spannable) r1
            r7 = 2131956071(0x7f131167, float:1.9548687E38)
            android.view.View r1 = r13.m10649a(r6, r1, r7)
            if (r1 == 0) goto L_0x0111
            if (r5 == 0) goto L_0x0111
            r5.addView(r1)
        L_0x0111:
            java.util.List<com.bytedance.android.livesdkapi.i.b$a> r1 = r4.f24048a
            java.lang.String r4 = "value.firstChargeRewards"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x011e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r1.next()
            com.bytedance.android.livesdkapi.i.b$a r4 = (com.bytedance.android.livesdkapi.p455i.C8811b.C8812a) r4
            java.lang.String r6 = "firstChargeReward"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            com.bytedance.android.live.base.model.ImageModel r8 = r4.f24053d
            java.lang.Class<com.bytedance.android.live.room.l> r6 = com.bytedance.android.live.room.C4193l.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.p245d.C4116c.m10249a(r6)
            com.bytedance.android.live.room.l r6 = (com.bytedance.android.live.room.C4193l) r6
            com.bytedance.android.livesdkapi.message.g r4 = r4.f24050a
            java.lang.String r7 = ""
            android.text.Spannable r9 = r6.parsePatternAndGetSpannable(r4, r7)
            java.lang.String r4 = "ServiceManager.getServic…irstChargeReward.msg, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r4)
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r13
            android.view.View r4 = r7.m10649a(r8, r9, -1)
            if (r4 == 0) goto L_0x011e
            if (r5 == 0) goto L_0x011e
            r5.addView(r4)
            goto L_0x011e
        L_0x0156:
            android.view.View r1 = r13.getView()
            if (r1 == 0) goto L_0x0169
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x0169
            if (r14 == 0) goto L_0x0165
            r0 = 0
        L_0x0165:
            r1.setVisibility(r0)
            return
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4356i.mo10151a(com.bytedance.android.live.base.model.user.i):void");
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

    /* renamed from: a */
    public final void mo10123a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
        m10652a(i, (CheckOrderOriginalResult) null, true);
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
        if (exc != null) {
            C4602l.m11046a(getContext(), exc);
        }
        C4293b bVar = this.f11934c;
        if (bVar != null) {
            bVar.mo10045a(C52575l.m112097a());
        }
        C4293b bVar2 = this.f11934c;
        if (bVar2 != null) {
            bVar2.notifyDataSetChanged();
        }
        View view2 = getView();
        if (view2 != null) {
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bf8);
            if (linearLayout != null) {
                linearLayout.post(new C4366i(this));
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Fragment fragment = this;
        ((C4002ac) C4495a.m10823a().mo10300a(C7713e.class).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a(fragment))).mo9405a((C1710e<? super T>) new C4369l<Object>(this));
        ((C4002ac) ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6525a((C2203w<T, ? extends R>) C4021e.m10137a(fragment))).mo9405a((C1710e<? super T>) new C4370m<Object>(this));
        C8333e user = ((C4282a) C4116c.m10249a(C4282a.class)).user();
        C52711k.m112236a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
        mo10151a(user.mo14521a());
        ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14536f().mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a(fragment))).mo9406a(new C4371n(this), C4372o.f11961a);
        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14535e().mo6158b();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        C4429d dVar = this.f11936e;
        if (dVar != null) {
            dVar.mo10229b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final View m10649a(ImageModel imageModel, Spannable spannable, int i) {
        if (getContext() == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LayoutParams(-2, C3922z.m9899a(16.0f)));
        ImageView imageView = new ImageView(linearLayout.getContext());
        int a = C3922z.m9899a(14.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        if (i != -1) {
            imageView.setImageResource(i);
        } else {
            C5213c.m11814a(imageView, imageModel);
        }
        TextView textView = new TextView(linearLayout.getContext());
        textView.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        textView.setLayoutParams(layoutParams2);
        textView.setTextColor(C3922z.m9909b((int) R.color.alt));
        textView.setGravity(17);
        int a2 = C3922z.m9899a(8.0f);
        textView.setPadding(a2 / 2, 0, a2, 0);
        textView.setText(spannable);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        if (r3 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10652a(int r7, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult r8, boolean r9) {
        /*
            r6 = this;
            if (r9 == 0) goto L_0x000e
            com.bytedance.android.livesdk.aa.a r8 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.k.e r9 = new com.bytedance.android.livesdk.k.e
            r9.<init>(r7)
            r8.mo10301a(r9)
        L_0x000e:
            java.lang.Class<com.bytedance.android.live.user.a> r7 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)
            com.bytedance.android.live.user.a r7 = (com.bytedance.android.live.user.C4282a) r7
            com.bytedance.android.livesdk.user.e r7 = r7.user()
            java.lang.String r8 = "ServiceManager.getServic…)\n                .user()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.bytedance.android.live.base.model.user.i r7 = r7.mo14521a()
            java.lang.String r8 = "ServiceManager.getServic…      .user().currentUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            long r7 = r7.getPayScores()
            r0 = 0
            r9 = 1
            r2 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0036
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r8 = 0
            if (r7 == 0) goto L_0x0060
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdkapi.i.a> r7 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE
            java.lang.String r0 = "LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            java.lang.Object r7 = r7.mo9431a()
            if (r7 == 0) goto L_0x0060
            android.app.Activity r7 = r6.f11933b
            android.content.Context r7 = (android.content.Context) r7
            android.app.Activity r0 = r6.f11933b
            if (r0 == 0) goto L_0x005c
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x005c
            r8 = 2132550600(0x7f1c23c8, float:2.0754535E38)
            java.lang.String r8 = r0.getString(r8)
        L_0x005c:
            com.bytedance.android.live.uikit.p257c.C4204a.m10423a(r7, r8)
            goto L_0x0078
        L_0x0060:
            android.app.Activity r7 = r6.f11933b
            android.content.Context r7 = (android.content.Context) r7
            android.app.Activity r0 = r6.f11933b
            if (r0 == 0) goto L_0x0075
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0075
            r8 = 2132550046(0x7f1c219e, float:2.0753412E38)
            java.lang.String r8 = r0.getString(r8)
        L_0x0075:
            com.bytedance.android.live.uikit.p257c.C4204a.m10423a(r7, r8)
        L_0x0078:
            android.view.View r7 = r6.getView()
            if (r7 == 0) goto L_0x008c
            r8 = 2132019234(0x7f140822, float:1.9676797E38)
            android.view.View r7 = r7.findViewById(r8)
            if (r7 == 0) goto L_0x008c
            r8 = 8
            r7.setVisibility(r8)
        L_0x008c:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r7 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)
            com.bytedance.android.live.wallet.IWalletService r7 = (com.bytedance.android.live.wallet.IWalletService) r7
            com.bytedance.android.live.wallet.b r7 = r7.walletCenter()
            r7.mo10097e()
            java.lang.Class<com.bytedance.android.live.user.a> r7 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)
            com.bytedance.android.live.user.a r7 = (com.bytedance.android.live.user.C4282a) r7
            com.bytedance.android.livesdk.user.e r7 = r7.user()
            c.a.ad r7 = r7.mo14535e()
            r7.mo6158b()
            com.bytedance.android.live.wallet.g.a.d r7 = r6.f11936e
            if (r7 == 0) goto L_0x00b5
            r7.mo10229b()
        L_0x00b5:
            com.bytedance.android.livesdk.o.c r7 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r8 = "livesdk_recharge_success"
            r0 = 6
            d.n[] r0 = new p2628d.C52847n[r0]
            java.lang.String r1 = "money"
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r3 = r6.f11937f
            if (r3 == 0) goto L_0x00c7
            int r3 = r3.f23692f
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r4 = r6.f11937f
            if (r4 == 0) goto L_0x00cf
            int r4 = r4.f23691e
            goto L_0x00d0
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            int r3 = r3 + r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            d.n r1 = p2628d.C52856t.m112465a(r1, r3)
            r0[r2] = r1
            java.lang.String r1 = "pay_method"
            com.bytedance.android.livesdkapi.host.k r3 = r6.f11938g
            com.bytedance.android.livesdkapi.host.k r4 = com.bytedance.android.livesdkapi.host.C8807k.GOOGLE
            if (r3 != r4) goto L_0x00e6
            java.lang.String r3 = "google_pay"
            goto L_0x00f2
        L_0x00e6:
            com.bytedance.android.livesdkapi.host.k r3 = r6.f11938g
            if (r3 == 0) goto L_0x00f0
            java.lang.String r3 = r3.getValue()
            if (r3 != 0) goto L_0x00f2
        L_0x00f0:
            java.lang.String r3 = ""
        L_0x00f2:
            d.n r1 = p2628d.C52856t.m112465a(r1, r3)
            r0[r9] = r1
            java.lang.String r1 = "charge_style"
            java.lang.String r3 = "window"
            d.n r1 = p2628d.C52856t.m112465a(r1, r3)
            r3 = 2
            r0[r3] = r1
            r1 = 3
            java.lang.String r4 = "charge_reason"
            java.lang.String r5 = r6.mo10150a()
            d.n r4 = p2628d.C52856t.m112465a(r4, r5)
            r0[r1] = r4
            r1 = 4
            java.lang.String r4 = "request_page"
            java.lang.String r5 = r6.mo10153b()
            d.n r4 = p2628d.C52856t.m112465a(r4, r5)
            r0[r1] = r4
            r1 = 5
            java.lang.String r4 = "growth_deepevent"
            java.lang.String r5 = "1"
            d.n r4 = p2628d.C52856t.m112465a(r4, r5)
            r0[r1] = r4
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112050a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Class<com.bytedance.android.livesdk.o.c.j> r3 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
            r1[r2] = r3
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r1[r9] = r2
            r7.mo14202a(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4356i.m10652a(int, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult, boolean):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.aj7, viewGroup, false);
        if (m10654i()) {
            C4526c<Integer> cVar = C4525b.f12405bc;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT");
            Integer num = (Integer) cVar.mo10345a();
            if ((num == null || num.intValue() != 0) && inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.bf8);
                if (linearLayout != null) {
                    LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        C52711k.m112236a((Object) num, "height");
                        layoutParams.height = num.intValue();
                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.bf8);
                        if (linearLayout2 != null) {
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                    }
                }
            }
        }
        C52711k.m112236a((Object) inflate, "rootView");
        View findViewById = inflate.findViewById(R.id.aji);
        if (findViewById != null) {
            if (C4206c.m10426a(getContext())) {
                i = R.drawable.bh5;
            } else {
                i = R.drawable.bh4;
            }
            findViewById.setBackgroundResource(i);
        }
        Drawable c = C3922z.m9911c(R.drawable.bsx);
        int a = C3922z.m9899a(16.0f);
        c.setBounds(0, 0, a, a);
        TextView textView = (TextView) inflate.findViewById(R.id.d9f);
        if (textView != null) {
            textView.setCompoundDrawables(c, null, null, null);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.a5j);
        C52711k.m112236a((Object) textView2, "rootView.diamond_protocol");
        textView2.setVisibility(8);
        ((TextView) inflate.findViewById(R.id.a5j)).setOnClickListener(new C4358b(this));
        RtlViewPager rtlViewPager = (RtlViewPager) inflate.findViewById(R.id.drk);
        C52711k.m112236a((Object) rtlViewPager, "rootView.view_pager");
        rtlViewPager.setOverScrollMode(2);
        this.f11934c = new C4293b(C52575l.m112097a(), new C4359c(this));
        RtlViewPager rtlViewPager2 = (RtlViewPager) inflate.findViewById(R.id.drk);
        if (rtlViewPager2 != null) {
            rtlViewPager2.setAdapter(this.f11934c);
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.ant, null);
        View inflate3 = LayoutInflater.from(getContext()).inflate(R.layout.anu, null);
        inflate2.setOnClickListener(new C4361d(this));
        ((LoadingStatusView) inflate.findViewById(R.id.csv)).setBuilder(C4239a.m10480a(getContext()).mo9850b((int) R.string.e_b).mo9852c(inflate2).mo9849a(inflate3));
        if (this.f11933b != null) {
            Activity activity = this.f11933b;
            if (activity == null) {
                C52711k.m112234a();
            }
            this.f11936e = new C4429d(activity);
            C4429d dVar = this.f11936e;
            if (dVar != null) {
                dVar.mo8520a(this);
            }
        }
        C8049c.m15979a().mo14202a("livesdk_recharge_show", C52550ab.m112050a(C52856t.m112465a("request_page", mo10153b()), C52856t.m112465a("charge_reason", mo10150a()), C52856t.m112465a("charge_style", "window")), C8059j.class, Room.class);
        return inflate;
    }
}
