package com.p683ss.android.ugc.aweme.music.p1977e;

import android.media.MediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.music.e.b */
public class C37377b {

    /* renamed from: a */
    private static volatile MediaPlayer f95365a;

    /* renamed from: b */
    public static void m83690b() {
        if (f95365a != null) {
            f95365a.release();
            f95365a = null;
        }
    }

    /* renamed from: a */
    public static MediaPlayer m83689a() {
        if (f95365a == null) {
            synchronized (C37377b.class) {
                if (f95365a == null) {
                    f95365a = new MediaPlayer();
                }
            }
        }
        return f95365a;
    }
}
