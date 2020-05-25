package android.arch.p011c.p012a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import java.io.File;

/* renamed from: android.arch.c.a.c */
public interface C0119c {

    /* renamed from: android.arch.c.a.c$a */
    public static abstract class C0120a {

        /* renamed from: a */
        public final int f287a;

        /* renamed from: a */
        public abstract void mo206a(C0118b bVar);

        /* renamed from: a */
        public abstract void mo207a(C0118b bVar, int i, int i2);

        /* renamed from: b */
        public void mo208b(C0118b bVar) {
        }

        public C0120a(int i) {
            this.f287a = i;
        }

        /* renamed from: a */
        public static void m259a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else {
                        try {
                            new File(str).delete();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: b */
        public void mo209b(C0118b bVar, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }
    }

    /* renamed from: android.arch.c.a.c$b */
    public static class C0121b {

        /* renamed from: a */
        public final Context f288a;

        /* renamed from: b */
        public final String f289b;

        /* renamed from: c */
        public final C0120a f290c;

        /* renamed from: android.arch.c.a.c$b$a */
        public static class C0122a {

            /* renamed from: a */
            Context f291a;

            /* renamed from: b */
            String f292b;

            /* renamed from: c */
            C0120a f293c;

            /* renamed from: a */
            public final C0121b mo212a() {
                if (this.f293c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f291a != null) {
                    return new C0121b(this.f291a, this.f292b, this.f293c);
                } else {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
            }

            /* renamed from: a */
            public final C0122a mo210a(C0120a aVar) {
                this.f293c = aVar;
                return this;
            }

            C0122a(Context context) {
                this.f291a = context;
            }

            /* renamed from: a */
            public final C0122a mo211a(String str) {
                this.f292b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static C0122a m264a(Context context) {
            return new C0122a(context);
        }

        C0121b(Context context, String str, C0120a aVar) {
            this.f288a = context;
            this.f289b = str;
            this.f290c = aVar;
        }
    }

    /* renamed from: android.arch.c.a.c$c */
    public interface C0123c {
        /* renamed from: a */
        C0119c mo197a(C0121b bVar);
    }

    /* renamed from: a */
    C0118b mo187a();

    /* renamed from: a */
    void mo188a(boolean z);
}
