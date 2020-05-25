package com.google.android.play.core.p1048a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import com.google.android.play.core.p1049b.C17248c;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1052d.C17315a;
import com.google.android.play.core.p1056f.C17365d;
import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.a.e */
final class C17235e implements C17232b {

    /* renamed from: a */
    private final C17236f f48685a;

    /* renamed from: b */
    private final C17234d f48686b;

    /* renamed from: c */
    private final Context f48687c;

    C17235e(C17236f fVar, Context context) {
        this.f48685a = fVar;
        this.f48686b = new C17234d(context);
        this.f48687c = context;
    }

    /* renamed from: a */
    public final synchronized void mo33502a(C17248c cVar) {
        this.f48686b.mo33608a((C17315a<StateT>) cVar);
    }

    /* renamed from: b */
    public final synchronized void mo33505b(C17248c cVar) {
        this.f48686b.mo33611b(cVar);
    }

    /* renamed from: a */
    public final C17365d<C17231a> mo33501a() {
        C17236f fVar = this.f48685a;
        String packageName = this.f48687c.getPackageName();
        C17236f.f48688a.mo33685a("requestUpdateInfo(%s)", packageName);
        C17374l lVar = new C17374l();
        fVar.f48690b.mo33588a((C17281bc) new C17238h(fVar, lVar, packageName, lVar));
        return lVar.f48889a;
    }

    /* renamed from: a */
    public final boolean mo33503a(C17231a aVar, int i, Activity activity, int i2) throws SendIntentException {
        C17237g gVar = new C17237g(activity);
        if (!aVar.mo33492a(0)) {
            return false;
        }
        gVar.mo33508a(aVar.mo33500i().getIntentSender(), 19, null, 0, 0, 0, null);
        return true;
    }

    /* renamed from: b */
    public final C17365d<Void> mo33504b() {
        C17236f fVar = this.f48685a;
        String packageName = this.f48687c.getPackageName();
        C17236f.f48688a.mo33685a("completeUpdate(%s)", packageName);
        C17374l lVar = new C17374l();
        fVar.f48690b.mo33588a((C17281bc) new C17241k(fVar, lVar, lVar, packageName));
        return lVar.f48889a;
    }
}
