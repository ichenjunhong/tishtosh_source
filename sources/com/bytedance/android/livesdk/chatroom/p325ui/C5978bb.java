package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bb */
final /* synthetic */ class C5978bb implements OnCheckedChangeListener {

    /* renamed from: a */
    private final C5977ba f15856a;

    C5978bb(C5977ba baVar) {
        this.f15856a = baVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C5977ba baVar = this.f15856a;
        if (!z) {
            if (baVar.f15842b.getItemCount() <= 0) {
                baVar.mo11964a((int) R.string.ejj);
                baVar.f15841a.mo11383p();
                C4563ad.m10956a(baVar.f15843c, "shutdown_connection", "connection", true);
                return;
            }
            C8552a aVar = new C8552a(baVar.getContext(), 0);
            aVar.mo15012d((int) R.string.h14);
            aVar.mo15008c((int) R.string.h16);
            aVar.mo15003b(0, (int) R.string.h13, (OnClickListener) new C5983bg(baVar)).mo15003b(1, (int) R.string.e45, (OnClickListener) new C5984bh(compoundButton)).mo14996a(false).mo15011d();
        }
    }
}
