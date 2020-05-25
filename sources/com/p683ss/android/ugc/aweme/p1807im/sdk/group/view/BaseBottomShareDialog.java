package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.C0535b;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35096e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35098g;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.BaseBottomShareDialog */
public abstract class BaseBottomShareDialog extends C0535b implements C0183j, C35098g {

    /* renamed from: f */
    public static final C34285a f88522f = new C34285a(null);

    /* renamed from: d */
    public final Context f88523d;

    /* renamed from: e */
    public final C0184k f88524e;

    /* renamed from: g */
    private boolean f88525g;

    /* renamed from: h */
    private final C35096e f88526h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.BaseBottomShareDialog$a */
    public static final class C34285a {
        private C34285a() {
        }

        public /* synthetic */ C34285a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.BaseBottomShareDialog$b */
    static final class C34286b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Window f88527a;

        C34286b(Window window) {
            this.f88527a = window;
        }

        public final void run() {
            this.f88527a.setWindowAnimations(R.style.y);
        }
    }

    /* renamed from: a */
    public final C35096e mo72311a() {
        return this.f88526h;
    }

    /* renamed from: b */
    public abstract int mo42942b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo72312c() {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onHostDestroy() {
        this.f88524e.getLifecycle().mo325b(this);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onHostPause() {
        this.f88525g = true;
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(0);
        }
    }

    public void onStop() {
        super.onStop();
        this.f88524e.getLifecycle().mo325b(this);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onHostResume() {
        if (this.f88525g) {
            Window window = getWindow();
            if (window != null) {
                window.getDecorView().postDelayed(new C34286b(window), 500);
            }
        }
        this.f88525g = false;
    }

    public BaseBottomShareDialog(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a67);
        this.f88523d = context;
        Context context2 = this.f88523d;
        if (context2 != null) {
            this.f88524e = (C0184k) context2;
            this.f88526h = new C35096e();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo42942b());
        Window window = getWindow();
        if (window != null) {
            int b = C9432q.m18688b(window.getContext()) - C9432q.m18695e(window.getContext());
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            LayoutParams attributes = window.getAttributes();
            window.getAttributes().gravity = 80;
            window.setAttributes(attributes);
            window.findViewById(R.id.a4q).setBackgroundDrawable(new ColorDrawable(0));
            setCanceledOnTouchOutside(true);
        }
        this.f88524e.getLifecycle().mo324a(this);
        mo72312c();
    }
}
