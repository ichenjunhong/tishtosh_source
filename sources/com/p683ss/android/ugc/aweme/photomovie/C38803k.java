package com.p683ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.medialib.photomovie.PhotoMovie;
import com.p683ss.android.medialib.photomovie.PhotoMovie.C19354b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.photo.p2045a.C38653a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.shortvideo.C42418ai;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42445ba;
import com.p683ss.android.ugc.aweme.shortvideo.C42446bb;
import com.p683ss.android.ugc.aweme.shortvideo.C43211de;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43775ef;
import com.p683ss.android.ugc.aweme.shortvideo.C43781eh;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44338p;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p683ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.aweme.utils.C47921gl;
import com.p683ss.android.ugc.aweme.utils.C47922gm;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photomovie.k */
public final class C38803k extends C43907k {

    /* renamed from: f */
    private C38796f f98738f = new C38796f();

    /* renamed from: g */
    private TTUploaderService f98739g;

    /* renamed from: h */
    private C43781eh f98740h;

    /* renamed from: a */
    public final void mo78617a() {
        this.f98740h.mo78617a();
    }

    /* renamed from: c */
    public final Bitmap mo78619c(Object obj) {
        return m86208a((PhotoMovieContext) obj);
    }

    /* renamed from: b */
    public final long mo78618b(Object obj) {
        return new File(((PhotoMovieContext) obj).mOutputVideoPath).length();
    }

