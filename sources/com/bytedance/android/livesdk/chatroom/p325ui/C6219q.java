package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4765c;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4766d;
import com.bytedance.android.livesdk.chatroom.event.C5158ad;
import com.bytedance.android.livesdk.chatroom.event.C5160af;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.chatroom.event.C5170ap;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.chatroom.event.C5185e;
import com.bytedance.android.livesdk.chatroom.event.C5186f;
import com.bytedance.android.livesdk.chatroom.event.C5194n;
import com.bytedance.android.livesdk.chatroom.event.C5205x;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.kickout.p389a.C7721b;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdkapi.depend.p434b.C8617c;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.q */
final /* synthetic */ class C6219q implements C1710e {

    /* renamed from: a */
    private final C5957b f16693a;

    C6219q(C5957b bVar) {
        this.f16693a = bVar;
    }

    public final void accept(Object obj) {
        C5957b bVar = this.f16693a;
        if (obj instanceof C5185e) {
            bVar.onEvent((C5185e) obj);
        } else if (obj instanceof C8745a) {
            bVar.onEvent((C8745a) obj);
        } else if (obj instanceof C5205x) {
            bVar.onEvent((C5205x) obj);
        } else if (obj instanceof C5206y) {
            bVar.onEvent((C5206y) obj);
        } else if (obj instanceof C8617c) {
            bVar.onEvent((C8617c) obj);
        } else if (obj instanceof C5160af) {
            bVar.onEvent((C5160af) obj);
        } else if (obj instanceof C5161ag) {
            bVar.onEvent((C5161ag) obj);
        } else if (obj instanceof C7713e) {
            bVar.onEvent((C7713e) obj);
        } else if (obj instanceof C5170ap) {
            bVar.onEvent((C5170ap) obj);
        } else if (obj instanceof C7721b) {
            bVar.onEvent((C7721b) obj);
        } else if (obj instanceof UserProfileEvent) {
            bVar.onEvent((UserProfileEvent) obj);
        } else if (obj instanceof C4765c) {
            bVar.onEvent((C4765c) obj);
        } else if (obj instanceof C5158ad) {
            bVar.onEvent((C5158ad) obj);
        } else if (obj instanceof C4766d) {
            bVar.onEvent((C4766d) obj);
        } else if (obj instanceof C5194n) {
            bVar.onEvent((C5194n) obj);
        } else if (obj instanceof C5171aq) {
            bVar.onEvent((C5171aq) obj);
        } else {
            if (obj instanceof C5186f) {
                bVar.onEvent((C5186f) obj);
            }
        }
    }
}
