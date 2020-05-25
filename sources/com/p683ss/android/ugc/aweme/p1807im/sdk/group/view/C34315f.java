package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p702im.core.p706c.C11180b;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34145b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34146c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34147d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p001a.C0011g;
import p001a.C0013i;
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
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f */
public final class C34315f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88609a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mAvatarView", "getMAvatarView()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mTitleTextView", "getMTitleTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mRetryTextView", "getMRetryTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mLoadingTextView", "getMLoadingTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mPasswordTextView", "getMPasswordTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mExpirationDateTextView", "getMExpirationDateTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mConfirmLayout", "getMConfirmLayout()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mConfirmImageView", "getMConfirmImageView()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34315f.class), "mConfirmTextView", "getMConfirmTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: b */
    public final Context f88610b;

    /* renamed from: c */
    public int f88611c;

    /* renamed from: d */
    public volatile String f88612d;

    /* renamed from: e */
    public final C34311c f88613e;

    /* renamed from: f */
    public final Context f88614f;

    /* renamed from: g */
    public final View f88615g;

    /* renamed from: h */
    public final String f88616h;

    /* renamed from: i */
    public final int f88617i;

    /* renamed from: j */
    public final C34312d f88618j;

    /* renamed from: k */
    private final C52668f f88619k;

    /* renamed from: l */
    private final C52668f f88620l;

    /* renamed from: m */
    private final C52668f f88621m;

    /* renamed from: n */
    private final C52668f f88622n;

    /* renamed from: o */
    private final C52668f f88623o;

    /* renamed from: p */
    private final C52668f f88624p;

    /* renamed from: q */
    private final C52668f f88625q;

    /* renamed from: r */
    private final C52668f f88626r;

    /* renamed from: s */
    private final C52668f f88627s;

    /* renamed from: t */
    private final C52668f f88628t;

    /* renamed from: u */
    private C11180b f88629u;

    /* renamed from: v */
    private String f88630v;

    /* renamed from: w */
    private final int f88631w;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$a */
    static final class C34316a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34315f f88632a;

        C34316a(C34315f fVar) {
            this.f88632a = fVar;
        }

        public final void run() {
            this.f88632a.mo72338b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$b */
    static final class C34317b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34315f f88633a;

        C34317b(C34315f fVar) {
            this.f88633a = fVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickInstrumentation.onClick(view);
            if (this.f88633a.f88617i == 3) {
                str = "qq";
            } else {
                str = "weixin";
            }
            if (this.f88633a.f88617i == 3) {
                str2 = "com.tencent.mobileqq";
            } else {
                str2 = "com.tencent.mm";
            }
            if (this.f88633a.f88617i == 3) {
                str3 = "group_qq_command_copy_click";
            } else {
                str3 = "group_wx_command_copy_click";
            }
            if (C18920g.m46052b(this.f88633a.f88610b, str2)) {
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                a.mo71949f().shareToTargetChannel(this.f88633a.f88610b, str);
                C35190af.m79499d(str3, this.f88633a.f88616h, "setting", "success");
            } else {
                C34004b a2 = C34004b.m77717a();
                C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                a2.mo71949f().shareToTargetChannel(this.f88633a.f88610b, str);
                C35190af.m79499d(str3, this.f88633a.f88616h, "setting", "failure");
            }
            this.f88633a.mo72337a(this.f88633a.f88612d);
            if (this.f88633a.f88618j.f88604g) {
                this.f88633a.f88613e.mo71787g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$c */
    static final class C34318c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34315f f88634a;

        C34318c(C34315f fVar) {
            this.f88634a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88634a.f88613e.mo71787g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$d */
    static final class C34319d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34315f f88635a;

        C34319d(C34315f fVar) {
            this.f88635a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88635a.mo72336a(0, null);
            this.f88635a.mo72339c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$e */
    static final class C34320e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34315f f88636a;

        /* renamed from: b */
        final /* synthetic */ String f88637b;

        C34320e(C34315f fVar, String str) {
            this.f88636a = fVar;
            this.f88637b = str;
        }

        public final void run() {
            this.f88636a.mo72337a(this.f88637b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$f */
    static final class C34321f extends C52712l implements C52670a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88638a;

        C34321f(C34315f fVar) {
            this.f88638a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AvatarImageView) this.f88638a.f88615g.findViewById(R.id.ay2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$g */
    static final class C34322g extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88639a;

        C34322g(C34315f fVar) {
            this.f88639a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f88639a.f88615g.findViewById(R.id.az9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$h */
    static final class C34323h extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88640a;

        C34323h(C34315f fVar) {
            this.f88640a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f88640a.f88615g.findViewById(R.id.azf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$i */
    static final class C34324i extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88641a;

        C34324i(C34315f fVar) {
            this.f88641a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f88641a.f88615g.findViewById(R.id.b79);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$j */
    static final class C34325j extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88642a;

        C34325j(C34315f fVar) {
            this.f88642a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88642a.f88615g.findViewById(R.id.d8c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$k */
    static final class C34326k extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88643a;

        C34326k(C34315f fVar) {
            this.f88643a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88643a.f88615g.findViewById(R.id.d_3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$l */
    static final class C34327l extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88644a;

        C34327l(C34315f fVar) {
            this.f88644a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88644a.f88615g.findViewById(R.id.dbi);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$m */
    static final class C34328m extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88645a;

        C34328m(C34315f fVar) {
            this.f88645a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88645a.f88615g.findViewById(R.id.dd9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$n */
    static final class C34329n extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88646a;

        C34329n(C34315f fVar) {
            this.f88646a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88646a.f88615g.findViewById(R.id.det);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$o */
    static final class C34330o extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88647a;

        C34330o(C34315f fVar) {
            this.f88647a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88647a.f88615g.findViewById(R.id.dhb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.f$p */
    static final class C34331p<TTaskResult, TContinuationResult> implements C0011g<C34147d, Void> {

        /* renamed from: a */
        final /* synthetic */ C34315f f88648a;

        C34331p(C34315f fVar) {
            this.f88648a = fVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar != null && iVar.mo26b()) {
                C34147d dVar = (C34147d) iVar.mo34e();
                if (dVar != null && dVar.status_code == 0) {
                    this.f88648a.mo72336a(1, (C34147d) iVar.mo34e());
                    return null;
                }
            }
            this.f88648a.mo72336a(2, null);
            return null;
        }
    }

    /* renamed from: d */
    private final ImageView m78218d() {
        return (ImageView) this.f88619k.getValue();
    }

    /* renamed from: e */
    private final AvatarImageView m78219e() {
        return (AvatarImageView) this.f88620l.getValue();
    }

    /* renamed from: f */
    private final DmtTextView m78220f() {
        return (DmtTextView) this.f88621m.getValue();
    }

    /* renamed from: g */
    private final DmtTextView m78221g() {
        return (DmtTextView) this.f88622n.getValue();
    }

    /* renamed from: h */
    private final DmtTextView m78222h() {
        return (DmtTextView) this.f88623o.getValue();
    }

    /* renamed from: i */
    private final DmtTextView m78223i() {
        return (DmtTextView) this.f88624p.getValue();
    }

    /* renamed from: j */
    private final DmtTextView m78224j() {
        return (DmtTextView) this.f88625q.getValue();
    }

    /* renamed from: k */
    private final LinearLayout m78225k() {
        return (LinearLayout) this.f88626r.getValue();
    }

    /* renamed from: l */
    private final ImageView m78226l() {
        return (ImageView) this.f88627s.getValue();
    }

    /* renamed from: m */
    private final DmtTextView m78227m() {
        return (DmtTextView) this.f88628t.getValue();
    }

    /* renamed from: a */
    public final void mo72335a() {
        m78228n();
        m78229o();
        m78230p();
        mo72339c();
    }

    /* renamed from: c */
    public final void mo72339c() {
        C35286u.m79868a(12, 2, this.f88616h, (C0011g<C34147d, Void>) new C34331p<C34147d,Void>(this));
    }

    /* renamed from: n */
    private final void m78228n() {
        this.f88629u = C34238a.m78110a().mo72222a(this.f88616h);
        String string = this.f88614f.getString(R.string.bhi);
        C52711k.m112236a((Object) string, "context.getString(R.stri…password_expiration_date)");
        this.f88630v = string;
    }

    /* renamed from: o */
    private final void m78229o() {
        mo72338b();
        if (this.f88617i == 3) {
            m78225k().setBackgroundResource(R.drawable.awp);
            m78226l().setImageResource(R.drawable.ayo);
            m78227m().setText(R.string.bg8);
        } else if (this.f88617i == 1) {
            m78225k().setBackgroundResource(this.f88618j.f88600c);
            m78226l().setImageResource(this.f88618j.f88601d);
            m78227m().setText(this.f88618j.f88602e);
        } else {
            StringBuilder sb = new StringBuilder("wrong type:");
            sb.append(this.f88617i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f88618j.f88599b) {
            DmtTextView j = m78224j();
            C52711k.m112236a((Object) j, "mExpirationDateTextView");
            j.setVisibility(8);
        }
        mo72336a(0, null);
    }

    /* renamed from: p */
    private final void m78230p() {
        C35225a.m79617l().mo73331a(m78225k(), m78221g(), m78218d());
        m78225k().setOnClickListener(new C34317b(this));
        m78218d().setOnClickListener(new C34318c(this));
        m78221g().setOnClickListener(new C34319d(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72338b() {
        /*
            r5 = this;
            com.bytedance.im.core.c.d r0 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r1 = r5.f88616h
            com.bytedance.im.core.c.b r0 = r0.mo20658a(r1)
            if (r0 == 0) goto L_0x0017
            com.bytedance.im.core.c.c r0 = r0.getCoreInfo()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.getIcon()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            int r1 = r5.f88611c
            int r1 = r1 + 1
            r5.f88611c = r1
            int r1 = r5.f88611c
            int r2 = r5.f88631w
            if (r1 < r2) goto L_0x0025
            return
        L_0x0025:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 4
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "GroupInvitePasswordPanel"
            java.lang.String r1 = "icon is empty"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r0, r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.m78219e()
            com.ss.android.ugc.aweme.im.sdk.group.view.f$a r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.f$a
            r1.<init>(r5)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
        L_0x0047:
            java.lang.String r1 = "GroupInvitePasswordPanel"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bindImageView:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ",currentTimes:"
            r3.append(r4)
            int r4 = r5.f88611c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r1, r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r5.m78219e()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r1
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34315f.mo72338b():void");
    }

    /* renamed from: a */
    public final void mo72337a(String str) {
        if (!C52711k.m112239a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
            C32458a.m75141a(4, "GroupInvitePasswordPanel", "innerClipToBoard not in main thread");
            this.f88615g.post(new C34320e(this, str));
            return;
        }
        Activity g = C11016e.m22312g();
        if (g != null && !g.isFinishing()) {
            StringBuilder sb = new StringBuilder("innerClipToBoard:");
            sb.append(str);
            C32458a.m75141a(4, "GroupInvitePasswordPanel", sb.toString());
            ClipboardManager clipboardManager = (ClipboardManager) g.getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText("", str);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
        }
    }

    /* renamed from: a */
    public final void mo72336a(int i, C34147d dVar) {
        C34146c cVar;
        boolean z;
        CharSequence charSequence;
        boolean z2;
        CharSequence charSequence2;
        boolean z3;
        boolean z4;
        while (true) {
            boolean z5 = false;
            switch (i) {
                case 0:
                    m78224j().setText(R.string.bh6);
                    m78220f().setText(R.string.blv);
                    DmtTextView i2 = m78223i();
                    C52711k.m112236a((Object) i2, "mPasswordTextView");
                    i2.setVisibility(4);
                    DmtTextView h = m78222h();
                    C52711k.m112236a((Object) h, "mLoadingTextView");
                    h.setVisibility(0);
                    DmtTextView g = m78221g();
                    C52711k.m112236a((Object) g, "mRetryTextView");
                    g.setVisibility(8);
                    LinearLayout k = m78225k();
                    C52711k.m112236a((Object) k, "mConfirmLayout");
                    k.setEnabled(false);
                    LinearLayout k2 = m78225k();
                    C52711k.m112236a((Object) k2, "mConfirmLayout");
                    k2.setAlpha(0.5f);
                    return;
                case 1:
                    if (dVar != null) {
                        cVar = dVar.getGroupPasswordInfo();
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        C34146c groupPasswordInfo = dVar.getGroupPasswordInfo();
                        if (groupPasswordInfo == null) {
                            C52711k.m112234a();
                        }
                        Collection groupPasswordDetailList = groupPasswordInfo.getGroupPasswordDetailList();
                        if (groupPasswordDetailList == null || groupPasswordDetailList.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C34146c groupPasswordInfo2 = dVar.getGroupPasswordInfo();
                            if (groupPasswordInfo2 == null) {
                                C52711k.m112234a();
                            }
                            List<C34145b> groupPasswordDetailList2 = groupPasswordInfo2.getGroupPasswordDetailList();
                            if (groupPasswordDetailList2 == null) {
                                break;
                            } else {
                                C34145b bVar = null;
                                for (C34145b bVar2 : groupPasswordDetailList2) {
                                    if (bVar2.getShareChannel() == this.f88617i) {
                                        bVar = bVar2;
                                    }
                                }
                                if (bVar != null) {
                                    charSequence = bVar.getToken();
                                } else {
                                    charSequence = null;
                                }
                                CharSequence charSequence3 = charSequence;
                                if (charSequence3 == null || charSequence3.length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    continue;
                                } else {
                                    if (bVar != null) {
                                        charSequence2 = bVar.getDescription();
                                    } else {
                                        charSequence2 = null;
                                    }
                                    CharSequence charSequence4 = charSequence2;
                                    if (charSequence4 == null || charSequence4.length() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        C34146c groupPasswordInfo3 = dVar.getGroupPasswordInfo();
                                        if (groupPasswordInfo3 == null) {
                                            C52711k.m112234a();
                                        }
                                        long expireTime = currentTimeMillis + (groupPasswordInfo3.getExpireTime() * 1000);
                                        String str = this.f88630v;
                                        if (str == null) {
                                            C52711k.m112237a("mExpirationDateFormat");
                                        }
                                        String format = new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(expireTime));
                                        DmtTextView j = m78224j();
                                        C52711k.m112236a((Object) j, "mExpirationDateTextView");
                                        j.setText(this.f88614f.getString(R.string.bls, new Object[]{format}));
                                        if (bVar == null) {
                                            C52711k.m112234a();
                                        }
                                        String token = bVar.getToken();
                                        DmtTextView i3 = m78223i();
                                        C52711k.m112236a((Object) i3, "mPasswordTextView");
                                        i3.setVisibility(0);
                                        DmtTextView i4 = m78223i();
                                        C52711k.m112236a((Object) i4, "mPasswordTextView");
                                        CharSequence charSequence5 = token;
                                        i4.setText(charSequence5);
                                        if (bVar == null) {
                                            C52711k.m112234a();
                                        }
                                        String description = bVar.getDescription();
                                        if (description == null) {
                                            C52711k.m112234a();
                                        }
                                        int a = C52830p.m112419a((CharSequence) description, "\n", 0, false, 6, (Object) null) + 1;
                                        if (bVar == null) {
                                            C52711k.m112234a();
                                        }
                                        String description2 = bVar.getDescription();
                                        if (description2 == null) {
                                            C52711k.m112234a();
                                        }
                                        StringBuilder sb = new StringBuilder(description2);
                                        IMUser fromUser = IMUser.fromUser(C35265e.m79732c());
                                        C52711k.m112236a((Object) fromUser, "IMUser.fromUser(AppUtil.getCurrentUser())");
                                        String sb2 = sb.insert(a, fromUser.getDisplayName()).toString();
                                        Activity g2 = C11016e.m22312g();
                                        if (charSequence5 == null || charSequence5.length() == 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (!z4) {
                                            CharSequence charSequence6 = sb2;
                                            if (charSequence6 == null || charSequence6.length() == 0) {
                                                z5 = true;
                                            }
                                            if (!z5 && g2 != null && !g2.isFinishing()) {
                                                this.f88612d = sb2;
                                                if (this.f88618j.f88603f) {
                                                    mo72337a(sb2);
                                                }
                                                C34004b a2 = C34004b.m77717a();
                                                C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                                                a2.mo71949f().saveShareCommandToSp(C52830p.m112401a(token, "\n", "", false, 4, (Object) null));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    dVar = null;
                    i = 2;
                    break;
                default:
                    m78224j().setText(R.string.bh5);
                    m78220f().setText(R.string.blu);
                    DmtTextView i5 = m78223i();
                    C52711k.m112236a((Object) i5, "mPasswordTextView");
                    i5.setVisibility(4);
                    DmtTextView g3 = m78221g();
                    C52711k.m112236a((Object) g3, "mRetryTextView");
                    g3.setVisibility(0);
                    DmtTextView h2 = m78222h();
                    C52711k.m112236a((Object) h2, "mLoadingTextView");
                    h2.setVisibility(8);
                    LinearLayout k3 = m78225k();
                    C52711k.m112236a((Object) k3, "mConfirmLayout");
                    k3.setEnabled(false);
                    LinearLayout k4 = m78225k();
                    C52711k.m112236a((Object) k4, "mConfirmLayout");
                    k4.setAlpha(0.5f);
                    break;
            }
        }
        m78220f().setText(this.f88618j.f88598a);
        DmtTextView h3 = m78222h();
        C52711k.m112236a((Object) h3, "mLoadingTextView");
        h3.setVisibility(8);
        DmtTextView g4 = m78221g();
        C52711k.m112236a((Object) g4, "mRetryTextView");
        g4.setVisibility(8);
        LinearLayout k5 = m78225k();
        C52711k.m112236a((Object) k5, "mConfirmLayout");
        k5.setEnabled(true);
        LinearLayout k6 = m78225k();
        C52711k.m112236a((Object) k6, "mConfirmLayout");
        k6.setAlpha(1.0f);
        if (this.f88617i == 3) {
            C35190af.m79442a();
            C35190af.m79484b(this.f88616h, "group_qq_command_copy_show");
            return;
        }
        C35190af.m79442a();
        C35190af.m79484b(this.f88616h, "group_wx_command_copy_show");
    }

    public C34315f(C34311c cVar, Context context, View view, String str, int i, C34312d dVar) {
        C52711k.m112240b(cVar, "closeAbility");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(str, "conversationId");
        C52711k.m112240b(dVar, "config");
        this.f88613e = cVar;
        this.f88614f = context;
        this.f88615g = view;
        this.f88616h = str;
        this.f88617i = i;
        this.f88618j = dVar;
        this.f88619k = C52732g.m112285a(new C34322g(this));
        this.f88620l = C52732g.m112285a(new C34321f(this));
        this.f88621m = C52732g.m112285a(new C34330o(this));
        this.f88622n = C52732g.m112285a(new C34329n(this));
        this.f88623o = C52732g.m112285a(new C34327l(this));
        this.f88624p = C52732g.m112285a(new C34328m(this));
        this.f88625q = C52732g.m112285a(new C34326k(this));
        this.f88626r = C52732g.m112285a(new C34324i(this));
        this.f88627s = C52732g.m112285a(new C34323h(this));
        this.f88628t = C52732g.m112285a(new C34325j(this));
        this.f88610b = this.f88614f;
        this.f88631w = 5;
        this.f88612d = "";
    }

    public /* synthetic */ C34315f(C34311c cVar, Context context, View view, String str, int i, C34312d dVar, int i2, C52707g gVar) {
        C34312d dVar2 = new C34312d(0, false, 0, 0, 0, false, false, 127, null);
        this(cVar, context, view, str, i, dVar2);
    }
}
