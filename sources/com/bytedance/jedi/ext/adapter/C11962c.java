package com.bytedance.jedi.ext.adapter;

import android.support.p043v7.p051e.C1216d;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import com.bytedance.jedi.ext.adapter.internal.C11977a;
import com.bytedance.jedi.ext.adapter.internal.C11978b;
import com.bytedance.jedi.ext.adapter.internal.C11988g;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.p747b.C11946b;
import java.util.List;
import p2628d.C52856t;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.c */
public final class C11962c<T extends C1322a<?> & C11946b<?, ? extends C11971g<?>>> implements C1216d {

    /* renamed from: a */
    private final T f31659a;

    /* renamed from: b */
    private final C52671b<Integer, Integer> f31660b;

    /* renamed from: a */
    private final C11978b m24345a() {
        return ((C11971g) ((C11946b) this.f31659a).mo22686b()).f31674a.f31712b;
    }

    /* renamed from: b */
    private final C11988g m24346b() {
        return ((C11971g) ((C11946b) this.f31659a).mo22686b()).f31674a.f31713c;
    }

    /* renamed from: c */
    private final C11977a m24347c() {
        return ((C11971g) ((C11946b) this.f31659a).mo22686b()).f31648b;
    }

    public C11962c(T t, C52671b<? super Integer, Integer> bVar) {
        C52711k.m112240b(t, "adapter");
        C52711k.m112240b(bVar, "positionMapper");
        this.f31659a = t;
        this.f31660b = bVar;
    }

    /* renamed from: b */
    public final void mo166b(int i, int i2) {
        if (i2 != 0) {
            C11978b a = m24345a();
            if (i != 0 || i2 < a.f31695a.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i < a.f31695a.size()) {
                        a.f31695a.remove(i);
                    }
                    C11988g b = m24346b();
                    if (i < b.f31716a.size()) {
                        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) b.f31716a.remove(i);
                        if (jediViewHolderProxy != null) {
                            b.f31717b.mo22722b(jediViewHolderProxy);
                        }
                    }
                }
                this.f31659a.notifyItemRangeRemoved(((Number) this.f31660b.invoke(Integer.valueOf(i))).intValue(), i2);
                return;
            }
            a.mo22717a();
            m24346b().mo22724a();
            this.f31659a.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final void mo167c(int i, int i2) {
        List<Boolean> list = m24345a().f31695a;
        if (i < list.size() && i2 < list.size()) {
            boolean booleanValue = ((Boolean) list.get(i)).booleanValue();
            list.set(i, list.get(i2));
            list.set(i2, Boolean.valueOf(booleanValue));
        }
        List<JediViewHolderProxy> list2 = m24346b().f31716a;
        if (i < list2.size() && i2 < list2.size()) {
            JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) list2.get(i);
            list2.set(i, list2.get(i2));
            list2.set(i2, jediViewHolderProxy);
        }
        this.f31659a.notifyItemMoved(((Number) this.f31660b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f31660b.invoke(Integer.valueOf(i2))).intValue());
    }

    /* renamed from: a */
    public final void mo164a(int i, int i2) {
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                m24345a().mo22718a(i4, false);
                m24346b().mo22725a(i4, null);
            }
            C11977a c = m24347c();
            if (c.f31691a) {
                RecyclerView recyclerView = c.f31693c.f31636a;
                if (recyclerView != null) {
                    C1332i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        c.f31692b = ((LinearLayoutManager) layoutManager).mo4749j();
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        c.f31692b = staggeredGridLayoutManager.mo5240a(new int[staggeredGridLayoutManager.f4896a])[0];
                    }
                }
            }
            int intValue = ((Number) this.f31660b.invoke(Integer.valueOf(i))).intValue();
            this.f31659a.notifyItemRangeInserted(intValue, i2);
            C11977a c2 = m24347c();
            if (c2.f31691a) {
                RecyclerView recyclerView2 = c2.f31693c.f31636a;
                if (!(recyclerView2 == null || c2.f31692b == -241 || c2.f31692b < intValue)) {
                    C1332i layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 instanceof LinearLayoutManager) {
                        layoutManager2.mo4741e(c2.f31692b);
                    } else if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                        layoutManager2.mo4741e(c2.f31692b);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo165a(int i, int i2, Object obj) {
        this.f31659a.notifyItemRangeChanged(((Number) this.f31660b.invoke(Integer.valueOf(i))).intValue(), i2, C52856t.m112465a(obj, C11963d.m24352a()));
    }
}
