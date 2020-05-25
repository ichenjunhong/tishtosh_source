package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState */
public final class MediaState implements C11932s {
    private final MyMediaModel media;
    private final long value;

    public static /* synthetic */ MediaState copy$default(MediaState mediaState, MyMediaModel myMediaModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            myMediaModel = mediaState.media;
        }
        if ((i & 2) != 0) {
            j = mediaState.value;
        }
        return mediaState.copy(myMediaModel, j);
    }

    public final MyMediaModel component1() {
        return this.media;
    }

    public final long component2() {
        return this.value;
    }

    public final MediaState copy(MyMediaModel myMediaModel, long j) {
        return new MediaState(myMediaModel, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaState) {
                MediaState mediaState = (MediaState) obj;
                if (C52711k.m112239a((Object) this.media, (Object) mediaState.media)) {
                    if (this.value == mediaState.value) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final MyMediaModel getMedia() {
        return this.media;
    }

    public final long getValue() {
        return this.value;
    }

    public final int hashCode() {
        MyMediaModel myMediaModel = this.media;
        int hashCode = (myMediaModel != null ? myMediaModel.hashCode() : 0) * 31;
        long j = this.value;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaState(media=");
        sb.append(this.media);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    public MediaState(MyMediaModel myMediaModel, long j) {
        this.media = myMediaModel;
        this.value = j;
    }

    public /* synthetic */ MediaState(MyMediaModel myMediaModel, long j, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            myMediaModel = null;
        }
        this(myMediaModel, j);
    }
}
