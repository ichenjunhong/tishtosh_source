package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdkapi.depend.p438f.C8630a;

/* renamed from: com.bytedance.android.live.broadcast.widget.ag */
final /* synthetic */ class C3749ag implements OnClickListener {

    /* renamed from: a */
    private final C3796v f10617a;

    /* renamed from: b */
    private final C8630a f10618b;

    C3749ag(C3796v vVar, C8630a aVar) {
        this.f10617a = vVar;
        this.f10618b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3796v vVar = this.f10617a;
        this.f10618b.mo10346a(Boolean.valueOf(true));
        vVar.mo9167a();
    }
}
