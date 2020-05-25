package com.p683ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.tools.utils.C50199c;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.l */
public final class C47041l extends C47027a {

    /* renamed from: f */
    public static final String f118793f = "l";

    /* renamed from: e */
    public List<String> f118794e;

    /* renamed from: a */
    public final void mo94316a() {
        super.mo94316a();
    }

    /* renamed from: f */
    public final String mo94328f() {
        return "extract_movie";
    }

    public C47041l(List<String> list) {
        this.f118794e = list;
    }

    /* renamed from: a */
    public final void mo94320a(boolean z) {
        super.mo94320a(z);
    }

    /* renamed from: a */
    public final void mo94318a(final C47039a aVar) {
        super.mo94318a(aVar);
        if (m102125b()) {
            C0013i.m16a((Callable<TResult>) new Callable<Void>() {
                public final /* synthetic */ Object call() throws Exception {
                    if (C47041l.this.f118794e == null || C47041l.this.f118794e.isEmpty()) {
                        return null;
                    }
                    for (String a : C47041l.this.f118794e) {
                        Bitmap a2 = C50199c.m108334a(a, C47037i.f118791a);
                        if (a2 != null) {
                            String a3 = C47041l.this.f118776c.mo78585a();
                            C50199c.m108337a(a2, new File(a3), 70, CompressFormat.JPEG);
                            C47041l.this.f118774a.addFrameAtLastSegment(a3);
                        }
                    }
                    return null;
                }
            }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Void, Void>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    aVar.mo86668a(iVar.mo26b());
                    C47041l.this.mo94320a(true);
                    C47041l.this.mo94316a();
                    return null;
                }
            });
        }
    }
}
