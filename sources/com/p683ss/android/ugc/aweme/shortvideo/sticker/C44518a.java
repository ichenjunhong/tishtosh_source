package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a */
public final class C44518a {
    /* renamed from: e */
    public static boolean m97421e(Effect effect) {
        if (effect == null) {
            return false;
        }
        return m97416a(effect.getSdkExtra());
    }

    /* renamed from: a */
    public static boolean m97416a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return "effectControlGame".equals(new JSONObject(str).optString("type"));
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static int m97417b(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("lock_type")) {
            return -1;
        }
        try {
            return new JSONObject(str).getInt("lock_type");
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m97419c(Effect effect) {
        if (effect == null) {
            return false;
        }
        String extra = effect.getExtra();
        if (extra != null && m97417b(extra) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m97420d(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m97415a(Effect effect) {
        if (effect == null) {
            return false;
        }
        String extra = effect.getExtra();
        if (TextUtils.isEmpty(extra) || !extra.contains("music_is_force_bind")) {
            return false;
        }
        try {
            return new JSONObject(extra).optBoolean("music_is_force_bind");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m97418b(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String contains : effect.getTags()) {
            if (contains.contains("lock")) {
                return true;
            }
        }
        return m97419c(effect);
    }

    /* renamed from: f */
    public static boolean m97422f(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        if (effect.getTags().contains("instrument") || effect.getTypes().contains("Instrument")) {
            return true;
        }
        return false;
    }
}
