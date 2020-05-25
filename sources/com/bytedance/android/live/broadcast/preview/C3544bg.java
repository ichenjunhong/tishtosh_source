package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.C8803g;

/* renamed from: com.bytedance.android.live.broadcast.preview.bg */
final /* synthetic */ class C3544bg implements OnClickListener {

    /* renamed from: a */
    private final C3514al f10101a;

    C3544bg(C3514al alVar) {
        this.f10101a = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3514al alVar = this.f10101a;
        C4116c.m10249a(C8803g.class);
        alVar.startActivityForResult(null, 23456);
    }
}
