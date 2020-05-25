package com.squareup.p1094a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.a.g */
class C18373g extends C18343aa {

    /* renamed from: a */
    final Context f50736a;

    C18373g(Context context) {
        this.f50736a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final InputStream mo36821b(C18409y yVar) throws FileNotFoundException {
        return this.f50736a.getContentResolver().openInputStream(yVar.f50842d);
    }

    /* renamed from: a */
    public boolean mo36788a(C18409y yVar) {
        return C42311c.f106865i.equals(yVar.f50842d.getScheme());
    }

    /* renamed from: a */
    public C18344a mo36787a(C18409y yVar, int i) throws IOException {
        return new C18344a(mo36821b(yVar), C18402d.DISK);
    }
}
