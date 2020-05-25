package com.bytedance.android.live.core.paging.p236a;

import android.arch.lifecycle.C0199s;
import android.arch.p010b.C0082h;
import android.arch.p010b.C0090i;
import android.database.Observable;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2979i;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.p226e.C3842b.C3843a;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.paging.a.c */
public abstract class C3930c<T> extends C0090i<T, C1352v> {

    /* renamed from: b */
    public PagingViewModel<T> f10949b;

    /* renamed from: c */
    public C3843a f10950c = null;

    /* renamed from: d */
    public C3843a f10951d = null;

    /* renamed from: e */
    boolean f10952e;

    /* renamed from: f */
    public boolean f10953f;

    /* renamed from: g */
    public boolean f10954g;

    /* renamed from: h */
    public boolean f10955h = true;

    /* renamed from: i */
    public boolean f10956i = true;

    /* renamed from: j */
    public boolean f10957j = true;

    /* renamed from: k */
    public final C3933b f10958k = new C3933b<>();

    /* renamed from: l */
    private final C0199s<C0082h<T>> f10959l = new C3938d(this);

    /* renamed from: m */
    private final C0199s<C3842b> f10960m = new C3939e(this);

    /* renamed from: n */
    private final C0199s<C3842b> f10961n = new C0199s<C3842b>() {
        public final /* synthetic */ void onChanged(Object obj) {
            C3842b bVar = (C3842b) obj;
            if (bVar != null) {
                C3930c.this.f10951d = bVar.f10823a;
                C3930c.this.mo9316a(C3930c.this.f10950c);
            }
        }
    };

    /* renamed from: o */
    private final C0199s<Boolean> f10962o = new C3940f(this);

    /* renamed from: p */
    private final C0199s<Boolean> f10963p = new C3941g(this);

    /* renamed from: q */
    private final C0199s<Integer> f10964q = new C3942h(this);

    /* renamed from: r */
    private boolean f10965r = false;

    /* renamed from: s */
    private final C3934c f10966s = new C3934c<>();

    /* renamed from: com.bytedance.android.live.core.paging.a.c$a */
    public static abstract class C3932a extends C1352v {
        /* renamed from: a */
        public void mo9322a(boolean z) {
        }

        public C3932a(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.c$b */
    class C3933b extends Observable<C1324c> {
        /* renamed from: a */
        public final void mo9323a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4984a();
            }
        }

        C3933b() {
        }

        /* renamed from: a */
        private int m9970a(int i) {
            if (C3930c.this.f10953f) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: b */
        public final void mo9325b(int i, int i2) {
            int a = m9970a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4988b(a, i2);
            }
        }

        /* renamed from: c */
        public final void mo9326c(int i, int i2) {
            int a = m9970a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4989c(a, i2);
            }
        }

