package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.p1028a.C14896a;
import com.google.android.gms.internal.ads.C15619ar;
import com.google.android.gms.internal.ads.C15641at;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15816cu;
import com.google.android.gms.internal.ads.C15931h;
import com.google.android.gms.internal.ads.C16147p;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.bzl;
import com.google.android.gms.internal.ads.bzm;
import com.google.android.gms.internal.ads.bzo;
import com.google.android.gms.internal.ads.bzu;
import com.google.android.gms.internal.ads.bzx;
import com.google.android.gms.internal.ads.bzz;
import com.google.android.gms.internal.ads.cab;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.cai;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.ads.f */
class C14914f extends ViewGroup {

    /* renamed from: a */
    protected final C15641at f38467a = new C15641at(this, 0);

    public C14914f(Context context, int i) {
        super(context);
    }

    /* renamed from: c */
    public void mo27334c() {
        C15641at atVar = this.f38467a;
        try {
            if (atVar.f41323i != null) {
                atVar.f41323i.mo27485g();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    public C14895a getAdListener() {
        return this.f38467a.f41319e;
    }

    public C14912d getAdSize() {
        return this.f38467a.mo29512a();
    }

    public String getAdUnitId() {
        return this.f38467a.mo29518b();
    }

    /* renamed from: a */
    public void mo27331a(C14908c cVar) {
        C15931h hVar;
        C15641at atVar = this.f38467a;
        C15619ar arVar = cVar.f38450a;
        try {
            if (atVar.f41323i == null) {
                if ((atVar.f41320f == null || atVar.f41326l == null) && atVar.f41323i == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = atVar.f41327m.getContext();
                zzyz a = C15641at.m34089a(context, atVar.f41320f, atVar.f41328n);
                if ("search_v2".equals(a.f46338a)) {
                    hVar = (C15931h) new cab(caf.m37097b(), context, a, atVar.f41326l).mo30891a(context, false);
                } else {
                    bzz bzz = new bzz(caf.m37097b(), context, a, atVar.f41326l, atVar.f41315a);
                    hVar = (C15931h) bzz.mo30891a(context, false);
                }
                atVar.f41323i = hVar;
                atVar.f41323i.mo27457a((cal) new bzo(atVar.f41317c));
                if (atVar.f41318d != null) {
                    atVar.f41323i.mo27456a((cai) new bzm(atVar.f41318d));
                }
                if (atVar.f41321g != null) {
                    atVar.f41323i.mo27461a((C16147p) new bzx(atVar.f41321g));
                }
                if (atVar.f41324j != null) {
                    atVar.f41323i.mo27459a((C15813cr) new C15816cu(atVar.f41324j));
                }
                if (atVar.f41322h != null) {
                    atVar.f41323i.mo27464a((C16309v) atVar.f41322h.f38492a);
                }
                if (atVar.f41325k != null) {
                    atVar.f41323i.mo27468a(new zzacq(atVar.f41325k));
                }
                atVar.f41323i.mo27475a(atVar.f41329o);
                try {
                    C14882b h = atVar.f41323i.mo27486h();
                    if (h != null) {
                        atVar.f41327m.addView((View) C14886d.m30545a(h));
                    }
                } catch (RemoteException e) {
                    afc.m32797d("#007 Could not call remote method.", e);
                }
            }
            if (atVar.f41323i.mo27482b(bzu.m37053a(atVar.f41327m.getContext(), arVar))) {
                atVar.f41315a.f45384a = arVar.f41244h;
            }
        } catch (RemoteException e2) {
            afc.m32797d("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: b */
    public void mo27333b() {
        C15641at atVar = this.f38467a;
        try {
            if (atVar.f41323i != null) {
                atVar.f41323i.mo27490l();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public void mo27330a() {
        C15641at atVar = this.f38467a;
        try {
            if (atVar.f41323i != null) {
                atVar.f41323i.mo27491m();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    public void setAdListener(C14895a aVar) {
        this.f38467a.mo29514a(aVar);
        if (aVar == null) {
            this.f38467a.mo29515a((bzl) null);
            this.f38467a.mo29513a((C14896a) null);
            return;
        }
        if (aVar instanceof bzl) {
            this.f38467a.mo29515a((bzl) aVar);
        }
        if (aVar instanceof C14896a) {
            this.f38467a.mo29513a((C14896a) aVar);
        }
    }

    public void setAdSize(C14912d dVar) {
        this.f38467a.mo29517a(dVar);
    }

    /* renamed from: a */
    public void mo27332a(C14912d... dVarArr) {
        this.f38467a.mo29519b(dVarArr);
    }

    public void setAdUnitId(String str) {
        this.f38467a.mo29516a(str);
    }

    public String getMediationAdapterClassName() {
        return this.f38467a.mo29520c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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
