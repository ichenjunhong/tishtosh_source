package com.p683ss.android.ugc.aweme.utils;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.utils.av */
public abstract class C47687av implements OnClickListener {

    /* renamed from: a */
    private final long f120168a;

    /* renamed from: b */
    private final Runnable f120169b;

    /* renamed from: e */
    public boolean f120170e;

    /* renamed from: a */
    public abstract void mo59929a(View view);

    public C47687av() {
        this(300);
    }

    public C47687av(long j) {
        this.f120170e = true;
        this.f120169b = new Runnable() {
            public final void run() {
                C47687av.this.f120170e = true;
            }
        };
        this.f120168a = j;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f120170e) {
            this.f120170e = false;
            view.postDelayed(this.f120169b, this.f120168a);
            mo59929a(view);
        }
    }
}
