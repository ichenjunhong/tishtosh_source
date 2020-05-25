package com.p683ss.android.ugc.aweme.services.draft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.draft.C29050a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService */
public interface IDraftService {

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftListener */
    public interface DraftListener {
        void onDraftCheckedChanged(C29059c cVar, boolean z);

        void onDraftClean();

        void onDraftDelete(C29059c cVar);

        void onDraftUpdate(C29059c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftListenerAdapter */
    public static class DraftListenerAdapter implements DraftListener {
        public void onDraftCheckedChanged(C29059c cVar, boolean z) {
        }

        public void onDraftClean() {
        }

        public void onDraftDelete(C29059c cVar) {
        }

        public void onDraftUpdate(C29059c cVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftSaveListener */
    public interface DraftSaveListener {
        void onDraftSaveFailed();

        void onDraftSaveSuccess();
    }

    String calculateDraftDir(C29059c cVar);

    C29059c convertToDraft(PhotoMovieContext photoMovieContext);

    void delete(C29059c cVar);

    void deleteDraftForPoiRate(C29059c cVar);

    void editDraft(Context context, C29059c cVar);

    void enterDraftBox(Activity activity);

    void enterDraftBoxWithArgs(Activity activity, Bundle bundle);

    ExecutorService getDraftExecutor();

    C29059c getPoiRateDraft(String str);

    boolean getPublishFormDraftCancel();

    boolean isPoiOrderRate();

    void notifyDraftCheckedChanged(C29059c cVar, boolean z);

    void notifyDraftClean();

    void notifyDraftDelete(C29059c cVar);

    void notifyDraftUpdate(C29059c cVar);

    List<C29059c> queryAllDraftList();

    C29059c queryDraft(String str);

    C29059c queryDraftWithUserId(String str);

    List<C29059c> queryList();

    List<C29059c> queryListWithFilter(C29050a aVar);

    int queryMyDraftCount();

    int queryMyDraftCount(C29050a aVar);

    void registerDraftListener(DraftListener draftListener);

    long save(C29059c cVar);

    void saveDraftForLocalFile(String str, Intent intent, DraftSaveListener draftSaveListener);

    void setPublishFormDraftCancel(boolean z);

    void unregisterDraftListener(DraftListener draftListener);
}
