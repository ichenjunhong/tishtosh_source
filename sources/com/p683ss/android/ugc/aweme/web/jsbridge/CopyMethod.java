package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CopyMethod */
public class CopyMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    protected WeakReference<Context> f121508a;

    public CopyMethod(C10757a aVar, WeakReference<Context> weakReference) {
        super(aVar);
        this.f121508a = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.has("args")) {
            jSONObject2 = jSONObject.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null || !jSONObject2.has(C42311c.f106865i)) {
            aVar.mo60038a(0, "illegal args");
        } else {
            String string = jSONObject2.getString(C42311c.f106865i);
            Context context = (Context) this.f121508a.get();
            if (TextUtils.isEmpty(string) || context == null) {
                aVar.mo60038a(0, "illegal args");
            } else {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                    ClipData newPlainText = ClipData.newPlainText(string, string);
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(newPlainText);
                        StringBuilder sb = new StringBuilder("copy content=");
                        sb.append(string);
                        aVar.mo60039a((Object) sb.toString());
                    } else {
                        aVar.mo60038a(0, "clip board manager not found");
                    }
                } catch (Exception e) {
                    aVar.mo60038a(0, e.getMessage());
                }
            }
        }
    }
}
