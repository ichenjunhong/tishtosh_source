package com.p683ss.android.ugc.aweme.common.p1589a;

import android.support.p043v7.widget.RecyclerView.C1324c;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.a.g */
public abstract class C26840g<T> extends C26844j {

    /* renamed from: p */
    static final String f70669p = "g";

    /* renamed from: n */
    public List<T> f70670n;

    /* renamed from: o */
    protected int f70671o;

    /* renamed from: a */
    public List<T> mo50673a() {
        return this.f70670n;
    }

    public C26840g() {
        registerAdapterDataObserver(new C1324c() {
            /* renamed from: a */
            public final void mo4984a() {
                C26840g.this.f70671o = C26840g.this.getItemCount();
            }

            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                C26840g.this.f70671o = C26840g.this.getItemCount();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                C26840g.this.f70671o = C26840g.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo4985a(int i, int i2) {
                C26840g.this.f70671o = C26840g.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo4986a(int i, int i2, int i3) {
                C26840g.this.f70671o = C26840g.this.getItemCount();
            }
        });
    }

    /* renamed from: c */
    public int mo48636c() {
        if (this.f70670n == null) {
            return 0;
        }
        return this.f70670n.size();
    }

    /* renamed from: f */
    public void mo54785f() {
        if (this.f70670n != null) {
            this.f70670n.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo50303a(List<T> list) {
        this.f70670n = list;
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public void mo54784d(List<T> list) {
        this.f70670n = list;
        notifyItemRangeInserted(0, getItemCount() - this.f70671o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54783b(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f70671o = getItemCount();
    }

    /* renamed from: c */
    public void mo51189c(List<T> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            if (this.f70670n == null) {
                this.f70670n = new ArrayList();
            }
            this.f70670n.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo50304b(List<T> list) {
        this.f70670n = list;
        if (this.f70699x) {
            notifyItemRangeInserted(this.f70671o - 1, getItemCount() - this.f70671o);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.f70671o, getItemCount() - this.f70671o);
    }

    /* renamed from: a */
    public void mo51186a(T t, int i) {
        if (this.f70670n == null) {
            this.f70670n = new ArrayList();
        }
        this.f70670n.add(i, t);
        notifyItemInserted(i);
    }
}
