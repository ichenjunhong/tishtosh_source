package p2699pl.droidsonroids.p2700a;

import android.content.Context;
import android.util.Log;
import com.C2240a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p2699pl.droidsonroids.p2700a.C53862c.C53863a;
import p2699pl.droidsonroids.p2700a.C53862c.C53864b;
import p2699pl.droidsonroids.p2700a.C53862c.C53865c;
import p2699pl.droidsonroids.p2700a.p2701a.C53856f;

/* renamed from: pl.droidsonroids.a.d */
public final class C53866d {

    /* renamed from: a */
    protected final Set<String> f133470a;

    /* renamed from: b */
    protected final C53864b f133471b;

    /* renamed from: c */
    protected final C53863a f133472c;

    /* renamed from: d */
    protected boolean f133473d;

    /* renamed from: e */
    protected boolean f133474e;

    protected C53866d() {
        this(new C53869e(), new C53845a());
    }

    /* renamed from: a */
    private static File m114503a(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: a */
    public final void mo113865a(String str, Object... objArr) {
        C2240a.m6773a(Locale.US, str, objArr);
    }

    private C53866d(C53864b bVar, C53863a aVar) {
        this.f133470a = new HashSet();
        this.f133471b = bVar;
        this.f133472c = aVar;
    }

    /* renamed from: b */
    private File m114504b(Context context, String str, String str2) {
        String c = this.f133471b.mo113861c(str);
        if (C53871g.m114515a(str2)) {
            return new File(m114503a(context), c);
        }
        File a = m114503a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return new File(a, sb.toString());
    }

    /* renamed from: a */
    public final void mo113863a(Context context, String str, String str2) {
        C53856f fVar;
        C53856f fVar2;
        if (!this.f133470a.contains(str) || this.f133473d) {
            try {
                this.f133471b.mo113858a(str);
                this.f133470a.add(str);
                mo113865a("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                mo113865a("Loading the library normally failed: %s", Log.getStackTraceString(e));
                mo113865a("%s (%s) was not loaded normally, re-linking...", str, str2);
                File b = m114504b(context, str, str2);
                if (!b.exists() || this.f133473d) {
                    if (this.f133473d) {
                        mo113865a("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    File a = m114503a(context);
                    File b2 = m114504b(context, str, str2);
                    final String c = this.f133471b.mo113861c(str);
                    File[] listFiles = a.listFiles(new FilenameFilter() {
                        public final boolean accept(File file, String str) {
                            return str.startsWith(c);
                        }
                    });
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (this.f133473d || !file.getAbsolutePath().equals(b2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    this.f133472c.mo113849a(context, this.f133471b.mo113859a(), this.f133471b.mo113861c(str), b, this);
                }
                try {
                    if (this.f133474e) {
                        fVar = null;
                        fVar2 = new C53856f(b);
                        List<String> a2 = fVar2.mo113854a();
                        fVar2.close();
                        for (String d : a2) {
                            mo113864a(context, this.f133471b.mo113862d(d), null, null);
                        }
                    }
                } catch (IOException unused) {
                }
                this.f133471b.mo113860b(b.getAbsolutePath());
                this.f133470a.add(str);
                mo113865a("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th) {
                th = th;
                fVar = fVar2;
                fVar.close();
                throw th;
            }
        } else {
            mo113865a("%s already loaded previously!", str);
        }
    }

    /* renamed from: a */
    public final void mo113864a(Context context, String str, String str2, C53865c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C53871g.m114515a(str)) {
            mo113865a("Beginning load of %s...", str);
            if (cVar == null) {
                mo113863a(context, str, str2);
                return;
            }
            final Context context2 = context;
            final String str3 = str;
            final String str4 = str2;
            final C53865c cVar2 = cVar;
            C538671 r1 = new Runnable() {
                public final void run() {
                    try {
                        C53866d.this.mo113863a(context2, str3, str4);
                    } catch (UnsatisfiedLinkError unused) {
                    } catch (C53861b unused2) {
                    }
                }
            };
            new Thread(r1).start();
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }
}
