package com.p683ss.android.ugc.aweme.profile.p2085c;

import android.app.Dialog;
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
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.c.a */
public abstract class C39807a extends C0540c {

    /* renamed from: c */
    public static final C39808a f101586c = new C39808a(null);

    /* renamed from: a */
    public boolean f101587a;

    /* renamed from: b */
    public boolean f101588b = true;

    /* renamed from: d */
    private boolean f101589d;

    /* renamed from: e */
    private BottomSheetBehavior<View> f101590e;

    /* renamed from: f */
    private HashMap f101591f;

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$a */
    static final class C39808a {
        private C39808a() {
        }

        public /* synthetic */ C39808a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$b */
    static final class C39809b implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C39807a f101592a;

        C39809b(C39807a aVar) {
            this.f101592a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f101592a.mo80889c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$c */
    static final class C39810c implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C39807a f101593a;

        C39810c(C39807a aVar) {
            this.f101593a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C52711k.m112236a((Object) keyEvent, "event");
            if (keyEvent.getKeyCode() != 4 || !this.f101593a.f101588b) {
                return false;
            }
            if (keyEvent.getAction() == 1) {
                this.f101593a.dismiss();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$d */
    static final class C39811d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39807a f101594a;

        C39811d(C39807a aVar) {
            this.f101594a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f101594a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$e */
    static final class C39812e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39807a f101595a;

        C39812e(C39807a aVar) {
            this.f101595a = aVar;
        }

        public final void run() {
            Dialog dialog = this.f101595a.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.sn);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$f */
    static final class C39813f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39807a f101596a;

        C39813f(C39807a aVar) {
            this.f101596a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f101596a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.a$g */
    public static final class C39814g extends C0497a {

        /* renamed from: a */
        final /* synthetic */ C39807a f101597a;

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "p0");
        }

        C39814g(C39807a aVar) {
            this.f101597a = aVar;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (!this.f101597a.f101588b && i == 1) {
                BottomSheetBehavior a = BottomSheetBehavior.m1227a(view);
                C52711k.m112236a((Object) a, "BottomSheetBehavior.from(bottomSheet)");
                a.mo1301b(4);
            }
            if (i == 5) {
                this.f101597a.dismiss();
            }
        }
    }

    /* renamed from: a */
    public abstract int mo80886a();

    /* renamed from: b */
    public abstract String mo80887b();

    /* renamed from: f */
    public void mo80893f() {
        if (this.f101591f != null) {
            this.f101591f.clear();
        }
    }

    public void dismiss() {
        dismiss(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f101587a = false;
        mo80893f();
    }

    public void onStop() {
        if (!this.f101589d) {
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

    /* renamed from: g */
    private final BottomSheetBehavior<View> mo80904g() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Behavior behavior;
        if (this.f101590e != null) {
            return this.f101590e;
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
        this.f101590e = (BottomSheetBehavior) behavior;
        return this.f101590e;
    }

    /* renamed from: c */
    public void mo80889c() {
        ViewParent viewParent;
        ViewParent viewParent2;
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
            viewParent2 = view2.getParent();
        } else {
            viewParent2 = null;
        }
        if (!(viewParent2 instanceof View)) {
            viewParent2 = null;
        }
        View view3 = (View) viewParent2;
        if (view3 != null) {
            View findViewById = view3.findViewById(R.id.d3x);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C39811d(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo80892e() {
        String str;
        String b = mo80887b();
        C23089d a = C23089d.m56640a().mo47829a("event_type", "exit");
        String str2 = "enter_from";
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            str = arguments.getString("enter_from");
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str2, str);
        String str4 = "enter_method";
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str3 = arguments2.getString("enter_method");
        }
        C26890h.m65011a(b, a2.mo47829a(str4, str3).f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo80890d() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Object obj;
        View view = getView();
        Object obj2 = null;
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
            obj = dVar.f1693a;
        } else {
            obj = null;
        }
        if (obj instanceof BottomSheetBehavior) {
            obj2 = obj;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo1296a(mo80886a());
        }
        if (dVar != null) {
            dVar.height = mo80886a();
        }
    }

    public void onStart() {
        ViewParent viewParent;
        super.onStart();
        mo80890d();
        BottomSheetBehavior g = mo80904g();
        if (g != null) {
            g.f1646q = new C39814g(this);
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
            view3.postDelayed(new C39812e(this), 50);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f101589d = true;
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a5_);
    }

    /* access modifiers changed from: protected */
    public void dismiss(boolean z) {
        if (z) {
            mo80892e();
        }
        BottomSheetBehavior g = mo80904g();
        if (g != null) {
            g.mo1301b(4);
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo80888b(boolean z) {
        String str;
        String str2;
        String b = mo80887b();
        C23089d a = C23089d.m56640a();
        String str3 = "event_type";
        if (z) {
            str = "upload_success";
        } else {
            str = "upload_fail";
        }
        C23089d a2 = a.mo47829a(str3, str);
        String str4 = "enter_from";
        Bundle arguments = getArguments();
        String str5 = null;
        if (arguments != null) {
            str2 = arguments.getString("enter_from");
        } else {
            str2 = null;
        }
        C23089d a3 = a2.mo47829a(str4, str2);
        String str6 = "enter_method";
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str5 = arguments2.getString("enter_method");
        }
        C26890h.m65011a(b, a3.mo47829a(str6, str5).f61491a);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setOnShowListener(new C39809b(this));
        onCreateDialog.setOnKeyListener(new C39810c(this));
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

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Object obj;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.ue);
        String str2 = null;
        if (findViewById != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                obj = arguments.getString("show_type");
            } else {
                obj = null;
            }
            if (C52711k.m112239a(obj, (Object) "show_type_after_login_or_bind")) {
                findViewById.setVisibility(0);
            }
            findViewById.setOnClickListener(new C39813f(this));
        }
        this.f101587a = true;
        String b = mo80887b();
        C23089d a = C23089d.m56640a().mo47829a("event_type", "impression");
        String str3 = "enter_from";
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("enter_from");
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str3, str);
        String str4 = "enter_method";
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("enter_method");
        }
        C26890h.m65011a(b, a2.mo47829a(str4, str2).f61491a);
    }
}
