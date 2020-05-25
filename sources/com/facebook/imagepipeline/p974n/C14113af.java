package com.facebook.imagepipeline.p974n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Video.Media;
import com.facebook.common.p920d.C13683f;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.p963c.C13948g;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.imagepipeline.p975o.C14229b;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.af */
public final class C14113af implements C14139am<C13715a<C14042c>> {

    /* renamed from: a */
    private final Executor f36850a;

    /* renamed from: b */
    private final ContentResolver f36851b;

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final String mo26355a(C14229b bVar) {
        String[] strArr;
        String str;
        Uri uri;
        Uri uri2 = bVar.mSourceUri;
        if (C13731f.m27779c(uri2)) {
            return bVar.getSourceFile().getPath();
        }
        if (C13731f.m27780d(uri2)) {
            if (VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(uri2.getAuthority())) {
                uri = uri2;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(uri2);
                uri = Media.EXTERNAL_CONTENT_URI;
                str = "_id=?";
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f36851b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    public C14113af(Executor executor, ContentResolver contentResolver) {
        this.f36850a = executor;
        this.f36851b = contentResolver;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C13715a<C14042c>> kVar, C14140an anVar) {
        final C14142ap c = anVar.mo26387c();
        final String b = anVar.mo26386b();
        final C14229b a = anVar.mo26384a();
        final C141141 r0 = new C14152au<C13715a<C14042c>>(kVar, c, "VideoThumbnailProducer", b) {
            /* renamed from: c */
            public final /* synthetic */ Object mo25575c() throws Exception {
                int i;
                String a = C14113af.this.mo26355a(a);
                if (a == null) {
                    return null;
                }
                C14229b bVar = a;
                if (bVar.getPreferredWidth() > 96 || bVar.getPreferredHeight() > 96) {
                    i = 1;
                } else {
                    i = 3;
                }
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a, i);
                if (createVideoThumbnail == null) {
                    return null;
                }
                return C13715a.m27746a(new C14043d(createVideoThumbnail, (C13718c<Bitmap>) C13948g.m28419a(), C14046g.f36711a, 0));
            }

            /* renamed from: b */
            public final /* synthetic */ void mo25574b(Object obj) {
                C13715a.m27752c((C13715a) obj);
            }

            /* renamed from: a */
            public final void mo25571a(Exception exc) {
                super.mo25571a(exc);
                c.onUltimateProducerReached(b, "VideoThumbnailProducer", false);
            }

            /* renamed from: a */
            public final /* synthetic */ void mo25572a(Object obj) {
                boolean z;
                C13715a aVar = (C13715a) obj;
                super.mo25572a(aVar);
                C14142ap apVar = c;
                String str = b;
                String str2 = "VideoThumbnailProducer";
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                apVar.onUltimateProducerReached(str, str2, z);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final /* synthetic */ Map mo26352c(Object obj) {
                boolean z;
                String str = "createdThumbnail";
                if (((C13715a) obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C13683f.m27637of(str, String.valueOf(z));
            }
        };
        anVar.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                r0.mo25570a();
            }
        });
        this.f36850a.execute(r0);
    }
}
