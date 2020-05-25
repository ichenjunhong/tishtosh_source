package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn */
final /* synthetic */ class C6057cn implements OnLongClickListener {

    /* renamed from: a */
    private final C6049cl f16214a;

    C6057cn(C6049cl clVar) {
        this.f16214a = clVar;
    }

    public final boolean onLongClick(View view) {
        C6049cl clVar = this.f16214a;
        ((ClipboardManager) clVar.f16178c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("hotsoon_id", String.valueOf(clVar.f16188m.displayId)));
        C4575an.m10981a((int) R.string.e5e);
        return true;
    }
}
