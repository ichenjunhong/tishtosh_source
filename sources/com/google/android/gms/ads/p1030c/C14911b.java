package com.google.android.gms.ads.p1030c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C14895a;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.internal.ads.C15641at;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.afc;

@C16299uq
/* renamed from: com.google.android.gms.ads.c.b */
public final class C14911b extends ViewGroup {

    /* renamed from: a */
    private final C15641at f38453a;

    public final C14895a getAdListener() {
        return this.f38453a.f41319e;
    }

    public final C14912d getAdSize() {
        return this.f38453a.mo29512a();
    }

    public final String getAdUnitId() {
        return this.f38453a.mo29518b();
    }

    public final void setAdListener(C14895a aVar) {
        this.f38453a.mo29514a(aVar);
    }

    public final void setAdSize(C14912d dVar) {
        this.f38453a.mo29517a(dVar);
    }

    public final void setAdUnitId(String str) {
        this.f38453a.mo29516a(str);
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
