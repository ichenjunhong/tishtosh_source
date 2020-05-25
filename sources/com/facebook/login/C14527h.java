package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.facebook.login.h */
final class C14527h {
    /* renamed from: a */
    static boolean m29750a(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, Intent intent, int i) {
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    Set<String> keySet = extras.keySet();
                    if (keySet != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (String str : keySet) {
                            Object obj = extras.get(str);
                            if (obj != null) {
                                jSONObject.put(str, obj.toString());
                            }
                        }
                        Keva.getRepo("fb_login_failure").storeString("fb_login_failure", jSONObject.toString());
                    }
                }
            } catch (Exception unused) {
            }
        }
        return nativeAppLoginMethodHandler.mo26720b(intent, i);
    }
}
