package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.sharer.C42254a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42320g;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42314d;
import com.snapchat.kit.sdk.SnapCreative;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.exceptions.SnapMediaSizeException;
import com.snapchat.kit.sdk.creative.exceptions.SnapVideoLengthException;
import com.snapchat.kit.sdk.creative.media.SnapPhotoFile;
import com.snapchat.kit.sdk.creative.media.SnapVideoFile;
import com.snapchat.kit.sdk.creative.models.SnapPhotoContent;
import com.snapchat.kit.sdk.creative.models.SnapVideoContent;
import com.snapchat.kit.sdk.util.SnapUtils;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.s */
public final class C42291s extends C42254a {

    /* renamed from: a */
    public static final C42292a f106845a = new C42292a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.s$a */
    public static final class C42292a {
        private C42292a() {
        }

        public /* synthetic */ C42292a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.ao9;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "snapchat";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Snapchat";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.au0;
    }

    /* renamed from: a */
    public final boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        return C42314d.m92913a(context, "com.snapchat.android");
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !SnapUtils.isSnapchatInstalled(context.getPackageManager(), "com.snapchat.android")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        File file = new File(iVar.f106881c);
        if (file.exists()) {
            SnapCreativeKitApi api = SnapCreative.getApi(context);
            try {
                SnapPhotoFile snapPhotoFromFile = SnapCreative.getMediaFactory(context).getSnapPhotoFromFile(file);
                C52711k.m112236a((Object) snapPhotoFromFile, "snapMediaFactory.getSnapPhotoFromFile(file)");
                if (snapPhotoFromFile != null) {
                    SnapPhotoContent snapPhotoContent = new SnapPhotoContent(snapPhotoFromFile);
                    snapPhotoContent.setAttachmentUrl(iVar.f106885g);
                    api.send(snapPhotoContent);
                    return true;
                }
                throw new C42320g("file_not_found");
            } catch (SnapMediaSizeException unused) {
                throw new C42320g("file_too_large");
            }
        } else {
            throw new C42320g("file_not_found");
        }
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        File file = new File(kVar.f106889c);
        if (file.exists()) {
            SnapCreativeKitApi api = SnapCreative.getApi(context);
            try {
                SnapVideoFile snapVideoFromFile = SnapCreative.getMediaFactory(context).getSnapVideoFromFile(file);
                C52711k.m112236a((Object) snapVideoFromFile, "snapMediaFactory.getSnapVideoFromFile(file)");
                if (snapVideoFromFile != null) {
                    SnapVideoContent snapVideoContent = new SnapVideoContent(snapVideoFromFile);
                    snapVideoContent.setAttachmentUrl(kVar.f106893g);
                    api.send(snapVideoContent);
                    return true;
                }
                throw new C42320g("file_not_found");
            } catch (SnapMediaSizeException unused) {
                throw new C42320g("file_too_large");
            } catch (SnapVideoLengthException unused2) {
                throw new C42320g("video_too_long");
            }
        } else {
            throw new C42320g("file_not_found");
        }
    }
}
