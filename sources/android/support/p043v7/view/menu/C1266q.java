package android.support.p043v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.p031a.p032a.C0575a;
import android.support.p030v4.p031a.p032a.C0576b;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.q */
public final class C1266q {
    /* renamed from: a */
    public static Menu m3944a(Context context, C0575a aVar) {
        return new C1267r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m3945a(Context context, C0576b bVar) {
        if (VERSION.SDK_INT >= 16) {
            return new C1257l(context, bVar);
        }
        return new C1252k(context, bVar);
    }
}
