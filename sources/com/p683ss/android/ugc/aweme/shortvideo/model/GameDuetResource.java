package com.p683ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource */
public class GameDuetResource implements Parcelable {
    public static final Creator<GameDuetResource> CREATOR = new Creator<GameDuetResource>() {
        public final GameDuetResource[] newArray(int i) {
            return new GameDuetResource[i];
        }

        public final GameDuetResource createFromParcel(Parcel parcel) {
            return new GameDuetResource(parcel);
        }
    };
    public int gameScore;
    public Effect gameSticker;

    public int describeContents() {
        return 0;
    }

    protected GameDuetResource(Parcel parcel) {
        this.gameScore = parcel.readInt();
        this.gameSticker = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
    }

    public GameDuetResource(int i, Effect effect) {
        this.gameScore = i;
        this.gameSticker = effect;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.gameSticker, i);
    }
}
