package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.views.WrapLinearLayoutManager */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: b */
    C1322a f121193b;

    public WrapLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m104415a(final C1322a aVar) {
        if (aVar != null) {
            C0013i.m18a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        aVar.notifyDataSetChanged();
                    } catch (Exception e) {
                        C32458a.m75145a(aVar.getClass().getName(), e);
                    }
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: a */
    private IndexOutOfBoundsException m104414a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f121193b == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f121193b.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    /* renamed from: a */
    public final void mo5019a(C1322a aVar, C1322a aVar2) {
        super.mo5019a(aVar, aVar2);
        this.f121193b = aVar2;
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f121193b != null) {
                C32458a.m75145a(this.f121193b.getClass().getName(), (Exception) m104414a(e));
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            if (this.f121193b != null) {
                String name = this.f121193b.getClass().getName();
                if (this.f121193b != null) {
                    e = new IllegalArgumentException(this.f121193b.getClass().getName(), e);
                }
                C32458a.m75145a(name, (Exception) e);
            }
        } catch (NullPointerException e3) {
            if (this.f121193b != null) {
                C32458a.m75145a(this.f121193b.getClass().getName(), (Exception) e3);
                m104415a(this.f121193b);
            }
        }
    }

    public WrapLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4665a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f121193b != null) {
                C32458a.m75145a(this.f121193b.getClass().getName(), (Exception) m104414a(e));
            }
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4685b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f121193b != null) {
                C32458a.m75145a(this.f121193b.getClass().getName(), (Exception) m104414a(e));
            }
            return 0;
        } catch (NullPointerException e2) {
            if (this.f121193b != null) {
                C32458a.m75145a(this.f121193b.getClass().getName(), (Exception) e2);
                m104415a(this.f121193b);
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
            if (this.f121193b != null) {
                C32458a.m75145a(this.f121193b.getClass().getName(), (Exception) m104414a(e));
            }
            return null;
        }
    }
}
