package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.jedi.arch.C11932s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState */
public final class ChooseMediaState implements C11932s {
    private final MediaListState mediaListState;
    private final MediaState previewMediaState;
    private final MediaState selectMediaState;
    private final MediaState unSelectMediaState;

    public ChooseMediaState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ChooseMediaState copy$default(ChooseMediaState chooseMediaState, MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaListState2 = chooseMediaState.mediaListState;
        }
        if ((i & 2) != 0) {
            mediaState = chooseMediaState.selectMediaState;
        }
        if ((i & 4) != 0) {
            mediaState2 = chooseMediaState.unSelectMediaState;
        }
        if ((i & 8) != 0) {
            mediaState3 = chooseMediaState.previewMediaState;
        }
        return chooseMediaState.copy(mediaListState2, mediaState, mediaState2, mediaState3);
    }

    public final MediaListState component1() {
        return this.mediaListState;
    }

    public final MediaState component2() {
        return this.selectMediaState;
    }

    public final MediaState component3() {
        return this.unSelectMediaState;
    }

    public final MediaState component4() {
        return this.previewMediaState;
    }

    public final ChooseMediaState copy(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3) {
        C52711k.m112240b(mediaListState2, "mediaListState");
        C52711k.m112240b(mediaState, "selectMediaState");
        C52711k.m112240b(mediaState2, "unSelectMediaState");
        C52711k.m112240b(mediaState3, "previewMediaState");
        return new ChooseMediaState(mediaListState2, mediaState, mediaState2, mediaState3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.previewMediaState, (java.lang.Object) r3.previewMediaState) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState r3 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState) r3
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r0 = r2.mediaListState
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r1 = r3.mediaListState
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r0 = r2.selectMediaState
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r1 = r3.selectMediaState
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r0 = r2.unSelectMediaState
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r1 = r3.unSelectMediaState
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r0 = r2.previewMediaState
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r3 = r3.previewMediaState
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState.equals(java.lang.Object):boolean");
    }

    public final MediaListState getMediaListState() {
        return this.mediaListState;
    }

    public final MediaState getPreviewMediaState() {
        return this.previewMediaState;
    }

    public final MediaState getSelectMediaState() {
        return this.selectMediaState;
    }

    public final MediaState getUnSelectMediaState() {
        return this.unSelectMediaState;
    }

    public final int hashCode() {
        MediaListState mediaListState2 = this.mediaListState;
        int i = 0;
        int hashCode = (mediaListState2 != null ? mediaListState2.hashCode() : 0) * 31;
        MediaState mediaState = this.selectMediaState;
        int hashCode2 = (hashCode + (mediaState != null ? mediaState.hashCode() : 0)) * 31;
        MediaState mediaState2 = this.unSelectMediaState;
        int hashCode3 = (hashCode2 + (mediaState2 != null ? mediaState2.hashCode() : 0)) * 31;
        MediaState mediaState3 = this.previewMediaState;
        if (mediaState3 != null) {
            i = mediaState3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMediaState(mediaListState=");
        sb.append(this.mediaListState);
        sb.append(", selectMediaState=");
        sb.append(this.selectMediaState);
        sb.append(", unSelectMediaState=");
        sb.append(this.unSelectMediaState);
        sb.append(", previewMediaState=");
        sb.append(this.previewMediaState);
        sb.append(")");
        return sb.toString();
    }

    public ChooseMediaState(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3) {
        C52711k.m112240b(mediaListState2, "mediaListState");
        C52711k.m112240b(mediaState, "selectMediaState");
        C52711k.m112240b(mediaState2, "unSelectMediaState");
        C52711k.m112240b(mediaState3, "previewMediaState");
        this.mediaListState = mediaListState2;
        this.selectMediaState = mediaState;
        this.unSelectMediaState = mediaState2;
        this.previewMediaState = mediaState3;
    }

    public /* synthetic */ ChooseMediaState(MediaListState mediaListState2, MediaState mediaState, MediaState mediaState2, MediaState mediaState3, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            mediaListState2 = new MediaListState(null, 0, 1, null);
        }
        if ((i & 2) != 0) {
            mediaState = new MediaState(null, 0, 1, null);
        }
        if ((i & 4) != 0) {
            mediaState2 = new MediaState(null, 0, 1, null);
        }
        if ((i & 8) != 0) {
            mediaState3 = new MediaState(null, 0, 1, null);
        }
        this(mediaListState2, mediaState, mediaState2, mediaState3);
    }
}
