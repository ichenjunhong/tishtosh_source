package com.bytedance.liko.leakdetector;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import p2628d.p2639f.p2641b.C52711k;

public final class LeakDetectorProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        C52711k.m112240b(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C52711k.m112240b(uri, "uri");
        return 0;
    }

    public final boolean onCreate() {
        LeakDetectorInstaller.INSTANCE.tryInstall(getContext());
        return true;
    }
}
