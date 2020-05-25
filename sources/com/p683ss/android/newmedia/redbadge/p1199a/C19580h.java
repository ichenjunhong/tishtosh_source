package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.h */
public class C19580h implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            ContentValues contentValues = new ContentValues();
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getPackageName());
            sb.append("/");
            sb.append(componentName.getClassName());
            contentValues.put("tag", sb.toString());
            contentValues.put("count", Integer.valueOf(i));
            try {
                context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
            } catch (Throwable th) {
                throw new C19610g(th.getMessage());
            }
        }
    }
}
