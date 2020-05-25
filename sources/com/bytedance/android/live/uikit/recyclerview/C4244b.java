package com.bytedance.android.live.uikit.recyclerview;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.bytedance.android.live.uikit.recyclerview.b */
public abstract class C4244b extends C1322a {

    /* renamed from: b */
    public boolean f11611b = true;

    /* renamed from: a */
    public int mo9859a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract C1352v mo9853a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract C1352v mo9860a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo9855a(C1352v vVar);

    /* renamed from: a */
    public abstract void mo9861a(C1352v vVar, int i);

    /* renamed from: c */
    public abstract int mo9862c();

    public int getItemCount() {
        if (this.f11611b) {
            return mo9862c() + 1;
        }
        return mo9862c();
    }

    public final int getItemViewType(int i) {
        if (!this.f11611b || i != mo9862c()) {
            return mo9859a(i);
        }
        return DynamicTabYellowPointVersion.DEFAULT;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo9855a(vVar);
        } else {
            mo9861a(vVar, i);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return mo9853a(viewGroup);
        }
        return mo9860a(viewGroup, i);
    }
}
