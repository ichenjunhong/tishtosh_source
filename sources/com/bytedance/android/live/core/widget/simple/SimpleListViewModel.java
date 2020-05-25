package com.bytedance.android.live.core.widget.simple;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.C2979i;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p222a.C3824o;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.paging.p236a.C3926a;
import com.bytedance.android.live.core.paging.p236a.C3926a.C3927a;
import com.bytedance.android.live.core.paging.p236a.C3929b;
import com.bytedance.android.live.core.paging.p238c.C3952b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import java.util.ArrayList;
import java.util.List;

public abstract class SimpleListViewModel<T> extends PagingViewModel<T> implements C3927a<T>, C3952b<T> {

    /* renamed from: a */
    public C4109a<T> f11301a = new C4109a<>(this);

    /* renamed from: p */
    private List<C4112c<T>> f11302p = new ArrayList();

    /* renamed from: q */
    private C3810b<String, T> f11303q = new C3824o();

    /* renamed from: com.bytedance.android.live.core.widget.simple.SimpleListViewModel$a */
    class C4109a<T> extends C3926a<T> {
        /* renamed from: a */
        public final void mo9315a(C1352v vVar) {
            super.mo9315a(vVar);
        }

        /* renamed from: a */
        public final T mo144a(int i) {
            return super.mo144a(i);
        }

        public final void onViewRecycled(C1352v vVar) {
            if (!(vVar instanceof C3923a)) {
                super.onViewRecycled(vVar);
            }
        }

        C4109a(C3927a<T> aVar) {
            super(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo9313a(T t, T t2) {
        return t == t2;
    }

    public SimpleListViewModel() {
        this.f11301a.mo9318a((PagingViewModel<T>) this);
    }

    /* renamed from: a */
    public final C4112c<T> mo9443a(T t) {
        for (C4112c<T> cVar : this.f11302p) {
            if (cVar.mo9449a(t)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo9314b(T t, T t2) {
        return t.equals(t2);
    }

    /* renamed from: a */
    public final int mo9311a(int i, T t) {
        return this.f11302p.indexOf(mo9443a(t));
    }

    /* renamed from: a */
    public final C1352v mo9312a(ViewGroup viewGroup, int i) {
        try {
            final C1352v a = ((C4112c) this.f11302p.get(i)).mo9448a(viewGroup);
            a.itemView.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                    if (a instanceof C3923a) {
                        ((C3923a) a).mo9278a();
                    }
                    if (a instanceof C4110a) {
                        SimpleListViewModel.this.mo9443a(((C4110a) a).f11307b.get("__________"));
                    }
                }

                public final void onViewAttachedToWindow(View view) {
                    if (a instanceof C3923a) {
                        int adapterPosition = a.getAdapterPosition();
                        if (adapterPosition >= 0) {
                            Object a = SimpleListViewModel.this.f11301a.mo144a(adapterPosition);
                            if ((SimpleListViewModel.this.mo9443a(a) instanceof C4111b) && (a instanceof C4110a)) {
                                ((C4110a) a).mo9447b(a);
                            }
                            if (a instanceof C2979i) {
                                ((C3923a) a).mo9280a(C3923a.m9918a(((C2979i) a).f8731a), adapterPosition);
                            } else {
                                ((C3923a) a).mo9280a(a, adapterPosition);
                            }
                            if (((C3923a) a).mo9281b()) {
                                SimpleListViewModel.this.f11301a.mo9315a(a);
                            }
                        }
                    }
                }
            });
            return a;
        } catch (Exception unused) {
            return new C3929b(viewGroup);
        }
    }
}
