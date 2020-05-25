package com.p683ss.android.ugc.aweme.watermark;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.C27988y;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45636a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45640d;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.vesdk.C50637aq;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.watermark.a */
public final class C48232a implements C45636a {

    /* renamed from: a */
    private String f121368a;

    /* renamed from: b */
    private int f121369b;

    /* renamed from: c */
    private int f121370c;

    /* renamed from: d */
    private int f121371d;

    /* renamed from: e */
    private Map<String, String[]> f121372e = new HashMap();

    /* renamed from: b */
    public final void mo92021b() {
        this.f121372e.clear();
    }

    /* renamed from: a */
    public final C45640d mo92019a() {
        int i = (int) ((((float) this.f121369b) / 1080.0f) * 24.0f);
        C45640d dVar = new C45640d();
        dVar.xOffset = i;
        dVar.yOffset = i;
        dVar.position = C50637aq.TL_BR;
        StringBuilder sb = new StringBuilder("WaterMarkPositionConfig xOffset:");
        sb.append(i);
        sb.append(" yOffset:");
        sb.append(i);
        sb.append(" videoWidth:");
        sb.append(this.f121369b);
        C45407ay.m98968a(sb.toString());
        return dVar;
    }

    /* renamed from: a */
    public final void mo92020a(boolean z, C22055c cVar) {
        mo92022b(z, cVar);
    }

    /* renamed from: b */
    public final String[] mo92022b(boolean z, C22055c cVar) {
        String str;
        boolean z2;
        if (TextUtils.isEmpty(cVar.mo46157a())) {
            str = cVar.mo46158b();
        } else {
            str = cVar.mo46157a();
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z);
        String sb2 = sb.toString();
        String[] strArr = (String[]) this.f121372e.get(sb2);
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        String a = C9395d.m18571a(this.f121368a);
        if (TextUtils.isEmpty(str)) {
            C32458a.m75148a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        File file = new File(C43308eb.f109498k);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f121369b == 0 || this.f121370c == 0) {
            return null;
        }
        if (!z2) {
            StringBuilder sb3 = new StringBuilder("provide error ");
            sb3.append(z2);
            sb3.append(" ");
            sb3.append(this.f121369b);
            sb3.append(" ");
            sb3.append(this.f121370c);
            C32458a.m75148a((Throwable) new IllegalStateException(sb3.toString()));
            return null;
        }
        String[] a2 = C27988y.m66754a(cVar, this.f121369b, this.f121370c, this.f121371d, z, a);
        this.f121372e.put(sb2, a2);
        return a2;
    }

    public C48232a(String str, int i, int i2, int i3) {
        this.f121368a = str;
        this.f121369b = i;
        this.f121370c = i2;
        this.f121371d = i3;
    }
}
