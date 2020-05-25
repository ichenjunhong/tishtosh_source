package com.facebook.share.p990a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C13904i;
import com.facebook.C14457k;
import com.facebook.C14529m;
import com.facebook.internal.C14262a;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14308d;
import com.facebook.internal.C14308d.C14309a;
import com.facebook.internal.C14308d.C14310b;
import com.facebook.internal.C14312f;
import com.facebook.internal.C14313g;
import com.facebook.internal.C14313g.C14314a;
import com.facebook.internal.C14315h;
import com.facebook.internal.C14315h.C14316a;
import com.facebook.internal.C14350u;
import com.facebook.internal.C14350u.C14352a;
import com.facebook.internal.C14353v;
import com.facebook.p909a.C13589l;
import com.facebook.share.C14567a;
import com.facebook.share.C14567a.C14568a;
import com.facebook.share.internal.C14586a;
import com.facebook.share.internal.C14593d;
import com.facebook.share.internal.C14596f;
import com.facebook.share.internal.C14597g;
import com.facebook.share.internal.C14601j;
import com.facebook.share.internal.C14601j.C14603a;
import com.facebook.share.internal.C14606k;
import com.facebook.share.internal.C14607l;
import com.facebook.share.internal.C14618m;
import com.facebook.share.internal.C14619n;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.C14656a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.C14658a;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.facebook.share.a.a */
public final class C14569a extends C14315h<ShareContent, C14568a> implements C14567a {

    /* renamed from: c */
    private static final String f37846c = "a";

    /* renamed from: d */
    private static final int f37847d = C14310b.Share.toRequestCode();

    /* renamed from: e */
    private boolean f37848e;

    /* renamed from: f */
    private boolean f37849f = true;

    /* renamed from: com.facebook.share.a.a$a */
    class C14571a extends C14316a {
        /* renamed from: a */
        public final Object mo26533a() {
            return C14574c.NATIVE;
        }

        private C14571a() {
            super();
        }

