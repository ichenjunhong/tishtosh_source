package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CompoundButton;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bh */
final /* synthetic */ class C5984bh implements OnClickListener {

    /* renamed from: a */
    private final CompoundButton f15864a;

    C5984bh(CompoundButton compoundButton) {
        this.f15864a = compoundButton;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CompoundButton compoundButton = this.f15864a;
        dialogInterface.dismiss();
        compoundButton.setChecked(true);
    }
}
