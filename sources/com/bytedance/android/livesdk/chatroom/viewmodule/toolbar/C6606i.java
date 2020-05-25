package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.C6430a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.C6436b;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.C6438d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.i */
public final class C6606i implements C6599c {

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.i$a */
    public static final class C6608a implements C4510b<C6599c> {
        /* renamed from: a */
        public final C4511a<C6599c> mo10307a(C4511a<C6599c> aVar) {
            return aVar.mo10337a(new C6606i()).mo10336a();
        }
    }

    private C6606i() {
    }

    /* renamed from: a */
    private static boolean m13971a(Room room, boolean z) {
        return ((IGiftService) C4116c.m10249a(IGiftService.class)).showGiftIcon(room, z);
    }

    /* renamed from: a */
    public final void mo12671a(DataCenter dataCenter, Context context) {
        C6600d a = C6610k.m13985a();
        a.mo12668a(C6605h.MORE, (C6601a) new C6438d(context));
        a.mo12668a(C6605h.CLOSE_ROOM, (C6601a) new C6430a());
        C6610k.m13986b().mo12668a(C6605h.MANAGE, (C6601a) new C6436b(true));
    }

    /* renamed from: a */
    public final void mo12672a(DataCenter dataCenter, List<C6605h> list) {
        list.clear();
        boolean booleanValue = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        boolean booleanValue2 = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        C8710m mVar = (C8710m) dataCenter.get("data_live_mode");
        Room room = (Room) dataCenter.get("data_room");
        if (booleanValue) {
            if (!(room == null || room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableStickerDonation())) {
                list.add(C6605h.STICKER_DONATION);
            }
            if (mVar == C8710m.AUDIO || mVar == C8710m.VIDEO) {
                list.add(C6605h.INTERACTION);
                list.add(C6605h.AUDIO_TOGGLE);
            }
            list.add(C6605h.MORE);
            if (m13971a(room, true)) {
                list.add(C6605h.GIFT);
            }
        } else {
            if (!booleanValue2) {
                if (room.getStreamUrl().mo15384d().size() > 1) {
                    list.add(C6605h.SWITCH_VIDEO_QUALITY);
                }
                list.add(C6605h.SWITCH_SCREEN_ORIENTATION);
                list.add(C6605h.GIFT_ANIMATION);
            } else if (mVar == C8710m.AUDIO || mVar == C8710m.VIDEO) {
                list.add(C6605h.INTERACTION);
                list.add(C6605h.AUDIO_TOGGLE);
            }
            list.add(C6605h.SHARE);
            if (m13971a(room, false)) {
                list.add(C6605h.FAST_GIFT);
                list.add(C6605h.GIFT);
            }
            list.add(0, C6605h.MANAGE_UNFOLD);
        }
    }

    /* renamed from: b */
    public final void mo12673b(DataCenter dataCenter, List<C6605h> list) {
        list.clear();
        boolean booleanValue = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        boolean booleanValue2 = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        C8710m mVar = (C8710m) dataCenter.get("data_live_mode");
        Room room = (Room) dataCenter.get("data_room");
        if (mVar.isUsingCamera) {
            list.add(C6605h.BEAUTY);
            list.add(C6605h.FILTER);
            list.add(C6605h.STICKER);
            list.add(C6605h.REVERSE_CAMERA);
            list.add(C6605h.REVERSE_MIRROR);
            list.add(C6605h.MANAGE);
        }
        if (mVar.equals(C8710m.AUDIO) && booleanValue2) {
            list.add(C6605h.MANAGE);
        }
        if (mVar.equals(C8710m.THIRD_PARTY) && booleanValue2) {
            list.add(C6605h.PUSH_URL);
            list.add(C6605h.MANAGE);
        }
        if (booleanValue || (mVar.equals(C8710m.AUDIO) && booleanValue2)) {
            if (booleanValue2 && room != null && room.getOwner() != null && room.getOwner().getSecret() != 1) {
                list.add(C6605h.SHARE);
            } else if (!booleanValue2) {
                list.add(C6605h.SHARE);
            }
        }
    }
}
