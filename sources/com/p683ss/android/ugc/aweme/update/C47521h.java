package com.p683ss.android.ugc.aweme.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.update.h */
public final class C47521h implements C47530m {

    /* renamed from: b */
    private UpdateHelper f119901b = UpdateHelper.m102902a();

    /* renamed from: a */
    public final boolean mo94832a() {
        return this.f119901b.mo94812t();
    }

    /* renamed from: b */
    public final boolean mo94833b() {
        return this.f119901b.mo94802i();
    }

    /* renamed from: c */
    public final boolean mo94834c() {
        return this.f119901b.mo94800g();
    }

    /* renamed from: a */
    public final void mo94831a(Context context, String str, String str2) {
        UpdateHelper updateHelper = this.f119901b;
        if (updateHelper.mo94802i()) {
            String a = UpdateHelper.m102903a(updateHelper.mo94799f());
            C475042 r0 = new OnClickListener(str, context, str2, null) {

                /* renamed from: a */
                final /* synthetic */ String f119867a;

                /* renamed from: b */
                final /* synthetic */ Context f119868b;

                /* renamed from: c */
                final /* synthetic */ String f119869c;

                /* renamed from: d */
                final /* synthetic */ String f119870d;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (UpdateHelper.this.mo94802i()) {
                        C47512a.m102941a(true);
                        UpdateHelper.this.mo94795b();
                        if (this.f119867a != null) {
                            C18898c.m46009a(this.f119868b, this.f119867a, this.f119869c);
                        }
                        File r = UpdateHelper.this.mo94811r();
                        if (r != null) {
                            UpdateHelper.this.mo94796c();
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.addFlags(1);
                            intent.setDataAndType(C19547d.m47838a(this.f119868b, r), "application/vnd.android.package-archive");
                            this.f119868b.startActivity(intent);
                        } else {
                            UpdateHelper.this.mo94815w();
                        }
                        if (!TextUtils.isEmpty(this.f119870d)) {
                            C41941ab.m91895b(UpdateHelper.this.f119844e, this.f119870d);
                            C41941ab.m91891a(UpdateHelper.this.f119844e, this.f119870d);
                        }
                    }
                }

                {
                    this.f119867a = r2;
                    this.f119868b = r3;
                    this.f119869c = r4;
                    this.f119870d = r5;
                }
            };
            if (!TextUtils.isEmpty(null)) {
                C475053 r12 = new OnClickListener(null) {

                    /* renamed from: a */
                    final /* synthetic */ String f119872a;

                    {
                        this.f119872a = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C41941ab.m91896c(UpdateHelper.this.f119844e, this.f119872a);
                    }
                };
                C10643a aVar = new C10643a(context);
                aVar.mo18885a((int) R.string.drs).mo18899b((int) R.string.drq).mo18886a((int) R.string.drt, (OnClickListener) r0).mo18900b((int) R.string.drr, (OnClickListener) r12);
                aVar.mo18897a().mo18883c().setCanceledOnTouchOutside(false);
                return;
            }
            C10643a aVar2 = new C10643a(context);
            aVar2.mo18885a((int) R.string.f7a).mo18902b(a).mo18886a((int) R.string.bv_, (OnClickListener) r0).mo18900b((int) R.string.wf, (OnClickListener) null);
            aVar2.mo18897a().mo18882b();
        }
    }
}
