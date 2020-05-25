package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.services.publish.IPermissionAction;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bx */
final /* synthetic */ class C45084bx implements C0199s {

    /* renamed from: a */
    private final C45054bg f114183a;

    /* renamed from: b */
    private final ExtensionDataRepo f114184b;

    C45084bx(C45054bg bgVar, ExtensionDataRepo extensionDataRepo) {
        this.f114183a = bgVar;
        this.f114184b = extensionDataRepo;
    }

    public final void onChanged(Object obj) {
        C45054bg bgVar = this.f114183a;
        ExtensionDataRepo extensionDataRepo = this.f114184b;
        Integer num = (Integer) obj;
        if (num != null) {
            if (extensionDataRepo.getUpdateAnchor().getValue() != null) {
                extensionDataRepo.setIPermissionAction(new IPermissionAction(num, extensionDataRepo) {

                    /* renamed from: a */
                    final /* synthetic */ Integer f114155a;

                    /* renamed from: b */
                    final /* synthetic */ ExtensionDataRepo f114156b;

                    public final void cancel() {
                        C45054bg.this.f114117c.setValue(Integer.valueOf(C45054bg.this.f114118d.mo86781a()));
                    }

                    public final void confirm() {
                        if (this.f114155a.intValue() != 1) {
                            this.f114156b.getI18nPrivacy().setValue(Boolean.valueOf(true));
                        } else {
                            this.f114156b.getI18nPrivacy().setValue(Boolean.valueOf(false));
                            this.f114156b.getUpdateAnchor().setValue(null);
                        }
                        C45054bg.this.f114118d.mo86782a(this.f114155a.intValue());
                    }

                    {
                        this.f114155a = r2;
                        this.f114156b = r3;
                    }
                });
                if (extensionDataRepo.getShowPermissionAction() != null && !((Boolean) extensionDataRepo.getShowPermissionAction().invoke(num)).booleanValue()) {
                    if (num.intValue() != 1) {
                        extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(true));
                    } else {
                        extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(false));
                    }
                    bgVar.f114118d.mo86782a(num.intValue());
                }
            } else {
                if (num.intValue() != 1) {
                    extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(true));
                } else {
                    extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(false));
                }
                bgVar.f114118d.mo86782a(num.intValue());
            }
        }
    }
}
