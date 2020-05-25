package com.p683ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.account.view.WrapLinearLayoutManager */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    C1322a f60099a;

    /* renamed from: a */
    private IndexOutOfBoundsException m55208a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f60099a == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f60099a.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    /* renamed from: a */
    public final void mo5019a(C1322a aVar, C1322a aVar2) {
        super.mo5019a(aVar, aVar2);
        this.f60099a = aVar2;
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f60099a != null) {
                C32458a.m75145a(this.f60099a.getClass().getName(), (Exception) m55208a(e));
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            if (this.f60099a != null) {
                String name = this.f60099a.getClass().getName();
                if (this.f60099a != null) {
                    e = new IllegalArgumentException(this.f60099a.getClass().getName(), e);
                }
                C32458a.m75145a(name, (Exception) e);
            }
        }
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4685b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f60099a != null) {
                C32458a.m75145a(this.f60099a.getClass().getName(), (Exception) m55208a(e));
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4665a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f60099a != null) {
                C32458a.m75145a(this.f60099a.getClass().getName(), (Exception) m55208a(e));
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final View mo4671a(View view, int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4671a(view, i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f60099a != null) {
                C32458a.m75145a(this.f60099a.getClass().getName(), (Exception) m55208a(e));
            }
            return null;
        }
    }
}
