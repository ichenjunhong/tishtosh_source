package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.aweme.tools.C47338s;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ax */
public final class C42434ax {

    /* renamed from: a */
    FragmentActivity f107324a;

    /* renamed from: b */
    public C42436a f107325b;

    /* renamed from: c */
    Handler f107326c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ax$a */
    public interface C42436a {
        boolean bK_();
    }

    private C42434ax(FragmentActivity fragmentActivity) {
        this.f107326c = new Handler(Looper.getMainLooper());
        this.f107324a = fragmentActivity;
    }

    public final void onEvent(C47338s sVar) {
        C424351 r3 = new Runnable() {
            public final void run() {
                FragmentActivity fragmentActivity = C42434ax.this.f107324a;
                boolean z = false;
                if (fragmentActivity != null && !fragmentActivity.isFinishing() && (VERSION.SDK_INT < 17 || !fragmentActivity.isDestroyed())) {
                    z = true;
                }
                if (z) {
                    if (C42434ax.this.f107325b == null || C42434ax.this.f107325b.bK_()) {
                        C49860a aVar = (C49860a) ApiCenter.m7844a(C42434ax.this.f107324a).mo7341b(C49860a.class);
                        if (aVar != null) {
                            aVar.mo97688a(true);
                        }
                    }
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r3.run();
        } else {
            this.f107326c.post(r3);
        }
    }

    public C42434ax(FragmentActivity fragmentActivity, C42436a aVar) {
        this(fragmentActivity);
        this.f107325b = aVar;
    }
}
