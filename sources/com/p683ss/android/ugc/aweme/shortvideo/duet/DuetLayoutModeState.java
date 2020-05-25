package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.ui_component.C13359a;
import com.bytedance.ui_component.C13359a.C13360a;
import com.bytedance.ui_component.UiState;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeState */
public final class DuetLayoutModeState extends UiState {
    private final int changeDirectionMode;
    private final int chosenPosition;
    private final int guideMode;
    private final int touchGesture;

    /* renamed from: ui */
    private final C13359a f109330ui;

    public DuetLayoutModeState() {
        this(0, 0, 0, 0, null, 31, null);
    }

    public static /* synthetic */ DuetLayoutModeState copy$default(DuetLayoutModeState duetLayoutModeState, int i, int i2, int i3, int i4, C13359a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = duetLayoutModeState.changeDirectionMode;
        }
        if ((i5 & 2) != 0) {
            i2 = duetLayoutModeState.guideMode;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = duetLayoutModeState.touchGesture;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = duetLayoutModeState.chosenPosition;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            aVar = duetLayoutModeState.getUi();
        }
        return duetLayoutModeState.copy(i, i6, i7, i8, aVar);
    }

    public final int component1() {
        return this.changeDirectionMode;
    }

    public final int component2() {
        return this.guideMode;
    }

    public final int component3() {
        return this.touchGesture;
    }

    public final int component4() {
        return this.chosenPosition;
    }

    public final C13359a component5() {
        return getUi();
    }

    public final DuetLayoutModeState copy(int i, int i2, int i3, int i4, C13359a aVar) {
        C52711k.m112240b(aVar, "ui");
        DuetLayoutModeState duetLayoutModeState = new DuetLayoutModeState(i, i2, i3, i4, aVar);
        return duetLayoutModeState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DuetLayoutModeState) {
                DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
                if (this.changeDirectionMode == duetLayoutModeState.changeDirectionMode) {
                    if (this.guideMode == duetLayoutModeState.guideMode) {
                        if (this.touchGesture == duetLayoutModeState.touchGesture) {
                            if (!(this.chosenPosition == duetLayoutModeState.chosenPosition) || !C52711k.m112239a((Object) getUi(), (Object) duetLayoutModeState.getUi())) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getChangeDirectionMode() {
        return this.changeDirectionMode;
    }

    public final int getChosenPosition() {
        return this.chosenPosition;
    }

    public final int getGuideMode() {
        return this.guideMode;
    }

    public final int getTouchGesture() {
        return this.touchGesture;
    }

    public final C13359a getUi() {
        return this.f109330ui;
    }

    public final int hashCode() {
        int i = ((((((this.changeDirectionMode * 31) + this.guideMode) * 31) + this.touchGesture) * 31) + this.chosenPosition) * 31;
        C13359a ui = getUi();
        return i + (ui != null ? ui.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuetLayoutModeState(changeDirectionMode=");
        sb.append(this.changeDirectionMode);
        sb.append(", guideMode=");
        sb.append(this.guideMode);
        sb.append(", touchGesture=");
        sb.append(this.touchGesture);
        sb.append(", chosenPosition=");
        sb.append(this.chosenPosition);
        sb.append(", ui=");
        sb.append(getUi());
        sb.append(")");
        return sb.toString();
    }

    public DuetLayoutModeState(int i, int i2, int i3, int i4, C13359a aVar) {
        C52711k.m112240b(aVar, "ui");
        super(aVar);
        this.changeDirectionMode = i;
        this.guideMode = i2;
        this.touchGesture = i3;
        this.chosenPosition = i4;
        this.f109330ui = aVar;
    }

    public /* synthetic */ DuetLayoutModeState(int i, int i2, int i3, int i4, C13359a aVar, int i5, C52707g gVar) {
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if ((i5 & 1) != 0) {
            i6 = 0;
        } else {
            i6 = i;
        }
        if ((i5 & 2) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i5 & 4) != 0) {
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i5 & 8) == 0) {
            i9 = i4;
        }
        if ((i5 & 16) != 0) {
            aVar = new C13360a();
        }
        this(i6, i7, i8, i9, aVar);
    }
}
