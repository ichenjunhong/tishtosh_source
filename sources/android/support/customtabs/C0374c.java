package android.support.customtabs;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p030v4.app.C0647e;
import java.util.ArrayList;

/* renamed from: android.support.customtabs.c */
public final class C0374c {

    /* renamed from: a */
    public final Intent f1250a;

    /* renamed from: b */
    public final Bundle f1251b;

    /* renamed from: android.support.customtabs.c$a */
    public static final class C0375a {

        /* renamed from: a */
        public final Intent f1252a;

        /* renamed from: b */
        private ArrayList<Bundle> f1253b;

        /* renamed from: c */
        private Bundle f1254c;

        /* renamed from: d */
        private ArrayList<Bundle> f1255d;

        /* renamed from: e */
        private boolean f1256e;

        public C0375a() {
            this(null);
        }

        /* renamed from: a */
        public final C0374c mo865a() {
            if (this.f1253b != null) {
                this.f1252a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f1253b);
            }
            if (this.f1255d != null) {
                this.f1252a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f1255d);
            }
            this.f1252a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1256e);
            return new C0374c(this.f1252a, this.f1254c);
        }

        public C0375a(C0378e eVar) {
            this.f1252a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f1253b = null;
            this.f1254c = null;
            this.f1255d = null;
            this.f1256e = true;
            if (eVar != null) {
                this.f1252a.setPackage(eVar.f1259b.getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            if (eVar != null) {
                iBinder = eVar.f1258a.asBinder();
            }
            C0647e.m1768a(bundle, str, iBinder);
            this.f1252a.putExtras(bundle);
        }
    }

    C0374c(Intent intent, Bundle bundle) {
        this.f1250a = intent;
        this.f1251b = bundle;
    }
}
