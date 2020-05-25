package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Message;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdkapi.C8743g;
import com.bytedance.android.livesdkapi.C8743g.C8744a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.RoomCreator */
public class RoomCreator implements C8743g, C9382a {
    private static final int MSG_CREATE_ROOM = 1;
    private static final int ROOM_CREATE_ANCHOR_AVATAR_TOO_SMALL = 30011;
    private static final int ROOM_CREATE_ANCHOR_BLOCKED = 30012;
    private static final int ROOM_CREATE_USER_NOT_VERIFIED = 30010;
    private final C8744a mCallback;
    private final C9381g mWeakHandler = new C9381g(this);

    public RoomCreator(C8744a aVar) {
        this.mCallback = aVar;
    }

    public void handleMsg(Message message) {
        if (message.what == 1 && this.mCallback != null) {
            if (message.obj instanceof Exception) {
                Exception exc = (Exception) message.obj;
                if (exc instanceof C2949a) {
                    ((C2949a) exc).getErrorCode();
                }
                return;
            }
            if (message.obj instanceof Room) {
                Object obj = message.obj;
            }
        }
    }

    public void createRoom(String str, String str2, boolean z) {
        C8710m mVar;
        C5014i a = C5014i.m11508a();
        C9381g gVar = this.mWeakHandler;
        if (z) {
            mVar = C8710m.AUDIO;
        } else {
            mVar = C8710m.VIDEO;
        }
        a.mo9631a(gVar, str, str2, mVar, -1, 0, false, 1);
    }
}
