package android.support.p030v4.app;

import android.arch.lifecycle.C0160ab;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.content.C0729f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.x */
public abstract class C0699x {

    /* renamed from: android.support.v4.app.x$a */
    public interface C0700a<D> {
        /* renamed from: a */
        C0729f<D> mo2347a(int i, Bundle bundle);

        /* renamed from: a */
        void mo2348a(C0729f<D> fVar);

        /* renamed from: a */
        void mo2349a(C0729f<D> fVar, D d);
    }

    /* renamed from: a */
    public abstract <D> C0729f<D> mo2081a(int i, Bundle bundle, C0700a<D> aVar);

    /* renamed from: a */
    public abstract void mo2082a();

    /* renamed from: a */
    public abstract void mo2083a(int i);

    /* renamed from: a */
    public abstract void mo2084a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public static <T extends C0184k & C0160ab> C0699x m2021a(T t) {
        return new LoaderManagerImpl(t, ((C0160ab) t).getViewModelStore());
    }
}
