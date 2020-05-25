package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43501am;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditLyricStickerState */
public final class EditLyricStickerState implements C11932s {
    private final C49558e cleanSelected;
    private final C49561h clickCutMusic;
    private final C49558e curColor;
    private final C49394cw curLyricEffect;
    private final Integer defaultColor;
    private final C49561h deleteLyric;
    private final C43501am lyricItem;
    private final C49561h saveAudioTime;

    public EditLyricStickerState() {
        this(null, null, null, null, null, null, null, null, NormalGiftView.ALPHA_255, null);
    }

    public static /* synthetic */ EditLyricStickerState copy$default(EditLyricStickerState editLyricStickerState, C49558e eVar, C49394cw cwVar, C49561h hVar, C49561h hVar2, C43501am amVar, Integer num, C49558e eVar2, C49561h hVar3, int i, Object obj) {
        EditLyricStickerState editLyricStickerState2 = editLyricStickerState;
        int i2 = i;
        return editLyricStickerState.copy((i2 & 1) != 0 ? editLyricStickerState2.curColor : eVar, (i2 & 2) != 0 ? editLyricStickerState2.curLyricEffect : cwVar, (i2 & 4) != 0 ? editLyricStickerState2.deleteLyric : hVar, (i2 & 8) != 0 ? editLyricStickerState2.saveAudioTime : hVar2, (i2 & 16) != 0 ? editLyricStickerState2.lyricItem : amVar, (i2 & 32) != 0 ? editLyricStickerState2.defaultColor : num, (i2 & 64) != 0 ? editLyricStickerState2.cleanSelected : eVar2, (i2 & 128) != 0 ? editLyricStickerState2.clickCutMusic : hVar3);
    }

    public final C49558e component1() {
        return this.curColor;
    }

    public final C49394cw component2() {
        return this.curLyricEffect;
    }

    public final C49561h component3() {
        return this.deleteLyric;
    }

    public final C49561h component4() {
        return this.saveAudioTime;
    }

    public final C43501am component5() {
        return this.lyricItem;
    }

    public final Integer component6() {
        return this.defaultColor;
    }

    public final C49558e component7() {
        return this.cleanSelected;
    }

    public final C49561h component8() {
        return this.clickCutMusic;
    }

