package com.facebook.share.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.C2240a;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.share.internal.j */
public final class C14601j {

    /* renamed from: a */
    public static C14604b f37900a;

    /* renamed from: b */
    private static C14604b f37901b;

    /* renamed from: c */
    private static C14604b f37902c;

    /* renamed from: com.facebook.share.internal.j$a */
    public static class C14603a extends C14604b {
        private C14603a() {
            super();
        }

        /* renamed from: a */
        public final void mo26834a(ShareStoryContent shareStoryContent) {
            C14601j.m29899a(shareStoryContent, (C14604b) this);
        }
    }

    /* renamed from: com.facebook.share.internal.j$b */
    static class C14604b {

        /* renamed from: a */
        public boolean f37903a;

        private C14604b() {
        }

        /* renamed from: a */
        public final void mo26843a(SharePhotoContent sharePhotoContent) {
            C14601j.m29898a(sharePhotoContent, this);
        }

        /* renamed from: a */
        public final void mo26844a(ShareVideo shareVideo) {
            C14601j.m29900a(shareVideo, this);
        }

        /* renamed from: a */
        public void mo26834a(ShareStoryContent shareStoryContent) {
            C14601j.m29899a(shareStoryContent, this);
        }

        /* renamed from: a */
        public void mo26845a(ShareVideoContent shareVideoContent) {
            mo26844a(shareVideoContent.f38019d);
            SharePhoto sharePhoto = shareVideoContent.f38018c;
            if (sharePhoto != null) {
                mo26842a(sharePhoto);
            }
        }

        /* renamed from: a */
        public void mo26842a(SharePhoto sharePhoto) {
            C14601j.m29897a(sharePhoto);
            Bitmap bitmap = sharePhoto.f38000b;
            Uri uri = sharePhoto.f38001c;
            if (bitmap == null && C14277aa.m29284b(uri) && !this.f37903a) {
                throw new C14457k("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            } else if (sharePhoto.f38000b != null || !C14277aa.m29284b(sharePhoto.f38001c)) {
                Context g = C14533n.m29773g();
                C14283ab.m29306a((Object) g, "context");
                String b = C14283ab.m29309b();
                PackageManager packageManager = g.getPackageManager();
                if (packageManager != null) {
                    StringBuilder sb = new StringBuilder("com.facebook.app.FacebookContentProvider");
                    sb.append(b);
                    String sb2 = sb.toString();
                    if (packageManager.resolveContentProvider(sb2, 0) == null) {
                        throw new IllegalStateException(C2240a.m6772a("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{sb2}));
                    }
                }
            }
        }

        /* renamed from: a */
        public static void m29904a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
            C14601j.m29890a(shareMessengerGenericTemplateContent);
        }

        /* renamed from: a */
        public static void m29905a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            C14601j.m29891a(shareMessengerMediaTemplateContent);
        }

        /* renamed from: a */
        public static void m29906a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
            C14601j.m29892a(shareMessengerOpenGraphMusicTemplateContent);
        }

        /* renamed from: a */
        public final void mo26835a(ShareCameraEffectContent shareCameraEffectContent) {
            C14601j.m29884a(shareCameraEffectContent, this);
        }

        /* renamed from: a */
        public final void mo26836a(ShareLinkContent shareLinkContent) {
            C14601j.m29887a(shareLinkContent, this);
        }

        /* renamed from: a */
        public final void mo26837a(ShareMedia shareMedia) {
            C14601j.m29888a(shareMedia, this);
        }

        /* renamed from: a */
        public void mo26838a(ShareMediaContent shareMediaContent) {
            List<ShareMedia> list = shareMediaContent.f37972a;
            if (list == null || list.isEmpty()) {
                throw new C14457k("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() <= 6) {
                for (ShareMedia a : list) {
                    mo26837a(a);
                }
            } else {
                throw new C14457k(C2240a.m6773a(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
            }
        }

        /* renamed from: a */
        public final void mo26839a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f37903a = true;
            C14601j.m29894a(shareOpenGraphContent, this);
        }

        /* renamed from: a */
        public final void mo26840a(ShareOpenGraphObject shareOpenGraphObject) {
            C14601j.m29895a(shareOpenGraphObject, this);
        }

        /* renamed from: a */
        public final void mo26841a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            C14601j.m29896a(shareOpenGraphValueContainer, this, z);
        }
    }

