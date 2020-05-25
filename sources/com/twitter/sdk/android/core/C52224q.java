package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

/* renamed from: com.twitter.sdk.android.core.q */
public class C52224q extends ContextWrapper {

    /* renamed from: a */
    private final String f130046a;

    /* renamed from: b */
    private final String f130047b;

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f130046a);
    }

    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f130046a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f130046a);
    }

    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f130046a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f130046a);
        file.mkdirs();
        return new File(file, str);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f130047b);
        sb.append(":");
        sb.append(str);
        return super.getSharedPreferences(sb.toString(), i);
    }

    C52224q(Context context, String str, String str2) {
        super(context);
        this.f130047b = str;
        this.f130046a = str2;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
