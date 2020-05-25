package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4846au.C4847a;
import com.bytedance.android.livesdk.browser.p294h.C4757b;
import com.bytedance.android.livesdk.p271ac.C4519a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b.C8635a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.k */
public final class C4791k implements C10762d {

    /* renamed from: a */
    private WeakReference<Context> f13009a;

    /* renamed from: b */
    private WeakReference<C4847a> f13010b;

    public C4791k(WeakReference<Context> weakReference, C4847a aVar) {
        this.f13009a = weakReference;
        this.f13010b = new WeakReference<>(aVar);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        JSONObject jSONObject2 = hVar.f28947d;
        if (jSONObject2 != null) {
            jSONObject2.optString("title");
            jSONObject2.optString("desc");
            jSONObject2.optString("image");
            jSONObject2.optString("url");
            String optString = jSONObject2.optString("platform");
            String optString2 = jSONObject2.optString("type");
            C4757b bVar = null;
            if (this.f13009a == null) {
                context = null;
            } else {
                context = (Context) this.f13009a.get();
            }
            if (!C9431p.m18664a(optString) && context != null) {
                int i = 0;
                if ("live_room".equals(optString2)) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("url_extra");
                    HashMap hashMap = new HashMap();
                    if (optJSONObject != null) {
                        Iterator keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String str = (String) keys.next();
                            Object obj = optJSONObject.get(str);
                            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                hashMap.put(str, String.valueOf(obj));
                            }
                        }
                    }
                    Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                    if (currentRoom == null || currentRoom.getShareUrl() == null) {
                        jSONObject.put("code", 0);
                        return;
                    }
                    Builder buildUpon = Uri.parse(currentRoom.getShareUrl()).buildUpon();
                    for (Entry entry : hashMap.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                    TTLiveSDKContext.getHostService().mo10312e().mo10341a((Activity) context, C8633b.m17040a(currentRoom).mo15121f(optString).mo15114a((Map<String, String>) hashMap).mo15119d(buildUpon.toString()).mo15116a());
                    jSONObject.put("code", 1);
                } else if ("open_platform".equals(optString2)) {
                    C4519a e = TTLiveSDKContext.getHostService().mo10312e();
                    Activity activity = (Activity) context;
                    C8635a f = C8633b.m17039a().mo15121f(optString);
                    f.f23651D = true;
                    e.mo10341a(activity, f.mo15116a());
                    jSONObject.put("code", 1);
                } else {
                    if (this.f13010b.get() != null) {
                        bVar = ((C4847a) this.f13010b.get()).mo10557d();
                    }
                    if (!(bVar == null || bVar.f12959d == null)) {
                        Builder buildUpon2 = Uri.parse(bVar.f12959d).buildUpon();
                        buildUpon2.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
                        TTLiveSDKContext.getHostService().mo10312e().mo10341a((Activity) context, C8633b.m17039a().mo15121f(optString).mo15113a(bVar.f12956a).mo15117b(bVar.f12957b).mo15118c(bVar.f12958c).mo15119d(buildUpon2.toString()).mo15116a());
                        i = 1;
                    }
                    jSONObject.put("code", i);
                }
            }
        }
    }
}
