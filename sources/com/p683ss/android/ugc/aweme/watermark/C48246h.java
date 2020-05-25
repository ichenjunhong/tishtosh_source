package com.p683ss.android.ugc.aweme.watermark;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45636a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45640d;
import com.p683ss.android.vesdk.C50637aq;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.watermark.h */
public final class C48246h implements C45636a {

    /* renamed from: a */
    private String f121400a;

    /* renamed from: b */
    private int f121401b;

    /* renamed from: c */
    private int f121402c;

    /* renamed from: a */
    public final void mo92020a(boolean z, C22055c cVar) {
    }

    /* renamed from: b */
    public final void mo92021b() {
    }

    /* renamed from: a */
    public final C45640d mo92019a() {
        float f = ((float) this.f121401b) / 720.0f;
        int i = (int) (26.0f * f);
        int i2 = (int) (f * 28.0f);
        C45640d dVar = new C45640d();
        dVar.xOffset = i;
        dVar.yOffset = i2;
        dVar.position = C50637aq.BR;
        return dVar;
    }

    /* renamed from: b */
    public final String[] mo92022b(boolean z, C22055c cVar) {
        String str;
        boolean z2;
        String a = C9395d.m18571a(this.f121400a);
        if (TextUtils.isEmpty(cVar.mo46157a())) {
            str = cVar.mo46158b();
        } else {
            str = cVar.mo46157a();
        }
        if (TextUtils.isEmpty(str)) {
            C32458a.m75148a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        String string = C39618d.f101160a.getString(R.string.o7, new Object[]{str});
        File file = new File(C43308eb.f109498k);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f121401b == 0 || this.f121402c == 0) {
            return null;
        }
        if (!z2) {
            StringBuilder sb = new StringBuilder("provide error ");
            sb.append(false);
            sb.append(" ");
            sb.append(this.f121401b);
            sb.append(" ");
            sb.append(this.f121402c);
            C32458a.m75148a((Throwable) new IllegalStateException(sb.toString()));
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C43308eb.f109498k);
        sb2.append(File.separator);
        sb2.append(a);
        sb2.append(".png");
        String sb3 = sb2.toString();
        new C48256p().mo95754a(this.f121401b, this.f121402c, string, R.drawable.bcx, z).mo95757a(sb3);
        return new String[]{sb3};
    }

    public C48246h(String str, int i, int i2) {
        this.f121400a = str;
        this.f121401b = i;
        this.f121402c = i2;
    }
}
