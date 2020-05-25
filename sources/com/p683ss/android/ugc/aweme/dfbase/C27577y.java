package com.p683ss.android.ugc.aweme.dfbase;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.dfbase.y */
final /* synthetic */ class C27577y implements OnDismissListener {

    /* renamed from: a */
    private final WeakReference f72498a;

    C27577y(WeakReference weakReference) {
        this.f72498a = weakReference;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity = (Activity) this.f72498a.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
