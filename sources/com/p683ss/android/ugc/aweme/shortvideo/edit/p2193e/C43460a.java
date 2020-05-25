package com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43501am;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43505aq;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.VEListener.C50549m;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a */
public final class C43460a {

    /* renamed from: a */
    public String f109848a;

    /* renamed from: b */
    public int f109849b;

    /* renamed from: c */
    public String f109850c;

    /* renamed from: d */
    public C43501am f109851d;

    /* renamed from: e */
    public VEVideoPublishEditViewModel f109852e;

    /* renamed from: f */
    public C43461a f109853f;

    /* renamed from: g */
    public boolean f109854g;

    /* renamed from: h */
    public int f109855h;

    /* renamed from: i */
    public C43505aq f109856i;

    /* renamed from: j */
    public final C50711k f109857j;

    /* renamed from: k */
    public C20347c f109858k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$a */
    public interface C43461a {
        /* renamed from: a */
        void mo88395a();

        /* renamed from: a */
        void mo88396a(String str, C43501am amVar);

        /* renamed from: a */
        void mo88397a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$b */
    static final class C43462b implements C50711k {

        /* renamed from: a */
        final /* synthetic */ C43460a f109859a;

        C43462b(C43460a aVar) {
            this.f109859a = aVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i != 4098) {
                if (i == 4132) {
                    this.f109859a.f109854g = false;
                    C43460a aVar = this.f109859a;
                    aVar.f109858k.mo43076m(aVar.f109849b);
                    aVar.f109858k.mo42984a(aVar.f109855h, C50743d.EDITOR_SEEK_FLAG_LastSeek, (C50549m) new C43464c(aVar));
                }
            } else if (this.f109859a.f109854g) {
                C0013i.m18a((Callable<TResult>) new Callable<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C43462b f109860a;

                    {
                        this.f109860a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        this.f109860a.f109859a.f109854g = false;
                        C0198r q = this.f109860a.f109859a.f109852e.mo110472q();
                        C52711k.m112236a((Object) q, "publishEditViewModel.infoStickerPinStatusLiveData");
                        q.setValue(Boolean.valueOf(false));
                        C43460a aVar = this.f109860a.f109859a;
                        aVar.f109858k.mo42984a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek, (C50549m) new C43465d(aVar));
                        return C52860x.f131107a;
                    }
                }, C0013i.f25b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$c */
    static final class C43464c implements C50549m {

        /* renamed from: a */
        final /* synthetic */ C43460a f109861a;

        C43464c(C43460a aVar) {
            this.f109861a = aVar;
        }

