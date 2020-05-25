package com.p683ss.ugc.live.p2595a.p2596a.p2597a;

import android.content.Context;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.a.a */
public final class C51558a implements C51559b {

    /* renamed from: a */
    private Context f128808a;

    /* renamed from: b */
    private String f128809b = this.f128808a.getDir("gift_resource", 0).getAbsolutePath();

    public C51558a(Context context) {
        this.f128808a = context;
    }

    /* renamed from: a */
    public final String mo13424a(C51568c cVar) {
        StringBuilder sb = new StringBuilder(this.f128809b);
        sb.append(File.separator);
        sb.append(cVar.f128817a);
        sb.append(File.separator);
        sb.append(cVar.f128820d);
        sb.append(File.separator);
        return sb.toString();
    }
}
