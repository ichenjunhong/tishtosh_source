package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler */
public class ToolSafeHandler extends SafeHandler {

    /* renamed from: a */
    private boolean f114718a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler$1 */
    static /* synthetic */ class C453651 {

        /* renamed from: a */
        static final /* synthetic */ int[] f114719a = new int[C0177a.values().length];

        static {
            try {
                f114719a[C0177a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ToolSafeHandler(C0184k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public final void mo91703a(Runnable runnable) {
        if (!this.f114718a) {
            post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (C453651.f114719a[aVar.ordinal()] == 1) {
            mo86355a();
            this.f114718a = true;
        }
    }
}