    /* renamed from: com.facebook.share.internal.j$c */
    static class C14605c extends C14604b {
        private C14605c() {
            super();
        }

        /* renamed from: a */
        public final void mo26842a(SharePhoto sharePhoto) {
            C14601j.m29897a(sharePhoto);
        }

        /* renamed from: a */
        public final void mo26838a(ShareMediaContent shareMediaContent) {
            throw new C14457k("Cannot share ShareMediaContent via web sharing dialogs");
        }

        /* renamed from: a */
        public final void mo26845a(ShareVideoContent shareVideoContent) {
            throw new C14457k("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* renamed from: a */
    public static void m29899a(ShareStoryContent shareStoryContent, C14604b bVar) {
        if (shareStoryContent == null || (shareStoryContent.f38010a == null && shareStoryContent.f38011b == null)) {
            throw new C14457k("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.f38010a != null) {
            bVar.mo26837a(shareStoryContent.f38010a);
        }
        if (shareStoryContent.f38011b != null) {
            bVar.mo26842a(shareStoryContent.f38011b);
        }
    }

    /* renamed from: a */
    public static void m29898a(SharePhotoContent sharePhotoContent, C14604b bVar) {
        List<SharePhoto> list = sharePhotoContent.f38008a;
        if (list == null || list.isEmpty()) {
            throw new C14457k("Must specify at least one Photo in SharePhotoContent.");
        } else if (list.size() <= 6) {
            for (SharePhoto a : list) {
                bVar.mo26842a(a);
            }
        } else {
            throw new C14457k(C2240a.m6773a(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
        }
    }

    /* renamed from: a */
    static void m29897a(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap bitmap = sharePhoto.f38000b;
            Uri uri = sharePhoto.f38001c;
            if (bitmap == null && uri == null) {
                throw new C14457k("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new C14457k("Cannot share a null SharePhoto");
    }

    /* renamed from: a */
    public static void m29900a(ShareVideo shareVideo, C14604b bVar) {
        if (shareVideo != null) {
            Uri uri = shareVideo.f38014b;
            if (uri == null) {
                throw new C14457k("ShareVideo does not have a LocalUrl specified");
            } else if (!C14277aa.m29288c(uri) && !C14277aa.m29292d(uri)) {
                throw new C14457k("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new C14457k("Cannot share a null ShareVideo");
        }
    }

    /* renamed from: a */
    public static void m29894a(ShareOpenGraphContent shareOpenGraphContent, C14604b bVar) {
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f37996a;
        if (shareOpenGraphAction == null) {
            throw new C14457k("Must specify a non-null ShareOpenGraphAction");
        } else if (!C14277aa.m29276a(shareOpenGraphAction.mo26900a())) {
            bVar.mo26841a(shareOpenGraphAction, false);
            String str = shareOpenGraphContent.f37997b;
            if (C14277aa.m29276a(str)) {
                throw new C14457k("Must specify a previewPropertyName.");
            } else if (shareOpenGraphContent.f37996a.mo26909a(str) == null) {
                StringBuilder sb = new StringBuilder("Property \"");
                sb.append(str);
                sb.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
                throw new C14457k(sb.toString());
            }
        } else {
            throw new C14457k("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    /* renamed from: a */
    public static void m29895a(ShareOpenGraphObject shareOpenGraphObject, C14604b bVar) {
        if (shareOpenGraphObject != null) {
            bVar.mo26841a(shareOpenGraphObject, true);
            return;
        }
        throw new C14457k("Cannot share a null ShareOpenGraphObject");
    }

    /* renamed from: a */
    public static void m29896a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, C14604b bVar, boolean z) {
        for (String str : shareOpenGraphValueContainer.mo26911b()) {
            if (z) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        if (!split[i].isEmpty()) {
                            i++;
                        } else {
                            throw new C14457k("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                } else {
                    throw new C14457k("Open Graph keys must be namespaced: %s", str);
                }
            }
            Object a = shareOpenGraphValueContainer.mo26909a(str);
            if (a instanceof List) {
                for (Object next : (List) a) {
                    if (next != null) {
                        m29901a(next, bVar);
                    } else {
                        throw new C14457k("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                m29901a(a, bVar);
            }
        }
    }

    /* renamed from: a */
    public static void m29892a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (C14277aa.m29276a(shareMessengerOpenGraphMusicTemplateContent.f37949k)) {
            throw new C14457k("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (shareMessengerOpenGraphMusicTemplateContent.f37988a != null) {
            m29889a(shareMessengerOpenGraphMusicTemplateContent.f37989b);
        } else {
            throw new C14457k("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    /* renamed from: a */
    public static void m29891a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (C14277aa.m29276a(shareMessengerMediaTemplateContent.f37949k)) {
            throw new C14457k("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.f37985c != null || !C14277aa.m29276a(shareMessengerMediaTemplateContent.f37984b)) {
            m29889a(shareMessengerMediaTemplateContent.f37986d);
        } else {
            throw new C14457k("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    /* renamed from: a */
    private static void m29901a(Object obj, C14604b bVar) {
        if (obj instanceof ShareOpenGraphObject) {
            bVar.mo26840a((ShareOpenGraphObject) obj);
            return;
        }
        if (obj instanceof SharePhoto) {
            bVar.mo26842a((SharePhoto) obj);
        }
    }

    /* renamed from: a */
    private static void m29893a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f37990b == null) {
            throw new C14457k("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* renamed from: b */
    public static void m29902b(ShareContent shareContent) {
        if (f37901b == null) {
            f37901b = new C14605c();
        }
        m29886a(shareContent, f37901b);
    }

    /* renamed from: a */
    public static void m29885a(ShareContent shareContent) {
        if (f37902c == null) {
            f37902c = new C14604b();
        }
        m29886a(shareContent, f37902c);
    }

    /* renamed from: a */
    private static void m29889a(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            if (!C14277aa.m29276a(shareMessengerActionButton.f37973a)) {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    m29893a((ShareMessengerURLActionButton) shareMessengerActionButton);
                }
                return;
            }
            throw new C14457k("Must specify title for ShareMessengerActionButton");
        }
    }

    /* renamed from: a */
    public static void m29890a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (C14277aa.m29276a(shareMessengerGenericTemplateContent.f37949k)) {
            throw new C14457k("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.f37976c == null) {
            throw new C14457k("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!C14277aa.m29276a(shareMessengerGenericTemplateContent.f37976c.f37978a)) {
            m29889a(shareMessengerGenericTemplateContent.f37976c.f37982e);
        } else {
            throw new C14457k("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    /* renamed from: a */
    public static void m29884a(ShareCameraEffectContent shareCameraEffectContent, C14604b bVar) {
        if (C14277aa.m29276a(shareCameraEffectContent.f37943a)) {
            throw new C14457k("Must specify a non-empty effectId");
        }
    }

    /* renamed from: a */
    public static void m29886a(ShareContent shareContent, C14604b bVar) throws C14457k {
        if (shareContent == null) {
            throw new C14457k("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            bVar.mo26836a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            bVar.mo26843a((SharePhotoContent) shareContent);
        } else if (shareContent instanceof ShareVideoContent) {
            bVar.mo26845a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            bVar.mo26839a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            bVar.mo26838a((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            bVar.mo26835a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            C14604b.m29906a((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            C14604b.m29905a((ShareMessengerMediaTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            C14604b.m29904a((ShareMessengerGenericTemplateContent) shareContent);
        } else {
            if (shareContent instanceof ShareStoryContent) {
                bVar.mo26834a((ShareStoryContent) shareContent);
            }
        }
    }

    /* renamed from: a */
    public static void m29887a(ShareLinkContent shareLinkContent, C14604b bVar) {
        Uri uri = shareLinkContent.f37962c;
        if (uri != null && !C14277aa.m29284b(uri)) {
            throw new C14457k("Image Url must be an http:// or https:// url");
        }
    }

    /* renamed from: a */
    public static void m29888a(ShareMedia shareMedia, C14604b bVar) {
        if (shareMedia instanceof SharePhoto) {
            bVar.mo26842a((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            bVar.mo26844a((ShareVideo) shareMedia);
        } else {
            throw new C14457k(C2240a.m6773a(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }
}
