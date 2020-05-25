package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.poi.preview.C39159b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GalleryPreviewMethod */
public final class GalleryPreviewMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24152a f64071b = new C24152a(null);

    /* renamed from: c */
    private final String f64072c = "gallery";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GalleryPreviewMethod$a */
    public static final class C24152a {
        private C24152a() {
        }

        public /* synthetic */ C24152a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64072c;
    }

    public GalleryPreviewMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        JSONObject jSONObject2 = jSONObject;
        C24112a aVar2 = aVar;
        C52711k.m112240b(jSONObject2, "params");
        C52711k.m112240b(aVar2, "iReturn");
        try {
            JSONArray optJSONArray = jSONObject2.optJSONArray("images");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("description_list");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList2.add(optString2);
                    }
                }
            }
            int optInt = jSONObject2.optInt("index", 0);
            int optInt2 = jSONObject2.optInt("needDownload", 0);
            if (arrayList.size() != 0) {
                Context e = mo18743e();
                if (e != null) {
                    boolean optBoolean = jSONObject2.optBoolean("loop");
                    C39159b a = C39159b.m87005a();
                    List list = arrayList;
                    List list2 = arrayList;
                    List list3 = arrayList2;
                    if (optInt2 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a.mo79800a(e, list, list2, list3, z, null, optBoolean, optBoolean);
                    a.mo79801a("tag_gallery", optInt, arrayList.size());
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("code", 1);
                    aVar2.mo49913a(jSONObject3);
                }
            }
        } catch (Exception e2) {
            aVar2.mo49910a(0, e2.getMessage());
        }
    }
}
