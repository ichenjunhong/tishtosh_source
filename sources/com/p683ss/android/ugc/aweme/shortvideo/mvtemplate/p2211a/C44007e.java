package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.p683ss.android.ugc.tools.utils.C50199c;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.e */
final /* synthetic */ class C44007e implements Callable {

    /* renamed from: a */
    private final C44002b f111454a;

    /* renamed from: b */
    private final String f111455b;

    C44007e(C44002b bVar, String str) {
        this.f111454a = bVar;
        this.f111455b = str;
    }

    public final Object call() {
        C44002b bVar = this.f111454a;
        String str = this.f111455b;
        Bitmap a = bVar.mo89831a();
        if (a != null) {
            C50199c.m108337a(a, new File(str), 60, CompressFormat.PNG);
            C50199c.m108335a(a);
        }
        return null;
    }
}
