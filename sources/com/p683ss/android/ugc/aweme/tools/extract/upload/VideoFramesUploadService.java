package com.p683ss.android.ugc.aweme.tools.extract.upload;

import android.content.Intent;
import android.database.Cursor;
import android.support.p030v4.app.SafeJobIntentService;
import android.text.TextUtils;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.plugin.C38949c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43847fp;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45248af;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.ugc.tools.utils.C50205i;
import com.p683ss.ttuploader.TTImageInfo;
import com.p683ss.ttuploader.TTImageUploader;
import com.p683ss.ttuploader.TTImageUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService */
public class VideoFramesUploadService extends SafeJobIntentService {

    /* renamed from: a */
    public static final String f118817a = "VideoFramesUploadService";

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService$FramesUploadApi */
    interface FramesUploadApi {
        @C53084o(mo110612a = "/aweme/v2/aweme/vframe/update/")
        @C53074e
        C0013i<BaseResponse> uploadFrame(@C53072c(mo110600a = "aweme_id") String str, @C53072c(mo110600a = "video_id") String str2, @C53072c(mo110600a = "vframe_uri") String str3);

        @C53084o(mo110612a = "/aweme/v2/aweme/vframe/update/")
        @C53074e
        C0013i<BaseResponse> uploadFrame(@C53072c(mo110600a = "aweme_id") String str, @C53072c(mo110600a = "video_id") String str2, @C53072c(mo110600a = "vframe_uri") String str3, @C53072c(mo110600a = "stickers") String str4);
    }

