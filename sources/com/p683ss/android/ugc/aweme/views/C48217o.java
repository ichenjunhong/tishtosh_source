package com.p683ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.o */
public class C48217o extends Dialog {

    /* renamed from: a */
    private static final int f121343a = ((int) C9432q.m18687b(C11010c.m22280a(), 20.0f));

    /* renamed from: h */
    protected int f121344h;

    /* renamed from: i */
    protected int f121345i;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo63505c() {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f121344h, this.f121345i);
        }
    }

    public C48217o(Context context, int i, boolean z, boolean z2) {
        this(context, i, false, true, false);
    }

    public C48217o(Context context, int i, int i2, int i3) {
        super(context, R.style.a72);
        this.f121344h = C9432q.m18670a(getContext()) + 0;
        this.f121345i = C9432q.m18688b(getContext()) + 0;
        requestWindowFeature(1);
        mo63505c();
    }

    public C48217o(Context context, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        super(context, i);
        requestWindowFeature(1);
        int i3 = -1;
        if (z3) {
            i2 = -2;
        } else if (z) {
            i2 = -1;
        } else {
            i2 = C9432q.m18670a(getContext()) - (f121343a * 2);
        }
        this.f121344h = i2;
        if (!z) {
            if (z2) {
                i3 = -2;
            } else {
                i3 = C9432q.m18688b(getContext()) - (f121343a * 4);
            }
        }
        this.f121345i = i3;
        mo63505c();
    }
}
