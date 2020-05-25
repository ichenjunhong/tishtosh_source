package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.p1201c.C19600a;
import com.p683ss.android.newmedia.redbadge.p1201c.C19601b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.j */
public class C19582j implements C19572a {

    /* renamed from: a */
    private static final String[] f53967a = {"_id", "class"};

    /* renamed from: b */
    private C19576d f53968b;

    public C19582j() {
        if (VERSION.SDK_INT >= 21) {
            this.f53968b = new C19576d();
        }
    }

    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: a */
    private static ContentValues m47896a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            if (this.f53968b == null || !C19600a.m47943a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
                Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
                ContentResolver contentResolver = context.getContentResolver();
                Cursor cursor = null;
                try {
                    ContentResolver contentResolver2 = contentResolver;
                    Uri uri = parse;
                    Cursor cursor2 = contentResolver2.query(uri, f53967a, "package=?", new String[]{componentName.getPackageName()}, null);
                    if (cursor2 != null) {
                        try {
                            String className = componentName.getClassName();
                            boolean z = false;
                            while (cursor2.moveToNext()) {
                                contentResolver.update(parse, m47896a(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor2.getInt(0))});
                                if (className.equals(cursor2.getString(cursor2.getColumnIndex("class")))) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                contentResolver.insert(parse, m47896a(componentName, i, true));
                            }
                        } catch (Throwable th) {
                            th = th;
                            C19601b.m47944a(cursor2);
                            throw th;
                        }
                    }
                    C19601b.m47944a(cursor2);
                } catch (Throwable th2) {
                    th = th2;
                    throw new C19610g(th.getMessage());
                }
            } else {
                this.f53968b.mo40826a(context, componentName, i);
            }
        }
    }
}
