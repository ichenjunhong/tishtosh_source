package com.p683ss.android.ugc.tools.view.p2509b;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.ss.android.ugc.tools.view.b.f */
public abstract class C50217f extends C1322a {

    /* renamed from: t */
    public boolean f125790t = true;

    /* renamed from: a */
    public abstract int mo64314a();

    /* renamed from: a */
    public int mo64315a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract C1352v mo97981a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract C1352v mo64316a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo97982a(C1352v vVar);

    /* renamed from: a */
    public abstract void mo64317a(C1352v vVar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64319a(boolean z) {
    }

    public int getItemCount() {
        if (this.f125790t) {
            return mo64314a() + 1;
        }
        return mo64314a();
    }

    /* renamed from: c */
    public final void mo97992c(boolean z) {
        if (z != this.f125790t) {
            this.f125790t = z;
            mo64319a(z);
        }
    }

    public final int getItemViewType(int i) {
        if (!this.f125790t || i != mo64314a()) {
            return mo64315a(i);
        }
        return DynamicTabYellowPointVersion.DEFAULT;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo97982a(vVar);
        } else {
            mo64317a(vVar, i);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return mo97981a(viewGroup);
        }
        return mo64316a(viewGroup, i);
    }
}
