package com.p683ss.android.download;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import com.p683ss.ttm.player.MediaPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.download.d */
public final class C19105d {

    /* renamed from: a */
    public static final String[] f52636a = {"_id", "_data AS local_filename", "mediaprovider_uri", "destination", "title", "description", "uri", "status", "hint", "mimetype AS media_type", "total_bytes AS total_size", "lastmod AS last_modified_timestamp", "current_bytes AS bytes_so_far", "allow_write", "etag", "'placeholder' AS local_uri", "'placeholder' AS reason"};

    /* renamed from: g */
    private static C19105d f52637g;

    /* renamed from: b */
    private Context f52638b;

    /* renamed from: c */
    private ContentResolver f52639c;

    /* renamed from: d */
    private C19117g f52640d;

    /* renamed from: e */
    private String f52641e;

    /* renamed from: f */
    private Uri f52642f = C19097a.f52584a;

    /* renamed from: com.ss.android.download.d$a */
    static class C19106a extends CursorWrapper {

        /* renamed from: a */
        private Uri f52643a;

        public final int getInt(int i) {
            return (int) getLong(i);
        }

        public final String getString(int i) {
            String str;
            if (getColumnName(i).equals("local_uri")) {
                long j = getLong(getColumnIndex("destination"));
                if (j == 1 || j == 0) {
                    String string = getString(getColumnIndex("local_filename"));
                    if (string == null) {
                        str = null;
                    } else {
                        str = Uri.fromFile(new File(string)).toString();
                    }
                } else {
                    return ContentUris.withAppendedId(this.f52643a, getLong(getColumnIndex("_id"))).toString();
                }
            } else {
                str = super.getString(i);
            }
            return str;
        }

        public final long getLong(int i) {
            long j;
            if (getColumnName(i).equals("reason")) {
                int i2 = super.getInt(getColumnIndex("status"));
                int a = C19105d.m46542a(i2);
                if (a == 4) {
                    switch (i2) {
                        case 194:
                            j = 1;
                            break;
                        case 195:
                            j = 2;
                            break;
                        case 196:
                            j = 3;
                            break;
                        default:
                            return 4;
                    }
                } else if (a != 16) {
                    j = 0;
                } else if ((400 > i2 || i2 >= 488) && (500 > i2 || i2 >= 600)) {
                    switch (i2) {
                        case 198:
                            j = 1006;
                            break;
                        case 199:
                            j = 1007;
                            break;
                        case 488:
                            j = 1009;
                            break;
                        case 489:
                            j = 1008;
                            break;
                        case 492:
                            j = 1001;
                            break;
                        case 493:
                        case 494:
                            j = 1002;
                            break;
                        case 495:
                            j = 1004;
                            break;
                        case 497:
                            j = 1005;
                            break;
                        default:
                            return 1000;
                    }
                } else {
                    j = (long) i2;
                }
                return j;
            } else if (getColumnName(i).equals("status")) {
                return (long) C19105d.m46542a(super.getInt(getColumnIndex("status")));
            } else {
                return super.getLong(i);
            }
        }

        public C19106a(Cursor cursor, Uri uri) {
            super(cursor);
            this.f52643a = uri;
        }
    }

    /* renamed from: com.ss.android.download.d$b */
    public class C19107b {

        /* renamed from: a */
        public long f52644a = -1;

        /* renamed from: b */
        public int f52645b = -1;

        /* renamed from: c */
        public long f52646c = -1;

        /* renamed from: d */
        public long f52647d = -1;

        /* renamed from: e */
        public String f52648e;

