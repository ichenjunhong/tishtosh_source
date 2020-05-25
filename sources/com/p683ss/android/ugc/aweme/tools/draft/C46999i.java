package com.p683ss.android.ugc.aweme.tools.draft;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.i */
final /* synthetic */ class C46999i implements OnCheckedChangeListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f118709a;

    C46999i(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f118709a = awemeDraftViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AwemeDraftViewHolder awemeDraftViewHolder = this.f118709a;
        ((C29059c) awemeDraftViewHolder.f70665k).f76165w = z;
        C46994b.m102064a().notifyDraftCheckedChanged((C29059c) awemeDraftViewHolder.f70665k, z);
    }
}
