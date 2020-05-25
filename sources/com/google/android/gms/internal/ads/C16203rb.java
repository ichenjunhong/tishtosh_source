package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;

/* renamed from: com.google.android.gms.internal.ads.rb */
final class C16203rb implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C16202ra f45461a;

    C16203rb(C16202ra raVar) {
        this.f45461a = raVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C16202ra raVar = this.f45461a;
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", raVar.f45455b);
        data.putExtra("eventLocation", raVar.f45459f);
        data.putExtra("description", raVar.f45458e);
        if (raVar.f45456c > -1) {
            data.putExtra("beginTime", raVar.f45456c);
        }
        if (raVar.f45457d > -1) {
            data.putExtra("endTime", raVar.f45457d);
        }
        data.setFlags(268435456);
        acd.m32581a(this.f45461a.f45454a, data);
    }
}
