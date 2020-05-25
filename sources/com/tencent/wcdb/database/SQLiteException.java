package com.tencent.wcdb.database;

import com.tencent.wcdb.C51782l;

public class SQLiteException extends C51782l {
    public SQLiteException() {
    }

    public SQLiteException(String str) {
        super(str);
    }

    public SQLiteException(String str, Throwable th) {
        super(str, th);
    }
}
