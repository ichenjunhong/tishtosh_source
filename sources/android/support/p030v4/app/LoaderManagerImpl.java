package android.support.p030v4.app;

import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.app.C0699x.C0700a;
import android.support.p030v4.content.C0729f;
import android.support.p030v4.content.C0729f.C0731b;
import android.support.p030v4.p038f.C0783e;
import android.support.p030v4.p038f.C0801o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
final class LoaderManagerImpl extends C0699x {

    /* renamed from: a */
    private final C0184k f2159a;

    /* renamed from: b */
    private final LoaderViewModel f2160b;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0209x {

        /* renamed from: a */
        static final C0212b f2161a = new C0212b() {
            /* renamed from: a */
            public final <T extends C0209x> T mo361a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b */
        C0801o<C0604a> f2162b = new C0801o<>();

        /* renamed from: c */
        public boolean f2163c = false;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2087a() {
            this.f2163c = false;
        }

        LoaderViewModel() {
        }

        public void onCleared() {
            super.onCleared();
            int c = this.f2162b.mo2596c();
            for (int i = 0; i < c; i++) {
                ((C0604a) this.f2162b.mo2600d(i)).mo2089a(true);
            }
            this.f2162b.mo2601d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final <D> C0604a<D> mo2086a(int i) {
            return (C0604a) this.f2162b.mo2591a(i);
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0604a<D> extends C0198r<D> implements C0731b<D> {

        /* renamed from: a */
        final int f2164a;

        /* renamed from: b */
        final Bundle f2165b;

        /* renamed from: c */
        public final C0729f<D> f2166c;

        /* renamed from: d */
        C0605b<D> f2167d;

        /* renamed from: e */
        private C0184k f2168e;

        /* renamed from: f */
        private C0729f<D> f2169f;

        public final void onActive() {
            this.f2166c.mo2392j();
        }

        public final void onInactive() {
            this.f2166c.mo2395m();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2090a() {
            C0184k kVar = this.f2168e;
            C0605b<D> bVar = this.f2167d;
            if (kVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(kVar, bVar);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2164a);
            sb.append(" : ");
            C0783e.m2224a(this.f2166c, sb);
            sb.append("}}");
            return sb.toString();
        }

        public final void removeObserver(C0199s<? super D> sVar) {
            super.removeObserver(sVar);
            this.f2168e = null;
            this.f2167d = null;
        }

        public final void setValue(D d) {
            super.setValue(d);
            if (this.f2169f != null) {
                this.f2169f.mo2397o();
                this.f2169f = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0729f<D> mo2089a(boolean z) {
            this.f2166c.mo2393k();
            this.f2166c.mo2396n();
            C0605b<D> bVar = this.f2167d;
            if (bVar != null) {
                removeObserver(bVar);
                bVar.mo2093a();
            }
            this.f2166c.mo2391a(this);
            this.f2166c.mo2397o();
            return this.f2169f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0729f<D> mo2088a(C0184k kVar, C0700a<D> aVar) {
            C0605b<D> bVar = new C0605b<>(this.f2166c, aVar);
            observe(kVar, bVar);
            if (this.f2167d != null) {
                removeObserver(this.f2167d);
            }
            this.f2168e = kVar;
            this.f2167d = bVar;
            return this.f2166c;
        }

        /* renamed from: a */
        public final void mo2091a(C0729f<D> fVar, D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
            } else {
                postValue(d);
            }
        }

        C0604a(int i, Bundle bundle, C0729f<D> fVar, C0729f<D> fVar2) {
            this.f2164a = i;
            this.f2165b = bundle;
            this.f2166c = fVar;
            this.f2169f = fVar2;
            C0729f<D> fVar3 = this.f2166c;
            if (fVar3.f2531o == null) {
                fVar3.f2531o = this;
                fVar3.f2530n = i;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0605b<D> implements C0199s<D> {

        /* renamed from: a */
        public boolean f2170a;

        /* renamed from: b */
        private final C0729f<D> f2171b;

        /* renamed from: c */
        private final C0700a<D> f2172c;

        public final String toString() {
            return this.f2172c.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2093a() {
            if (this.f2170a) {
                this.f2172c.mo2348a(this.f2171b);
            }
        }

        public final void onChanged(D d) {
            this.f2172c.mo2349a(this.f2171b, d);
            this.f2170a = true;
        }

        C0605b(C0729f<D> fVar, C0700a<D> aVar) {
            this.f2171b = fVar;
            this.f2172c = aVar;
        }
    }

    /* renamed from: a */
    public final void mo2082a() {
        LoaderViewModel loaderViewModel = this.f2160b;
        int c = loaderViewModel.f2162b.mo2596c();
        for (int i = 0; i < c; i++) {
            ((C0604a) loaderViewModel.f2162b.mo2600d(i)).mo2090a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0783e.m2224a(this.f2159a, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo2083a(int i) {
        if (this.f2160b.f2163c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C0604a a = this.f2160b.mo2086a(i);
            if (a != null) {
                a.mo2089a(true);
                this.f2160b.f2162b.mo2594b(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    LoaderManagerImpl(C0184k kVar, C0159aa aaVar) {
        this.f2159a = kVar;
        this.f2160b = (LoaderViewModel) new C0210y(aaVar, LoaderViewModel.f2161a).mo359a(LoaderViewModel.class);
    }

    /* renamed from: a */
    public final <D> C0729f<D> mo2081a(int i, Bundle bundle, C0700a<D> aVar) {
        if (this.f2160b.f2163c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C0604a a = this.f2160b.mo2086a(i);
            if (a == null) {
                return m1623a(i, bundle, aVar, null);
            }
            return a.mo2088a(this.f2159a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C0729f<D> m1623a(int i, Bundle bundle, C0700a<D> aVar, C0729f<D> fVar) {
        try {
            this.f2160b.f2163c = true;
            C0729f a = aVar.mo2347a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                C0604a aVar2 = new C0604a(i, bundle, a, null);
                this.f2160b.f2162b.mo2595b(i, aVar2);
                this.f2160b.mo2087a();
                return aVar2.mo2088a(this.f2159a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f2160b.mo2087a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo2084a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.f2160b;
        if (loaderViewModel.f2162b.mo2596c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String sb2 = sb.toString();
            for (int i = 0; i < loaderViewModel.f2162b.mo2596c(); i++) {
                C0604a aVar = (C0604a) loaderViewModel.f2162b.mo2600d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.f2162b.mo2597c(i));
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(sb2);
                printWriter.print("mId=");
                printWriter.print(aVar.f2164a);
                printWriter.print(" mArgs=");
                printWriter.println(aVar.f2165b);
                printWriter.print(sb2);
                printWriter.print("mLoader=");
                printWriter.println(aVar.f2166c);
                C0729f<D> fVar = aVar.f2166c;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("  ");
                fVar.mo2368a(sb3.toString(), fileDescriptor, printWriter, strArr);
                if (aVar.f2167d != null) {
                    printWriter.print(sb2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVar.f2167d);
                    C0605b<D> bVar = aVar.f2167d;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("  ");
                    printWriter.print(sb4.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f2170a);
                }
                printWriter.print(sb2);
                printWriter.print("mData=");
                Object value = aVar.getValue();
                StringBuilder sb5 = new StringBuilder(64);
                C0783e.m2224a(value, sb5);
                sb5.append("}");
                printWriter.println(sb5.toString());
                printWriter.print(sb2);
                printWriter.print("mStarted=");
                printWriter.println(aVar.hasActiveObservers());
            }
        }
    }
}
