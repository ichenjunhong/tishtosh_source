package com.p683ss.android.ugc.aweme.device;

import android.content.Context;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.p683ss.android.ugc.aweme.device.C27528a.C27530a;
import com.p683ss.android.ugc.aweme.utils.C47689aw;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47691a;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47692b;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47693c;
import com.p683ss.android.ugc.aweme.utils.C47689aw.C47694d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.device.b */
final /* synthetic */ class C27531b implements Callable {

    /* renamed from: a */
    private final Context f72374a;

    C27531b(Context context) {
        this.f72374a = context;
    }

    public final Object call() {
        Context context = this.f72374a;
        C27530a aVar = new C27530a();
        C47691a aVar2 = new C47691a();
        aVar2.f120173a = C47689aw.m103221d();
        aVar2.f120174b = C47689aw.m103214b() * 1000;
        aVar2.f120175c = C47689aw.m103208a();
        aVar.f72370a = aVar2;
        C47693c cVar = new C47693c();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            cVar.f120178a = displayMetrics.densityDpi;
            cVar.f120179b = displayMetrics.widthPixels;
            cVar.f120180c = displayMetrics.heightPixels;
        }
        aVar.f72371b = cVar;
        C47694d dVar = new C47694d();
        dVar.f120185e = C47689aw.m103220d(context);
        long j = -1;
        dVar.f120181a = (!C47689aw.m103219c() || Environment.getExternalStorageDirectory() == null) ? -1 : C47689aw.m103212a(Environment.getExternalStorageDirectory().getPath());
        dVar.f120183c = Environment.getRootDirectory() != null ? C47689aw.m103212a(Environment.getRootDirectory().getPath()) : -1;
        dVar.f120182b = (!C47689aw.m103219c() || Environment.getExternalStorageDirectory() == null) ? -1 : C47689aw.m103216b(Environment.getExternalStorageDirectory().getPath());
        if (Environment.getRootDirectory() != null) {
            j = C47689aw.m103216b(Environment.getRootDirectory().getPath());
        }
        dVar.f120184d = j;
        dVar.f120186f = C47689aw.m103217c(context);
        aVar.f72372c = dVar;
        C47692b bVar = new C47692b();
        bVar.f120176a = C47689aw.m103210a(context);
        bVar.f120177b = C47689aw.m103215b(context);
        aVar.f72373d = bVar;
        return aVar;
    }
}
