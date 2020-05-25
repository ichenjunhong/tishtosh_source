package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29848a.C29851a;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29938a;

/* renamed from: com.ss.android.ugc.aweme.fe.method.b */
public final /* synthetic */ class C29858b implements OnCancelListener {

    /* renamed from: a */
    private final C29851a f77951a;

    public C29858b(C29851a aVar) {
        this.f77951a = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C29851a aVar = this.f77951a;
        if (aVar.f77932b.get() != null) {
            ((C29938a) aVar.f77932b.get()).mo60080a();
        }
    }
}
