package com.p683ss.android.ugc.gamora.recorder.p2468e;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2767k;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.local.UploadButton;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43994a;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout.C45590a;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.C49563a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.e.c */
public final class C49664c extends C12896b implements C49548a {

    /* renamed from: A */
    public static final C49665a f124570A = new C49665a(null);

    /* renamed from: B */
    private SafeHandler f124571B;

    /* renamed from: C */
    private boolean f124572C;

    /* renamed from: D */
    private final C2763g<Boolean> f124573D;

    /* renamed from: k */
    public final C2765i<C52860x> f124574k = new C2765i<>();

    /* renamed from: l */
    public final C2762f<C52860x> f124575l = this.f124574k;

    /* renamed from: m */
    public C43225dr f124576m;

    /* renamed from: n */
    public ShortVideoContext f124577n;

    /* renamed from: o */
    public TouchSensitiveRelativeLayout f124578o;

    /* renamed from: p */
    public ViewGroup f124579p;

    /* renamed from: q */
    public View f124580q;

    /* renamed from: r */
    protected UploadButton f124581r;

    /* renamed from: s */
    public C48923a f124582s;

    /* renamed from: t */
    public int f124583t = C23728o.m58241a(40.0d);

    /* renamed from: u */
    public C49563a f124584u;

    /* renamed from: v */
    public final C2763g<Integer> f124585v;

    /* renamed from: w */
    public final C2762f<C52860x> f124586w;

    /* renamed from: x */
    public final C2762f<C52860x> f124587x;

    /* renamed from: y */
    public final C2763g<Integer> f124588y;

    /* renamed from: z */
    public final C2762f<C52860x> f124589z;

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$a */
    public static final class C49665a {
        private C49665a() {
        }

        public /* synthetic */ C49665a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$b */
    static final class C49666b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49664c f124590a;

        C49666b(C49664c cVar) {
            this.f124590a = cVar;
        }

