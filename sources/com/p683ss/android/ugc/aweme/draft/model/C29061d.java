package com.p683ss.android.ugc.aweme.draft.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.effect.EffectListModel;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.p1388at.C23288a;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43674g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.draft.model.d */
public final class C29061d {

    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$a */
    static final class C29062a implements C38719a {

        /* renamed from: a */
        final /* synthetic */ OnVideoCoverCallback f76170a;

        C29062a(OnVideoCoverCallback onVideoCoverCallback) {
            this.f76170a = onVideoCoverCallback;
        }

        /* renamed from: a */
        public final void mo58818a(final Bitmap bitmap, int i, int i2) {
            C0013i.m18a((Callable<TResult>) new Callable<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C29062a f76171a;

                {
                    this.f76171a = r1;
                }

                public final /* synthetic */ Object call() {
                    Bitmap bitmap = bitmap;
                    if (bitmap != null) {
                        C52711k.m112236a((Object) bitmap, "it");
                        if (!(!bitmap.isRecycled())) {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            this.f76171a.f76170a.onGetVideoCoverSuccess(bitmap);
                            return C52860x.f131107a;
                        }
                    }
                    this.f76171a.f76170a.onGetVideoCoverFailed(-1);
                    return C52860x.f131107a;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b */
    public static final class C29064b implements OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ OnVideoCoverCallback f76173a;

        /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b$a */
        static final class C29065a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C29064b f76174a;

            /* renamed from: b */
            final /* synthetic */ int f76175b;

            C29065a(C29064b bVar, int i) {
                this.f76174a = bVar;
                this.f76175b = i;
            }

            public final /* synthetic */ Object call() {
                this.f76174a.f76173a.onGetVideoCoverFailed(this.f76175b);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b$b */
        static final class C29066b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C29064b f76176a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f76177b;

            C29066b(C29064b bVar, Bitmap bitmap) {
                this.f76176a = bVar;
                this.f76177b = bitmap;
            }

            public final /* synthetic */ Object call() {
                this.f76176a.f76173a.onGetVideoCoverSuccess(this.f76177b);
                return C52860x.f131107a;
            }
        }

        C29064b(OnVideoCoverCallback onVideoCoverCallback) {
            this.f76173a = onVideoCoverCallback;
        }

        public final void onGetVideoCoverFailed(int i) {
            C0013i.m18a((Callable<TResult>) new C29065a<TResult>(this, i), C0013i.f25b);
        }

        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C52711k.m112240b(bitmap, "bitmap");
            C0013i.m18a((Callable<TResult>) new C29066b<TResult>(this, bitmap), C0013i.f25b);
        }
    }

    /* renamed from: a */
    private static IFoundationAVService m68494a() {
        Object a = C27991b.m66756a(IFoundationAVService.class);
        if (a != null) {
            return (IFoundationAVService) a;
        }
        return (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    /* renamed from: h */
    private static final List<DraftVideoSegment> m68503h(C29059c cVar) {
        return cVar.f76142T.f76081aj;
    }

    /* renamed from: a */
    private static int m68493a(String str) {
        C52711k.m112240b(str, "$this$videoValidity");
        File file = new File(str);
        if (!file.exists()) {
            return -1;
        }
        if (file.length() <= 0) {
            return -9;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m68497b(com.p683ss.android.ugc.aweme.draft.model.C29059c r2) {
        /*
            java.lang.String r0 = "$this$allVideoPath"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r2.f76145c
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r2 = r2.f76145c
            if (r2 != 0) goto L_0x0010
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0010:
            java.lang.String r2 = r2.mFinalVideoTmpPath
            java.lang.String r0 = "photoMovieContext!!.mFinalVideoTmpPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
            return r2
        L_0x0018:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = m68500e(r2)
            if (r2 == 0) goto L_0x0056
            if (r2 != 0) goto L_0x0023
            java.lang.String r2 = ""
            goto L_0x0054
        L_0x0023:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r2 = r2.getVideoList()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0032:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r1
            java.lang.String r1 = r1.getVideoPath()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            goto L_0x0032
        L_0x004b:
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "stringBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
        L_0x0054:
            if (r2 != 0) goto L_0x0058
        L_0x0056:
            java.lang.String r2 = ""
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.draft.model.C29061d.m68497b(com.ss.android.ugc.aweme.draft.model.c):java.lang.String");
    }

    /* renamed from: f */
    public static final List<EditVideoSegment> m68501f(C29059c cVar) {
        C52711k.m112240b(cVar, "$this$getPreviewVideoListCopy");
        if (cVar.f76142T.f76083al != null) {
            return cVar.f76142T.f76083al;
        }
        if (m68503h(cVar) != null) {
            List h = m68503h(cVar);
            if (h == null) {
                C52711k.m112234a();
            }
            if (!h.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                List<DraftVideoSegment> h2 = m68503h(cVar);
                if (h2 != null) {
                    for (DraftVideoSegment a : h2) {
                        arrayList.add(C43668b.m95931a(a));
                    }
                }
                List<EditVideoSegment> list = arrayList;
                cVar.mo58756a(list);
                return list;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static final C29069g m68502g(C29059c cVar) {
        C29069g gVar = cVar.f76142T.f76080ai;
        if (!(gVar == null || cVar.f76142T.f76081aj == null)) {
            List<DraftVideoSegment> list = cVar.f76142T.f76081aj;
            if (list == null) {
                C52711k.m112234a();
            }
            if (!list.isEmpty() && !new File(((DraftVideoSegment) gVar.f76185c.get(0)).f76022h).exists()) {
                List<DraftVideoSegment> list2 = cVar.f76142T.f76081aj;
                if (list2 == null) {
                    list2 = C52575l.m112097a();
                }
                gVar.mo58830a(list2);
                C50203g.m108358a("draftOpt==>getDraftPreviewConfigure,using copy video videoSegment");
            }
        }
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m68492a(com.p683ss.android.ugc.aweme.draft.model.C29059c r7) {
        /*
            java.lang.String r0 = "$this$videoValidity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = m68500e(r7)
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r1 = r7.f76145c
            if (r1 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r7 = r7.f76145c
            if (r7 != 0) goto L_0x0014
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0014:
            java.lang.String r7 = r7.mFinalVideoTmpPath
            java.lang.String r0 = "photoMovieContext!!.mFinalVideoTmpPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            int r7 = m68493a(r7)
            return r7
        L_0x0020:
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            java.util.List r2 = r0.getVideoList()
            int r2 = r2.size()
            r3 = 0
        L_0x002c:
            if (r3 >= r2) goto L_0x00a6
            java.util.List r4 = r0.getVideoList()
            java.lang.Object r4 = r4.get(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r4 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r4
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r4.getVideoPath()
            r5.<init>(r6)
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x006a
            java.util.List r5 = m68501f(r7)
            if (r5 == 0) goto L_0x006a
            int r6 = r5.size()
            if (r6 <= r3) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            if (r6 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r5.get(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r5 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r5
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = r5.getVideoPath()
            if (r5 != 0) goto L_0x006e
        L_0x006a:
            java.lang.String r5 = r4.getVideoPath()
        L_0x006e:
            int r5 = m68493a(r5)
            if (r5 == 0) goto L_0x00a3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "draft isn't validity index = "
            r7.<init>(r0)
            r7.append(r3)
            java.lang.String r0 = " \nvideoPath = "
            r7.append(r0)
            java.lang.String r0 = r4.getVideoPath()
            r7.append(r0)
            java.lang.String r0 = "\naudioPath = "
            r7.append(r0)
            java.lang.String r0 = r4.getAudioPath()
            r7.append(r0)
            java.lang.String r0 = "\n"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r7)
            return r5
        L_0x00a3:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x00a6:
            return r1
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.draft.model.C29061d.m68492a(com.ss.android.ugc.aweme.draft.model.c):int");
    }

    /* renamed from: e */
    public static final EditPreviewInfo m68500e(C29059c cVar) {
        EditPreviewInfo editPreviewInfo;
        C52711k.m112240b(cVar, "$this$getPreviewInfo");
        if (cVar.f76142T.f76082ak != null) {
            EditPreviewInfo editPreviewInfo2 = cVar.f76142T.f76082ak;
            if (m68501f(cVar) != null) {
                List f = m68501f(cVar);
                if (f == null) {
                    C52711k.m112234a();
                }
                if (true ^ f.isEmpty()) {
                    List f2 = m68501f(cVar);
                    if (f2 == null) {
                        C52711k.m112234a();
                    }
                    int size = f2.size();
                    if (editPreviewInfo2 == null) {
                        C52711k.m112234a();
                    }
                    if (size < editPreviewInfo2.getVideoList().size()) {
                        return editPreviewInfo2;
                    }
                    int size2 = editPreviewInfo2.getVideoList().size();
                    for (int i = 0; i < size2; i++) {
                        if (!new File(((EditVideoSegment) editPreviewInfo2.getVideoList().get(i)).getVideoPath()).exists()) {
                            List videoList = editPreviewInfo2.getVideoList();
                            List f3 = m68501f(cVar);
                            if (f3 == null) {
                                C52711k.m112234a();
                            }
                            videoList.set(i, f3.get(i));
                        }
                    }
                }
            }
            cVar.mo58753a(editPreviewInfo2);
            return editPreviewInfo2;
        }
        C29069g g = m68502g(cVar);
        if (g != null) {
            editPreviewInfo = C43668b.m95930a(g);
        } else {
            String str = cVar.f76148f;
            C52711k.m112236a((Object) str, "videoPath");
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, cVar.f76150h, C43668b.m95933a(cVar.f76148f));
            C43674g gVar = new C43674g(0, 0, 0, 0, 15, null);
            editPreviewInfo = gVar.mo89103a(editVideoSegment);
            if (!TextUtils.isEmpty(cVar.f76157o)) {
                String str2 = cVar.f76157o;
                C52711k.m112236a((Object) str2, "reversePath");
                editPreviewInfo.setReverseVideoArray(new String[]{str2});
            }
        }
        cVar.mo58753a(editPreviewInfo);
        return editPreviewInfo;
    }

    /* renamed from: d */
    public static final void m68499d(C29059c cVar) {
        String str;
        String str2;
        C52711k.m112240b(cVar, "$this$removeRelatedFiles");
        if (cVar.f76145c != null) {
            PhotoMovieContext photoMovieContext = cVar.f76145c;
            if (photoMovieContext != null) {
                str2 = photoMovieContext.mFinalVideoTmpPath;
            } else {
                str2 = null;
            }
            C50200d.m108350b(str2);
        } else {
            EditPreviewInfo e = m68500e(cVar);
            if (e != null) {
                C43668b.m95939a(e, cVar.mo58767ad());
            }
            List<EditVideoSegment> f = m68501f(cVar);
            if (f != null && (!f.isEmpty())) {
                for (EditVideoSegment editVideoSegment : f) {
                    C50200d.m108350b(editVideoSegment.getVideoPath());
                    C50200d.m108350b(editVideoSegment.getAudioPath());
                }
            }
        }
        if (cVar.mo58771ah() != null && !TextUtils.isEmpty(cVar.mo58771ah().getAudioUrl())) {
            C50200d.m108350b(cVar.mo58771ah().getAudioUrl());
            AudioRecorderParam ah = cVar.mo58771ah();
            C52711k.m112236a((Object) ah, "audioRecorderParam");
            C52711k.m112240b(ah, "$this$getAudioUrlWithoutDraft");
            if (C52830p.m112413c(ah.getAudioUrl(), "df", false, 2, null)) {
                String audioUrl = ah.getAudioUrl();
                int length = ah.getAudioUrl().length() - 2;
                if (audioUrl != null) {
                    str = audioUrl.substring(0, length);
                    C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str = "";
            }
            C50200d.m108350b(str);
        }
        InfoStickerModel L = cVar.mo58735L();
        if (L != null && !C9376b.m18558a((Collection<T>) L.stickers)) {
            for (StickerItemModel stickerItemModel : L.stickers) {
                if (stickerItemModel.isPin) {
                    C50200d.m108350b(stickerItemModel.pinAlgorithmFile);
                }
            }
        }
        C50200d.m108352c(cVar.mo58785av());
        C50200d.m108350b(cVar.mo58785av());
        if (cVar.mo58789az()) {
            C50200d.m108350b(cVar.mo58788ay().getFilePath());
        }
    }

    /* renamed from: c */
    public static final Set<String> m68498c(C29059c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C52711k.m112240b(cVar, "$this$cleanerWhiteSet");
        HashSet hashSet = new HashSet();
        String calculateDraftDir = m68494a().draftService().calculateDraftDir(cVar);
        if (calculateDraftDir != null) {
            Boolean.valueOf(hashSet.add(calculateDraftDir));
        }
        String str = cVar.f76142T.f76048O;
        if (str != null) {
            Boolean.valueOf(hashSet.add(str));
        }
        if (cVar.f76153k != 0) {
            IFoundationAVService a = m68494a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…ionAVService::class.java)");
            String str2 = a.getFilterService().getFilter(cVar.f76153k).f82332i;
            if (str2 != null) {
                Boolean.valueOf(hashSet.add(str2));
            }
        }
        String ai = cVar.mo58772ai();
        if (ai != null) {
            Boolean.valueOf(hashSet.add(ai));
        }
        C29070h ag = cVar.mo58770ag();
        if (ag != null) {
            String str3 = ag.f76194d;
            if (str3 != null) {
                Boolean.valueOf(hashSet.add(str3));
            }
        }
        String str4 = cVar.f76149g;
        if (str4 != null) {
            if (str4.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                str4 = null;
            }
            if (str4 != null) {
                Boolean.valueOf(hashSet.add(str4));
            }
        }
        EffectListModel effectListModel = cVar.f76125C;
        if (effectListModel != null) {
            ArrayList effectPointModels = effectListModel.getEffectPointModels();
            if (effectPointModels != null) {
                List<EffectPointModel> b = C52575l.m112128b((Iterable<? extends T>) effectPointModels);
                if (b != null) {
                    for (EffectPointModel resDir : b) {
                        String resDir2 = resDir.getResDir();
                        if (resDir2 != null) {
                            Boolean.valueOf(hashSet.add(resDir2));
                        }
                    }
                }
            }
        }
        String m = cVar.mo58803m();
        if (m != null) {
            Boolean.valueOf(hashSet.add(m));
        }
        C23289b R = cVar.mo58741R();
        if (R != null) {
            ArrayList<String> arrayList = R.selectMediaList;
            if (arrayList != null) {
                List<String> b2 = C52575l.m112128b((Iterable<? extends T>) arrayList);
                if (b2 != null) {
                    for (String add : b2) {
                        hashSet.add(add);
                    }
                }
            }
        }
        C23289b R2 = cVar.mo58741R();
        if (R2 != null) {
            String str5 = R2.videoCoverImgPath;
            if (str5 != null) {
                Boolean.valueOf(hashSet.add(str5));
            }
        }
        C23289b R3 = cVar.mo58741R();
        if (R3 != null) {
            CharSequence charSequence = R3.mvResUnzipPath;
            if (charSequence == null || charSequence.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!(!z11)) {
                R3 = null;
            }
            if (R3 != null) {
                Boolean.valueOf(hashSet.add(new File(R3.mvResUnzipPath).getAbsolutePath()));
            }
        }
        C23289b R4 = cVar.mo58741R();
        if (R4 != null) {
            ArrayList<C23288a> arrayList2 = R4.maskFileData;
            if (arrayList2 != null) {
                for (C23288a aVar : arrayList2) {
                    if (aVar != null) {
                        List<C52847n> maskFiles = aVar.getMaskFiles();
                        if (maskFiles != null) {
                            for (C52847n second : maskFiles) {
                                hashSet.add(second.getSecond());
                            }
                        }
                    }
                }
            }
        }
        C23289b R5 = cVar.mo58741R();
        if (R5 != null) {
            ArrayList<C23290c> arrayList3 = R5.newMaskFileData;
            if (arrayList3 != null) {
                for (C23290c filePath : arrayList3) {
                    hashSet.add(filePath.getFilePath());
                }
            }
        }
        StatusCreateVideoData S = cVar.mo58742S();
        if (S != null) {
            String videoCoverImgPath = S.getVideoCoverImgPath();
            if (videoCoverImgPath != null) {
                Boolean.valueOf(hashSet.add(videoCoverImgPath));
            }
        }
        StatusCreateVideoData S2 = cVar.mo58742S();
        if (S2 != null) {
            CharSequence effectPath = S2.getEffectPath();
            if (effectPath == null || effectPath.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                S2 = null;
            }
            if (S2 != null) {
                Boolean.valueOf(hashSet.add(new File(S2.getEffectPath()).getAbsolutePath()));
            }
        }
        StatusCreateVideoData S3 = cVar.mo58742S();
        if (S3 != null) {
            String bgPath = S3.getBgPath();
            if (bgPath != null) {
                Boolean.valueOf(hashSet.add(bgPath));
            }
        }
        StatusCreateVideoData S4 = cVar.mo58742S();
        if (S4 != null) {
            String musicPath = S4.getMusicPath();
            if (musicPath != null) {
                Boolean.valueOf(hashSet.add(musicPath));
            }
        }
        PhotoMovieContext photoMovieContext = cVar.f76145c;
        if (photoMovieContext != null) {
            CharSequence charSequence2 = photoMovieContext.mFinalVideoTmpPath;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!(!z9)) {
                photoMovieContext = null;
            }
            if (photoMovieContext != null) {
                Boolean.valueOf(hashSet.add(photoMovieContext.mFinalVideoTmpPath));
            }
        }
        PhotoMovieContext photoMovieContext2 = cVar.f76145c;
        if (photoMovieContext2 != null) {
            String str6 = photoMovieContext2.mMusicPath;
            if (str6 != null) {
                Boolean.valueOf(hashSet.add(str6));
            }
        }
        PhotoMovieContext photoMovieContext3 = cVar.f76145c;
        if (!(photoMovieContext3 == null || photoMovieContext3.mFilterPath == null)) {
            PhotoMovieContext photoMovieContext4 = cVar.f76145c;
            if (photoMovieContext4 != null) {
                hashSet.add(C39629l.m88232a().mo58584o().mo64333c().mo64351e(photoMovieContext4.mFilterId));
            }
        }
        EditPreviewInfo e = m68500e(cVar);
        if (e != null) {
            String draftDir = e.getDraftDir();
            if (draftDir.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                draftDir = null;
            }
            if (draftDir != null) {
                Boolean.valueOf(hashSet.add(draftDir));
            }
            for (EditVideoSegment editVideoSegment : e.getVideoList()) {
                String videoPath = editVideoSegment.getVideoPath();
                if (videoPath.length() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    videoPath = null;
                }
                if (videoPath != null) {
                    hashSet.add(videoPath);
                    String a2 = C9395d.m18571a(videoPath);
                    CharSequence charSequence3 = a2;
                    if (charSequence3 == null || charSequence3.length() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        a2 = null;
                    }
                    if (a2 != null) {
                        Boolean.valueOf(hashSet.add(a2));
                    }
                }
                String audioPath = editVideoSegment.getAudioPath();
                CharSequence charSequence4 = audioPath;
                if (charSequence4 == null || charSequence4.length() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!(!z7)) {
                    audioPath = null;
                }
                if (audioPath != null) {
                    Boolean.valueOf(hashSet.add(audioPath));
                }
            }
            String[] reverseVideoArray = e.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str7 : reverseVideoArray) {
                    if (str7.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        Boolean.valueOf(hashSet.add(str7));
                    }
                }
            }
            String[] reverseAudioArray = e.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str8 : reverseAudioArray) {
                    if (str8.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        Boolean.valueOf(hashSet.add(str8));
                    }
                }
            }
            String[] tempVideoArray = e.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str9 : tempVideoArray) {
                    if (str9.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        Boolean.valueOf(hashSet.add(str9));
                    }
                }
            }
        }
        InfoStickerModel L = cVar.mo58735L();
        if (L != null) {
            List<StickerItemModel> list = L.stickers;
            if (list != null) {
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel != null) {
                        String str10 = stickerItemModel.path;
                        if (str10 != null) {
                            if (str10.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                str10 = null;
                            }
                            if (str10 != null) {
                                Boolean.valueOf(hashSet.add(str10));
                            }
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static final void m68495a(C29059c cVar, int i) {
        C52711k.m112240b(cVar, "$this$setFilter");
        cVar.f76153k = i;
        IFoundationAVService a = m68494a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…ionAVService::class.java)");
        C31459g filter = a.getFilterService().getFilter(i);
        C52711k.m112236a((Object) filter, "ServiceManager.get().get…Service.getFilter(filter)");
        cVar.mo58792b(filter.f82332i);
    }

    /* renamed from: a */
    public static final void m68496a(C29059c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        float f;
        C52711k.m112240b(cVar, "$this$loadThumbCover");
        C52711k.m112240b(onVideoCoverCallback, "callback");
        CharSequence m = cVar.mo58803m();
        if (m == null || m.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !new File(cVar.mo58803m()).exists()) {
            if (cVar.f76137O == 2) {
                PhotoMovieContext photoMovieContext = cVar.f76145c;
                if (photoMovieContext != null) {
                    photoMovieContext.getPhotoMovieCover(new C29062a(onVideoCoverCallback));
                } else {
                    onVideoCoverCallback.onGetVideoCoverFailed(-1);
                    return;
                }
            } else if (cVar.mo58743T()) {
                String W = cVar.mo58746W();
                if (W != null) {
                    if (!C50200d.m108346a(W)) {
                        W = null;
                    }
                    if (W != null) {
                        Bitmap decodeFile = BitmapFactory.decodeFile(cVar.mo58746W());
                        if (decodeFile != null) {
                            if (!(!decodeFile.isRecycled())) {
                                decodeFile = null;
                            }
                            if (decodeFile != null) {
                                onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile);
                                return;
                            }
                        }
                        onVideoCoverCallback.onGetVideoCoverFailed(-1);
                    }
                }
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
                return;
            } else if (cVar.mo58744U()) {
                String X = cVar.mo58747X();
                if (X != null) {
                    if (!C50200d.m108346a(X)) {
                        X = null;
                    }
                    if (X != null) {
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(cVar.mo58747X());
                        if (decodeFile2 != null) {
                            if (!(!decodeFile2.isRecycled())) {
                                decodeFile2 = null;
                            }
                            if (decodeFile2 != null) {
                                onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile2);
                                return;
                            }
                        }
                        onVideoCoverCallback.onGetVideoCoverFailed(-1);
                    }
                }
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
                return;
            } else if (!cVar.mo58745V()) {
                List arrayList = new ArrayList();
                EffectListModel effectListModel = cVar.f76125C;
                if (effectListModel != null) {
                    ArrayList effectPointModels = effectListModel.getEffectPointModels();
                    C52711k.m112236a((Object) effectPointModels, "it.effectPointModels");
                    arrayList.addAll(effectPointModels);
                }
                boolean equals = TextUtils.equals(String.valueOf(cVar.f76155m), "1");
                IEffectService effectService = m68494a().effectService();
                IFoundationAVService a = m68494a();
                C52711k.m112236a((Object) a, "ServiceManager.get().get…ionAVService::class.java)");
                String str = a.getFilterService().getFilter(cVar.f76153k).f82332i;
                if (str == null) {
                    C52711k.m112234a();
                }
                if (cVar.mo58780aq() == -1.0f) {
                    f = 0.8f;
                } else {
                    f = cVar.mo58780aq();
                }
                effectService.getVideoCoverByCallback(arrayList, str, f, (int) (cVar.f76138P * 1000.0f), equals, m68500e(cVar), (OnVideoCoverCallback) new C29064b(onVideoCoverCallback));
            } else if (!C50200d.m108346a(cVar.mo58748Y())) {
                StringBuilder sb = new StringBuilder("multi edit video cover img path not exist:");
                sb.append(cVar.mo58748Y());
                C50203g.m108361b(sb.toString());
            } else {
                String Y = cVar.mo58748Y();
                if (Y != null) {
                    if (!C50200d.m108346a(Y)) {
                        Y = null;
                    }
                    if (Y != null) {
                        Bitmap decodeFile3 = BitmapFactory.decodeFile(cVar.mo58748Y());
                        if (decodeFile3 != null) {
                            if (!(!decodeFile3.isRecycled())) {
                                decodeFile3 = null;
                            }
                            if (decodeFile3 != null) {
                                onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile3);
                            }
                        }
                        onVideoCoverCallback.onGetVideoCoverFailed(-1);
                    }
                }
                return;
            }
            return;
        }
        Bitmap decodeFile4 = BitmapFactory.decodeFile(cVar.mo58803m());
        if (decodeFile4 != null) {
            if (!(!decodeFile4.isRecycled())) {
                decodeFile4 = null;
            }
            if (decodeFile4 != null) {
                onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile4);
                return;
            }
        }
        onVideoCoverCallback.onGetVideoCoverFailed(-1);
    }
}
