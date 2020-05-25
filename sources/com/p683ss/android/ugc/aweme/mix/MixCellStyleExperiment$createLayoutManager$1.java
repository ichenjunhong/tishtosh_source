package com.p683ss.android.ugc.aweme.mix;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import com.p683ss.android.ugc.aweme.profile.p2090ui.WrapStaggeredGridLayoutManager;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.MixCellStyleExperiment$createLayoutManager$1 */
public final class MixCellStyleExperiment$createLayoutManager$1 extends WrapStaggeredGridLayoutManager {

    /* renamed from: l */
    final /* synthetic */ RecyclerView f94479l;

    /* renamed from: m */
    private Method f94480m;

    /* renamed from: n */
    private boolean f94481n;

    /* renamed from: E */
    public final void mo5017E() {
        super.mo5017E();
        if (this.f94480m != null) {
            try {
                Method method = this.f94480m;
                if (method != null) {
                    method.invoke(this.f94479l, new Object[0]);
                }
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        C52711k.m112240b(oVar, "recycler");
        C52711k.m112240b(sVar, "state");
        if (this.f94480m == null && !this.f94481n) {
            try {
                this.f94480m = RecyclerView.class.getDeclaredMethod(C43882k.f111137a, new Class[0]);
                Method method = this.f94480m;
                if (method != null) {
                    method.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                this.f94481n = true;
            }
        }
        if (this.f94480m != null && sVar.f4801j) {
            try {
                Method method2 = this.f94480m;
                if (method2 != null) {
                    method2.invoke(this.f94479l, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        super.mo4689c(oVar, sVar);
    }

    MixCellStyleExperiment$createLayoutManager$1(RecyclerView recyclerView, int i, int i2) {
        this.f94479l = recyclerView;
        super(2, 1);
    }
}
