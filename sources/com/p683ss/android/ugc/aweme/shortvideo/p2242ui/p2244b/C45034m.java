package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45416bb;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Iterator;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.m */
final /* synthetic */ class C45034m implements Runnable {

    /* renamed from: a */
    private final C45017b f114069a;

    /* renamed from: b */
    private final File f114070b;

    /* renamed from: c */
    private final int f114071c;

    C45034m(C45017b bVar, File file, int i) {
        this.f114069a = bVar;
        this.f114070b = file;
        this.f114071c = i;
    }

    public final void run() {
        C45017b bVar = this.f114069a;
        File file = this.f114070b;
        C23088c a = C23088c.m56631a().mo47822a("error_code", Integer.valueOf(this.f114071c));
        a.mo47822a("segment_count", Integer.valueOf(bVar.f114042t.mo86375p().size()));
        StringBuilder sb = new StringBuilder();
        Iterator it = bVar.f114042t.mo86375p().iterator();
        while (it.hasNext()) {
            sb.append(((TimeSpeedModelExtension) it.next()).getDuration());
            sb.append(",");
        }
        if (sb.length() == 0) {
            a.mo47824a("video_durations", "");
        } else {
            a.mo47824a("video_durations", sb.substring(0, sb.length() - 1));
        }
        a.mo47823a("total_duration", Long.valueOf(bVar.f114042t.f107120m));
        a.mo47824a(LeakCanaryFileProvider.f132050j, file.getPath());
        if (file.isDirectory()) {
            a.mo47824a("file_path", C45416bb.m98985a(file.list(), ","));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f114038p.getIntent().getIntExtra("record_from", 0));
        a.mo47824a("enter_from", sb2.toString());
        JSONObject b = a.mo47825b();
        C23569o.m57779a("aweme_draft_edit_error", b);
        bVar.mo91394aq();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b.toString());
        sb3.append(" RestoreType: ");
        sb3.append(bVar.f114042t.f107101b);
        C45407ay.m98968a(sb3.toString());
        if (bVar.f114042t.f107101b == 1) {
            C10691a.m21542b(bVar.f114038p.getApplicationContext(), (int) R.string.fbc).mo19066a();
            bVar.mo91391an();
        }
    }
}
