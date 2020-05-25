package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.app.Application;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.i */
public final class C43257i {

    /* renamed from: a */
    public static final C43257i f109380a = new C43257i();

    private C43257i() {
    }

    /* renamed from: b */
    public final boolean mo87936b() {
        if (!C48016e.m103944b(m94889c()) || !Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static String m94889c() {
        StringBuilder sb = new StringBuilder();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("duet");
        sb.append(File.separator);
        sb.append("default");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo87935a() {
        if (Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) {
            return true;
        }
        File file = new File(m94889c());
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        try {
            InputStream open = b.getAssets().open("duet_default_layout.zip");
            C52711k.m112236a((Object) open, "assetManager.open(DUET_LAYOUT_NAME)");
            String absolutePath = file.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath, "file.absolutePath");
            C50205i.m108369a(open, absolutePath);
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", true);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
