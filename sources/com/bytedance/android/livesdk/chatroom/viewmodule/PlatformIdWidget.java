package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;

public class PlatformIdWidget extends LiveRecyclableWidget implements C4641g<KVData> {

    /* renamed from: a */
    private Room f17416a;

    /* renamed from: b */
    private TextView f17417b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9061a(Object obj) {
    }

    public int getLayoutId() {
        return R.layout.al7;
    }

    public void onUnload() {
    }

    public void onInit(Object[] objArr) {
        this.f17417b = (TextView) this.contentView.findViewById(R.id.auo);
    }

    public void onLoad(Object[] objArr) {
        this.f17416a = (Room) this.dataCenter.get("data_room");
        if (this.f17416a != null && this.f17416a.getOwner() != null) {
            this.f17417b.setText(C3922z.m9905a((int) R.string.en1, this.f17416a.getOwner().displayId));
        }
    }
}
