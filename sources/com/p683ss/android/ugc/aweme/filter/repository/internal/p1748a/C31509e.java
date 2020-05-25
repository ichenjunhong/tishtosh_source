package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31598n;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31548b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31498k;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.e */
public final class C31509e implements C31597m {

    /* renamed from: a */
    private C31598n f82426a;

    /* renamed from: b */
    private final C31498k f82427b;

    /* renamed from: a */
    public final String mo64403a(int i) {
        return this.f82427b.mo64403a(i);
    }

    /* renamed from: b */
    public final String mo64404b(int i) {
        return this.f82427b.mo64404b(i);
    }

    /* renamed from: c */
    public final String mo64405c(int i) {
        return this.f82427b.mo64405c(i);
    }

    public C31509e(C31498k kVar) {
        C52711k.m112240b(kVar, "filterFileLayout");
        this.f82427b = kVar;
    }

    /* renamed from: a */
    public final void mo64431a(C31598n nVar) {
        C52711k.m112240b(nVar, "observer");
        this.f82426a = nVar;
    }

    /* renamed from: a */
    public final boolean mo64432a(C31493f fVar) {
        C52711k.m112240b(fVar, "filterMeta");
        return m73362f(fVar.f82404a);
    }

    /* renamed from: d */
    public final C31550d mo64433d(int i) {
        String a = C31548b.m73412a(mo64405c(i));
        String b = C31548b.m73413b(a);
        StringBuilder sb = new StringBuilder();
        sb.append(mo64405c(i));
        sb.append("thumbnail.jpg");
        return new C31550d(a, b, sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final boolean mo64434e(int i) {
        boolean z = true;
        if (m73362f(i)) {
            return true;
        }
        String c = mo64405c(i);
        File file = new File(c);
        File file2 = new File(mo64404b(i), mo64403a(i));
        try {
            C50200d.m108339a(c, false);
            C50200d.m108342a(file);
            C50205i.m108365a(file2, file);
            C31598n nVar = this.f82426a;
            if (nVar != null) {
                nVar.mo64476a(i, file2);
            }
            file2.delete();
        } catch (IOException e) {
            C31598n nVar2 = this.f82426a;
            if (nVar2 != null) {
                nVar2.mo64477a(i, file2, e);
            }
            file2.delete();
            z = false;
        } catch (Throwable th) {
            file2.delete();
            throw th;
        }
        return z;
    }

    /* renamed from: f */
    private final boolean m73362f(int i) {
        File file = new File(mo64405c(i));
        boolean z = false;
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = false;
            boolean z3 = false;
            for (File file2 : listFiles) {
                C52711k.m112236a((Object) file2, "child");
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file2.getAbsolutePath());
                    sb.append(File.separator);
                    sb.append(name);
                    sb.append(".png");
                    if (new File(sb.toString()).exists()) {
                        z2 = true;
                    }
                } else if (file2.isFile() && !TextUtils.equals(FilterModel.CONFIG_FILE, file2.getName()) && TextUtils.equals("thumbnail.jpg", file2.getName())) {
                    z3 = true;
                }
            }
            if (z2 && z3) {
                z = true;
            }
        }
        return z;
    }
}
