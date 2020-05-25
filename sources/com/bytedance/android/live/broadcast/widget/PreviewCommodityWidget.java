package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4188g;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.p438f.C8630a;
import com.bytedance.android.livesdkapi.p445e.C8731b;
import com.bytedance.android.livesdkapi.p445e.C8734d;
import com.bytedance.android.livesdkapi.p445e.p447b.C8732a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class PreviewCommodityWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10431a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewCommodityWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: c */
    public static final C3661a f10432c = new C3661a(null);

    /* renamed from: b */
    public boolean f10433b;

    /* renamed from: d */
    private final C52668f f10434d = C52732g.m112285a(new C3671k(this));

    /* renamed from: e */
    private C1690c f10435e;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$a */
    public static final class C3661a {
        private C3661a() {
        }

        public /* synthetic */ C3661a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$b */
    static final class C3662b<T> implements C0199s<C8710m> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10436a;

        C3662b(PreviewCommodityWidget previewCommodityWidget) {
            this.f10436a = previewCommodityWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C8710m mVar = (C8710m) obj;
            this.f10436a.mo9049a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$c */
    static final class C3663c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10437a;

        C3663c(PreviewCommodityWidget previewCommodityWidget) {
            this.f10437a = previewCommodityWidget;
        }

        public final void onClick(View view) {
            PreviewCommodityWidget previewCommodityWidget = this.f10437a;
            C8333e user = ((C4282a) C4116c.m10249a(C4282a.class)).user();
            if (user != null) {
                C3009i a = user.mo14521a();
                if (a != null) {
                    C52711k.m112236a((Object) a, "ServiceManager.getServic…()?.currentUser ?: return");
                    if (((C8734d) C4116c.m10249a(C8734d.class)) != null) {
                        new C8732a(String.valueOf(a.getId()), a.getSecUid());
                        new C3670j(previewCommodityWidget);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$d */
    static final class C3664d<T> implements C1710e<C5206y> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10438a;

        C3664d(PreviewCommodityWidget previewCommodityWidget) {
            this.f10438a = previewCommodityWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C5206y yVar = (C5206y) obj;
            PreviewCommodityWidget previewCommodityWidget = this.f10438a;
            C52711k.m112236a((Object) yVar, "liveLoginEvent");
            previewCommodityWidget.onEvent(yVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$e */
    static final class C3665e {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10439a;

        C3665e(PreviewCommodityWidget previewCommodityWidget) {
            this.f10439a = previewCommodityWidget;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$f */
    static final class C3666f<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10440a;

        C3666f(PreviewCommodityWidget previewCommodityWidget) {
            this.f10440a = previewCommodityWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "hashGoods");
            if (bool.booleanValue()) {
                ILiveSDKService iLiveSDKService = (ILiveSDKService) C4116c.m10249a(ILiveSDKService.class);
                if (iLiveSDKService != null) {
                    C4188g liveCommerceService = iLiveSDKService.liveCommerceService();
                    if (liveCommerceService != null) {
                        C4104a a = liveCommerceService.mo9606a(this.f10440a.context, null);
                        if (a != null) {
                            a.getLifecycle().mo324a(new PreviewCommodityWidget$onSelectCommodity$1$1(this, a));
                            Context context = this.f10440a.context;
                            if (context != null) {
                                a.show(((FragmentActivity) context).getSupportFragmentManager(), "LIVE_SHOP_EDIT");
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                }
                return;
            }
            C4204a.m10421a(this.f10440a.context, (int) R.string.esn);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$g */
    static final class C3667g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10441a;

        C3667g(PreviewCommodityWidget previewCommodityWidget) {
            this.f10441a = previewCommodityWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4602l.m11046a(this.f10441a.context, (Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$h */
    static final class C3668h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10442a;

        /* renamed from: b */
        final /* synthetic */ C8630a f10443b;

        C3668h(PreviewCommodityWidget previewCommodityWidget, C8630a aVar) {
            this.f10442a = previewCommodityWidget;
            this.f10443b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f10443b.mo10346a(Boolean.valueOf(true));
            this.f10442a.mo9049a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$i */
    static final class C3669i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C3669i f10444a = new C3669i();

        C3669i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$j */
    static final class C3670j {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10445a;

        C3670j(PreviewCommodityWidget previewCommodityWidget) {
            this.f10445a = previewCommodityWidget;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$k */
    static final class C3671k extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10446a;

        C3671k(PreviewCommodityWidget previewCommodityWidget) {
            this.f10446a = previewCommodityWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10446a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$l */
    static final class C3672l<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10447a;

        C3672l(PreviewCommodityWidget previewCommodityWidget) {
            this.f10447a = previewCommodityWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            View view = this.f10447a.contentView;
            C52711k.m112236a((Object) view, "contentView");
            CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.yf);
            C52711k.m112236a((Object) checkedTextView, "contentView.commodity");
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            checkedTextView.setChecked(z);
            C52711k.m112236a((Object) bool, "checked");
            if (bool.booleanValue() && !this.f10447a.f10433b) {
                this.f10447a.f10433b = true;
                View view2 = this.f10447a.contentView;
                C52711k.m112236a((Object) view2, "contentView");
                ((CheckedTextView) view2.findViewById(R.id.yf)).postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3672l f10448a;

                    {
                        this.f10448a = r1;
                    }

                    public final void run() {
                        C4204a.m10421a(this.f10448a.f10447a.context, (int) R.string.esm);
                    }
                }, 300);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$m */
    static final class C3674m<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget f10449a;

        C3674m(PreviewCommodityWidget previewCommodityWidget) {
            this.f10449a = previewCommodityWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4602l.m11046a(this.f10449a.context, (Throwable) obj);
        }
    }

    /* renamed from: c */
    private final StartLiveViewModel m9511c() {
        return (StartLiveViewModel) this.f10434d.getValue();
    }

    public final int getLayoutId() {
        return R.layout.bvq;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f10435e != null) {
            C1690c cVar = this.f10435e;
            if (cVar != null && !cVar.isDisposed()) {
                C1690c cVar2 = this.f10435e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9049a() {
        C4282a aVar = (C4282a) C4116c.m10249a(C4282a.class);
        if (aVar != null) {
            C8333e user = aVar.user();
            if (user != null) {
                C3009i a = user.mo14521a();
                if (a != null) {
                    C52711k.m112236a((Object) a, "ServiceManager.getServic…                ?: return");
                    C8630a aVar2 = new C8630a("has_show_commodity_dialog", Boolean.valueOf(false));
                    Object a2 = aVar2.mo10345a();
                    C52711k.m112236a(a2, "hasShowCommodity.value");
                    if (((Boolean) a2).booleanValue()) {
                        ILiveSDKService iLiveSDKService = (ILiveSDKService) C4116c.m10249a(ILiveSDKService.class);
                        if (iLiveSDKService != null) {
                            C4188g liveCommerceService = iLiveSDKService.liveCommerceService();
                            if (liveCommerceService != null) {
                                C2201v a3 = liveCommerceService.mo9605a(Long.valueOf(a.getId()));
                                if (a3 != null) {
                                    a3.mo6505a((C1710e<? super T>) new C3666f<Object>(this), (C1710e<? super Throwable>) new C3667g<Object>(this));
                                }
                            }
                        }
                        return;
                    }
                    new C4221a(this.context).mo9684a((int) R.string.esv).mo9693b((int) R.string.esu).mo9685a((int) R.string.est, (DialogInterface.OnClickListener) new C3668h(this, aVar2)).mo9694b(R.string.ess, C3669i.f10444a).mo9691a(false).mo9692a().show();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9050b() {
        /*
            r4 = this;
            java.lang.Class<com.bytedance.android.live.user.a> r0 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.user.a r0 = (com.bytedance.android.live.user.C4282a) r0
            if (r0 == 0) goto L_0x00b4
            com.bytedance.android.livesdk.user.e r0 = r0.user()
            if (r0 == 0) goto L_0x00b4
            com.bytedance.android.live.base.model.user.i r0 = r0.mo14521a()
            if (r0 != 0) goto L_0x0018
            goto L_0x00b4
        L_0x0018:
            java.lang.String r1 = "ServiceManager.getServic…                ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C4282a) r1
            r2 = 0
            if (r1 == 0) goto L_0x0069
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            if (r1 == 0) goto L_0x0069
            com.bytedance.android.live.base.model.user.i r1 = r1.mo14521a()
            if (r1 != 0) goto L_0x0035
            goto L_0x0069
        L_0x0035:
            java.lang.String r3 = "ServiceManager.getServic…          ?: return false"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            boolean r3 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r3 != 0) goto L_0x0069
            boolean r1 = r1.isEnableShowCommerceSale()
            if (r1 == 0) goto L_0x0069
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r1 = r4.m9511c()
            android.arch.lifecycle.r r1 = r1.mo8876d()
            java.lang.Object r1 = r1.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.m r1 = (com.bytedance.android.livesdkapi.depend.model.live.C8710m) r1
            com.bytedance.android.livesdkapi.depend.model.live.m r3 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.VIDEO
            if (r1 == r3) goto L_0x0067
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r1 = r4.m9511c()
            android.arch.lifecycle.r r1 = r1.mo8876d()
            java.lang.Object r1 = r1.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.m r1 = (com.bytedance.android.livesdkapi.depend.model.live.C8710m) r1
            com.bytedance.android.livesdkapi.depend.model.live.m r3 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.THIRD_PARTY
            goto L_0x0069
        L_0x0067:
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x00a7
            android.view.View r1 = r4.contentView
            java.lang.String r3 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r1.setVisibility(r2)
            java.lang.Class<com.bytedance.android.live.room.ILiveSDKService> r1 = com.bytedance.android.live.room.ILiveSDKService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.room.ILiveSDKService r1 = (com.bytedance.android.live.room.ILiveSDKService) r1
            if (r1 == 0) goto L_0x00a6
            com.bytedance.android.live.room.g r1 = r1.liveCommerceService()
            if (r1 == 0) goto L_0x00a6
            long r2 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            c.a.v r0 = r1.mo9607b(r0)
            if (r0 == 0) goto L_0x00a6
            com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$l r1 = new com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$l
            r1.<init>(r4)
            c.a.d.e r1 = (p064c.p065a.p071d.C1710e) r1
            com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$m r2 = new com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$m
            r2.<init>(r4)
            c.a.d.e r2 = (p064c.p065a.p071d.C1710e) r2
            r0.mo6505a(r1, r2)
            goto L_0x00b3
        L_0x00a6:
            return
        L_0x00a7:
            android.view.View r0 = r4.contentView
            java.lang.String r1 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x00b3:
            return
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget.mo9050b():void");
    }

    public final void onCreate() {
        super.onCreate();
        m9511c().mo8876d().observe(this, new C3662b(this));
        ViewGroup viewGroup = this.containerView;
        C52711k.m112236a((Object) viewGroup, "containerView");
        ((CheckedTextView) viewGroup.findViewById(R.id.yf)).setCheckMarkDrawable(R.drawable.e2n);
        this.containerView.setOnClickListener(new C3663c(this));
        if (this.f10435e != null) {
            C1690c cVar = this.f10435e;
            if (cVar != null && !cVar.isDisposed()) {
                C1690c cVar2 = this.f10435e;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
        this.f10435e = C4495a.m10823a().mo10300a(C5206y.class).mo6545f((C1710e<? super T>) new C3664d<Object>(this));
        C4282a aVar = (C4282a) C4116c.m10249a(C4282a.class);
        if (aVar != null) {
            C8333e user = aVar.user();
            if (user != null) {
                C3009i a = user.mo14521a();
                if (a != null) {
                    C52711k.m112236a((Object) a, "ServiceManager.getServic…                ?: return");
                    if (((C8734d) C4116c.m10249a(C8734d.class)) != null) {
                        new C3665e(this);
                        new C8731b(String.valueOf(a.getId()), a.getSecUid());
                    }
                }
            }
        }
    }

    public final void onEvent(C5206y yVar) {
        C52711k.m112240b(yVar, "event");
        mo9050b();
    }
}
