package com.p683ss.android.ugc.aweme.p1445bp.p1449d;

import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23892a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import java.io.File;
import java.util.Iterator;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52775l;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bp.d.a */
public final class C23888a implements C23936c {

    /* renamed from: a */
    public static final C23889a f63556a = new C23889a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.d.a$a */
    public static final class C23889a {
        private C23889a() {
        }

        public /* synthetic */ C23889a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final File mo49496b(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        File file = new File(str);
        m58600a(file);
        return file;
    }

    /* renamed from: a */
    public final String mo49495a(String str) {
        String str2;
        boolean z;
        C23882b bVar = C23882b.RESOURCE;
        C52711k.m112240b(bVar, "type");
        switch (C23890b.f63558b[bVar.ordinal()]) {
            case 1:
                str2 = "cache";
                break;
            case 2:
                str2 = "resources";
                break;
            case 3:
                str2 = "draft";
                break;
            default:
                throw new C52775l();
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(C43308eb.f109491d);
            sb.append("shortvideo/");
            sb.append(str2);
            sb.append('/');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C43308eb.f109491d);
        sb2.append("shortvideo/");
        sb2.append(str2);
        sb2.append('/');
        sb2.append(str);
        sb2.append('/');
        return sb2.toString();
    }

    /* renamed from: a */
    private static boolean m58600a(File file) {
        String str;
        C52711k.m112240b(file, "file");
        boolean z = true;
        if (!C23908c.f63580a.mo49511b()) {
            return true;
        }
        String path = file.getPath();
        C52711k.m112236a((Object) path, LeakCanaryFileProvider.f132050j);
        String str2 = C43308eb.f109491d;
        C52711k.m112236a((Object) str2, "ShortVideoConfig2.sDir");
        if (!C52830p.m112411b(path, str2, false, 2, null)) {
            return true;
        }
        Iterator it = C23892a.f63560a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                C52575l.m112100b();
            }
            if (C52830p.m112411b(path, (String) next, false, 2, null)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            z = false;
        }
        if (!z) {
            String parent = file.getParent();
            C52711k.m112236a((Object) parent, "file.parent");
            if (C52830p.m112413c(parent, "/", false, 2, null)) {
                str = file.getParent();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(file.getParent());
                sb.append("/");
                str = sb.toString();
            }
            z = C52711k.m112239a((Object) str, (Object) C43308eb.f109491d);
        }
        if (!z) {
            C39629l.m88232a().mo58577h().mo49486a().mo49525a(file);
        }
        return z;
    }

    /* renamed from: a */
    public final File mo49494a(File file, String str) {
        C52711k.m112240b(file, "parent");
        C52711k.m112240b(str, "child");
        File file2 = new File(file, str);
        m58600a(file2);
        return file2;
    }
}
