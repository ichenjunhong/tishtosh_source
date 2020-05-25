package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.formats.C14927h;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.p1027a.C14886d;
import java.util.WeakHashMap;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.fo */
public final class C15892fo implements C14927h {

    /* renamed from: b */
    private static WeakHashMap<IBinder, C15892fo> f44990b = new WeakHashMap<>();

    /* renamed from: a */
    public final C15889fl f44991a;

    /* renamed from: c */
    private final MediaView f44992c;

    /* renamed from: d */
    private final C14937i f44993d = new C14937i();

    private C15892fo(C15889fl flVar) {
        Context context;
        this.f44991a = flVar;
        MediaView mediaView = null;
        try {
            context = (Context) C14886d.m30545a(flVar.mo30977i());
        } catch (RemoteException | NullPointerException e) {
            afc.m32793b("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f44991a.mo30971a(C14886d.m30544a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                afc.m32793b("", e2);
            }
        }
        this.f44992c = mediaView;
    }

    /* renamed from: a */
    public static C15892fo m37611a(C15889fl flVar) {
        synchronized (f44990b) {
            C15892fo foVar = (C15892fo) f44990b.get(flVar.asBinder());
            if (foVar != null) {
                return foVar;
            }
            C15892fo foVar2 = new C15892fo(flVar);
            f44990b.put(flVar.asBinder(), foVar2);
            return foVar2;
        }
    }

    /* renamed from: a */
    public final String mo27382a() {
        try {
            return this.f44991a.mo30921c();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }
}
