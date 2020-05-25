package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39118b;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenMapMethod */
public final class OpenMapMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29823a f77872a = new C29823a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenMapMethod$a */
    public static final class C29823a {
        private C29823a() {
        }

        public /* synthetic */ C29823a(C52707g gVar) {
            this();
        }
    }

    public OpenMapMethod() {
        this(null, 1, null);
    }

    public OpenMapMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        if (jSONObject != null) {
            if (!jSONObject.has("lat") || !jSONObject.has("lon")) {
                z = false;
            } else {
                z = true;
            }
            Context context = null;
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString(LeakCanaryFileProvider.f132049i);
                String optString2 = jSONObject.optString("address");
                String optString3 = jSONObject.optString("lat");
                String optString4 = jSONObject.optString("lon");
                String optString5 = jSONObject.optString("city_code");
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.poiName = optString;
                C39118b bVar = new C39118b();
                bVar.setCityCode(optString5);
                bVar.setSimpleAddr(optString2);
                poiStruct.address = bVar;
                poiStruct.poiLatitude = optString3;
                poiStruct.poiLongitude = optString4;
                IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
                if (this.f77793e != null) {
                    context = (Context) this.f77793e.get();
                }
                createIPoiServicebyMonsterPlugin.launchActivity(context, poiStruct, "", "", true, 0);
            }
        }
    }

    private /* synthetic */ OpenMapMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
