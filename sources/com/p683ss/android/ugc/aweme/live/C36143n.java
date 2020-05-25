package com.p683ss.android.ugc.aweme.live;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.live.n */
final /* synthetic */ class C36143n implements OnClickListener {

    /* renamed from: a */
    private final String f92551a;

    /* renamed from: b */
    private final Bundle f92552b;

    /* renamed from: c */
    private final long f92553c;

    C36143n(String str, Bundle bundle, long j) {
        this.f92551a = str;
        this.f92552b = bundle;
        this.f92553c = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Live.lambda$watchLive$1$Live(this.f92551a, this.f92552b, this.f92553c, dialogInterface, i);
    }
}
