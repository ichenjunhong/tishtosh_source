package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.m */
public final class C43266m {

    /* renamed from: a */
    public static final C43266m f109404a = new C43266m();

    private C43266m() {
    }

    /* renamed from: a */
    private static String m94914a(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        try {
            str2 = new JSONObject(str).getString("duet_layout_mode");
        } catch (JSONException unused) {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: a */
    public final C43245e mo87943a(Effect effect) {
        if (effect == null) {
            return null;
        }
        String a = m94914a(effect.getExtra());
        if (a == null) {
            return null;
        }
        try {
            return (C43245e) new C17971f().mo34884a(a, C43245e.class);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo87944a(Effect effect, int i) {
        C52711k.m112240b(effect, "effect");
        C43245e a = mo87943a(effect);
        if (a == null) {
            return "";
        }
        if (a.f109358d.size() <= i) {
            return "";
        }
        return (String) a.f109358d.get(i);
    }
}
