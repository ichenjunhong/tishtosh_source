package com.bytedance.android.live.broadcast.bgbroadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.g */
final /* synthetic */ class C3126g implements OnClickListener {

    /* renamed from: a */
    private final C3114c f9106a;

    /* renamed from: b */
    private final HashMap f9107b;

    /* renamed from: c */
    private final boolean f9108c;

    C3126g(C3114c cVar, HashMap hashMap, boolean z) {
        this.f9106a = cVar;
        this.f9107b = hashMap;
        this.f9108c = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9106a.mo8434a(this.f9107b, this.f9108c, dialogInterface, i);
    }
}
