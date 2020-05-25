package com.p683ss.ttvideoengine.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: com.ss.ttvideoengine.database.VideoModelDBManager */
public class VideoModelDBManager {
    private static int mCacheSize = 200;
    private static SQLiteDatabase mDB;
    private static VideoModelDBManager mInstance;

    /* renamed from: com.ss.ttvideoengine.database.VideoModelDBManager$CacheInfo */
    public static class CacheInfo {
        public long time;
        public String vid;
        public String videoModelStr;
    }

    public static void clear() {
        if (mDB != null) {
            mDB.beginTransaction();
            try {
                mDB.execSQL(C2240a.m6772a("DELETE FROM %s ", new Object[]{"videomodel"}));
                mDB.setTransactionSuccessful();
                TTVideoEngineLog.m110647i("VideoModelDBManager", "all cleared");
            } catch (Exception e) {
                TTVideoEngineLog.m110645d(e);
            } catch (Throwable th) {
                mDB.endTransaction();
                throw th;
            }
            mDB.endTransaction();
        }
    }

    public static int count() {
        if (mDB == null) {
            return -1;
        }
        int i = 0;
        try {
            Cursor rawQuery = mDB.rawQuery(C2240a.m6772a("SELECT COUNT(*) FROM %s", new Object[]{"videomodel"}), null);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
        }
        StringBuilder sb = new StringBuilder("count:");
        sb.append(i);
        TTVideoEngineLog.m110644d("VideoModelDBManager", sb.toString());
        return i;
    }

    public static VideoModelDBManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (VideoModelDBManager.class) {
                if (mInstance == null) {
                    mInstance = new VideoModelDBManager(context);
                }
            }
        }
        return mInstance;
    }

    private VideoModelDBManager(Context context) {
        if (context != null) {
            DBHelper instance = DBHelper.getInstance(context);
            if (instance != null) {
                try {
                    SQLiteDatabase writableDatabase = instance.getWritableDatabase();
                    mDB = writableDatabase;
                    if (writableDatabase != null) {
                        mDB.execSQL(C2240a.m6772a("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", new Object[]{"videomodel"}));
                    }
                } catch (Throwable th) {
                    TTVideoEngineLog.m110645d(th);
                }
            }
        }
    }

    public static void delete(String str) {
        if (mDB != null) {
            mDB.beginTransaction();
            try {
                mDB.execSQL(C2240a.m6772a("DELETE FROM %s WHERE vid='%s'", new Object[]{"videomodel", str}));
                mDB.setTransactionSuccessful();
            } catch (Exception e) {
                TTVideoEngineLog.m110645d(e);
            } catch (Throwable th) {
                mDB.endTransaction();
                throw th;
            }
            mDB.endTransaction();
            StringBuilder sb = new StringBuilder("deleted vid:");
            sb.append(str);
            TTVideoEngineLog.m110647i("VideoModelDBManager", sb.toString());
        }
    }

    public static CacheInfo query(String str) {
        CacheInfo cacheInfo;
        if (TextUtils.isEmpty(str) || mDB == null) {
            return null;
        }
        try {
            Cursor rawQuery = mDB.rawQuery(C2240a.m6772a("SELECT * FROM %s WHERE vid='%s'", new Object[]{"videomodel", str}), null);
            cacheInfo = new CacheInfo();
            try {
                cacheInfo.vid = str;
                if (rawQuery.moveToFirst()) {
                    cacheInfo.videoModelStr = rawQuery.getString(rawQuery.getColumnIndex("videomodel"));
                    cacheInfo.time = rawQuery.getLong(rawQuery.getColumnIndex("time"));
                }
                rawQuery.close();
                StringBuilder sb = new StringBuilder("query vid:");
                sb.append(str);
                sb.append(" videomodel:");
                sb.append(cacheInfo.videoModelStr);
                TTVideoEngineLog.m110644d("VideoModelDBManager", sb.toString());
            } catch (Exception e) {
                e = e;
                TTVideoEngineLog.m110645d(e);
                return cacheInfo;
            }
        } catch (Exception e2) {
            e = e2;
            cacheInfo = null;
            TTVideoEngineLog.m110645d(e);
            return cacheInfo;
        }
        return cacheInfo;
    }

    public static void insert(String str, String str2) {
        if (mDB != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("insert vid:");
            sb.append(str);
            sb.append(" videomodel:");
            sb.append(str2);
            TTVideoEngineLog.m110647i("VideoModelDBManager", sb.toString());
            mDB.beginTransaction();
            boolean z = true;
            try {
                mDB.execSQL(C2240a.m6772a("REPLACE INTO %s VALUES ('%s','%s',%d)", new Object[]{"videomodel", str, str2, Long.valueOf(System.currentTimeMillis())}));
                mDB.execSQL(C2240a.m6772a("DELETE FROM %s WHERE vid IN (SELECT vid FROM %s ORDER BY time DESC LIMIT -1 OFFSET %d)", new Object[]{"videomodel", "videomodel", Integer.valueOf(mCacheSize)}));
                mDB.setTransactionSuccessful();
            } catch (SQLException e) {
                TTVideoEngineLog.m110645d(e);
                mDB.endTransaction();
            } catch (IllegalStateException e2) {
                TTVideoEngineLog.m110645d(e2);
            } catch (Throwable th) {
                mDB.endTransaction();
                throw th;
            }
            mDB.endTransaction();
            z = false;
            if (z) {
                int count = count();
                if (count > 0) {
                    int i = count - 10;
                    mCacheSize = i;
                    if (i < 20) {
                        mCacheSize = 20;
                    }
                }
            }
        }
    }
}
