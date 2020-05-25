package com.p683ss.android.ugc.aweme.photomovie.edit.music;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.p2425e.C48551b;
import com.p683ss.android.ugc.p2425e.C48557d;
import java.io.File;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.a */
public final class C38781a {

    /* renamed from: a */
    public String f98684a;

    /* renamed from: b */
    public String f98685b;

    /* renamed from: c */
    public C42482c f98686c;

    /* renamed from: d */
    public int f98687d;

    /* renamed from: e */
    public boolean f98688e;

    C38781a(C42482c cVar) {
        String str;
        this.f98686c = cVar;
        if (cVar.getPlayUrl() != null && !C9376b.m18558a((Collection<T>) cVar.getPlayUrl().getUrlList())) {
            this.f98685b = (String) cVar.getPlayUrl().getUrlList().get(0);
        }
        String b = C48557d.m105031a().mo96062b();
        if (b.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(C48551b.m105020b(this.f98685b));
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            sb2.append(File.separator);
            sb2.append(C48551b.m105020b(this.f98685b));
            str = sb2.toString();
        }
        this.f98684a = str;
        if (C48016e.m103944b(this.f98684a)) {
            this.f98687d = 1;
        } else {
            this.f98687d = 2;
        }
    }
}
