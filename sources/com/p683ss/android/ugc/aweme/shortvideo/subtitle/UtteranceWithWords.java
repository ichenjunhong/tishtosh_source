package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C9432q;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.Serializable;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords */
public class UtteranceWithWords implements Parcelable, Serializable, Cloneable {
    public static final C44856a CREATOR = new C44856a(null);
    @C17952c(mo34828a = "start_time")

    /* renamed from: a */
    private int f113515a;
    @C17952c(mo34828a = "end_time")

    /* renamed from: b */
    private int f113516b;
    @C17952c(mo34828a = "text")

    /* renamed from: c */
    private String f113517c;
    @C17952c(mo34828a = "words")

    /* renamed from: d */
    private List<C44876i> f113518d;
    @C17952c(mo34828a = "init_width")

    /* renamed from: e */
    private int f113519e;
    @C17952c(mo34828a = "init_height")

    /* renamed from: f */
    private int f113520f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords$a */
    public static final class C44856a implements Creator<UtteranceWithWords> {
        private C44856a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UtteranceWithWords[i];
        }

        public /* synthetic */ C44856a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new UtteranceWithWords(parcel);
        }
    }

    public int describeContents() {
        return 0;
    }

    public final int getEndTime() {
        return this.f113516b;
    }

    public final int getInitHeight() {
        return this.f113520f;
    }

    public final int getInitWidth() {
        return this.f113519e;
    }

    public final int getStartTime() {
        return this.f113515a;
    }

    public final String getText() {
        return this.f113517c;
    }

    public final List<C44876i> getWords() {
        return this.f113518d;
    }

    public Object clone() {
        return super.clone();
    }

    public UtteranceWithWords() {
        this.f113517c = "";
        this.f113518d = C52575l.m112097a();
    }

    public int hashCode() {
        return (((this.f113515a * 31) + Integer.valueOf(this.f113516b).hashCode()) * 31) + this.f113517c.hashCode();
    }

    /* renamed from: b */
    private final int m98049b() {
        return Math.min((this.f113517c.length() * 40) + ((int) C9432q.m18687b((Context) C39629l.m88233b(), ((float) SubtitleTextView.f113511a) * 2.0f)), 640);
    }

    /* renamed from: a */
    private final int m98048a() {
        if ((this.f113517c.length() * 40) + ((int) C9432q.m18687b((Context) C39629l.m88233b(), ((float) SubtitleTextView.f113511a) * 2.0f)) != this.f113519e) {
            return (int) (C9432q.m18687b((Context) C39629l.m88233b(), (((float) SubtitleTextView.f113511a) * 2.0f) + ((float) SubtitleTextView.f113512b)) + 80.0f);
        }
        return ((int) C9432q.m18687b((Context) C39629l.m88233b(), ((float) SubtitleTextView.f113511a) * 2.0f)) + 40;
    }

    public final void setEndTime(int i) {
        this.f113516b = i;
    }

    public final void setInitHeight(int i) {
        this.f113520f = i;
    }

    public final void setInitWidth(int i) {
        this.f113519e = i;
    }

    public final void setStartTime(int i) {
        this.f113515a = i;
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f113517c = str;
    }

    public final void setWords(List<C44876i> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f113518d = list;
    }

    public UtteranceWithWords(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f113515a = parcel.readInt();
        this.f113516b = parcel.readInt();
        String readString = parcel.readString();
        C52711k.m112236a((Object) readString, "parcel.readString()");
        this.f113517c = readString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        UtteranceWithWords utteranceWithWords = (UtteranceWithWords) obj;
        if (this.f113515a == utteranceWithWords.f113515a && this.f113516b == utteranceWithWords.f113516b && !(!C52711k.m112239a((Object) this.f113517c, (Object) utteranceWithWords.f113517c))) {
            return true;
        }
        return false;
    }

    public UtteranceWithWords(StickerItemModel stickerItemModel) {
        C52711k.m112240b(stickerItemModel, "item");
        this();
        this.f113515a = stickerItemModel.startTime;
        this.f113516b = stickerItemModel.endTime;
        String text = stickerItemModel.getText();
        C52711k.m112236a((Object) text, "item.text");
        this.f113517c = text;
        this.f113519e = m98049b();
        this.f113520f = m98048a();
    }

    public UtteranceWithWords(UtteranceWithWords utteranceWithWords) {
        C52711k.m112240b(utteranceWithWords, "utterance");
        this();
        this.f113515a = utteranceWithWords.f113515a;
        this.f113516b = utteranceWithWords.f113516b;
        this.f113517c = utteranceWithWords.f113517c;
        this.f113518d = utteranceWithWords.f113518d;
        this.f113519e = m98049b();
        this.f113520f = m98048a();
    }

    public UtteranceWithWords(int i, int i2) {
        this();
        this.f113515a = i;
        this.f113516b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f113515a);
        parcel.writeInt(this.f113516b);
        parcel.writeString(this.f113517c);
    }

    public UtteranceWithWords(int i, int i2, String str) {
        C52711k.m112240b(str, "text");
        this();
        this.f113515a = i;
        this.f113516b = i2;
        this.f113517c = str;
        this.f113519e = m98049b();
        this.f113520f = m98048a();
    }
}
