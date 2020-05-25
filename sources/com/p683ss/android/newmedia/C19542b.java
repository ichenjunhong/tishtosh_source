package com.p683ss.android.newmedia;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.C18920g;
import java.io.File;

/* renamed from: com.ss.android.newmedia.b */
public final class C19542b extends ContextWrapper {
    public final File getCacheDir() {
        return super.getCacheDir();
    }

    public C19542b(Context context) {
        super(context);
    }

    public final File getDir(String str, int i) {
        String b = C18920g.m46051b(this);
        if (!C9431p.m18664a(b) && !C9431p.m18664a(str) && b.endsWith(":ad")) {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            str = sb.toString();
        }
        return super.getDir(str, i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        String b = C18920g.m46051b(this);
        if (!C9431p.m18664a(b) && !C9431p.m18664a(str) && b.endsWith(":ad")) {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            str = sb.toString();
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
