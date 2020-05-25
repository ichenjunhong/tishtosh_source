package com.p683ss.android.ugc.aweme.p2391v;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.v.b */
public final class C47963b {

    /* renamed from: a */
    public static final C47963b f120576a = new C47963b();

    private C47963b() {
    }

    /* renamed from: a */
    public static void m103774a(int i) {
        StringBuilder sb = new StringBuilder("So decompress: in CompressedLibraryLoader : Start Decompress, decompress type: ");
        sb.append(i);
        C45407ay.m98968a(sb.toString());
        C23569o.m57776a("real_decompress_abtest", i, (JSONObject) null);
        C26890h.m65011a("start_decompress", C23089d.m56640a().mo47826a("type", i).f61491a);
    }
}
