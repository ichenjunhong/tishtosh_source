package com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2069a;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.photo.p2045a.C38653a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b.a.c */
final /* synthetic */ class C39164c implements Callable {

    /* renamed from: a */
    private final C39161a f99904a;

    /* renamed from: b */
    private final String f99905b;

    C39164c(C39161a aVar, String str) {
        this.f99904a = aVar;
        this.f99905b = str;
    }

    public final Object call() {
        C39161a aVar = this.f99904a;
        String str = this.f99905b;
        String a = C23967a.m58772a(C11010c.m22280a());
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()));
        sb.append(".png");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a);
        sb3.append(File.separator);
        sb3.append(sb2);
        String sb4 = sb3.toString();
        C48016e.m103948c(C23515d.m57665a(str), sb4);
        C38653a.m85993a(aVar.f99897b.getActivityContext(), sb4);
        return null;
    }
}
