package leakcanary.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import leakcanary.C53362a;
import leakcanary.C53362a.C53363a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public abstract class AppWatcherInstaller extends ContentProvider {

    public static final class LeakCanaryProcess extends AppWatcherInstaller {
        public LeakCanaryProcess() {
            super(null);
        }

        public final boolean onCreate() {
            AppWatcherInstaller.super.onCreate();
            C53362a.m113430a(C53363a.m113433a(C53362a.m113429a(), false, false, false, false, 0, 30, null));
            return true;
        }
    }

    public static final class MainProcess extends AppWatcherInstaller {
        public MainProcess() {
            super(null);
        }
    }

    private AppWatcherInstaller() {
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C52711k.m112240b(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C52711k.m112240b(uri, "uri");
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context, "context!!");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            C53420k.f132116e.mo111048a((Application) applicationContext);
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Application");
    }

    public /* synthetic */ AppWatcherInstaller(C52707g gVar) {
        this();
    }
}
