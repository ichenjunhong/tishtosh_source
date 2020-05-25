package com.p683ss.android.ugc.aweme.discover.p1635a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27733h.C27734a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.e */
public final class C27722e extends C27718c {

    /* renamed from: h */
    public static final C27724a f72761h = new C27724a(null);

    /* renamed from: f */
    public C27725b f72762f = new C27712a();

    /* renamed from: g */
    public C27726c f72763g;

    /* renamed from: i */
    private int f72764i = -1;

    /* renamed from: j */
    private C27733h f72765j = new C27733h();

    /* renamed from: k */
    private boolean f72766k;

    /* renamed from: l */
    private View f72767l;

    /* renamed from: com.ss.android.ugc.aweme.discover.a.e$a */
    public static final class C27724a {
        private C27724a() {
        }

        public /* synthetic */ C27724a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.e$b */
    public static abstract class C27725b {
        /* renamed from: a */
        public abstract View mo56137a(ViewGroup viewGroup, C27722e eVar);

        /* renamed from: a */
        public abstract void mo56138a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.e$c */
    public interface C27726c {
        /* renamed from: a */
        void mo56156a();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.e$d */
    static final class C27727d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27722e f72769a;

        /* renamed from: b */
        final /* synthetic */ int f72770b;

        C27727d(C27722e eVar, int i) {
            this.f72769a = eVar;
            this.f72770b = i;
        }

        public final void run() {
            this.f72769a.f72762f.mo56138a(this.f72770b);
        }
    }

    /* renamed from: c */
    public final void mo56153c() {
        if (!this.f72766k && this.f72764i == 1) {
            this.f72766k = true;
            C27726c cVar = this.f72763g;
            if (cVar != null) {
                cVar.mo56156a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo56154c(int i) {
        int i2 = this.f72764i;
        if (i2 != i) {
            this.f72764i = i;
            m66383a(i2, i);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo4818b((C1340m) this.f72765j);
    }

    /* renamed from: b */
    public final void mo56152b(int i) {
        if (i != 0) {
            this.f72766k = false;
            mo56154c(i);
            return;
        }
        throw new IllegalArgumentException("STATE_INIT only can be set in the LoadMoreAdapterWrapper");
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (this.f72767l == vVar.itemView) {
            mo56153c();
        }
    }

    public C27722e(C1322a<C1352v> aVar) {
        C52711k.m112240b(aVar, "adapter");
        super(aVar);
        C27733h hVar = this.f72765j;
        C27734a r0 = new C27734a(this) {

            /* renamed from: a */
            final /* synthetic */ C27722e f72768a;

            /* renamed from: a */
            public final void mo56155a() {
                this.f72768a.mo56153c();
            }

            {
                this.f72768a = r1;
            }
        };
        C52711k.m112240b(r0, "listener");
        hVar.f72786a = r0;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f72767l == null) {
            this.f72767l = this.f72762f.mo56137a(recyclerView, this);
            this.f72762f.mo56138a(0);
            View view = this.f72767l;
            if (view == null) {
                C52711k.m112234a();
            }
            mo56145a(view);
        }
        recyclerView.mo4801a((C1340m) this.f72765j);
    }

    /* renamed from: a */
    private final void m66383a(int i, int i2) {
        RecyclerView recyclerView = this.f72752d;
        if (recyclerView != null) {
            recyclerView.post(new C27727d(this, i2));
        }
    }
}
