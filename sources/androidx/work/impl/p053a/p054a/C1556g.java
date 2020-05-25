package androidx.work.impl.p053a.p054a;

import android.content.Context;
import androidx.work.C1542h;
import androidx.work.impl.p053a.C1558b;
import androidx.work.impl.p053a.p055b.C1569h;
import androidx.work.impl.p056b.C1583g;

/* renamed from: androidx.work.impl.a.a.g */
public final class C1556g extends C1551c<C1558b> {
    public C1556g(Context context) {
        super(C1569h.m5566a(context).f5572c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5941a(C1583g gVar) {
        if (gVar.f5611j.f5519b == C1542h.UNMETERED) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo5942b(Object obj) {
        C1558b bVar = (C1558b) obj;
        if (!bVar.f5554a || bVar.f5556c) {
            return true;
        }
        return false;
    }
}
