package com.bytedance.android.livesdk.gift.assets;

import android.content.Context;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2597a.C51559b;
import java.io.File;

/* renamed from: com.bytedance.android.livesdk.gift.assets.a */
public final class C7201a implements C51559b {

    /* renamed from: a */
    private Context f19569a;

    /* renamed from: b */
    private String f19570b = this.f19569a.getDir("assets", 0).getAbsolutePath();

    public C7201a(Context context) {
        this.f19569a = context;
    }

    /* renamed from: a */
    public final String mo13424a(C51568c cVar) {
        StringBuilder sb = new StringBuilder(this.f19570b);
        sb.append(File.separator);
        sb.append(cVar.f128820d);
        sb.append(File.separator);
        return sb.toString();
    }
}
