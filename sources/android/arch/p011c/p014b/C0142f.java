package android.arch.p011c.p014b;

import android.app.ActivityManager;
import android.arch.p006a.p007a.C0040a;
import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0119c;
import android.arch.p011c.p012a.C0119c.C0123c;
import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p012a.p013a.C0115c;
import android.arch.p011c.p014b.p015a.C0128a;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0801o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: android.arch.c.b.f */
public abstract class C0142f {

    /* renamed from: a */
    public volatile C0118b f350a;

    /* renamed from: b */
    public C0119c f351b;

    /* renamed from: c */
    public final C0137d f352c = mo240a();

    /* renamed from: d */
    boolean f353d;

    /* renamed from: e */
    public List<C0144b> f354e;

    /* renamed from: f */
    public final ReentrantLock f355f = new ReentrantLock();

    /* renamed from: g */
    private boolean f356g;

    /* renamed from: android.arch.c.b.f$a */
    public static class C0143a<T extends C0142f> {

        /* renamed from: a */
        public ArrayList<C0144b> f357a;

        /* renamed from: b */
        public boolean f358b = true;

        /* renamed from: c */
        private final Class<T> f359c;

        /* renamed from: d */
        private final String f360d;

        /* renamed from: e */
        private final Context f361e;

        /* renamed from: f */
        private C0123c f362f;

        /* renamed from: g */
        private boolean f363g;

        /* renamed from: h */
        private C0145c f364h = C0145c.AUTOMATIC;

        /* renamed from: i */
        private final C0146d f365i = new C0146d();

        /* renamed from: j */
        private Set<Integer> f366j;

        /* renamed from: k */
        private Set<Integer> f367k;

        /* renamed from: a */
        public final C0143a<T> mo250a() {
            this.f363g = true;
            return this;
        }

        /* renamed from: b */
        public final T mo252b() {
            boolean z;
            if (this.f361e == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f359c != null) {
                if (!(this.f367k == null || this.f366j == null)) {
                    for (Integer num : this.f367k) {
                        if (this.f366j.contains(num)) {
                            StringBuilder sb = new StringBuilder("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                            sb.append(num);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                if (this.f362f == null) {
                    this.f362f = new C0115c();
                }
                Context context = this.f361e;
                String str = this.f360d;
                C0123c cVar = this.f362f;
                C0146d dVar = this.f365i;
                ArrayList<C0144b> arrayList = this.f357a;
                boolean z2 = this.f363g;
                C0145c cVar2 = this.f364h;
                Context context2 = this.f361e;
                if (cVar2 == C0145c.AUTOMATIC) {
                    if (VERSION.SDK_INT >= 16) {
                        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                        if (activityManager != null) {
                            if (VERSION.SDK_INT >= 19) {
                                z = activityManager.isLowRamDevice();
                            } else {
                                z = false;
                            }
                            if (!z) {
                                cVar2 = C0145c.WRITE_AHEAD_LOGGING;
                            }
                        }
                    }
                    cVar2 = C0145c.TRUNCATE;
                }
                C0127a aVar = new C0127a(context, str, cVar, dVar, arrayList, z2, cVar2, this.f358b, this.f366j);
                T t = (C0142f) C0141e.m303a(this.f359c, "_Impl");
                t.mo243a(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: a */
        public final C0143a<T> mo251a(C0128a... aVarArr) {
            if (this.f367k == null) {
                this.f367k = new HashSet();
            }
            for (C0128a aVar : aVarArr) {
                this.f367k.add(Integer.valueOf(aVar.f303a));
                this.f367k.add(Integer.valueOf(aVar.f304b));
            }
            this.f365i.mo255a(aVarArr);
            return this;
        }

        public C0143a(Context context, Class<T> cls, String str) {
            this.f361e = context;
            this.f359c = cls;
            this.f360d = str;
        }
    }

    /* renamed from: android.arch.c.b.f$b */
    public static abstract class C0144b {
        /* renamed from: a */
        public void mo253a(C0118b bVar) {
        }
    }

    /* renamed from: android.arch.c.b.f$c */
    public enum C0145c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* renamed from: android.arch.c.b.f$d */
    public static class C0146d {

        /* renamed from: a */
        private C0801o<C0801o<C0128a>> f369a = new C0801o<>();

        /* renamed from: a */
        public final void mo255a(C0128a... aVarArr) {
            for (C0128a aVar : aVarArr) {
                int i = aVar.f303a;
                int i2 = aVar.f304b;
                C0801o oVar = (C0801o) this.f369a.mo2591a(i);
                if (oVar == null) {
                    oVar = new C0801o();
                    this.f369a.mo2595b(i, oVar);
                }
                oVar.mo2598c(i2, aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<C0128a> mo254a(List<C0128a> list, boolean z, int i, int i2) {
            int i3;
            boolean z2;
            int i4;
            int i5;
            boolean z3;
            if (z) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C0801o oVar = (C0801o) this.f369a.mo2591a(i);
                if (oVar != null) {
                    int c = oVar.mo2596c();
                    z2 = false;
                    if (z) {
                        i5 = c - 1;
                        i4 = -1;
                    } else {
                        i4 = c;
                        i5 = 0;
                    }
                    while (true) {
                        if (i5 == i4) {
                            break;
                        }
                        int c2 = oVar.mo2597c(i5);
                        if (!z ? c2 < i2 || c2 >= i : c2 > i2 || c2 <= i) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            list.add(oVar.mo2600d(i5));
                            i = c2;
                            z2 = true;
                            continue;
                            break;
                        }
                        i5 += i3;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0137d mo240a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0119c mo244b(C0127a aVar);

    /* renamed from: e */
    public final void mo248e() {
        this.f351b.mo187a().mo179c();
    }

    /* renamed from: f */
    public final boolean mo249f() {
        return this.f351b.mo187a().mo182d();
    }

    /* renamed from: b */
    public final void mo245b() {
        if (!this.f356g && C0040a.m62a().mo57c()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: c */
    public final void mo246c() {
        mo245b();
        C0118b a = this.f351b.mo187a();
        this.f352c.mo235a(a);
        a.mo176a();
    }

    /* renamed from: d */
    public final void mo247d() {
        this.f351b.mo187a().mo178b();
        if (!mo249f()) {
            C0137d dVar = this.f352c;
            if (dVar.f333f.compareAndSet(false, true)) {
                C0040a.m62a().mo55a(dVar.f337j);
            }
        }
    }

    /* renamed from: a */
    public final C0126f mo239a(String str) {
        mo245b();
        return this.f351b.mo187a().mo174a(str);
    }

    /* renamed from: a */
    public final Cursor mo241a(C0125e eVar) {
        mo245b();
        return this.f351b.mo187a().mo175a(eVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo242a(C0118b bVar) {
        C0137d dVar = this.f352c;
        synchronized (dVar) {
            if (!dVar.f334g) {
                bVar.mo176a();
                try {
                    bVar.mo180c("PRAGMA temp_store = MEMORY;");
                    bVar.mo180c("PRAGMA recursive_triggers='ON';");
                    bVar.mo180c("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                    bVar.mo179c();
                    bVar.mo178b();
                    dVar.mo235a(bVar);
                    dVar.f335h = bVar.mo174a("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                    dVar.f334g = true;
                } catch (Throwable th) {
                    bVar.mo178b();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo243a(C0127a aVar) {
        this.f351b = mo244b(aVar);
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (aVar.f300g == C0145c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f351b.mo188a(z);
        }
        this.f354e = aVar.f298e;
        this.f356g = aVar.f299f;
        this.f353d = z;
    }
}
