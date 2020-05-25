package com.bytedance.p702im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.utils.a */
public final class C11462a {
    /* renamed from: a */
    public static C11207p m23439a(C11207p pVar) {
        JSONObject jSONObject;
        if (pVar == null || pVar.getAttachments() == null || pVar.getAttachments().isEmpty()) {
            return pVar;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (C11178a aVar : pVar.getAttachments()) {
            if (!TextUtils.isEmpty(aVar.getDisplayType())) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("length", aVar.getLength());
                    jSONObject3.put("md5", aVar.getHash());
                    jSONObject3.put("mime", aVar.getMimeType());
                    jSONObject3.put("remoteURL", aVar.getRemoteUrl());
                    jSONObject3.put("displayType", aVar.getDisplayType());
                    jSONObject3.put("type", aVar.getType());
                    jSONObject3.put("ext", C11464c.m23461b(aVar.getExt()));
                    jSONObject2.put(aVar.getDisplayType(), jSONObject3);
                } catch (JSONException unused) {
                }
            }
        }
        try {
            if (TextUtils.isEmpty(pVar.getContent())) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(pVar.getContent());
            }
            jSONObject.put("__files", jSONObject2);
            pVar.setContent(jSONObject.toString());
        } catch (JSONException unused2) {
        }
        return pVar;
    }

    /* renamed from: b */
    public static C11207p m23440b(C11207p pVar) {
        if (TextUtils.isEmpty(pVar.getContent())) {
            return pVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = new JSONObject(pVar.getContent()).optJSONObject("__files");
            if (optJSONObject == null) {
                return pVar;
            }
            Iterator keys = optJSONObject.keys();
            int i = 0;
            while (keys.hasNext()) {
                String str = (String) keys.next();
                JSONObject jSONObject = optJSONObject.getJSONObject(str);
                C11178a aVar = new C11178a();
                aVar.setMsgUuid(pVar.getUuid());
                aVar.setDisplayType(str);
                aVar.setLength(jSONObject.optLong("length"));
                aVar.setHash(jSONObject.optString("md5"));
                aVar.setMimeType(jSONObject.optString("mime"));
                aVar.setRemoteUrl(jSONObject.optString("remoteURL"));
                aVar.setType(jSONObject.optString("type"));
                aVar.setIndex(i);
                aVar.setStatus(1);
                aVar.setExt(C11464c.m23459a(optJSONObject.optJSONObject("ext")));
                arrayList.add(aVar);
                i++;
            }
            if (!arrayList.isEmpty()) {
                pVar.setAttachments(arrayList);
            }
            return pVar;
        } catch (JSONException unused) {
        }
    }
}
