package com.bytedance.sdk.account.bdplatform.impl.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.view.a */
public abstract class C13069a implements OnClickListener {

    /* renamed from: a */
    private static final Handler f34134a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public boolean f34135b;

    /* renamed from: c */
    public long f34136c;

    /* renamed from: d */
    public final Runnable f34137d;

    /* renamed from: a */
    public abstract void mo24743a(View view);

    public C13069a() {
        this(500);
    }

    private C13069a(long j) {
        this.f34135b = true;
        this.f34137d = new Runnable() {
            public final void run() {
                C13069a.this.f34135b = true;
            }
        };
        this.f34136c = 500;
    }

    public void onClick(View view) {
        if (this.f34135b) {
            this.f34135b = false;
            f34134a.postDelayed(this.f34137d, this.f34136c);
            mo24743a(view);
        }
    }
}
