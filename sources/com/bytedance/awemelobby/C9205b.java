package com.bytedance.awemelobby;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.awemelobby.b */
public final class C9205b {

    /* renamed from: a */
    public static final C9205b f25177a = new C9205b();

    /* renamed from: com.bytedance.awemelobby.b$a */
    public static final class C9206a implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Activity f25178a;

        public C9206a(Activity activity) {
            this.f25178a = activity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Activity activity = this.f25178a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.bytedance.awemelobby.b$b */
    public static final class C9207b implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Activity f25179a;

        public C9207b(Activity activity) {
            this.f25179a = activity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Activity activity = this.f25179a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private C9205b() {
    }
}
