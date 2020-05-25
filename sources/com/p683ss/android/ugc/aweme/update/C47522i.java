package com.p683ss.android.ugc.aweme.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.uikit.base.C11086d;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.update.i */
public final class C47522i implements C9382a {

    /* renamed from: a */
    public final Context f119902a;

    /* renamed from: b */
    public final C9381g f119903b;

    /* renamed from: c */
    public C47530m f119904c;

    /* renamed from: d */
    public WeakReference<C11104b> f119905d;

    /* renamed from: e */
    WeakReference<C11104b> f119906e;

    /* renamed from: f */
    OnClickListener f119907f;

    /* renamed from: g */
    private final C11086d f119908g;

    /* renamed from: h */
    private final AwemeAppData f119909h;

    /* renamed from: i */
    private final C47526a f119910i;

    /* renamed from: com.ss.android.ugc.aweme.update.i$a */
    public interface C47526a {
    }

    public final void handleMsg(Message message) {
        C11104b bVar;
        C11104b bVar2;
        if (this.f119908g.isViewValid()) {
            if (this.f119905d != null) {
                bVar = (C11104b) this.f119905d.get();
            } else {
                bVar = null;
            }
            if (this.f119906e != null) {
                bVar2 = (C11104b) this.f119906e.get();
            } else {
                bVar2 = null;
            }
            if (bVar != null) {
                bVar.dismiss();
            }
            if (bVar2 != null) {
                bVar2.dismiss();
            }
            switch (message.what) {
                case 1:
                    new C10643a(this.f119902a).mo18885a((int) R.string.dzz).mo18899b((int) R.string.cfw).mo18886a((int) R.string.ah2, (OnClickListener) null).mo18897a().mo18883c();
                    return;
                case 2:
                    new C10643a(this.f119902a).mo18885a((int) R.string.dzz).mo18899b((int) R.string.ci7).mo18886a((int) R.string.ah2, (OnClickListener) null).mo18897a().mo18883c();
                    if (this.f119910i != null) {
                        return;
                    }
                    break;
                case 3:
                    if (!(this.f119904c == null || this.f119902a == null)) {
                        this.f119904c.mo94831a(this.f119902a, "more_tab", "update_version_confirm");
                    }
                    if (this.f119910i != null) {
                        return;
                    }
                    break;
                case 4:
                    C9432q.m18673a(this.f119902a, 2131952872, (int) R.string.e0t);
                    break;
            }
        }
    }

    public C47522i(Context context, C11086d dVar) {
        this(context, dVar, null);
    }

    private C47522i(Context context, C11086d dVar, C47526a aVar) {
        this.f119903b = new C9381g(this);
        this.f119905d = null;
        this.f119906e = null;
        this.f119907f = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C47522i iVar = C47522i.this;
                iVar.f119906e = new WeakReference<>(new C11105a(iVar.f119902a).mo20135a((int) R.string.dzz).mo20144b((int) R.string.a3i).mo20141a(false).mo20148b());
                new C9393e() {
                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        new C18933b(C47522i.this.f119902a).mo38804b();
                        if (System.currentTimeMillis() - currentTimeMillis < 500) {
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException unused) {
                            }
                        }
                        C47522i.this.f119903b.sendEmptyMessage(4);
                    }
                }.start();
            }
        };
        this.f119902a = context;
        this.f119909h = AwemeAppData.m47851a();
        this.f119908g = dVar;
        this.f119910i = null;
    }
}
