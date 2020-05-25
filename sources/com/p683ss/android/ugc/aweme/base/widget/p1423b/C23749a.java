package com.p683ss.android.ugc.aweme.base.widget.p1423b;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.b.a */
public final class C23749a implements OnClickListener {

    /* renamed from: a */
    public boolean f63317a;

    /* renamed from: b */
    public OnClickListener f63318b;

    /* renamed from: c */
    private boolean f63319c;

    /* renamed from: a */
    public static C23749a m58284a(OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        return new C23749a(onClickListener, z);
    }

    public final void onClick(final View view) {
        ClickInstrumentation.onClick(view);
        if (!this.f63319c) {
            this.f63318b.onClick(view);
        } else if (!this.f63317a) {
            this.f63317a = true;
            C23727n.m58239a(new Runnable() {
                public final void run() {
                    C23749a.this.f63318b.onClick(view);
                    C23749a.this.f63317a = false;
                }
            }, (long) C23723j.m58217a().getInteger(R.integer.k));
        }
    }

    private C23749a(OnClickListener onClickListener, boolean z) {
        this.f63318b = onClickListener;
        this.f63319c = z;
    }
}
