package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.core.widget.simple.C4110a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.setting.r */
public abstract class C4099r<T> extends C1322a {

    /* renamed from: a */
    private List<T> f11276a;

    /* renamed from: b */
    protected Context f11277b;

    /* renamed from: c */
    private LayoutInflater f11278c;

    /* renamed from: d */
    private OnClickListener f11279d = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof C4110a)) {
                C4110a aVar = (C4110a) view.getTag();
                C4099r.this.mo9426a(aVar, C4099r.this.mo9432a(aVar.getPosition()), aVar.getPosition());
            }
        }
    };

    /* renamed from: e */
    private OnLongClickListener f11280e = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof C4110a)) {
                C4110a aVar = (C4110a) view.getTag();
                C4099r.this.mo9432a(aVar.getPosition());
                aVar.getPosition();
            }
            return false;
        }
    };

    /* renamed from: a */
    public void mo9426a(C4110a aVar, T t, int i) {
    }

    /* renamed from: b */
    public abstract void mo9427b(C4110a aVar, T t, int i);

    public void onBindViewHolder(C1352v vVar, int i) {
    }

    public int getItemCount() {
        if (this.f11276a == null) {
            return 0;
        }
        return this.f11276a.size();
    }

    /* renamed from: a */
    public final T mo9432a(int i) {
        if (i < 0 || i >= this.f11276a.size()) {
            return null;
        }
        return this.f11276a.get(i);
    }

    public C4099r(Context context, List<T> list) {
        this.f11276a = list;
        this.f11278c = LayoutInflater.from(context);
        this.f11277b = context;
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.f11278c.inflate(R.layout.al8, viewGroup, false);
        inflate.setOnClickListener(this.f11279d);
        inflate.setOnLongClickListener(this.f11280e);
        final C4110a aVar = new C4110a(inflate);
        inflate.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewDetachedFromWindow(View view) {
                aVar.mo9283d();
                aVar.mo9278a();
            }

            public final void onViewAttachedToWindow(View view) {
                int adapterPosition = aVar.getAdapterPosition();
                if (adapterPosition >= 0) {
                    Object a = C4099r.this.mo9432a(adapterPosition);
                    aVar.mo9447b(a);
                    aVar.mo9282c();
                    C4099r.this.mo9427b(aVar, a, adapterPosition);
                }
            }
        });
        return aVar;
    }
}
