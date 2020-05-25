package android.support.p030v4.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.p030v4.p038f.C0783e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.f */
public class C0729f<D> {

    /* renamed from: n */
    public int f2530n;

    /* renamed from: o */
    public C0731b<D> f2531o;

    /* renamed from: p */
    public Context f2532p;

    /* renamed from: q */
    public boolean f2533q;

    /* renamed from: r */
    public boolean f2534r;

    /* renamed from: s */
    public boolean f2535s = true;

    /* renamed from: t */
    boolean f2536t;

    /* renamed from: u */
    boolean f2537u;

    /* renamed from: android.support.v4.content.f$a */
    public final class C0730a extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            C0729f.this.mo2398p();
        }

        public C0730a() {
            super(new Handler());
        }
    }

    /* renamed from: android.support.v4.content.f$b */
    public interface C0731b<D> {
        /* renamed from: a */
        void mo2091a(C0729f<D> fVar, D d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2365a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2369b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2388g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2389h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2390i() {
    }

    /* renamed from: l */
    public final void mo2394l() {
        mo2365a();
    }

    /* renamed from: n */
    public final void mo2396n() {
        this.f2534r = true;
    }

    /* renamed from: k */
    public final boolean mo2393k() {
        return mo2369b();
    }

    /* renamed from: m */
    public final void mo2395m() {
        this.f2533q = false;
        mo2389h();
    }

    /* renamed from: j */
    public final void mo2392j() {
        this.f2533q = true;
        this.f2535s = false;
        this.f2534r = false;
        mo2388g();
    }

    /* renamed from: o */
    public final void mo2397o() {
        mo2390i();
        this.f2535s = true;
        this.f2533q = false;
        this.f2534r = false;
        this.f2536t = false;
        this.f2537u = false;
    }

    /* renamed from: p */
    public void mo2398p() {
        if (this.f2533q) {
            mo2394l();
        } else {
            this.f2536t = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0783e.m2224a(this, sb);
        sb.append(" id=");
        sb.append(this.f2530n);
        sb.append("}");
        return sb.toString();
    }

    public C0729f(Context context) {
        this.f2532p = context.getApplicationContext();
    }

    /* renamed from: b */
    public void mo2386b(D d) {
        if (this.f2531o != null) {
            this.f2531o.mo2091a(this, d);
        }
    }

    /* renamed from: a */
    public final void mo2391a(C0731b<D> bVar) {
        if (this.f2531o == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f2531o == bVar) {
            this.f2531o = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo2368a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f2530n);
        printWriter.print(" mListener=");
        printWriter.println(this.f2531o);
        if (this.f2533q || this.f2536t || this.f2537u) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f2533q);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f2536t);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f2537u);
        }
        if (this.f2534r || this.f2535s) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f2534r);
            printWriter.print(" mReset=");
            printWriter.println(this.f2535s);
        }
    }
}
