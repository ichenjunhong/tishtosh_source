package com.p683ss.android.ugc.aweme.lancet.p1152b;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.lancet.b.a */
public final class C18973a {

    /* renamed from: a */
    public static ArrayList<String> f52276a;

    /* renamed from: a */
    private static boolean m46143a() {
        if (!m46146b() || !C22574a.m55738f().f60703d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m46146b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f52276a = arrayList;
        arrayList.add("effect");
        f52276a.add("ttmain");
        f52276a.add("ttvebase");
        f52276a.add("ttvideoeditor");
        f52276a.add("ttvideorecorder");
        f52276a.add("x264");
        f52276a.add("downloadable_model_support");
        f52276a.add("fdc-aac");
    }

    /* renamed from: b */
    private static String m46145b(String str) {
        StringBuilder sb = new StringBuilder("load_so_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m46144a(String str) {
        if (!f52276a.contains(str) || Keva.getRepo("DECOMPRESS_GRAY").getInt("KEY", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m46141a(long j, String str) {
        if (m46143a()) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            C22574a.m55738f().mo46924c(m46145b(str), uptimeMillis, false);
            C22574a.m55738f().mo46915a("load_so_total", uptimeMillis);
        }
    }

    /* renamed from: a */
    public static void m46142a(String str, int i) {
        C23569o.m57776a("so_decompress_load_rate", 1, C23088c.m56631a().mo47824a("soName", str).mo47822a("errorCode", Integer.valueOf(i)).mo47824a("errorMsg", Log.getStackTraceString(new RuntimeException("Wrong lib path"))).mo47825b());
    }
}
