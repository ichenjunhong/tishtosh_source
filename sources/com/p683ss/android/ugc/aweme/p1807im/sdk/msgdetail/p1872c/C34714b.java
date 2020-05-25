package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c;

import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.p1147d.p1148a.C18928a;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33656j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34743a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35307z;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35307z.C35312a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.photodraweeview.PhotoDraweeView;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b */
public final class C34714b extends C34711a {

    /* renamed from: i */
    public static final C34715a f89421i = new C34715a(null);

    /* renamed from: g */
    public PhotoDraweeView f89422g;

    /* renamed from: h */
    public DmtStatusView f89423h;

    /* renamed from: j */
    private View f89424j;

    /* renamed from: k */
    private View f89425k;

    /* renamed from: l */
    private UrlModel f89426l;

    /* renamed from: m */
    private final C34716b f89427m = new C34716b(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$a */
    public static final class C34715a {
        private C34715a() {
        }

        public /* synthetic */ C34715a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$b */
    public static final class C34716b extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C34714b f89428a;

        C34716b(C34714b bVar) {
            this.f89428a = bVar;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            C34714b.m78716a(this.f89428a).mo19209d();
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            super.onFinalImageSet(str, fVar, animatable);
            if (fVar != null) {
                PhotoDraweeView photoDraweeView = this.f89428a.f89422g;
                if (photoDraweeView == null) {
                    C52711k.m112237a("pictureIv");
                }
                photoDraweeView.mo73695a(fVar.getWidth(), fVar.getHeight());
                C34714b.m78716a(this.f89428a).mo19209d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$c */
    static final class C34717c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34714b f89429a;

        C34717c(C34714b bVar) {
            this.f89429a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89429a.mo72781k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$d */
    static final class C34718d implements C18928a {

        /* renamed from: a */
        final /* synthetic */ C34714b f89430a;

        C34718d(C34714b bVar) {
            this.f89430a = bVar;
        }

        /* renamed from: a */
        public final void mo38789a(View view, float f, float f2) {
            this.f89430a.mo72773c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$e */
    static final class C34719e implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C34714b f89431a;

        C34719e(C34714b bVar) {
            this.f89431a = bVar;
        }

        public final boolean onLongClick(View view) {
            return this.f89431a.mo72779i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$f */
    static final class C34720f implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C34714b f89432a;

        C34720f(C34714b bVar) {
            this.f89432a = bVar;
        }

        public final boolean onLongClick(View view) {
            return this.f89432a.mo72779i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$g */
    static final class C34721g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34714b f89433a;

        C34721g(C34714b bVar) {
            this.f89433a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89433a.mo72773c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$h */
    static final class C34722h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ UrlModel f89434a;

        C34722h(UrlModel urlModel) {
            this.f89434a = urlModel;
        }

        public final /* synthetic */ Object call() {
            C35307z.m79887a(this.f89434a, new C35312a() {
                /* renamed from: b */
                public final void mo71090b() {
                    C9432q.m18672a(C11010c.m22280a(), (int) R.string.bmn);
                }

                /* renamed from: a */
                public final void mo71089a() {
                    C9432q.m18672a(C11010c.m22280a(), (int) R.string.bmp);
                    C35190af.m79442a();
                    C35190af.m79488c();
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$i */
    static final class C34724i<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34714b f89435a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f89436b;

        C34724i(C34714b bVar, UrlModel urlModel) {
            this.f89435a = bVar;
            this.f89436b = urlModel;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                C52711k.m112234a();
            }
            if (bool.booleanValue()) {
                C0013i.m16a((Callable<TResult>) new C34722h<TResult>(this.f89436b));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$j */
    static final class C34725j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34714b f89437a;

        C34725j(C34714b bVar) {
            this.f89437a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f89437a.mo72780j();
                return;
            }
            if (i == 1) {
                this.f89437a.mo72781k();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.b$k */
    static final class C34726k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34714b f89438a;

        C34726k(C34714b bVar) {
            this.f89438a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f89438a.mo72781k();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo72774d() {
        PhotoDraweeView photoDraweeView = this.f89422g;
        if (photoDraweeView == null) {
            C52711k.m112237a("pictureIv");
        }
        return photoDraweeView.mo73696a();
    }

    /* renamed from: e */
    public final boolean mo72775e() {
        PhotoDraweeView photoDraweeView = this.f89422g;
        if (photoDraweeView == null) {
            C52711k.m112237a("pictureIv");
        }
        return photoDraweeView.mo73697b();
    }

    /* renamed from: k */
    public final void mo72781k() {
        UrlModel urlModel = this.f89426l;
        if (urlModel != null) {
            C33656j.m77094a().mo71135a(mo72772b(), new C34724i(this, urlModel));
        }
    }

    /* renamed from: i */
    public final boolean mo72779i() {
        if (!this.f89417d.mo72805a()) {
            return false;
        }
        C34710a<BaseContent> aVar = this.f89418e;
        if (aVar != null) {
            BaseContent baseContent = (BaseContent) aVar.f89410a;
            if (baseContent != null) {
                C34710a<BaseContent> aVar2 = this.f89418e;
                if (aVar2 != null) {
                    C11207p pVar = aVar2.f89411b;
                    if (pVar != null) {
                        C26891a aVar3 = new C26891a(mo72767a());
                        if ((baseContent instanceof OnlyPictureContent) || pVar.isSelf()) {
                            aVar3.mo54844a((CharSequence[]) new String[]{mo72767a().getString(R.string.bo1), mo72767a().getString(R.string.bmo)}, (DialogInterface.OnClickListener) new C34725j(this));
                        } else {
                            aVar3.mo54844a((CharSequence[]) new String[]{mo72767a().getString(R.string.bmo)}, (DialogInterface.OnClickListener) new C34726k(this));
                        }
                        aVar3.mo54845b();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo72780j() {
        Bundle bundle = new Bundle();
        C34710a<BaseContent> aVar = this.f89418e;
        if (aVar != null) {
            BaseContent baseContent = (BaseContent) aVar.f89410a;
            if (baseContent != null) {
                if (baseContent instanceof StoryPictureContent) {
                    bundle.putParcelable("share_package", baseContent.generateSharePackage());
                    bundle.putSerializable("share_content", baseContent);
                } else if (baseContent instanceof OnlyPictureContent) {
                    bundle.putParcelable("share_package", baseContent.generateSharePackage());
                    bundle.putSerializable("share_content", baseContent);
                }
                RelationSelectActivity.m78822a(mo72767a(), bundle, null);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtStatusView m78716a(C34714b bVar) {
        DmtStatusView dmtStatusView = bVar.f89423h;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingStatusView");
        }
        return dmtStatusView;
    }

    /* renamed from: a */
    public final void mo72771a(C34743a aVar) {
        C52711k.m112240b(aVar, "dragState");
        super.mo72771a(aVar);
        if (aVar.mo72805a()) {
            PhotoDraweeView photoDraweeView = this.f89422g;
            if (photoDraweeView == null) {
                C52711k.m112237a("pictureIv");
            }
            photoDraweeView.setScaleType(ScaleType.CENTER_CROP);
            View view = this.f89425k;
            if (view == null) {
                C52711k.m112237a("saveLayout");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.f89425k;
        if (view2 == null) {
            C52711k.m112237a("saveLayout");
        }
        view2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo72769a(View view) {
        C52711k.m112240b(view, "itemView");
        super.mo72769a(view);
        this.f89424j = mo72768a((int) R.id.b9e);
        this.f89425k = mo72768a((int) R.id.b9h);
        this.f89422g = (PhotoDraweeView) mo72768a((int) R.id.by0);
        this.f89423h = (DmtStatusView) mo72768a((int) R.id.csv);
        View view2 = this.f89425k;
        if (view2 == null) {
            C52711k.m112237a("saveLayout");
        }
        view2.setOnClickListener(new C34717c(this));
        PhotoDraweeView photoDraweeView = this.f89422g;
        if (photoDraweeView == null) {
            C52711k.m112237a("pictureIv");
        }
        photoDraweeView.setOnPhotoTapListener(new C34718d(this));
        PhotoDraweeView photoDraweeView2 = this.f89422g;
        if (photoDraweeView2 == null) {
            C52711k.m112237a("pictureIv");
        }
        photoDraweeView2.setOnLongClickListener(new C34719e(this));
        View view3 = this.f89424j;
        if (view3 == null) {
            C52711k.m112237a("rootLayout");
        }
        view3.setOnLongClickListener(new C34720f(this));
        View view4 = this.f89424j;
        if (view4 == null) {
            C52711k.m112237a("rootLayout");
        }
        view4.setOnClickListener(new C34721g(this));
        DmtStatusView dmtStatusView = this.f89423h;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(mo72767a()));
    }

    /* renamed from: a */
    public final void mo72770a(C34710a<BaseContent> aVar) {
        boolean z;
        String str;
        boolean z2;
        C52711k.m112240b(aVar, "data");
        if (this.f89418e != aVar) {
            super.mo72770a(aVar);
            BaseContent baseContent = (BaseContent) aVar.f89410a;
            boolean z3 = true;
            if (baseContent instanceof StoryPictureContent) {
                StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                String picturePath = storyPictureContent.getPicturePath();
                List attachments = aVar.f89411b.getAttachments();
                if (attachments != null) {
                    if (attachments.size() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str2 = null;
                    if (!z2) {
                        attachments = null;
                    }
                    if (attachments != null) {
                        C11178a aVar2 = (C11178a) attachments.get(0);
                        if (aVar2 != null) {
                            str2 = aVar2.getLocalPath();
                        }
                        if (C48016e.m103944b(str2)) {
                            picturePath = str2;
                        }
                    }
                }
                m78717a(storyPictureContent.getUrl(), picturePath, storyPictureContent.getWidth(), storyPictureContent.getHeight());
            } else if (baseContent instanceof OnlyPictureContent) {
                OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent;
                m78717a(onlyPictureContent.getUrl(), onlyPictureContent.getPicturePath(), onlyPictureContent.getWidth(), onlyPictureContent.getHeight());
            }
            UrlModel urlModel = this.f89426l;
            if (urlModel != null) {
                Collection urlList = urlModel.getUrlList();
                if (urlList == null || urlList.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    List urlList2 = urlModel.getUrlList();
                    if (urlList2 == null) {
                        C52711k.m112234a();
                    }
                    str = (String) urlList2.get(0);
                } else {
                    str = urlModel.getUri();
                }
                CharSequence charSequence = str;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    z3 = false;
                }
                if (!z3) {
                    C13773e a = C13771c.m27870a();
                    a.mo25723a(str);
                    C52711k.m112236a((Object) a, "controllerBuilder");
                    PhotoDraweeView photoDraweeView = this.f89422g;
                    if (photoDraweeView == null) {
                        C52711k.m112237a("pictureIv");
                    }
                    a.mo25759b(photoDraweeView.getController());
                    a.mo25751a((C13791d<? super INFO>) this.f89427m);
                    PhotoDraweeView photoDraweeView2 = this.f89422g;
                    if (photoDraweeView2 == null) {
                        C52711k.m112237a("pictureIv");
                    }
                    photoDraweeView2.setController(a.mo25763d());
                }
            }
            View view = this.f89425k;
            if (view == null) {
                C52711k.m112237a("saveLayout");
            }
            view.setVisibility(0);
        }
    }

    public C34714b(View view, RecyclerView recyclerView) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(recyclerView, "_recyclerView");
        super(view, recyclerView);
    }

    /* renamed from: a */
    private final void m78717a(UrlModel urlModel, String str, int i, int i2) {
        boolean z;
        if (urlModel != null) {
            Collection urlList = urlModel.getUrlList();
            if (urlList == null || urlList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C48016e.m103944b(str)) {
                this.f89426l = urlModel;
                return;
            }
        }
        UrlModel urlModel2 = new UrlModel();
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        urlModel2.setUri(sb.toString());
        urlModel2.setWidth(i);
        urlModel2.setHeight(i2);
        this.f89426l = urlModel2;
    }
}
