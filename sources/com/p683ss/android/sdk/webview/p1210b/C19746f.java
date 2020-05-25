package com.p683ss.android.sdk.webview.p1210b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.sdk.webview.p1209a.C19737b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.f */
public class C19746f implements C10762d {
    protected WeakReference<Context> mContextRef;

    public C19746f(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
    }

    protected static Activity contextToActivity(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public void open(JSONObject jSONObject) {
        Context context;
        try {
            Activity activity = null;
            if (this.mContextRef != null) {
                context = (Context) this.mContextRef.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            if (activity == null) {
                activity = contextToActivity(context);
            }
            if (activity != null && ((AbsActivity) activity).isActive()) {
                String optString = jSONObject.optString("type");
                if (!C9431p.m18664a(optString) && optString.indexOf(58) < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C19737b.m48249a().getSSLocalScheme());
                    sb.append("://");
                    sb.append(optString);
                    C18922i iVar = new C18922i(sb.toString());
                    generateUrl(jSONObject.optJSONObject("args"), iVar);
                    C19737b.m48249a().startAdsAppActivity(activity, iVar.mo38774a());
                }
            }
        } catch (Exception unused) {
        }
    }

    public void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        open(hVar.f28947d);
        jSONObject.put("code", 1);
    }

    private void generateUrl(JSONObject jSONObject, C18922i iVar) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof Integer) {
                    iVar.mo38776a(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    iVar.mo38777a(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    iVar.mo38775a(str, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    iVar.mo38778a(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    iVar.mo38778a(str, obj.toString());
                } else if (obj instanceof JSONObject) {
                    generateUrl((JSONObject) obj, iVar);
                }
            }
        }
    }
}
