package com.twitter.sdk.android.tweetcomposer;

import android.app.IntentService;
import android.content.Intent;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52191m;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.models.C52209m;

public class TweetUploadService extends IntentService {

    /* renamed from: a */
    C52238a f130082a;

    /* renamed from: b */
    Intent f130083b;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.TweetUploadService$a */
    static class C52238a {
        C52238a() {
        }

        /* renamed from: a */
        static C52191m m111657a(C52231v vVar) {
            return C52225r.m111638a().mo108949a(vVar);
        }
    }

    public TweetUploadService() {
        this(new C52238a());
    }

    TweetUploadService(C52238a aVar) {
        super("TweetUploadService");
        this.f130082a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo108986a(C52229t tVar) {
        m111650a(this.f130083b);
        stopSelf();
    }

    /* renamed from: a */
    private void m111650a(Intent intent) {
        Intent intent2 = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE");
        intent2.putExtra("EXTRA_RETRY_INTENT", intent);
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "EXTRA_USER_TOKEN"
            android.os.Parcelable r0 = r8.getParcelableExtra(r0)
            com.twitter.sdk.android.core.TwitterAuthToken r0 = (com.twitter.sdk.android.core.TwitterAuthToken) r0
            r7.f130083b = r8
            com.twitter.sdk.android.core.v r1 = new com.twitter.sdk.android.core.v
            java.lang.String r2 = ""
            r3 = -1
            r1.<init>(r0, r3, r2)
            java.lang.String r0 = "EXTRA_TWEET_TEXT"
            java.lang.String r0 = r8.getStringExtra(r0)
            java.lang.String r2 = "EXTRA_IMAGE_URI"
            android.os.Parcelable r8 = r8.getParcelableExtra(r2)
            android.net.Uri r8 = (android.net.Uri) r8
            r2 = 0
            if (r8 == 0) goto L_0x00db
            com.twitter.sdk.android.tweetcomposer.TweetUploadService$1 r3 = new com.twitter.sdk.android.tweetcomposer.TweetUploadService$1
            r3.<init>(r1, r0)
            com.twitter.sdk.android.core.m r0 = com.twitter.sdk.android.tweetcomposer.TweetUploadService.C52238a.m111657a(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 19
            r5 = 0
            r6 = 1
            if (r1 < r4) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x006b
            java.lang.String r1 = "com.android.providers.media.documents"
            java.lang.String r4 = r8.getAuthority()
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x006b
            java.lang.String r8 = android.provider.DocumentsContract.getDocumentId(r8)
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r8.split(r1)
            r1 = r8[r5]
            java.lang.String r4 = "image"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0069
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r4 = new java.lang.String[r6]
            r8 = r8[r6]
            r4[r5] = r8
            java.lang.String r8 = "_id=?"
            java.lang.String r8 = com.twitter.sdk.android.tweetcomposer.C52250h.m111674a(r7, r1, r8, r4)
            goto L_0x008c
        L_0x0069:
            r8 = r2
            goto L_0x008c
        L_0x006b:
            java.lang.String r1 = "content"
            java.lang.String r4 = r8.getScheme()
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = com.twitter.sdk.android.tweetcomposer.C52250h.m111674a(r7, r8, r2, r2)
            goto L_0x008c
        L_0x007c:
            java.lang.String r1 = "file"
            java.lang.String r4 = r8.getScheme()
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x0069
            java.lang.String r8 = r8.getPath()
        L_0x008c:
            if (r8 != 0) goto L_0x0099
            com.twitter.sdk.android.core.t r8 = new com.twitter.sdk.android.core.t
            java.lang.String r0 = "Uri file path resolved to null"
            r8.<init>(r0)
            r7.mo108986a(r8)
            goto L_0x00de
        L_0x0099:
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            java.lang.String r8 = r1.getName()
            if (r8 != 0) goto L_0x00a6
            r8 = r2
            goto L_0x00b6
        L_0x00a6:
            java.lang.String r4 = "."
            int r4 = r8.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x00b1
            java.lang.String r8 = ""
            goto L_0x00b6
        L_0x00b1:
            int r4 = r4 + r6
            java.lang.String r8 = r8.substring(r4)
        L_0x00b6:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L_0x00c5
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r8 = r4.getMimeTypeFromExtension(r8)
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r8 = "application/octet-stream"
        L_0x00c7:
            okhttp3.w r8 = okhttp3.C53678w.m114225a(r8)
            okhttp3.ac r8 = okhttp3.C53500ac.create(r8, r1)
            com.twitter.sdk.android.core.services.MediaService r0 = r0.mo108924d()
            g.b r8 = r0.upload(r8, r2, r2)
            r8.mo110595a(r3)
            return
        L_0x00db:
            r7.mo108987a(r1, r0, r2)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetcomposer.TweetUploadService.onHandleIntent(android.content.Intent):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo108987a(C52231v vVar, String str, String str2) {
        C52238a.m111657a(vVar).mo108923c().update(str, null, null, null, null, null, null, Boolean.valueOf(true), str2).mo110595a(new C52068b<C52209m>() {
            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                TweetUploadService.this.mo108986a(tVar);
            }

            /* renamed from: a */
            public final void mo23366a(C52077i<C52209m> iVar) {
                TweetUploadService tweetUploadService = TweetUploadService.this;
                long j = ((C52209m) iVar.f129666a).f129969i;
                Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS");
                intent.putExtra("EXTRA_TWEET_ID", j);
                intent.setPackage(tweetUploadService.getApplicationContext().getPackageName());
                tweetUploadService.sendBroadcast(intent);
                TweetUploadService.this.stopSelf();
            }
        });
    }
}
