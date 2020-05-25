package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IAbilityService;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.b */
public final class C34413b {

    /* renamed from: a */
    public static final C34413b f88804a = new C34413b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.b$a */
    public static final class C34414a implements IGetInfoCallback<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C0027j f88805a;

        C34414a(C0027j jVar) {
            this.f88805a = jVar;
        }

        public final /* synthetic */ void finish(Object obj) {
            this.f88805a.mo44a((Bitmap) obj);
        }
    }

    private C34413b() {
    }

    /* renamed from: a */
    private static void m78360a(RemoteImageView remoteImageView) {
        Object tag = remoteImageView.getTag(50331648);
        if (!(tag instanceof Bitmap)) {
            tag = null;
        }
        Bitmap bitmap = (Bitmap) tag;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            remoteImageView.setTag(50331648, null);
        }
    }

    /* renamed from: a */
    private final boolean m78361a(RemoteImageView remoteImageView, C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        C0027j jVar = new C0027j();
        if (aVar.isGif()) {
            jVar.mo44a(null);
        }
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        if (aVServiceImpl_Monster != null) {
            IAbilityService abilityService = aVServiceImpl_Monster.abilityService();
            if (abilityService != null) {
                IAVInfoService infoService = abilityService.infoService();
                if (infoService != null) {
                    infoService.getThumbnail(true, aVar.getId(), aVar.getDateModify(), aVar.isVideo(), null, new C34414a(jVar));
                }
            }
        }
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        try {
            iVar.mo36g();
        } catch (InterruptedException unused) {
        }
        Bitmap bitmap = (Bitmap) iVar.mo34e();
        if (bitmap == null) {
            return false;
        }
        remoteImageView.setTag(50331648, bitmap);
        remoteImageView.setImageBitmap(bitmap);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72446a(com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView r2, com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "mediaModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            m78360a(r2)
            if (r6 == 0) goto L_0x0015
            boolean r6 = r1.m78361a(r2, r3)
            if (r6 != 0) goto L_0x004c
        L_0x0015:
            boolean r6 = r3.isVideo()
            if (r6 != 0) goto L_0x0034
            java.lang.String r6 = r3.getThumbnail()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x002c
            int r6 = r6.length()
            if (r6 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r6 = 0
            goto L_0x002d
        L_0x002c:
            r6 = 1
        L_0x002d:
            if (r6 == 0) goto L_0x0034
            java.lang.String r3 = r3.getFilePath()
            goto L_0x0038
        L_0x0034:
            java.lang.String r3 = r3.getThumbnail()
        L_0x0038:
            if (r3 == 0) goto L_0x004c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "file://"
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.p683ss.android.ugc.aweme.base.C23515d.m57686b(r2, r3, r4, r5)
            return
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34413b.mo72446a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.im.sdk.media.b.a, int, int, boolean):void");
    }
}
