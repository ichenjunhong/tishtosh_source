package com.squareup.p1094a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.IOException;

/* renamed from: com.squareup.a.ab */
final class C18345ab extends C18343aa {

    /* renamed from: a */
    private final Context f50666a;

    C18345ab(Context context) {
        this.f50666a = context;
    }

    /* renamed from: a */
    public final boolean mo36788a(C18409y yVar) {
        if (yVar.f50843e != 0) {
            return true;
        }
        return "android.resource".equals(yVar.f50842d.getScheme());
    }

    /* renamed from: a */
    public final C18344a mo36787a(C18409y yVar, int i) throws IOException {
        Resources a = C18356aj.m44589a(this.f50666a, yVar);
        int a2 = C18356aj.m44586a(a, yVar);
        Options c = m44566c(yVar);
        if (m44565a(c)) {
            BitmapFactory.decodeResource(a, a2, c);
            m44564a(yVar.f50846h, yVar.f50847i, c, yVar);
        }
        return new C18344a(BitmapFactory.decodeResource(a, a2, c), C18402d.DISK);
    }
}
