package com.p683ss.android.ugc.aweme.base.widget;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26847b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.c */
public abstract class C23751c<DATA> extends C26840g<DATA> {

    /* renamed from: a */
    public static int f63322a = 10000;

    /* renamed from: b */
    public static int f63323b = 20000;

    /* renamed from: c */
    public View f63324c;

    /* renamed from: d */
    public View f63325d;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$a */
    static class C23753a extends C1352v {
        public C23753a(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1352v mo49206b(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo49207b(C1352v vVar, int i) {
    }

    /* renamed from: b */
    public final boolean mo49208b() {
        if (this.f63324c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo48636c() {
        int i;
        if (this.f63324c == null) {
            i = 0;
        } else {
            i = 1;
        }
        return super.mo48636c() + i;
    }

    public C23751c() {
        mo54792d(R.string.an1);
    }

    /* renamed from: c_ */
    public final void mo49209c_(View view) {
        if (view != null) {
            this.f63324c = view;
            notifyItemInserted(0);
        }
    }

    /* renamed from: a */
    public int mo48641a(int i) {
        if (this.f63324c == null && this.f63325d == null) {
            return 0;
        }
        if (i == 0) {
            return f63322a;
        }
        if (!this.f70699x || i != getItemCount() - 1) {
            return 0;
        }
        return f63323b;
    }

    /* renamed from: a */
    public C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (this.f63324c != null && i == f63322a) {
            return new C23753a(this.f63324c);
        }
        if (this.f63325d == null || i != f63323b) {
            return mo49206b(viewGroup, i);
        }
        return mo49730a_(viewGroup);
    }

    /* renamed from: a */
    public void mo48222a(C1352v vVar, int i) {
        if (getItemViewType(i) == 0) {
            if (!(this.f63324c == null || i == 0)) {
                i--;
            }
            mo49207b(vVar, i);
            return;
        }
        if (getItemViewType(i) == f63323b && (vVar instanceof C26847b)) {
            ((C26847b) vVar).mo54794a();
        }
    }
}
