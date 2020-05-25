package com.p683ss.android.ugc.aweme.effectplatform;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48902j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.x */
public final class C29276x {

    /* renamed from: a */
    public static final C29276x f76653a = new C29276x();

    /* renamed from: b */
    private static final String[] f76654b = {"faceDetect", "handDetect", "matting", "hairColor"};

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.x$a */
    public static final class C29277a implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ int f76655a;

        C29277a(int i) {
            this.f76655a = i;
        }

        public final void onFailed(Exception exc) {
            C29276x.f76653a.mo59197a(this.f76655a + 1);
        }

        public final void onSuccess(String[] strArr) {
            C29276x.f76653a.mo59197a(this.f76655a + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.x$b */
    public static final class C29278b implements C48902j {

        /* renamed from: a */
        final /* synthetic */ long f76656a;

        /* renamed from: b */
        final /* synthetic */ String f76657b;

        /* renamed from: c */
        final /* synthetic */ IFetchResourcesListener f76658c;

        /* renamed from: a */
        public final void mo59198a(Exception exc) {
            C52711k.m112240b(exc, "e");
            IFetchResourcesListener iFetchResourcesListener = this.f76658c;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        /* renamed from: a */
        public final void mo59199a(String[] strArr) {
            C52711k.m112240b(strArr, "requirements");
            IFetchResourcesListener iFetchResourcesListener = this.f76658c;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }

        C29278b(long j, String str, IFetchResourcesListener iFetchResourcesListener) {
            this.f76656a = j;
            this.f76657b = str;
            this.f76658c = iFetchResourcesListener;
        }
    }

    private C29276x() {
    }

    /* renamed from: a */
    public static final void m68998a() {
        C39618d.m88216e();
        f76653a.mo59197a(0);
    }

    /* renamed from: a */
    public final void mo59197a(int i) {
        m68999a(new C29277a(i), f76654b[i]);
    }

    /* renamed from: a */
    private static void m68999a(IFetchResourcesListener iFetchResourcesListener, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C48580c.m105110b().mo96133a(new String[]{str}, (C48902j) new C29278b(currentTimeMillis, str, iFetchResourcesListener));
    }
}
