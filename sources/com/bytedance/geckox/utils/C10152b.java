package com.bytedance.geckox.utils;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.utils.b */
public final class C10152b {
    /* renamed from: a */
    public static boolean m20476a(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m20477a(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
