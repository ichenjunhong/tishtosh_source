package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39535f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39536g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao */
public final class C44106ao implements C39536g, C44149m {

    /* renamed from: a */
    public ShortVideoContext f111735a;

    /* renamed from: b */
    C39535f f111736b;

    /* renamed from: c */
    C44125d f111737c;

    /* renamed from: d */
    public IPhotoMovieService f111738d;

    /* renamed from: e */
    public final Activity f111739e;

    /* renamed from: f */
    private String f111740f;

    /* renamed from: g */
    private final PhotoMovieContext f111741g = new PhotoMovieContext();

    /* renamed from: h */
    private long f111742h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$a */
    public static final class C44107a implements PhotoMovieServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ C44106ao f111743a;

        public final void onPhotoMovieServiceLoadFailed(int i, String str) {
            C52711k.m112240b(str, "errorMessage");
        }

        C44107a(C44106ao aoVar) {
            this.f111743a = aoVar;
        }

        public final void onPhotoMovieServiceLoadSuccess(IPhotoMovieService iPhotoMovieService) {
            C52711k.m112240b(iPhotoMovieService, "service");
            this.f111743a.f111738d = iPhotoMovieService;
            C44106ao aoVar = this.f111743a;
            aoVar.f111736b = C39618d.f101168i.mo80562a((C39536g) aoVar);
            C39535f fVar = aoVar.f111736b;
            if (fVar == null) {
                C52711k.m112237a("mMusicChoicesPresenter");
            }
            fVar.mo80630a(new Object[0]);
            C44125d a = C44125d.m96772a(aoVar.f111739e, aoVar.f111739e.getString(R.string.ah0), "compress_photo_movie_loading.json");
            C52711k.m112236a((Object) a, "AwemeLoadingDialog.show(…RESS_PHOTO_MOVIE_LOADING)");
            aoVar.f111737c = a;
        }
    }

    /* renamed from: a */
    public final void mo78609a() {
    }

    public C44106ao(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f111739e = activity;
    }

    /* renamed from: a */
    public final void mo80631a(Exception exc, String str) {
        C44125d dVar = this.f111737c;
        if (dVar == null) {
            C52711k.m112237a("mLoadingDialog");
        }
        dVar.dismiss();
        m96737a(this.f111741g, (List<? extends C42482c>) new ArrayList<Object>());
    }

    /* renamed from: a */
    public final void mo80632a(List<C42482c> list, String str) {
        C44125d dVar = this.f111737c;
        if (dVar == null) {
            C52711k.m112237a("mLoadingDialog");
        }
        dVar.dismiss();
        if (list == null) {
            this.f111741g.mMusicList = new ArrayList();
            list = new ArrayList<>();
        }
        this.f111741g.mMusicPath = str;
        m96737a(this.f111741g, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0223, code lost:
        if (r2 == null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0259, code lost:
        if (r4 == null) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r0.f107125r != null) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0255  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m96737a(com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext r12, java.util.List<? extends com.p683ss.android.ugc.aweme.shortvideo.C42482c> r13) {
        /*
            r11 = this;
            r0 = r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao r0 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44106ao) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f111735a
            if (r1 != 0) goto L_0x0008
            return
        L_0x0008:
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "content_type"
            com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.m97041c()
            java.lang.String r3 = "slideshow"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "upload_type"
            int r3 = r12.getImageCount()
            r4 = 1
            if (r3 <= r4) goto L_0x0023
            java.lang.String r3 = "multiple_content"
            goto L_0x0025
        L_0x0023:
            java.lang.String r3 = "single_content"
        L_0x0025:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "pic_cnt"
            int r3 = r12.getImageCount()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r3)
            java.lang.String r2 = "is_multi_content"
            int r3 = r12.getImageCount()
            r5 = 0
            if (r3 <= r4) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r3)
            java.lang.String r2 = "mix_type"
            int r3 = r12.getImageCount()
            java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b.m99356a(r5, r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "video_cnt"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r5)
            java.lang.String r2 = "is_add_more"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r5)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f111735a
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r11.f111735a
            if (r2 != 0) goto L_0x006c
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x006c:
            java.lang.String r2 = r2.f107132y
            r1.mo47829a(r0, r2)
            java.lang.String r0 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r11.f111735a
            if (r2 != 0) goto L_0x007c
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x007c:
            java.lang.String r2 = r2.f107131x
            r1.mo47829a(r0, r2)
        L_0x0081:
            java.lang.String r0 = "upload_content_next"
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x0091
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0091:
            java.lang.String r0 = r0.f107131x
            r12.creationId = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x009e
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x009e:
            int r0 = r0.f107022A
            r12.draftId = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x00ab
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00ab:
            java.lang.String r0 = r0.f107132y
            r12.mShootWay = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x00b8
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00b8:
            java.lang.String r0 = r0.f107076ab
            r12.nationalTaskId = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x00c5
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00c5:
            java.util.ArrayList<java.lang.String> r0 = r0.f107077ac
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x00d8
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00d8:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r0 = r0.f107078ad
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x00eb
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00eb:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r0 = r0.f107125r
            if (r0 == 0) goto L_0x026e
        L_0x00ef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r11.f111735a
            if (r1 != 0) goto L_0x00fd
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00fd:
            java.util.ArrayList<java.lang.String> r1 = r1.f107077ac
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x0130
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r11.f111735a
            if (r1 != 0) goto L_0x0110
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0110:
            java.util.ArrayList<java.lang.String> r1 = r1.f107077ac
            java.util.Iterator r1 = r1.iterator()
        L_0x0116:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0130
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "#"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            goto L_0x0116
        L_0x0130:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r11.f111735a
            if (r2 != 0) goto L_0x013e
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x013e:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r2 = r2.f107078ad
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x01cd
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r11.f111735a
            if (r2 != 0) goto L_0x0151
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0151:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r2 = r2.f107078ad
            java.util.Iterator r2 = r2.iterator()
        L_0x0157:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01cd
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.discover.model.TaskMentionedUser r3 = (com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser) r3
            java.lang.String r6 = "taskMentionedUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
            java.lang.String r6 = r3.getNickname()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0179
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0177
            goto L_0x0179
        L_0x0177:
            r6 = 0
            goto L_0x017a
        L_0x0179:
            r6 = 1
        L_0x017a:
            if (r6 != 0) goto L_0x0157
            java.lang.String r6 = r3.getUserId()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x018d
            int r6 = r6.length()
            if (r6 != 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r6 = 0
            goto L_0x018e
        L_0x018d:
            r6 = 1
        L_0x018e:
            if (r6 != 0) goto L_0x0157
            java.lang.String r6 = "@"
            r0.append(r6)
            java.lang.String r6 = r3.getNickname()
            r0.append(r6)
            java.lang.String r6 = " "
            r0.append(r6)
            java.lang.String r6 = r3.getNickname()
            if (r6 != 0) goto L_0x01a9
            java.lang.String r6 = ""
        L_0x01a9:
            int r6 = r0.indexOf(r6)
            int r6 = r6 - r4
            int r7 = r6 + 1
            java.lang.String r8 = r3.getNickname()
            if (r8 == 0) goto L_0x01bb
            int r8 = r8.length()
            goto L_0x01bc
        L_0x01bb:
            r8 = 0
        L_0x01bc:
            int r7 = r7 + r8
            java.lang.String r3 = r3.getUserId()
            if (r3 != 0) goto L_0x01c5
            java.lang.String r3 = "0"
        L_0x01c5:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r3 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createAtStruct(r6, r7, r3)
            r1.add(r3)
            goto L_0x0157
        L_0x01cd:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r11.f111735a
            if (r2 != 0) goto L_0x01d6
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01d6:
            boolean r2 = r2.mo86367h()
            if (r2 == 0) goto L_0x0264
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@"
            r2.<init>(r3)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r11.f111735a
            if (r3 != 0) goto L_0x01ec
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01ec:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r3 = r3.f107125r
            if (r3 == 0) goto L_0x01f5
            java.lang.String r3 = r3.getUserName()
            goto L_0x01f6
        L_0x01f5:
            r3 = 0
        L_0x01f6:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.app.Activity r3 = r11.f111739e
            r6 = 2132543056(0x7f1c0650, float:2.0739234E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r5] = r2
            java.lang.String r2 = r3.getString(r6, r7)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r11.f111735a
            if (r2 != 0) goto L_0x021b
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x021b:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r2 = r2.f107125r
            if (r2 == 0) goto L_0x0225
            java.lang.String r2 = r2.getUserName()
            if (r2 != 0) goto L_0x0227
        L_0x0225:
            java.lang.String r2 = ""
        L_0x0227:
            int r2 = r0.indexOf(r2)
            int r2 = r2 - r4
            int r3 = r2 + 1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r11.f111735a
            if (r4 != 0) goto L_0x0237
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0237:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r4 = r4.f107125r
            if (r4 == 0) goto L_0x0246
            java.lang.String r4 = r4.getUserName()
            if (r4 == 0) goto L_0x0246
            int r4 = r4.length()
            goto L_0x0247
        L_0x0246:
            r4 = 0
        L_0x0247:
            int r3 = r3 + r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r11.f111735a
            if (r4 != 0) goto L_0x0251
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0251:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r4 = r4.f107125r
            if (r4 == 0) goto L_0x025b
            java.lang.String r4 = r4.getUserId()
            if (r4 != 0) goto L_0x025d
        L_0x025b:
            java.lang.String r4 = "0"
        L_0x025d:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r2 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createCommentStruct(r2, r3, r4)
            r1.add(r2)
        L_0x0264:
            java.util.List r1 = (java.util.List) r1
            r12.structList = r1
            java.lang.String r0 = r0.toString()
            r12.title = r0
        L_0x026e:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x0277
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0277:
            java.lang.String r0 = r0.f107034M
            r12.poiId = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x0284
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0284:
            java.lang.String r0 = r0.f107115h
            r12.musicOrigin = r0
            java.lang.String r0 = r11.f111740f
            if (r0 != 0) goto L_0x0291
            java.lang.String r1 = "musicPath"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0291:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02af
            java.lang.String r0 = r11.f111740f
            if (r0 != 0) goto L_0x02a2
            java.lang.String r1 = "musicPath"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02a2:
            r12.mMusicPath = r0
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            r12.mMusic = r0
            goto L_0x02bd
        L_0x02af:
            boolean r0 = com.bytedance.common.utility.C9414h.m18631b(r13)
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r0 = r13.get(r5)
            com.ss.android.ugc.aweme.shortvideo.c r0 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r0
            r12.mMusic = r0
        L_0x02bd:
            r0 = 2
            r12.mFrom = r0
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r1 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = r0.f109287b
            r12.challenges = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f111735a
            if (r0 != 0) goto L_0x02d6
            java.lang.String r1 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02d6:
            com.ss.android.ugc.aweme.tools.a.b r0 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97061b(r0)
            r1 = r12
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r1 = (com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext) r1
            com.ss.android.ugc.aweme.tools.a.a r1 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97058b(r1)
            com.ss.android.ugc.aweme.tools.a.e r2 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.RECORD
            com.ss.android.ugc.aweme.tools.a.e r3 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.EDIT
            com.p683ss.android.ugc.aweme.tools.p2346a.C46806g.m101653a(r0, r1, r2, r3)
            com.ss.android.ugc.aweme.services.photomovie.IPhotoMovieService r4 = r11.f111738d
            if (r4 != 0) goto L_0x02f1
            java.lang.String r0 = "photoMovieService"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x02f1:
            android.app.Activity r0 = r11.f111739e
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r8 = "upload"
            long r9 = r11.f111742h
            r6 = r12
            r7 = r13
            r4.startPhotoMovieEditActivity(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44106ao.m96737a(com.ss.android.ugc.aweme.photomovie.PhotoMovieContext, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        String str;
        C52711k.m112240b(intent, "data");
        if (i == 1) {
            this.f111742h = System.currentTimeMillis();
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C52711k.m112236a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List<MediaModel> list = parcelableArrayListExtra;
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            C52711k.m112236a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f111735a = (ShortVideoContext) parcelableExtra;
            ShortVideoContext shortVideoContext = this.f111735a;
            if (shortVideoContext == null) {
                C52711k.m112237a("shortVideoContext");
            }
            Workspace workspace = shortVideoContext.f107118k;
            C52711k.m112236a((Object) workspace, "shortVideoContext.mWorkspace");
            if (workspace.mo86458e() != null) {
                ShortVideoContext shortVideoContext2 = this.f111735a;
                if (shortVideoContext2 == null) {
                    C52711k.m112237a("shortVideoContext");
                }
                Workspace workspace2 = shortVideoContext2.f107118k;
                C52711k.m112236a((Object) workspace2, "shortVideoContext.mWorkspace");
                File e = workspace2.mo86458e();
                C52711k.m112236a((Object) e, "shortVideoContext.mWorkspace.musicFile");
                str = e.getAbsolutePath();
                C52711k.m112236a((Object) str, "shortVideoContext.mWorks…ce.musicFile.absolutePath");
            } else {
                str = "";
            }
            this.f111740f = str;
            List arrayList = new ArrayList();
            this.f111741g.mImageList = new ArrayList();
            for (MediaModel b : list) {
                String b2 = b.mo76675b();
                C52711k.m112236a((Object) b2, "it.lngLatStr");
                arrayList.add(b2);
            }
            String a = C52575l.m112120a(arrayList, ";", null, null, 0, null, null, 62, null);
            if (!TextUtils.isEmpty(a)) {
                ShortVideoContext shortVideoContext3 = this.f111735a;
                if (shortVideoContext3 == null) {
                    C52711k.m112237a("shortVideoContext");
                }
                shortVideoContext3.f107100az = a;
            }
            for (MediaModel mediaModel : list) {
                this.f111741g.mImageList.add(mediaModel.f95383b);
            }
            this.f111741g.mRealImageCount = this.f111741g.mImageList.size();
            C39618d.m88208a(this.f111739e, "from_record_page", new C44107a(this));
        }
    }
}
