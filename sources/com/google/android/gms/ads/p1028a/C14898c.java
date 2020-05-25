package com.google.android.gms.ads.p1028a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C14895a;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.ads.C14935g;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.C15040j;
import com.google.android.gms.internal.ads.C15641at;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15816cu;
import com.google.android.gms.internal.ads.C15931h;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.zzacq;

/* renamed from: com.google.android.gms.ads.a.c */
public final class C14898c extends ViewGroup {

    /* renamed from: a */
    private final C15641at f38428a;

    public final C14937i getVideoController() {
        return this.f38428a.f41316b;
    }

    public final void setVideoOptions(C15040j jVar) {
        zzacq zzacq;
        C15641at atVar = this.f38428a;
        atVar.f41325k = jVar;
        try {
            if (atVar.f41323i != null) {
                C15931h hVar = atVar.f41323i;
                if (jVar == null) {
                    zzacq = null;
                } else {
                    zzacq = new zzacq(jVar);
                }
                hVar.mo27468a(zzacq);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    public final C15040j getVideoOptions() {
        return this.f38428a.f41325k;
    }

    public final C14895a getAdListener() {
        return this.f38428a.f41319e;
    }

    public final C14912d getAdSize() {
        return this.f38428a.mo29512a();
    }

    public final C14912d[] getAdSizes() {
        return this.f38428a.f41320f;
    }

    public final String getAdUnitId() {
        return this.f38428a.mo29518b();
    }

    public final C14896a getAppEventListener() {
        return this.f38428a.f41321g;
    }

    public final C14897b getOnCustomRenderedAdLoadedListener() {
        return this.f38428a.f41324j;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C15641at atVar = this.f38428a;
        atVar.f41329o = z;
        try {
            if (atVar.f41323i != null) {
                atVar.f41323i.mo27475a(atVar.f41329o);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(C14895a aVar) {
        this.f38428a.mo29514a(aVar);
    }

    public final void setAdSizes(C14912d... dVarArr) {
        if (dVarArr == null || dVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f38428a.mo29519b(dVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f38428a.mo29516a(str);
    }

    public final void setAppEventListener(C14896a aVar) {
        this.f38428a.mo29513a(aVar);
    }

    public final void setCorrelator(C14935g gVar) {
        C15641at atVar = this.f38428a;
        atVar.f41322h = gVar;
        try {
            if (atVar.f41323i != null) {
                atVar.f41323i.mo27464a((C16309v) atVar.f41322h == null ? null : atVar.f41322h.f38492a);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(C14897b bVar) {
        C15641at atVar = this.f38428a;
        atVar.f41324j = bVar;
        try {
            if (atVar.f41323i != null) {
                atVar.f41323i.mo27459a((C15813cr) bVar != null ? new C15816cu(bVar) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        return this.f38428a.mo29520c();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C14912d dVar = null;
            try {
                dVar = getAdSize();
            } catch (NullPointerException e) {
                afc.m32793b("Unable to retrieve ad size.", e);
            }
            if (dVar != null) {
                Context context = getContext();
                int b = dVar.mo27326b(context);
                i3 = dVar.mo27325a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
