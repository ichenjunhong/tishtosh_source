package com.p683ss.android.ugc.aweme.common.p1589a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.ss.android.ugc.aweme.common.a.m */
public abstract class C26850m extends C1322a {

    /* renamed from: x */
    public boolean f70699x = true;

    /* renamed from: a */
    public int mo48641a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract C1352v mo48221a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo51182a(C1352v vVar);

    /* renamed from: a */
    public abstract void mo48222a(C1352v vVar, int i);

    /* renamed from: a_ */
    public abstract C1352v mo49730a_(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54783b(boolean z) {
    }

    /* renamed from: c */
    public abstract int mo48636c();

    public int getItemCount() {
        if (this.f70699x) {
            return mo48636c() + 1;
        }
        return mo48636c();
    }

    /* renamed from: c */
    public void mo54798c(boolean z) {
        if (z != this.f70699x) {
            this.f70699x = z;
            mo54783b(z);
        }
    }

    public final int getItemViewType(int i) {
        if (!this.f70699x || i != mo48636c()) {
            return mo48641a(i);
        }
        return DynamicTabYellowPointVersion.DEFAULT;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo51182a(vVar);
        } else {
            mo48222a(vVar, i);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return mo49730a_(viewGroup);
        }
        return mo48221a(viewGroup, i);
    }
}
