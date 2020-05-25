package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15464q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.cg */
public class C15307cg extends C15310ci {

    /* renamed from: b */
    private final SparseArray<C15308a> f39493b = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.internal.cg$a */
    class C15308a implements C15236c {

        /* renamed from: a */
        public final int f39494a;

        /* renamed from: b */
        public final C15233f f39495b;

        /* renamed from: c */
        public final C15236c f39496c;

        public C15308a(int i, C15233f fVar, C15236c cVar) {
            this.f39494a = i;
            this.f39495b = fVar;
            this.f39496c = cVar;
            fVar.mo28100a((C15236c) this);
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            C15307cg.this.mo28240b(connectionResult, this.f39494a);
        }
    }

    /* renamed from: b */
    public static C15307cg m31738b(C15334f fVar) {
        C15335g a = m31539a(fVar);
        C15307cg cgVar = (C15307cg) a.mo28247a("AutoManageHelper", C15307cg.class);
        if (cgVar != null) {
            return cgVar;
        }
        return new C15307cg(a);
    }

    private C15307cg(C15335g gVar) {
        super(gVar);
        this.f39334a.mo28248a("AutoManageHelper", (LifecycleCallback) this);
    }

    /* renamed from: a */
    public final void mo28236a(int i, C15233f fVar, C15236c cVar) {
        C15464q.m32124a(fVar, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f39493b.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C15464q.m32130a(z, (Object) sb.toString());
        C15311cj cjVar = (C15311cj) this.f39505e.get();
        this.f39493b.put(i, new C15308a(i, fVar, cVar));
        if (this.f39504d && cjVar == null) {
            fVar.mo28109e();
        }
    }

    /* renamed from: a */
    public final void mo28235a(int i) {
        C15308a aVar = (C15308a) this.f39493b.get(i);
        this.f39493b.remove(i);
        if (aVar != null) {
            aVar.f39495b.mo28105b((C15236c) aVar);
            aVar.f39495b.mo28111g();
        }
    }

    /* renamed from: b */
    public final void mo28143b() {
        super.mo28143b();
        if (this.f39505e.get() == null) {
            for (int i = 0; i < this.f39493b.size(); i++) {
                C15308a b = m31737b(i);
                if (b != null) {
                    b.f39495b.mo28109e();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo28146d() {
        super.mo28146d();
        for (int i = 0; i < this.f39493b.size(); i++) {
            C15308a b = m31737b(i);
            if (b != null) {
                b.f39495b.mo28111g();
            }
        }
    }

    /* renamed from: a */
    public final void mo28142a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f39493b.size(); i++) {
            C15308a b = m31737b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f39494a);
                printWriter.println(":");
                b.f39495b.mo28102a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28237a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C15308a aVar = (C15308a) this.f39493b.get(i);
        if (aVar != null) {
            mo28235a(i);
            C15236c cVar = aVar.f39496c;
            if (cVar != null) {
                cVar.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo28238e() {
        for (int i = 0; i < this.f39493b.size(); i++) {
            C15308a b = m31737b(i);
            if (b != null) {
                b.f39495b.mo28109e();
            }
        }
    }

    /* renamed from: b */
    private final C15308a m31737b(int i) {
        if (this.f39493b.size() <= i) {
            return null;
        }
        return (C15308a) this.f39493b.get(this.f39493b.keyAt(i));
    }
}
