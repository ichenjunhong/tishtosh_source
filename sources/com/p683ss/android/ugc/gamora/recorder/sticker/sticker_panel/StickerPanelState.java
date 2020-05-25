package com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel;

import com.bytedance.ui_component.C13359a;
import com.bytedance.ui_component.C13359a.C13360a;
import com.bytedance.ui_component.UiState;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.StickerPanelState */
public final class StickerPanelState extends UiState {

    /* renamed from: ui */
    private final C13359a f125392ui;

    public StickerPanelState() {
        this(null, 1, null);
    }

    public static /* synthetic */ StickerPanelState copy$default(StickerPanelState stickerPanelState, C13359a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = stickerPanelState.getUi();
        }
        return stickerPanelState.copy(aVar);
    }

    public final C13359a component1() {
        return getUi();
    }

    public final StickerPanelState copy(C13359a aVar) {
        C52711k.m112240b(aVar, "ui");
        return new StickerPanelState(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) getUi(), (java.lang.Object) ((com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.StickerPanelState) r2).getUi()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.StickerPanelState
            if (r0 == 0) goto L_0x0017
            com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.StickerPanelState r2 = (com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.StickerPanelState) r2
            com.bytedance.ui_component.a r0 = r1.getUi()
            com.bytedance.ui_component.a r2 = r2.getUi()
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.StickerPanelState.equals(java.lang.Object):boolean");
    }

    public final C13359a getUi() {
        return this.f125392ui;
    }

    public final int hashCode() {
        C13359a ui = getUi();
        if (ui != null) {
            return ui.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPanelState(ui=");
        sb.append(getUi());
        sb.append(")");
        return sb.toString();
    }

    public StickerPanelState(C13359a aVar) {
        C52711k.m112240b(aVar, "ui");
        super(aVar);
        this.f125392ui = aVar;
    }

    public /* synthetic */ StickerPanelState(C13359a aVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            aVar = new C13360a();
        }
        this(aVar);
    }
}
