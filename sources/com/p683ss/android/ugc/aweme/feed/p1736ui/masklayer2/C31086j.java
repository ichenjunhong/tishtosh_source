package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.C0535b;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31091a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31097d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31099e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.p2174a.C42330a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.p2174a.C42330a.C42331a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.j */
public final class C31086j extends C0535b implements C31080f {

    /* renamed from: e */
    public static final C31087a f81355e = new C31087a(null);

    /* renamed from: d */
    public float f81356d;

    /* renamed from: f */
    private View f81357f;

    /* renamed from: g */
    private LinearLayout f81358g;

    /* renamed from: h */
    private View f81359h;

    /* renamed from: i */
    private long f81360i;

    /* renamed from: j */
    private BottomSheetBehavior<FrameLayout> f81361j;

    /* renamed from: k */
    private C31051a f81362k;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.j$a */
    public static final class C31087a {
        private C31087a() {
        }

        public /* synthetic */ C31087a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.j$b */
    public static final class C31088b extends C0497a {

        /* renamed from: a */
        final /* synthetic */ C31086j f81363a;

        C31088b(C31086j jVar) {
            this.f81363a = jVar;
        }

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "p0");
            this.f81363a.f81356d = f;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i != 2) {
                if (i == 5) {
                    this.f81363a.dismiss();
                    this.f81363a.mo63865a("slide_down");
                }
            } else if (this.f81363a.f81356d < 0.5f) {
                this.f81363a.dismiss();
                this.f81363a.mo63865a("slide_down");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.j$c */
    static final class C31089c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31086j f81364a;

        C31089c(C31086j jVar) {
            this.f81364a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f81364a.isShowing()) {
                this.f81364a.dismiss();
                this.f81364a.mo63865a("click_fade");
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        mo63865a("click_fade");
    }

    /* renamed from: a */
    public final void mo63865a(String str) {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis() - this.f81360i;
        String str4 = "exit_trans_layer";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f81362k.f81299c).mo47829a("enter_method", str);
        String str5 = "group_id";
        Aweme aweme = this.f81362k.f81298b;
        String str6 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        C23089d a2 = a.mo47829a(str5, str2);
        String str7 = "author_id";
        Aweme aweme2 = this.f81362k.f81298b;
        if (aweme2 != null) {
            str3 = aweme2.getAuthorUid();
        } else {
            str3 = null;
        }
        C23089d a3 = a2.mo47829a(str7, str3);
        String str8 = "log_pb";
        C29981aa a4 = C29981aa.m70153a();
        Aweme aweme3 = this.f81362k.f81298b;
        if (aweme3 != null) {
            str6 = aweme3.getRequestId();
        }
        C26890h.m65011a(str4, a3.mo47829a(str8, a4.mo60161a(str6)).mo47827a("duration", currentTimeMillis).f61491a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.b5p);
        this.f81357f = findViewById(R.id.cfc);
        this.f81358g = (LinearLayout) findViewById(R.id.bv8);
        this.f81359h = findViewById(R.id.f0p);
        this.f81360i = System.currentTimeMillis();
        C42331a aVar = C42330a.f106908a;
        C0535b bVar = this;
        View view = this.f81357f;
        if (view == null) {
            C52711k.m112234a();
        }
        aVar.mo86245a(bVar, view);
        View findViewById = findViewById(R.id.a4q);
        if (findViewById != null) {
            this.f81361j = BottomSheetBehavior.m1227a((FrameLayout) findViewById);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f81361j;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f1646q = new C31088b(this);
            }
            List<C31081g> a = this.f81362k.mo63835a();
            View view2 = this.f81359h;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            LinearLayout linearLayout = this.f81358g;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                for (C31081g gVar : a) {
                    if (gVar instanceof C31082h) {
                        C31099e eVar = new C31099e(linearLayout.getContext());
                        eVar.mo63879a((C31082h) gVar);
                        linearLayout.addView(eVar);
                    } else if (gVar instanceof C31077c) {
                        C31091a aVar2 = new C31091a(linearLayout.getContext());
                        aVar2.mo63870a((C31077c) gVar);
                        linearLayout.addView(aVar2);
                    } else if (gVar instanceof C31079e) {
                        C31097d dVar = new C31097d(linearLayout.getContext());
                        dVar.mo63877a((C31079e) gVar);
                        linearLayout.addView(dVar);
                    }
                }
                linearLayout.requestLayout();
                View view3 = this.f81357f;
                if (view3 != null) {
                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f81361j;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.mo1296a(view3.getHeight());
                    }
                }
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior3 = this.f81361j;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.f1639j = true;
                }
            }
            View findViewById2 = findViewById(R.id.d3x);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new C31089c(this));
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public C31086j(Context context, Aweme aweme, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        super(context, R.style.a58);
        this.f81362k = new C31051a(this, aweme, str);
    }
}
