package com.p683ss.ttm.player;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;

/* renamed from: com.ss.ttm.player.MediaCodecUtils */
public class MediaCodecUtils {
    private static boolean sHasLoadCodecLib;

    /* renamed from: com.ss.ttm.player.MediaCodecUtils$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C18973a.m46141a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    public static native long createAJMediaCodecer(int i, int i2);

    public static final boolean supportAJMediaCodec() {
        if (VERSION.SDK_INT > 16) {
            return true;
        }
        return false;
    }

    public static final boolean supportANMediaCodec() {
        if (VERSION.SDK_INT > 21) {
            return true;
        }
        return false;
    }

    public static final boolean loadMediaCodecLibrary() {
        if (sHasLoadCodecLib) {
            return true;
        }
        if (!supportANMediaCodec()) {
            return false;
        }
        try {
            if (TTPlayerConfiger.getValue(3, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory());
                sb.append("/ttplayer/libttmplayer_mc.so");
                File file = new File(sb.toString());
                if (file.exists()) {
                    _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(file.getAbsolutePath());
                    return true;
                }
            }
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttmplayer_mc");
            sHasLoadCodecLib = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final long createMediaCodecer(int i, int i2) {
        if (supportAJMediaCodec()) {
            try {
                return createAJMediaCodecer(i, i2);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
