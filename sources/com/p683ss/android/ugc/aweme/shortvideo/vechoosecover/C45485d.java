package com.p683ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Point;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.d */
final /* synthetic */ class C45485d implements Runnable {

    /* renamed from: a */
    private final ChooseCoverActivity f114926a;

    /* renamed from: b */
    private final List f114927b;

    /* renamed from: c */
    private final int f114928c;

    /* renamed from: d */
    private final float f114929d;

    /* renamed from: e */
    private final int f114930e;

    /* renamed from: f */
    private final VotingStickerView f114931f;

    /* renamed from: g */
    private final int f114932g;

    /* renamed from: h */
    private final int f114933h;

    C45485d(ChooseCoverActivity chooseCoverActivity, List list, int i, float f, int i2, VotingStickerView votingStickerView, int i3, int i4) {
        this.f114926a = chooseCoverActivity;
        this.f114927b = list;
        this.f114928c = i;
        this.f114929d = f;
        this.f114930e = i2;
        this.f114931f = votingStickerView;
        this.f114932g = i3;
        this.f114933h = i4;
    }

    public final void run() {
        ChooseCoverActivity chooseCoverActivity = this.f114926a;
        List list = this.f114927b;
        int i = this.f114928c;
        float f = this.f114929d;
        int i2 = this.f114930e;
        VotingStickerView votingStickerView = this.f114931f;
        int i3 = this.f114932g;
        int i4 = this.f114933h;
        NormalTrackTimeStamp a = C43577d.m95722a((InteractStickerStruct) list.get(0));
        if (a != null) {
            Point point = new Point((int) (a.getX() * ((float) i) * f), (int) (a.getY() * ((float) i2) * f));
            votingStickerView.setX((float) (((chooseCoverActivity.f114911d.getLeft() + i3) + point.x) - (votingStickerView.getWidth() / 2)));
            votingStickerView.setY((float) (((chooseCoverActivity.f114911d.getTop() + i4) + point.y) - (votingStickerView.getHeight() / 2)));
            votingStickerView.setRotation(a.getRotation());
            votingStickerView.setScaleX(a.getScale().floatValue() * f);
            votingStickerView.setScaleY(a.getScale().floatValue() * f);
            votingStickerView.setVisibility(0);
        }
    }
}
