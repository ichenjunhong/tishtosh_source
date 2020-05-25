package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.em */
final /* synthetic */ class C6562em implements OnClickListener {

    /* renamed from: a */
    private final RadioWidget f17895a;

    C6562em(RadioWidget radioWidget) {
        this.f17895a = radioWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f17895a.f17528c.mo11654b();
        } catch (Exception unused) {
            C4575an.m10981a((int) R.string.ept);
        }
        dialogInterface.dismiss();
    }
}
