package com.bytedance.netecho;

import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

final /* synthetic */ class NetechoConfig$loadLibrary$1 extends C52710j implements C52671b<String, C52860x> {
    public static final NetechoConfig$loadLibrary$1 INSTANCE = new NetechoConfig$loadLibrary$1();

    class _lancet {
        private _lancet() {
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

    NetechoConfig$loadLibrary$1() {
        super(1);
    }

    public final String getName() {
        return "loadLibrary";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(System.class);
    }

    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C52860x.f131107a;
    }

    public final void invoke(String str) {
        C52711k.m112240b(str, "p1");
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
    }
}
