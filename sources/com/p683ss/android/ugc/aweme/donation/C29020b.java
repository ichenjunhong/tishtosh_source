package com.p683ss.android.ugc.aweme.donation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C0540c;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.donation.b */
public final class C29020b extends C0540c implements C26846a, C26877c<C29048i> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75941a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29020b.class), "enterFrom", "getEnterFrom()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29020b.class), "enterMethod", "getEnterMethod()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29020b.class), "logPb", "getLogPb()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29020b.class), "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29020b.class), "ngoName", "getNgoName()Ljava/lang/String;"))};

    /* renamed from: g */
    public static final String f75942g = f75942g;

    /* renamed from: h */
    public static int f75943h = -1;

    /* renamed from: i */
    public static final C29021a f75944i = new C29021a(null);

    /* renamed from: b */
    public final C29042g f75945b = new C29042g();

    /* renamed from: c */
    public String f75946c;

    /* renamed from: d */
    public boolean f75947d;

    /* renamed from: e */
    public C29038d f75948e;

    /* renamed from: f */
    public boolean f75949f;

    /* renamed from: j */
    private final C52668f f75950j = C52732g.m112285a(new C29023c(this));

    /* renamed from: k */
    private final C52668f f75951k = C52732g.m112285a(new C29024d(this));

    /* renamed from: l */
    private final C52668f f75952l = C52732g.m112285a(new C29025e(this));

    /* renamed from: m */
    private final C52668f f75953m = C52732g.m112285a(new C29022b(this));

    /* renamed from: n */
    private final C52668f f75954n = C52732g.m112285a(new C29026f(this));

    /* renamed from: o */
    private HashMap f75955o;

    /* renamed from: com.ss.android.ugc.aweme.donation.b$a */
    public static final class C29021a {
        private C29021a() {
        }

        /* renamed from: a */
        public static int m68389a() {
            return C29020b.f75943h;
        }

        public /* synthetic */ C29021a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$b */
    static final class C29022b extends C52712l implements C52670a<Aweme> {

        /* renamed from: a */
        final /* synthetic */ C29020b f75956a;

        C29022b(C29020b bVar) {
            this.f75956a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C23324d.m57378a().getAwemeById(this.f75956a.mo58649b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$c */
    static final class C29023c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C29020b f75957a;

        C29023c(C29020b bVar) {
            this.f75957a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f75957a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_from", "");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$d */
    static final class C29024d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C29020b f75958a;

        C29024d(C29020b bVar) {
            this.f75958a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f75958a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_method", "");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$e */
    static final class C29025e extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C29020b f75959a;

        C29025e(C29020b bVar) {
            this.f75959a = bVar;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (r0 == null) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.donation.b r0 = r5.f75959a
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "log_pb"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0031
            L_0x0010:
                com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                com.ss.android.ugc.aweme.donation.b r1 = r5.f75959a
                java.lang.String r1 = r1.mo58649b()
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75959a
                android.os.Bundle r2 = r2.getArguments()
                r3 = -1
                if (r2 == 0) goto L_0x0029
                java.lang.String r4 = "page_type"
                int r3 = r2.getInt(r4, r3)
            L_0x0029:
                java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56850a(r1, r3)
                java.lang.String r0 = r0.mo60161a(r1)
            L_0x0031:
                if (r0 != 0) goto L_0x0035
                java.lang.String r0 = ""
            L_0x0035:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.C29025e.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$f */
    static final class C29026f extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C29020b f75960a;

        C29026f(C29020b bVar) {
            this.f75960a = bVar;
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.donation.b r0 = r5.f75960a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo58653i()
                r1 = 0
                if (r0 == 0) goto L_0x0039
                java.util.List r0 = r0.getInteractStickerStructs()
                if (r0 == 0) goto L_0x0039
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0015:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0034
                java.lang.Object r2 = r0.next()
                r3 = r2
                com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = (com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3
                java.lang.String r4 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                int r3 = r3.getType()
                r4 = 6
                if (r3 != r4) goto L_0x0030
                r3 = 1
                goto L_0x0031
            L_0x0030:
                r3 = 0
            L_0x0031:
                if (r3 == 0) goto L_0x0015
                goto L_0x0035
            L_0x0034:
                r2 = r1
            L_0x0035:
                r0 = r2
                com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = (com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0
                goto L_0x003a
            L_0x0039:
                r0 = r1
            L_0x003a:
                if (r0 == 0) goto L_0x0040
                java.lang.String r1 = r0.getAttr()
            L_0x0040:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x004b
                java.lang.String r0 = ""
                return r0
            L_0x004b:
                org.json.JSONObject r1 = new org.json.JSONObject
                if (r0 != 0) goto L_0x0052
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0052:
                java.lang.String r0 = r0.getAttr()
                r1.<init>(r0)
                java.lang.String r0 = "donation_name"
                java.lang.String r2 = ""
                java.lang.String r0 = r1.optString(r0, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.C29026f.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$g */
    static final class C29027g implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C29020b f75961a;

        /* renamed from: b */
        final /* synthetic */ Dialog f75962b;

        C29027g(C29020b bVar, Dialog dialog) {
            this.f75961a = bVar;
            this.f75962b = dialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            View findViewById = this.f75962b.findViewById(R.id.a4q);
            View view = null;
            if (!(findViewById instanceof FrameLayout)) {
                findViewById = null;
            }
            FrameLayout frameLayout = (FrameLayout) findViewById;
            Bundle arguments = this.f75961a.getArguments();
            int i = -1;
            if (arguments != null) {
                i = arguments.getInt("height", -1);
            }
            if (i <= 0) {
                if (C29021a.m68389a() > 0) {
                    i = C29021a.m68389a();
                } else {
                    Context context = this.f75962b.getContext();
                    C52711k.m112236a((Object) context, "dialog.context");
                    i = context.getResources().getDimensionPixelSize(R.dimen.z3);
                }
            }
            if (frameLayout != null) {
                LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                }
            }
            if (frameLayout != null) {
                frameLayout.setLayoutParams(frameLayout.getLayoutParams());
            }
            final BottomSheetBehavior a = BottomSheetBehavior.m1227a(frameLayout);
            boolean z = true;
            a.f1638i = true;
            a.mo1301b(3);
            ((RelativeLayout) this.f75961a.mo58647a((int) R.id.cfc)).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C29027g f75963a;

                {
                    this.f75963a = r1;
                }

                public final void run() {
                    int i;
                    BottomSheetBehavior bottomSheetBehavior = a;
                    C52711k.m112236a((Object) bottomSheetBehavior, "bottomSheetBehavior");
                    if (bottomSheetBehavior.f1633d) {
                        i = -1;
                    } else {
                        i = bottomSheetBehavior.f1632c;
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) this.f75963a.f75961a.mo58647a((int) R.id.cfc);
                    C52711k.m112236a((Object) relativeLayout, "root");
                    if (i != relativeLayout.getHeight()) {
                        BottomSheetBehavior bottomSheetBehavior2 = a;
                        C52711k.m112236a((Object) bottomSheetBehavior2, "bottomSheetBehavior");
                        RelativeLayout relativeLayout2 = (RelativeLayout) this.f75963a.f75961a.mo58647a((int) R.id.cfc);
                        C52711k.m112236a((Object) relativeLayout2, "root");
                        bottomSheetBehavior2.mo1296a(relativeLayout2.getHeight());
                    }
                }
            });
            Window window = this.f75962b.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    view = decorView.findViewById(R.id.d3x);
                }
            }
            if (view != null) {
                view.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C29027g f75965a;

                    {
                        this.f75965a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (this.f75965a.f75962b.isShowing()) {
                            this.f75965a.f75962b.dismiss();
                        }
                    }
                });
            }
            Dialog dialog = this.f75962b;
            if (view != null) {
                z = false;
            }
            dialog.setCancelable(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$h */
    static final class C29030h implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f75966a;

        C29030h(Dialog dialog) {
            this.f75966a = dialog;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                C52711k.m112236a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    if (this.f75966a.isShowing()) {
                        this.f75966a.dismiss();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$i */
    static final class C29031i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29020b f75967a;

        C29031i(C29020b bVar) {
            this.f75967a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
            if (r2 == null) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                com.ss.android.ugc.aweme.donation.b r4 = r3.f75967a
                r4.mo58655k()
                java.lang.String r4 = "donation_h5_entrance_click"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.donation.b r2 = r3.f75967a
                java.lang.String r2 = r2.mo58649b()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.donation.b r2 = r3.f75967a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo58653i()
                if (r2 == 0) goto L_0x002a
                java.lang.String r2 = r2.getAuthorUid()
                if (r2 != 0) goto L_0x002c
            L_0x002a:
                java.lang.String r2 = ""
            L_0x002c:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "enter_from"
                com.ss.android.ugc.aweme.donation.b r2 = r3.f75967a
                java.lang.String r2 = r2.mo58650c()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "ngo_name"
                com.ss.android.ugc.aweme.donation.b r2 = r3.f75967a
                java.lang.String r2 = r2.mo58654j()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "enter_method"
                java.lang.String r2 = "donation_panel"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "log_pb"
                com.ss.android.ugc.aweme.donation.b r2 = r3.f75967a
                java.lang.String r2 = r2.mo58652h()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
                com.ss.android.ugc.aweme.donation.b r4 = r3.f75967a
                android.support.v4.app.FragmentActivity r4 = r4.getActivity()
                if (r4 == 0) goto L_0x006c
                android.content.Context r4 = (android.content.Context) r4
                goto L_0x0072
            L_0x006c:
                com.ss.android.ugc.aweme.donation.b r4 = r3.f75967a
                android.content.Context r4 = r4.getContext()
            L_0x0072:
                com.ss.android.ugc.aweme.donation.DonationSetting r0 = com.p683ss.android.ugc.aweme.donation.DonationSetting.INSTANCE
                com.ss.android.ugc.aweme.donation.Donation r0 = r0.get()
                java.lang.String r0 = r0.getDonationUrl()
                com.bytedance.router.SmartRoute r4 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
                r4.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.C29031i.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$j */
    public static final class C29032j extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C29020b f75968a;

        /* renamed from: b */
        final /* synthetic */ int f75969b;

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            this.f75968a.mo58648a(DonationSetting.INSTANCE.get().getTiltifyUrl(), this.f75968a.mo58650c());
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f75969b);
            textPaint.setUnderlineText(false);
        }

        C29032j(C29020b bVar, int i) {
            this.f75968a = bVar;
            this.f75969b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$k */
    static final class C29033k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29020b f75970a;

        /* renamed from: b */
        final /* synthetic */ int f75971b;

        C29033k(C29020b bVar, int i) {
            this.f75970a = bVar;
            this.f75971b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75970a.f75945b.mo44934a_(Integer.valueOf(1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$l */
    static final class C29034l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29020b f75972a;

        /* renamed from: b */
        final /* synthetic */ View f75973b;

        /* renamed from: c */
        final /* synthetic */ Context f75974c;

        C29034l(C29020b bVar, View view, Context context) {
            this.f75972a = bVar;
            this.f75973b = view;
            this.f75974c = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
            if (r2 == null) goto L_0x00a6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
                android.view.View r6 = r5.f75973b
                boolean r6 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r6)
                if (r6 == 0) goto L_0x000c
                return
            L_0x000c:
                com.ss.android.ugc.aweme.donation.b r6 = r5.f75972a
                com.ss.android.ugc.aweme.donation.g r6 = r6.f75945b
                com.ss.android.ugc.aweme.common.a r6 = r6.mo54803n()
                com.ss.android.ugc.aweme.donation.f r6 = (com.p683ss.android.ugc.aweme.donation.C29040f) r6
                java.lang.String r0 = "presenter.model"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
                java.lang.Object r6 = r6.getData()
                com.ss.android.ugc.aweme.donation.c r6 = (com.p683ss.android.ugc.aweme.donation.C29037c) r6
                com.ss.android.ugc.aweme.donation.j r6 = r6.f75977a
                r0 = 0
                if (r6 == 0) goto L_0x0029
                java.lang.String r6 = r6.f76005b
                goto L_0x002a
            L_0x0029:
                r6 = r0
            L_0x002a:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x0045
                android.content.Context r6 = r5.f75974c
                android.content.Context r0 = r5.f75974c
                r1 = 2132544115(0x7f1c0a73, float:2.0741382E38)
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r6, r0)
                r6.mo19066a()
                return
            L_0x0045:
                com.ss.android.ugc.aweme.donation.b r6 = r5.f75972a
                r6.mo58655k()
                com.ss.android.ugc.aweme.donation.b r6 = r5.f75972a
                r1 = 1
                r6.f75947d = r1
                com.ss.android.ugc.aweme.shortvideo.util.x r6 = com.p683ss.android.ugc.aweme.shortvideo.util.C45461x.f114877a
                com.ss.android.ugc.aweme.donation.b r1 = r5.f75972a
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.content.Context r1 = (android.content.Context) r1
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                java.lang.String r2 = r2.mo58649b()
                com.ss.android.ugc.aweme.donation.b r3 = r5.f75972a
                com.ss.android.ugc.aweme.donation.g r3 = r3.f75945b
                com.ss.android.ugc.aweme.common.a r3 = r3.mo54803n()
                com.ss.android.ugc.aweme.donation.f r3 = (com.p683ss.android.ugc.aweme.donation.C29040f) r3
                java.lang.String r4 = "presenter.model"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.Object r3 = r3.getData()
                com.ss.android.ugc.aweme.donation.c r3 = (com.p683ss.android.ugc.aweme.donation.C29037c) r3
                com.ss.android.ugc.aweme.donation.j r3 = r3.f75977a
                if (r3 == 0) goto L_0x007a
                java.lang.String r0 = r3.f76005b
            L_0x007a:
                com.ss.android.ugc.aweme.donation.b$l$1 r3 = new com.ss.android.ugc.aweme.donation.b$l$1
                r3.<init>(r5)
                d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
                r6.mo91748a(r1, r2, r0, r3)
                java.lang.String r6 = "donation_panel_donate_click"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                java.lang.String r2 = r2.mo58649b()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo58653i()
                if (r2 == 0) goto L_0x00a6
                java.lang.String r2 = r2.getAuthorUid()
                if (r2 != 0) goto L_0x00a8
            L_0x00a6:
                java.lang.String r2 = ""
            L_0x00a8:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "enter_from"
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                java.lang.String r2 = r2.mo58650c()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "enter_method"
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                java.lang.String r2 = r2.mo58651d()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "log_pb"
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                java.lang.String r2 = r2.mo58652h()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "ngo_name"
                com.ss.android.ugc.aweme.donation.b r2 = r5.f75972a
                java.lang.String r2 = r2.mo58654j()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.C29034l.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.b$m */
    static final class C29036m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29020b f75976a;

        C29036m(C29020b bVar) {
            this.f75976a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75976a.dismiss();
        }
    }

    /* renamed from: a */
    public final View mo58647a(int i) {
        if (this.f75955o == null) {
            this.f75955o = new HashMap();
        }
        View view = (View) this.f75955o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75955o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final String mo58650c() {
        return (String) this.f75950j.getValue();
    }

    /* renamed from: c */
    public final void mo47029c(List<C29048i> list, boolean z) {
    }

    /* renamed from: d */
    public final String mo58651d() {
        return (String) this.f75951k.getValue();
    }

    /* renamed from: h */
    public final String mo58652h() {
        return (String) this.f75952l.getValue();
    }

    /* renamed from: i */
    public final Aweme mo58653i() {
        return (Aweme) this.f75953m.getValue();
    }

    /* renamed from: j */
    public final String mo58654j() {
        return (String) this.f75954n.getValue();
    }

    /* renamed from: b */
    public final String mo58649b() {
        String str = this.f75946c;
        if (str == null) {
            C52711k.m112237a("aid");
        }
        return str;
    }

    /* renamed from: e */
    public final void mo47031e() {
        C29038d dVar = this.f75948e;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar.am_();
    }

    /* renamed from: l */
    private final void m68371l() {
        C29038d dVar = this.f75948e;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar.an_();
        C29038d dVar2 = this.f75948e;
        if (dVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar2.mo54798c(false);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        ((DmtStatusView) mo58647a((int) R.id.csv)).mo19212f();
        ConstraintLayout constraintLayout = (ConstraintLayout) mo58647a((int) R.id.eny);
        C52711k.m112236a((Object) constraintLayout, "pannel_view");
        constraintLayout.setVisibility(8);
    }

    public final void ar_() {
        this.f75945b.mo44934a_(Integer.valueOf(4));
    }

    /* renamed from: k */
    public final void mo58655k() {
        if (!this.f75949f) {
            this.f75949f = true;
            Dialog dialog = getDialog();
            C52711k.m112236a((Object) dialog, "dialog");
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.a5c);
            }
        }
    }

    public final void onDestroyView() {
        this.f75945b.aq_();
        this.f75945b.mo46991S_();
        super.onDestroyView();
        if (this.f75955o != null) {
            this.f75955o.clear();
        }
    }

    public final void aJ_() {
        C29038d dVar = this.f75948e;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar.f70699x) {
            C29038d dVar2 = this.f75948e;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.mo54798c(false);
            C29038d dVar3 = this.f75948e;
            if (dVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar3.notifyDataSetChanged();
            m68371l();
        }
        m68370a(true);
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C29038d dVar = this.f75948e;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar.mo54787a((RecyclerView) mo58647a((int) R.id.e5s), false);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnShowListener(new C29027g(this, onCreateDialog));
        onCreateDialog.setOnKeyListener(new C29030h(onCreateDialog));
        return onCreateDialog;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        C29038d dVar = this.f75948e;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar.f70699x) {
            C29038d dVar2 = this.f75948e;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.mo54798c(false);
            C29038d dVar3 = this.f75948e;
            if (dVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar3.notifyDataSetChanged();
        }
        ((DmtStatusView) mo58647a((int) R.id.csv)).mo19214h();
        ConstraintLayout constraintLayout = (ConstraintLayout) mo58647a((int) R.id.eny);
        C52711k.m112236a((Object) constraintLayout, "pannel_view");
        constraintLayout.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r2 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r5 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r5 = 0
            r0 = 2132607229(0x7f1d00fd, float:2.0869393E38)
            r4.setStyle(r5, r0)
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L_0x001a
            java.lang.String r0 = "aid"
            java.lang.String r1 = ""
            java.lang.String r5 = r5.getString(r0, r1)
            if (r5 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r5 = ""
        L_0x001c:
            r4.f75946c = r5
            java.lang.String r5 = "donation_panel_show"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "group_id"
            java.lang.String r2 = r4.f75946c
            if (r2 != 0) goto L_0x002f
            java.lang.String r3 = "aid"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x002f:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.mo58653i()
            if (r2 == 0) goto L_0x0041
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x0043
        L_0x0041:
            java.lang.String r2 = ""
        L_0x0043:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r4.mo58650c()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = r4.mo58651d()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "log_pb"
            java.lang.String r2 = r4.mo58652h()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "ngo_name"
            java.lang.String r2 = r4.mo58654j()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01a8, code lost:
        if (r1 == null) goto L_0x01aa;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m68370a(boolean r15) {
        /*
            r14 = this;
            r0 = 2132023007(0x7f1416df, float:1.968445E38)
            android.view.View r1 = r14.mo58647a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r1
            java.lang.String r2 = "status_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 8
            if (r1 != 0) goto L_0x0036
            android.view.View r0 = r14.mo58647a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r0
            java.lang.String r1 = "status_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r3)
            r0 = 2132021496(0x7f1410f8, float:1.9681385E38)
            android.view.View r0 = r14.mo58647a(r0)
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            java.lang.String r1 = "pannel_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r2)
        L_0x0036:
            com.ss.android.ugc.aweme.donation.g r0 = r14.f75945b
            com.ss.android.ugc.aweme.common.a r0 = r0.mo54803n()
            com.ss.android.ugc.aweme.donation.f r0 = (com.p683ss.android.ugc.aweme.donation.C29040f) r0
            java.lang.String r1 = "presenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.donation.c r0 = (com.p683ss.android.ugc.aweme.donation.C29037c) r0
            r1 = 2132018495(0x7f14053f, float:1.9675298E38)
            android.view.View r4 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r5 = "desc1"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.donation.a r5 = r0.f75981e
            r6 = 0
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = r5.f75939a
            goto L_0x0060
        L_0x005f:
            r5 = r6
        L_0x0060:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            r4 = 2132018614(0x7f1405b6, float:1.967554E38)
            android.view.View r4 = r14.mo58647a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r5 = "donation_number"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r5 = r0.f75982f
            if (r5 == 0) goto L_0x007a
        L_0x0077:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x007d
        L_0x007a:
            java.lang.String r5 = ""
            goto L_0x0077
        L_0x007d:
            r4.setText(r5)
            r4 = 2132021277(0x7f14101d, float:1.968094E38)
            android.view.View r4 = r14.mo58647a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r5 = "ngo_info"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.donation.j r5 = r0.f75977a
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r5.f76004a
            goto L_0x0096
        L_0x0095:
            r5 = r6
        L_0x0096:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            r4 = 2132017575(0x7f1401a7, float:1.9673432E38)
            android.view.View r4 = r14.mo58647a(r4)
            android.support.constraint.ConstraintLayout r4 = (android.support.constraint.ConstraintLayout) r4
            com.ss.android.ugc.aweme.donation.b$i r5 = new com.ss.android.ugc.aweme.donation.b$i
            r5.<init>(r14)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            com.ss.android.ugc.aweme.donation.a r4 = r0.f75981e
            if (r4 == 0) goto L_0x00b4
            java.lang.String r6 = r4.f75940b
        L_0x00b4:
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r7 = 1
            if (r5 != 0) goto L_0x01a2
            r5 = 2132018610(0x7f1405b2, float:1.9675532E38)
            android.view.View r8 = r14.mo58647a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            java.lang.String r9 = "donate_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r8.setText(r4)
            android.view.View r4 = r14.mo58647a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r8 = "donate_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
            android.text.TextPaint r4 = r4.getPaint()
            float r4 = r4.measureText(r6)
            android.content.Context r6 = r14.getContext()
            r8 = 1117913088(0x42a20000, float:81.0)
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r8)
            float r4 = r4 + r6
            android.content.Context r6 = r14.getContext()
            int r6 = com.bytedance.ies.dmt.p664ui.p669e.C10704b.m21577a(r6)
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a2
            android.view.View r4 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            r6 = 1096810496(0x41600000, float:14.0)
            r4.setTextSize(r7, r6)
            android.view.View r4 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r6 = "desc1"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x019a
            android.support.constraint.ConstraintLayout$LayoutParams r4 = (android.support.constraint.ConstraintLayout.LayoutParams) r4
            android.content.Context r6 = r14.getContext()
            r8 = 1092616192(0x41200000, float:10.0)
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r8)
            int r6 = (int) r6
            r4.topMargin = r6
            android.view.View r4 = r14.mo58647a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r6 = "donate_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x0192
            android.support.constraint.ConstraintLayout$LayoutParams r4 = (android.support.constraint.ConstraintLayout.LayoutParams) r4
            android.view.View r6 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r8 = "desc1"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            if (r6 == 0) goto L_0x018a
            android.support.constraint.ConstraintLayout$LayoutParams r6 = (android.support.constraint.ConstraintLayout.LayoutParams) r6
            int r6 = r6.topMargin
            r4.bottomMargin = r6
            android.view.View r4 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r6 = "desc1"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            android.view.View r1 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r6 = "desc1"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r4.setLayoutParams(r1)
            android.view.View r1 = r14.mo58647a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r4 = "donate_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.view.View r4 = r14.mo58647a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r5 = "donate_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r1.setLayoutParams(r4)
            goto L_0x01a2
        L_0x018a:
            d.u r15 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams"
            r15.<init>(r0)
            throw r15
        L_0x0192:
            d.u r15 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams"
            r15.<init>(r0)
            throw r15
        L_0x019a:
            d.u r15 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams"
            r15.<init>(r0)
            throw r15
        L_0x01a2:
            com.ss.android.ugc.aweme.donation.j r1 = r0.f75977a
            if (r1 == 0) goto L_0x01aa
            java.lang.String r1 = r1.f76006c
            if (r1 != 0) goto L_0x01ac
        L_0x01aa:
            java.lang.String r1 = ""
        L_0x01ac:
            com.bytedance.lighten.a.t r1 = com.bytedance.lighten.p766a.C12203q.m24646a(r1)
            r4 = 2132021276(0x7f14101c, float:1.9680939E38)
            android.view.View r4 = r14.mo58647a(r4)
            com.bytedance.lighten.loader.SmartCircleImageView r4 = (com.bytedance.lighten.loader.SmartCircleImageView) r4
            com.bytedance.lighten.a.t r1 = r1.mo23116a(r4)
            r4 = 2131820546(0x7f110002, float:1.927381E38)
            com.bytedance.lighten.a.t r1 = r1.mo23110a(r4)
            r1.mo23121a()
            r1 = 2132544119(0x7f1c0a77, float:2.074139E38)
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r4 = "getString(R.string.donat…iltify_attribution2_link)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r5 = 2132544118(0x7f1c0a76, float:2.0741388E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r2] = r1
            java.lang.String r5 = r14.getString(r5, r6)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.<init>(r5)
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r5
            r9 = r1
            int r6 = p2628d.p2650m.C52830p.m112419a(r8, r9, r10, r11, r12, r13)
            android.content.Context r7 = r14.getContext()
            if (r7 != 0) goto L_0x01fb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01fb:
            java.lang.String r8 = "context!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131820614(0x7f110046, float:1.9273948E38)
            int r7 = r7.getColor(r8)
            com.ss.android.ugc.aweme.donation.b$j r8 = new com.ss.android.ugc.aweme.donation.b$j
            r8.<init>(r14, r7)
            int r1 = r1.length()
            int r1 = r1 + r6
            r7 = 34
            r4.setSpan(r8, r6, r1, r7)
            r1 = 2132021871(0x7f14126f, float:1.9682146E38)
            android.view.View r4 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r6 = "powered_by"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            r4.setText(r5)
            android.view.View r1 = r14.mo58647a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r4 = "powered_by"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r4)
            r1 = 2132018619(0x7f1405bb, float:1.967555E38)
            if (r15 == 0) goto L_0x0284
            android.view.View r15 = r14.mo58647a(r1)
            android.support.v7.widget.RecyclerView r15 = (android.support.p043v7.widget.RecyclerView) r15
            java.lang.String r0 = "donor_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r0)
            r15.setVisibility(r3)
            r15 = 2132018866(0x7f1406b2, float:1.967605E38)
            android.view.View r15 = r14.mo58647a(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r15
            java.lang.String r0 = "error_text"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r0)
            r15.setVisibility(r2)
            r15 = 2132019486(0x7f14091e, float:1.9677308E38)
            android.view.View r15 = r14.mo58647a(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r15
            java.lang.String r0 = "hint"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r0)
            r15.setVisibility(r3)
            r15 = 2132019487(0x7f14091f, float:1.967731E38)
            android.view.View r15 = r14.mo58647a(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r15
            java.lang.String r0 = "hint2"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r0)
            r15.setVisibility(r3)
            return
        L_0x0284:
            android.view.View r15 = r14.mo58647a(r1)
            android.support.v7.widget.RecyclerView r15 = (android.support.p043v7.widget.RecyclerView) r15
            java.lang.String r1 = "donor_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r1)
            android.support.v7.widget.RecyclerView$a r15 = r15.getAdapter()
            if (r15 == 0) goto L_0x029d
            com.ss.android.ugc.aweme.common.a.g r15 = (com.p683ss.android.ugc.aweme.common.p1589a.C26840g) r15
            java.util.List<com.ss.android.ugc.aweme.donation.i> r0 = r0.f75978b
            r15.mo50303a(r0)
            return
        L_0x029d:
            d.u r15 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.adapter.BaseAdapter<com.ss.android.ugc.aweme.donation.DonorStruct>"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.m68370a(boolean):void");
    }

    /* renamed from: b */
    public final void mo47026b(List<C29048i> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            C29038d dVar = this.f75948e;
            if (dVar == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar.mo54798c(false);
        } else {
            C29038d dVar2 = this.f75948e;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.ao_();
        }
        C29038d dVar3 = this.f75948e;
        if (dVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar3.mo50304b(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58648a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            android.support.v4.app.FragmentActivity r0 = r3.getActivity()
            if (r0 != 0) goto L_0x0012
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "url"
            r0.putString(r1, r4)
            java.lang.String r4 = "title"
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L_0x002d
            r2 = 2132544097(0x7f1c0a61, float:2.0741346E38)
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r1 = ""
        L_0x002f:
            r0.putString(r4, r1)
            java.lang.String r4 = "enter_from"
            r0.putString(r4, r5)
            java.lang.String r4 = "hide_more"
            java.lang.String r5 = "false"
            r0.putString(r4, r5)
            android.support.v4.app.FragmentActivity r4 = r3.getActivity()
            if (r4 == 0) goto L_0x0047
            android.content.Context r4 = (android.content.Context) r4
            goto L_0x0055
        L_0x0047:
            android.content.Context r4 = r3.getContext()
            if (r4 != 0) goto L_0x0050
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0050:
            java.lang.String r5 = "context!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
        L_0x0055:
            com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity.C44603a.m97561a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.mo58648a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo47018a(List<C29048i> list, boolean z) {
        C29038d dVar = this.f75948e;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar.mo54798c(true);
        if (!z) {
            m68371l();
        } else {
            C29038d dVar2 = this.f75948e;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.ao_();
        }
        m68370a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0149, code lost:
        if (r2 == null) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            super.onViewCreated(r8, r9)
            android.content.Context r9 = r8.getContext()
            r0 = 2131820643(0x7f110063, float:1.9274007E38)
            int r1 = android.support.p030v4.content.C0726c.m2098c(r9, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            r4 = 2132607779(0x7f1d0323, float:2.0870508E38)
            r3.<init>(r9, r4)
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            r2.setTextColor(r1)
            r3 = 2132546268(0x7f1c12dc, float:2.074575E38)
            r2.setText(r3)
            com.ss.android.ugc.aweme.donation.b$k r3 = new com.ss.android.ugc.aweme.donation.b$k
            r3.<init>(r7, r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            r1 = 2132544090(0x7f1c0a5a, float:2.0741332E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r3 = "getString(R.string.donation_anchor_title_2)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            int r0 = android.support.p030v4.content.C0726c.m2098c(r3, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
            r6.<init>(r3, r4)
            android.content.Context r6 = (android.content.Context) r6
            r5.<init>(r6)
            r5.setTextColor(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5.setText(r1)
            android.view.View r5 = (android.view.View) r5
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r9)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r0.mo19231b(r5)
            android.view.View r2 = (android.view.View) r2
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r0.mo19234c(r2)
            r1 = 0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r0.mo19233c(r1)
            r2 = 2132023007(0x7f1416df, float:1.968445E38)
            android.view.View r2 = r7.mo58647a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r2
            r2.setBuilder(r0)
            com.ss.android.ugc.aweme.donation.d r0 = new com.ss.android.ugc.aweme.donation.d
            r0.<init>(r7)
            r2 = r7
            com.ss.android.ugc.aweme.common.a.j$a r2 = (com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a) r2
            r0.mo54788a(r2)
            r2 = 2132018619(0x7f1405bb, float:1.967555E38)
            android.view.View r3 = r7.mo58647a(r2)
            android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
            java.lang.String r4 = "donor_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.support.v7.widget.LinearLayoutManager r4 = new android.support.v7.widget.LinearLayoutManager
            r4.<init>(r9)
            android.support.v7.widget.RecyclerView$i r4 = (android.support.p043v7.widget.RecyclerView.C1332i) r4
            r3.setLayoutManager(r4)
            android.view.View r2 = r7.mo58647a(r2)
            android.support.v7.widget.RecyclerView r2 = (android.support.p043v7.widget.RecyclerView) r2
            java.lang.String r3 = "donor_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = r0
            android.support.v7.widget.RecyclerView$a r3 = (android.support.p043v7.widget.RecyclerView.C1322a) r3
            r2.setAdapter(r3)
            r7.f75948e = r0
            r0 = 2132018609(0x7f1405b1, float:1.967553E38)
            android.view.View r0 = r7.mo58647a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.donation.b$l r2 = new com.ss.android.ugc.aweme.donation.b$l
            r2.<init>(r7, r8, r9)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            r8 = 2132017557(0x7f140195, float:1.9673396E38)
            android.view.View r8 = r7.mo58647a(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            com.ss.android.ugc.aweme.donation.b$m r9 = new com.ss.android.ugc.aweme.donation.b$m
            r9.<init>(r7)
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r8.setOnClickListener(r9)
            com.ss.android.ugc.aweme.donation.DonationSetting r8 = com.p683ss.android.ugc.aweme.donation.DonationSetting.INSTANCE
            com.ss.android.ugc.aweme.donation.Donation r8 = r8.get()
            java.lang.String r8 = r8.getDonationUrl()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r9 = 2132017575(0x7f1401a7, float:1.9673432E38)
            if (r8 != 0) goto L_0x0175
            android.view.View r8 = r7.mo58647a(r9)
            android.support.constraint.ConstraintLayout r8 = (android.support.constraint.ConstraintLayout) r8
            java.lang.String r9 = "banner"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r8.setVisibility(r1)
            com.ss.android.ugc.aweme.donation.DonationSetting r8 = com.p683ss.android.ugc.aweme.donation.DonationSetting.INSTANCE
            com.ss.android.ugc.aweme.donation.Donation r8 = r8.get()
            java.lang.String r8 = r8.getBannerUrl()
            com.bytedance.lighten.a.t r8 = com.bytedance.lighten.p766a.C12203q.m24646a(r8)
            java.lang.String r9 = f75942g
            com.bytedance.lighten.a.t r8 = r8.mo23118a(r9)
            r9 = 2131820546(0x7f110002, float:1.927381E38)
            com.bytedance.lighten.a.t r8 = r8.mo23110a(r9)
            r9 = 2132017579(0x7f1401ab, float:1.967344E38)
            android.view.View r9 = r7.mo58647a(r9)
            com.bytedance.lighten.loader.SmartImageView r9 = (com.bytedance.lighten.loader.SmartImageView) r9
            com.bytedance.lighten.a.t r8 = r8.mo23116a(r9)
            r8.mo23121a()
            java.lang.String r8 = "donation_h5_entrance_show"
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r0 = "group_id"
            java.lang.String r2 = r7.f75946c
            if (r2 != 0) goto L_0x0139
            java.lang.String r3 = "aid"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0139:
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r2)
            java.lang.String r0 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.mo58653i()
            if (r2 == 0) goto L_0x014b
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x014d
        L_0x014b:
            java.lang.String r2 = ""
        L_0x014d:
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r2)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = r7.mo58650c()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r2)
            java.lang.String r0 = "ngo_name"
            java.lang.String r2 = r7.mo58654j()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r2)
            java.lang.String r0 = "log_pb"
            java.lang.String r2 = r7.mo58652h()
            com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r9)
            goto L_0x0185
        L_0x0175:
            android.view.View r8 = r7.mo58647a(r9)
            android.support.constraint.ConstraintLayout r8 = (android.support.constraint.ConstraintLayout) r8
            java.lang.String r9 = "banner"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r9 = 8
            r8.setVisibility(r9)
        L_0x0185:
            com.ss.android.ugc.aweme.donation.g r8 = r7.f75945b
            com.ss.android.ugc.aweme.donation.f r9 = new com.ss.android.ugc.aweme.donation.f
            java.lang.String r0 = r7.f75946c
            if (r0 != 0) goto L_0x0192
            java.lang.String r2 = "aid"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0192:
            r9.<init>(r0)
            com.ss.android.ugc.aweme.common.a r9 = (com.p683ss.android.ugc.aweme.common.C26832a) r9
            r8.mo54799a(r9)
            r9 = r7
            com.ss.android.ugc.aweme.common.e r9 = (com.p683ss.android.ugc.aweme.common.C26865e) r9
            r8.mo54800a(r9)
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r1] = r9
            r8.mo44934a_(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29020b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bam, viewGroup, false);
    }
}