    /* renamed from: a */
    public static Bitmap m86208a(PhotoMovieContext photoMovieContext) {
        C47922gm.m103690a();
        return C47922gm.m103691b((String) photoMovieContext.mImageList.get(0), 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 1);
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo78615a(Object obj) {
        C387971 r1 = new C43211de<SynthetiseResult>("PhotoMovieCompiler", (PhotoMovieContext) obj) {

            /* renamed from: a */
            final /* synthetic */ PhotoMovieContext f98727a;

            {
                this.f98727a = r3;
                final C0027j jVar = new C0027j();
                C0013i.m18a((Callable<TResult>) new Callable<SynthetiseResult>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public SynthetiseResult call() throws Exception {
                        Integer num;
                        String a;
                        boolean z;
                        int i;
                        StringBuilder sb = new StringBuilder();
                        for (String append : C387971.this.f98727a.mImageList) {
                            sb.append(append);
                            sb.append(",");
                        }
                        C23569o.m57779a("photo_movie_edit_log", new C23088c().mo47822a("mVideoLength", Integer.valueOf(C387971.this.f98727a.getVideoLength())).mo47822a("mFilterId", Integer.valueOf(C387971.this.f98727a.mFilterId)).mo47824a("image_list", sb.toString()).mo47825b());
                        SynthetiseResult synthetiseResult = new SynthetiseResult();
                        synthetiseResult.isFromDraft = C387971.this.f98727a.mIsFromDraft;
                        synthetiseResult.outputFile = C387971.this.f98727a.mOutputVideoPath;
                        synthetiseResult.isMusic = 1;
                        synthetiseResult.outputWavFile = C387971.this.f98727a.mInputAudioPath;
                        String[] strArr = new String[C387971.this.f98727a.mImageList.size()];
                        C387971.this.f98727a.mImageList.toArray(strArr);
                        C19354b bVar = new C19354b();
                        bVar.f53502a = strArr;
                        bVar.f53509h = C387971.this.f98727a.mFilterPath;
                        bVar.f53508g = C387971.this.f98727a.mPlayType;
                        C387971.this.f98727a.mWidth = C39618d.f101177r.getVideoWidth();
                        C387971.this.f98727a.mHeight = C39618d.f101177r.getVideoHeight();
                        synthetiseResult.videoWidth = C387971.this.f98727a.mWidth;
                        synthetiseResult.videoHeight = C387971.this.f98727a.mHeight;
                        bVar.f53507f = new int[]{C387971.this.f98727a.mWidth, C387971.this.f98727a.mHeight};
                        bVar.f53504c = C387971.this.f98727a.mOutputVideoPath;
                        bVar.f53503b = C387971.this.f98727a.mInputAudioPath;
                        File parentFile = new File(C387971.this.f98727a.mOutputVideoPath).getParentFile();
                        if (parentFile.exists() || parentFile.mkdirs()) {
                            if (C387971.this.f98727a.mMusicPath != null) {
                                FFMpegManager a2 = FFMpegManager.m46826a();
                                int resampleCycleAudioToWav = a2.f52944a.resampleCycleAudioToWav(C387971.this.f98727a.mMusicPath, C387971.this.f98727a.mInputAudioPath, 0, (long) C387971.this.f98727a.getVideoLength());
                                if (resampleCycleAudioToWav != 0) {
                                    synthetiseResult.ret = resampleCycleAudioToWav;
                                    StringBuilder sb2 = new StringBuilder("Resample failed, ret = ");
                                    sb2.append(resampleCycleAudioToWav);
                                    throw new C43809fd(sb2.toString(), synthetiseResult);
                                }
                            }
                            Integer.valueOf(0);
                            if (C387971.this.f98727a.photoTime == 0 || C387971.this.f98727a.transTime == 0) {
                                num = Integer.valueOf(PhotoMovie.calulateDuration(bVar));
                                bVar.f53512k.f53517b = 2500;
                                bVar.f53512k.f53518c = 500;
                            } else {
                                if (bVar.f53502a.length == 0) {
                                    i = 0;
                                } else {
                                    i = (bVar.f53502a.length * C387971.this.f98727a.photoTime) - C387971.this.f98727a.transTime;
                                }
                                num = Integer.valueOf(i);
                                bVar.f53512k.f53517b = C387971.this.f98727a.photoTime;
                                bVar.f53512k.f53518c = C387971.this.f98727a.transTime;
                            }
                            Integer num2 = num;
                            bVar.f53505d = new String[]{"description"};
                            bVar.f53506e = new String[]{C43882k.m96392a(false, true, (Context) null, (String) null, num2, Integer.valueOf(C387971.this.f98727a.mWidth), Integer.valueOf(C387971.this.f98727a.mHeight), null)};
                            bVar.f53513l = new C38801i(this);
                            PhotoMovie instance = PhotoMovie.getInstance();
                            if (C387971.this.f98727a.isSaveLocalWithWaterMark()) {
                                C38796f fVar = C38796f.this;
                                PhotoMovieContext photoMovieContext = C387971.this.f98727a;
                                C0027j jVar = new C0027j();
                                String str = photoMovieContext.mOutputVideoPath;
                                int i2 = photoMovieContext.mWidth;
                                int i3 = photoMovieContext.mHeight;
                                int saveType = photoMovieContext.mSaveModel.getSaveType();
                                C38799g gVar = new C38799g(instance, photoMovieContext, jVar);
                                C39527aa x = C39629l.m88232a().mo58593x();
                                String a3 = C9395d.m18571a(str);
                                if (TextUtils.isEmpty(x.mo74285e().mo46157a())) {
                                    a = x.mo74285e().mo46158b();
                                } else {
                                    a = x.mo74285e().mo46157a();
                                }
                                String str2 = a;
                                new File(C43308eb.f109498k).mkdirs();
                                C52711k.m112240b(str2, "userId");
                                C52711k.m112240b(a3, "filePrefix");
                                IAVProcessService processService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService();
                                String str3 = C43308eb.f109498k;
                                C52711k.m112236a((Object) str3, "ShortVideoConfig2.sTmpVideoDir");
                                if (saveType == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String waterPicDir = FestivalService.createIFestivalServicebyMonsterPlugin().getWaterPicDir();
                                C52711k.m112236a((Object) waterPicDir, "ServiceManager.get().get…ss.java).getWaterPicDir()");
                                processService.createWaterMarkImages(i2, i3, str2, str3, a3, true, z, waterPicDir, true, gVar);
                                jVar.f77a.mo36g();
                                PhotoMovie.setPhotoMovieListener(C38802j.f98737a);
                            }
                            int synthetise = instance.synthetise(bVar);
                            synthetiseResult.ret = synthetise;
                            if (synthetise != 0) {
                                C43809fd fdVar = new C43809fd("Photo movie synthesise failed.", synthetiseResult);
                                jVar.mo46b((Exception) fdVar);
                                throw fdVar;
                            } else if (synthetiseResult.outputFile == null || !new File(synthetiseResult.outputFile).exists() || new File(synthetiseResult.outputFile).length() == 0) {
                                synthetiseResult.ret = 10038;
                                C43809fd fdVar2 = new C43809fd("OnSynthetiseFinish failed. ret = 0 but file does not exist in movie", synthetiseResult);
                                jVar.mo46b((Exception) fdVar2);
                                throw fdVar2;
                            } else {
                                jVar.mo44a(synthetiseResult);
                                return synthetiseResult;
                            }
                        } else {
                            throw new C43809fd("mkdirs failed.", synthetiseResult);
                        }
                    }
                }, (Executor) C43775ef.f110844a);
                jVar.f77a.mo19a((C0011g<TResult, TContinuationResult>) new C38800h<TResult,TContinuationResult>(this, this.f98727a));
            }
        };
        C17825i.m43740a(r1, new C38823y(), C17833n.m43743a());
        return r1;
    }

    /* renamed from: d */
    public final boolean mo78774d(Object obj) {
        boolean z;
        String str;
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        if (photoMovieContext.isSaveLocal()) {
            String localTempPath = photoMovieContext.getLocalTempPath();
            boolean isSaveToLocalPathInsteadOfAlbum = photoMovieContext.isSaveToLocalPathInsteadOfAlbum();
            if (photoMovieContext.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(localTempPath) && new File(localTempPath).exists() && new File(localTempPath).length() > 0) {
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C23967a.m58772a(C39618d.f101160a));
                    sb.append(new File(localTempPath).getName());
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C39618d.f101182w.mo74168a((Context) C39618d.f101160a));
                    sb2.append(new File(localTempPath).getName());
                    str = sb2.toString();
                }
                C48016e.m103948c(localTempPath, str);
                photoMovieContext.mSaveModel.setLocalFinalPath(str);
                if (z) {
                    C38653a.m85993a(C39618d.f101160a, str);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C17832m<VideoCreation> mo78613a(Object obj, SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C38796f.m86205a((PhotoMovieContext) obj, synthetiseResult, linkedHashMap);
        C17832m<VideoCreation> a = this.f98739g.mo86428a(linkedHashMap);
        C17825i.m43740a(a, new C42446bb(), C23551l.f62672a);
        C17825i.m43740a(a, new C42445ba(), C23551l.f62672a);
        return a;
    }

    /* renamed from: a */
    public final C43211de<VideoCreation> mo78616a(Object obj, VideoCreation videoCreation) {
        boolean z;
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        String str = "PhotoMovieFutureFactoryTTUploader";
        C52711k.m112240b(photoMovieContext, "$this$checkAndFillCreationId");
        C52711k.m112240b(str, "scene");
        CharSequence charSequence = photoMovieContext.creationId;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            photoMovieContext.creationId = UUID.randomUUID().toString();
            C26890h.m65011a("check_creation_id", C23089d.m56640a().mo47829a("shoot_way", photoMovieContext.mShootWay).mo47829a("content_source", "upload").mo47829a("content_type", "slideshow").mo47829a("scene", str).f61491a);
        }
        return this.f98740h.mo89286a(photoMovieContext.mOutputVideoPath, photoMovieContext.mCoverStartTm, C40797m.m90253h(), videoCreation, photoMovieContext.creationId, new UploadSpeedInfo(), null);
    }

    public C38803k(TTUploaderService tTUploaderService, int i, int i2) {
        super(i, i2);
        this.f98739g = tTUploaderService;
        this.f98740h = new C43781eh(this.f98739g, i, i2);
        this.f111184a = i;
        this.f111185b = i2;
    }

    /* renamed from: a */
    public final C17832m<C42421al> mo78614a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("new_sdk", "1");
        linkedHashMap.put("video_id", videoCreation.materialId);
        C47921gl.m103688a(videoCreation, linkedHashMap);
        C38796f fVar = this.f98738f;
        C38796f.m86205a(photoMovieContext, synthetiseResult, linkedHashMap);
        C17832m a = C39618d.f101179t.mo74304a(videoCreation.materialId, linkedHashMap);
        C17825i.m43740a(a, new C42418ai(), C23551l.f62672a);
        return C17825i.m43735a(a, C23459a.class, C44338p.m97117a(new C38804l(this, obj, videoCreation, synthetiseResult)), C23551l.f62672a);
    }
}
