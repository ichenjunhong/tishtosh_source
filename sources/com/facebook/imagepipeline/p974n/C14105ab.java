package com.facebook.imagepipeline.p974n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.util.Pair;
import com.facebook.common.p920d.C13683f;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13712j;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imageutils.C14250a;
import com.facebook.imageutils.C14256e;
import com.facebook.p955h.C13899b;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ab */
public class C14105ab implements C14171bb<C14044e> {

    /* renamed from: a */
    public final C13711i f36834a;

    /* renamed from: b */
    private final Executor f36835b;

    /* renamed from: c */
    private final ContentResolver f36836c;

    /* renamed from: a */
    public final boolean mo26349a(C13952d dVar) {
        return C14172bc.m29044a(UnReadVideoExperiment.LIKE_USER_LIST, UnReadVideoExperiment.LIKE_USER_LIST, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.ExifInterface mo26350a(android.net.Uri r3) {
        /*
            r2 = this;
            android.content.ContentResolver r0 = r2.f36836c
            java.lang.String r3 = com.facebook.common.p927k.C13731f.m27776a(r0, r3)
            if (r3 == 0) goto L_0x001b
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r1 == 0) goto L_0x001b
            boolean r0 = r0.canRead()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x002b
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            return r0
        L_0x0024:
            java.lang.Class<com.facebook.imagepipeline.n.ab> r3 = com.facebook.imagepipeline.p974n.C14105ab.class
            java.lang.String r0 = "StackOverflowError in ExifInterface constructor"
            com.facebook.common.p921e.C13697a.m27692c(r3, r0)
        L_0x002b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14105ab.mo26350a(android.net.Uri):android.media.ExifInterface");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C14044e mo26351a(C13709h hVar, ExifInterface exifInterface) {
        int i;
        Pair a = C14250a.m29205a((InputStream) new C13712j(hVar));
        int a2 = C14256e.m29213a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
        int i2 = -1;
        if (a != null) {
            i = ((Integer) a.first).intValue();
        } else {
            i = -1;
        }
        if (a != null) {
            i2 = ((Integer) a.second).intValue();
        }
        C13715a a3 = C13715a.m27746a(hVar);
        try {
            C14044e eVar = new C14044e(a3);
            C13715a.m27752c(a3);
            eVar.f36702c = C13899b.f36263a;
            eVar.f36703d = a2;
            eVar.f36705f = i;
            eVar.f36706g = i2;
            return eVar;
        } catch (Throwable th) {
            C13715a.m27752c(a3);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        C14142ap c = anVar.mo26387c();
        String b = anVar.mo26386b();
        final C14229b a = anVar.mo26384a();
        final C141061 r0 = new C14152au<C14044e>(kVar, c, "LocalExifThumbnailProducer", b) {
            /* renamed from: c */
            public final /* synthetic */ Object mo25575c() throws Exception {
                ExifInterface a = C14105ab.this.mo26350a(a.mSourceUri);
                if (a == null || !a.hasThumbnail()) {
                    return null;
                }
                return C14105ab.this.mo26351a(C14105ab.this.f36834a.mo25615a(a.getThumbnail()), a);
            }

            /* renamed from: b */
            public final /* synthetic */ void mo25574b(Object obj) {
                C14044e.m28705d((C14044e) obj);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final /* synthetic */ Map mo26352c(Object obj) {
                boolean z;
                String str = "createdThumbnail";
                if (((C14044e) obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C13683f.m27637of(str, Boolean.toString(z));
            }
        };
        anVar.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                r0.mo25570a();
            }
        });
        this.f36835b.execute(r0);
    }

    public C14105ab(Executor executor, C13711i iVar, ContentResolver contentResolver) {
        this.f36835b = executor;
        this.f36834a = iVar;
        this.f36836c = contentResolver;
    }
}
