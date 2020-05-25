package com.p683ss.android.ugc.aweme.watermark;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p030v4.p038f.C0781c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.photo.C38652a;
import com.p683ss.android.ugc.aweme.photo.C38657e;
import com.p683ss.android.ugc.aweme.photo.C38657e.C38664a;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoProcessService.IPhotoServiceListener;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.watermark.f */
public final class C48238f implements IPhotoProcessService {
    /* renamed from: a */
    public static void m104493a(File file) throws Exception {
        C39618d.f101160a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    public final void photoAddWaterMarker(Bitmap bitmap, final IPhotoServiceListener iPhotoServiceListener) {
        C38657e.m85998a((C0781c<Bitmap>) new C0781c<Bitmap>(bitmap, new C38664a() {
            /* renamed from: a */
            public final void mo78588a(Bitmap bitmap) {
                if (iPhotoServiceListener != null) {
                    iPhotoServiceListener.onWaterMakerAdded(bitmap);
                    C26890h.m65011a("add_watermark", C23089d.m56640a().mo47829a("enter_from", "download_video").f61491a);
                }
            }
        }) {

            /* renamed from: a */
            final /* synthetic */ Bitmap f98332a;

            /* renamed from: b */
            final /* synthetic */ C38664a f98333b;

            public final /* synthetic */ void accept(Object obj) {
                C38657e.m85997a(this.f98332a, (Bitmap) obj, this.f98333b);
            }

            {
                this.f98332a = r1;
                this.f98333b = r2;
            }
        });
    }

    public final void savePhotoWithWaterMarker(final PhotoContext photoContext, final IPhotoServiceListener iPhotoServiceListener) {
        C38657e.m85999a(photoContext, (C38664a) new C38664a() {
            /* renamed from: a */
            public final void mo78588a(final Bitmap bitmap) {
                if (bitmap == null) {
                    if (iPhotoServiceListener != null) {
                        iPhotoServiceListener.onSaved(-1, null);
                    }
                    return;
                }
                C18842a.m45932a(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[SYNTHETIC, Splitter:B:20:0x005d] */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[SYNTHETIC, Splitter:B:27:0x0070] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r5 = this;
                            com.ss.android.ugc.aweme.photo.a r0 = new com.ss.android.ugc.aweme.photo.a
                            android.app.Application r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
                            r0.<init>(r1)
                            java.io.File r1 = new java.io.File
                            java.lang.String r0 = r0.mo78585a()
                            r1.<init>(r0)
                            r0 = 0
                            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006e, all -> 0x0058 }
                            r2.<init>(r1)     // Catch:{ Exception -> 0x006e, all -> 0x0058 }
                            android.graphics.Bitmap r0 = r3     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r4 = 100
                            r0.compress(r3, r4, r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r2.flush()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.ss.android.ugc.aweme.watermark.f$2 r3 = com.p683ss.android.ugc.aweme.watermark.C48238f.C482402.this     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.ss.android.ugc.aweme.photo.PhotoContext r3 = r2     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            java.lang.String r3 = r3.mPhotoLocalPath     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r0.<init>(r3)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            boolean r3 = r0.exists()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            if (r3 == 0) goto L_0x0036
                            r0.delete()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                        L_0x0036:
                            com.ss.android.ugc.aweme.watermark.f$2 r0 = com.p683ss.android.ugc.aweme.watermark.C48238f.C482402.this     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.ss.android.ugc.aweme.photo.PhotoContext r0 = r2     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            java.lang.String r3 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r0.mPhotoLocalPath = r3     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            com.p683ss.android.ugc.aweme.watermark.C48238f.m104493a(r1)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
                            r2.close()     // Catch:{ Exception -> 0x0046 }
                        L_0x0046:
                            android.graphics.Bitmap r0 = r3
                            r0.recycle()
                            com.ss.android.ugc.aweme.watermark.f$2$1$1 r0 = new com.ss.android.ugc.aweme.watermark.f$2$1$1
                            r0.<init>()
                        L_0x0050:
                            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45934b(r0)
                            return
                        L_0x0054:
                            r0 = move-exception
                            goto L_0x005b
                        L_0x0056:
                            r0 = r2
                            goto L_0x006e
                        L_0x0058:
                            r1 = move-exception
                            r2 = r0
                            r0 = r1
                        L_0x005b:
                            if (r2 == 0) goto L_0x0060
                            r2.close()     // Catch:{ Exception -> 0x0060 }
                        L_0x0060:
                            android.graphics.Bitmap r1 = r3
                            r1.recycle()
                            com.ss.android.ugc.aweme.watermark.f$2$1$1 r1 = new com.ss.android.ugc.aweme.watermark.f$2$1$1
                            r1.<init>()
                            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45934b(r1)
                            throw r0
                        L_0x006e:
                            if (r0 == 0) goto L_0x0073
                            r0.close()     // Catch:{ Exception -> 0x0073 }
                        L_0x0073:
                            android.graphics.Bitmap r0 = r3
                            r0.recycle()
                            com.ss.android.ugc.aweme.watermark.f$2$1$1 r0 = new com.ss.android.ugc.aweme.watermark.f$2$1$1
                            r0.<init>()
                            goto L_0x0050
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.watermark.C48238f.C482402.C482411.run():void");
                    }
                });
            }
        });
    }

    public final void savePhotoWithoutWaterMarker(final PhotoContext photoContext, final IPhotoServiceListener iPhotoServiceListener) {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                C482441 r0;
                C38652a aVar = new C38652a(C39618d.f101160a);
                File file = new File(aVar.mo78585a());
                try {
                    File file2 = new File(photoContext.mPhotoLocalPath);
                    C48016e.m103948c(photoContext.mPhotoLocalPath, aVar.mo78585a());
                    photoContext.mPhotoLocalPath = file.getAbsolutePath();
                    C48238f.m104493a(file);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    r0 = new Runnable() {
                        public final void run() {
                            int i;
                            if (iPhotoServiceListener != null) {
                                IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener;
                                if (C48016e.m103944b(photoContext.mPhotoLocalPath)) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext);
                            }
                        }
                    };
                } catch (Exception unused) {
                    r0 = new Runnable() {
                        public final void run() {
                            int i;
                            if (iPhotoServiceListener != null) {
                                IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener;
                                if (C48016e.m103944b(photoContext.mPhotoLocalPath)) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext);
                            }
                        }
                    };
                } catch (Throwable th) {
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            int i;
                            if (iPhotoServiceListener != null) {
                                IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener;
                                if (C48016e.m103944b(photoContext.mPhotoLocalPath)) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext);
                            }
                        }
                    });
                    throw th;
                }
                C18842a.m45934b(r0);
            }
        });
    }

    public final void photoAddStoryWaterMarker(String str, String str2, IPhotoServiceListener iPhotoServiceListener) {
        C0013i.m16a((Callable<TResult>) new C48245g<TResult>(str, iPhotoServiceListener, str2));
    }
}