        /* renamed from: a */
        public final void mo88399a(int i) {
            this.f109861a.f109858k.mo43085r();
            C43461a aVar = this.f109861a.f109853f;
            if (aVar != null) {
                aVar.mo88397a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$d */
    static final class C43465d implements C50549m {

        /* renamed from: a */
        final /* synthetic */ C43460a f109862a;

        C43465d(C43460a aVar) {
            this.f109862a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            if (r0 != null) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
            if (r0 != null) goto L_0x003e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88399a(int r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r3.f109862a
                com.ss.android.ugc.asve.c.c r4 = r4.f109858k
                r4.mo43085r()
                r4 = 1
                java.nio.ByteBuffer[] r4 = new java.nio.ByteBuffer[r4]
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r3.f109862a
                com.ss.android.ugc.asve.c.c r0 = r0.f109858k
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r1 = r3.f109862a
                int r1 = r1.f109849b
                r0.mo42989a(r1, r4)
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r3.f109862a
                java.lang.String r0 = r0.f109850c
                r1 = 0
                r4 = r4[r1]
                if (r0 == 0) goto L_0x0041
                if (r4 != 0) goto L_0x0021
                goto L_0x0041
            L_0x0021:
                r1 = 0
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
                java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
                r0.write(r4)     // Catch:{ Exception -> 0x003c, all -> 0x0031 }
                if (r0 == 0) goto L_0x0041
                goto L_0x003e
            L_0x0031:
                r4 = move-exception
                r1 = r0
                goto L_0x0035
            L_0x0034:
                r4 = move-exception
            L_0x0035:
                if (r1 == 0) goto L_0x003a
                r1.close()
            L_0x003a:
                throw r4
            L_0x003b:
                r0 = r1
            L_0x003c:
                if (r0 == 0) goto L_0x0041
            L_0x003e:
                r0.close()
            L_0x0041:
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r3.f109862a
                com.ss.android.ugc.aweme.shortvideo.edit.e.a$a r4 = r4.f109853f
                if (r4 == 0) goto L_0x0052
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r3.f109862a
                java.lang.String r0 = r0.f109850c
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r1 = r3.f109862a
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r1 = r1.f109851d
                r4.mo88396a(r0, r1)
            L_0x0052:
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r3.f109862a
                com.ss.android.ugc.asve.c.c r4 = r4.f109858k
                com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r3.f109862a
                com.ss.android.vesdk.k r0 = r0.f109857j
                r4.mo43048c(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a.C43465d.mo88399a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$e */
    public static final class C43466e implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C43460a f109863a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$e$a */
        static final class C43467a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C43466e f109864a;

            C43467a(C43466e eVar) {
                this.f109864a = eVar;
            }

            public final /* synthetic */ Object call() {
                this.f109864a.f109863a.f109854g = true;
                C0198r q = this.f109864a.f109863a.f109852e.mo110472q();
                C52711k.m112236a((Object) q, "publishEditViewModel.infoStickerPinStatusLiveData");
                q.setValue(Boolean.valueOf(true));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e.a$e$b */
        static final class C43468b<TTaskResult, TContinuationResult> implements C0011g<C52860x, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C43466e f109865a;

            C43468b(C43466e eVar) {
                this.f109865a = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object then(p001a.C0013i r4) {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r4 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r4.f109863a
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r0 = r4.f109851d
                    r1 = 0
                    if (r0 == 0) goto L_0x0010
                    com.ss.android.ugc.aweme.infosticker.StickerItemModel r0 = r0.f110003d
                    if (r0 == 0) goto L_0x0010
                    java.lang.String r0 = r0.pinAlgorithmFile
                    goto L_0x0011
                L_0x0010:
                    r0 = r1
                L_0x0011:
                    boolean r0 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
                    if (r0 == 0) goto L_0x0024
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r0 = r4.f109851d
                    if (r0 == 0) goto L_0x0021
                    com.ss.android.ugc.aweme.infosticker.StickerItemModel r0 = r0.f110003d
                    if (r0 == 0) goto L_0x0021
                    java.lang.String r1 = r0.pinAlgorithmFile
                L_0x0021:
                    com.p683ss.android.ugc.aweme.video.C48016e.m103947c(r1)
                L_0x0024:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.io.File r1 = com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform.f76570b
                    java.lang.String r2 = "EffectPlatform.LOCAL_PIN_CACHEDIR"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                    java.lang.String r1 = r1.getAbsolutePath()
                    r0.append(r1)
                    java.lang.String r1 = java.io.File.separator
                    r0.append(r1)
                    long r1 = java.lang.System.currentTimeMillis()
                    r0.append(r1)
                    java.lang.String r1 = "-pin.json"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r4.f109850c = r0
                    java.lang.String r0 = r4.f109850c
                    r1 = 1
                    com.p683ss.android.ugc.aweme.video.C48016e.m103935a(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r0 = r4.f109851d
                    if (r0 == 0) goto L_0x0061
                    com.ss.android.ugc.aweme.infosticker.StickerItemModel r0 = r0.f110003d
                    if (r0 == 0) goto L_0x0061
                    java.lang.String r4 = r4.f109850c
                    r0.setPinAlgorithmFile(r4)
                L_0x0061:
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r4 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r4.f109863a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r0 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r0.f109863a
                    com.ss.android.ugc.asve.c.c r0 = r0.f109858k
                    int r0 = r0.mo43073l()
                    r4.f109855h = r0
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r4 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r4.f109863a
                    com.ss.android.ugc.asve.c.c r4 = r4.f109858k
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r0 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r0.f109863a
                    int r0 = r0.f109849b
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r1 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r1 = r1.f109863a
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r1 = r1.f109851d
                    r2 = 0
                    if (r1 == 0) goto L_0x008a
                    int r2 = r1.mo52063a(r2)
                L_0x008a:
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r1 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r1 = r1.f109863a
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r1 = r1.f109851d
                    if (r1 == 0) goto L_0x0097
                    int r1 = r1.mo88516e()
                    goto L_0x00a1
                L_0x0097:
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r1 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r1 = r1.f109863a
                    com.ss.android.ugc.asve.c.c r1 = r1.f109858k
                    int r1 = r1.mo43071k()
                L_0x00a1:
                    r4.mo43029b(r0, r2, r1)
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r4 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r4 = r4.f109863a
                    com.ss.android.ugc.asve.c.c r4 = r4.f109858k
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a$e r0 = r3.f109865a
                    com.ss.android.ugc.aweme.shortvideo.edit.e.a r0 = r0.f109863a
                    int r0 = r0.f109849b
                    r4.mo43074l(r0)
                    d.x r4 = p2628d.C52860x.f131107a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a.C43466e.C43468b.then(a.i):java.lang.Object");
            }
        }

        public C43466e(C43460a aVar) {
            this.f109863a = aVar;
        }

        public final void onFailed(Exception exc) {
            C52711k.m112240b(exc, "e");
            C43461a aVar = this.f109863a.f109853f;
            if (aVar != null) {
                aVar.mo88397a(true);
            }
        }

        public final void onSuccess(String[] strArr) {
            C52711k.m112240b(strArr, "requirements");
            C0013i.m18a((Callable<TResult>) new C43467a<TResult>(this), C0013i.f25b).mo20a((C0011g<TResult, TContinuationResult>) new C43468b<TResult,TContinuationResult>(this), (Executor) C0013i.f24a);
        }
    }

    /* renamed from: a */
    public final void mo88394a() {
        if (this.f109856i != null) {
            C43505aq aqVar = this.f109856i;
            if (aqVar != null && aqVar.isShowing()) {
                C43505aq aqVar2 = this.f109856i;
                if (aqVar2 != null) {
                    aqVar2.dismiss();
                }
            }
        }
    }

    public C43460a(C20347c cVar, Context context) {
        C52711k.m112240b(cVar, "veEditor");
        C52711k.m112240b(context, "context");
        this.f109858k = cVar;
        Activity a = C18998a.m46169a(context);
        if (a != null) {
            C0209x a2 = C0214z.m440a((FragmentActivity) a).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(co…ditViewModel::class.java)");
            this.f109852e = (VEVideoPublishEditViewModel) a2;
            this.f109857j = new C43462b(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
