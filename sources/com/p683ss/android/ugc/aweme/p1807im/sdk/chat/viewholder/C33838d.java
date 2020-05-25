package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33706a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.d */
public final /* synthetic */ class C33838d implements OnCheckedChangeListener {

    /* renamed from: a */
    private final C33805c f87788a;

    /* renamed from: b */
    private final C33706a f87789b;

    public C33838d(C33805c cVar, C33706a aVar) {
        this.f87788a = cVar;
        this.f87789b = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C33805c cVar = this.f87788a;
        C33706a aVar = this.f87789b;
        if (aVar != null) {
            aVar.mo71730a(z, cVar.getAdapterPosition());
        }
    }
}
