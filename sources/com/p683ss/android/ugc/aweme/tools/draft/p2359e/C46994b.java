package com.p683ss.android.ugc.aweme.tools.draft.p2359e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.draft.C29050a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43447bb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.C43687c;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.tools.draft.C47017s;
import com.p683ss.android.ugc.aweme.tools.draft.C47019u;
import com.p683ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49937f.C49938a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.e.b */
public final class C46994b implements IDraftService {

    /* renamed from: a */
    private static IDraftService f118702a;

    /* renamed from: b */
    private boolean f118703b;

    /* renamed from: c */
    private List<DraftListener> f118704c = new ArrayList();

    public final boolean getPublishFormDraftCancel() {
        return this.f118703b;
    }

    public final ExecutorService getDraftExecutor() {
        return C46797a.m101642a();
    }

    public final List<C29059c> queryAllDraftList() {
        return C47017s.m102091a().mo94311d();
    }

    public final List<C29059c> queryList() {
        return C47017s.m102091a().mo94307b();
    }

    public final int queryMyDraftCount() {
        return C47017s.m102091a().mo94308c();
    }

    /* renamed from: a */
    public static IDraftService m102064a() {
        if (f118702a == null) {
            synchronized (C47017s.class) {
                if (f118702a == null) {
                    f118702a = new C46994b();
                }
            }
        }
        return f118702a;
    }

    public final void notifyDraftClean() {
        for (DraftListener onDraftClean : this.f118704c) {
            onDraftClean.onDraftClean();
        }
    }

    public final boolean isPoiOrderRate() {
        String str = C43306a.m94990b().poiContextStr;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(new JSONObject(str).getString("mPoiRateId"))) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public final void setPublishFormDraftCancel(boolean z) {
        this.f118703b = z;
    }

    public final void unregisterDraftListener(DraftListener draftListener) {
        this.f118704c.remove(draftListener);
    }

    public final String calculateDraftDir(C29059c cVar) {
        if (cVar == null) {
            return null;
        }
        return C23908c.m58638a(cVar);
    }

    public final C29059c queryDraft(String str) {
        return C47017s.m102091a().mo94306b(str);
    }

    public final C29059c queryDraftWithUserId(String str) {
        return C47017s.m102091a().mo94310c(str);
    }

    public final List<C29059c> queryListWithFilter(C29050a aVar) {
        return C47017s.m102091a().mo94303a(aVar);
    }

    public final void registerDraftListener(DraftListener draftListener) {
        if (!this.f118704c.contains(draftListener)) {
            this.f118704c.add(draftListener);
        }
    }

    public final long save(C29059c cVar) {
        return C47017s.m102091a().mo94309c(cVar);
    }

    public final void deleteDraftForPoiRate(C29059c cVar) {
        C39630m.m88234a().mo58615m().mo74138a(cVar.mo58774ak());
        C47017s.m102091a().mo94312d(cVar);
        C29061d.m68499d(cVar);
        notifyDraftDelete(cVar);
    }

    public final void enterDraftBox(Activity activity) {
        C39629l.m88232a().mo58584o().mo64333c().mo64345a();
        DraftBoxActivity.m101985a(activity);
    }

    public final void notifyDraftDelete(C29059c cVar) {
        if (this.f118704c != null) {
            for (int size = this.f118704c.size() - 1; size >= 0; size--) {
                ((DraftListener) this.f118704c.get(size)).onDraftDelete(cVar);
            }
        }
    }

    public final void notifyDraftUpdate(C29059c cVar) {
        for (DraftListener onDraftUpdate : this.f118704c) {
            onDraftUpdate.onDraftUpdate(cVar);
        }
    }

    public final int queryMyDraftCount(C29050a aVar) {
        C47017s a = C47017s.m102091a();
        if (aVar == null) {
            return a.mo94308c();
        }
        return a.mo94303a(aVar).size();
    }

