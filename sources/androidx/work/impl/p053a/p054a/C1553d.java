package androidx.work.impl.p053a.p054a;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1542h;
import androidx.work.impl.p053a.C1558b;
import androidx.work.impl.p053a.p055b.C1569h;
import androidx.work.impl.p056b.C1583g;

/* renamed from: androidx.work.impl.a.a.d */
public final class C1553d extends C1551c<C1558b> {
    public C1553d(Context context) {
        super(C1569h.m5566a(context).f5572c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5941a(C1583g gVar) {
        if (gVar.f5611j.f5519b == C1542h.CONNECTED) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo5942b(Object obj) {
        C1558b bVar = (C1558b) obj;
        boolean z = false;
        if (VERSION.SDK_INT >= 26) {
            if (bVar.f5554a && bVar.f5555b) {
                return false;
            }
            z = true;
        } else if (!bVar.f5554a) {
            return true;
        }
        return z;
    }
}
