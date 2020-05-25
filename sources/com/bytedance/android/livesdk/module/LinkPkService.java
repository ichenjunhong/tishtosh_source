package com.bytedance.android.livesdk.module;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.p399o.p402c.C8055f;
import com.bytedance.ies.sdk.widgets.KVData;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p094l.C2180b;

public class LinkPkService implements C4133a {
    private C0199s<KVData> pkStateObserver = new C0199s<KVData>() {
        public final /* synthetic */ void onChanged(Object obj) {
            KVData kVData = (KVData) obj;
            if (kVData != null && kVData.getData() != null) {
                LinkPkService.this.pkStateSubject.onNext(kVData.getData());
            }
        }
    };
    public final C2180b<C4632d> pkStateSubject = C2180b.m6534l();

    public C4632d getCurrentPkState() {
        return (C4632d) LinkCrossRoomDataHolder.m11103a().get("data_pk_state", C4632d.DISABLED);
    }

    public C8055f getLinkCrossRoomLog() {
        return LinkCrossRoomDataHolder.m11103a().mo10411b();
    }

    public C2201v<C4632d> observePkState() {
        return this.pkStateSubject.mo6514a(C1667a.m5940a());
    }

    public LinkPkService() {
        C4116c.m10251a(C4133a.class, this);
    }

    public void registerObserve() {
        if (LinkCrossRoomDataHolder.m11103a() != LinkCrossRoomDataHolder.f12605a) {
            LinkCrossRoomDataHolder.m11103a().observe("data_pk_state", this.pkStateObserver);
        }
    }

    public void removeObserve() {
        if (LinkCrossRoomDataHolder.m11103a() != LinkCrossRoomDataHolder.f12605a) {
            LinkCrossRoomDataHolder.m11103a().removeObserver(this.pkStateObserver);
        }
    }
}
