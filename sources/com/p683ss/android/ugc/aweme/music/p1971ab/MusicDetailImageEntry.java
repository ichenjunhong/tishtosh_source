package com.p683ss.android.ugc.aweme.music.p1971ab;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.music.ab.MusicDetailImageEntry */
public final class MusicDetailImageEntry {
    @C10179b
    private static final String DEFAULT = "";
    public static final MusicDetailImageEntry INSTANCE = new MusicDetailImageEntry();

    private MusicDetailImageEntry() {
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }

    public static final String get() {
        try {
            String a = C10193n.m20607a().mo18203a(MusicDetailImageEntry.class, "music_detail_image_entry", C10181b.m20511a().mo18175c().getMusicDetailImageEntry(), "");
            C52711k.m112236a((Object) a, "SettingsManager.getInsta…ilImageEntry::class.java)");
            return a;
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
