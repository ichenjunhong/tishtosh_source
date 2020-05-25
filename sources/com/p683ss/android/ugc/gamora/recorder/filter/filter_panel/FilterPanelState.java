package com.p683ss.android.ugc.gamora.recorder.filter.filter_panel;

import com.bytedance.ui_component.C13359a;
import com.bytedance.ui_component.UiState;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState */
public final class FilterPanelState extends UiState {
    private final Map<EffectCategoryResponse, List<C31459g>> data;
    private final boolean disableFilter;
    private final C49561h enterFilterBoxEvent;
    private final int pendingSelected;
    private final C49555b<C31459g> scrolledTo;
    private final C31459g selectedFilter;

    /* renamed from: ui */
    private final C13359a f124708ui;

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.b, code=com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.filter.g>, for r8v0, types: [com.ss.android.ugc.gamora.jedi.b] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.g>>, for r10v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState copy$default(com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState r5, com.bytedance.ui_component.C13359a r6, com.p683ss.android.ugc.aweme.filter.C31459g r7, com.p683ss.android.ugc.gamora.jedi.C49555b<com.p683ss.android.ugc.aweme.filter.C31459g> r8, boolean r9, java.util.Map<com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.p683ss.android.ugc.aweme.filter.C31459g>> r10, com.p683ss.android.ugc.gamora.jedi.C49561h r11, int r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0008
            com.bytedance.ui_component.a r6 = r5.getUi()
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.filter.g r7 = r5.selectedFilter
        L_0x000e:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0015
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.aweme.filter.g> r8 = r5.scrolledTo
        L_0x0015:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001c
            boolean r9 = r5.disableFilter
        L_0x001c:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0023
            java.util.Map<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.g>> r10 = r5.data
        L_0x0023:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002a
            com.ss.android.ugc.gamora.jedi.h r11 = r5.enterFilterBoxEvent
        L_0x002a:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0031
            int r12 = r5.pendingSelected
        L_0x0031:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState.copy$default(com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState, com.bytedance.ui_component.a, com.ss.android.ugc.aweme.filter.g, com.ss.android.ugc.gamora.jedi.b, boolean, java.util.Map, com.ss.android.ugc.gamora.jedi.h, int, int, java.lang.Object):com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelState");
    }

    public final C13359a component1() {
        return getUi();
    }

    public final C31459g component2() {
        return this.selectedFilter;
    }

    public final C49555b<C31459g> component3() {
        return this.scrolledTo;
    }

    public final boolean component4() {
        return this.disableFilter;
    }

    public final Map<EffectCategoryResponse, List<C31459g>> component5() {
        return this.data;
    }

    public final C49561h component6() {
        return this.enterFilterBoxEvent;
    }

    public final int component7() {
        return this.pendingSelected;
    }

    public final FilterPanelState copy(C13359a aVar, C31459g gVar, C49555b<? extends C31459g> bVar, boolean z, Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map, C49561h hVar, int i) {
        C13359a aVar2 = aVar;
        C52711k.m112240b(aVar, "ui");
        C49555b<? extends C31459g> bVar2 = bVar;
        C52711k.m112240b(bVar, "scrolledTo");
        Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map2 = map;
        C52711k.m112240b(map, "data");
        FilterPanelState filterPanelState = new FilterPanelState(aVar2, gVar, bVar2, z, map2, hVar, i);
        return filterPanelState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FilterPanelState) {
                FilterPanelState filterPanelState = (FilterPanelState) obj;
                if (C52711k.m112239a((Object) getUi(), (Object) filterPanelState.getUi()) && C52711k.m112239a((Object) this.selectedFilter, (Object) filterPanelState.selectedFilter) && C52711k.m112239a((Object) this.scrolledTo, (Object) filterPanelState.scrolledTo)) {
                    if ((this.disableFilter == filterPanelState.disableFilter) && C52711k.m112239a((Object) this.data, (Object) filterPanelState.data) && C52711k.m112239a((Object) this.enterFilterBoxEvent, (Object) filterPanelState.enterFilterBoxEvent)) {
                        if (this.pendingSelected == filterPanelState.pendingSelected) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Map<EffectCategoryResponse, List<C31459g>> getData() {
        return this.data;
    }

    public final boolean getDisableFilter() {
        return this.disableFilter;
    }

    public final C49561h getEnterFilterBoxEvent() {
        return this.enterFilterBoxEvent;
    }

    public final int getPendingSelected() {
        return this.pendingSelected;
    }

    public final C49555b<C31459g> getScrolledTo() {
        return this.scrolledTo;
    }

    public final C31459g getSelectedFilter() {
        return this.selectedFilter;
    }

    public final C13359a getUi() {
        return this.f124708ui;
    }

    public final int hashCode() {
        C13359a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C31459g gVar = this.selectedFilter;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        C49555b<C31459g> bVar = this.scrolledTo;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z = this.disableFilter;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        Map<EffectCategoryResponse, List<C31459g>> map = this.data;
        int hashCode4 = (i2 + (map != null ? map.hashCode() : 0)) * 31;
        C49561h hVar = this.enterFilterBoxEvent;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.pendingSelected;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterPanelState(ui=");
        sb.append(getUi());
        sb.append(", selectedFilter=");
        sb.append(this.selectedFilter);
        sb.append(", scrolledTo=");
        sb.append(this.scrolledTo);
        sb.append(", disableFilter=");
        sb.append(this.disableFilter);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", enterFilterBoxEvent=");
        sb.append(this.enterFilterBoxEvent);
        sb.append(", pendingSelected=");
        sb.append(this.pendingSelected);
        sb.append(")");
        return sb.toString();
    }

    public FilterPanelState(C13359a aVar, C31459g gVar, C49555b<? extends C31459g> bVar, boolean z, Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map, C49561h hVar, int i) {
        C52711k.m112240b(aVar, "ui");
        C52711k.m112240b(bVar, "scrolledTo");
        C52711k.m112240b(map, "data");
        super(aVar);
        this.f124708ui = aVar;
        this.selectedFilter = gVar;
        this.scrolledTo = bVar;
        this.disableFilter = z;
        this.data = map;
        this.enterFilterBoxEvent = hVar;
        this.pendingSelected = i;
    }

    public /* synthetic */ FilterPanelState(C13359a aVar, C31459g gVar, C49555b bVar, boolean z, Map map, C49561h hVar, int i, int i2, C52707g gVar2) {
        C49561h hVar2;
        int i3;
        if ((i2 & 32) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 64) != 0) {
            i3 = DynamicTabYellowPointVersion.DEFAULT;
        } else {
            i3 = i;
        }
        this(aVar, gVar, bVar, z, map, hVar2, i3);
    }
}
