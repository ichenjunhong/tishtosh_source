package com.p683ss.android.ugc.aweme.live.jsb;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.live.jsb.LiveMethod */
public final class LiveMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private final WeakReference<Context> f92484a;

    public LiveMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        super(aVar);
        this.f92484a = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("room_id_list");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(Long.valueOf(Long.parseLong(jSONArray.get(i).toString())));
                }
                String string = jSONObject.getString("current_room_id");
                C52711k.m112236a((Object) string, "jsonObj.getString(\"current_room_id\")");
                long parseLong = Long.parseLong(string);
                String string2 = jSONObject.getString("enter_from");
                ILiveOuterService a = C36173w.m81665a();
                C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
                a.getLiveWatcherUtils().mo70088a((Context) this.f92484a.get(), parseLong, new Bundle(), string2, arrayList);
                aVar.mo60039a((Object) null);
            } catch (Exception e) {
                aVar.mo60038a(-1, e.getMessage());
            }
        }
    }
}
