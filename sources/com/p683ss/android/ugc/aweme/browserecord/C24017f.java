package com.p683ss.android.ugc.aweme.browserecord;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.C0540c;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.browserecord.f */
public final class C24017f extends C0540c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63742a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24017f.class), "mEnterFrom", "getMEnterFrom()Ljava/lang/String;"))};

    /* renamed from: e */
    public static final C24018a f63743e = new C24018a(null);

    /* renamed from: b */
    public C52670a<C52860x> f63744b = C24023f.f63756a;

    /* renamed from: c */
    int f63745c = C23728o.m58241a(280.0d);

    /* renamed from: d */
    public DmtStatusView f63746d;

    /* renamed from: f */
    private boolean f63747f;

    /* renamed from: g */
    private boolean f63748g;

    /* renamed from: h */
    private BottomSheetBehavior<View> f63749h;

    /* renamed from: i */
    private final C52668f f63750i = C52732g.m112285a(new C24021d(this));

    /* renamed from: j */
    private HashMap f63751j;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$a */
    public static final class C24018a {
        private C24018a() {
        }

        public /* synthetic */ C24018a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo49774a(C0654k kVar, String str, C52670a<C52860x> aVar) {
            C52711k.m112240b(kVar, "fragmentManager");
            C52711k.m112240b(aVar, "onConfirmListener");
            Fragment a = kVar.mo2224a("ProfileGuideFillAvatarDialogFragment");
            if (!(a instanceof C24017f)) {
                a = null;
            }
            C24017f fVar = (C24017f) a;
            if (fVar == null) {
                fVar = new C24017f();
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", str);
                fVar.setArguments(bundle);
            }
            fVar.f63744b = aVar;
            if (!fVar.isAdded()) {
                kVar.mo2225a().mo2178a((Fragment) fVar, "ProfileGuideFillAvatarDialogFragment").mo2195c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$b */
    static final class C24019b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24017f f63752a;

        C24019b(C24017f fVar) {
            this.f63752a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24017f fVar = this.f63752a;
            C26890h.m65011a("videoplay_history_popups", C23089d.m56640a().mo47829a("event_type", "click").mo47829a("enter_from", fVar.mo49773a()).f61491a);
            C41713b.f105569a.getBrowseRecordChangeSwitchToOb(true).mo6314a((C1674ab<? super T>) new C24022e<Object>(fVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$c */
    static final class C24020c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24017f f63753a;

        C24020c(C24017f fVar) {
            this.f63753a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("videoplay_history_popups", C23089d.m56640a().mo47829a("event_type", "cancel").mo47829a("enter_from", this.f63753a.mo49773a()).f61491a);
            this.f63753a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$d */
    static final class C24021d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C24017f f63754a;

        C24021d(C24017f fVar) {
            this.f63754a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f63754a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_from");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$e */
    public static final class C24022e implements C1674ab<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C24017f f63755a;

        public final void onComplete() {
            C24017f.m58822a(this.f63755a).mo19209d();
        }

        C24022e(C24017f fVar) {
            this.f63755a = fVar;
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
            C24017f.m58822a(this.f63755a).mo19212f();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((BaseResponse) obj, "baseResponse");
            this.f63755a.f63744b.invoke();
            this.f63755a.dismiss();
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            C24017f.m58822a(this.f63755a).mo19209d();
            Context context = this.f63755a.getContext();
            if (context == null) {
                context = C11010c.m22280a();
            }
            C10691a.m21542b(context, (int) R.string.cm4).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$f */
    static final class C24023f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C24023f f63756a = new C24023f();

        C24023f() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$g */
    static final class C24024g implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C24017f f63757a;

        C24024g(C24017f fVar) {
            this.f63757a = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0090 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onShow(android.content.DialogInterface r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.browserecord.f r5 = r4.f63757a
                android.view.View r0 = r5.getView()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.view.ViewParent r0 = r0.getParent()
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                boolean r2 = r0 instanceof android.view.View
                if (r2 != 0) goto L_0x0014
                r0 = r1
            L_0x0014:
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x001d
                android.view.ViewParent r0 = r0.getParent()
                goto L_0x001e
            L_0x001d:
                r0 = r1
            L_0x001e:
                boolean r2 = r0 instanceof android.view.View
                if (r2 != 0) goto L_0x0023
                r0 = r1
            L_0x0023:
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x003a
                r2 = 2132023524(0x7f1418e4, float:1.9685498E38)
                android.view.View r0 = r0.findViewById(r2)
                if (r0 == 0) goto L_0x003a
                com.ss.android.ugc.aweme.browserecord.f$i r2 = new com.ss.android.ugc.aweme.browserecord.f$i
                r2.<init>(r5)
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r0.setOnClickListener(r2)
            L_0x003a:
                android.view.View r0 = r5.getView()
                if (r0 == 0) goto L_0x004e
                r2 = 2132020403(0x7f140cb3, float:1.9679168E38)
                android.view.View r0 = r0.findViewById(r2)
                if (r0 == 0) goto L_0x004e
                int r0 = r0.getMeasuredHeight()
                goto L_0x0050
            L_0x004e:
                int r0 = r5.f63745c
            L_0x0050:
                r5.f63745c = r0
                android.view.View r0 = r5.getView()
                if (r0 == 0) goto L_0x005d
                android.view.ViewParent r0 = r0.getParent()
                goto L_0x005e
            L_0x005d:
                r0 = r1
            L_0x005e:
                boolean r2 = r0 instanceof android.view.View
                if (r2 != 0) goto L_0x0063
                r0 = r1
            L_0x0063:
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x006c
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                goto L_0x006d
            L_0x006c:
                r0 = r1
            L_0x006d:
                boolean r2 = r0 instanceof android.support.design.widget.CoordinatorLayout.C0505d
                if (r2 != 0) goto L_0x0072
                r0 = r1
            L_0x0072:
                android.support.design.widget.CoordinatorLayout$d r0 = (android.support.design.widget.CoordinatorLayout.C0505d) r0
                if (r0 == 0) goto L_0x0079
                android.support.design.widget.CoordinatorLayout$Behavior r2 = r0.f1693a
                goto L_0x007a
            L_0x0079:
                r2 = r1
            L_0x007a:
                boolean r3 = r2 instanceof android.support.design.widget.BottomSheetBehavior
                if (r3 != 0) goto L_0x007f
                goto L_0x0080
            L_0x007f:
                r1 = r2
            L_0x0080:
                android.support.design.widget.BottomSheetBehavior r1 = (android.support.design.widget.BottomSheetBehavior) r1
                if (r1 == 0) goto L_0x0089
                int r2 = r5.f63745c
                r1.mo1296a(r2)
            L_0x0089:
                if (r0 == 0) goto L_0x0090
                int r5 = r5.f63745c
                r0.height = r5
                return
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C24017f.C24024g.onShow(android.content.DialogInterface):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$h */
    static final class C24025h implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C24017f f63758a;

        C24025h(C24017f fVar) {
            this.f63758a = fVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C52711k.m112236a((Object) keyEvent, "event");
            if (keyEvent.getKeyCode() != 4) {
                return false;
            }
            if (keyEvent.getAction() == 1) {
                this.f63758a.dismiss();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$i */
    static final class C24026i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24017f f63759a;

        C24026i(C24017f fVar) {
            this.f63759a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f63759a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$j */
    static final class C24027j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24017f f63760a;

        C24027j(C24017f fVar) {
            this.f63760a = fVar;
        }

        public final void run() {
            Dialog dialog = this.f63760a.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.a6n);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.f$k */
    public static final class C24028k extends C0497a {

        /* renamed from: a */
        final /* synthetic */ C24017f f63761a;

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "p0");
        }

        C24028k(C24017f fVar) {
            this.f63761a = fVar;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i == 5) {
                this.f63761a.dismiss();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo49773a() {
        return (String) this.f63750i.getValue();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f63747f = false;
        if (this.f63751j != null) {
            this.f63751j.clear();
        }
    }

    public final void dismiss() {
        BottomSheetBehavior b = m58823b();
        if (b != null) {
            b.mo1301b(4);
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    public final void onStop() {
        if (!this.f63748g) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(0);
                }
            }
        }
        super.onStop();
    }

    /* renamed from: b */
    private final BottomSheetBehavior<View> m58823b() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Behavior behavior;
        if (this.f63749h != null) {
            return this.f63749h;
        }
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C0505d)) {
            layoutParams = null;
        }
        C0505d dVar = (C0505d) layoutParams;
        if (dVar != null) {
            behavior = dVar.f1693a;
        } else {
            behavior = null;
        }
        if (!(behavior instanceof BottomSheetBehavior)) {
            behavior = null;
        }
        this.f63749h = (BottomSheetBehavior) behavior;
        return this.f63749h;
    }

    public final void onStart() {
        ViewParent viewParent;
        super.onStart();
        BottomSheetBehavior b = m58823b();
        if (b != null) {
            b.f1646q = new C24028k(this);
        }
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.postDelayed(new C24027j(this), 50);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f63748g = true;
        super.onCancel(dialogInterface);
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtStatusView m58822a(C24017f fVar) {
        DmtStatusView dmtStatusView = fVar.f63746d;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        return dmtStatusView;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a57);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setOnShowListener(new C24024g(this));
        onCreateDialog.setOnKeyListener(new C24025h(this));
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setSoftInputMode(16);
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            if (VERSION.SDK_INT >= 21) {
                window2.clearFlags(201326592);
                window2.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                window2.setStatusBarColor(0);
            } else {
                window2.addFlags(67108864);
            }
        }
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(sav…atusBar(window)\n        }");
        return onCreateDialog;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f63747f = true;
        View findViewById = view.findViewById(R.id.csv);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.status_view)");
        this.f63746d = (DmtStatusView) findViewById;
        DmtStatusView dmtStatusView = this.f63746d;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(C11010c.m22280a()).mo19223a());
        view.findViewById(R.id.a2).setOnClickListener(new C24019b(this));
        view.findViewById(R.id.ue).setOnClickListener(new C24020c(this));
        C26890h.m65011a("videoplay_history_popups", C23089d.m56640a().mo47829a("event_type", "impression").mo47829a("enter_from", mo49773a()).f61491a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b8o, viewGroup, false);
    }
}
