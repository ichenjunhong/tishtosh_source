package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.e */
public class C19577e implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            contentValues.put("count", Integer.valueOf(i));
            try {
                context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
            } catch (Throwable th) {
                throw new C19610g(th.getMessage());
            }
        }
    }
}
