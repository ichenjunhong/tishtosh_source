package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.x */
public abstract class C6228x implements OnClickListener {

    /* renamed from: a */
    static boolean f16714a = true;

    /* renamed from: c */
    private static final Runnable f16715c = C6229y.f16717a;

    /* renamed from: b */
    public long f16716b;

    /* renamed from: a */
    public abstract void mo12109a(View view);

    public C6228x() {
        this(500);
    }

    private C6228x(long j) {
        this.f16716b = 500;
    }

    public final void onClick(View view) {
        if (f16714a) {
            f16714a = false;
            view.postDelayed(f16715c, this.f16716b);
            mo12109a(view);
        }
    }
}
