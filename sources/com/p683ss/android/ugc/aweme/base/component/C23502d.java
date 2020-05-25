package com.p683ss.android.ugc.aweme.base.component;

import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.share.C41985as;
import com.p683ss.android.ugc.aweme.share.C41987at.C41988a;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;

/* renamed from: com.ss.android.ugc.aweme.base.component.d */
final /* synthetic */ class C23502d implements OnDismissListener {

    /* renamed from: a */
    private final C43891e f62592a;

    /* renamed from: b */
    private final C41985as f62593b;

    /* renamed from: c */
    private final AVUploadSaveModel f62594c;

    /* renamed from: d */
    private final AbsActivity f62595d;

    C23502d(C43891e eVar, C41985as asVar, AVUploadSaveModel aVUploadSaveModel, AbsActivity absActivity) {
        this.f62592a = eVar;
        this.f62593b = asVar;
        this.f62594c = aVUploadSaveModel;
        this.f62595d = absActivity;
    }

    public final void onDismiss() {
        C43891e eVar = this.f62592a;
        C41985as asVar = this.f62593b;
        AVUploadSaveModel aVUploadSaveModel = this.f62594c;
        C41988a.m91951a(((CreateAwemeResponse) eVar.f111154h).aweme, asVar, aVUploadSaveModel.getLocalFinalPath(), this.f62595d);
    }
}
