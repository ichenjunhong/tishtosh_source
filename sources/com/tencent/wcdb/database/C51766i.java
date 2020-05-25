package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.C51778h;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteDatabase.C51753a;
import com.tencent.wcdb.support.Log;
import java.io.File;

/* renamed from: com.tencent.wcdb.database.i */
public abstract class C51766i {

    /* renamed from: a */
    private final Context f129135a;

    /* renamed from: b */
    private final C51753a f129136b;

    /* renamed from: c */
    public final String f129137c;

    /* renamed from: d */
    private final int f129138d;

    /* renamed from: e */
    private SQLiteDatabase f129139e;

    /* renamed from: f */
    private boolean f129140f;

    /* renamed from: g */
    private boolean f129141g;

    /* renamed from: h */
    private boolean f129142h;

    /* renamed from: i */
    private final C51778h f129143i;

    /* renamed from: j */
    private byte[] f129144j;

    /* renamed from: k */
    private SQLiteCipherSpec f129145k;

    /* renamed from: l */
    private int f129146l;

    /* renamed from: m */
    private boolean f129147m;

    static {
        SQLiteGlobal.loadLib();
    }

    /* renamed from: a */
    public abstract void mo20981a(SQLiteDatabase sQLiteDatabase);

    /* renamed from: a */
    public abstract void mo20982a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* renamed from: b */
    public void mo20983b(SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: c */
    public void mo20985c(SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: a */
    public final SQLiteDatabase mo107221a() {
        SQLiteDatabase a;
        synchronized (this) {
            a = m111013a(true);
        }
        return a;
    }

    /* renamed from: d */
    private SQLiteDatabase m111014d(SQLiteDatabase sQLiteDatabase) {
        mo20983b(sQLiteDatabase);
        int k = sQLiteDatabase.mo107193k();
        if (k != this.f129138d) {
            if (!sQLiteDatabase.mo107194l()) {
                sQLiteDatabase.mo107189g();
                if (k == 0) {
                    try {
                        mo20981a(sQLiteDatabase);
                    } catch (Throwable th) {
                        sQLiteDatabase.mo107190h();
                        throw th;
                    }
                } else if (k > this.f129138d) {
                    mo20984b(sQLiteDatabase, k, this.f129138d);
                } else {
                    mo20982a(sQLiteDatabase, k, this.f129138d);
                }
                sQLiteDatabase.mo107183a(this.f129138d);
                sQLiteDatabase.mo107191i();
                sQLiteDatabase.mo107190h();
            } else {
                StringBuilder sb = new StringBuilder("Can't upgrade read-only database from version ");
                sb.append(sQLiteDatabase.mo107193k());
                sb.append(" to ");
                sb.append(this.f129138d);
                sb.append(": ");
                sb.append(this.f129137c);
                throw new SQLiteException(sb.toString());
            }
        }
        mo20985c(sQLiteDatabase);
        if (sQLiteDatabase.mo107194l()) {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append(this.f129137c);
            sb2.append(" in read-only mode");
            Log.m111075b("WCDB.SQLiteOpenHelper", sb2.toString());
        }
        this.f129139e = sQLiteDatabase;
        return sQLiteDatabase;
    }

    /* renamed from: a */
    private SQLiteDatabase m111013a(boolean z) {
        int i;
        File file;
        File file2;
        int i2;
        File file3 = null;
        if (this.f129139e != null) {
            if (!this.f129139e.mo107196n()) {
                this.f129139e = null;
            } else if (!this.f129139e.mo107194l()) {
                return this.f129139e;
            }
        }
        if (!this.f129140f) {
            SQLiteDatabase sQLiteDatabase = this.f129139e;
            try {
                this.f129140f = true;
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.mo107194l()) {
                        synchronized (sQLiteDatabase.f129059a) {
                            sQLiteDatabase.mo107200r();
                            if (sQLiteDatabase.mo107195m()) {
                                int i3 = sQLiteDatabase.f129060b.f129120d;
                                sQLiteDatabase.f129060b.f129120d = (sQLiteDatabase.f129060b.f129120d & -2) | 0;
                                try {
                                    sQLiteDatabase.f129061c.mo107211a(sQLiteDatabase.f129060b);
                                } catch (RuntimeException e) {
                                    sQLiteDatabase.f129060b.f129120d = i3;
                                    throw e;
                                }
                            }
                        }
                    }
                } else if (this.f129137c == null) {
                    sQLiteDatabase = SQLiteDatabase.m110941a(":memory:", null, null, null, 268435456, null, 0);
                } else {
                    boolean z2 = this.f129142h;
                    this.f129147m = true;
                    if (this.f129141g) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    this.f129146l = i;
                    Context context = this.f129135a;
                    String str = this.f129137c;
                    byte[] bArr = this.f129144j;
                    SQLiteCipherSpec sQLiteCipherSpec = this.f129145k;
                    int i4 = this.f129146l;
                    C51753a aVar = this.f129136b;
                    C51778h hVar = this.f129143i;
                    if (str.charAt(0) == File.separatorChar) {
                        file = new File(str.substring(0, str.lastIndexOf(File.separatorChar)));
                        file2 = new File(file, str.substring(str.lastIndexOf(File.separatorChar)));
                    } else if (context != null) {
                        String str2 = context.getApplicationInfo().dataDir;
                        if (str2 != null) {
                            file3 = new File(str2);
                        }
                        File file4 = new File(file3, "databases");
                        if (file4.getPath().equals("databases")) {
                            file = new File("/data/system");
                        } else {
                            file = file4;
                        }
                        if (str.indexOf(File.separatorChar) < 0) {
                            file2 = new File(file, str);
                        } else {
                            StringBuilder sb = new StringBuilder("File ");
                            sb.append(str);
                            sb.append(" contains a path separator");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new RuntimeException("Not supported in system context");
                    }
                    if (!file.isDirectory() && file.mkdir()) {
                        FileUtils.setPermissions(file.getPath(), 505, -1, -1);
                    }
                    if ((i4 & 8) != 0) {
                        i2 = 805306368;
                    } else {
                        i2 = 268435456;
                    }
                    SQLiteDatabase a = SQLiteDatabase.m110941a(file2.getPath(), bArr, sQLiteCipherSpec, aVar, i2, hVar, z2 ? 1 : 0);
                    String path = file2.getPath();
                    int i5 = 432;
                    if ((i4 & 1) != 0) {
                        i5 = 436;
                    }
                    if ((i4 & 2) != 0) {
                        i5 |= 2;
                    }
                    FileUtils.setPermissions(path, i5, -1, -1);
                    sQLiteDatabase = a;
                }
                SQLiteDatabase d = m111014d(sQLiteDatabase);
                this.f129140f = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.f129139e)) {
                    sQLiteDatabase.close();
                }
                return d;
            } catch (SQLiteException e2) {
                throw e2;
            } catch (Throwable th) {
                this.f129140f = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.f129139e)) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("getDatabase called recursively");
        }
    }

    /* renamed from: b */
    public void mo20984b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new SQLiteException(sb.toString());
    }

    public C51766i(Context context, String str, byte[] bArr, C51753a aVar, int i, C51778h hVar) {
        this(context, str, bArr, null, aVar, i, hVar);
    }

    private C51766i(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C51753a aVar, int i, C51778h hVar) {
        if (i > 0) {
            this.f129135a = context;
            this.f129137c = str;
            this.f129136b = aVar;
            this.f129138d = i;
            this.f129143i = hVar;
            this.f129144j = bArr;
            this.f129145k = null;
            this.f129147m = false;
            return;
        }
        StringBuilder sb = new StringBuilder("Version must be >= 1, was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
