package com.tencent.wcdb;

import android.database.Cursor;

/* renamed from: com.tencent.wcdb.e */
public interface C51775e extends Cursor {
    void close();

    int getColumnIndex(String str);

    int getCount();

    int getInt(int i);

    long getLong(int i);

    String getString(int i);

    boolean moveToFirst();

    boolean moveToNext();
}
