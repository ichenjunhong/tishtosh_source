package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer */
public final class AdHalfWebPageMaskLayer extends FrameLayout implements OnTouchListener {

    /* renamed from: b */
    public static final C26572b f69954b = new C26572b(null);

    /* renamed from: a */
    public boolean f69955a;

    /* renamed from: c */
    private C26571a f69956c;

    /* renamed from: d */
    private long f69957d;

    /* renamed from: e */
    private float f69958e;

    /* renamed from: f */
    private float f69959f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$a */
    public interface C26571a {
        /* renamed from: a */
        void mo54300a();

        /* renamed from: a */
        void mo54301a(boolean z);

        /* renamed from: b */
        void mo54302b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$b */
    public static final class C26572b {
        private C26572b() {
        }

        public /* synthetic */ C26572b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$c */
    static final class C26573c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageMaskLayer f69960a;

        C26573c(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f69960a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f69960a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$d */
    static final class C26574d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageMaskLayer f69961a;

        C26574d(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f69961a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f69961a.setVisibility(0);
        }
    }

    public AdHalfWebPageMaskLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C26571a getCallback() {
        return this.f69956c;
    }

    /* renamed from: b */
    public final void mo54292b() {
        setVisibility(8);
        setAlpha(0.0f);
        this.f69955a = false;
        this.f69956c = null;
    }

    /* renamed from: c */
    public final void mo54293c() {
        if (this.f69955a) {
            C26571a aVar = this.f69956c;
            if (aVar != null) {
                aVar.mo54300a();
            }
        }
    }

    /* renamed from: a */
    public final void mo54291a() {
        animate().alpha(0.8f).withStartAction(new C26574d(this)).setDuration(100).start();
        C26571a aVar = this.f69956c;
        if (aVar != null) {
            aVar.mo54300a();
        }
        this.f69955a = true;
    }

    public final void setCallback(C26571a aVar) {
        this.f69956c = aVar;
    }

    public final void setShowing(boolean z) {
        this.f69955a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final void dismiss(boolean z) {
        animate().alpha(0.0f).withEndAction(new C26573c(this)).setDuration(100).start();
        C26571a aVar = this.f69956c;
        if (aVar != null) {
            aVar.mo54301a(z);
        }
        this.f69955a = false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(view, "v");
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                this.f69957d = System.currentTimeMillis();
                this.f69958e = motionEvent.getX();
                this.f69959f = motionEvent.getY();
                break;
            case 1:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (System.currentTimeMillis() - this.f69957d <= 100) {
                    float f = this.f69958e;
                    float f2 = this.f69959f;
                    float abs = Math.abs(f - x);
                    float abs2 = Math.abs(f2 - y);
                    if (abs > 50.0f || abs2 > 50.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C26571a aVar = this.f69956c;
                        if (aVar != null) {
                            aVar.mo54302b();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setBackgroundColor(-16777216);
        setOnTouchListener(this);
        mo54292b();
    }

    public /* synthetic */ AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
