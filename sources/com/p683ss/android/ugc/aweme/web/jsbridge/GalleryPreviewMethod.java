package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.poi.preview.C39159b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.GalleryPreviewMethod */
public class GalleryPreviewMethod extends BaseCommonJavaMethod {
    public GalleryPreviewMethod() {
    }

    public GalleryPreviewMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("images");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList.add(optString);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("description_list");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        String optString2 = optJSONArray2.optString(i2);
                        if (!TextUtils.isEmpty(optString2)) {
                            arrayList2.add(optString2);
                        }
                    }
                }
                int optInt = jSONObject.optInt("index", 0);
                int optInt2 = jSONObject.optInt("needDownload", 0);
                if (arrayList.size() != 0) {
                    Context context = (Context) this.f77793e.get();
                    if (context != null) {
                        boolean optBoolean = jSONObject.optBoolean("loop");
                        C39159b a = C39159b.m87005a();
                        if (optInt2 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        a.mo79800a(context, arrayList, arrayList, arrayList2, z, null, optBoolean, optBoolean);
                        a.mo79801a("tag_gallery", optInt, arrayList.size());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
