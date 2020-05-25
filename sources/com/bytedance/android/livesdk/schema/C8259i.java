package com.bytedance.android.livesdk.schema;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.schema.interfaces.C8261b.C8262a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.schema.i */
final /* synthetic */ class C8259i implements OnClickListener {

    /* renamed from: a */
    private final RoomActionHandler f22574a;

    /* renamed from: b */
    private final Room f22575b;

    /* renamed from: c */
    private final C8262a f22576c;

    C8259i(RoomActionHandler roomActionHandler, Room room, C8262a aVar) {
        this.f22574a = roomActionHandler;
        this.f22575b = room;
        this.f22576c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f22574a.lambda$handleEnterRoom$3$RoomActionHandler(this.f22575b, this.f22576c, dialogInterface, i);
    }
}
