package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C14919c;
import com.google.android.gms.ads.formats.C14923f.C14924a;
import com.google.android.gms.ads.formats.C14925g.C14926a;
import com.google.android.gms.ads.formats.C14927h.C14928a;
import com.google.android.gms.ads.formats.C14927h.C14929b;
import com.google.android.gms.ads.formats.C14930i.C14931a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15619ar;
import com.google.android.gms.internal.ads.C15795c;
import com.google.android.gms.internal.ads.C15893fp;
import com.google.android.gms.internal.ads.C15897ft;
import com.google.android.gms.internal.ads.C15909ge;
import com.google.android.gms.internal.ads.C15920gp;
import com.google.android.gms.internal.ads.C15921gq;
import com.google.android.gms.internal.ads.C15923gs;
import com.google.android.gms.internal.ads.C15924gt;
import com.google.android.gms.internal.ads.C15925gu;
import com.google.android.gms.internal.ads.C16133om;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.bzo;
import com.google.android.gms.internal.ads.bzu;
import com.google.android.gms.internal.ads.cad;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.cao;
import com.google.android.gms.internal.ads.zzafl;

/* renamed from: com.google.android.gms.ads.b */
public class C14900b {

    /* renamed from: a */
    private final bzu f38429a;

    /* renamed from: b */
    private final Context f38430b;

    /* renamed from: c */
    private final cao f38431c;

    /* renamed from: com.google.android.gms.ads.b$a */
    public static class C14901a {

        /* renamed from: a */
        private final Context f38432a;

        /* renamed from: b */
        private final C15795c f38433b;

        public C14901a(Context context, String str) {
            this((Context) C15464q.m32124a(context, (Object) "context cannot be null"), (C15795c) new cad(caf.m37097b(), context, str, new C16133om()).mo30891a(context, false));
        }

        private C14901a(Context context, C15795c cVar) {
            this.f38432a = context;
            this.f38433b = cVar;
        }

        /* renamed from: a */
        public final C14901a mo27303a(C14926a aVar) {
            try {
                this.f38433b.mo27652a((C15897ft) new C15921gq(aVar));
            } catch (RemoteException e) {
                afc.m32795c("Failed to add content ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14901a mo27302a(C14924a aVar) {
            try {
                this.f38433b.mo27651a((C15893fp) new C15920gp(aVar));
            } catch (RemoteException e) {
                afc.m32795c("Failed to add app install ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14901a mo27304a(C14931a aVar) {
            try {
                this.f38433b.mo27654a((C15909ge) new C15925gu(aVar));
            } catch (RemoteException e) {
                afc.m32795c("Failed to add google native ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14901a mo27305a(String str, C14929b bVar, C14928a aVar) {
            C15923gs gsVar;
            try {
                C15795c cVar = this.f38433b;
                C15924gt gtVar = new C15924gt(bVar);
                if (aVar == null) {
                    gsVar = null;
                } else {
                    gsVar = new C15923gs(aVar);
                }
                cVar.mo27659a(str, gtVar, gsVar);
            } catch (RemoteException e) {
                afc.m32795c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14901a mo27300a(C14895a aVar) {
            try {
                this.f38433b.mo27650a((cal) new bzo(aVar));
            } catch (RemoteException e) {
                afc.m32795c("Failed to set AdListener.", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14901a mo27301a(C14919c cVar) {
            try {
                this.f38433b.mo27657a(new zzafl(cVar));
            } catch (RemoteException e) {
                afc.m32795c("Failed to specify native ad options", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14900b mo27306a() {
            try {
                return new C14900b(this.f38432a, this.f38433b.mo27648a());
            } catch (RemoteException e) {
                afc.m32793b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C14900b(Context context, cao cao) {
        this(context, cao, bzu.f44719a);
    }

    private C14900b(Context context, cao cao, bzu bzu) {
        this.f38430b = context;
        this.f38431c = cao;
        this.f38429a = bzu;
    }

    /* renamed from: a */
    public final void mo27299a(C15619ar arVar) {
        try {
            this.f38431c.mo27642a(bzu.m37053a(this.f38430b, arVar));
        } catch (RemoteException e) {
            afc.m32793b("Failed to load ad.", e);
        }
    }
}
