package com.p683ss.android.ugc.aweme.utils;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ca */
public abstract class C47755ca implements OnClickListener {

    /* renamed from: e */
    private static boolean f120274e = true;

    /* renamed from: g */
    public static final C47756a f120275g = new C47756a(null);

    /* renamed from: a */
    private final int f120276a;

    /* renamed from: b */
    private final boolean f120277b;

    /* renamed from: c */
    private boolean f120278c;

    /* renamed from: d */
    private final Runnable f120279d;

    /* renamed from: com.ss.android.ugc.aweme.utils.ca$a */
    public static final class C47756a {
        private C47756a() {
        }

        public /* synthetic */ C47756a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ca$b */
    static final class C47757b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47755ca f120280a;

        C47757b(C47755ca caVar) {
            this.f120280a = caVar;
        }

        public final void run() {
            this.f120280a.mo95029a(true);
        }
    }

    public C47755ca() {
        this(0, false, 3, null);
    }

    public C47755ca(int i) {
        this(i, false, 2, null);
    }

    /* renamed from: a */
    public abstract void mo58980a(View view);

    /* renamed from: a */
    public final void mo95029a(boolean z) {
        if (this.f120277b) {
            f120274e = z;
        } else {
            this.f120278c = z;
        }
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        if (this.f120277b) {
            z = f120274e;
        } else {
            z = this.f120278c;
        }
        if (z) {
            mo95029a(false);
            view.postDelayed(this.f120279d, (long) this.f120276a);
            mo58980a(view);
        }
    }

    private C47755ca(int i, boolean z) {
        this.f120278c = true;
        this.f120279d = new C47757b(this);
        this.f120276a = i;
        this.f120277b = z;
    }

    public /* synthetic */ C47755ca(int i, boolean z, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        this(i, z);
    }
}
