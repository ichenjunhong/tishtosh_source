package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Application;
import com.bytedance.common.utility.p524d.C9398b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a */
public final class C44938a {

    /* renamed from: a */
    public static final C44938a f113830a = new C44938a();

    /* renamed from: b */
    private static boolean f113831b = true;

    private C44938a() {
    }

    /* renamed from: a */
    public final void mo91231a() {
        long j;
        long j2;
        long j3;
        if (f113831b) {
            C23936c c = C39629l.m88232a().mo58577h().mo49489c();
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            File filesDir = b.getFilesDir();
            C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
            File a = c.mo49494a(filesDir, "effect");
            C23936c c2 = C39629l.m88232a().mo58577h().mo49489c();
            String str = C43308eb.f109504q;
            C52711k.m112236a((Object) str, "ShortVideoConfig2.sFilterDir");
            File b2 = c2.mo49496b(str);
            File b3 = C39629l.m88232a().mo58577h().mo49489c().mo49496b(C39630m.m88234a().mo58606d().mo80661a().mo80665b());
            if (a.exists()) {
                j = m98277a(a);
            } else {
                if (b2.exists()) {
                    j2 = m98277a(b2);
                } else {
                    if (b3.exists()) {
                        j3 = m98277a(b3);
                    } else {
                        j3 = 0;
                    }
                    j2 = j3 + 0;
                }
                j = j2 + 0;
            }
            C47702b.f120193a.mo94984a("tool_performance_effect_storage_space", C23089d.m56640a().mo47827a("storage_size", j).f61491a);
        }
    }

    /* renamed from: a */
    private static long m98277a(File file) {
        return C9398b.m18589c(file.getAbsolutePath());
    }
}
