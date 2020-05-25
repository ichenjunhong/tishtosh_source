package com.tencent.wcdb.database;

import com.C2240a;
import java.util.ArrayList;

public final class SQLiteDebug {

    /* renamed from: a */
    static volatile int f129067a;

    /* renamed from: b */
    static volatile ArrayList<IOTraceStats> f129068b;

    public static class DbStats {
        public String cache;
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(String str, long j, long j2, int i, int i2, int i3, int i4) {
            this.dbName = str;
            this.pageSize = j2 / 1024;
            this.dbSize = (j * j2) / 1024;
            this.lookaside = i;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("/");
            sb.append(i3);
            sb.append("/");
            sb.append(i4);
            this.cache = sb.toString();
        }
    }

    public static class IOTraceStats {
        public String dbName;
        public String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public String path;

        public String toString() {
            return C2240a.m6772a("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", new Object[]{this.dbName, this.path, Long.valueOf(this.pageSize), Long.valueOf(this.pageCount), this.journalMode, Long.valueOf(this.lastReadOffset), Long.valueOf(this.lastWriteOffset), Long.valueOf(this.lastJournalReadOffset), Long.valueOf(this.lastJournalWriteOffset)});
        }
    }

    public static class PagerStats {
        public ArrayList<DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    static {
        SQLiteGlobal.loadLib();
    }

    private SQLiteDebug() {
    }

    /* renamed from: a */
    public static final boolean m110976a(long j) {
        return j > 300;
    }

    static native void nativeGetIOTraceStats(long j, ArrayList<IOTraceStats> arrayList);

    static native int nativeGetLastErrorLine();

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    private static native void nativeSetIOTraceFlags(int i);
}