    public void onHandleWork(Intent intent) {
        String str;
        C0013i iVar;
        final FramesUploadApi framesUploadApi = (FramesUploadApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI()).create(FramesUploadApi.class);
        final C47057a a = C47057a.m102179a(getApplicationContext());
        if (intent != null) {
            str = intent.getStringExtra("authkey");
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            final C43846fo foVar = (C43846fo) new C17978g().mo34900d().mo34884a(str, C43846fo.class);
            if (foVar != null && foVar.f111029d != null) {
                ArrayList arrayList = new ArrayList();
                Cursor query = a.getReadableDatabase().query("frames_table", new String[]{"aweme_id", "video_id", "zip_uri", "zip_path", "extract_model", "update_time"}, null, null, null, null, null);
                while (query.moveToNext()) {
                    C47058b bVar = new C47058b(query.getString(query.getColumnIndex("aweme_id")), query.getString(query.getColumnIndex("video_id")), query.getString(query.getColumnIndex("zip_uri")), query.getString(query.getColumnIndex("zip_path")), ExtractFramesModel.string2Model(query.getString(query.getColumnIndex("extract_model"))), query.getLong(query.getColumnIndex("update_time")));
                    arrayList.add(bVar);
                }
                query.close();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        final C47058b bVar2 = (C47058b) it.next();
                        if (System.currentTimeMillis() - bVar2.f118839f > TimeUnit.DAYS.toMillis(1)) {
                            it.remove();
                            a.mo94348a(bVar2.f118834a);
                            if (bVar2.f118838e != null) {
                                C48016e.m103954e(bVar2.f118838e.extractFramesDir);
                                C48016e.m103947c(bVar2.f118838e.extractFramesDir);
                            }
                        } else {
                            if (bVar2 == null) {
                                iVar = C0013i.m13a((Exception) new IllegalStateException("the upload model is null"));
                            } else {
                                if (TextUtils.isEmpty(bVar2.f118837d) || !new File(bVar2.f118837d).exists()) {
                                    List allFrames = bVar2.f118838e.getAllFrames();
                                    if (bVar2.f118838e == null || allFrames.isEmpty()) {
                                        iVar = C0013i.m13a((Exception) new IllegalStateException("the upload frames is empty"));
                                    } else {
                                        bVar2.f118837d = C50205i.m108367a(bVar2.f118838e.extractFramesDir, (List<String>) new ArrayList<String>(allFrames));
                                        if (bVar2.f118837d == null || !C48016e.m103944b(bVar2.f118837d)) {
                                            iVar = C0013i.m13a((Exception) new IllegalStateException("the upload zipPath is empty"));
                                        }
                                    }
                                }
                                iVar = C0013i.m14a(bVar2);
                            }
                            try {
                                iVar.mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<C47058b, C0013i<C47058b>>() {
                                    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                                        if (iVar.mo33d()) {
                                            return C0013i.m13a(iVar.mo35f());
                                        }
                                        a.mo94347a((C47058b) iVar.mo34e());
                                        return VideoFramesUploadService.this.mo94344a(bVar2, foVar.f111029d);
                                    }
                                }).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<C47058b, C0013i<BaseResponse>>() {
                                    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                                        if (iVar.mo33d()) {
                                            return C0013i.m13a(iVar.mo35f());
                                        }
                                        C47058b bVar = (C47058b) iVar.mo34e();
                                        a.mo94347a(bVar);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(VideoFramesUploadService.f118817a);
                                        sb.append(" upload zip succeed,uri:");
                                        sb.append(bVar.f118836c);
                                        C50203g.m108358a(sb.toString());
                                        if (bVar == null || bVar.f118838e == null || bVar.f118838e.getStickerIds() == null) {
                                            return framesUploadApi.uploadFrame(bVar.f118834a, bVar.f118835b, bVar.f118836c);
                                        }
                                        return framesUploadApi.uploadFrame(bVar.f118834a, bVar.f118835b, bVar.f118836c, bVar.f118838e.getStickerIds());
                                    }
                                }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<BaseResponse, Object>() {
                                    public final Object then(C0013i<BaseResponse> iVar) {
                                        if (iVar.mo33d()) {
                                            return null;
                                        }
                                        a.mo94348a(bVar2.f118834a);
                                        C48016e.m103954e(bVar2.f118838e.extractFramesDir);
                                        C48016e.m103947c(bVar2.f118838e.extractFramesDir);
                                        return null;
                                    }
                                }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Object, Object>() {
                                    public final Object then(C0013i<Object> iVar) {
                                        return iVar.mo33d() ? null : null;
                                    }
                                }).mo36g();
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C0013i<C47058b> mo94344a(final C47058b bVar, C43847fp fpVar) {
        final TTImageUploader b;
        if (!TextUtils.isEmpty(bVar.f118836c)) {
            return C0013i.m14a(bVar);
        }
        final C0027j jVar = new C0027j();
        try {
            b = C38949c.m86786b();
            b.setListener(new TTImageUploaderListener() {
                public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
                    if (i == 3) {
                        b.close();
                        bVar.f118836c = tTImageInfo.mImageUri;
                        jVar.mo47b(bVar);
                        return;
                    }
                    if (i == 4) {
                        b.close();
                        jVar.mo46b((Exception) new IllegalStateException("upload zip file failed"));
                    }
                }
            });
            C52711k.m112240b(b, "uploader");
            C52711k.m112240b(fpVar, "config");
            C45248af afVar = new C45248af();
            afVar.mo91536a(fpVar);
            b.setServerParameter(afVar.mo91535a());
            b.setSliceSize(fpVar.f111035f);
            b.setFileUploadDomain(fpVar.f111031b);
            b.setImageUploadDomain(fpVar.f111032c);
            b.setSliceTimeout(fpVar.f111036g);
            b.setSliceReTryCount(fpVar.f111037h);
            int i = 1;
            b.setFilePath(1, new String[]{bVar.f118837d});
            if (fpVar.f111033d > 0) {
                i = fpVar.f111033d;
            }
            b.setFileRetryCount(i);
            b.setUserKey(fpVar.f111030a);
            b.setEnableHttps(fpVar.f111039j);
            b.setAuthorization(fpVar.f111038i);
            b.start();
        } catch (Exception e) {
            b.close();
            throw e;
        } catch (Throwable th) {
            jVar.mo46b(new Exception(th));
        }
        return jVar.f77a;
    }
}
