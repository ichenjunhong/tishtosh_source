package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.vesdk.VEListener.C50542f;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.f */
final /* synthetic */ class C45027f implements C50542f {

    /* renamed from: a */
    private final C45017b f114059a;

    /* renamed from: b */
    private final List f114060b;

    /* renamed from: c */
    private final File f114061c;

    C45027f(C45017b bVar, List list, File file) {
        this.f114059a = bVar;
        this.f114060b = list;
        this.f114061c = file;
    }

    /* renamed from: a */
    public final void mo43336a(int i) {
        C45017b bVar = this.f114059a;
        List list = this.f114060b;
        File file = this.f114061c;
        StringBuilder sb = new StringBuilder("Restore the segments");
        sb.append(list.size());
        sb.append(" dir: ");
        sb.append(file.getPath());
        sb.append("  res: ");
        sb.append(i);
        C45407ay.m98968a(sb.toString());
        if (i != 0) {
            bVar.f114038p.runOnUiThread(new C45034m(bVar, file, i));
        }
    }
}
