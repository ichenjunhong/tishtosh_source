package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bk */
final /* synthetic */ class C5989bk implements OnCheckedChangeListener {

    /* renamed from: a */
    private final C5988bj f15890a;

    C5989bk(C5988bj bjVar) {
        this.f15890a = bjVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C5988bj bjVar = this.f15890a;
        if (!z) {
            if (bjVar.f15880b.getItemCount() <= 0) {
                bjVar.mo11981a((int) R.string.ejj);
                bjVar.f15879a.mo11420e();
                C4563ad.m10956a(bjVar.f15881c, "shutdown_connection", "connection", true);
                return;
            }
            C8552a aVar = new C8552a(bjVar.getContext(), 0);
            aVar.mo15012d((int) R.string.h14);
            aVar.mo15008c((int) R.string.h16);
            aVar.mo15003b(0, (int) R.string.h13, (OnClickListener) new C5992bn(bjVar)).mo15003b(1, (int) R.string.e45, (OnClickListener) new C5993bo(compoundButton)).mo14996a(false).mo15011d();
        }
    }
}
