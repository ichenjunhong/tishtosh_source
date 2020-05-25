package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5163ai;
import com.bytedance.android.livesdk.message.model.C7856by;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.n */
public final class C5102n extends C5081a<C7856by> {
    /* renamed from: a */
    public final ImageModel mo10975a() {
        return null;
    }

    /* renamed from: b */
    public final int mo10977b() {
        return R.drawable.bwh;
    }

    /* renamed from: d */
    public final boolean mo10979d() {
        return true;
    }

    /* renamed from: g */
    public final String mo10982g() {
        return "#ff8533";
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7856by) this.f13643a).f21706a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r2 > 0) goto L_0x006d;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Spannable mo10984l() {
        /*
            r9 = this;
            java.lang.Class<com.bytedance.android.live.room.l> r0 = com.bytedance.android.live.room.C4193l.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.room.l r0 = (com.bytedance.android.live.room.C4193l) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.getCurrentRoom()
            boolean r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.isValid(r0)
            if (r1 == 0) goto L_0x001b
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            long r0 = r0.getId()
            goto L_0x001d
        L_0x001b:
            r0 = 0
        L_0x001d:
            com.bytedance.android.livesdk.message.model.c r2 = r9.f13643a
            com.bytedance.android.livesdk.message.model.by r2 = (com.bytedance.android.livesdk.message.model.C7856by) r2
            com.bytedance.android.live.base.model.user.User r2 = r2.f21706a
            if (r2 == 0) goto L_0x004a
            com.bytedance.android.livesdk.message.model.c r2 = r9.f13643a
            com.bytedance.android.livesdk.message.model.by r2 = (com.bytedance.android.livesdk.message.model.C7856by) r2
            com.bytedance.android.live.base.model.user.User r2 = r2.f21706a
            long r2 = r2.getId()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x003b
            r0 = 2132549982(0x7f1c215e, float:2.0753282E38)
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r0)
            goto L_0x004b
        L_0x003b:
            com.bytedance.android.livesdk.message.model.c r0 = r9.f13643a
            com.bytedance.android.livesdk.message.model.by r0 = (com.bytedance.android.livesdk.message.model.C7856by) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.f21706a
            java.lang.String r0 = r0.getNickName()
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = ""
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            T r1 = r9.f13643a
            com.bytedance.android.livesdk.message.model.by r1 = (com.bytedance.android.livesdk.message.model.C7856by) r1
            int r1 = r1.f21708c
            com.bytedance.android.livesdk.message.model.c r2 = r9.f13643a
            com.bytedance.android.livesdk.message.model.by r2 = (com.bytedance.android.livesdk.message.model.C7856by) r2
            int r3 = r2.f21710e
            r4 = 0
            if (r3 <= 0) goto L_0x006c
            int r3 = r2.f21710e
            long r5 = com.bytedance.android.livesdk.p279af.C4574am.m10977a()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r5 = (int) r5
            int r2 = r2.f21709d
            int r5 = r5 - r2
            int r2 = r3 - r5
            if (r2 <= 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            com.bytedance.android.livesdk.message.model.c r3 = r9.f13643a
            com.bytedance.android.livesdk.message.model.by r3 = (com.bytedance.android.livesdk.message.model.C7856by) r3
            boolean r3 = r3.f21715j
            r5 = 1
            r6 = 2
            if (r3 != 0) goto L_0x00a2
            if (r2 <= 0) goto L_0x00a2
            r1 = 60
            if (r2 >= r1) goto L_0x008f
            r1 = 2132551139(0x7f1c25e3, float:2.0755629E38)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3[r5] = r0
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r1, r3)
            goto L_0x00b3
        L_0x008f:
            r3 = 2132551138(0x7f1c25e2, float:2.0755627E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r0
            int r2 = r2 / r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6[r5] = r0
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r3, r6)
            goto L_0x00b3
        L_0x00a2:
            r2 = 2132551140(0x7f1c25e4, float:2.075563E38)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3[r5] = r0
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r2, r3)
        L_0x00b3:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p309e.C5102n.mo10984l():android.text.Spannable");
    }

    C5102n(C7856by byVar) {
        super(byVar);
    }

    /* renamed from: a */
    public final void mo10976a(Context context, Room room) {
        C5163ai aiVar = new C5163ai(1);
        aiVar.f13843b = this.f13643a;
        C4495a.m10823a().mo10301a((Object) aiVar);
    }
}
