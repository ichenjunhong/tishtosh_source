package p2663f.p2664a.p2665a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: f.a.a.e */
public class C53037e extends C1322a<C1352v> {

    /* renamed from: a */
    public List<?> f131517a;

    /* renamed from: b */
    public C53042j f131518b;

    public C53037e() {
        this(Collections.emptyList());
    }

    public final int getItemCount() {
        return this.f131517a.size();
    }

    /* renamed from: a */
    public void mo10432a(List<?> list) {
        this.f131517a = list;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        m112785a(vVar);
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        m112785a(vVar);
    }

    public final void onViewRecycled(C1352v vVar) {
        m112785a(vVar);
    }

    /* renamed from: b */
    private void m112786b(Class<?> cls) {
        this.f131518b.mo110583a(cls);
    }

    public final boolean onFailedToRecycleView(C1352v vVar) {
        m112785a(vVar);
        return false;
    }

    private C53037e(List<?> list) {
        this(list, new C53038f());
    }

    /* renamed from: a */
    private C53035c m112785a(C1352v vVar) {
        return this.f131518b.mo110581a(vVar.mItemViewType);
    }

    /* renamed from: a */
    public final <T> C53041i<T> mo110579a(Class<? extends T> cls) {
        m112786b(cls);
        return new C53039g(this, cls);
    }

    public final long getItemId(int i) {
        this.f131517a.get(i);
        this.f131518b.mo110581a(getItemViewType(i));
        return -1;
    }

    public final int getItemViewType(int i) {
        Object obj = this.f131517a.get(i);
        int b = this.f131518b.mo110584b(obj.getClass());
        if (b != -1) {
            return b + this.f131518b.mo110585b(b).mo14402a(obj);
        }
        throw new C53033a(obj.getClass());
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    private C53037e(List<?> list, C53042j jVar) {
        this.f131517a = list;
        this.f131518b = jVar;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C53035c a = this.f131518b.mo110581a(i);
        a.f131516e = this;
        return a.mo14349a(from, viewGroup);
    }

    /* renamed from: a */
    public final <T> void mo110580a(Class<? extends T> cls, C53035c<T, ?> cVar) {
        m112786b(cls);
        this.f131518b.mo110582a(cls, cVar, new C53034b());
    }

    public final void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        this.f131518b.mo110581a(vVar.mItemViewType).mo110578a(vVar, this.f131517a.get(i), list);
    }
}
