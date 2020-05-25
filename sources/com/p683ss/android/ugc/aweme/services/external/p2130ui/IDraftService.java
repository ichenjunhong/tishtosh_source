package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IDraftService */
public interface IDraftService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.IDraftService$OnGetRecoverDraftCallback */
    public interface OnGetRecoverDraftCallback {
        void onFail();

        void onSuccess(C29059c cVar);
    }

    void enterDraftBoxActivity(Context context, Bundle bundle);

    void enterDraftEditActivity(Context context, C29059c cVar, List<? extends C42482c> list);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    void removeRecoverDraft();
}
