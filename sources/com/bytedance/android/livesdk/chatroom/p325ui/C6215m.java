package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.m */
final /* synthetic */ class C6215m implements OnClickListener {

    /* renamed from: a */
    private final C5957b f16685a;

    /* renamed from: b */
    private final long f16686b;

    /* renamed from: c */
    private final long f16687c;

    /* renamed from: d */
    private final String f16688d;

    /* renamed from: e */
    private final Runnable f16689e;

    C6215m(C5957b bVar, long j, long j2, String str, Runnable runnable) {
        this.f16685a = bVar;
        this.f16686b = j;
        this.f16687c = j2;
        this.f16688d = str;
        this.f16689e = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16685a.mo11901a(this.f16686b, this.f16687c, this.f16688d, this.f16689e, dialogInterface, i);
    }
}
