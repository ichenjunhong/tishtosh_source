package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.JobIntentService;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.tools.extract.upload.C47057a;
import com.p683ss.android.ugc.aweme.tools.extract.upload.C47058b;
import com.p683ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cb */
final /* synthetic */ class C42486cb implements C0011g {

    /* renamed from: a */
    private final C42481bz f107438a;

    /* renamed from: b */
    private final C29059c f107439b;

    /* renamed from: c */
    private final Object f107440c;

    /* renamed from: d */
    private final String f107441d;

    /* renamed from: e */
    private final String f107442e;

    /* renamed from: f */
    private final Context f107443f;

    /* renamed from: g */
    private final int f107444g;

    C42486cb(C42481bz bzVar, C29059c cVar, Object obj, String str, String str2, Context context, int i) {
        this.f107438a = bzVar;
        this.f107439b = cVar;
        this.f107440c = obj;
        this.f107441d = str;
        this.f107442e = str2;
        this.f107443f = context;
        this.f107444g = i;
    }

    public final Object then(C0013i iVar) {
        ExtractFramesModel extractFramesModel;
        String str;
        C42481bz bzVar = this.f107438a;
        C29059c cVar = this.f107439b;
        Object obj = this.f107440c;
        String str2 = this.f107441d;
        String str3 = this.f107442e;
        Context context = this.f107443f;
        int i = this.f107444g;
        C42481bz.m93332a(cVar, obj);
        if (iVar.mo31c() || iVar.mo33d()) {
            return null;
        }
        if (obj instanceof PhotoMovieContext) {
            extractFramesModel = ((PhotoMovieContext) obj).extractFramesModel;
        } else {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            extractFramesModel = videoPublishEditModel.extractFramesModel;
            if (extractFramesModel != null) {
                extractFramesModel.setStickerIds(videoPublishEditModel.mStickerID);
            }
        }
        ExtractFramesModel extractFramesModel2 = extractFramesModel;
        if (extractFramesModel2 != null) {
            C47058b bVar = new C47058b(str2, str3, "", "", extractFramesModel2, System.currentTimeMillis());
            C47057a.m102179a(context).mo94347a(bVar);
        }
        Intent intent = new Intent();
        String str4 = "authkey";
        if (i == 1) {
            str = C39618d.f101151O.mo83121e(C40796a.SdkV4AuthKey);
        } else {
            str = C39618d.f101151O.mo83121e(C40796a.StorySdkV4AuthKey);
        }
        intent.putExtra(str4, str);
        JobIntentService.enqueueWork(context.getApplicationContext(), VideoFramesUploadService.class, 3009, intent);
        return null;
    }
}
