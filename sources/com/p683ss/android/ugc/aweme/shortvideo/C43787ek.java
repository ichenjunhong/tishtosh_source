package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39544ae;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.C44810b;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ek */
public final class C43787ek implements C44334o<C42421al> {

    /* renamed from: a */
    private final int f110870a;

    /* renamed from: b */
    private final Object f110871b;

    public final void onProgressUpdate(int i, boolean z) {
    }

    public final void onSynthetiseSuccess(String str) {
    }

    public final void onError(C43856fy fyVar) {
        String str;
        C52711k.m112240b(fyVar, "e");
        if (fyVar.isRecover()) {
            int i = this.f110870a;
            if (i == 0) {
                Object obj = this.f110871b;
                if (obj != null) {
                    str = ((VideoPublishEditModel) obj).getDraftPrimaryKey();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                }
            } else if (i != 6) {
                str = "";
            } else {
                Object obj2 = this.f110871b;
                if (obj2 != null) {
                    str = ((PhotoMovieContext) obj2).getDraftPrimaryKey();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
                }
            }
            if (!TextUtils.isEmpty(str)) {
                C23763a.m58318a(str);
            }
        }
    }

    public C43787ek(int i, Object obj) {
        C52711k.m112240b(obj, "args");
        this.f110870a = i;
        this.f110871b = obj;
    }

    public final void onSuccess(C42421al alVar, boolean z) {
        AVUploadSaveModel aVUploadSaveModel;
        CharSequence charSequence;
        C52711k.m112240b(alVar, "response");
        StringBuilder sb = new StringBuilder("args is ");
        sb.append(this.f110871b);
        C32458a.m75144a(sb.toString());
        if (this.f110870a == 0) {
            Object obj = this.f110871b;
            if (obj != null) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                charSequence = videoPublishEditModel.getLocalFinalPath();
                aVUploadSaveModel = videoPublishEditModel.mSaveModel;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            }
        } else if (this.f110870a == 6) {
            Object obj2 = this.f110871b;
            if (obj2 != null) {
                PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj2;
                charSequence = photoMovieContext.getLocalTempPath();
                aVUploadSaveModel = photoMovieContext.mSaveModel;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
            }
        } else {
            aVUploadSaveModel = null;
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            alVar.mSaveModel = aVUploadSaveModel;
            C48016e.m103954e(C43308eb.f109498k);
        }
        int i = this.f110870a;
        if (i == 0) {
            Object obj3 = this.f110871b;
            if (!(obj3 instanceof VideoPublishEditModel)) {
                obj3 = null;
            }
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj3;
            if (videoPublishEditModel2 != null) {
                IDraftService a = C46994b.m102064a();
                C29059c queryDraft = a.queryDraft(videoPublishEditModel2.getDraftPrimaryKey());
                if (queryDraft != null) {
                    C39544ae aeVar = C39618d.f101141E;
                    String ak = queryDraft.mo58774ak();
                    C52711k.m112236a((Object) ak, "draft.draftPrimaryKey");
                    aeVar.mo74138a(ak);
                    a.delete(queryDraft);
                    a.notifyDraftDelete(queryDraft);
                    C42387a a2 = C39618d.f101140D.mo74287a(alVar);
                    if (a2 != null) {
                        new C43208db();
                        C43208db.m94806a(C39618d.f101160a, a2.aid, alVar.materialId, this.f110871b);
                        new C42481bz().mo86608a(C39618d.f101160a, this.f110871b, queryDraft, a2.aid, alVar.materialId);
                        C44810b bVar = SubtitleModule.f113311ah;
                        String str = alVar.materialId;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = a2.aid;
                        C52711k.m112236a((Object) str2, "avAweme.aid");
                        bVar.mo90918a(str, str2);
                        if (videoPublishEditModel2.isMultiVideoEdit()) {
                            C43684d.m95972a();
                        }
                    }
                }
            }
        } else if (i != 6) {
            C18778a.m45854e("ShortVideoPublishCallback", "unknown video type");
        } else {
            Object obj4 = this.f110871b;
            if (!(obj4 instanceof PhotoMovieContext)) {
                obj4 = null;
            }
            PhotoMovieContext photoMovieContext2 = (PhotoMovieContext) obj4;
            if (photoMovieContext2 != null) {
                IDraftService a3 = C46994b.m102064a();
                C29059c queryDraft2 = a3.queryDraft(photoMovieContext2.getDraftPrimaryKey());
                if (queryDraft2 != null) {
                    C39544ae aeVar2 = C39618d.f101141E;
                    String ak2 = queryDraft2.mo58774ak();
                    C52711k.m112236a((Object) ak2, "draft.draftPrimaryKey");
                    aeVar2.mo74138a(ak2);
                    a3.delete(queryDraft2);
                    a3.notifyDraftDelete(queryDraft2);
                    C42387a a4 = C39618d.f101140D.mo74287a(alVar);
                    if (a4 != null) {
                        new C42481bz().mo86608a(C39618d.f101160a, this.f110871b, queryDraft2, a4.aid, alVar.materialId);
                    }
                }
            }
        }
    }
}
