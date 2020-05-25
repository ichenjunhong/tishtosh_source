package com.p683ss.android.ugc.aweme.infoSticker;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ac */
public final class C35556ac {
    /* renamed from: a */
    public static boolean m80347a(Effect effect) {
        if (effect.getTags().contains("poisticker")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m80348b(Effect effect) {
        if (effect.getTags().contains("pollsticker")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m80349c(Effect effect) {
        if (effect.getTags().contains("LyricsSticker")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m80350d(Effect effect) {
        return effect.getTags().contains("donation");
    }
}
