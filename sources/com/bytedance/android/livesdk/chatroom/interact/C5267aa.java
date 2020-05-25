package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.aa */
final /* synthetic */ class C5267aa implements C1710e {

    /* renamed from: a */
    private final C52471 f14102a;

    /* renamed from: b */
    private final int f14103b;

    /* renamed from: c */
    private final long f14104c;

    /* renamed from: d */
    private final Exception f14105d;

    C5267aa(C52471 r1, int i, long j, Exception exc) {
        this.f14102a = r1;
        this.f14103b = i;
        this.f14104c = j;
        this.f14105d = exc;
    }

    public final void accept(Object obj) {
        C52471 r0 = this.f14102a;
        int i = this.f14103b;
        long j = this.f14104c;
        Exception exc = this.f14105d;
        Integer num = (Integer) obj;
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = LinkInRoomVideoGuestWidget.this;
                String message = exc.getMessage();
                C4575an.m10981a((int) R.string.emn);
                C5529ew ewVar = linkInRoomVideoGuestWidget.f14005b;
                ewVar.f14581h = true;
                ewVar.mo11442i();
                C5274ah.m11928a(linkInRoomVideoGuestWidget.f14005b.f14582i.getId(), linkInRoomVideoGuestWidget.f14005b.mo11446m(), C5529ew.m12383o().toString(), 401, message);
                break;
            case -2:
                LinkInRoomVideoGuestWidget.this.mo11079a((int) j, exc.getMessage());
                return;
            case -1:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget2 = LinkInRoomVideoGuestWidget.this;
                int i2 = (int) j;
                String message2 = exc.getMessage();
                C5274ah.m11929a(C5529ew.m12383o().toString(), 1, i2);
                linkInRoomVideoGuestWidget2.f14005b.mo11440g();
                C4575an.m10981a((int) R.string.eml);
                StringBuilder sb = new StringBuilder("code: ");
                sb.append(i2);
                sb.append(", desc: ");
                sb.append(message2);
                C5274ah.m11924a(1, 107, sb.toString(), "audience", C31483a.f82385b, C5529ew.m12383o().toString());
                return;
        }
    }
}