        /* renamed from: a */
        public final /* synthetic */ C14262a mo26532a(Object obj) {
            final ShareContent shareContent = (ShareContent) obj;
            C14601j.m29885a(shareContent);
            final C14262a c = C14569a.this.mo26531c();
            final boolean d = C14569a.this.mo26812d();
            C14313g.m29352a(c, (C14314a) new C14314a() {
                /* renamed from: a */
                public final Bundle mo26525a() {
                    return C14596f.m29875a(c.f37173a, shareContent, d);
                }

                /* renamed from: b */
                public final Bundle mo26526b() {
                    return C14593d.m29861a(c.f37173a, shareContent, d);
                }
            }, C14569a.m29823b(shareContent.getClass()));
            return c;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo26534a(Object obj, boolean z) {
            ShareContent shareContent = (ShareContent) obj;
            if (!(shareContent instanceof ShareCameraEffectContent) || !C14569a.m29822a(shareContent.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.a.a$b */
    class C14573b extends C14316a {
        /* renamed from: a */
        public final Object mo26533a() {
            return C14574c.FEED;
        }

        private C14573b() {
            super();
        }

        /* renamed from: a */
        public final /* synthetic */ C14262a mo26532a(Object obj) {
            Bundle bundle;
            ShareContent shareContent = (ShareContent) obj;
            C14569a.this.mo26811a(C14569a.this.mo26527a(), shareContent, C14574c.FEED);
            C14262a c = C14569a.this.mo26531c();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                C14601j.m29902b(shareLinkContent);
                bundle = new Bundle();
                C14277aa.m29265a(bundle, LeakCanaryFileProvider.f132049i, shareLinkContent.f37961b);
                C14277aa.m29265a(bundle, "description", shareLinkContent.f37960a);
                C14277aa.m29265a(bundle, "link", C14277aa.m29251a(shareLinkContent.f37946h));
                C14277aa.m29265a(bundle, "picture", C14277aa.m29251a(shareLinkContent.f37962c));
                C14277aa.m29265a(bundle, "quote", shareLinkContent.f37963d);
                if (shareLinkContent.f37951m != null) {
                    C14277aa.m29265a(bundle, "hashtag", shareLinkContent.f37951m.f37958a);
                }
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
                bundle = new Bundle();
                C14277aa.m29265a(bundle, "to", shareFeedContent.f37883a);
                C14277aa.m29265a(bundle, "link", shareFeedContent.f37884b);
                C14277aa.m29265a(bundle, "picture", shareFeedContent.f37888f);
                C14277aa.m29265a(bundle, "source", shareFeedContent.f37889g);
                C14277aa.m29265a(bundle, LeakCanaryFileProvider.f132049i, shareFeedContent.f37885c);
                C14277aa.m29265a(bundle, "caption", shareFeedContent.f37886d);
                C14277aa.m29265a(bundle, "description", shareFeedContent.f37887e);
            }
            C14313g.m29354a(c, C22858c.f61207c, bundle);
            return c;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo26534a(Object obj, boolean z) {
            ShareContent shareContent = (ShareContent) obj;
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.facebook.share.a.a$c */
    public enum C14574c {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.share.a.a$d */
    class C14575d extends C14316a {
        /* renamed from: a */
        public final Object mo26533a() {
            return C14574c.NATIVE;
        }

        private C14575d() {
            super();
        }

        /* renamed from: a */
        public final /* synthetic */ C14262a mo26532a(Object obj) {
            final ShareContent shareContent = (ShareContent) obj;
            C14569a.this.mo26811a(C14569a.this.mo26527a(), shareContent, C14574c.NATIVE);
            C14601j.m29885a(shareContent);
            final C14262a c = C14569a.this.mo26531c();
            final boolean d = C14569a.this.mo26812d();
            C14313g.m29352a(c, (C14314a) new C14314a() {
                /* renamed from: a */
                public final Bundle mo26525a() {
                    return C14596f.m29875a(c.f37173a, shareContent, d);
                }

                /* renamed from: b */
                public final Bundle mo26526b() {
                    return C14593d.m29861a(c.f37173a, shareContent, d);
                }
            }, C14569a.m29823b(shareContent.getClass()));
            return c;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo26534a(Object obj, boolean z) {
            boolean z2;
            ShareContent shareContent = (ShareContent) obj;
            if (shareContent == null || (shareContent instanceof ShareCameraEffectContent) || (shareContent instanceof ShareStoryContent)) {
                return false;
            }
            if (!z) {
                if (shareContent.f37951m != null) {
                    z2 = C14313g.m29355a(C14606k.HASHTAG);
                } else {
                    z2 = true;
                }
                if ((shareContent instanceof ShareLinkContent) && !C14277aa.m29276a(((ShareLinkContent) shareContent).f37963d)) {
                    z2 &= C14313g.m29355a(C14606k.LINK_SHARE_QUOTES);
                }
            } else {
                z2 = true;
            }
            if (!z2 || !C14569a.m29822a(shareContent.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.a.a$e */
    class C14577e extends C14316a {
        /* renamed from: a */
        public final Object mo26533a() {
            return C14574c.NATIVE;
        }

        private C14577e() {
            super();
        }

        /* renamed from: a */
        public final /* synthetic */ C14262a mo26532a(Object obj) {
            final ShareContent shareContent = (ShareContent) obj;
            if (C14601j.f37900a == null) {
                C14601j.f37900a = new C14603a();
            }
            C14601j.m29886a(shareContent, C14601j.f37900a);
            final C14262a c = C14569a.this.mo26531c();
            final boolean d = C14569a.this.mo26812d();
            C14313g.m29352a(c, (C14314a) new C14314a() {
                /* renamed from: a */
                public final Bundle mo26525a() {
                    return C14596f.m29875a(c.f37173a, shareContent, d);
                }

                /* renamed from: b */
                public final Bundle mo26526b() {
                    return C14593d.m29861a(c.f37173a, shareContent, d);
                }
            }, C14569a.m29823b(shareContent.getClass()));
            return c;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo26534a(Object obj, boolean z) {
            ShareContent shareContent = (ShareContent) obj;
            if (!(shareContent instanceof ShareStoryContent) || !C14569a.m29822a(shareContent.getClass())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.facebook.share.a.a$f */
    class C14579f extends C14316a {
        /* renamed from: a */
        public final Object mo26533a() {
            return C14574c.WEB;
        }

        private C14579f() {
            super();
        }

        /* renamed from: a */
        public final /* synthetic */ C14262a mo26532a(Object obj) {
            Bundle bundle;
            ShareContent shareContent = (ShareContent) obj;
            C14569a.this.mo26811a(C14569a.this.mo26527a(), shareContent, C14574c.WEB);
            C14262a c = C14569a.this.mo26531c();
            C14601j.m29902b(shareContent);
            boolean z = shareContent instanceof ShareLinkContent;
            String str = null;
            if (z) {
                bundle = C14619n.m29948a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof SharePhotoContent) {
                SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
                UUID uuid = c.f37173a;
                C14658a a = new C14658a().mo26871a(sharePhotoContent);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < sharePhotoContent.f38008a.size(); i++) {
                    SharePhoto sharePhoto = (SharePhoto) sharePhotoContent.f38008a.get(i);
                    Bitmap bitmap = sharePhoto.f38000b;
                    if (bitmap != null) {
                        C14352a a2 = C14350u.m29419a(uuid, bitmap);
                        sharePhoto = new C14656a().mo26883a(sharePhoto).mo26917a(Uri.parse(a2.f37339b)).mo26916a((Bitmap) null).mo26920a();
                        arrayList2.add(a2);
                    }
                    arrayList.add(sharePhoto);
                }
                a.mo26925a((List<SharePhoto>) arrayList);
                C14350u.m29425a(arrayList2);
                bundle = C14619n.m29950a(a.mo26926a());
            } else {
                bundle = C14619n.m29949a((ShareOpenGraphContent) shareContent);
            }
            if (z || (shareContent instanceof SharePhotoContent)) {
                str = "share";
            } else if (shareContent instanceof ShareOpenGraphContent) {
                str = "share_open_graph";
            }
            C14313g.m29354a(c, str, bundle);
            return c;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo26534a(Object obj, boolean z) {
            ShareContent shareContent = (ShareContent) obj;
            if (shareContent == null || !C14569a.m29821a(shareContent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo26812d() {
        return this.f37848e;
    }

    /* renamed from: c */
    public final C14262a mo26531c() {
        return new C14262a(this.f37255b);
    }

    /* renamed from: b */
    public final List<C14316a> mo26529b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C14575d());
        arrayList.add(new C14573b());
        arrayList.add(new C14579f());
        arrayList.add(new C14571a());
        arrayList.add(new C14577e());
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m29822a(Class<? extends ShareContent> cls) {
        C14312f b = m29823b(cls);
        if (b == null || !C14313g.m29355a(b)) {
            return false;
        }
        return true;
    }

    public C14569a(Activity activity) {
        super(activity, f37847d);
        int i = f37847d;
        C14308d.m29348a(i, new C14309a(i) {

            /* renamed from: a */
            final /* synthetic */ int f37910a;

            {
                this.f37910a = r1;
            }

            /* renamed from: a */
            public final boolean mo26520a(int i, Intent intent) {
                C14262a aVar;
                int i2 = this.f37910a;
                Bundle bundle = null;
                C146081 r0 = new C14600i(null, null) {

                    /* renamed from: a */
                    final /* synthetic */ C13904i f37906a;

                    /* renamed from: a */
                    public final void mo26831a(C14262a aVar) {
                        C14607l.m29932a(this.f37906a);
                    }

                    {
                        this.f37906a = r2;
                    }

                    /* renamed from: a */
                    public final void mo26833a(C14262a aVar, C14457k kVar) {
                        C14607l.m29933a(this.f37906a, kVar);
                    }

                    /* renamed from: a */
                    public final void mo26832a(C14262a aVar, Bundle bundle) {
                        String str;
                        String str2;
                        if (bundle != null) {
                            if (bundle.containsKey("completionGesture")) {
                                str = bundle.getString("completionGesture");
                            } else {
                                str = bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
                            }
                            if (str == null || "post".equalsIgnoreCase(str)) {
                                if (bundle.containsKey("postId")) {
                                    str2 = bundle.getString("postId");
                                } else if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                                    str2 = bundle.getString("com.facebook.platform.extra.POST_ID");
                                } else {
                                    str2 = bundle.getString("post_id");
                                }
                                C13904i iVar = this.f37906a;
                                C14607l.m29934a("succeeded", (String) null);
                                if (iVar != null) {
                                    iVar.mo23329a(new C14568a(str2));
                                }
                            } else if ("cancel".equalsIgnoreCase(str)) {
                                C14607l.m29932a(this.f37906a);
                            } else {
                                C14607l.m29933a(this.f37906a, new C14457k("UnknownError"));
                            }
                        }
                    }
                };
                UUID b = C14353v.m29443b(intent);
                if (b == null) {
                    aVar = null;
                } else {
                    aVar = C14262a.m29225a(b, i2);
                }
                if (aVar == null) {
                    return false;
                }
                File a = C14350u.m29424a(aVar.f37173a, false);
                if (a != null) {
                    C14277aa.m29268a(a);
                }
                if (C14353v.m29448e(intent)) {
                    Bundle c = C14353v.m29445c(intent);
                    if (c != null) {
                        bundle = c.getBundle("error");
                    } else {
                        bundle = intent.getExtras();
                    }
                }
                C14457k a2 = C14353v.m29438a(bundle);
                if (a2 == null) {
                    int a3 = C14353v.m29427a(intent);
                    Bundle extras = intent.getExtras();
                    if (C14353v.m29441a(a3) && extras != null) {
                        extras = extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
                    }
                    r0.mo26832a(aVar, extras);
                } else if (a2 instanceof C14529m) {
                    r0.mo26831a(aVar);
                } else {
                    r0.mo26833a(aVar, a2);
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public static boolean m29821a(ShareContent shareContent) {
        boolean z;
        Class cls = shareContent.getClass();
        if (ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.m27257b())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                C14607l.m29929a((ShareOpenGraphContent) shareContent);
            } catch (Exception e) {
                C14277aa.m29270a(f37846c, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", (Throwable) e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C14312f m29823b(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return C14606k.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return C14606k.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return C14606k.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return C14597g.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return C14606k.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return C14586a.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return C14618m.SHARE_STORY_ASSET;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo26811a(Context context, ShareContent shareContent, C14574c cVar) {
        String str;
        String str2;
        if (this.f37849f) {
            cVar = C14574c.AUTOMATIC;
        }
        switch (cVar) {
            case AUTOMATIC:
                str = "automatic";
                break;
            case WEB:
                str = "web";
                break;
            case NATIVE:
                str = "native";
                break;
            default:
                str = "unknown";
                break;
        }
        C14312f b = m29823b(shareContent.getClass());
        if (b == C14606k.SHARE_DIALOG) {
            str2 = "status";
        } else if (b == C14606k.PHOTOS) {
            str2 = "photo";
        } else if (b == C14606k.VIDEO) {
            str2 = "video";
        } else if (b == C14597g.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        } else {
            str2 = "unknown";
        }
        C13589l lVar = new C13589l(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        lVar.mo25411b("fb_share_dialog_show", bundle);
    }
}
