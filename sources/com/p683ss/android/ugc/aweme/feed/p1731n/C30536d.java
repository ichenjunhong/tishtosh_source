package com.p683ss.android.ugc.aweme.feed.p1731n;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.n.d */
public final class C30536d extends PopupWindow {

    /* renamed from: c */
    public static final C30537a f79800c = new C30537a(null);

    /* renamed from: a */
    PullUpLayout f79801a;

    /* renamed from: b */
    final Activity f79802b;

    /* renamed from: d */
    private final String f79803d;

    /* renamed from: e */
    private final UrlModel f79804e;

    /* renamed from: com.ss.android.ugc.aweme.feed.n.d$a */
    public static final class C30537a {
        private C30537a() {
        }

        public /* synthetic */ C30537a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.n.d$b */
    static final class C30538b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30536d f79805a;

        C30538b(C30536d dVar) {
            this.f79805a = dVar;
        }

        public final void run() {
            C30536d dVar = this.f79805a;
            if (dVar.isShowing()) {
                try {
                    if (!dVar.f79802b.isFinishing()) {
                        PullUpLayout pullUpLayout = dVar.f79801a;
                        if (pullUpLayout == null) {
                            C52711k.m112237a("pullUpLayout");
                        }
                        pullUpLayout.mo54988a(0.0f, true);
                        dVar.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62733a() {
        PullUpLayout pullUpLayout = this.f79801a;
        if (pullUpLayout == null) {
            C52711k.m112237a("pullUpLayout");
        }
        pullUpLayout.mo54987a();
        if (!isShowing()) {
            View contentView = getContentView();
            C52711k.m112236a((Object) contentView, "contentView");
            if (contentView.getParent() != null) {
                View contentView2 = getContentView();
                C52711k.m112236a((Object) contentView2, "contentView");
                ViewParent parent = contentView2.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(getContentView());
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            PullUpLayout pullUpLayout2 = this.f79801a;
            if (pullUpLayout2 == null) {
                C52711k.m112237a("pullUpLayout");
            }
            pullUpLayout2.postDelayed(new C30538b(this), 3000);
            Window window = this.f79802b.getWindow();
            C52711k.m112236a((Object) window, "ctx.window");
            showAtLocation(window.getDecorView(), 48, 0, 0);
        }
    }

    public C30536d(Activity activity, String str, UrlModel urlModel) {
        C52711k.m112240b(activity, "ctx");
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(urlModel, "cover");
        super(activity);
        this.f79802b = activity;
        this.f79803d = str;
        this.f79804e = urlModel;
        setContentView(LayoutInflater.from(this.f79802b).inflate(R.layout.a7k, null));
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(C9432q.m18670a((Context) this.f79802b));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wt);
        DmtTextView dmtTextView = (DmtTextView) getContentView().findViewById(R.id.cmn);
        C52711k.m112236a((Object) dmtTextView, "hintView");
        dmtTextView.setText(this.f79802b.getResources().getString(R.string.dhi, new Object[]{this.f79803d}));
        C23515d.m57669a((RemoteImageView) getContentView().findViewById(R.id.cmp), this.f79804e);
        View findViewById = getContentView().findViewById(R.id.c70);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.pull_layout)");
        this.f79801a = (PullUpLayout) findViewById;
        PullUpLayout pullUpLayout = this.f79801a;
        if (pullUpLayout == null) {
            C52711k.m112237a("pullUpLayout");
        }
        pullUpLayout.mo54989a(getContentView().findViewById(R.id.a8q), false);
    }
}
