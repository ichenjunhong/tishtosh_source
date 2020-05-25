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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j */
public final class C26519j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69843a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26519j.class), "mDecorView", "getMDecorView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C26521b f69844f = new C26521b(null);

    /* renamed from: b */
    public int f69845b;

    /* renamed from: c */
    public C26520a f69846c;

    /* renamed from: d */
    public final Activity f69847d;

    /* renamed from: e */
    public final View f69848e;

    /* renamed from: g */
    private final C52668f f69849g = C52732g.m112285a(new C26523d(this));

    /* renamed from: h */
    private OnGlobalLayoutListener f69850h;

    /* renamed from: i */
    private int f69851i = 16;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$a */
    public interface C26520a {
        /* renamed from: a */
        void mo54210a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$b */
    public static final class C26521b {
        private C26521b() {
        }

        public /* synthetic */ C26521b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$c */
    static final class C26522c implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C26519j f69852a;

        C26522c(C26519j jVar) {
            this.f69852a = jVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f69852a.mo54207a().getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            if (this.f69852a.f69845b == 0) {
                this.f69852a.f69845b = height;
            } else if (this.f69852a.f69845b != height) {
                int i = height - this.f69852a.f69845b;
                if (i < -20) {
                    View view = this.f69852a.f69848e;
                    Rect rect2 = new Rect();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    rect2.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                    this.f69852a.f69848e.animate().translationYBy((float) (-((rect2.bottom - rect.bottom) + 30))).setDuration(100).start();
                    C26520a aVar = this.f69852a.f69846c;
                    if (aVar != null) {
                        aVar.mo54210a(true);
                    }
                } else if (i > 20) {
                    this.f69852a.f69848e.animate().translationY((((float) (this.f69852a.mo54207a().getHeight() - this.f69852a.f69848e.getHeight())) / 2.0f) - ((float) this.f69852a.f69848e.getTop())).setDuration(100).start();
                    C26520a aVar2 = this.f69852a.f69846c;
                    if (aVar2 != null) {
                        aVar2.mo54210a(false);
                    }
                }
                this.f69852a.f69845b = height;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$d */
    static final class C26523d extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C26519j f69853a;

        C26523d(C26519j jVar) {
            this.f69853a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Window window = this.f69853a.f69847d.getWindow();
            C52711k.m112236a((Object) window, "mActivity.window");
            return window.getDecorView();
        }
    }

    /* renamed from: a */
    public final View mo54207a() {
        return (View) this.f69849g.getValue();
    }

    /* renamed from: c */
    public final void mo54209c() {
        this.f69847d.getWindow().setSoftInputMode(this.f69851i);
        mo54207a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f69850h);
        this.f69850h = null;
    }

    /* renamed from: b */
    public final void mo54208b() {
        Window window = this.f69847d.getWindow();
        this.f69851i = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        this.f69850h = new C26522c(this);
        mo54207a().getViewTreeObserver().addOnGlobalLayoutListener(this.f69850h);
    }

    public C26519j(Activity activity, View view) {
        C52711k.m112240b(activity, "mActivity");
        C52711k.m112240b(view, "mContainerView");
        this.f69847d = activity;
        this.f69848e = view;
    }
}
