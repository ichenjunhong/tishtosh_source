package com.p683ss.android.ugc.aweme.poi.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.m */
public abstract class C38989m implements OnClickListener {

    /* renamed from: c */
    public static boolean f99325c = true;

    /* renamed from: d */
    public static final C38990a f99326d = new C38990a(null);

    /* renamed from: a */
    private final Runnable f99327a;

    /* renamed from: b */
    private final long f99328b;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.m$a */
    public static final class C38990a {
        private C38990a() {
        }

        public /* synthetic */ C38990a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.m$b */
    static final class C38991b implements Runnable {

        /* renamed from: a */
        public static final C38991b f99329a = new C38991b();

        C38991b() {
        }

        public final void run() {
            C38989m.f99325c = true;
        }
    }

    public C38989m() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public abstract void mo79133a(View view);

    private C38989m(long j) {
        this.f99328b = j;
        this.f99327a = C38991b.f99329a;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        if (f99325c) {
            f99325c = false;
            view.postDelayed(this.f99327a, this.f99328b);
            mo79133a(view);
        }
    }

    private /* synthetic */ C38989m(long j, int i, C52707g gVar) {
        this(300);
    }
}
