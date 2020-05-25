package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CompoundButton;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bo */
final /* synthetic */ class C5993bo implements OnClickListener {

    /* renamed from: a */
    private final CompoundButton f15896a;

    C5993bo(CompoundButton compoundButton) {
        this.f15896a = compoundButton;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CompoundButton compoundButton = this.f15896a;
        dialogInterface.dismiss();
        compoundButton.setChecked(true);
    }
}
