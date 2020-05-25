package com.google.android.gms.maps;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1045f.C16498h;
import com.google.android.gms.maps.model.C16954c;
import com.google.android.gms.maps.model.C16955d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.p1046a.C16911b;
import com.google.android.gms.maps.p1046a.C16915f;
import com.google.android.gms.maps.p1046a.C16917h;
import com.google.android.gms.maps.p1046a.C16921l;
import com.google.android.gms.maps.p1046a.C16929t;

/* renamed from: com.google.android.gms.maps.c */
public final class C16933c {

    /* renamed from: a */
    private final C16911b f47710a;

    /* renamed from: com.google.android.gms.maps.c$a */
    public interface C16934a {
        /* renamed from: a */
        View mo32668a(C16954c cVar);

        /* renamed from: b */
        View mo32669b(C16954c cVar);
    }

    /* renamed from: com.google.android.gms.maps.c$b */
    public interface C16935b {
        /* renamed from: a */
        void mo32670a(C16954c cVar);
    }

    /* renamed from: com.google.android.gms.maps.c$c */
    public interface C16936c {
        /* renamed from: a */
        void mo32671a(LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.c$d */
    public interface C16937d {
        /* renamed from: b */
        boolean mo32672b(C16954c cVar);
    }

    public C16933c(C16911b bVar) {
        this.f47710a = (C16911b) C15464q.m32123a(bVar);
    }

    /* renamed from: a */
    public final C16954c mo32661a(MarkerOptions markerOptions) {
        try {
            C16498h a = this.f47710a.mo32634a(markerOptions);
            if (a != null) {
                return new C16954c(a);
            }
            return null;
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    /* renamed from: a */
    public final void mo32662a(C16909a aVar) {
        try {
            this.f47710a.mo32635a(aVar.f47705a);
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    /* renamed from: a */
    public final void mo32663a(C16934a aVar) {
        try {
            this.f47710a.mo32639a((C16929t) new C16948l(this, aVar));
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    /* renamed from: a */
    public final void mo32664a(C16935b bVar) {
        if (bVar == null) {
            try {
                this.f47710a.mo32636a((C16915f) null);
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        } else {
            this.f47710a.mo32636a((C16915f) new C16947k(this, bVar));
        }
    }

    /* renamed from: a */
    public final void mo32665a(C16936c cVar) {
        if (cVar == null) {
            try {
                this.f47710a.mo32637a((C16917h) null);
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        } else {
            this.f47710a.mo32637a((C16917h) new C16949m(this, cVar));
        }
    }

    /* renamed from: a */
    public final void mo32666a(C16937d dVar) {
        if (dVar == null) {
            try {
                this.f47710a.mo32638a((C16921l) null);
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        } else {
            this.f47710a.mo32638a((C16921l) new C16946j(this, dVar));
        }
    }

    /* renamed from: b */
    public final void mo32667b(C16909a aVar) {
        try {
            this.f47710a.mo32640b(aVar.f47705a);
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }
}
