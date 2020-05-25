package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
public final class aer {

    /* renamed from: a */
    public Activity f40370a;

    /* renamed from: b */
    private final View f40371b;

    /* renamed from: c */
    private boolean f40372c;

    /* renamed from: d */
    private boolean f40373d;

    /* renamed from: e */
    private boolean f40374e;

    /* renamed from: f */
    private OnGlobalLayoutListener f40375f;

    /* renamed from: g */
    private OnScrollChangedListener f40376g;

    public aer(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f40370a = activity;
        this.f40371b = view;
        this.f40375f = onGlobalLayoutListener;
        this.f40376g = onScrollChangedListener;
    }

    /* renamed from: a */
    public final void mo28757a() {
        this.f40374e = true;
        if (this.f40373d) {
            m32742e();
        }
    }

    /* renamed from: b */
    public final void mo28758b() {
        this.f40374e = false;
        m32743f();
    }

    /* renamed from: c */
    public final void mo28759c() {
        this.f40373d = true;
        if (this.f40374e) {
            m32742e();
        }
    }

    /* renamed from: d */
    public final void mo28760d() {
        this.f40373d = false;
        m32743f();
    }

    /* renamed from: e */
    private final void m32742e() {
        if (!this.f40372c) {
            if (this.f40375f != null) {
                if (this.f40370a != null) {
                    Activity activity = this.f40370a;
                    OnGlobalLayoutListener onGlobalLayoutListener = this.f40375f;
                    ViewTreeObserver a = m32741a(activity);
                    if (a != null) {
                        a.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                agu.m32860a(this.f40371b, this.f40375f);
            }
            if (this.f40376g != null) {
                if (this.f40370a != null) {
                    Activity activity2 = this.f40370a;
                    OnScrollChangedListener onScrollChangedListener = this.f40376g;
                    ViewTreeObserver a2 = m32741a(activity2);
                    if (a2 != null) {
                        a2.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                agu.m32861a(this.f40371b, this.f40376g);
            }
            this.f40372c = true;
        }
    }

    /* renamed from: f */
    private final void m32743f() {
        if (this.f40370a != null && this.f40372c) {
            if (this.f40375f != null) {
                Activity activity = this.f40370a;
                OnGlobalLayoutListener onGlobalLayoutListener = this.f40375f;
                ViewTreeObserver a = m32741a(activity);
                if (a != null) {
                    C14963ax.m30832b().mo28690a(a, onGlobalLayoutListener);
                }
            }
            if (this.f40376g != null) {
                Activity activity2 = this.f40370a;
                OnScrollChangedListener onScrollChangedListener = this.f40376g;
                ViewTreeObserver a2 = m32741a(activity2);
                if (a2 != null) {
                    a2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.f40372c = false;
        }
    }

    /* renamed from: a */
    private static ViewTreeObserver m32741a(Activity activity) {
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
