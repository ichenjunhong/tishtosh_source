package com.bytedance.android.live.room;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.ies.sdk.widgets.DataCenter;

/* renamed from: com.bytedance.android.live.room.d */
public interface C4184d {

    /* renamed from: com.bytedance.android.live.room.d$a */
    public static abstract class C4185a {
        /* renamed from: a */
        public void mo9597a(int i) {
        }

        /* renamed from: a */
        public void mo8464a(C7861cb cbVar) {
        }
    }

    /* renamed from: a */
    void mo9581a(float f);

    /* renamed from: a */
    void mo9582a(C3048a aVar);

    /* renamed from: a */
    void mo9583a(C5281ao aoVar);

    /* renamed from: a */
    void mo9584a(C8710m mVar);

    /* renamed from: a */
    void mo9585a(DataCenter dataCenter, boolean z, C4185a aVar, EnterRoomExtra enterRoomExtra);

    /* renamed from: a */
    void mo9586a(Runnable runnable);

    /* renamed from: a */
    void mo9587a(boolean z, CharSequence charSequence, CharSequence charSequence2);

    /* renamed from: c */
    void mo9588c();

    /* renamed from: d */
    void mo9589d();

    /* renamed from: e */
    FrameLayout mo9590e();

    /* renamed from: f */
    void mo9591f();

    C0654k getChildFragmentManager();

    boolean isAdded();

    void onActivityResult(int i, int i2, Intent intent);

    void setArguments(Bundle bundle);

    void show(C0654k kVar, String str);
}
