package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cs */
final /* synthetic */ class C6062cs implements OnLongClickListener {

    /* renamed from: a */
    private final C6049cl f16219a;

    C6062cs(C6049cl clVar) {
        this.f16219a = clVar;
    }

    public final boolean onLongClick(View view) {
        C6049cl clVar = this.f16219a;
        ((ClipboardManager) clVar.f16178c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("special_id", clVar.f16188m.getSpecialId()));
        C4575an.m10981a((int) R.string.e5f);
        return true;
    }
}
