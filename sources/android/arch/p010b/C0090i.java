package android.arch.p010b;

import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;

/* renamed from: android.arch.b.i */
public abstract class C0090i<T, VH extends C1352v> extends C1322a<VH> {

    /* renamed from: a */
    public final C0055a<T> f232a;

    /* renamed from: b */
    private final C0059a<T> f233b = new C0059a<T>() {
    };

    public int getItemCount() {
        return this.f232a.mo82a();
    }

    protected C0090i(C1212c<T> cVar) {
        this.f232a = new C0055a<>(this, cVar);
        this.f232a.f129d = this.f233b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo144a(int i) {
        C0055a<T> aVar = this.f232a;
        if (aVar.f131f != null) {
            aVar.f131f.mo129d(i);
            return aVar.f131f.get(i);
        } else if (aVar.f132g != null) {
            return aVar.f132g.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }
}
