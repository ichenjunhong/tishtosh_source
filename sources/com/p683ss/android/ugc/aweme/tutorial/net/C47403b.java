package com.p683ss.android.ugc.aweme.tutorial.net;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.net.b */
public final class C47403b {

    /* renamed from: a */
    public static final C47403b f119622a = new C47403b();

    /* renamed from: b */
    private static final String f119623b;

    private C47403b() {
    }

    static {
        String absolutePath = new File(C43307ea.f109491d, "tutorial").getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "File(ShortVideoConfig.sD… \"tutorial\").absolutePath");
        f119623b = absolutePath;
    }

    /* renamed from: a */
    static String m102778a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(f119623b);
        sb.append(File.separator);
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo94686a(C47378e eVar, int i, int i2, int i3) {
        C52711k.m112240b(eVar, "tutorialList");
        File file = new File(m102778a(i, i2, i3));
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            C39629l.m88232a().mo58566D().mo34887a((Object) eVar, (Appendable) fileWriter);
            fileWriter.flush();
        } catch (IOException unused) {
        }
    }
}
