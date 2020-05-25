package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p769c.C12178m;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42131b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.share.p2170ui.C42242a;
import com.p683ss.android.ugc.aweme.share.p2170ui.C42242a.C42243a;
import com.p683ss.android.ugc.aweme.share.p2170ui.LiveShareCodeView;
import com.p683ss.android.ugc.aweme.share.p2170ui.LiveShareCodeView.C42240b;
import com.p683ss.android.ugc.aweme.share.p2170ui.LiveShareCodeView.C42241c;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42291s;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42346c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42346c.C42347a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e.C42355a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage */
public final class LiveSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C42183a f106679a = new C42183a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a */
    public static final class C42183a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a$a */
        public static final class C42184a implements C42354e {

            /* renamed from: a */
            final /* synthetic */ Activity f106680a;

            /* renamed from: b */
            final /* synthetic */ C8633b f106681b;

            /* renamed from: c */
            final /* synthetic */ LiveSharePackage f106682c;

            /* renamed from: d */
            final /* synthetic */ C8632a f106683d;

            /* renamed from: a */
            public final void mo49960a(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92983a(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo49962b(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92984b(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                C52711k.m112240b(gVar, "action");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                if (gVar instanceof C42079d) {
                    this.f106683d.mo8970a(gVar.mo49954c(), "link");
                }
            }

            C42184a(Activity activity, C8633b bVar, LiveSharePackage liveSharePackage, C8632a aVar) {
                this.f106680a = activity;
                this.f106681b = bVar;
                this.f106682c = liveSharePackage;
                this.f106683d = aVar;
            }

            /* renamed from: a */
            public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                if (z) {
                    this.f106683d.mo8970a(bVar.mo86136b(), "qr_code");
                } else {
                    this.f106683d.mo8971a(new Throwable());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a$b */
        public static final class C42185b implements C42346c {

            /* renamed from: a */
            final /* synthetic */ Activity f106684a;

            /* renamed from: b */
            final /* synthetic */ C8633b f106685b;

            /* renamed from: c */
            final /* synthetic */ LiveSharePackage f106686c;

            /* renamed from: d */
            final /* synthetic */ C8632a f106687d;

            /* renamed from: a */
            public final void mo55492a(SharePackage sharePackage) {
                C52711k.m112240b(sharePackage, "sharePackage");
                this.f106687d.mo8970a("chat_merge", "link");
            }

            /* renamed from: b */
            public final boolean mo55494b(SharePackage sharePackage) {
                C52711k.m112240b(sharePackage, "sharePackage");
                return C42347a.m92965a(this, sharePackage);
            }

            /* renamed from: a */
            public final void mo55493a(String str, SharePackage sharePackage) {
                C52711k.m112240b(str, "channel");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(str, "channel");
                C52711k.m112240b(sharePackage, "sharePackage");
            }

            C42185b(Activity activity, C8633b bVar, LiveSharePackage liveSharePackage, C8632a aVar) {
                this.f106684a = activity;
                this.f106685b = bVar;
                this.f106686c = liveSharePackage;
                this.f106687d = aVar;
            }
        }

        private C42183a() {
        }

        public /* synthetic */ C42183a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static UrlModel m92560a(ImageModel imageModel) {
            if (imageModel == null) {
                return null;
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(imageModel.getUri());
            urlModel.setUrlList(imageModel.getUrls());
            urlModel.setUrlKey(imageModel.getUri());
            urlModel.setWidth(imageModel.width);
            urlModel.setHeight(imageModel.height);
            return urlModel;
        }

        /* renamed from: a */
        public final void mo86156a(Activity activity, C8633b bVar, C8632a aVar) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(bVar, CustomActionPushReceiver.f104061f);
            C52711k.m112240b(aVar, "callback");
            LiveSharePackage a = m92561a(bVar, (Context) activity, aVar);
            C42350b bVar2 = new C42350b();
            C41979aq.m91946a().injectUniversalConfig(bVar2, activity, false);
            bVar2.mo86270b(false);
            bVar2.mo86258a((C42307b) new C42134b());
            bVar2.mo86263a("instagram");
            bVar2.mo86263a("instagram_story");
            if (bVar.f23624c != -1) {
                IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                C52711k.m112236a((Object) baseUserService_Monster, "userService");
                if (!C52711k.m112239a((Object) baseUserService_Monster.getCurrentUserID(), (Object) String.valueOf(bVar.f23625d))) {
                    bVar2.mo86262a((C42357g) new C42200b(activity, bVar));
                }
                bVar2.mo86262a((C42357g) new C42199a(activity, bVar));
            }
            bVar2.mo86259a((SharePackage) a);
            bVar2.mo86261a((C42354e) new C42184a(activity, bVar, a, aVar));
            bVar2.mo86260a((C42346c) new C42185b(activity, bVar, a, aVar));
            C42131b bVar3 = new C42131b(activity, bVar2.mo86266a(), 0, 4, null);
            bVar3.show();
        }

        /* renamed from: a */
        public static LiveSharePackage m92561a(C8633b bVar, Context context, C8632a aVar) {
            UrlModel urlModel;
            boolean z;
            String str;
            String str2;
            C52711k.m112240b(bVar, "params");
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "callback");
            C42326a a = new C42326a().mo86236a(CustomActionPushReceiver.f104061f);
            String c = C42149b.m92516c(bVar.f23635n);
            if (c == null) {
                c = "";
            }
            C42326a e = a.mo86242e(c);
            String str3 = bVar.f23636o;
            C52711k.m112236a((Object) str3, "params.title");
            C42326a c2 = e.mo86240c(str3);
            String str4 = bVar.f23637p;
            C52711k.m112236a((Object) str4, "params.description");
            LiveSharePackage liveSharePackage = new LiveSharePackage(c2.mo86241d(str4).mo86239b(String.valueOf(bVar.f23624c)));
            Bundle bundle = liveSharePackage.f106900i;
            bundle.putSerializable("thumb_for_share", m92560a(bVar.f23630i));
            String str5 = "video_cover";
            if (bVar.f23633l == null) {
                urlModel = m92560a(bVar.f23632k);
            } else {
                urlModel = m92560a(bVar.f23633l);
            }
            bundle.putSerializable(str5, urlModel);
            bundle.putString("author_name", bVar.f23634m);
            if (bVar.f23629h == null) {
                bundle.putString("author_id", null);
            } else {
                bundle.putString("author_id", bVar.f23629h.toString());
            }
            bundle.putString("app_name", context.getString(R.string.ip));
            String str6 = "thumb_url";
            CharSequence charSequence = bVar.f23638q;
            if (charSequence == null || C52830p.m112402a(charSequence)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = C23515d.m57664a(m92560a(bVar.f23631j));
            } else {
                str = bVar.f23638q;
            }
            bundle.putString(str6, str);
            bundle.putString("uid_for_share", String.valueOf(bVar.f23625d));
            bundle.putString("sec_user_id", bVar.f23644w);
            bundle.putLong("group_id", bVar.f23624c);
            bundle.putLong("item_id", bVar.f23624c);
            bundle.putString("share_text", liveSharePackage.f106898g);
            bundle.putString("live_id", String.valueOf(bVar.f23625d));
            bundle.putString("room_title", bVar.f23636o);
            bundle.putString("request_id", bVar.f23641t);
            String str7 = "user_type";
            if (bVar.f23640s) {
                str2 = "host";
            } else {
                str2 = "aud";
            }
            bundle.putString(str7, str2);
            bundle.putString("previous_page", CustomActionPushReceiver.f104061f);
            return liveSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$b */
    static final class C42186b extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42307b f106688a;

        /* renamed from: b */
        final /* synthetic */ Context f106689b;

        /* renamed from: c */
        final /* synthetic */ String f106690c;

        C42186b(C42307b bVar, Context context, String str) {
            this.f106688a = bVar;
            this.f106689b = context;
            this.f106690c = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C42307b bVar = this.f106688a;
            Uri a = C47722bj.m103304a(this.f106689b, new File(str));
            C52711k.m112236a((Object) a, "FileProviderUtils.getFil…derUri(context, File(it))");
            C42323i iVar = new C42323i(a, str, null, null, null, this.f106690c, 28, null);
            bVar.mo86133a(iVar, this.f106689b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final void m92558a(Activity activity, C8633b bVar, C8632a aVar) {
        f106679a.mo86156a(activity, bVar, aVar);
    }

    public LiveSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        String str;
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 2);
        if (!(bVar instanceof C42291s)) {
            return false;
        }
        try {
            Bundle bundle = this.f106900i;
            Object obj = null;
            if (bundle != null) {
                str = bundle.getString("author_name");
            } else {
                str = null;
            }
            C42242a.f106780a = str;
            if (bundle != null) {
                obj = bundle.get("video_cover");
            }
            if (obj != null) {
                C42242a.f106781b = (UrlModel) obj;
                C52671b bVar2 = new C42186b(bVar, context, C42150c.m92521a(this.f106899h, bVar));
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C52711k.m112240b(bVar2, "pathAction");
                LiveShareCodeView liveShareCodeView = new LiveShareCodeView(context);
                C42240b aVar = new C42243a(liveShareCodeView, context, bVar2);
                C52711k.m112240b(aVar, "listener");
                liveShareCodeView.f106776c = aVar;
                String str2 = C42242a.f106780a;
                UrlModel urlModel = C42242a.f106781b;
                liveShareCodeView.f106774a = str2;
                liveShareCodeView.f106775b = urlModel;
                if (liveShareCodeView.f106774a != null) {
                    DmtTextView dmtTextView = (DmtTextView) liveShareCodeView.mo86198a((int) R.id.ejh);
                    C52711k.m112236a((Object) dmtTextView, "live_share_user_name");
                    StringBuilder sb = new StringBuilder("@");
                    sb.append(liveShareCodeView.f106774a);
                    dmtTextView.setText(sb.toString());
                }
                C12208t a = C12203q.m24645a((Object) C23608p.m57874a(liveShareCodeView.f106775b)).mo23118a("LiveShareCodeView");
                a.f32239b = liveShareCodeView.f106777d;
                a.mo23113a(Config.ARGB_8888).mo23123a((C12178m) new C42241c(liveShareCodeView));
                return true;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
        } catch (Exception unused) {
        }
    }
}
