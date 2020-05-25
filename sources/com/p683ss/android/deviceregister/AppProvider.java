package com.p683ss.android.deviceregister;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.ss.android.deviceregister.AppProvider */
public final class AppProvider extends ContentProvider {

    /* renamed from: a */
    public static Context f52306a;

    public final int delete(Uri uri, String str, String[] strArr) {
        return -1;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return -1;
    }

    public final boolean onCreate() {
        f52306a = getContext();
        return false;
    }
}
