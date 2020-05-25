package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C15870et;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.ads.formats.d */
public final class C14921d extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f38485a;

    /* renamed from: b */
    private final C15870et f38486b;

    public final C14915a getAdChoicesView() {
        View a = m30612a("1098");
        if (a instanceof C14915a) {
            return (C14915a) a;
        }
        return null;
    }

    /* renamed from: a */
    private View m30612a(String str) {
        try {
            C14882b a = this.f38486b.mo31054a(str);
            if (a != null) {
                return (View) C14886d.m30545a(a);
            }
        } catch (RemoteException e) {
            afc.m32793b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    public final void setNativeAd(C14916b bVar) {
        try {
            this.f38486b.mo31056a((C14882b) bVar.mo27346a());
        } catch (RemoteException e) {
            afc.m32793b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f38485a);
    }

    public final void removeView(View view) {
        if (this.f38485a != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f38485a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f38485a != view) {
            super.bringChildToFront(this.f38485a);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f38486b != null) {
            try {
                this.f38486b.mo31057a(C14886d.m30544a(view), i);
            } catch (RemoteException e) {
                afc.m32793b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void setAdChoicesView(C14915a aVar) {
        try {
            this.f38486b.mo31058a("1098", C14886d.m30544a(aVar));
        } catch (RemoteException e) {
            afc.m32793b("Unable to call setAssetView on delegate", e);
        }
    }
}
