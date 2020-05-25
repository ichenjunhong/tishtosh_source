package com.p683ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.m */
final /* synthetic */ class C36138m implements OnClickListener {

    /* renamed from: a */
    private final Context f92541a;

    /* renamed from: b */
    private final long f92542b;

    /* renamed from: c */
    private final String f92543c;

    /* renamed from: d */
    private final Bundle f92544d;

    /* renamed from: e */
    private final String f92545e;

    /* renamed from: f */
    private final List f92546f;

    C36138m(Context context, long j, String str, Bundle bundle, String str2, List list) {
        this.f92541a = context;
        this.f92542b = j;
        this.f92543c = str;
        this.f92544d = bundle;
        this.f92545e = str2;
        this.f92546f = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Live.lambda$watchLive$0$Live(this.f92541a, this.f92542b, this.f92543c, this.f92544d, this.f92545e, this.f92546f, dialogInterface, i);
    }
}
