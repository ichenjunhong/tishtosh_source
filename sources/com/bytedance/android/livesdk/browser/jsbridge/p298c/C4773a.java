package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p521a.C9369a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.a */
public class C4773a implements C10762d {

    /* renamed from: a */
    Context f12986a;

    public C4773a(Context context) {
        this.f12986a = context;
    }

    public void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        String str;
        Object obj;
        JSONObject jSONObject2 = null;
        if (hVar.f28947d != null) {
            str = hVar.f28947d.optString(C42311c.f106865i);
        } else {
            str = null;
        }
        if (hVar.f28947d != null) {
            obj = hVar.f28947d.optString("type");
        } else {
            obj = null;
        }
        if ("live_room".equals(obj)) {
            if (hVar.f28947d != null) {
                jSONObject2 = hVar.f28947d.optJSONObject("url_extra");
            }
            HashMap hashMap = new HashMap();
            if (jSONObject2 != null) {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    Object obj2 = jSONObject2.get(str2);
                    if ((obj2 instanceof Boolean) || (obj2 instanceof Byte) || (obj2 instanceof Character) || (obj2 instanceof Double) || (obj2 instanceof Float) || (obj2 instanceof Integer) || (obj2 instanceof Long) || (obj2 instanceof Short) || (obj2 instanceof String)) {
                        hashMap.put(str2, String.valueOf(obj2));
                    }
                }
            }
            Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
            if (!(currentRoom == null || currentRoom.getShareUrl() == null)) {
                Builder buildUpon = Uri.parse(currentRoom.getShareUrl()).buildUpon();
                for (Entry entry : hashMap.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                TTLiveSDKContext.getHostService().mo10312e().mo10342a(buildUpon.toString()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C4775b<Object>(this, str), C4776c.f12990a);
            }
            return;
        }
        Context context = this.f12986a;
        int i = 0;
        if (context != null) {
            C9369a.m18549a(context, "", str);
            i = 1;
        }
        jSONObject.put("code", i);
    }
}
