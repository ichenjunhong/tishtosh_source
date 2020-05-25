package com.p683ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.p030v4.p040os.C0958a;
import android.text.TextUtils;
import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.plugin.C38949c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43995b;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43884l;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45247ae;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45248af;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45252b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.aweme.shortvideo.upload.httpdns.C45301a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2246a.C45240a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47921gl;
import com.p683ss.android.ugc.aweme.utils.C47955u;
import com.p683ss.ttuploader.TTUploadResolver;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderAbstractListener;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eh */
public final class C43781eh extends C43907k {

    /* renamed from: f */
    public TTVideoUploader f110852f;

    /* renamed from: g */
    public boolean f110853g;

    /* renamed from: h */
    public int f110854h;

    /* renamed from: i */
    private final C43775ef f110855i = new C43775ef();

    /* renamed from: j */
    private final TTUploaderService f110856j;

    /* renamed from: a */
    public final void mo78617a() {
        this.f110853g = true;
        if (this.f110854h > 0 && this.f110852f != null) {
            this.f110852f.allowMergeUpload();
        }
    }

    /* renamed from: c */
    public final Bitmap mo78619c(Object obj) {
        return C43775ef.m96219a(obj);
    }

    /* renamed from: d */
    public final boolean mo78774d(Object obj) {
        return C43775ef.m96221b(obj);
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo78615a(Object obj) {
        return this.f110855i.mo89281a((VideoPublishEditModel) obj, new C0958a(), false);
    }

    /* renamed from: b */
    public final long mo78618b(Object obj) {
        return new File(((VideoPublishEditModel) obj).mOutputFile).length();
    }

    /* renamed from: a */
    public final C17832m<VideoCreation> mo78613a(Object obj, SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        C52711k.m112240b(this.f110855i, "mOldFactory");
        C52711k.m112240b(videoPublishEditModel, "model");
        C52711k.m112240b(linkedHashMap, "params");
        C52711k.m112240b(synthetiseResult, "synthetiseResult");
        C17832m<VideoCreation> a = this.f110856j.mo86428a(linkedHashMap);
        C17825i.m43740a(a, new C42446bb(), C23551l.f62672a);
        C17825i.m43740a(a, new C42445ba(), C23551l.f62672a);
        return a;
    }

    /* renamed from: a */
    public final C43211de<VideoCreation> mo78616a(Object obj, VideoCreation videoCreation) {
        String g;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String a = C43884l.m96397a(videoPublishEditModel);
        videoPublishEditModel.metadataMap = null;
        C43995b.m96558a(videoPublishEditModel, "ShortVideoFutureFactoryTTUploader");
        String outputFile = videoPublishEditModel.getOutputFile();
        float f = videoPublishEditModel.mVideoCoverStartTm;
        if (videoPublishEditModel.mOrigin == 0) {
            g = C40797m.m90253h();
        } else {
            g = C40797m.m90252g();
        }
        String str = g;
        return mo89286a(outputFile, f, str, videoCreation, videoPublishEditModel.creationId, videoPublishEditModel.uploadSpeedInfo, a);
    }

    public C43781eh(TTUploaderService tTUploaderService, int i, int i2) {
        super(i, i2);
        this.f110856j = tTUploaderService;
        this.f110854h = C39618d.f101151O.mo83118b(C40796a.PreUploadEncryptionMode);
        this.f111184a = i;
        this.f111185b = i2;
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo86491a(Object obj, C0958a aVar, boolean z) {
        C43775ef efVar = this.f110855i;
        C43211de<SynthetiseResult> a = efVar.mo89281a((VideoPublishEditModel) obj, aVar, z);
        C17825i.m43740a(a, new C17824h<SynthetiseResult>() {
            public final void onFailure(Throwable th) {
                C43951l a = C43951l.m96492a();
                StringBuilder sb = new StringBuilder("synthetise failed\n");
                sb.append(C17437s.m42688b(th));
                a.mo89516a(sb.toString());
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                C43951l a = C43951l.m96492a();
                StringBuilder sb = new StringBuilder("synthetise success ");
                sb.append(synthetiseResult.outputFile);
                a.mo89516a(sb.toString());
                if (synthetiseResult.outputFile != null) {
                    C43951l a2 = C43951l.m96492a();
                    StringBuilder sb2 = new StringBuilder(" size: ");
                    sb2.append(new File(synthetiseResult.outputFile).length());
                    a2.mo89516a(sb2.toString());
                    return;
                }
                C43951l.m96492a().mo89516a("output file == null");
            }
        }, C23551l.f62672a);
        return a;
    }

    /* renamed from: a */
    public final C17832m<? extends C42421al> mo78614a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        int i;
        String str;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoPublishEditModel.isReviewVideo()) {
            linkedHashMap.put("review_video_id", videoPublishEditModel.reviewVideoId);
        }
        linkedHashMap.put("video_id", videoCreation.materialId);
        linkedHashMap.put("new_sdk", "1");
        linkedHashMap.put("mixed_type", String.valueOf(videoPublishEditModel.getStickPointType()));
        C47921gl.m103688a(videoCreation, linkedHashMap);
        int i2 = 0;
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i2 = videoPublishEditModel.videoCount;
            i = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.frames != null) {
                i2 = videoPublishEditModel.extractFramesModel.frames.size();
            } else if (!(videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null)) {
                i = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
            }
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        linkedHashMap.put("video_cnt", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        linkedHashMap.put("pic_cnt", sb2.toString());
        String str2 = "is_multi_content";
        if (i2 + i > 1) {
            str = "1";
        } else {
            str = "0";
        }
        linkedHashMap.put(str2, str);
        this.f110855i.mo89283a(videoPublishEditModel, linkedHashMap);
        this.f110855i.mo89282a((BaseShortVideoContext) videoPublishEditModel, synthetiseResult, linkedHashMap);
        C17832m a = C17825i.m43735a(C39618d.f101179t.mo74304a((String) null, linkedHashMap), IOException.class, new C43786ej(linkedHashMap), C17833n.m43743a());
        C17825i.m43740a(a, new C42420ak(), C17833n.m43743a());
        return C17825i.m43735a(a, C23459a.class, C44338p.m97117a(new C43785ei(this, obj, videoCreation, synthetiseResult)), C23551l.f62672a);
    }

