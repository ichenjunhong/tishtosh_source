package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aw */
final /* synthetic */ class C44998aw implements Runnable {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f113956a;

    /* renamed from: b */
    private final List f113957b;

    /* renamed from: c */
    private final VotingStickerView f113958c;

    /* renamed from: d */
    private final View f113959d;

    C44998aw(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity, List list, VotingStickerView votingStickerView, View view) {
        this.f113956a = vEVideoPublishPreviewActivity;
        this.f113957b = list;
        this.f113958c = votingStickerView;
        this.f113959d = view;
    }

    public final void run() {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f113956a;
        List list = this.f113957b;
        VotingStickerView votingStickerView = this.f113958c;
        View view = this.f113959d;
        NormalTrackTimeStamp a = C43577d.m95722a((InteractStickerStruct) list.get(0));
        PointF pointF = new PointF(a.getX(), a.getY());
        Point point = new Point();
        point.set((int) (((float) vEVideoPublishPreviewActivity.f113697c.f131275u.mo43037b().width) * pointF.x), (int) (((float) vEVideoPublishPreviewActivity.f113697c.f131275u.mo43037b().height) * pointF.y));
        LayoutParams layoutParams = (LayoutParams) vEVideoPublishPreviewActivity.f113698d.getLayoutParams();
        float height = (float) ((vEVideoPublishPreviewActivity.f113698d.getHeight() - vEVideoPublishPreviewActivity.f113697c.f131275u.mo43037b().height) / 2);
        votingStickerView.setX((float) ((point.x + layoutParams.leftMargin) - (votingStickerView.getWidth() / 2)));
        votingStickerView.setY((((float) (point.y + layoutParams.topMargin)) + height) - ((float) (votingStickerView.getHeight() / 2)));
        votingStickerView.setRotation(a.getRotation());
        votingStickerView.setScaleX(a.getScale().floatValue());
        votingStickerView.setScaleY(a.getScale().floatValue());
        votingStickerView.bringToFront();
        view.bringToFront();
        votingStickerView.setVisibility(0);
    }
}
