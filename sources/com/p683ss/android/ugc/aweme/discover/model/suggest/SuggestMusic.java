package com.p683ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic */
public final class SuggestMusic {
    @C17952c(mo34828a = "music_info")
    public Music music;

    public SuggestMusic() {
        this(null, 1, null);
    }

    public static /* synthetic */ SuggestMusic copy$default(SuggestMusic suggestMusic, Music music2, int i, Object obj) {
        if ((i & 1) != 0) {
            music2 = suggestMusic.music;
        }
        return suggestMusic.copy(music2);
    }

    public final SuggestMusic copy(Music music2) {
        return new SuggestMusic(music2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.music, (java.lang.Object) ((com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusic) r2).music) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusic
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic r2 = (com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusic) r2
            com.ss.android.ugc.aweme.music.model.Music r0 = r1.music
            com.ss.android.ugc.aweme.music.model.Music r2 = r2.music
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusic.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Music music2 = this.music;
        if (music2 != null) {
            return music2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestMusic(music=");
        sb.append(this.music);
        sb.append(")");
        return sb.toString();
    }

    public SuggestMusic(Music music2) {
        this.music = music2;
    }

    public /* synthetic */ SuggestMusic(Music music2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            music2 = null;
        }
        this(music2);
    }
}
