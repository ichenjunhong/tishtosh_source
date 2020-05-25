package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.Collections;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.dc */
public final class C15825dc extends C15991jf implements OnGlobalLayoutListener, OnScrollChangedListener, C15824db, C15843dt {

    /* renamed from: a */
    private ama f44819a;

    /* renamed from: b */
    private C15839dq f44820b;

    /* renamed from: c */
    private boolean f44821c;

    /* renamed from: d */
    private boolean f44822d;

    public C15825dc(ama ama) {
        this.f44819a = ama;
        if (ama != null) {
            ama.mo29154a((C15824db) this);
        }
    }

    /* renamed from: b */
    public final String mo30920b() {
        return "";
    }

    /* renamed from: c */
    public final String mo30921c() {
        return "";
    }

    /* renamed from: d */
    public final C15819cx mo30922d() {
        return null;
    }

    /* renamed from: a */
    public final void mo30919a(C15839dq dqVar) {
        this.f44820b = dqVar;
    }

    /* renamed from: e */
    public final View mo30923e() {
        if (this.f44819a == null) {
            return null;
        }
        return this.f44819a.getView();
    }

    public final void onGlobalLayout() {
        m37182i();
    }

    public final void onScrollChanged() {
        m37182i();
    }

    /* renamed from: a */
    public final void mo30917a() {
        acd.f40245a.post(new C15826dd(this));
    }

    /* renamed from: a */
    public final void mo30918a(C14882b bVar, C15992jg jgVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        if (this.f44821c) {
            abv.m32794c("Instream ad is destroyed already.");
            m37180a(jgVar, 2);
        } else if (this.f44819a.mo28936b() == null) {
            abv.m32794c("Instream internal error: can not get video controller.");
            m37180a(jgVar, 0);
        } else if (this.f44822d) {
            abv.m32794c("Instream ad should not be used again.");
            m37180a(jgVar, 1);
        } else {
            this.f44822d = true;
            m37181h();
            ((ViewGroup) C14886d.m30545a(bVar)).addView(this.f44819a.getView(), new LayoutParams(-1, -1));
            agu.m32860a(this.f44819a.getView(), (OnGlobalLayoutListener) this);
            agu.m32861a(this.f44819a.getView(), (OnScrollChangedListener) this);
            m37182i();
            try {
                jgVar.mo31109a();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: f */
    public final C15583ak mo30924f() throws RemoteException {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        if (this.f44821c) {
            abv.m32794c("Instream ad is destroyed already.");
            return null;
        } else if (this.f44819a == null) {
            return null;
        } else {
            return this.f44819a.mo28936b();
        }
    }

    /* renamed from: g */
    public final void mo30925g() {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        if (!this.f44821c) {
            m37181h();
            if (this.f44820b != null) {
                this.f44820b.mo31029l();
                this.f44820b.mo31028k();
            }
            this.f44820b = null;
            this.f44819a = null;
            this.f44821c = true;
        }
    }

    /* renamed from: h */
    private final void m37181h() {
        if (this.f44819a != null) {
            ViewParent parent = this.f44819a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.f44819a);
            }
        }
    }

    /* renamed from: i */
    private final void m37182i() {
        if (this.f44820b != null && this.f44819a != null) {
            this.f44820b.mo31039c(this.f44819a.getView(), Collections.emptyMap());
        }
    }

    /* renamed from: a */
    private static void m37180a(C15992jg jgVar, int i) {
        try {
            jgVar.mo31110a(i);
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
