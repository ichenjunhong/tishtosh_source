package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.C26605a;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer */
public final class AdPopUpWebBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: h */
    static final /* synthetic */ C52767h[] f70454h = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdPopUpWebBottomSheetContainer.class), "actionMode", "getActionMode()Lcom/ss/android/ugc/aweme/commercialize/views/popupwebpage/ActionMode;"))};

    /* renamed from: j */
    public static boolean f70455j = true;

    /* renamed from: k */
    public static final C26746c f70456k = new C26746c(null);

    /* renamed from: i */
    AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> f70457i;

    /* renamed from: l */
    private C26747d f70458l;

    /* renamed from: m */
    private final C52668f f70459m;

    /* renamed from: n */
    private C26745b f70460n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$a */
    public static final class C26744a extends C26605a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetBehavior f70461a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f70462b;

        C26744a(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer) {
            this.f70461a = adPopUpWebBottomSheetBehavior;
            this.f70462b = adPopUpWebBottomSheetContainer;
        }

        /* renamed from: a */
        public final void mo54356a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
            C26745b callback = this.f70462b.getCallback();
            if (callback != null) {
                callback.mo54599a(view, f);
            }
        }

        /* renamed from: a */
        public final void mo54357a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i != 1) {
                switch (i) {
                    case 3:
                        if (this.f70462b.getActionMode().f70524b != 0) {
                            this.f70461a.mo54338a(this.f70462b.getActionMode().f70524b);
                        }
                        C26745b callback = this.f70462b.getCallback();
                        if (callback != null) {
                            callback.mo54598a();
                        }
                        return;
                    case 4:
                        C26745b callback2 = this.f70462b.getCallback();
                        if (callback2 != null) {
                            callback2.mo54600b();
                        }
                        return;
                    case 5:
                        C26745b callback3 = this.f70462b.getCallback();
                        if (callback3 != null) {
                            callback3.mo54602d();
                            return;
                        }
                        break;
                }
                return;
            }
            if (!C26746c.m64664a() && !C26779b.m64713a()) {
                this.f70461a.mo54341b(3);
            }
            C26745b callback4 = this.f70462b.getCallback();
            if (callback4 != null) {
                callback4.mo54601c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$b */
    public interface C26745b {
        /* renamed from: a */
        void mo54598a();

        /* renamed from: a */
        void mo54599a(View view, float f);

        /* renamed from: b */
        void mo54600b();

        /* renamed from: c */
        void mo54601c();

        /* renamed from: d */
        void mo54602d();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$c */
    public static final class C26746c {
        private C26746c() {
        }

        /* renamed from: a */
        public static boolean m64664a() {
            return AdPopUpWebBottomSheetContainer.f70455j;
        }

        /* renamed from: a */
        public static void m64663a(boolean z) {
            AdPopUpWebBottomSheetContainer.f70455j = z;
        }

        public /* synthetic */ C26746c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$d */
    public interface C26747d {
        /* renamed from: a */
        boolean mo54603a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$e */
    static final class C26748e extends C52712l implements C52670a<C26777a> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f70463a;

        /* renamed from: b */
        final /* synthetic */ Context f70464b;

        C26748e(AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, Context context) {
            this.f70463a = adPopUpWebBottomSheetContainer;
            this.f70464b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26777a aVar = new C26777a(this.f70464b, this.f70463a, 0, 4, null);
            return aVar;
        }
    }

    public AdPopUpWebBottomSheetContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C26777a getActionMode() {
        return (C26777a) this.f70459m.getValue();
    }

    public final AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> getBehavior() {
        return this.f70457i;
    }

    public final C26745b getCallback() {
        return this.f70460n;
    }

    public final C26747d getOnInterceptListener() {
        return this.f70458l;
    }

    /* renamed from: a */
    public final void mo54229a() {
        this.f70457i.mo54341b(3);
    }

    /* renamed from: c */
    private boolean m64652c() {
        if (this.f70457i.f70028f == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m64653d() {
        if (this.f70457i.f70028f == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo54589b() {
        if (m64652c() || m64653d()) {
            return true;
        }
        return false;
    }

    public final void setCallback(C26745b bVar) {
        this.f70460n = bVar;
    }

    public final void setOnInterceptListener(C26747d dVar) {
        this.f70458l = dVar;
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior) {
        C52711k.m112240b(adPopUpWebBottomSheetBehavior, "<set-?>");
        this.f70457i = adPopUpWebBottomSheetBehavior;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C26747d dVar = this.f70458l;
        if (dVar != null) {
            return dVar.mo54603a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setWebViewForDragBehavior(WebView webView) {
        C52711k.m112240b(webView, "webView");
        this.f70457i.f70037o = webView;
    }

    public AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.f70033k = new C26744a(adPopUpWebBottomSheetBehavior, this);
        this.f70457i = adPopUpWebBottomSheetBehavior;
        this.f70459m = C52732g.m112285a(new C26748e(this, context));
        this.f70457i.f70026d = true;
        f70455j = true;
        this.f70457i.mo54341b(5);
        this.f70457i.mo54338a(getActionMode().f70523a);
    }

    public /* synthetic */ AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
