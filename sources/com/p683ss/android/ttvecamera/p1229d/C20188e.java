package com.p683ss.android.ttvecamera.p1229d;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import com.p683ss.android.ttvecamera.C20296p;
import com.p907f.p908a.C13486b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttvecamera.d.e */
public final class C20188e extends C20186c {

    /* renamed from: d */
    public static final Map<String, String> f55502d = new HashMap<String, String>() {
        {
            put("com.ss.android.ugc.trill", "VdRQAXll2qGqBr3q0pv9fxjKUNSUZE5Au4tXeYAjvegHPG8+QL6PB65CdoZjef9mmWbVU0avYTAujNyKeSbN696+CZwbhwMnT28B8LU0XECzBxuUCrSUIK2DSy8KOLKDgbcseRuqLdEO91Wo70115XKAUOMkMaZosdSVnqhHYP4=");
            put("com.ss.android.ttve.app", "acJhRrV9SGJSFhTPJu53AJUEzAIie4adIn1J3yC+QG5FXX3h/GX7gaeDXRlRMoUa80Jv43LwjuMR47MPdPzldZp6PCPxXNW81maIAc0oebAMT6NgTHf5O8wgkbAZFNilvD70Cjd8YbYfDvSJ5O63V4+VHcNJ/LV3p1id21Z9FLU=");
            put("com.zhiliaoapp.musically", "I1nLPCzgp4J6fBHsdd82IBOcMK+AY67rPqYPuw4WfLYtvifBG+ABEO+Wh3N0t5siZ6dA6ZTdSIBxEZSVZlHRyD7VRaPajn/oghXkdYuDkyzzEexN6BDEXHd+B7aC2yb080U3MSzCDya2wAg6QG2IRYl1TIMlET7EhR9lmQetYdc=");
            put("com.ss.android.ugc.aweme", "V0smG6erGIWwu3z5JaAn4ibfK6iq5uW3qRb+zT6rqgpy8HHYw5TeFOMt2k0cNWuSWv4Rxn1gW+nK5oGMpBwf8nYKppzfrtXQsYgsumcg8yNRVpKZ0WSntuSCCkAtFKcnNx/DoEAjXZuqs5Vzg9VbcOmKwsgsz58eJdXiEMUqoZw=");
        }
    };

    /* renamed from: b */
    public static boolean m49835b(Context context, int i) {
        try {
            C13486b a = C13486b.m27243a();
            String str = ((CameraManager) context.getSystemService("camera")).getCameraIdList()[i];
            String b = a.mo25276b((String) f55502d.get(context.getPackageName()));
            if (b != null && !b.isEmpty()) {
                String b2 = a.mo25275b();
                if (b2 != null && b2.contains(str)) {
                    String c = a.mo25277c(str);
                    if (c != null && !c.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(c);
                        if (1 == jSONObject.optInt("EIS") || 1 == jSONObject.optInt("OIS-Movie")) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            C20296p.m50062c("TECameraOppoProxy", "AntiShake verify cause this exception");
        }
        return false;
    }
}
