package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.C15465r;

/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C15298c {

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public static abstract class C15299a<R extends C15358j, A extends C15213b> extends BasePendingResult<R> implements C15300b<R> {

        /* renamed from: a */
        public final C15214c<A> f39479a;

        /* renamed from: b */
        public final C15211a<?> f39480b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo27969a(A a) throws RemoteException;

        protected C15299a(C15211a<?> aVar, C15233f fVar) {
            super((C15233f) C15464q.m32124a(fVar, (Object) "GoogleApiClient must not be null"));
            C15464q.m32124a(aVar, (Object) "Api must not be null");
            this.f39479a = aVar.mo28066b();
            this.f39480b = aVar;
        }

        /* renamed from: b */
        public final void mo28230b(A a) throws DeadObjectException {
            if (a instanceof C15465r) {
                a = ((C15465r) a).f39872a;
            }
            try {
                mo27969a(a);
            } catch (DeadObjectException e) {
                m31702a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m31702a(e2);
            }
        }

        /* renamed from: b */
        public final void mo28229b(Status status) {
            C15464q.m32134b(!status.mo28060c(), "Failed result must not be success");
            mo28131a(mo27968a(status));
        }

        /* renamed from: a */
        private void m31702a(RemoteException remoteException) {
            mo28229b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo28228a(Object obj) {
            super.mo28131a((C15358j) obj);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    public interface C15300b<R> {
        /* renamed from: a */
        void mo28228a(R r);
    }
}
