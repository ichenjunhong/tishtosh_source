package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15428c.C15431c;
import com.google.android.gms.common.internal.C15428c.C15433e;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15453l;
import com.google.android.gms.common.internal.C15464q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C15211a<O extends C15215d> {

    /* renamed from: a */
    public final C15212a<?, O> f39276a;

    /* renamed from: b */
    public final String f39277b;

    /* renamed from: c */
    private final C15225i<?, O> f39278c = null;

    /* renamed from: d */
    private final C15223g<?> f39279d;

    /* renamed from: e */
    private final C15226j<?> f39280e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C15212a<T extends C15222f, O> extends C15221e<T, O> {
        /* renamed from: a */
        public abstract T mo27863a(Context context, Looper looper, C15441d dVar, O o, C15235b bVar, C15236c cVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C15213b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C15214c<C extends C15213b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C15215d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C15216a extends C15218c, C15219d {
            /* renamed from: a */
            Account mo28067a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C15217b extends C15218c {
            /* renamed from: a */
            GoogleSignInAccount mo28068a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C15218c extends C15215d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C15219d extends C15215d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C15220e extends C15218c, C15219d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C15221e<T extends C15213b, O> {
        /* renamed from: a */
        public List<Scope> mo27906a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C15222f extends C15213b {
        /* renamed from: a */
        void mo28069a(C15431c cVar);

        /* renamed from: a */
        void mo28070a(C15433e eVar);

        /* renamed from: a */
        void mo28071a(C15453l lVar, Set<Scope> set);

        /* renamed from: a */
        void mo28072a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: c */
        boolean mo27965c();

        /* renamed from: d */
        Intent mo27966d();

        /* renamed from: e */
        int mo27967e();

        /* renamed from: f */
        void mo28073f();

        /* renamed from: g */
        boolean mo28074g();

        /* renamed from: h */
        boolean mo28075h();

        /* renamed from: i */
        boolean mo28076i();

        /* renamed from: j */
        String mo28077j();

        /* renamed from: k */
        Feature[] mo28078k();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C15223g<C extends C15222f> extends C15214c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C15224h<T extends IInterface> extends C15213b {
        /* renamed from: a */
        T mo28079a(IBinder iBinder);

        /* renamed from: a */
        String mo28080a();

        /* renamed from: b */
        String mo28081b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class C15225i<T extends C15224h, O> extends C15221e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C15226j<C extends C15224h> extends C15214c<C> {
    }

    public <C extends C15222f> C15211a(String str, C15212a<C, O> aVar, C15223g<C> gVar) {
        C15464q.m32124a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C15464q.m32124a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f39277b = str;
        this.f39276a = aVar;
        this.f39279d = gVar;
        this.f39280e = null;
    }

    /* renamed from: a */
    public final C15212a<?, O> mo28065a() {
        C15464q.m32130a(this.f39276a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f39276a;
    }

    /* renamed from: b */
    public final C15214c<?> mo28066b() {
        if (this.f39279d != null) {
            return this.f39279d;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
