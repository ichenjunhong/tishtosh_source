package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31630b;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.c */
public final class C31668c implements C31630b {

    /* renamed from: a */
    private OnClickListener f82718a;

    /* renamed from: b */
    private boolean f82719b;

    /* renamed from: c */
    private final View f82720c;

    /* renamed from: d */
    private final View f82721d;

    /* renamed from: a */
    public final boolean mo64535a() {
        View view = this.f82720c;
        if (view != null) {
            return view.isSelected();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64533a(OnClickListener onClickListener) {
        this.f82718a = onClickListener;
        m73581d(this.f82719b);
    }

    /* renamed from: a */
    public final void mo64534a(boolean z) {
        if (this.f82719b) {
            View view = this.f82720c;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    /* renamed from: b */
    public final void mo64536b(boolean z) {
        this.f82719b = z;
        m73580c(this.f82719b);
        m73581d(this.f82719b);
    }

    /* renamed from: c */
    private final void m73580c(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.f82720c;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.f82721d;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    /* renamed from: d */
    private final void m73581d(boolean z) {
        if (z) {
            View view = this.f82720c;
            if (view != null) {
                view.setOnClickListener(this.f82718a);
            }
        } else {
            View view2 = this.f82720c;
            if (view2 != null) {
                view2.setOnClickListener(null);
            }
        }
    }

    public C31668c(View view, View view2) {
        this.f82720c = view;
        this.f82721d = view2;
        View view3 = this.f82720c;
        if (view3 != null) {
            view3.setSelected(false);
        }
        m73580c(this.f82719b);
    }
}
