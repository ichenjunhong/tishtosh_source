package com.p683ss.android.ugc.aweme.greenscreen;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewState */
public final class GreenScreenViewState implements C11932s {
    private final Boolean commonButtonVisibility;
    private final C49555b<String> imageName;
    private final C49555b<Integer> load;
    private final C49562i<Boolean> panelVisibility;
    private final C49555b<Boolean> panelVisibilityWithoutAnim;
    private final String thumbImage;
    private final Boolean thumbVisibility;
    private final C49559f<String, String> useBackgroundImage;
    private final C49555b<Effect> useEffect;

    public GreenScreenViewState() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ GreenScreenViewState copy$default(GreenScreenViewState greenScreenViewState, C49555b bVar, C49562i iVar, C49555b bVar2, Boolean bool, Boolean bool2, String str, C49555b bVar3, C49559f fVar, C49555b bVar4, int i, Object obj) {
        GreenScreenViewState greenScreenViewState2 = greenScreenViewState;
        int i2 = i;
        return greenScreenViewState.copy((i2 & 1) != 0 ? greenScreenViewState2.load : bVar, (i2 & 2) != 0 ? greenScreenViewState2.panelVisibility : iVar, (i2 & 4) != 0 ? greenScreenViewState2.panelVisibilityWithoutAnim : bVar2, (i2 & 8) != 0 ? greenScreenViewState2.commonButtonVisibility : bool, (i2 & 16) != 0 ? greenScreenViewState2.thumbVisibility : bool2, (i2 & 32) != 0 ? greenScreenViewState2.thumbImage : str, (i2 & 64) != 0 ? greenScreenViewState2.useEffect : bVar3, (i2 & 128) != 0 ? greenScreenViewState2.useBackgroundImage : fVar, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? greenScreenViewState2.imageName : bVar4);
    }

    public final C49555b<Integer> component1() {
        return this.load;
    }

    public final C49562i<Boolean> component2() {
        return this.panelVisibility;
    }

    public final C49555b<Boolean> component3() {
        return this.panelVisibilityWithoutAnim;
    }

    public final Boolean component4() {
        return this.commonButtonVisibility;
    }

    public final Boolean component5() {
        return this.thumbVisibility;
    }

    public final String component6() {
        return this.thumbImage;
    }

    public final C49555b<Effect> component7() {
        return this.useEffect;
    }

    public final C49559f<String, String> component8() {
        return this.useBackgroundImage;
    }

    public final C49555b<String> component9() {
        return this.imageName;
    }

