package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0176h.C0177a;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!C0179i.f436a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0181b());
        }
        Context context2 = getContext();
        C0201u uVar = C0201u.f468i;
        uVar.f473e = new Handler();
        uVar.f474f.mo332a(C0177a.ON_CREATE);
        ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new C0166c() {
            public final void onActivityStopped(Activity activity) {
                C0201u uVar = C0201u.this;
                uVar.f469a--;
                uVar.mo346b();
            }

            public final void onActivityPaused(Activity activity) {
                C0201u uVar = C0201u.this;
                uVar.f470b--;
                if (uVar.f470b == 0) {
                    uVar.f473e.postDelayed(uVar.f475g, 700);
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ((C0205v) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag")).f480a = C0201u.this.f476h;
            }
        });
        return true;
    }
}
