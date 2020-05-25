package com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b;

import android.app.Application;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.effectplatform.C29279y;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.a */
public final class C43440a {

    /* renamed from: a */
    public static String f109826a = "";

    /* renamed from: b */
    public static final String f109827b;

    /* renamed from: c */
    public static final C43441a f109828c = new C43441a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.a$a */
    public static final class C43441a {
        private C43441a() {
        }

        /* renamed from: a */
        public static boolean m95214a() {
            if (!m95215b() || C39629l.m88232a().mo58583n().mo83104b(C40790a.LightEnhanceBlackList) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m95215b() {
            if (C39629l.m88232a().mo58583n().mo83104b(C40790a.ShowAutoImproveButtonInEditPage) != 1 || C39629l.m88232a().mo58583n().mo83104b(C40790a.EnableOpenGl3) != 1 || !C29279y.m69004a("hdrnet") || !C29279y.m69004a("HdrColorCard") || VERSION.SDK_INT <= 20) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static boolean m95216c() {
            boolean exists = new File(C43440a.f109827b, "content.json").exists();
            C39666o oVar = (C39666o) C26888e.m65000a(C39629l.m88233b(), C39666o.class);
            if (oVar.mo48458c(-1) == 3 && exists) {
                return true;
            }
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            try {
                InputStream open = b.getAssets().open("HDR_Filter.zip");
                C52711k.m112236a((Object) open, "assetManager.open(\"HDR_Filter.zip\")");
                C50205i.m108369a(open, C43440a.f109827b);
                oVar.mo48456b(3);
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public /* synthetic */ C43441a(C52707g gVar) {
            this();
        }
    }

    static {
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        String absolutePath = new File(b.getFilesDir(), "hdr_filter").getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "File(CameraClient.getApp…hdr_filter\").absolutePath");
        f109827b = absolutePath;
        File file = new File(f109827b);
        if (!file.exists()) {
            file.mkdirs();
        }
        C43441a.m95216c();
    }
}
