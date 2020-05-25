package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj */
public final class C26379aj {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69594a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26379aj.class), "mDecorView", "getMDecorView()Landroid/view/View;"))};

    /* renamed from: g */
    public static final C26381b f69595g = new C26381b(null);

    /* renamed from: b */
    public int f69596b;

    /* renamed from: c */
    public int f69597c;

    /* renamed from: d */
    public OnGlobalLayoutListener f69598d = new C26383d(this);

    /* renamed from: e */
    public C26380a f69599e;

    /* renamed from: f */
    public final Activity f69600f;

    /* renamed from: h */
    private final C52668f f69601h = C52732g.m112285a(new C26382c(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$a */
    public interface C26380a {
        /* renamed from: a */
        void mo54103a(int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$b */
    public static final class C26381b {
        private C26381b() {
        }

        public /* synthetic */ C26381b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$c */
    static final class C26382c extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C26379aj f69602a;

        C26382c(C26379aj ajVar) {
            this.f69602a = ajVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Window window = this.f69602a.f69600f.getWindow();
            C52711k.m112236a((Object) window, "mActivity.window");
            return window.getDecorView();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$d */
    static final class C26383d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C26379aj f69603a;

        C26383d(C26379aj ajVar) {
            this.f69603a = ajVar;
        }

        public final void onGlobalLayout() {
            int c = this.f69603a.mo54102c();
            if (this.f69603a.f69596b == 0) {
                this.f69603a.f69596b = c;
            } else if (this.f69603a.f69596b != c) {
                if (Math.abs(c - this.f69603a.f69596b) > 20) {
                    C26380a aVar = this.f69603a.f69599e;
                    if (aVar != null) {
                        aVar.mo54103a(this.f69603a.f69596b, c, this.f69603a.f69597c);
                    }
                }
                this.f69603a.f69596b = c;
            }
        }
    }

    /* renamed from: a */
    public final View mo54100a() {
        return (View) this.f69601h.getValue();
    }

    /* renamed from: b */
    public final void mo54101b() {
        mo54100a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f69598d);
    }

    /* renamed from: c */
    public final int mo54102c() {
        Rect rect = new Rect();
        mo54100a().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public C26379aj(Activity activity) {
        C52711k.m112240b(activity, "mActivity");
        this.f69600f = activity;
    }
}
