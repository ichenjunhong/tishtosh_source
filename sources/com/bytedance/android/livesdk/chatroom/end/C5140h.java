package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.h */
final /* synthetic */ class C5140h implements C1710e {

    /* renamed from: a */
    private final C51351 f13791a;

    C5140h(C51351 r1) {
        this.f13791a = r1;
    }

    public final void accept(Object obj) {
        C51351 r0 = this.f13791a;
        Integer num = (Integer) obj;
        if (num.equals(Integer.valueOf(2))) {
            C5132e.this.mo11023b();
        } else if (num.equals(Integer.valueOf(1))) {
            C4575an.m10981a((int) R.string.f0e);
        } else {
            C4575an.m10981a((int) R.string.f0d);
        }
    }
}
