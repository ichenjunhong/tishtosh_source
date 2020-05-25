package com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.ui_component.C13359a;
import com.bytedance.ui_component.C13359a.C13360a;
import com.bytedance.ui_component.C13359a.C13361b;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.RecordStickerPanelViewModel */
public final class RecordStickerPanelViewModel extends LifecycleAwareViewModel<StickerPanelState> implements C50077f {

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.RecordStickerPanelViewModel$a */
    static final class C50056a extends C52712l implements C52671b<StickerPanelState, StickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ boolean f125391a;

        C50056a(boolean z) {
            this.f125391a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C13359a aVar;
            StickerPanelState stickerPanelState = (StickerPanelState) obj;
            C52711k.m112240b(stickerPanelState, "$receiver");
            if (this.f125391a) {
                aVar = new C13361b();
            } else {
                aVar = new C13360a();
            }
            return stickerPanelState.copy(aVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new StickerPanelState(null, 1, null);
    }

    /* renamed from: a */
    public final void mo97832a(boolean z) {
        mo22533d(new C50056a(z));
    }
}