        public C19107b() {
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (!(obj instanceof C19107b) || obj == null) {
                return super.equals(obj);
            }
            C19107b bVar = (C19107b) obj;
            if (this.f52644a == bVar.f52644a) {
                z = true;
            } else {
                z = false;
            }
            if (this.f52645b == bVar.f52645b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f52646c == bVar.f52646c) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((!TextUtils.isEmpty(this.f52648e) || !TextUtils.isEmpty(bVar.f52648e)) && (TextUtils.isEmpty(this.f52648e) || TextUtils.isEmpty(bVar.f52648e) || !this.f52648e.equals(bVar.f52648e))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z || !z2 || !z3 || !z4) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.download.d$c */
    public static class C19108c {

        /* renamed from: a */
        private long[] f52650a;

        /* renamed from: b */
        private String[] f52651b;

        /* renamed from: c */
        private Integer f52652c;

        /* renamed from: d */
        private String f52653d = "lastmod";

        /* renamed from: e */
        private int f52654e = 2;

        /* renamed from: f */
        private boolean f52655f;

        /* renamed from: a */
        public final C19108c mo39040a(long... jArr) {
            this.f52650a = jArr;
            return this;
        }

        /* renamed from: a */
        private static String m46555a(String str, int i) {
            StringBuilder sb = new StringBuilder("status");
            sb.append(str);
            sb.append("'");
            sb.append(i);
            sb.append("'");
            return sb.toString();
        }

        /* renamed from: a */
        private static String m46556a(String str, Iterable<String> iterable) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (String str2 : iterable) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(str2);
                z = false;
            }
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Cursor mo39039a(C19117g gVar, String[] strArr, Uri uri) {
            String[] strArr2;
            String str;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f52650a != null) {
                arrayList.add(C19105d.m46547b(this.f52650a));
                arrayList2.addAll(Arrays.asList(C19105d.m46549c(this.f52650a)));
            }
            if (this.f52651b != null) {
                arrayList.add(C19105d.m46544a(this.f52651b));
                arrayList2.addAll(Arrays.asList(C19105d.m46548b(this.f52651b)));
            }
            if (this.f52652c != null) {
                ArrayList arrayList3 = new ArrayList();
                if ((this.f52652c.intValue() & 1) != 0) {
                    arrayList3.add(m46555a("=", 190));
                }
                if ((this.f52652c.intValue() & 2) != 0) {
                    arrayList3.add(m46555a("=", 192));
                }
                if ((this.f52652c.intValue() & 4) != 0) {
                    arrayList3.add(m46555a("=", 193));
                    arrayList3.add(m46555a("=", 194));
                    arrayList3.add(m46555a("=", 195));
                    arrayList3.add(m46555a("=", 196));
                }
                if ((this.f52652c.intValue() & 8) != 0) {
                    arrayList3.add(m46555a("=", 200));
                }
                if ((this.f52652c.intValue() & 16) != 0) {
                    StringBuilder sb = new StringBuilder("(");
                    sb.append(m46555a(">=", (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
                    sb.append(" AND ");
                    sb.append(m46555a("<", 600));
                    sb.append(")");
                    arrayList3.add(sb.toString());
                }
                arrayList.add(m46556a(" OR ", (Iterable<String>) arrayList3));
            }
            if (this.f52655f) {
                arrayList.add("is_visible_in_downloads_ui != '0'");
            }
            arrayList.add("deleted != '1'");
            String a = m46556a(" AND ", (Iterable<String>) arrayList);
            try {
                strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } catch (ArrayStoreException unused) {
                strArr2 = null;
            }
            if (this.f52654e == 1) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f52653d);
            sb2.append(" ");
            sb2.append(str);
            try {
                return gVar.mo39054a(uri, strArr, a, strArr2, sb2.toString());
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static int m46542a(int i) {
        switch (i) {
            case 190:
                return 1;
            case 192:
                return 2;
            case 193:
            case 194:
            case 195:
            case 196:
                return 4;
            case 200:
            case 201:
                return 8;
            default:
                return 16;
        }
    }

    /* renamed from: a */
    public final Cursor mo39034a(C19108c cVar) {
        Cursor a = cVar.mo39039a(this.f52640d, f52636a, this.f52642f);
        if (a == null) {
            return null;
        }
        return new C19106a(a, this.f52642f);
    }

    /* renamed from: b */
    static String[] m46548b(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i];
        }
        return strArr2;
    }

    /* renamed from: a */
    public static synchronized C19105d m46543a(Context context) {
        C19105d dVar;
        synchronized (C19105d.class) {
            if (f52637g == null) {
                f52637g = new C19105d(context, context.getPackageName());
            }
            dVar = f52637g;
        }
        return dVar;
    }

    /* renamed from: c */
    static String[] m46549c(long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        return strArr;
    }

    /* renamed from: b */
    static String m46547b(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                sb.append("OR ");
            }
            sb.append("_id");
            sb.append(" = ? ");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    static String m46544a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append("OR ");
            }
            sb.append("uri");
            sb.append(" = ? ");
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46551e(long... r6) {
        /*
            r5 = this;
            com.ss.android.download.d$c r0 = new com.ss.android.download.d$c
            r0.<init>()
            com.ss.android.download.d$c r0 = r0.mo39040a(r6)
            android.database.Cursor r0 = r5.mo39034a(r0)
            r0.moveToFirst()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
        L_0x0010:
            boolean r1 = r0.isAfterLast()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2 = 4
            if (r1 != r2) goto L_0x0027
            r0.moveToNext()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            goto L_0x0010
        L_0x0027:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r3 = "Cann only resume a paused download: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r3 = "_id"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            long r3 = r0.getLong(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2.append(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            throw r1     // Catch:{ Exception -> 0x0052, all -> 0x004b }
        L_0x0045:
            if (r0 == 0) goto L_0x0055
        L_0x0047:
            r0.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0055
        L_0x004b:
            r6 = move-exception
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            throw r6
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0047
        L_0x0055:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "status"
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "control"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.ss.android.download.g r1 = r5.f52640d
            android.net.Uri r2 = r5.f52642f
            java.lang.String r3 = m46547b(r6)
            java.lang.String[] r6 = m46549c(r6)
            r1.mo39052a(r2, r0, r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19105d.m46551e(long[]):void");
    }

    /* renamed from: d */
    private void m46550d(long... jArr) {
        Cursor a = mo39034a(new C19108c().mo39040a(jArr));
        try {
            a.moveToFirst();
            while (!a.isAfterLast()) {
                int i = a.getInt(a.getColumnIndex("status"));
                if (i != 2) {
                    if (i != 1) {
                        StringBuilder sb = new StringBuilder("Can only pause a running download: ");
                        sb.append(a.getLong(a.getColumnIndex("_id")));
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                a.moveToNext();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("control", Integer.valueOf(1));
            contentValues.put("no_integrity", Integer.valueOf(1));
            this.f52640d.mo39052a(this.f52642f, contentValues, m46547b(jArr), m46549c(jArr));
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused3) {
                }
            }
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused4) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r8 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r8.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39032a(long r8) {
        /*
            r7 = this;
            android.net.Uri r0 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r0, r8)
            android.content.Context r8 = r7.f52638b
            com.ss.android.download.g r1 = com.p683ss.android.download.C19117g.m46591a(r8)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.mo39054a(r2, r3, r4, r5, r6)
            r9 = -1
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "status"
            int r0 = com.p683ss.android.download.C19109e.m46559a(r8, r0)     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            r9 = r0
        L_0x0022:
            if (r8 == 0) goto L_0x0032
        L_0x0024:
            r8.close()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0032
        L_0x0028:
            r9 = move-exception
            if (r8 == 0) goto L_0x002e
            r8.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            throw r9
        L_0x002f:
            if (r8 == 0) goto L_0x0032
            goto L_0x0024
        L_0x0032:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19105d.mo39032a(long):int");
    }

    /* renamed from: a */
    public final int mo39033a(long... jArr) {
        if (jArr != null) {
            try {
                if (jArr.length != 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("deleted", Integer.valueOf(1));
                    if (jArr.length == 1) {
                        return this.f52640d.mo39052a(ContentUris.withAppendedId(this.f52642f, jArr[0]), contentValues, (String) null, (String[]) null);
                    }
                    return this.f52640d.mo39052a(this.f52642f, contentValues, m46547b(jArr), m46549c(jArr));
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        throw new IllegalArgumentException("input param 'ids' can't be null");
    }

    private C19105d(Context context, String str) {
        this.f52638b = context.getApplicationContext();
        this.f52639c = context.getApplicationContext().getContentResolver();
        this.f52640d = C19117g.m46591a(this.f52638b.getApplicationContext());
        this.f52641e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46545a(int r5, long... r6) {
        /*
            r4 = this;
            com.ss.android.download.d$c r5 = new com.ss.android.download.d$c
            r5.<init>()
            com.ss.android.download.d$c r5 = r5.mo39040a(r6)
            android.database.Cursor r5 = r4.mo39034a(r5)
            r5.moveToFirst()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
        L_0x0010:
            boolean r0 = r5.isAfterLast()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "status"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            int r0 = r5.getInt(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r1 = 8
            if (r0 == r1) goto L_0x0047
            r1 = 16
            if (r0 != r1) goto L_0x0029
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r2 = "Cannot restart incomplete download: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r2 = "_id"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r1.append(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            throw r0     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
        L_0x0047:
            r5.moveToNext()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            goto L_0x0010
        L_0x004b:
            if (r5 == 0) goto L_0x005b
        L_0x004d:
            r5.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005b
        L_0x0051:
            r6 = move-exception
            if (r5 == 0) goto L_0x0057
            r5.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            throw r6
        L_0x0058:
            if (r5 == 0) goto L_0x005b
            goto L_0x004d
        L_0x005b:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r0 = "current_bytes"
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r2)
            java.lang.String r0 = "total_bytes"
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r0, r2)
            java.lang.String r0 = "_data"
            r5.putNull(r0)
            java.lang.String r0 = "status"
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r0, r2)
            java.lang.String r0 = "numfailed"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            java.lang.String r0 = "visibility"
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            com.ss.android.download.g r0 = r4.f52640d
            android.net.Uri r1 = r4.f52642f
            java.lang.String r2 = m46547b(r6)
            java.lang.String[] r6 = m46549c(r6)
            r0.mo39052a(r1, r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19105d.m46545a(int, long[]):void");
    }

    /* renamed from: a */
    public static void m46546a(Context context, int i, long j) {
        if (context != null && j >= 0) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        switch (i) {
                            case 1:
                            case 2:
                                if (j >= 0) {
                                    try {
                                        m46543a(context).m46550d(j);
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                }
                                break;
                        }
                    } else if (j >= 0) {
                        m46543a(context).m46545a(1, j);
                    }
                } else if (j >= 0) {
                    C19132q.m46638a(context, j, 268435456, true);
                }
            }
            if (j >= 0) {
                m46543a(context).m46551e(j);
            }
        }
    }
}
