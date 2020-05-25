package com.p683ss.android.ugc.aweme.account.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.views.b */
public class C22312b extends Dialog {

    /* renamed from: a */
    private static final int f60104a = ((int) C9432q.m18687b((Context) C23826bi.m58460b(), 20.0f));

    /* renamed from: b */
    private int f60105b;

    /* renamed from: c */
    private int f60106c;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f60105b, this.f60106c);
        }
    }

    public C22312b(Context context, int i, boolean z, boolean z2) {
        int i2;
        super(context, R.style.a3a);
        requestWindowFeature(1);
        int i3 = -1;
        if (z) {
            i2 = -1;
        } else {
            i2 = C9432q.m18670a(getContext()) - (f60104a * 2);
        }
        this.f60105b = i2;
        if (!z) {
            if (z2) {
                i3 = -2;
            } else {
                i3 = C9432q.m18688b(getContext()) - (f60104a * 4);
            }
        }
        this.f60106c = i3;
    }
}
