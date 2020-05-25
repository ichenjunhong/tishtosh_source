package com.p683ss.android.ugc.aweme.pendant;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.LottieAnimationView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView */
public final class OptimizedLottieAnimationView extends LottieAnimationView implements C0183j {

    /* renamed from: b */
    private boolean f98076b;

    /* renamed from: c */
    private boolean f98077c;

    /* renamed from: d */
    private boolean f98078d;

    /* renamed from: e */
    private C0184k f98079e;

    public OptimizedLottieAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public OptimizedLottieAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        if (!this.f98077c) {
            this.f98077c = true;
            boolean e = mo6660e();
            if (this.f98078d) {
                this.f98076b = e;
            }
            if (e) {
                mo6662g();
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        if (this.f98077c) {
            this.f98077c = false;
            if (this.f98076b && this.f98078d) {
                mo6657c();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
        C0184k kVar = this.f98079e;
        if (kVar != null) {
            kVar.getLifecycle().mo324a(this);
            return;
        }
        Activity a = m85891a((View) this);
        if (a instanceof C0184k) {
            ((C0184k) a).getLifecycle().mo324a(this);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0184k kVar = this.f98079e;
        if (kVar != null) {
            kVar.getLifecycle().mo325b(this);
            return;
        }
        Activity a = m85891a((View) this);
        if (a instanceof C0184k) {
            ((C0184k) a).getLifecycle().mo325b(this);
        }
    }

    /* renamed from: a */
    private final Activity m85891a(View view) {
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "view.context");
        return m85890a(context);
    }

    /* renamed from: a */
    private static Activity m85890a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            C52711k.m112236a((Object) context, "context.baseContext");
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final void setComposition(C2408e eVar) {
        C52711k.m112240b(eVar, "composition");
        super.setComposition(eVar);
        onVisibilityChanged(this, getVisibility());
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C52711k.m112240b(view, "changedView");
        super.onVisibilityChanged(view, i);
        try {
            getRepeatMode();
            if (isShown()) {
                if (!this.f98078d) {
                    this.f98078d = true;
                    if (!this.f98077c && this.f98076b) {
                        mo6657c();
                    }
                }
            } else if (this.f98078d) {
                this.f98078d = false;
                boolean e = mo6660e();
                if (!this.f98077c) {
                    this.f98076b = e;
                }
                if (e) {
                    mo6662g();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    public OptimizedLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ OptimizedLottieAnimationView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
