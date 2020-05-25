package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.feed.i.h */
final /* synthetic */ class C6979h implements OnClickListener {

    /* renamed from: a */
    private final C6959a f19068a;

    /* renamed from: b */
    private final Room f19069b;

    /* renamed from: c */
    private final PopupWindow f19070c;

    C6979h(C6959a aVar, Room room, PopupWindow popupWindow) {
        this.f19068a = aVar;
        this.f19069b = room;
        this.f19070c = popupWindow;
    }

    public final void onClick(View view) {
        this.f19068a.mo13149a(this.f19069b, this.f19070c, view);
    }
}
