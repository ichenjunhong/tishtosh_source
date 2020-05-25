package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.PointF;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.views.WrapGridLayoutManager */
public class WrapGridLayoutManager extends GridLayoutManager implements C48201l {

    /* renamed from: L */
    C1322a f121191L;

    public WrapGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public final void mo5019a(C1322a aVar, C1322a aVar2) {
        super.mo5019a(aVar, aVar2);
        this.f121191L = aVar2;
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e) {
            if (this.f121191L != null) {
                C32458a.m75145a(this.f121191L.getClass().getName(), (Exception) e);
                WrapLinearLayoutManager.m104415a(this.f121191L);
            }
        }
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C481721 r2 = new C1415af(recyclerView.getContext()) {
            /* renamed from: b */
            public final int mo5495b(int i) {
                return super.mo5495b(i) * 3;
            }

            /* renamed from: c */
            public final PointF mo5111c(int i) {
                return WrapGridLayoutManager.this.mo4738d(i);
            }
        };
        r2.f4778g = i;
        mo5022a((C1346r) r2);
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4685b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e) {
            if (this.f121191L != null) {
                C32458a.m75145a(this.f121191L.getClass().getName(), (Exception) e);
                WrapLinearLayoutManager.m104415a(this.f121191L);
            }
            return 0;
        }
    }

    public WrapGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, 1, false);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
