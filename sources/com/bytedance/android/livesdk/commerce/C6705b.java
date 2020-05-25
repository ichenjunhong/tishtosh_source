package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p445e.C8733c;
import com.bytedance.android.livesdkapi.p445e.C8735e;
import com.bytedance.android.livesdkapi.p445e.C8736f;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.commerce.b */
public final class C6705b {

    /* renamed from: a */
    public C8735e f18282a;

    /* renamed from: b */
    private C8736f f18283b = new C8736f() {
    };

    /* renamed from: c */
    private Room f18284c;

    /* renamed from: d */
    private String f18285d;

    /* renamed from: e */
    private boolean f18286e;

    /* renamed from: f */
    private boolean f18287f;

    /* renamed from: g */
    private C8733c f18288g;

    /* renamed from: h */
    private WeakReference<DataCenter> f18289h;

    /* renamed from: i */
    private boolean f18290i;

    /* renamed from: j */
    private boolean f18291j;

    public C6705b(boolean z, boolean z2, DataCenter dataCenter, Room room, C8733c cVar, C8735e eVar) {
        this.f18289h = new WeakReference<>(dataCenter);
        this.f18290i = z2;
        if (room != null) {
            this.f18284c = room;
            this.f18286e = this.f18284c.hasCommerceGoods();
            if (this.f18284c.getOwner() != null) {
                this.f18285d = this.f18284c.getOwner().getSecUid();
                this.f18287f = this.f18284c.getOwner().isWithCommercePermission();
            }
        }
        this.f18288g = cVar;
        this.f18291j = z;
        this.f18282a = eVar;
    }
}
