package com.bytedance.android.livesdk.list;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.list.a */
final /* synthetic */ class C7739a implements C1710e {

    /* renamed from: a */
    private final MultiRoomIdListProvider f21282a;

    C7739a(MultiRoomIdListProvider multiRoomIdListProvider) {
        this.f21282a = multiRoomIdListProvider;
    }

    public final void accept(Object obj) {
        MultiRoomIdListProvider multiRoomIdListProvider = this.f21282a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null) {
            Map map = (Map) dVar.data;
            ArrayList<Room> arrayList = new ArrayList<>();
            boolean z = false;
            String str = "";
            String str2 = "";
            if (multiRoomIdListProvider.f21278c != null) {
                str = multiRoomIdListProvider.f21278c.getString("live.intent.extra.REQUEST_ID");
                str2 = multiRoomIdListProvider.f21278c.getString("live.intent.extra.LOG_PB");
                if (TextUtils.isEmpty(str)) {
                    str = multiRoomIdListProvider.f21278c.getString("request_id");
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = multiRoomIdListProvider.f21278c.getString("log_pb");
                }
            }
            Iterator it = multiRoomIdListProvider.f21276a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Long l = (Long) it.next();
                if (l == null || !map.containsKey(String.valueOf(l))) {
                    z = true;
                } else {
                    arrayList.add(map.get(String.valueOf(l)));
                }
            }
            z = true;
            for (Room room : arrayList) {
                room.setLog_pb(str2);
                room.setRequestId(str);
            }
            if (!z) {
                multiRoomIdListProvider.f21277b = new ArrayList(arrayList);
                multiRoomIdListProvider.mo14086a(multiRoomIdListProvider.f21277b);
            }
        }
    }
}
