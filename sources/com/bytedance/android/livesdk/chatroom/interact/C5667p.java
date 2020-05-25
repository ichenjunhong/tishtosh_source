package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5511eg;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.p */
final /* synthetic */ class C5667p implements C1710e {

    /* renamed from: a */
    private final C52462 f14854a;

    /* renamed from: b */
    private final int f14855b;

    /* renamed from: c */
    private final long f14856c;

    /* renamed from: d */
    private final Exception f14857d;

    C5667p(C52462 r1, int i, long j, Exception exc) {
        this.f14854a = r1;
        this.f14855b = i;
        this.f14856c = j;
        this.f14857d = exc;
    }

    public final void accept(Object obj) {
        C52462 r0 = this.f14854a;
        int i = this.f14855b;
        long j = this.f14856c;
        Exception exc = this.f14857d;
        Integer num = (Integer) obj;
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget = LinkInRoomVideoAnchorWidget.this;
                String message = exc.getMessage();
                C4575an.m10981a((int) R.string.emn);
                C5511eg egVar = linkInRoomVideoAnchorWidget.f13988b;
                egVar.f14551j = true;
                egVar.mo11420e();
                C5274ah.m11928a(linkInRoomVideoAnchorWidget.f13988b.f14552k.getId(), linkInRoomVideoAnchorWidget.f13988b.mo11424j(), C5511eg.m12351h().toString(), 401, message);
                break;
            case -2:
                LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget2 = LinkInRoomVideoAnchorWidget.this;
                int i2 = (int) j;
                String message2 = exc.getMessage();
                if (linkInRoomVideoAnchorWidget2.isViewValid()) {
                    C5511eg egVar2 = linkInRoomVideoAnchorWidget2.f13988b;
                    egVar2.f14549h = false;
                    if (egVar2.f14551j) {
                        egVar2.f14550i = false;
                        egVar2.mo11420e();
                    } else if (egVar2.f14555n != null) {
                        egVar2.f14555n.mo11432e();
                    }
                }
                StringBuilder sb = new StringBuilder("code: ");
                sb.append(i2);
                sb.append(", desc: ");
                sb.append(message2);
                C5274ah.m11925a(1, 301, sb.toString(), "anchor", C31483a.f82385b, C5511eg.m12351h().toString(), linkInRoomVideoAnchorWidget2.f13988b.mo11424j());
                return;
            case -1:
                LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget3 = LinkInRoomVideoAnchorWidget.this;
                int i3 = (int) j;
                String message3 = exc.getMessage();
                if (linkInRoomVideoAnchorWidget3.isViewValid()) {
                    C5274ah.m11929a(C5511eg.m12351h().toString(), 1, i3);
                    C5511eg egVar3 = linkInRoomVideoAnchorWidget3.f13988b;
                    egVar3.f14548g = false;
                    if (egVar3.f14555n != null) {
                        egVar3.f14555n.mo11430c();
                    }
                    egVar3.f14556o.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(8));
                    StringBuilder sb2 = new StringBuilder("code: ");
                    sb2.append(i3);
                    sb2.append(", desc: ");
                    sb2.append(message3);
                    C5274ah.m11924a(1, 107, sb2.toString(), "anchor", C31483a.f82385b, C5511eg.m12351h().toString());
                }
                return;
        }
    }
}
