package com.bytedance.android.livesdk.feed.p343k;

import android.os.Build.VERSION;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.bytedance.android.livesdk.feed.C7106t;
import com.bytedance.common.utility.C9415i;

/* renamed from: com.bytedance.android.livesdk.feed.k.a */
public final class C7009a {

    /* renamed from: a */
    static final boolean f19144a = C9415i.m18635b();

    /* renamed from: b */
    long f19145b;

    /* renamed from: c */
    long f19146c;

    /* renamed from: d */
    long f19147d;

    /* renamed from: e */
    public boolean f19148e;

    /* renamed from: f */
    public int f19149f;

    /* renamed from: g */
    private FrameCallback f19150g;

    /* renamed from: com.bytedance.android.livesdk.feed.k.a$a */
    public static class C7011a {

        /* renamed from: a */
        public static final C7009a f19152a = new C7009a();
    }

    private C7009a() {
        this.f19150g = new FrameCallback() {
            public final void doFrame(long j) {
                if (C7009a.this.f19148e) {
                    if (C7009a.this.f19146c <= 0) {
                        C7009a.this.f19146c = j;
                    } else {
                        C7009a.this.f19147d++;
                    }
                    C7009a.this.f19145b = j;
                    try {
                        Choreographer.getInstance().postFrameCallback(this);
                        if (C7009a.f19144a) {
                            C7009a.this.mo13178a(true);
                        }
                    } catch (Throwable unused) {
                        C7009a.this.f19148e = false;
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo13177a() {
        if (!this.f19148e && VERSION.SDK_INT >= 16) {
            try {
                mo13179b();
                this.f19148e = true;
                Choreographer.getInstance().postFrameCallback(this.f19150g);
            } catch (Throwable unused) {
                this.f19148e = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo13179b() {
        if (VERSION.SDK_INT >= 16) {
            try {
                Choreographer.getInstance().removeFrameCallback(this.f19150g);
                if (this.f19148e) {
                    mo13178a(false);
                }
            } catch (Throwable unused) {
            }
        }
        this.f19148e = false;
        this.f19146c = 0;
        this.f19145b = 0;
        this.f19147d = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13178a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 30;
        }
        if (this.f19147d >= ((long) i) && this.f19145b > this.f19146c) {
            float f = (((float) this.f19147d) * 1.0E9f) / ((float) (this.f19145b - this.f19146c));
            if (!z) {
                C7106t.m14777a(f);
                this.f19149f++;
            }
        }
    }
}
