package com.p683ss.android.ugc.aweme.playlist.p2057a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.base.arch.C23463c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.playlist.a.a */
public class C38916a extends C23463c<Object> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f99158g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38916a.class), "screenWidth", "getScreenWidth()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38916a.class), "cellHeight", "getCellHeight()F"))};

    /* renamed from: i */
    public static final C38917a f99159i = new C38917a(null);

    /* renamed from: c */
    private final C52668f f99160c;

    /* renamed from: d */
    private final C52668f f99161d;

    /* renamed from: h */
    public RecyclerView f99162h;

    /* renamed from: com.ss.android.ugc.aweme.playlist.a.a$a */
    public static final class C38917a {
        private C38917a() {
        }

        public /* synthetic */ C38917a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.a.a$b */
    static final class C38918b extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C38916a f99163a;

        C38918b(C38916a aVar) {
            this.f99163a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(((((float) this.f99163a.mo78988k()) / 2.0f) * 4.0f) / 3.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.a.a$c */
    public static final class C38919c extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C38916a f99164a;

        C38919c(C38916a aVar) {
            this.f99164a = aVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f99164a.mo58395g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.a.a$d */
    static final class C38920d extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C38920d f99165a = new C38920d();

        C38920d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C9432q.m18670a(C11010c.m22280a()));
        }
    }

    /* renamed from: a */
    public void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
    }

    /* renamed from: k */
    public final int mo78988k() {
        return ((Number) this.f99160c.getValue()).intValue();
    }

    /* renamed from: l */
    public final float mo78989l() {
        return ((Number) this.f99161d.getValue()).floatValue();
    }

    /* renamed from: m */
    public final float mo78990m() {
        return mo78989l() + ((float) C23728o.m58241a(1.0d));
    }

    /* renamed from: g */
    public void mo58395g() {
        C1332i iVar;
        C1352v vVar;
        RecyclerView recyclerView = this.f99162h;
        C1352v vVar2 = null;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        if (iVar != null) {
            int j = ((GridLayoutManager) iVar).mo4749j();
            float j2 = mo58396j() % mo78990m();
            RecyclerView recyclerView2 = this.f99162h;
            if (recyclerView2 != null) {
                vVar = recyclerView2.mo4844e(j);
            } else {
                vVar = null;
            }
            RecyclerView recyclerView3 = this.f99162h;
            if (recyclerView3 != null) {
                vVar2 = recyclerView3.mo4844e(j + 1);
            }
            if (j2 >= mo78990m() / 2.0f) {
                if (vVar instanceof C38923d) {
                    ((C38923d) vVar).mo58452q();
                }
                if (vVar2 instanceof C38923d) {
                    ((C38923d) vVar2).mo58452q();
                    return;
                }
            } else {
                if (vVar instanceof C38923d) {
                    ((C38923d) vVar).mo58453r();
                }
                if (vVar2 instanceof C38923d) {
                    ((C38923d) vVar2).mo58453r();
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
    }

    /* renamed from: j */
    public float mo58396j() {
        C1332i iVar;
        try {
            RecyclerView recyclerView = this.f99162h;
            C1332i iVar2 = null;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                int j = ((GridLayoutManager) iVar).mo4749j();
                RecyclerView recyclerView2 = this.f99162h;
                if (recyclerView2 != null) {
                    iVar2 = recyclerView2.getLayoutManager();
                }
                if (iVar2 != null) {
                    View c = ((GridLayoutManager) iVar2).mo4736c(j);
                    if (j >= 0) {
                        if (c != null) {
                            return ((((float) (j / 2)) * mo78990m()) + 0.0f) - c.getY();
                        }
                    }
                    return 0.0f;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    public int mo48641a(int i) {
        int i2 = i % 4;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        return 0;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f99162h = null;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        super.onAttachedToRecyclerView(recyclerView);
        this.f99162h = recyclerView;
        RecyclerView recyclerView2 = this.f99162h;
        if (recyclerView2 != null) {
            recyclerView2.mo4801a((C1340m) new C38919c(this));
        }
        RecyclerView recyclerView3 = this.f99162h;
        if (recyclerView3 != null) {
            recyclerView3.mo4798a((C1331h) new C38922c());
        }
    }

    public C38916a(C0184k kVar, C1212c<Object> cVar) {
        C52711k.m112240b(kVar, "parent");
        if (cVar == null) {
            cVar = new C38921b<>();
        }
        super(kVar, cVar, null, 4, null);
        this.f99160c = C52732g.m112285a(C38920d.f99165a);
        this.f99161d = C52732g.m112285a(new C38918b(this));
    }
}
