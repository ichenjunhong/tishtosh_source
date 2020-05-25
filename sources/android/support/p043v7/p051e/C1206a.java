package android.support.p043v7.p051e;

import android.support.p043v7.widget.RecyclerView.C1322a;

/* renamed from: android.support.v7.e.a */
public final class C1206a implements C1216d {

    /* renamed from: a */
    private final C1322a f3991a;

    public C1206a(C1322a aVar) {
        this.f3991a = aVar;
    }

    /* renamed from: a */
    public final void mo164a(int i, int i2) {
        this.f3991a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public final void mo166b(int i, int i2) {
        this.f3991a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public final void mo167c(int i, int i2) {
        this.f3991a.notifyItemMoved(i, i2);
    }

    /* renamed from: a */
    public final void mo165a(int i, int i2, Object obj) {
        this.f3991a.notifyItemRangeChanged(i, i2, obj);
    }
}
