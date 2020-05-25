package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31091a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31097d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31099e;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31052a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.views.C48217o;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i */
public final class C31083i extends C48217o implements C31080f {

    /* renamed from: a */
    public LinearLayout f81348a;

    /* renamed from: b */
    public ViewGroup f81349b;

    /* renamed from: c */
    public C31051a f81350c;

    /* renamed from: d */
    private View f81351d;

    /* renamed from: e */
    private long f81352e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i$a */
    static final class C31084a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31083i f81353a;

        C31084a(C31083i iVar) {
            this.f81353a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f81353a.f81349b;
            if (viewGroup == null) {
                C52711k.m112237a("mSecondaryLayout");
            }
            if (viewGroup.getVisibility() == 0) {
                C26890h.m65011a("block_videos_click_back", C23089d.m56640a().mo47829a("click_method", "blank").mo47829a("enter_from", this.f81353a.f81350c.f81299c).mo47829a("enter_method", "long_press").f61491a);
            }
            this.f81353a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i$b */
    public static final class C31085b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C31083i f81354a;

        public final void onGlobalLayout() {
            int[] iArr = new int[2];
            C31083i.m72678a(this.f81354a).getLocationOnScreen(iArr);
            LayoutParams layoutParams = C31083i.m72678a(this.f81354a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 48;
                if (C18920g.m46054c()) {
                    layoutParams2.topMargin = iArr[1] - C23724k.m58225c();
                } else {
                    layoutParams2.topMargin = iArr[1];
                }
                C31083i.m72678a(this.f81354a).requestLayout();
                C31083i.m72678a(this.f81354a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        C31085b(C31083i iVar) {
            this.f81354a = iVar;
        }
    }

    /* renamed from: b */
    public final ViewGroup mo63859b() {
        LinearLayout linearLayout = this.f81348a;
        if (linearLayout == null) {
            C52711k.m112237a("mOptionsView");
        }
        return linearLayout;
    }

    /* renamed from: a */
    public final ViewGroup mo63858a() {
        ViewGroup viewGroup = this.f81349b;
        if (viewGroup == null) {
            C52711k.m112237a("mSecondaryLayout");
        }
        return viewGroup;
    }

    public final void onBackPressed() {
        ViewGroup viewGroup = this.f81349b;
        if (viewGroup == null) {
            C52711k.m112237a("mSecondaryLayout");
        }
        if (viewGroup != null) {
            ViewGroup viewGroup2 = this.f81349b;
            if (viewGroup2 == null) {
                C52711k.m112237a("mSecondaryLayout");
            }
            if (viewGroup2.getVisibility() == 0) {
                C31052a aVar = new C31052a(this.f81350c);
                View view = this.f81351d;
                if (view == null) {
                    C52711k.m112237a("mRootView");
                }
                aVar.mo63839b(view);
                return;
            }
        }
        super.onBackPressed();
    }

    public final void show() {
        Object obj;
        Activity a = C23729p.m58248a(getContext());
        if (a != null) {
            obj = a.getSystemService("vibrator");
        } else {
            obj = null;
        }
        if (obj != null) {
            Vibrator vibrator = (Vibrator) obj;
            if (vibrator != null) {
                vibrator.vibrate(15);
            }
            super.show();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.os.Vibrator");
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m72678a(C31083i iVar) {
        LinearLayout linearLayout = iVar.f81348a;
        if (linearLayout == null) {
            C52711k.m112237a("mOptionsView");
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
            }
        } catch (Exception e) {
            C47625i.m103103a(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.kb);
        View findViewById = findViewById(R.id.cfc);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.root)");
        this.f81351d = findViewById;
        View findViewById2 = findViewById(R.id.bv8);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.options)");
        this.f81348a = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.e5a);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.dislike_reason_container)");
        this.f81349b = (ViewGroup) findViewById3;
        this.f81352e = System.currentTimeMillis();
        List<C31081g> a = this.f81350c.mo63835a();
        LinearLayout linearLayout = this.f81348a;
        if (linearLayout == null) {
            C52711k.m112237a("mOptionsView");
        }
        linearLayout.removeAllViews();
        for (C31081g gVar : a) {
            if (gVar instanceof C31082h) {
                C31099e eVar = new C31099e(getContext());
                eVar.mo63879a((C31082h) gVar);
                LinearLayout linearLayout2 = this.f81348a;
                if (linearLayout2 == null) {
                    C52711k.m112237a("mOptionsView");
                }
                linearLayout2.addView(eVar);
            } else if (gVar instanceof C31077c) {
                C31091a aVar = new C31091a(getContext());
                aVar.mo63870a((C31077c) gVar);
                LinearLayout linearLayout3 = this.f81348a;
                if (linearLayout3 == null) {
                    C52711k.m112237a("mOptionsView");
                }
                linearLayout3.addView(aVar);
            } else if (gVar instanceof C31079e) {
                C31097d dVar = new C31097d(getContext());
                dVar.mo63877a((C31079e) gVar);
                LinearLayout linearLayout4 = this.f81348a;
                if (linearLayout4 == null) {
                    C52711k.m112237a("mOptionsView");
                }
                linearLayout4.addView(dVar);
            }
        }
        LinearLayout linearLayout5 = this.f81348a;
        if (linearLayout5 == null) {
            C52711k.m112237a("mOptionsView");
        }
        linearLayout5.requestLayout();
        View view = this.f81351d;
        if (view == null) {
            C52711k.m112237a("mRootView");
        }
        view.setOnClickListener(new C31084a(this));
        LinearLayout linearLayout6 = this.f81348a;
        if (linearLayout6 == null) {
            C52711k.m112237a("mOptionsView");
        }
        linearLayout6.getViewTreeObserver().addOnGlobalLayoutListener(new C31085b(this));
    }

    public C31083i(Context context, Aweme aweme, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        super(context, R.style.gx, true, false, false);
        this.f81350c = new C31051a(this, aweme, str);
    }
}