    /* renamed from: a */
    private static String m102065a(C29059c cVar) {
        String J = cVar.mo58733J();
        if (TextUtils.isEmpty(J)) {
            return "";
        }
        try {
            return new JSONObject(J).getString("mPoiRateId");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void delete(C29059c cVar) {
        C47017s.m102091a().mo94312d(cVar);
        C39630m.m88234a().mo58606d().mo80661a().mo80664a(cVar);
        C52711k.m112240b(cVar, "draft");
        if (cVar.mo58741R() != null) {
            C0013i.m16a((Callable<TResult>) new C49938a<TResult>(cVar));
        }
        if (cVar != null && cVar.mo58745V()) {
            C0013i.m16a((Callable<TResult>) C43687c.f110624a);
        }
    }

    public final C29059c getPoiRateDraft(String str) {
        List<C29059c> d = C47017s.m102091a().mo94311d();
        if (C9376b.m18558a((Collection<T>) d)) {
            return null;
        }
        for (C29059c cVar : d) {
            if (TextUtils.equals(str, m102065a(cVar))) {
                return cVar;
            }
        }
        return null;
    }

    public final C29059c convertToDraft(PhotoMovieContext photoMovieContext) {
        C29059c cVar = new C29059c();
        if (C9431p.m18664a(photoMovieContext.mFinalVideoTmpPath)) {
            photoMovieContext.mFinalVideoTmpPath = C43307ea.m94996a("-concat-v");
        }
        cVar.f76145c = photoMovieContext;
        cVar.mo58752a(C39629l.m88232a().mo58573d().mo80729a());
        if (photoMovieContext.mMusic != null) {
            cVar.f76147e = photoMovieContext.mMusic;
        }
        cVar.mo58751a(photoMovieContext.mCoverStartTm);
        cVar.f76149g = photoMovieContext.mMusicPath;
        cVar.f76129G = System.currentTimeMillis();
        cVar.f76128F = C39629l.m88232a().mo58593x().mo74283c();
        cVar.mo58755a(C39630m.m88234a().mo58621s().mo74229a(photoMovieContext.poiId));
        cVar.mo58754a(photoMovieContext.mSaveModel);
        C46806g.m101653a(C44309n.m97057a((BaseShortVideoContext) photoMovieContext), C44309n.m97054a(cVar.f76142T), C46804e.PUBLISH, C46804e.DRAFT);
        cVar.f76142T.f76112p = photoMovieContext.poiData;
        if (photoMovieContext.draftEditTransferModel != null) {
            cVar.f76146d = photoMovieContext.getDraftPrimaryKey();
        }
        if (C39618d.f101152P.mo83104b(C40790a.EffectSDKInfoStickerUseAmazing) == 1) {
            cVar.f76142T.f76062aB = false;
        }
        photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo58774ak(), null);
        return cVar;
    }

    public final void editDraft(Context context, C29059c cVar) {
        if (context != null && cVar != null) {
            C47019u.m102111a(context, cVar, 1, System.currentTimeMillis());
        }
    }

    public final void enterDraftBoxWithArgs(Activity activity, Bundle bundle) {
        C39629l.m88232a().mo58584o().mo64333c().mo64345a();
        DraftBoxActivity.m101986a(activity, bundle);
    }

    public final void notifyDraftCheckedChanged(C29059c cVar, boolean z) {
        for (DraftListener onDraftCheckedChanged : this.f118704c) {
            onDraftCheckedChanged.onDraftCheckedChanged(cVar, z);
        }
    }

    public final void saveDraftForLocalFile(String str, Intent intent, DraftSaveListener draftSaveListener) {
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        C43447bb bbVar = new C43447bb("DraftService");
        Intent intent2 = new Intent();
        intent2.putExtra("creation_id", UUID.randomUUID().toString());
        intent2.putExtra("shoot_way", intent.getStringExtra("shoot_way"));
        C43447bb.m95226a(videoPublishEditModel, intent2, str);
        LivePublishModel livePublishModel = (LivePublishModel) intent.getSerializableExtra("live_publish_model");
        if (livePublishModel != null) {
            videoPublishEditModel.livePublishModel = livePublishModel;
            C43447bb.m95229b(videoPublishEditModel);
        }
        C29059c a = bbVar.mo88377a(videoPublishEditModel);
        a.f76129G = System.currentTimeMillis();
        long save = save(a);
        m102064a().notifyDraftUpdate(a);
        if (save >= 0) {
            C43668b.m95938a(videoPublishEditModel.getPreviewInfo(), a, (C52670a<C52860x>) new C46995c<C52860x>(a));
            draftSaveListener.onDraftSaveSuccess();
        } else {
            draftSaveListener.onDraftSaveFailed();
        }
        C39629l.m88232a().mo58573d().mo80732a(a, false);
    }
}
