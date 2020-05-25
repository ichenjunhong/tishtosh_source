package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.al */
public final class C5934al extends Dialog {
    public C5934al(Context context) {
        super(context, R.style.yy);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aie, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
    }
}