    public final GreenScreenViewState copy(C49555b<Integer> bVar, C49562i<Boolean> iVar, C49555b<Boolean> bVar2, Boolean bool, Boolean bool2, String str, C49555b<? extends Effect> bVar3, C49559f<String, String> fVar, C49555b<String> bVar4) {
        GreenScreenViewState greenScreenViewState = new GreenScreenViewState(bVar, iVar, bVar2, bool, bool2, str, bVar3, fVar, bVar4);
        return greenScreenViewState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.imageName, (java.lang.Object) r3.imageName) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.greenscreen.GreenScreenViewState
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.greenscreen.GreenScreenViewState r3 = (com.p683ss.android.ugc.aweme.greenscreen.GreenScreenViewState) r3
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r0 = r2.load
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r1 = r3.load
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.i<java.lang.Boolean> r0 = r2.panelVisibility
            com.ss.android.ugc.gamora.jedi.i<java.lang.Boolean> r1 = r3.panelVisibility
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r0 = r2.panelVisibilityWithoutAnim
            com.ss.android.ugc.gamora.jedi.b<java.lang.Boolean> r1 = r3.panelVisibilityWithoutAnim
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Boolean r0 = r2.commonButtonVisibility
            java.lang.Boolean r1 = r3.commonButtonVisibility
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Boolean r0 = r2.thumbVisibility
            java.lang.Boolean r1 = r3.thumbVisibility
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.thumbImage
            java.lang.String r1 = r3.thumbImage
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2.useEffect
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r3.useEffect
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.f<java.lang.String, java.lang.String> r0 = r2.useBackgroundImage
            com.ss.android.ugc.gamora.jedi.f<java.lang.String, java.lang.String> r1 = r3.useBackgroundImage
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.gamora.jedi.b<java.lang.String> r0 = r2.imageName
            com.ss.android.ugc.gamora.jedi.b<java.lang.String> r3 = r3.imageName
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.GreenScreenViewState.equals(java.lang.Object):boolean");
    }

    public final Boolean getCommonButtonVisibility() {
        return this.commonButtonVisibility;
    }

    public final C49555b<String> getImageName() {
        return this.imageName;
    }

    public final C49555b<Integer> getLoad() {
        return this.load;
    }

    public final C49562i<Boolean> getPanelVisibility() {
        return this.panelVisibility;
    }

    public final C49555b<Boolean> getPanelVisibilityWithoutAnim() {
        return this.panelVisibilityWithoutAnim;
    }

    public final String getThumbImage() {
        return this.thumbImage;
    }

    public final Boolean getThumbVisibility() {
        return this.thumbVisibility;
    }

    public final C49559f<String, String> getUseBackgroundImage() {
        return this.useBackgroundImage;
    }

    public final C49555b<Effect> getUseEffect() {
        return this.useEffect;
    }

    public final int hashCode() {
        C49555b<Integer> bVar = this.load;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C49562i<Boolean> iVar = this.panelVisibility;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C49555b<Boolean> bVar2 = this.panelVisibilityWithoutAnim;
        int hashCode3 = (hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        Boolean bool = this.commonButtonVisibility;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.thumbVisibility;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.thumbImage;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        C49555b<Effect> bVar3 = this.useEffect;
        int hashCode7 = (hashCode6 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        C49559f<String, String> fVar = this.useBackgroundImage;
        int hashCode8 = (hashCode7 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C49555b<String> bVar4 = this.imageName;
        if (bVar4 != null) {
            i = bVar4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GreenScreenViewState(load=");
        sb.append(this.load);
        sb.append(", panelVisibility=");
        sb.append(this.panelVisibility);
        sb.append(", panelVisibilityWithoutAnim=");
        sb.append(this.panelVisibilityWithoutAnim);
        sb.append(", commonButtonVisibility=");
        sb.append(this.commonButtonVisibility);
        sb.append(", thumbVisibility=");
        sb.append(this.thumbVisibility);
        sb.append(", thumbImage=");
        sb.append(this.thumbImage);
        sb.append(", useEffect=");
        sb.append(this.useEffect);
        sb.append(", useBackgroundImage=");
        sb.append(this.useBackgroundImage);
        sb.append(", imageName=");
        sb.append(this.imageName);
        sb.append(")");
        return sb.toString();
    }

    public GreenScreenViewState(C49555b<Integer> bVar, C49562i<Boolean> iVar, C49555b<Boolean> bVar2, Boolean bool, Boolean bool2, String str, C49555b<? extends Effect> bVar3, C49559f<String, String> fVar, C49555b<String> bVar4) {
        this.load = bVar;
        this.panelVisibility = iVar;
        this.panelVisibilityWithoutAnim = bVar2;
        this.commonButtonVisibility = bool;
        this.thumbVisibility = bool2;
        this.thumbImage = str;
        this.useEffect = bVar3;
        this.useBackgroundImage = fVar;
        this.imageName = bVar4;
    }

    public /* synthetic */ GreenScreenViewState(C49555b bVar, C49562i iVar, C49555b bVar2, Boolean bool, Boolean bool2, String str, C49555b bVar3, C49559f fVar, C49555b bVar4, int i, C52707g gVar) {
        C49555b bVar5;
        C49562i iVar2;
        C49555b bVar6;
        Boolean bool3;
        Boolean bool4;
        String str2;
        C49555b bVar7;
        C49559f fVar2;
        int i2 = i;
        C49555b bVar8 = null;
        if ((i2 & 1) != 0) {
            bVar5 = null;
        } else {
            bVar5 = bVar;
        }
        if ((i2 & 2) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i2 & 4) != 0) {
            bVar6 = null;
        } else {
            bVar6 = bVar2;
        }
        if ((i2 & 8) != 0) {
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i2 & 16) != 0) {
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 64) != 0) {
            bVar7 = null;
        } else {
            bVar7 = bVar3;
        }
        if ((i2 & 128) != 0) {
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 0) {
            bVar8 = bVar4;
        }
        this(bVar5, iVar2, bVar6, bool3, bool4, str2, bVar7, fVar2, bVar8);
    }
}
