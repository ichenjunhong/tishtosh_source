package com.p683ss.android.ugc.aweme.tools.beauty.p2350b;

import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f.C46899a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46904h;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.b.a */
public class C46823a implements C46899a {

    /* renamed from: a */
    public final C46896d f118301a;

    /* renamed from: a */
    public void mo94065a() {
    }

    /* renamed from: b */
    public void mo94071b() {
    }

    public C46823a(C46896d dVar) {
        C52711k.m112240b(dVar, "module");
        this.f118301a = dVar;
    }

    /* renamed from: a */
    public final void mo94068a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "paths");
        this.f118301a.mo86574c(list, i);
    }

    /* renamed from: a */
    public final int[] mo94070a(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        return this.f118301a.mo86570a(str, str2);
    }

    /* renamed from: a */
    public final void mo94067a(String str, String str2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "nodeTag");
        this.f118301a.mo86567a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo94069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldPaths");
        C52711k.m112240b(list2, "newPaths");
        this.f118301a.mo86569a(list, list2, i);
    }

    /* renamed from: a */
    public final void mo94066a(C46904h hVar, int i, boolean z) {
        C52711k.m112240b(hVar, "type");
        switch (C46824b.f118302a[hVar.ordinal()]) {
            case 1:
                if (this.f118301a.mo86590p()) {
                    this.f118301a.mo86566a(i);
                    return;
                }
                return;
            case 2:
                if (this.f118301a.mo86591q()) {
                    this.f118301a.mo86573c(i);
                    return;
                }
                return;
            case 3:
                if (this.f118301a.mo86591q()) {
                    this.f118301a.mo86571b(i);
                    return;
                }
                return;
            case 4:
                this.f118301a.mo86576d(i);
                return;
            case 5:
                this.f118301a.mo86578e(i);
                break;
        }
    }
}
