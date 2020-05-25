package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

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
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b */
public final class C44116b extends C0540c {

    /* renamed from: a */
    public static final C23543g f111771a;

    /* renamed from: b */
    public static final C44117a f111772b = new C44117a(null);

    /* renamed from: c */
    private boolean f111773c;

    /* renamed from: d */
    private BottomSheetBehavior<View> f111774d;

    /* renamed from: e */
    private final int f111775e = C23728o.m58241a(293.0d);

    /* renamed from: f */
    private HashMap f111776f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$a */
    public static final class C44117a {
        private C44117a() {
        }

        public /* synthetic */ C44117a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static C44116b m96767a(String str) {
            C44116b bVar = new C44116b();
            Bundle bundle = new Bundle();
            bundle.putString("shoot_way", str);
            bVar.setArguments(bundle);
            return bVar;
        }

        /* renamed from: a */
        public final void mo90016a(C0654k kVar, String str) {
            Fragment a = kVar.mo2224a("AutoStickPointGuideDialogFragment");
            if (!(a instanceof C44116b)) {
                a = null;
            }
            C44116b bVar = (C44116b) a;
            if (bVar == null) {
                bVar = m96767a(str);
            }
            if (!bVar.isAdded()) {
                kVar.mo2225a().mo2178a((Fragment) bVar, "AutoStickPointGuideDialogFragment").mo2195c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$b */
    static final class C44118b implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f111777a;

        /* renamed from: b */
        final /* synthetic */ C44116b f111778b;

        C44118b(Dialog dialog, C44116b bVar) {
            this.f111777a = dialog;
            this.f111778b = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ViewParent viewParent;
            ViewParent viewParent2;
            View view = this.f111778b.getView();
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
                    findViewById.setOnClickListener(new OnClickListener(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44118b f111779a;

                        {
                            this.f111779a = r1;
                        }

                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C44124c.m96771a(this.f111779a.f111777a);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$c */
    static final class C44120c implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C44116b f111780a;

        C44120c(C44116b bVar) {
            this.f111780a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C52711k.m112236a((Object) keyEvent, "event");
            if (keyEvent.getKeyCode() != 4) {
                return false;
            }
            if (keyEvent.getAction() == 1) {
                this.f111780a.dismiss();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$d */
    static final class C44121d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44116b f111781a;

        C44121d(C44116b bVar) {
            this.f111781a = bVar;
        }

        public final void run() {
            Dialog dialog = this.f111781a.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.sn);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$e */
    static final class C44122e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44116b f111782a;

        C44122e(C44116b bVar) {
            this.f111782a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111782a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$f */
    public static final class C44123f extends C0497a {

        /* renamed from: a */
        final /* synthetic */ C44116b f111783a;

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "p0");
        }

        C44123f(C44116b bVar) {
            this.f111783a = bVar;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i == 5) {
                this.f111783a.dismiss();
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f111776f != null) {
            this.f111776f.clear();
        }
    }

    static {
        Context context = C39618d.f101160a;
        C39594be beVar = C39618d.f101174o;
        C52711k.m112236a((Object) beVar, "AVEnv.SP_SERIVCE");
        f111771a = C23541e.m57714a(context, beVar.mo74236a());
    }

    public final void dismiss() {
        BottomSheetBehavior a = m96766a();
        if (a != null) {
            a.mo1301b(4);
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    public final void onStop() {
        if (!this.f111773c) {
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

    /* renamed from: a */
    private final BottomSheetBehavior<View> m96766a() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Behavior behavior;
        if (this.f111774d != null) {
            return this.f111774d;
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
        this.f111774d = (BottomSheetBehavior) behavior;
        return this.f111774d;
    }

    public final void onStart() {
        ViewParent viewParent;
        LayoutParams layoutParams;
        Behavior behavior;
        ViewParent viewParent2;
        super.onStart();
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
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo1296a(this.f111775e);
        }
        if (dVar != null) {
            dVar.height = this.f111775e;
        }
        BottomSheetBehavior a = m96766a();
        if (a != null) {
            a.f1646q = new C44123f(this);
        }
        View view3 = getView();
        if (view3 != null) {
            viewParent2 = view3.getParent();
        } else {
            viewParent2 = null;
        }
        if (!(viewParent2 instanceof View)) {
            viewParent2 = null;
        }
        View view4 = (View) viewParent2;
        if (view4 != null) {
            view4.setBackgroundColor(0);
        }
        View view5 = getView();
        if (view5 != null) {
            view5.postDelayed(new C44121d(this), 50);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f111773c = true;
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a56);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setOnShowListener(new C44118b(onCreateDialog, this));
        onCreateDialog.setOnKeyListener(new C44120c(this));
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
            } else if (VERSION.SDK_INT >= 19) {
                window2.addFlags(67108864);
            }
        }
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(sav…atusBar(window)\n        }");
        return onCreateDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            super.onViewCreated(r3, r4)
            r4 = 2132017180(0x7f14001c, float:1.9672631E38)
            android.view.View r3 = r3.findViewById(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$e r4 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$e
            r4.<init>(r2)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0027
            java.lang.String r4 = "shoot_way"
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L_0x0029
        L_0x0027:
            java.lang.String r3 = ""
        L_0x0029:
            java.lang.String r4 = "sound_sync_guide"
            com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
            r0.<init>()
            java.lang.String r1 = "shoot_way"
            com.ss.android.ugc.aweme.app.f.d r3 = r0.mo47829a(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b92, viewGroup, false);
    }
}