    /* renamed from: a */
    public C43211de<VideoCreation> mo89286a(String str, float f, String str2, VideoCreation videoCreation, String str3, UploadSpeedInfo uploadSpeedInfo, String str4) {
        final C43852fu fuVar = ((C43846fo) videoCreation).f111026a;
        final String str5 = str4;
        final String str6 = str3;
        final float f2 = f;
        final String str7 = str;
        C437821 r0 = new C43211de<VideoCreation>("ShortVideoUploader") {
            {
                boolean z;
                try {
                    C43781eh.this.f110852f = C38949c.m86785a();
                    C43781eh.this.f110852f.setListener(new TTVideoUploaderListener() {
                        public final void onUploadVideoStage(int i, long j) {
                        }

                        public final String getStringFromExtern(int i) {
                            return str5;
                        }

                        public final int videoUploadCheckNetState(int i, int i2) {
                            return C45252b.m98738a(fuVar, "SerialUpload");
                        }

                        public final void onLog(int i, int i2, String str) {
                            C45240a.m98714a(i, str);
                        }

                        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                            if (i == 0) {
                                C43781eh.this.f110852f.close();
                                C437821.this.mo34624b(C47921gl.m103687a(tTVideoInfo));
                            } else if (i == 2) {
                                C43781eh.this.f110852f.close();
                                if (tTVideoInfo == null || tTVideoInfo.mErrcode != 30411) {
                                    C437821.this.mo34623a((Throwable) new IllegalArgumentException("upload failed."));
                                } else {
                                    C437821.this.mo34623a((Throwable) new C23459a((int) tTVideoInfo.mErrcode).setErrorMsg(C39618d.f101160a.getResources().getString(R.string.f7x)));
                                }
                            } else {
                                if (i == 1) {
                                    C437821.this.mo87842a((int) j);
                                }
                            }
                        }
                    });
                    C43781eh.this.f110852f.setAbstractListener(new TTVideoUploaderAbstractListener() {
                        public final void onEventLog(JSONObject jSONObject) {
                            if (jSONObject != null) {
                                String optString = jSONObject.optString("event", "");
                                if (!TextUtils.isEmpty(optString)) {
                                    StringBuilder sb = new StringBuilder("TTUploaderEventV2 name:");
                                    sb.append(optString);
                                    sb.append(" content:");
                                    sb.append(jSONObject.toString());
                                    C45407ay.m98968a(sb.toString());
                                    try {
                                        jSONObject.put("aweme_video_type", C43781eh.this.f111184a);
                                        jSONObject.put("aweme_upload_type", C43781eh.this.f111185b);
                                    } catch (JSONException unused) {
                                    }
                                    C47702b.f120193a.mo94985a(optString, jSONObject);
                                }
                            }
                        }
                    });
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(Integer.valueOf(69), str6);
                    C43781eh.this.f110852f.setTraceIDConfig(hashMap);
                    if (fuVar.f111081q == 1) {
                        C43781eh.this.f110852f.setEnableExternNet(fuVar.f111084t);
                        C43781eh.this.f110852f.setNewHttpProxyLoader(C39618d.f101152P.mo83104b(C40790a.TTUploaderTTNetProxyType));
                        C43781eh.this.f110852f.setTTExternLoader(new C43831fh());
                        C43781eh.this.f110852f.setEnableQuic(fuVar.f111082r);
                    }
                    C45248af afVar = new C45248af();
                    afVar.mo91538b();
                    TTVideoUploader tTVideoUploader = C43781eh.this.f110852f;
                    C43852fu fuVar = fuVar;
                    C52711k.m112240b(tTVideoUploader, "uploader");
                    C52711k.m112240b(fuVar, "videoConfig");
                    C52711k.m112240b(afVar, "uploaderServerParam");
                    tTVideoUploader.setEnableUpHost(1);
                    tTVideoUploader.setEnableServerHost(1);
                    tTVideoUploader.setEnableExternDNS(fuVar.f111075k);
                    tTVideoUploader.setAliveMaxFailTime(fuVar.f111076l);
                    tTVideoUploader.setTcpOpenTimeOutMilliSec(fuVar.f111079o);
                    TTUploadResolver.setEnableTTNetDNS(fuVar.f111077m);
                    afVar.mo91537a(fuVar);
                    TTVideoUploader tTVideoUploader2 = C43781eh.this.f110852f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(afVar.mo91535a());
                    sb.append(C39618d.f101152P.mo83107e(C40790a.UploadExtraParams));
                    tTVideoUploader2.setServerParameter(sb.toString());
                    C43833fi.m96265a(C43781eh.this.f110852f, fuVar.f111074j);
                    C45301a.m98772a();
                    C45247ae.m98723a();
                    C43781eh.this.f110852f.setEnableLogCallBack(fuVar.f111085u);
                    C43781eh.this.f110852f.setEvStateEnable(fuVar.f111088x);
                    C43781eh.this.f110852f.setEnablePostMethod(fuVar.f111078n);
                    C43781eh.this.f110852f.setMaxFailTime(fuVar.f111072h);
                    C43781eh.this.f110852f.setSliceSize(fuVar.f111070f);
                    C43781eh.this.f110852f.setFileUploadDomain(fuVar.f111066b);
                    C43781eh.this.f110852f.setVideoUploadDomain(fuVar.f111067c);
                    C43781eh.this.f110852f.setSliceTimeout(fuVar.f111068d);
                    C43781eh.this.f110852f.setSliceReTryCount(fuVar.f111069e);
                    C43781eh.this.f110852f.setPoster(f2);
                    C43781eh.this.f110852f.setPathName(str7);
                    TTVideoUploader tTVideoUploader3 = C43781eh.this.f110852f;
                    int i = 0;
                    if (fuVar.f111086v == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tTVideoUploader3.setOpenResume(z);
                    C43781eh.this.f110852f.setFileRetryCount(fuVar.f111071g);
                    if (C43781eh.this.f110854h > 0) {
                        C43781eh.this.f110852f.setPreUploadEncryptionMode(C43781eh.this.f110854h);
                        if (C43781eh.this.f110853g) {
                            C43781eh.this.f110852f.allowMergeUpload();
                        }
                    }
                    C43781eh.this.f110852f.setUserKey(fuVar.f111065a);
                    C43781eh.this.f110852f.setAuthorization(fuVar.f111073i);
                    C43781eh.this.f110852f.setSocketNum(1);
                    C43781eh.this.f110852f.setEnableMutiTask(fuVar.f111083s);
                    int b = C39618d.f101151O.mo83118b(C40796a.MaxFansCount);
                    if (b > 0) {
                        C22055c e = C39618d.f101183x.mo74285e();
                        if (e != null) {
                            i = e.mo46165i();
                        }
                        TreeMap treeMap = new TreeMap();
                        String str = "priority";
                        double d = (double) i;
                        Double.isNaN(d);
                        double d2 = d * 1.0d;
                        double d3 = (double) b;
                        Double.isNaN(d3);
                        treeMap.put(str, Long.valueOf(Math.min(Math.round((d2 / d3) * 100.0d), 100)));
                        C43781eh.this.f110852f.setCustomConfig(treeMap);
                    }
                    C47955u.m103766a();
                    boolean b2 = C41623i.m91496b();
                    C43781eh.this.f110852f.setOpenBoe(b2);
                    StringBuilder sb2 = new StringBuilder("ShortVideoFutureFactoryTTUploader enableBoe:");
                    sb2.append(b2);
                    C45407ay.m98968a(sb2.toString());
                    C43781eh.this.f110852f.setResponeTimeOut(C39618d.f101152P.mo83104b(C40790a.TTUploaderResponseTimeOut));
                    C43781eh.this.f110852f.start();
                } catch (Exception e2) {
                    C43781eh.this.f110852f.close();
                    throw e2;
                } catch (Exception e3) {
                    mo34623a((Throwable) e3);
                }
            }
        };
        C43849fr frVar = new C43849fr(str, str2, uploadSpeedInfo, this.f111184a, this.f111185b);
        C17825i.m43740a(r0, frVar, C23551l.f62672a);
        C17825i.m43740a(r0, new C43850fs(str), C23551l.f62672a);
        return r0;
    }
}