        /* renamed from: a */
        public final void mo9324a(int i, int i2) {
            int a = m9970a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4987a(a, i2, (Object) null);
            }
        }

        /* renamed from: d */
        public final void mo9327d(int i, int i2) {
            int a = m9970a(i);
            int a2 = m9970a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4986a(a, a2, 1);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.c$c */
    class C3934c extends C1324c {
        /* renamed from: a */
        public final void mo4984a() {
            C3930c.this.f10958k.mo9323a();
        }

        C3934c() {
        }

        /* renamed from: b */
        public final void mo4988b(int i, int i2) {
            C3930c.this.f10958k.mo9325b(i, i2);
        }

        /* renamed from: c */
        public final void mo4989c(int i, int i2) {
            C3930c.this.f10958k.mo9326c(i, i2);
        }

        /* renamed from: a */
        public final void mo4985a(int i, int i2) {
            C3930c.this.f10958k.mo9324a(i, i2);
        }

        /* renamed from: a */
        public final void mo4986a(int i, int i2, int i3) {
            C3930c.this.f10958k.mo9327d(i, i2);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.c$d */
    public static class C3935d extends C1352v {
        public C3935d(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.c$e */
    static class C3936e extends C3932a {

        /* renamed from: a */
        PagingViewModel f10970a;

        /* renamed from: b */
        private View f10971b;

        /* renamed from: c */
        private TextView f10972c;

        /* renamed from: a */
        public final void mo9322a(boolean z) {
            C3842b bVar = (C3842b) this.f10970a.f11040c.getValue();
            View findViewById = this.itemView.findViewById(R.id.csq);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (bVar == null || !bVar.mo9204b() || !z) {
                layoutParams.height = -2;
                this.f10971b.setVisibility(8);
                this.f10972c.setTextColor(this.f10972c.getResources().getColor(R.color.ac6));
                this.f10972c.setText(R.string.e6h);
            } else {
                layoutParams.height = -1;
                this.f10971b.setVisibility(0);
                this.f10972c.setTextColor(this.f10972c.getResources().getColor(R.color.ac9));
                this.f10972c.setText(R.string.e6n);
            }
            findViewById.setLayoutParams(layoutParams);
            this.itemView.setOnClickListener(new C3943i(this));
        }

        C3936e(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f10970a = pagingViewModel;
            this.f10971b = view.findViewById(R.id.ab9);
            this.f10972c = (TextView) view.findViewById(R.id.abb);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.c$f */
    public static class C3937f extends C1352v {
        /* renamed from: a */
        public void mo9328a() {
        }

        public C3937f(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9307a() {
        return R.layout.agu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9308a(int i, T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1352v mo9309a(ViewGroup viewGroup, int i);

    /* renamed from: c */
    private int mo12997c() {
        return super.getItemCount();
    }

    /* renamed from: b */
    private boolean mo12995b() {
        if (!this.f10954g || !this.f10955h || this.f10953f) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean mo12999d() {
        if (this.f10954g || !this.f10952e || !this.f10957j) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m9954e() {
        if (this.f10950c == C3843a.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m9955f() {
        if (this.f10950c == C3843a.FAILED) {
            return true;
        }
        return false;
    }

    public final int getItemCount() {
        boolean z = this.f10953f;
        boolean d = mo12999d();
        boolean b = mo12995b();
        boolean g = m9956g();
        return (z ? 1 : 0) + mo12997c() + (d ? 1 : 0) + (g ? 1 : 0) + (b ? 1 : 0);
    }

    /* renamed from: g */
    private boolean m9956g() {
        if (mo12999d() || !this.f10956i || this.f10951d == null) {
            return false;
        }
        if (this.f10951d == C3843a.SUCCESS) {
            if (m9954e() || m9955f()) {
                return true;
            }
            return false;
        } else if (this.f10951d == C3843a.FAILED) {
            return m9955f();
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo9319b(int i) {
        return i - (this.f10953f ? 1 : 0);
    }

    public void registerAdapterDataObserver(C1324c cVar) {
        this.f10958k.registerObserver(cVar);
    }

    public void unregisterAdapterDataObserver(C1324c cVar) {
        this.f10958k.unregisterObserver(cVar);
    }

    /* renamed from: c */
    private T mo12996c(int i) {
        if (i < 0 || i >= mo12997c()) {
            return null;
        }
        return super.mo144a(i);
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C3923a) {
            ((C3923a) vVar).mo9282c();
        }
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C3923a) {
            ((C3923a) vVar).mo9283d();
        }
    }

    public void onViewRecycled(C1352v vVar) {
        if (vVar instanceof C3923a) {
            ((C3923a) vVar).mo9278a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9315a(C1352v vVar) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) vVar.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f4918b = true;
        }
    }

    /* renamed from: a */
    public T mo144a(int i) {
        int c = mo12997c() + (this.f10953f ? 1 : 0);
        if (this.f10953f && i == 0) {
            return null;
        }
        if (m9956g() && i == c) {
            return null;
        }
        if (mo12999d() && i == c) {
            return null;
        }
        if (!mo12995b() || i != c) {
            return mo12996c(mo9319b(i));
        }
        return null;
    }

    protected C3930c(C1212c<T> cVar) {
        super(cVar);
        super.registerAdapterDataObserver(this.f10966s);
    }

    public final int getItemViewType(int i) {
        int itemCount = getItemCount() - 1;
        if (mo12995b() && i == 0) {
            return -1091641683;
        }
        if (this.f10953f && i == 0) {
            return -559038738;
        }
        if (!m9956g() || i != itemCount) {
            if (mo12999d() && i == itemCount) {
                return -559038737;
            }
            int b = mo9319b(i);
            if (b >= mo12997c()) {
                return -8888;
            }
            return mo9308a(b, (T) mo12996c(b));
        } else if (m9955f()) {
            return -1091576149;
        } else {
            return -1091576148;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9316a(C3843a aVar) {
        boolean z = this.f10965r;
        this.f10950c = aVar;
        boolean g = m9956g();
        int c = mo12997c();
        if (!z && g) {
            notifyItemInserted(c);
        } else if (z && !g) {
            notifyItemRemoved(getItemCount());
        } else if (z && g) {
            notifyItemRemoved(c);
            notifyItemInserted(c);
        }
        this.f10965r = g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9317a(C3842b bVar) {
        if (bVar != null) {
            mo9316a(bVar.f10823a);
        }
    }

    /* renamed from: a */
    public final void mo9318a(PagingViewModel<T> pagingViewModel) {
        if (this.f10949b != null) {
            this.f10949b.f11044g.removeObserver(this.f10959l);
            this.f10949b.f11039b.removeObserver(this.f10960m);
            this.f10949b.f11040c.removeObserver(this.f10961n);
            this.f10949b.f11042e.removeObserver(this.f10962o);
            this.f10949b.f11041d.removeObserver(this.f10963p);
            this.f10949b.f11043f.removeObserver(this.f10964q);
        }
        this.f10949b = pagingViewModel;
        if (pagingViewModel != null) {
            pagingViewModel.f11044g.observeForever(this.f10959l);
            pagingViewModel.f11039b.observeForever(this.f10960m);
            pagingViewModel.f11040c.observeForever(this.f10961n);
            pagingViewModel.f11042e.observeForever(this.f10962o);
            pagingViewModel.f11041d.observeForever(this.f10963p);
            pagingViewModel.f11043f.observeForever(this.f10964q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1352v mo9321c(ViewGroup viewGroup, int i) {
        return new C3935d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.agv, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1352v mo9320b(ViewGroup viewGroup, int i) {
        if (i == -1091576148) {
            return new C3937f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.agx, viewGroup, false));
        }
        if (i == -1091576149) {
            return new C3936e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.agw, viewGroup, false), this.f10949b);
        }
        throw new RuntimeException("unknown footer type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9310a(C1352v vVar, int i) {
        if (vVar instanceof C3923a) {
            Object a = mo144a(i);
            if (a instanceof C2979i) {
                ((C3923a) vVar).mo9280a(C3923a.m9918a(((C2979i) a).f8731a), i);
            } else {
                ((C3923a) vVar).mo9280a(a, i);
            }
            if (((C3923a) vVar).mo9281b()) {
                mo9315a(vVar);
            }
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        int itemViewType = getItemViewType(i);
        if (itemViewType == -559038738) {
            mo9315a(vVar);
        } else if (itemViewType == -559038737) {
            mo9315a(vVar);
        } else {
            if (itemViewType == -1091576148 || itemViewType == -1091576149) {
                mo9315a(vVar);
                if (vVar instanceof C3937f) {
                    ((C3937f) vVar).mo9328a();
                } else {
                    if (vVar instanceof C3932a) {
                        C3932a aVar = (C3932a) vVar;
                        if (this.f10954g || mo12997c() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.mo9322a(z);
                    }
                }
            } else if (itemViewType == -1091641683) {
                mo9315a(vVar);
            } else {
                mo9310a(vVar, i);
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -559038738) {
            throw new RuntimeException("create your header view holder");
        } else if (i == -559038737) {
            return mo9321c(viewGroup, i);
        } else {
            if (i == -1091576148 || i == -1091576149) {
                return mo9320b(viewGroup, i);
            }
            if (i == -1091641683) {
                return new C3935d(LayoutInflater.from(viewGroup.getContext()).inflate(mo9307a(), viewGroup, false));
            }
            return mo9309a(viewGroup, i);
        }
    }
}
