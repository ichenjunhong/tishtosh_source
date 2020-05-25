package androidx.work.impl.p056b;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.arch.p011c.p014b.p016b.C0130a;
import android.database.Cursor;
import androidx.work.C1531a;
import androidx.work.C1534c;
import androidx.work.C1538e;
import androidx.work.C1542h;
import androidx.work.C1543i.C1544a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.i */
public final class C1586i implements C1585h {

    /* renamed from: a */
    public final C0142f f5618a;

    /* renamed from: b */
    private final C0136c f5619b;

    /* renamed from: c */
    private final C0151j f5620c;

    /* renamed from: d */
    private final C0151j f5621d;

    /* renamed from: e */
    private final C0151j f5622e;

    /* renamed from: f */
    private final C0151j f5623f;

    /* renamed from: g */
    private final C0151j f5624g;

    /* renamed from: h */
    private final C0151j f5625h;

    /* renamed from: i */
    private final C0151j f5626i;

    /* renamed from: j */
    private final C0151j f5627j;

    /* renamed from: a */
    public final List<String> mo5991a() {
        C0150i a = C0150i.m334a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor a2 = this.f5618a.mo241a((C0125e) a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: b */
    public final int mo5995b() {
        C0126f b = this.f5626i.mo264b();
        this.f5618a.mo246c();
        try {
            int a = b.mo204a();
            this.f5618a.mo248e();
            return a;
        } finally {
            this.f5618a.mo247d();
            this.f5626i.mo263a(b);
        }
    }

    /* renamed from: c */
    public final int mo5998c(String str) {
        C0126f b = this.f5624g.mo264b();
        this.f5618a.mo246c();
        if (str == null) {
            try {
                b.mo198a(1);
            } catch (Throwable th) {
                this.f5618a.mo247d();
                this.f5624g.mo263a(b);
                throw th;
            }
        } else {
            b.mo201a(1, str);
        }
        int a = b.mo204a();
        this.f5618a.mo248e();
        this.f5618a.mo247d();
        this.f5624g.mo263a(b);
        return a;
    }

    /* renamed from: d */
    public final C1544a mo5999d(String str) {
        C1544a aVar;
        C0150i a = C0150i.m334a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f5618a.mo241a((C0125e) a);
        try {
            if (a2.moveToFirst()) {
                aVar = C1600m.m5640a(a2.getInt(0));
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    public C1586i(C0142f fVar) {
        this.f5618a = fVar;
        this.f5619b = new C0136c<C1583g>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public final /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                int i;
                C0126f fVar2 = fVar;
                C1583g gVar = (C1583g) obj;
                if (gVar.f5602a == null) {
                    fVar2.mo198a(1);
                } else {
                    fVar2.mo201a(1, gVar.f5602a);
                }
                int i2 = 2;
                fVar2.mo200a(2, (long) C1600m.m5638a(gVar.f5603b));
                if (gVar.f5604c == null) {
                    fVar2.mo198a(3);
                } else {
                    fVar2.mo201a(3, gVar.f5604c);
                }
                if (gVar.f5605d == null) {
                    fVar2.mo198a(4);
                } else {
                    fVar2.mo201a(4, gVar.f5605d);
                }
                byte[] a = C1538e.m5494a(gVar.f5606e);
                if (a == null) {
                    fVar2.mo198a(5);
                } else {
                    fVar2.mo202a(5, a);
                }
                byte[] a2 = C1538e.m5494a(gVar.f5607f);
                if (a2 == null) {
                    fVar2.mo198a(6);
                } else {
                    fVar2.mo202a(6, a2);
                }
                fVar2.mo200a(7, gVar.f5608g);
                fVar2.mo200a(8, gVar.f5609h);
                fVar2.mo200a(9, gVar.f5610i);
                fVar2.mo200a(10, (long) gVar.f5612k);
                C1531a aVar = gVar.f5613l;
                switch (C16011.f5643b[aVar.ordinal()]) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(aVar);
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                }
                fVar2.mo200a(11, (long) i);
                fVar2.mo200a(12, gVar.f5614m);
                fVar2.mo200a(13, gVar.f5615n);
                fVar2.mo200a(14, gVar.f5616o);
                fVar2.mo200a(15, gVar.f5617p);
                C1534c cVar = gVar.f5611j;
                if (cVar != null) {
                    C1542h hVar = cVar.f5519b;
                    switch (C16011.f5644c[hVar.ordinal()]) {
                        case 1:
                            i2 = 0;
                            break;
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            break;
                        case 4:
                            i2 = 3;
                            break;
                        case 5:
                            i2 = 4;
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder("Could not convert ");
                            sb2.append(hVar);
                            sb2.append(" to int");
                            throw new IllegalArgumentException(sb2.toString());
                    }
                    fVar2.mo200a(16, (long) i2);
                    fVar2.mo200a(17, cVar.f5520c ? 1 : 0);
                    fVar2.mo200a(18, cVar.f5521d ? 1 : 0);
                    fVar2.mo200a(19, cVar.f5522e ? 1 : 0);
                    fVar2.mo200a(20, cVar.f5523f ? 1 : 0);
                    byte[] a3 = C1600m.m5641a(cVar.f5524g);
                    if (a3 == null) {
                        fVar2.mo198a(21);
                    } else {
                        fVar2.mo202a(21, a3);
                    }
                } else {
                    fVar2.mo198a(16);
                    fVar2.mo198a(17);
                    fVar2.mo198a(18);
                    fVar2.mo198a(19);
                    fVar2.mo198a(20);
                    fVar2.mo198a(21);
                }
            }
        };
        this.f5620c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.f5621d = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.f5622e = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f5623f = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.f5624g = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.f5625h = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.f5626i = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.f5627j = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    /* renamed from: b */
    public final int mo5996b(String str) {
        C0126f b = this.f5623f.mo264b();
        this.f5618a.mo246c();
        if (str == null) {
            try {
                b.mo198a(1);
            } catch (Throwable th) {
                this.f5618a.mo247d();
                this.f5623f.mo263a(b);
                throw th;
            }
        } else {
            b.mo201a(1, str);
        }
        int a = b.mo204a();
        this.f5618a.mo248e();
        this.f5618a.mo247d();
        this.f5623f.mo263a(b);
        return a;
    }

    /* renamed from: e */
    public final List<C1538e> mo6000e(String str) {
        C0150i a = C0150i.m334a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f5618a.mo241a((C0125e) a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(C1538e.m5493a(a2.getBlob(0)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: a */
    public final C1583g mo5990a(String str) {
        C0150i iVar;
        C1583g gVar;
        boolean z;
        boolean z2;
        boolean z3;
        String str2 = str;
        C0150i a = C0150i.m334a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str2);
        }
        Cursor a2 = this.f5618a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            iVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("content_uri_triggers");
                if (a2.moveToFirst()) {
                    String string = a2.getString(columnIndexOrThrow);
                    String string2 = a2.getString(columnIndexOrThrow3);
                    int i6 = columnIndexOrThrow9;
                    C1534c cVar = new C1534c();
                    cVar.f5519b = C1600m.m5643c(a2.getInt(columnIndexOrThrow16));
                    int i7 = a2.getInt(columnIndexOrThrow17);
                    boolean z4 = false;
                    if (i7 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5520c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5521d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5522e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    }
                    cVar.f5523f = z4;
                    cVar.f5524g = C1600m.m5639a(a2.getBlob(columnIndexOrThrow21));
                    gVar = new C1583g(string, string2);
                    gVar.f5603b = C1600m.m5640a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5605d = a2.getString(columnIndexOrThrow4);
                    gVar.f5606e = C1538e.m5493a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5607f = C1538e.m5493a(a2.getBlob(columnIndexOrThrow6));
                    gVar.f5608g = a2.getLong(columnIndexOrThrow7);
                    gVar.f5609h = a2.getLong(columnIndexOrThrow8);
                    gVar.f5610i = a2.getLong(i6);
                    gVar.f5612k = a2.getInt(i5);
                    gVar.f5613l = C1600m.m5642b(a2.getInt(i4));
                    gVar.f5614m = a2.getLong(i3);
                    gVar.f5615n = a2.getLong(i2);
                    gVar.f5616o = a2.getLong(i);
                    gVar.f5617p = a2.getLong(columnIndexOrThrow15);
                    gVar.f5611j = cVar;
                } else {
                    gVar = null;
                }
                a2.close();
                iVar.mo261b();
                return gVar;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo261b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo261b();
            throw th;
        }
    }

    /* renamed from: a */
    public final List<C1583g> mo5992a(int i) {
        C0150i iVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0150i a = C0150i.m334a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a.mo200a(1, (long) i);
        Cursor a2 = this.f5618a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            iVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("content_uri_triggers");
                int i7 = columnIndexOrThrow9;
                int i8 = columnIndexOrThrow8;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(columnIndexOrThrow);
                    int i9 = columnIndexOrThrow;
                    String string2 = a2.getString(columnIndexOrThrow3);
                    int i10 = columnIndexOrThrow3;
                    C1534c cVar = new C1534c();
                    int i11 = columnIndexOrThrow16;
                    cVar.f5519b = C1600m.m5643c(a2.getInt(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5520c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5521d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5522e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f5523f = z4;
                    cVar.f5524g = C1600m.m5639a(a2.getBlob(columnIndexOrThrow21));
                    C1583g gVar = new C1583g(string, string2);
                    gVar.f5603b = C1600m.m5640a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5605d = a2.getString(columnIndexOrThrow4);
                    gVar.f5606e = C1538e.m5493a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5607f = C1538e.m5493a(a2.getBlob(columnIndexOrThrow6));
                    int i12 = columnIndexOrThrow18;
                    gVar.f5608g = a2.getLong(columnIndexOrThrow7);
                    int i13 = columnIndexOrThrow4;
                    int i14 = columnIndexOrThrow5;
                    int i15 = i8;
                    gVar.f5609h = a2.getLong(i15);
                    int i16 = i7;
                    gVar.f5610i = a2.getLong(i16);
                    int i17 = i6;
                    gVar.f5612k = a2.getInt(i17);
                    int i18 = i5;
                    gVar.f5613l = C1600m.m5642b(a2.getInt(i18));
                    int i19 = i15;
                    int i20 = i16;
                    int i21 = i4;
                    gVar.f5614m = a2.getLong(i21);
                    int i22 = i17;
                    int i23 = i18;
                    int i24 = i3;
                    gVar.f5615n = a2.getLong(i24);
                    int i25 = i2;
                    gVar.f5616o = a2.getLong(i25);
                    int i26 = i24;
                    int i27 = i25;
                    int i28 = columnIndexOrThrow15;
                    gVar.f5617p = a2.getLong(i28);
                    gVar.f5611j = cVar;
                    arrayList.add(gVar);
                    columnIndexOrThrow15 = i28;
                    i4 = i21;
                    columnIndexOrThrow = i9;
                    columnIndexOrThrow3 = i10;
                    columnIndexOrThrow16 = i11;
                    columnIndexOrThrow18 = i12;
                    columnIndexOrThrow4 = i13;
                    columnIndexOrThrow5 = i14;
                    i8 = i19;
                    i7 = i20;
                    i6 = i22;
                    i5 = i23;
                    i3 = i26;
                    i2 = i27;
                }
                a2.close();
                iVar.mo261b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo261b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo261b();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo5989a(C1544a aVar, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        C0130a.m283a(sb, 1);
        sb.append(")");
        C0126f a = this.f5618a.mo239a(sb.toString());
        a.mo200a(1, (long) C1600m.m5638a(aVar));
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str == null) {
                a.mo198a(2);
            } else {
                a.mo201a(2, str);
            }
        }
        this.f5618a.mo246c();
        try {
            int a2 = a.mo204a();
            this.f5618a.mo248e();
            return a2;
        } finally {
            this.f5618a.mo247d();
        }
    }

    /* renamed from: a */
    public final void mo5993a(String str, long j) {
        C0126f b = this.f5622e.mo264b();
        this.f5618a.mo246c();
        try {
            b.mo200a(1, j);
            if (str == null) {
                b.mo198a(2);
            } else {
                b.mo201a(2, str);
            }
            b.mo204a();
            this.f5618a.mo248e();
        } finally {
            this.f5618a.mo247d();
            this.f5622e.mo263a(b);
        }
    }

    /* renamed from: b */
    public final int mo5997b(String str, long j) {
        C0126f b = this.f5625h.mo264b();
        this.f5618a.mo246c();
        try {
            b.mo200a(1, j);
            if (str == null) {
                b.mo198a(2);
            } else {
                b.mo201a(2, str);
            }
            int a = b.mo204a();
            this.f5618a.mo248e();
            return a;
        } finally {
            this.f5618a.mo247d();
            this.f5625h.mo263a(b);
        }
    }

    /* renamed from: a */
    public final void mo5994a(String str, C1538e eVar) {
        C0126f b = this.f5621d.mo264b();
        this.f5618a.mo246c();
        try {
            byte[] a = C1538e.m5494a(eVar);
            if (a == null) {
                b.mo198a(1);
            } else {
                b.mo202a(1, a);
            }
            if (str == null) {
                b.mo198a(2);
            } else {
                b.mo201a(2, str);
            }
            b.mo204a();
            this.f5618a.mo248e();
        } finally {
            this.f5618a.mo247d();
            this.f5621d.mo263a(b);
        }
    }
}
