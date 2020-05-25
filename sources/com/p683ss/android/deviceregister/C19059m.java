package com.p683ss.android.deviceregister;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.deviceregister.m */
public final class C19059m implements C19072o {

    /* renamed from: a */
    private static volatile C19072o f52494a;

    /* renamed from: b */
    private final C19061a f52495b;

    /* renamed from: c */
    private final BlockingQueue<Pair<Boolean, C19064a>> f52496c = new LinkedBlockingDeque();

    /* renamed from: com.ss.android.deviceregister.m$a */
    static final class C19061a {

        /* renamed from: a */
        final SQLiteDatabase f52497a;

        /* renamed from: b */
        private final C19062b f52498b;

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo38956c() {
            /*
                r7 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 0
                r3 = 0
                android.database.sqlite.SQLiteDatabase r4 = r7.f52497a     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                java.lang.String r5 = "SELECT _timestamp_header_id FROM timestamp_header ORDER BY _timestamp_header_id DESC LIMIT 1"
                android.database.Cursor r4 = r4.rawQuery(r5, r2)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                boolean r2 = r4.moveToFirst()     // Catch:{ Exception -> 0x0025 }
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = "_timestamp_header_id"
                int r2 = r4.getColumnIndex(r2)     // Catch:{ Exception -> 0x0025 }
                int r2 = r4.getInt(r2)     // Catch:{ Exception -> 0x0025 }
                r3 = r2
            L_0x001f:
                if (r4 == 0) goto L_0x0034
            L_0x0021:
                r4.close()     // Catch:{ Exception -> 0x0034 }
                goto L_0x0034
            L_0x0025:
                r2 = move-exception
                goto L_0x002e
            L_0x0027:
                r0 = move-exception
                r4 = r2
                goto L_0x0052
            L_0x002a:
                r4 = move-exception
                r6 = r4
                r4 = r2
                r2 = r6
            L_0x002e:
                r2.getMessage()     // Catch:{ all -> 0x0051 }
                if (r4 == 0) goto L_0x0034
                goto L_0x0021
            L_0x0034:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "maxTimestampHeaderId="
                r2.<init>(r4)
                r2.append(r3)
                java.lang.String r4 = ", takes "
                r2.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r2.append(r4)
                java.lang.String r0 = " ms"
                r2.append(r0)
                return r3
            L_0x0051:
                r0 = move-exception
            L_0x0052:
                if (r4 == 0) goto L_0x0057
                r4.close()     // Catch:{ Exception -> 0x0057 }
            L_0x0057:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19059m.C19061a.mo38956c():int");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
            if (r4 != null) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r4 != null) goto L_0x0044;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[SYNTHETIC, Splitter:B:26:0x0077] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.p683ss.android.deviceregister.C19048k> mo38959e() {
            /*
                r10 = this;
                long r0 = java.lang.System.currentTimeMillis()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r3 = 0
                android.database.sqlite.SQLiteDatabase r4 = r10.f52497a     // Catch:{ Exception -> 0x004d, all -> 0x004a }
                java.lang.String r5 = "select * from timestamp_header ORDER BY _timestamp_header_id ASC"
                android.database.Cursor r4 = r4.rawQuery(r5, r3)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
                java.lang.String r3 = "_timestamp_header_id"
                int r3 = r4.getColumnIndex(r3)     // Catch:{ Exception -> 0x0048 }
                java.lang.String r5 = "_json"
                int r5 = r4.getColumnIndex(r5)     // Catch:{ Exception -> 0x0048 }
                boolean r6 = r4.moveToFirst()     // Catch:{ Exception -> 0x0048 }
                if (r6 == 0) goto L_0x0042
            L_0x0024:
                boolean r6 = r4.isAfterLast()     // Catch:{ Exception -> 0x0048 }
                if (r6 != 0) goto L_0x0042
                int r6 = r4.getInt(r3)     // Catch:{ Exception -> 0x0048 }
                java.lang.String r7 = r4.getString(r5)     // Catch:{ Exception -> 0x0048 }
                com.ss.android.deviceregister.k r8 = new com.ss.android.deviceregister.k     // Catch:{ Exception -> 0x0048 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0048 }
                r8.<init>(r7, r6)     // Catch:{ Exception -> 0x0048 }
                r2.add(r8)     // Catch:{ Exception -> 0x0048 }
                r4.moveToNext()     // Catch:{ Exception -> 0x0048 }
                goto L_0x0024
            L_0x0042:
                if (r4 == 0) goto L_0x0057
            L_0x0044:
                r4.close()     // Catch:{ Exception -> 0x0057 }
                goto L_0x0057
            L_0x0048:
                r3 = move-exception
                goto L_0x0051
            L_0x004a:
                r0 = move-exception
                r4 = r3
                goto L_0x0075
            L_0x004d:
                r4 = move-exception
                r9 = r4
                r4 = r3
                r3 = r9
            L_0x0051:
                r3.getMessage()     // Catch:{ all -> 0x0074 }
                if (r4 == 0) goto L_0x0057
                goto L_0x0044
            L_0x0057:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "end. return="
                r3.<init>(r4)
                r3.append(r2)
                java.lang.String r4 = ", takes "
                r3.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r3.append(r4)
                java.lang.String r0 = " ms"
                r3.append(r0)
                return r2
            L_0x0074:
                r0 = move-exception
            L_0x0075:
                if (r4 == 0) goto L_0x007a
                r4.close()     // Catch:{ Exception -> 0x007a }
            L_0x007a:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19059m.C19061a.mo38959e():java.util.List");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x010b, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x010c, code lost:
            r21 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0110, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0110 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0011] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0121 A[SYNTHETIC, Splitter:B:32:0x0121] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0147 A[SYNTHETIC, Splitter:B:42:0x0147] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.p683ss.android.deviceregister.C19044i> mo38958d() {
            /*
                r34 = this;
                long r1 = java.lang.System.currentTimeMillis()
                r3 = 0
                r4 = r34
                android.database.sqlite.SQLiteDatabase r0 = r4.f52497a     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
                java.lang.String r5 = "select * from timestamp_active_user ORDER BY timestamp_active_user_id ASC"
                android.database.Cursor r5 = r0.rawQuery(r5, r3)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
                java.lang.String r0 = "timestamp_active_user_id"
                int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r6 = "invoke_internal_start"
                int r6 = r5.getColumnIndex(r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r7 = "invoke_internal_end"
                int r7 = r5.getColumnIndex(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r8 = "internal_json_object"
                int r8 = r5.getColumnIndex(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r9 = "active_thread_run"
                int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r10 = "active_user_start"
                int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r11 = "active_user_end"
                int r11 = r5.getColumnIndex(r11)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r12 = "net_start"
                int r12 = r5.getColumnIndex(r12)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r13 = "net_stacktrace"
                int r13 = r5.getColumnIndex(r13)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r14 = "net_url"
                int r14 = r5.getColumnIndex(r14)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r15.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                boolean r16 = r5.moveToFirst()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                if (r16 == 0) goto L_0x00e8
            L_0x0056:
                boolean r16 = r5.isAfterLast()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                if (r16 != 0) goto L_0x00e8
                int r16 = r5.getInt(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r17 = r5.getLong(r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r19 = r5.getLong(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r3 = r5.getString(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r22 = r5.getLong(r9)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r24 = r5.getLong(r10)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r26 = r5.getLong(r11)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r28 = r5.getLong(r12)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r30 = r0
                java.lang.String r0 = r5.getString(r13)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r4 = r5.getString(r14)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r31 = r6
                com.ss.android.deviceregister.i$a r6 = new com.ss.android.deviceregister.i$a     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r6.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r32 = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r7 = r6.mo38914a(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r33 = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r7 = r7.mo38915a(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r7 = r7.mo38920b(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r8.<init>(r3)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r3 = r7.mo38918a(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r7 = java.lang.Long.valueOf(r22)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r3 = r3.mo38921c(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r7 = java.lang.Long.valueOf(r24)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r3 = r3.mo38922d(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r7 = java.lang.Long.valueOf(r26)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r0 = r3.mo38916a(r7, r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r3 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r0 = r0.mo38923e(r3)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r0.mo38917a(r4)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r15.add(r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r5.moveToNext()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r0 = r30
                r6 = r31
                r7 = r32
                r8 = r33
                r3 = 0
                r4 = r34
                goto L_0x0056
            L_0x00e8:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r3.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.util.Iterator r0 = r15.iterator()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
            L_0x00f1:
                boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                if (r4 == 0) goto L_0x0105
                java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                com.ss.android.deviceregister.i$a r4 = (com.p683ss.android.deviceregister.C19044i.C19046a) r4     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                com.ss.android.deviceregister.i r4 = r4.mo38919a()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                r3.add(r4)     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                goto L_0x00f1
            L_0x0105:
                if (r5 == 0) goto L_0x0126
                r5.close()     // Catch:{ Exception -> 0x0126 }
                goto L_0x0126
            L_0x010b:
                r0 = move-exception
                r21 = r3
                r3 = r5
                goto L_0x011c
            L_0x0110:
                r0 = move-exception
                goto L_0x0145
            L_0x0112:
                r0 = move-exception
                r3 = r5
                goto L_0x011a
            L_0x0115:
                r0 = move-exception
                r5 = 0
                goto L_0x0145
            L_0x0118:
                r0 = move-exception
                r3 = 0
            L_0x011a:
                r21 = 0
            L_0x011c:
                r0.getMessage()     // Catch:{ all -> 0x0143 }
                if (r3 == 0) goto L_0x0124
                r3.close()     // Catch:{ Exception -> 0x0124 }
            L_0x0124:
                r3 = r21
            L_0x0126:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "end. return="
                r0.<init>(r4)
                r0.append(r3)
                java.lang.String r4 = ", takes "
                r0.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r1
                r0.append(r4)
                java.lang.String r1 = " ms"
                r0.append(r1)
                return r3
            L_0x0143:
                r0 = move-exception
                r5 = r3
            L_0x0145:
                if (r5 == 0) goto L_0x014a
                r5.close()     // Catch:{ Exception -> 0x014a }
            L_0x014a:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19059m.C19061a.mo38958d():java.util.List");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x021f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0220, code lost:
            r1 = r4;
            r4 = r5;
            r16 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0225, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0226, code lost:
            r1 = r0;
            r16 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x024b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x024c, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            r16.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0256, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0257, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0281, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0282, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            r16.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x028c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x028d, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0225 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:17:0x010b] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0247 A[SYNTHETIC, Splitter:B:71:0x0247] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0252 A[SYNTHETIC, Splitter:B:76:0x0252] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x027d A[SYNTHETIC, Splitter:B:85:0x027d] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0288 A[SYNTHETIC, Splitter:B:90:0x0288] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.p683ss.android.deviceregister.C19039h> mo38952a() {
            /*
                r41 = this;
                r1 = r41
                long r2 = java.lang.System.currentTimeMillis()
                r4 = 0
                android.database.sqlite.SQLiteDatabase r0 = r1.f52497a     // Catch:{ Exception -> 0x023d, all -> 0x0237 }
                java.lang.String r5 = "select * from timestamp ORDER BY _timestamp_id ASC"
                android.database.Cursor r5 = r0.rawQuery(r5, r4)     // Catch:{ Exception -> 0x023d, all -> 0x0237 }
                java.lang.String r0 = "_timestamp_id"
                int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r6 = "_init_start"
                int r6 = r5.getColumnIndex(r6)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r7 = "_init_end"
                int r7 = r5.getColumnIndex(r7)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r8 = "_prepare_param_start"
                int r8 = r5.getColumnIndex(r8)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r9 = "_prepare_param_end"
                int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r10 = "_load_cache_start"
                int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r11 = "_load_cache_end"
                int r11 = r5.getColumnIndex(r11)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r12 = "_net_max_try_times"
                int r12 = r5.getColumnIndex(r12)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r13 = "_current_did"
                int r13 = r5.getColumnIndex(r13)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.String r14 = "_last_success_upload_timestamp"
                int r14 = r5.getColumnIndex(r14)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r15.<init>()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r4.<init>()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                boolean r17 = r5.moveToFirst()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                if (r17 == 0) goto L_0x0100
            L_0x005b:
                boolean r17 = r5.isAfterLast()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                if (r17 != 0) goto L_0x0100
                int r17 = r5.getInt(r0)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r18 = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r4.add(r0)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                long r19 = r5.getLong(r6)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                long r21 = r5.getLong(r7)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                long r23 = r5.getLong(r8)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                long r25 = r5.getLong(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                long r27 = r5.getLong(r10)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                long r29 = r5.getLong(r11)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                int r0 = r5.getInt(r12)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r31 = r6
                java.lang.String r6 = r5.getString(r13)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r32 = r7
                com.ss.android.deviceregister.h$b r7 = new com.ss.android.deviceregister.h$b     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r7.<init>()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r33 = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r7.mo38908b(r8)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r34 = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r8.mo38905a(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r8.mo38909b(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Long r9 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r8.mo38910c(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Long r9 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r8.mo38911d(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Long r9 = java.lang.Long.valueOf(r27)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r8.mo38912e(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Long r9 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r8 = r8.mo38913f(r9)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                com.ss.android.deviceregister.h$b r0 = r8.mo38904a(r0)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r0.mo38906a(r6)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                boolean r0 = r5.isNull(r14)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                if (r0 != 0) goto L_0x00ee
                long r8 = r5.getLong(r14)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r7.f52442b = r0     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
            L_0x00ee:
                r15.add(r7)     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r5.moveToNext()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r0 = r18
                r6 = r31
                r7 = r32
                r8 = r33
                r9 = r34
                goto L_0x005b
            L_0x0100:
                int r0 = r4.size()     // Catch:{ Exception -> 0x0233, all -> 0x0230 }
                r6 = 0
                r7 = 0
                r8 = 0
            L_0x0107:
                if (r7 >= r0) goto L_0x01ea
                if (r8 == 0) goto L_0x010e
                r8.close()     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            L_0x010e:
                android.database.sqlite.SQLiteDatabase r9 = r1.f52497a     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                java.lang.String r10 = "select * from call where _timestamp_id=?"
                r11 = 1
                java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                java.lang.Object r12 = r4.get(r7)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                r11[r6] = r12     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                android.database.Cursor r9 = r9.rawQuery(r10, r11)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                java.lang.String r8 = "_net_request_start"
                int r8 = r9.getColumnIndex(r8)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r10 = "_net_request_end"
                int r10 = r9.getColumnIndex(r10)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r11 = "_url"
                int r11 = r9.getColumnIndex(r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r12 = "_data"
                int r12 = r9.getColumnIndex(r12)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r13 = "_exception"
                int r13 = r9.getColumnIndex(r13)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r14 = "_error_message"
                int r14 = r9.getColumnIndex(r14)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r6 = "_n_try"
                int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                boolean r17 = r9.moveToFirst()     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                if (r17 == 0) goto L_0x01cf
            L_0x0153:
                boolean r17 = r9.isAfterLast()     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                if (r17 != 0) goto L_0x01cf
                long r17 = r9.getLong(r8)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                long r19 = r9.getLong(r10)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r35 = r0
                java.lang.String r0 = r9.getString(r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.String r1 = r9.getString(r12)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r36 = r4
                java.lang.String r4 = r9.getString(r13)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r37 = r8
                java.lang.String r8 = r9.getString(r14)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                int r21 = r9.getInt(r6)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.Object r22 = r15.get(r7)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r38 = r6
                r6 = r22
                com.ss.android.deviceregister.h$b r6 = (com.p683ss.android.deviceregister.C19039h.C19043b) r6     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r39 = r10
                com.ss.android.deviceregister.h$a$a r10 = new com.ss.android.deviceregister.h$a$a     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r10.<init>()     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r40 = r11
                java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r10 = r10.mo38896a(r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.Long r11 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r10 = r10.mo38899b(r11)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r0 = r10.mo38897a(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r0 = r0.mo38900b(r1)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r0 = r0.mo38901c(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r0 = r0.mo38902d(r8)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a$a r0 = r0.mo38895a(r1)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                com.ss.android.deviceregister.h$a r0 = r0.mo38898a()     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r6.mo38903a(r0)     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r9.moveToNext()     // Catch:{ Exception -> 0x01e5, all -> 0x01df }
                r0 = r35
                r4 = r36
                r8 = r37
                r6 = r38
                r10 = r39
                r11 = r40
                r1 = r41
                goto L_0x0153
            L_0x01cf:
                r35 = r0
                r36 = r4
                int r7 = r7 + 1
                r8 = r9
                r0 = r35
                r4 = r36
                r1 = r41
                r6 = 0
                goto L_0x0107
            L_0x01df:
                r0 = move-exception
                r1 = r0
                r16 = r9
                goto L_0x027b
            L_0x01e5:
                r0 = move-exception
                r4 = r5
                r16 = r9
                goto L_0x022e
            L_0x01ea:
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                r4.<init>()     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
                java.util.Iterator r0 = r15.iterator()     // Catch:{ Exception -> 0x021f, all -> 0x0225 }
            L_0x01f3:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x021f, all -> 0x0225 }
                if (r1 == 0) goto L_0x0207
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x021f, all -> 0x0225 }
                com.ss.android.deviceregister.h$b r1 = (com.p683ss.android.deviceregister.C19039h.C19043b) r1     // Catch:{ Exception -> 0x021f, all -> 0x0225 }
                com.ss.android.deviceregister.h r1 = r1.mo38907a()     // Catch:{ Exception -> 0x021f, all -> 0x0225 }
                r4.add(r1)     // Catch:{ Exception -> 0x021f, all -> 0x0225 }
                goto L_0x01f3
            L_0x0207:
                if (r5 == 0) goto L_0x0212
                r5.close()     // Catch:{ Exception -> 0x020d }
                goto L_0x0212
            L_0x020d:
                r0 = move-exception
                r1 = r0
                r1.getMessage()
            L_0x0212:
                if (r8 == 0) goto L_0x021d
                r8.close()     // Catch:{ Exception -> 0x0218 }
                goto L_0x021d
            L_0x0218:
                r0 = move-exception
                r1 = r0
                r1.getMessage()
            L_0x021d:
                r1 = r4
                goto L_0x025b
            L_0x021f:
                r0 = move-exception
                r1 = r4
                r4 = r5
                r16 = r8
                goto L_0x0242
            L_0x0225:
                r0 = move-exception
                r1 = r0
                r16 = r8
                goto L_0x027b
            L_0x022a:
                r0 = move-exception
                r4 = r5
                r16 = r8
            L_0x022e:
                r1 = 0
                goto L_0x0242
            L_0x0230:
                r0 = move-exception
                r1 = r0
                goto L_0x023a
            L_0x0233:
                r0 = move-exception
                r4 = r5
                r1 = 0
                goto L_0x0240
            L_0x0237:
                r0 = move-exception
                r1 = r0
                r5 = 0
            L_0x023a:
                r16 = 0
                goto L_0x027b
            L_0x023d:
                r0 = move-exception
                r1 = 0
                r4 = 0
            L_0x0240:
                r16 = 0
            L_0x0242:
                r0.getMessage()     // Catch:{ all -> 0x0278 }
                if (r4 == 0) goto L_0x0250
                r4.close()     // Catch:{ Exception -> 0x024b }
                goto L_0x0250
            L_0x024b:
                r0 = move-exception
                r4 = r0
                r4.getMessage()
            L_0x0250:
                if (r16 == 0) goto L_0x025b
                r16.close()     // Catch:{ Exception -> 0x0256 }
                goto L_0x025b
            L_0x0256:
                r0 = move-exception
                r4 = r0
                r4.getMessage()
            L_0x025b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "return="
                r0.<init>(r4)
                r0.append(r1)
                java.lang.String r4 = ", takes "
                r0.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r2
                r0.append(r4)
                java.lang.String r2 = " ms"
                r0.append(r2)
                return r1
            L_0x0278:
                r0 = move-exception
                r1 = r0
                r5 = r4
            L_0x027b:
                if (r5 == 0) goto L_0x0286
                r5.close()     // Catch:{ Exception -> 0x0281 }
                goto L_0x0286
            L_0x0281:
                r0 = move-exception
                r2 = r0
                r2.getMessage()
            L_0x0286:
                if (r16 == 0) goto L_0x0291
                r16.close()     // Catch:{ Exception -> 0x028c }
                goto L_0x0291
            L_0x028c:
                r0 = move-exception
                r2 = r0
                r2.getMessage()
            L_0x0291:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19059m.C19061a.mo38952a():java.util.List");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo38954b() {
            /*
                r7 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 0
                r3 = 0
                android.database.sqlite.SQLiteDatabase r4 = r7.f52497a     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                java.lang.String r5 = "SELECT timestamp_active_user_id FROM timestamp_active_user ORDER BY timestamp_active_user_id DESC LIMIT 1"
                android.database.Cursor r4 = r4.rawQuery(r5, r2)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                boolean r2 = r4.moveToFirst()     // Catch:{ Exception -> 0x0025 }
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = "timestamp_active_user_id"
                int r2 = r4.getColumnIndex(r2)     // Catch:{ Exception -> 0x0025 }
                int r2 = r4.getInt(r2)     // Catch:{ Exception -> 0x0025 }
                r3 = r2
            L_0x001f:
                if (r4 == 0) goto L_0x0034
            L_0x0021:
                r4.close()     // Catch:{ Exception -> 0x0034 }
                goto L_0x0034
            L_0x0025:
                r2 = move-exception
                goto L_0x002e
            L_0x0027:
                r0 = move-exception
                r4 = r2
                goto L_0x0052
            L_0x002a:
                r4 = move-exception
                r6 = r4
                r4 = r2
                r2 = r6
            L_0x002e:
                r2.getMessage()     // Catch:{ all -> 0x0051 }
                if (r4 == 0) goto L_0x0034
                goto L_0x0021
            L_0x0034:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "maxTimestampActiveUserId="
                r2.<init>(r4)
                r2.append(r3)
                java.lang.String r4 = ", takes "
                r2.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r2.append(r4)
                java.lang.String r0 = " ms"
                r2.append(r0)
                return r3
            L_0x0051:
                r0 = move-exception
            L_0x0052:
                if (r4 == 0) goto L_0x0057
                r4.close()     // Catch:{ Exception -> 0x0057 }
            L_0x0057:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19059m.C19061a.mo38954b():int");
        }

        private C19061a(Context context) {
            this.f52498b = new C19062b(context);
            this.f52497a = this.f52498b.getWritableDatabase();
        }

        /* renamed from: b */
        private long m46405b(C19048k kVar) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_timestamp_header_id", kVar.f52483b);
            contentValues.put("_json", kVar.f52482a);
            this.f52497a.beginTransaction();
            try {
                j = this.f52497a.insert("timestamp_header", null, contentValues);
                if (j != -1) {
                    try {
                        this.f52497a.setTransactionSuccessful();
                    } catch (Exception e) {
                        e = e;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52497a.endTransaction();
                    StringBuilder sb = new StringBuilder("end. rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52497a.endTransaction();
                    throw th;
                }
            }
            this.f52497a.endTransaction();
            StringBuilder sb2 = new StringBuilder("end. rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* renamed from: d */
        private boolean m46406d(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.f52497a.query("timestamp", new String[]{"_timestamp_id"}, "_timestamp_id=?", new String[]{String.valueOf(i)}, null, null, null, "1");
            boolean moveToFirst = query.moveToFirst();
            query.close();
            StringBuilder sb = new StringBuilder("timestampPrimaryId=");
            sb.append(i);
            sb.append(" contains=");
            sb.append(moveToFirst);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return moveToFirst;
        }

        /* renamed from: e */
        private boolean m46407e(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.f52497a.query("timestamp_active_user", new String[]{"timestamp_active_user_id"}, "timestamp_active_user_id=?", new String[]{String.valueOf(i)}, null, null, null, "1");
            boolean moveToFirst = query.moveToFirst();
            query.close();
            StringBuilder sb = new StringBuilder("timestampPrimaryId=");
            sb.append(i);
            sb.append(" contains=");
            sb.append(moveToFirst);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return moveToFirst;
        }

        /* renamed from: f */
        private boolean m46408f(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.f52497a.query("timestamp_header", new String[]{"_timestamp_header_id"}, "_timestamp_header_id=?", new String[]{String.valueOf(i)}, null, null, null, "1");
            boolean moveToFirst = query.moveToFirst();
            query.close();
            StringBuilder sb = new StringBuilder("timestampPrimaryId=");
            sb.append(i);
            sb.append(" contains=");
            sb.append(moveToFirst);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return moveToFirst;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo38949a(C19039h hVar) {
            Object obj;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (hVar == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = hVar.f52426k;
            }
            new StringBuilder("timestampPrimaryId=").append(String.valueOf(obj));
            if (hVar == null) {
                return -1;
            }
            this.f52497a.beginTransaction();
            try {
                mo38953a(hVar.f52426k.intValue());
                j = m46403b(hVar);
                try {
                    this.f52497a.setTransactionSuccessful();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52497a.endTransaction();
                    StringBuilder sb = new StringBuilder("rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52497a.endTransaction();
                    throw th;
                }
            }
            this.f52497a.endTransaction();
            StringBuilder sb2 = new StringBuilder("rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* renamed from: b */
        private long m46404b(C19044i iVar) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp_active_user_id", iVar.f52452a);
            contentValues.put("invoke_internal_start", iVar.f52453b);
            contentValues.put("invoke_internal_end", iVar.f52454c);
            contentValues.put("internal_json_object", iVar.f52455d.toString());
            contentValues.put("active_thread_run", iVar.f52456e);
            contentValues.put("active_user_start", iVar.f52457f);
            contentValues.put("active_user_end", iVar.f52458g);
            contentValues.put("net_start", iVar.f52459h);
            contentValues.put("net_stacktrace", iVar.f52460i);
            contentValues.put("net_url", iVar.f52461j);
            this.f52497a.beginTransaction();
            try {
                j = this.f52497a.insert("timestamp_active_user", null, contentValues);
                if (j != -1) {
                    try {
                        this.f52497a.setTransactionSuccessful();
                    } catch (Exception e) {
                        e = e;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52497a.endTransaction();
                    StringBuilder sb = new StringBuilder("end. rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52497a.endTransaction();
                    throw th;
                }
            }
            this.f52497a.endTransaction();
            StringBuilder sb2 = new StringBuilder("end. rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo38950a(C19044i iVar) {
            Object obj;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = iVar.f52452a;
            }
            new StringBuilder("timestampActiveUserId=").append(String.valueOf(obj));
            if (iVar == null) {
                return -1;
            }
            this.f52497a.beginTransaction();
            try {
                mo38955b(iVar.f52452a.intValue());
                j = m46404b(iVar);
                try {
                    this.f52497a.setTransactionSuccessful();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52497a.endTransaction();
                    StringBuilder sb = new StringBuilder("rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52497a.endTransaction();
                    throw th;
                }
            }
            this.f52497a.endTransaction();
            StringBuilder sb2 = new StringBuilder("rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo38957c(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f52497a.beginTransaction();
            int i2 = 0;
            try {
                if (m46408f(i)) {
                    i2 = this.f52497a.delete("timestamp_header", "_timestamp_header_id=?", new String[]{String.valueOf(i)});
                }
                this.f52497a.setTransactionSuccessful();
            } catch (Exception e) {
                e.getMessage();
            } catch (Throwable th) {
                this.f52497a.endTransaction();
                throw th;
            }
            this.f52497a.endTransaction();
            StringBuilder sb = new StringBuilder("end. timestampHeaderId=");
            sb.append(i);
            sb.append(" count=");
            sb.append(i2);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
        }

        /* renamed from: b */
        private long m46403b(C19039h hVar) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_init_start", hVar.f52416a);
            contentValues.put("_init_end", hVar.f52417b);
            contentValues.put("_prepare_param_start", hVar.f52418c);
            contentValues.put("_prepare_param_end", hVar.f52419d);
            contentValues.put("_load_cache_start", hVar.f52420e);
            contentValues.put("_load_cache_end", hVar.f52421f);
            contentValues.put("_net_max_try_times", hVar.f52422g);
            contentValues.put("_current_did", hVar.f52424i);
            contentValues.put("_last_success_upload_timestamp", hVar.f52425j);
            this.f52497a.beginTransaction();
            try {
                j = this.f52497a.insert("timestamp", null, contentValues);
                if (j != -1) {
                    try {
                        for (C19041a aVar : hVar.f52423h) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("_timestamp_id", Long.valueOf(j));
                            contentValues2.put("_net_request_start", aVar.f52427a);
                            contentValues2.put("_net_request_end", aVar.f52428b);
                            contentValues2.put("_url", aVar.f52429c);
                            contentValues2.put("_data", aVar.f52430d);
                            contentValues2.put("_exception", aVar.f52431e);
                            contentValues2.put("_error_message", aVar.f52432f);
                            contentValues2.put("_n_try", aVar.f52433g);
                            if (this.f52497a.insert("call", null, contentValues2) == -1) {
                                StringBuilder sb = new StringBuilder("insert failed for call = ");
                                sb.append(aVar.toString());
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        this.f52497a.setTransactionSuccessful();
                    } catch (Exception e) {
                        e = e;
                        try {
                            e.getMessage();
                            this.f52497a.endTransaction();
                            StringBuilder sb2 = new StringBuilder("success. rowId=");
                            sb2.append(j);
                            sb2.append(", takes ");
                            sb2.append(System.currentTimeMillis() - currentTimeMillis);
                            sb2.append(" ms");
                            return j;
                        } catch (Throwable th) {
                            this.f52497a.endTransaction();
                            throw th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                e.getMessage();
                this.f52497a.endTransaction();
                StringBuilder sb22 = new StringBuilder("success. rowId=");
                sb22.append(j);
                sb22.append(", takes ");
                sb22.append(System.currentTimeMillis() - currentTimeMillis);
                sb22.append(" ms");
                return j;
            }
            this.f52497a.endTransaction();
            StringBuilder sb222 = new StringBuilder("success. rowId=");
            sb222.append(j);
            sb222.append(", takes ");
            sb222.append(System.currentTimeMillis() - currentTimeMillis);
            sb222.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo38951a(C19048k kVar) {
            Object obj;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (kVar == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = kVar.f52483b;
            }
            new StringBuilder("timestampHeaderPrimaryId=").append(String.valueOf(obj));
            if (kVar == null) {
                return -1;
            }
            this.f52497a.beginTransaction();
            try {
                mo38957c(kVar.f52483b.intValue());
                j = m46405b(kVar);
                try {
                    this.f52497a.setTransactionSuccessful();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52497a.endTransaction();
                    StringBuilder sb = new StringBuilder("rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52497a.endTransaction();
                    throw th;
                }
            }
            this.f52497a.endTransaction();
            StringBuilder sb2 = new StringBuilder("rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo38953a(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f52497a.beginTransaction();
            try {
                if (m46406d(i)) {
                    int delete = this.f52497a.delete("timestamp", "_timestamp_id=?", new String[]{String.valueOf(i)});
                    int delete2 = this.f52497a.delete("call", "_timestamp_id=?", new String[]{String.valueOf(i)});
                    StringBuilder sb = new StringBuilder("success. timestampPrimaryId=");
                    sb.append(i);
                    sb.append(" count=");
                    sb.append(delete);
                    sb.append(" callCount=");
                    sb.append(delete2);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                }
                this.f52497a.setTransactionSuccessful();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f52497a.endTransaction();
                throw th;
            }
            this.f52497a.endTransaction();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo38955b(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f52497a.beginTransaction();
            int i2 = 0;
            try {
                if (m46407e(i)) {
                    i2 = this.f52497a.delete("timestamp_active_user", "timestamp_active_user_id=?", new String[]{String.valueOf(i)});
                }
                this.f52497a.setTransactionSuccessful();
            } catch (Exception e) {
                e.getMessage();
            } catch (Throwable th) {
                this.f52497a.endTransaction();
                throw th;
            }
            this.f52497a.endTransaction();
            StringBuilder sb = new StringBuilder("end. timestampActiveUserId=");
            sb.append(i);
            sb.append(" count=");
            sb.append(i2);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
        }
    }

    /* renamed from: com.ss.android.deviceregister.m$b */
    static final class C19062b extends SQLiteOpenHelper {
        C19062b(Context context) {
            super(context, "DeviceRegisterMonitor.db", null, 2);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE timestamp (_timestamp_id INTEGER PRIMARY KEY,_init_start LONG,_init_end LONG,_prepare_param_start LONG,_prepare_param_end LONG,_load_cache_start LONG,_load_cache_end LONG,_net_max_try_times INTEGER,_current_did TEXT,_last_success_upload_timestamp LONG)");
            sQLiteDatabase.execSQL("CREATE TABLE call (_timestamp_id INTEGER,_net_request_start LONG,_net_request_end LONG,_url TEXT,_data TEXT,_exception TEXT,_error_message TEXT,_n_try INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE timestamp_active_user (timestamp_active_user_id INTEGER PRIMARY KEY,invoke_internal_start LONG,invoke_internal_end LONG,internal_json_object TEXT,active_thread_run LONG,active_user_start LONG,active_user_end LONG,net_start LONG,net_stacktrace TEXT,net_url TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE timestamp_header (_timestamp_header_id INTEGER PRIMARY KEY,_json TEXT)");
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onUpgrade(sQLiteDatabase, i, i2);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS timestamp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS call");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS timestamp_active_user");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS timestamp_header");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: com.ss.android.deviceregister.m$c */
    static final class C19063c extends C9393e {

        /* renamed from: a */
        private final BlockingQueue<Pair<Boolean, C19064a>> f52499a;

        /* renamed from: b */
        private final C19061a f52500b;

        /* renamed from: com.ss.android.deviceregister.m$c$a */
        interface C19064a<T extends C19064a> {
            /* renamed from: a */
            void mo38963a(T t, C19061a aVar);
        }

        /* renamed from: com.ss.android.deviceregister.m$c$b */
        static final class C19065b implements C19064a<C19065b> {

            /* renamed from: a */
            final int f52501a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("Delete{timestampPrimaryId=");
                sb.append(this.f52501a);
                sb.append('}');
                return sb.toString();
            }

            C19065b(int i) {
                this.f52501a = i;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38963a(C19064a aVar, C19061a aVar2) {
                aVar2.mo38953a(((C19065b) aVar).f52501a);
            }
        }

        /* renamed from: com.ss.android.deviceregister.m$c$c */
        static final class C19066c implements C19064a<C19066c> {

            /* renamed from: a */
            final int f52502a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeleteActiveUser{timestampActiveUserId=");
                sb.append(this.f52502a);
                sb.append('}');
                return sb.toString();
            }

            C19066c(int i) {
                this.f52502a = i;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo38963a(C19064a aVar, C19061a aVar2) {
                aVar2.mo38955b(((C19066c) aVar).f52502a);
            }
        }

        /* renamed from: com.ss.android.deviceregister.m$c$d */
        static final class C19067d implements C19064a<C19067d> {

            /* renamed from: a */
            final int f52503a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeleteHeader{timestampHeaderId=");
                sb.append(this.f52503a);
                sb.append('}');
                return sb.toString();
            }

            C19067d(int i) {
                this.f52503a = i;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo38963a(C19064a aVar, C19061a aVar2) {
                aVar2.mo38957c(((C19067d) aVar).f52503a);
            }
        }

        /* renamed from: com.ss.android.deviceregister.m$c$e */
        static final class C19068e implements C19064a<C19068e> {

            /* renamed from: a */
            final C19039h f52504a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsertOrUpdate{timestamp=");
                sb.append(this.f52504a.f52426k);
                sb.append('}');
                return sb.toString();
            }

            C19068e(C19039h hVar) {
                this.f52504a = hVar;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38963a(C19064a aVar, C19061a aVar2) {
                aVar2.mo38949a(((C19068e) aVar).f52504a);
            }
        }

        /* renamed from: com.ss.android.deviceregister.m$c$f */
        static final class C19069f implements C19064a<C19069f> {

            /* renamed from: a */
            final C19044i f52505a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsertOrUpdateActiveUser{timestampActiveUser=");
                sb.append(this.f52505a.f52452a);
                sb.append('}');
                return sb.toString();
            }

            C19069f(C19044i iVar) {
                this.f52505a = iVar;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38963a(C19064a aVar, C19061a aVar2) {
                aVar2.mo38950a(((C19069f) aVar).f52505a);
            }
        }

        /* renamed from: com.ss.android.deviceregister.m$c$g */
        static final class C19070g implements C19064a<C19070g> {

            /* renamed from: a */
            final C19048k f52506a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsertOrUpdateHeader{timestampHeader=");
                sb.append(this.f52506a.f52483b);
                sb.append('}');
                return sb.toString();
            }

            C19070g(C19048k kVar) {
                this.f52506a = kVar;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38963a(C19064a aVar, C19061a aVar2) {
                aVar2.mo38951a(((C19070g) aVar).f52506a);
            }
        }

        public final void run() {
            while (true) {
                try {
                    Pair pair = (Pair) this.f52499a.take();
                    if (!((Boolean) pair.first).booleanValue()) {
                        C19064a aVar = (C19064a) pair.second;
                        new StringBuilder("execute action=").append(aVar);
                        aVar.mo38963a(aVar, this.f52500b);
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    new StringBuilder("action my be lost! errorMsg=").append(e.getMessage());
                }
            }
        }

        private C19063c(BlockingQueue<Pair<Boolean, C19064a>> blockingQueue, C19061a aVar) {
            this.f52499a = blockingQueue;
            this.f52500b = aVar;
        }
    }

    /* renamed from: c */
    public final int mo38943c() {
        return this.f52495b.mo38954b();
    }

    /* renamed from: d */
    public final int mo38945d() {
        return this.f52495b.mo38956c();
    }

    /* renamed from: e */
    public final List<C19039h> mo38946e() {
        return this.f52495b.mo38952a();
    }

    /* renamed from: f */
    public final List<C19044i> mo38947f() {
        return this.f52495b.mo38958d();
    }

    /* renamed from: g */
    public final List<C19048k> mo38948g() {
        return this.f52495b.mo38959e();
    }

    /* renamed from: a */
    public static C19072o m46390a() {
        if (f52494a == null) {
            synchronized (C19059m.class) {
                if (f52494a == null) {
                    Context context = AppProvider.f52306a;
                    C19061a aVar = null;
                    if (context != null) {
                        try {
                            aVar = new C19061a(context);
                        } catch (Exception unused) {
                        }
                    }
                    if (aVar != null) {
                        f52494a = new C19059m(aVar);
                    } else {
                        f52494a = new C19071n();
                    }
                }
            }
        }
        return f52494a;
    }

    /* renamed from: b */
    public final int mo38941b() {
        int i;
        C19061a aVar = this.f52495b;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = aVar.f52497a.rawQuery("SELECT _timestamp_id FROM timestamp ORDER BY _timestamp_id DESC LIMIT 1", null);
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(rawQuery.getColumnIndex("_timestamp_id"));
        } else {
            i = 0;
        }
        rawQuery.close();
        StringBuilder sb = new StringBuilder("maxTimestampId=");
        sb.append(i);
        sb.append(", takes ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
        return i;
    }

    private C19059m(C19061a aVar) {
        this.f52495b = aVar;
        new C19063c(this.f52496c, aVar).start();
    }

    /* renamed from: a */
    public final void mo38937a(int i) {
        this.f52496c.offer(new Pair(Boolean.valueOf(false), new C19065b(i)));
    }

    /* renamed from: b */
    public final void mo38942b(int i) {
        this.f52496c.offer(new Pair(Boolean.valueOf(false), new C19066c(i)));
    }

    /* renamed from: c */
    public final void mo38944c(int i) {
        this.f52496c.offer(new Pair(Boolean.valueOf(false), new C19067d(i)));
    }

    /* renamed from: a */
    public final void mo38938a(C19039h hVar) {
        this.f52496c.offer(new Pair(Boolean.valueOf(false), new C19068e(hVar)));
    }

    /* renamed from: a */
    public final void mo38939a(C19044i iVar) {
        this.f52496c.offer(new Pair(Boolean.valueOf(false), new C19069f(iVar)));
    }

    /* renamed from: a */
    public final void mo38940a(C19048k kVar) {
        this.f52496c.offer(new Pair(Boolean.valueOf(false), new C19070g(kVar)));
    }
}
