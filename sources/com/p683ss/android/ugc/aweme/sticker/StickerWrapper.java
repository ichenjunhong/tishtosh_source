package com.p683ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45183i;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50200d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.StickerWrapper */
public class StickerWrapper implements Parcelable {
    public static final Creator<StickerWrapper> CREATOR = new Creator<StickerWrapper>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StickerWrapper[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StickerWrapper(parcel);
        }
    };

    /* renamed from: a */
    public Effect f115779a;

    /* renamed from: b */
    public String f115780b;

    /* renamed from: c */
    public int f115781c;

    /* renamed from: d */
    public boolean f115782d;

    /* renamed from: e */
    public int f115783e;

    /* renamed from: f */
    public boolean f115784f;

    /* renamed from: g */
    public boolean f115785g;

    public StickerWrapper() {
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f115779a.equals(((StickerWrapper) obj).f115779a);
    }

    protected StickerWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f115779a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f115780b = parcel.readString();
        this.f115781c = parcel.readInt();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f115782d = z;
        this.f115783e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f115784f = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.f115785g = z3;
    }

    /* renamed from: a */
    public static boolean m99612a(StickerWrapper stickerWrapper) {
        try {
            if (Integer.parseInt(stickerWrapper.f115779a.getEffectId()) < 0) {
                return true;
            }
            return false;
        } catch (NullPointerException | NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static String m99617b(Effect effect) {
        if (effect == null || effect.getMusic() == null || effect.getMusic().size() <= 0) {
            return null;
        }
        return C46055e.m100052a((String) effect.getMusic().get(0));
    }

    /* renamed from: a */
    public static boolean m99613a(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!C44518a.m97415a(effect) || m99617b(effect) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static StickerWrapper m99611a(Effect effect, boolean z) {
        return new StickerWrapper(effect, null, 1);
    }

    /* renamed from: a */
    public static StickerWrapper m99608a(StickerWrapper stickerWrapper, C29252f fVar) {
        return new StickerWrapper(stickerWrapper.f115779a, stickerWrapper.f115780b, m99615b(stickerWrapper.f115779a, fVar));
    }

    /* renamed from: b */
    public static StickerWrapper m99616b(StickerWrapper stickerWrapper, C29252f fVar) {
        stickerWrapper.f115781c = m99615b(stickerWrapper.f115779a, fVar);
        return stickerWrapper;
    }

    /* renamed from: a */
    public static StickerWrapper m99609a(Effect effect, String str) {
        boolean z;
        int i = 1;
        if (effect == null || (!C50200d.m108346a(effect.getUnzipPath()) && effect.getEffectType() == 0)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        return new StickerWrapper(effect, str, i);
    }

    /* renamed from: b */
    private static int m99615b(Effect effect, C29252f fVar) {
        if (!m99614a(effect, fVar)) {
            return 3;
        }
        if (!C44518a.m97415a(effect)) {
            return 1;
        }
        String effectId = effect.getEffectId();
        C52711k.m112240b(effectId, "effectId");
        if (C45183i.f114318a.containsKey(effectId) || m99617b(effect) != null) {
            return 1;
        }
        return 3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f115779a, i);
        parcel.writeString(this.f115780b);
        parcel.writeInt(this.f115781c);
        parcel.writeByte(this.f115782d ? (byte) 1 : 0);
        parcel.writeInt(this.f115783e);
        parcel.writeByte(this.f115784f ? (byte) 1 : 0);
        parcel.writeByte(this.f115785g ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public static boolean m99614a(Effect effect, C29252f fVar) {
        if (fVar == null || effect == null || (!fVar.mo59142a(effect) && effect.getEffectType() == 0)) {
            return false;
        }
        return true;
    }

    public StickerWrapper(Effect effect, String str, int i) {
        this.f115779a = effect;
        this.f115780b = str;
        this.f115781c = i;
    }

    /* renamed from: a */
    public static StickerWrapper m99610a(Effect effect, String str, C29252f fVar) {
        boolean z;
        int i = 1;
        if (!m99614a(effect, fVar) || !m99613a(effect)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        return new StickerWrapper(effect, str, i);
    }
}
