package com.p683ss.android.ugc.aweme.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.app.y */
final /* synthetic */ class C23187y implements OnClickListener {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f61648a;

    /* renamed from: b */
    private final boolean f61649b;

    /* renamed from: c */
    private final Intent f61650c;

    C23187y(DeepLinkHandlerActivity deepLinkHandlerActivity, boolean z, Intent intent) {
        this.f61648a = deepLinkHandlerActivity;
        this.f61649b = z;
        this.f61650c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f61648a.mo47302a(this.f61649b, this.f61650c, dialogInterface, i);
    }
}
