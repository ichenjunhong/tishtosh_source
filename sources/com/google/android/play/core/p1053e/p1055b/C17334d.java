package com.google.android.play.core.p1053e.p1055b;

import android.content.Intent;
import android.net.Uri;
import com.google.android.play.core.p1053e.C17342g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.e.b.d */
final class C17334d implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ List f48835a;

    /* renamed from: b */
    private final /* synthetic */ C17330a f48836b;

    C17334d(C17330a aVar, List list) {
        this.f48836b = aVar;
        this.f48835a = list;
    }

    public final void run() {
        C17330a aVar = this.f48836b;
        List<File> list = this.f48835a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file : list) {
            String a = C17330a.m42426a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, aVar.f48822b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", C17330a.m42427a(a));
            intent.putExtra("split_id", a);
            arrayList.add(intent);
            arrayList2.add(C17330a.m42427a(C17330a.m42426a(file)));
        }
        long e = ((C17342g) C17330a.f48821e.get()).mo33637e();
        Executor executor = aVar.f48824d;
        C17336f fVar = new C17336f(aVar, e, arrayList, arrayList2);
        executor.execute(fVar);
    }
}