    public final EditLyricStickerState copy(C49558e eVar, C49394cw cwVar, C49561h hVar, C49561h hVar2, C43501am amVar, Integer num, C49558e eVar2, C49561h hVar3) {
        EditLyricStickerState editLyricStickerState = new EditLyricStickerState(eVar, cwVar, hVar, hVar2, amVar, num, eVar2, hVar3);
        return editLyricStickerState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.clickCutMusic, (java.lang.Object) r3.clickCutMusic) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.EditLyricStickerState
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.gamora.editor.EditLyricStickerState r3 = (com.p683ss.android.ugc.gamora.editor.EditLyricStickerState) r3
            com.ss.android.ugc.gamora.jedi.e r0 = r2.curColor
            com.ss.android.ugc.gamora.jedi.e r1 = r3.curColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.gamora.editor.cw r0 = r2.curLyricEffect
            com.ss.android.ugc.gamora.editor.cw r1 = r3.curLyricEffect
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.gamora.jedi.h r0 = r2.deleteLyric
            com.ss.android.ugc.gamora.jedi.h r1 = r3.deleteLyric
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.gamora.jedi.h r0 = r2.saveAudioTime
            com.ss.android.ugc.gamora.jedi.h r1 = r3.saveAudioTime
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r0 = r2.lyricItem
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am r1 = r3.lyricItem
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = r2.defaultColor
            java.lang.Integer r1 = r3.defaultColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.gamora.jedi.e r0 = r2.cleanSelected
            com.ss.android.ugc.gamora.jedi.e r1 = r3.cleanSelected
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.gamora.jedi.h r0 = r2.clickCutMusic
            com.ss.android.ugc.gamora.jedi.h r3 = r3.clickCutMusic
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditLyricStickerState.equals(java.lang.Object):boolean");
    }

    public final C49558e getCleanSelected() {
        return this.cleanSelected;
    }

    public final C49561h getClickCutMusic() {
        return this.clickCutMusic;
    }

    public final C49558e getCurColor() {
        return this.curColor;
    }

    public final C49394cw getCurLyricEffect() {
        return this.curLyricEffect;
    }

    public final Integer getDefaultColor() {
        return this.defaultColor;
    }

    public final C49561h getDeleteLyric() {
        return this.deleteLyric;
    }

    public final C43501am getLyricItem() {
        return this.lyricItem;
    }

    public final C49561h getSaveAudioTime() {
        return this.saveAudioTime;
    }

    public final int hashCode() {
        C49558e eVar = this.curColor;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        C49394cw cwVar = this.curLyricEffect;
        int hashCode2 = (hashCode + (cwVar != null ? cwVar.hashCode() : 0)) * 31;
        C49561h hVar = this.deleteLyric;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C49561h hVar2 = this.saveAudioTime;
        int hashCode4 = (hashCode3 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        C43501am amVar = this.lyricItem;
        int hashCode5 = (hashCode4 + (amVar != null ? amVar.hashCode() : 0)) * 31;
        Integer num = this.defaultColor;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        C49558e eVar2 = this.cleanSelected;
        int hashCode7 = (hashCode6 + (eVar2 != null ? eVar2.hashCode() : 0)) * 31;
        C49561h hVar3 = this.clickCutMusic;
        if (hVar3 != null) {
            i = hVar3.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditLyricStickerState(curColor=");
        sb.append(this.curColor);
        sb.append(", curLyricEffect=");
        sb.append(this.curLyricEffect);
        sb.append(", deleteLyric=");
        sb.append(this.deleteLyric);
        sb.append(", saveAudioTime=");
        sb.append(this.saveAudioTime);
        sb.append(", lyricItem=");
        sb.append(this.lyricItem);
        sb.append(", defaultColor=");
        sb.append(this.defaultColor);
        sb.append(", cleanSelected=");
        sb.append(this.cleanSelected);
        sb.append(", clickCutMusic=");
        sb.append(this.clickCutMusic);
        sb.append(")");
        return sb.toString();
    }

    public EditLyricStickerState(C49558e eVar, C49394cw cwVar, C49561h hVar, C49561h hVar2, C43501am amVar, Integer num, C49558e eVar2, C49561h hVar3) {
        this.curColor = eVar;
        this.curLyricEffect = cwVar;
        this.deleteLyric = hVar;
        this.saveAudioTime = hVar2;
        this.lyricItem = amVar;
        this.defaultColor = num;
        this.cleanSelected = eVar2;
        this.clickCutMusic = hVar3;
    }

    public /* synthetic */ EditLyricStickerState(C49558e eVar, C49394cw cwVar, C49561h hVar, C49561h hVar2, C43501am amVar, Integer num, C49558e eVar2, C49561h hVar3, int i, C52707g gVar) {
        C49558e eVar3;
        C49394cw cwVar2;
        C49561h hVar4;
        C49561h hVar5;
        C43501am amVar2;
        Integer num2;
        C49558e eVar4;
        int i2 = i;
        C49561h hVar6 = null;
        if ((i2 & 1) != 0) {
            eVar3 = null;
        } else {
            eVar3 = eVar;
        }
        if ((i2 & 2) != 0) {
            cwVar2 = null;
        } else {
            cwVar2 = cwVar;
        }
        if ((i2 & 4) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar;
        }
        if ((i2 & 8) != 0) {
            hVar5 = null;
        } else {
            hVar5 = hVar2;
        }
        if ((i2 & 16) != 0) {
            amVar2 = null;
        } else {
            amVar2 = amVar;
        }
        if ((i2 & 32) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 64) != 0) {
            eVar4 = null;
        } else {
            eVar4 = eVar2;
        }
        if ((i2 & 128) == 0) {
            hVar6 = hVar3;
        }
        this(eVar3, cwVar2, hVar4, hVar5, amVar2, num2, eVar4, hVar6);
    }
}