        public final void run() {
            C49563a aVar = this.f124590a.f124584u;
            if (aVar != null) {
                View view = this.f124590a.f124580q;
                if (view == null) {
                    C52711k.m112237a("ivTool");
                }
                aVar.mo97468a(view, 48);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$c */
    static final class C49667c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49664c f124591a;

        C49667c(C49664c cVar) {
            this.f124591a = cVar;
        }

        public final void run() {
            this.f124591a.mo97563I().mo89520a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$d */
    static final class C49668d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49664c f124592a;

        C49668d(C49664c cVar) {
            this.f124592a = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            this.f124592a.mo97564J();
            JSONObject a = new C26898j().mo54849a("enter_from", C49664c.m107188b(this.f124592a).f107132y).mo54850a();
            C49664c cVar = this.f124592a;
            C43214dh a2 = C43214dh.m94817a();
            C52711k.m112236a((Object) a2, "PublishManager.inst()");
            C43804f fVar = a2.f109289d;
            if (fVar != null && !fVar.f110926c) {
                C50275d.m108541c(cVar.f33840g_, R.string.gtu).mo98174a();
                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "2").mo47829a("task_id", fVar.f110924a).f61491a);
            }
            C43225dr drVar = this.f124592a.f124576m;
            if (drVar == null) {
                C52711k.m112237a("ownerHost");
            }
            C26890h.m65006a(drVar.mo87887i(), "upload_click", "shoot_page", "0", 0, a);
            CommentVideoModel commentVideoModel = C49664c.m107188b(this.f124592a).f107125r;
            String str3 = "click_upload_entrance";
            C23089d a3 = C23089d.m56640a().mo47829a("creation_id", C49664c.m107188b(this.f124592a).f107131x).mo47829a("shoot_way", C49664c.m107188b(this.f124592a).f107132y).mo47826a("draft_id", C49664c.m107188b(this.f124592a).f107022A);
            String str4 = "reply_comment_id";
            FaceStickerBean faceStickerBean = null;
            if (!CommentUtils.needMob(C49664c.m107188b(this.f124592a))) {
                str = "";
            } else if (commentVideoModel != null) {
                str = commentVideoModel.getCommentId();
            } else {
                str = null;
            }
            C23089d a4 = a3.mo47829a(str4, str);
            String str5 = "reply_user_id";
            if (!CommentUtils.needMob(C49664c.m107188b(this.f124592a))) {
                str2 = "";
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getUserId();
            } else {
                str2 = null;
            }
            C26890h.m65011a(str3, a4.mo47829a(str5, str2).mo47829a("enter_from", "video_shoot_page").f61491a);
            ShortVideoContext b = C49664c.m107188b(this.f124592a);
            C20426a d = C49664c.m107189c(this.f124592a).mo96753d();
            C50048n nVar = (C50048n) C49664c.m107189c(this.f124592a).mo96756g().getValue();
            if (nVar != null) {
                faceStickerBean = nVar.mo97798C();
            }
            C43994a.m96556a(b, d, faceStickerBean, C49664c.m107189c(this.f124592a).mo96759j(), C49664c.m107189c(this.f124592a).mo96757h().mo86562d().mo94112k(), "click_upload");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$e */
    static final class C49669e<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49664c f124593a;

        C49669e(C49664c cVar) {
            this.f124593a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                i = C23728o.m58241a(33.0d) + this.f124593a.f124583t;
            } else {
                i = this.f124593a.f124583t;
            }
            LayoutParams layoutParams = C49664c.m107187a(this.f124593a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = i;
                C49664c.m107187a(this.f124593a).setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$f */
    static final class C49670f<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49664c f124594a;

        C49670f(C49664c cVar) {
            this.f124594a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup viewGroup = this.f124594a.f124579p;
            if (viewGroup == null) {
                C52711k.m112237a("effectContainer");
            }
            C52711k.m112236a((Object) num, "value");
            viewGroup.setVisibility(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$g */
    static final class C49671g<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49664c f124595a;

        C49671g(C49664c cVar) {
            this.f124595a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f124595a.mo97564J();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$h */
    static final class C49672h<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49664c f124596a;

        C49672h(C49664c cVar) {
            this.f124596a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            C49563a aVar = this.f124596a.f124584u;
            if (aVar != null && aVar.isShowing()) {
                C49563a aVar2 = this.f124596a.f124584u;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$i */
    static final class C49673i<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49664c f124597a;

        C49673i(C49664c cVar) {
            this.f124597a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            UploadButton I = this.f124597a.mo97563I();
            C52711k.m112236a((Object) num, "value");
            I.setVisibility(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.c$j */
    static final class C49674j<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49664c f124598a;

        C49674j(C49664c cVar) {
            this.f124598a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            C49664c.m107187a(this.f124598a).setNoBlockTouchListener(new C45590a(this) {

                /* renamed from: a */
                final /* synthetic */ C49674j f124599a;

                {
                    this.f124599a = r1;
                }

                /* renamed from: a */
                public final void mo91963a() {
                    this.f124599a.f124598a.f124574k.mo7350a(C52860x.f131107a);
                }
            });
        }
    }

    /* renamed from: c */
    public final C11910j mo86790c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final UploadButton mo97563I() {
        UploadButton uploadButton = this.f124581r;
        if (uploadButton == null) {
            C52711k.m112237a("uploadButton");
        }
        return uploadButton;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c2  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97564J() {
        /*
            r18 = this;
            r0 = r18
            com.ss.android.ugc.aweme.shortvideo.dr r1 = r0.f124576m
            if (r1 != 0) goto L_0x000b
            java.lang.String r2 = "ownerHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x000b:
            android.app.Activity r1 = r1.f33840g_
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity
            if (r2 != 0) goto L_0x0012
            r1 = 0
        L_0x0012:
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity) r1
            r2 = 1
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r1 = r1.f113766E
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.asve.recorder.view.ASCameraView r1 = r1.mo91307M()
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.asve.recorder.effect.b r1 = r1.getEffectController()
            if (r1 == 0) goto L_0x002a
            r1.mo43526f(r2)
        L_0x002a:
            com.bytedance.scene.navigation.d r1 = r18.mo24479x()
            java.lang.Class<com.ss.android.ugc.gamora.recorder.localmedia.a> r3 = com.p683ss.android.ugc.gamora.recorder.localmedia.C49895a.class
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f124577n
            if (r4 != 0) goto L_0x0039
            java.lang.String r5 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0039:
            boolean r4 = r4.f107055aG
            r5 = 4
            if (r4 == 0) goto L_0x0043
            r4 = 1002(0x3ea, float:1.404E-42)
            r8 = 1002(0x3ea, float:1.404E-42)
            goto L_0x005a
        L_0x0043:
            java.lang.String r4 = "from_chat"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f124577n
            if (r6 != 0) goto L_0x004e
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x004e:
            java.lang.String r6 = r6.f107133z
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r6)
            if (r4 == 0) goto L_0x0058
            r8 = 4
            goto L_0x005a
        L_0x0058:
            r4 = -1
            r8 = -1
        L_0x005a:
            java.lang.String r4 = "single_song"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f124577n
            if (r6 != 0) goto L_0x0065
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0065:
            java.lang.String r6 = r6.f107132y
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r6)
            if (r4 != 0) goto L_0x0090
            java.lang.String r4 = "task_platform"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f124577n
            if (r6 != 0) goto L_0x0078
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0078:
            java.lang.String r6 = r6.f107079ae
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r6)
            if (r4 != 0) goto L_0x0090
            java.lang.String r4 = "challenge"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f124577n
            if (r6 != 0) goto L_0x008b
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x008b:
            java.lang.String r6 = r6.f107079ae
            p2628d.p2639f.p2641b.C52711k.m112239a(r4, r6)
        L_0x0090:
            com.ss.android.ugc.aweme.property.h r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PhotoMovieEnabled
            com.ss.android.ugc.aweme.property.aa$a r6 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r6
            int r4 = r4.mo83104b(r6)
            if (r4 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f124577n
            if (r4 != 0) goto L_0x00a5
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00a5:
            boolean r4 = r4.mo86367h()
            if (r4 != 0) goto L_0x00ad
            r4 = 1
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00b2
            r4 = 6
            goto L_0x00b3
        L_0x00b2:
            r4 = 4
        L_0x00b3:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f124577n
            if (r6 != 0) goto L_0x00bc
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00bc:
            com.ss.android.ugc.aweme.shortvideo.edit.o r6 = r6.f107054aF
            if (r6 == 0) goto L_0x00c2
            r9 = 4
            goto L_0x00c3
        L_0x00c2:
            r9 = r4
        L_0x00c3:
            int r4 = com.p683ss.android.ugc.gamora.recorder.localmedia.C49897b.m107657a()
            r5 = r9 & 1
            if (r5 != 0) goto L_0x00d4
            r5 = r9 & 2
            if (r5 == 0) goto L_0x00d4
            int r4 = com.p683ss.android.ugc.gamora.recorder.localmedia.C49897b.m107657a()
            int r4 = r4 + r2
        L_0x00d4:
            r14 = r4
            com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument r2 = new com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument
            r7 = 1
            r10 = 1
            r11 = 0
            long r12 = com.p683ss.android.ugc.aweme.shortvideo.C43307ea.m94995a()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e r4 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.f112162b
            int r15 = r4.mo90190a()
            int r16 = com.p683ss.android.ugc.gamora.recorder.localmedia.C49897b.m107657a()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f r4 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.f108637b
            int r17 = r4.mo87418b()
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            java.lang.String r4 = "argument"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "local_media_argument"
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r4.putParcelable(r5, r2)
            r1.mo24524a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2468e.C49664c.mo97564J():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ TouchSensitiveRelativeLayout m107187a(C49664c cVar) {
        TouchSensitiveRelativeLayout touchSensitiveRelativeLayout = cVar.f124578o;
        if (touchSensitiveRelativeLayout == null) {
            C52711k.m112237a("recordTool");
        }
        return touchSensitiveRelativeLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ ShortVideoContext m107188b(C49664c cVar) {
        ShortVideoContext shortVideoContext = cVar.f124577n;
        if (shortVideoContext == null) {
            C52711k.m112237a("shortVideoContext");
        }
        return shortVideoContext;
    }

    /* renamed from: c */
    public static final /* synthetic */ C48923a m107189c(C49664c cVar) {
        C48923a aVar = cVar.f124582s;
        if (aVar == null) {
            C52711k.m112237a("recordEnv");
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01bd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r10) {
        /*
            r9 = this;
            super.mo24448e(r10)
            com.bytedance.scene.t r10 = r9.mo24460E()
            java.lang.String r0 = "safe_handler"
            java.lang.Object r10 = r10.mo24560a(r0)
            if (r10 != 0) goto L_0x0012
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0012:
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r10 = (com.p683ss.android.ugc.aweme.shortvideo.SafeHandler) r10
            r9.f124571B = r10
            com.bytedance.scene.t r10 = r9.mo24460E()
            java.lang.String r0 = "owner"
            java.lang.Object r10 = r10.mo24560a(r0)
            if (r10 != 0) goto L_0x0025
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.dr r10 = (com.p683ss.android.ugc.aweme.shortvideo.C43225dr) r10
            r9.f124576m = r10
            com.ss.android.ugc.aweme.shortvideo.dr r10 = r9.f124576m
            if (r10 != 0) goto L_0x0032
            java.lang.String r0 = "ownerHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0032:
            android.support.v4.app.FragmentActivity r10 = r10.mo87882I()
            android.arch.lifecycle.y r10 = android.arch.lifecycle.C0214z.m440a(r10)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.x r10 = r10.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ow…extViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r10 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r10
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r10.f107134a
            java.lang.String r0 = "ViewModelProviders.of(ow…s.java).shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            r9.f124577n = r10
            com.bytedance.scene.t r10 = r9.mo24460E()
            java.lang.String r0 = "record_env_context"
            java.lang.Object r10 = r10.mo24560a(r0)
            if (r10 != 0) goto L_0x005f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005f:
            com.ss.android.ugc.gamora.a.a r10 = (com.p683ss.android.ugc.gamora.p2457a.C48923a) r10
            r9.f124582s = r10
            r10 = 2132022337(0x7f141441, float:1.968309E38)
            android.view.View r10 = r9.mo24467j_(r10)
            java.lang.String r0 = "requireViewById(R.id.rl_record_tool_bottom)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout r10 = (com.p683ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout) r10
            r9.f124578o = r10
            r10 = 2132018760(0x7f140648, float:1.9675836E38)
            android.view.View r0 = r9.mo24467j_(r10)
            java.lang.String r1 = "requireViewById(R.id.effect_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9.f124579p = r0
            r0 = 2132020246(0x7f140c16, float:1.967885E38)
            android.view.View r1 = r9.mo24467j_(r0)
            java.lang.String r2 = "requireViewById(R.id.iv_tool)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r9.f124580q = r1
            r1 = 2132017880(0x7f1402d8, float:1.967405E38)
            android.view.View r1 = r9.mo24467j_(r1)
            java.lang.String r2 = "requireViewById(R.id.btn_upload)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.local.UploadButton r1 = (com.p683ss.android.ugc.aweme.shortvideo.local.UploadButton) r1
            r9.f124581r = r1
            android.app.Activity r1 = r9.f33840g_
            if (r1 == 0) goto L_0x023b
            r3 = r1
            android.support.v7.app.AppCompatActivity r3 = (android.support.p043v7.app.AppCompatActivity) r3
            r1 = r9
            android.arch.lifecycle.k r1 = (android.arch.lifecycle.C0184k) r1
            android.view.View r2 = r9.f33834b
            java.lang.String r4 = "view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            com.ss.android.ugc.gamora.a.a r4 = r9.f124582s
            if (r4 != 0) goto L_0x00bb
            java.lang.String r5 = "recordEnv"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00bb:
            d.f r4 = r4.mo96756g()
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x022d
            r5 = r4
            com.ss.android.ugc.gamora.recorder.sticker.a.n r5 = (com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n) r5
            java.lang.String r4 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            java.lang.String r4 = "owner"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "entranceRooView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            java.lang.String r4 = "stickerApiComponent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r4)
            com.ss.android.ugc.gamora.recorder.sticker.a.j r4 = new com.ss.android.ugc.gamora.recorder.sticker.a.j
            android.view.View r10 = r2.findViewById(r10)
            r6 = r10
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r10 = r2.findViewById(r0)
            r7 = r10
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r7
            r10 = 2132020247(0x7f140c17, float:1.9678852E38)
            android.view.View r10 = r2.findViewById(r10)
            r8 = r10
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r8
            r2 = r4
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r9.f124577n
            if (r10 != 0) goto L_0x0104
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0104:
            boolean r10 = r10.mo86365f()
            r0 = 1
            if (r10 != 0) goto L_0x0164
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r9.f124577n
            if (r10 != 0) goto L_0x0114
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0114:
            boolean r10 = r10.mo86366g()
            if (r10 != 0) goto L_0x0164
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r9.f124577n
            if (r10 != 0) goto L_0x0123
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0123:
            boolean r10 = r10.mo86362d()
            if (r10 != 0) goto L_0x0164
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r9.f124577n
            if (r10 != 0) goto L_0x0132
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0132:
            boolean r10 = r10.f107058aJ
            if (r10 == 0) goto L_0x0137
            goto L_0x0164
        L_0x0137:
            boolean r10 = r9.f124572C
            if (r10 != 0) goto L_0x0171
            r9.f124572C = r0
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r10 = r9.f124571B
            if (r10 != 0) goto L_0x0146
            java.lang.String r2 = "handler"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0146:
            com.ss.android.ugc.gamora.recorder.e.c$c r2 = new com.ss.android.ugc.gamora.recorder.e.c$c
            r2.<init>(r9)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r10.post(r2)
            com.ss.android.ugc.aweme.shortvideo.local.UploadButton r10 = r9.f124581r
            if (r10 != 0) goto L_0x0159
            java.lang.String r2 = "uploadButton"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0159:
            com.ss.android.ugc.gamora.recorder.e.c$d r2 = new com.ss.android.ugc.gamora.recorder.e.c$d
            r2.<init>(r9)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r10.setOnClickListener(r2)
            goto L_0x0171
        L_0x0164:
            com.ss.android.ugc.aweme.shortvideo.local.UploadButton r10 = r9.f124581r
            if (r10 != 0) goto L_0x016d
            java.lang.String r2 = "uploadButton"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x016d:
            r2 = 4
            r10.setVisibility(r2)
        L_0x0171:
            com.bytedance.als.g<java.lang.Boolean> r10 = r9.f124573D
            com.ss.android.ugc.gamora.recorder.e.c$e r2 = new com.ss.android.ugc.gamora.recorder.e.c$e
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r10.mo7352a(r1, r2)
            com.bytedance.als.g<java.lang.Integer> r10 = r9.f124585v
            com.ss.android.ugc.gamora.recorder.e.c$f r2 = new com.ss.android.ugc.gamora.recorder.e.c$f
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r10.mo7352a(r1, r2)
            com.bytedance.als.f<d.x> r10 = r9.f124586w
            com.ss.android.ugc.gamora.recorder.e.c$g r2 = new com.ss.android.ugc.gamora.recorder.e.c$g
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r10.mo7349a(r1, r2)
            com.bytedance.als.f<d.x> r10 = r9.f124587x
            com.ss.android.ugc.gamora.recorder.e.c$h r2 = new com.ss.android.ugc.gamora.recorder.e.c$h
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r10.mo7349a(r1, r2)
            com.bytedance.als.g<java.lang.Integer> r10 = r9.f124588y
            com.ss.android.ugc.gamora.recorder.e.c$i r2 = new com.ss.android.ugc.gamora.recorder.e.c$i
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r10.mo7352a(r1, r2)
            com.bytedance.als.f<d.x> r10 = r9.f124589z
            com.ss.android.ugc.gamora.recorder.e.c$j r2 = new com.ss.android.ugc.gamora.recorder.e.c$j
            r2.<init>(r9)
            com.bytedance.als.k r2 = (com.bytedance.als.C2767k) r2
            r10.mo7349a(r1, r2)
            android.app.Activity r10 = r9.f33840g_
            if (r10 == 0) goto L_0x022c
            android.content.Intent r10 = r10.getIntent()
            if (r10 != 0) goto L_0x01c4
            goto L_0x022c
        L_0x01c4:
            java.lang.String r1 = "from_special_plus"
            r2 = 0
            boolean r1 = r10.getBooleanExtra(r1, r2)
            if (r1 == 0) goto L_0x01d6
            com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent r1 = new com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent
            r3 = 3
            r1.<init>(r3, r2)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
        L_0x01d6:
            java.lang.String r1 = "extra_super_entrance_pop"
            java.lang.String r10 = r10.getStringExtra(r1)
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x022b
            com.ss.android.ugc.gamora.recorder.a r1 = r9.f124584u
            if (r1 != 0) goto L_0x01f2
            com.ss.android.ugc.gamora.recorder.a r1 = new com.ss.android.ugc.gamora.recorder.a
            android.app.Activity r3 = r9.f33840g_
            r1.<init>(r3)
            r9.f124584u = r1
        L_0x01f2:
            com.ss.android.ugc.gamora.recorder.a r1 = r9.f124584u
            if (r1 == 0) goto L_0x01f9
            r1.mo97469a(r10)
        L_0x01f9:
            com.ss.android.ugc.gamora.recorder.a r10 = r9.f124584u
            if (r10 == 0) goto L_0x0201
            r3 = -1
            r10.f124322k = r3
        L_0x0201:
            com.ss.android.ugc.gamora.recorder.a r10 = r9.f124584u
            if (r10 == 0) goto L_0x0207
            r10.f124321j = r0
        L_0x0207:
            com.ss.android.ugc.gamora.recorder.a r10 = r9.f124584u
            if (r10 == 0) goto L_0x020e
            r10.mo97470a(r0)
        L_0x020e:
            android.view.View r10 = r9.f124580q
            if (r10 != 0) goto L_0x0217
            java.lang.String r1 = "ivTool"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0217:
            com.ss.android.ugc.gamora.recorder.e.c$b r1 = new com.ss.android.ugc.gamora.recorder.e.c$b
            r1.<init>(r9)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r3 = 1000(0x3e8, double:4.94E-321)
            r10.postDelayed(r1, r3)
            com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent r10 = new com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent
            r10.<init>(r0, r2)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r10)
        L_0x022b:
            return
        L_0x022c:
            return
        L_0x022d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        L_0x023b:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2468e.C49664c.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.byd, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    public C49664c(C2763g<Integer> gVar, C2762f<C52860x> fVar, C2762f<C52860x> fVar2, C2763g<Integer> gVar2, C2762f<C52860x> fVar3, C2763g<Boolean> gVar3) {
        C52711k.m112240b(gVar, "effectContainerVisibility");
        C52711k.m112240b(fVar, "openUploadEvent");
        C52711k.m112240b(fVar2, "dismissSuperEntranceEvent");
        C52711k.m112240b(gVar2, "uploadVisibility");
        C52711k.m112240b(fVar3, "needNoTouchListener");
        C52711k.m112240b(gVar3, "relayoutEvent");
        this.f124585v = gVar;
        this.f124586w = fVar;
        this.f124587x = fVar2;
        this.f124588y = gVar2;
        this.f124589z = fVar3;
        this.f124573D = gVar3;
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
