package com.p683ss.android.ugc.aweme.services.external;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.services.external.IAVDraftService */
public interface IAVDraftService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.IAVDraftService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void deleteDraft(int i, C29059c cVar);

    List<C29059c> draftList(boolean z);

    void editDraft(Context context, C29059c cVar);

    ExecutorService executor();

    void loadAwemeDraftThumbCover(C29059c cVar, OnVideoCoverCallback onVideoCoverCallback);

    C29059c queryDraft(int i, String str);

    void registerListener(DraftListener draftListener);

    Dialog restoreDialog(Activity activity, OnClickListener onClickListener, OnClickListener onClickListener2);

    long saveDraft(C29059c cVar);

    void saveDraftForLocalFile(String str, Intent intent, DraftSaveListener draftSaveListener);

    void unregisterListener(DraftListener draftListener);
}
