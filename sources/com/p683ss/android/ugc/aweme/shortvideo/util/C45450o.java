package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.o */
final /* synthetic */ class C45450o implements OnClickListener {

    /* renamed from: a */
    private final Context f114861a;

    /* renamed from: b */
    private final Intent f114862b;

    C45450o(Context context, Intent intent) {
        this.f114861a = context;
        this.f114862b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f114861a.startActivity(this.f114862b);
    }
}
