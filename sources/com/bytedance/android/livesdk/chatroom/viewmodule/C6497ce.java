package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.interact.C5274ah;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ce */
final /* synthetic */ class C6497ce implements C1710e {

    /* renamed from: a */
    private final C63031 f17803a;

    /* renamed from: b */
    private final int f17804b;

    /* renamed from: c */
    private final long f17805c;

    /* renamed from: d */
    private final Exception f17806d;

    C6497ce(C63031 r1, int i, long j, Exception exc) {
        this.f17803a = r1;
        this.f17804b = i;
        this.f17805c = j;
        this.f17806d = exc;
    }

    public final void accept(Object obj) {
        C63031 r0 = this.f17803a;
        int i = this.f17804b;
        long j = this.f17805c;
        Exception exc = this.f17806d;
        Integer num = (Integer) obj;
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                LinkInRoomAudioWidget linkInRoomAudioWidget = LinkInRoomAudioWidget.this;
                String message = exc.getMessage();
                C4575an.m10981a((int) R.string.emn);
                C5470cy cyVar = linkInRoomAudioWidget.f17156b;
                cyVar.f14490h = true;
                cyVar.mo11377j();
                C5274ah.m11928a(linkInRoomAudioWidget.f17156b.f14495m.getId(), linkInRoomAudioWidget.f17156b.mo11373d(), C5470cy.m12295f_().toString(), 401, message);
                break;
            case -2:
                LinkInRoomAudioWidget linkInRoomAudioWidget2 = LinkInRoomAudioWidget.this;
                int i2 = (int) j;
                String message2 = exc.getMessage();
                linkInRoomAudioWidget2.f17156b.mo11376i();
                StringBuilder sb = new StringBuilder("code: ");
                sb.append(i2);
                sb.append(", desc: ");
                sb.append(message2);
                C5274ah.m11925a(1, 301, sb.toString(), linkInRoomAudioWidget2.f17164j ? "anchor" : "audience", C31483a.f82385b, C5470cy.m12295f_().toString(), linkInRoomAudioWidget2.f17156b.mo11373d());
                return;
            case -1:
                LinkInRoomAudioWidget linkInRoomAudioWidget3 = LinkInRoomAudioWidget.this;
                int i3 = (int) j;
                String message3 = exc.getMessage();
                C5274ah.m11929a(C5470cy.m12295f_().toString(), 1, i3);
                linkInRoomAudioWidget3.f17156b.mo11374g();
                C4575an.m10981a((int) R.string.eml);
                StringBuilder sb2 = new StringBuilder("code: ");
                sb2.append(i3);
                sb2.append(", desc: ");
                sb2.append(message3);
                C5274ah.m11924a(1, 107, sb2.toString(), "audience", C31483a.f82385b, C5470cy.m12295f_().toString());
                return;
        }
    }
}
