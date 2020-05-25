package com.p683ss.android.ugc.tools.view.p2509b;

import android.support.p043v7.widget.RecyclerView.C1324c;
import java.util.List;

/* renamed from: com.ss.android.ugc.tools.view.b.b */
public abstract class C50209b<T> extends C50211c {

    /* renamed from: m */
    static final String f125762m = "b";

    /* renamed from: k */
    public List<T> f125763k;

    /* renamed from: l */
    protected int f125764l;

    /* renamed from: b */
    public List<T> mo92825b() {
        return this.f125763k;
    }

    public C50209b() {
        registerAdapterDataObserver(new C1324c() {
            /* renamed from: a */
            public final void mo4984a() {
                C50209b.this.f125764l = C50209b.this.getItemCount();
            }

            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                C50209b.this.f125764l = C50209b.this.getItemCount();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                C50209b.this.f125764l = C50209b.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo4985a(int i, int i2) {
                C50209b.this.f125764l = C50209b.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo4986a(int i, int i2, int i3) {
                C50209b.this.f125764l = C50209b.this.getItemCount();
            }
        });
    }

    /* renamed from: a */
    public int mo64314a() {
        if (this.f125763k == null) {
            return 0;
        }
        return this.f125763k.size();
    }

    /* renamed from: a */
    public void mo64318a(List<T> list) {
        this.f125763k = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64319a(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f125764l = getItemCount();
    }
}
