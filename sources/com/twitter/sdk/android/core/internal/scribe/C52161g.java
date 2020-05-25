package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C2240a;
import com.twitter.sdk.android.core.internal.C52114g;
import com.twitter.sdk.android.core.internal.C52115h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.g */
public abstract class C52161g<T> {

    /* renamed from: a */
    protected final Context f129837a;

    /* renamed from: b */
    protected final C52160f<T> f129838b;

    /* renamed from: c */
    protected final C52115h f129839c;

    /* renamed from: d */
    protected final C52168m f129840d;

    /* renamed from: e */
    public final int f129841e;

    /* renamed from: f */
    public volatile long f129842f;

    /* renamed from: g */
    protected final List<C52169n> f129843g = new CopyOnWriteArrayList();

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.g$a */
    static class C52162a {

        /* renamed from: a */
        final File f129844a;

        /* renamed from: b */
        final long f129845b;

        C52162a(File file, long j) {
            this.f129844a = file;
            this.f129845b = j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo108885b();

    /* renamed from: c */
    public final List<File> mo108886c() {
        return this.f129840d.mo108896a(1);
    }

    /* renamed from: a */
    public final boolean mo108884a() throws IOException {
        String str;
        boolean z = true;
        if (!this.f129840d.mo108901b()) {
            str = mo108885b();
            this.f129840d.mo108897a(str);
            C52114g.m111463a(this.f129837a, 4, "Twitter", C2240a.m6773a(Locale.US, "generated new file %s", new Object[]{str}));
            this.f129842f = this.f129839c.mo108816a();
        } else {
            str = null;
            z = false;
        }
        m111552a(str);
        return z;
    }

    /* renamed from: d */
    public final void mo108887d() {
        List<File> c = this.f129840d.mo108902c();
        int i = this.f129841e;
        if (c.size() > i) {
            int size = c.size() - i;
            C52114g.m111464a(this.f129837a, C2240a.m6773a(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(i), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(C52163h.f129846a);
            for (File file : c) {
                treeSet.add(new C52162a(file, m111553b(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C52162a) it.next()).f129844a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f129840d.mo108898a((List<File>) arrayList);
        }
    }

    /* renamed from: a */
    public final void mo108881a(C52169n nVar) {
        this.f129843g.add(nVar);
    }

    /* renamed from: a */
    public final void mo108883a(List<File> list) {
        this.f129840d.mo108898a(list);
    }

    /* renamed from: a */
    private void m111552a(String str) {
        for (C52169n a : this.f129843g) {
            try {
                a.mo108891a(str);
            } catch (Exception e) {
                C52114g.m111465a(this.f129837a, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    private static long m111553b(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo108882a(T t) throws IOException {
        byte[] a = this.f129838b.mo108880a(t);
        int length = a.length;
        if (!this.f129840d.mo108900a(length, 8000)) {
            C52114g.m111463a(this.f129837a, 4, "Twitter", C2240a.m6773a(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f129840d.mo108895a()), Integer.valueOf(length), Integer.valueOf(8000)}));
            mo108884a();
        }
        this.f129840d.mo108899a(a);
    }

    C52161g(Context context, C52160f<T> fVar, C52115h hVar, C52168m mVar, int i) throws IOException {
        this.f129837a = context.getApplicationContext();
        this.f129838b = fVar;
        this.f129840d = mVar;
        this.f129839c = hVar;
        this.f129842f = this.f129839c.mo108816a();
        this.f129841e = i;
    }
}
