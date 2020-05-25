package com.p683ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.gamora.jedi.C49558e;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicState */
public final class EditMusicState implements C11932s {
    private final C49558e cutMusic;
    private final Boolean enableCutMusic;
    private final C42482c mvMusicDetail;

    public EditMusicState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EditMusicState copy$default(EditMusicState editMusicState, Boolean bool, C49558e eVar, C42482c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = editMusicState.enableCutMusic;
        }
        if ((i & 2) != 0) {
            eVar = editMusicState.cutMusic;
        }
        if ((i & 4) != 0) {
            cVar = editMusicState.mvMusicDetail;
        }
        return editMusicState.copy(bool, eVar, cVar);
    }

    public final Boolean component1() {
        return this.enableCutMusic;
    }

    public final C49558e component2() {
        return this.cutMusic;
    }

    public final C42482c component3() {
        return this.mvMusicDetail;
    }

    public final EditMusicState copy(Boolean bool, C49558e eVar, C42482c cVar) {
        return new EditMusicState(bool, eVar, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.mvMusicDetail, (java.lang.Object) r3.mvMusicDetail) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.EditMusicState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.EditMusicState r3 = (com.p683ss.android.ugc.gamora.editor.EditMusicState) r3
            java.lang.Boolean r0 = r2.enableCutMusic
            java.lang.Boolean r1 = r3.enableCutMusic
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.e r0 = r2.cutMusic
            com.ss.android.ugc.gamora.jedi.e r1 = r3.cutMusic
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.shortvideo.c r0 = r2.mvMusicDetail
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mvMusicDetail
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.EditMusicState.equals(java.lang.Object):boolean");
    }

    public final C49558e getCutMusic() {
        return this.cutMusic;
    }

    public final Boolean getEnableCutMusic() {
        return this.enableCutMusic;
    }

    public final C42482c getMvMusicDetail() {
        return this.mvMusicDetail;
    }

    public final int hashCode() {
        Boolean bool = this.enableCutMusic;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C49558e eVar = this.cutMusic;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C42482c cVar = this.mvMusicDetail;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditMusicState(enableCutMusic=");
        sb.append(this.enableCutMusic);
        sb.append(", cutMusic=");
        sb.append(this.cutMusic);
        sb.append(", mvMusicDetail=");
        sb.append(this.mvMusicDetail);
        sb.append(")");
        return sb.toString();
    }

    public EditMusicState(Boolean bool, C49558e eVar, C42482c cVar) {
        this.enableCutMusic = bool;
        this.cutMusic = eVar;
        this.mvMusicDetail = cVar;
    }

    public /* synthetic */ EditMusicState(Boolean bool, C49558e eVar, C42482c cVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            eVar = null;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        this(bool, eVar, cVar);
    }
}
