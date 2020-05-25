package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.PoiStickerHollowTextView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.PoiStickerView */
public class PoiStickerView extends InteractStickerBaseView {

    /* renamed from: a */
    PoiStickerHollowTextView f110327a;

    /* renamed from: b */
    int f110328b;

    /* renamed from: c */
    float f110329c;

    /* renamed from: d */
    int f110330d;

    /* renamed from: w */
    private int f110331w;

    public PoiStickerView(Context context) {
        this(context, null);
    }

    public void setPoiContentTxt(String str) {
        this.f110327a.setText(str);
        this.f110327a.setTextSize(this.f110329c);
        LayoutParams layoutParams = this.f110327a.getLayoutParams();
        layoutParams.width = -2;
        this.f110327a.setLayoutParams(layoutParams);
        setVisibility(4);
        this.f110327a.post(new C43601c(this));
    }

    public PoiStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110329c = 28.0f;
        this.f110373e = context;
        this.f110331w = (int) C9432q.m18687b(context, 32.0f);
        this.f110328b = C9432q.m18670a(context) - this.f110331w;
        this.f110330d = this.f110328b;
        this.f110329c = C9432q.m18687b(context, 28.0f);
        LayoutInflater.from(this.f110373e).inflate(R.layout.a84, this);
        this.f110378j = (StickerHelpBoxView) findViewById(R.id.ct1);
        this.f110379k = findViewById(R.id.zr);
        this.f110327a = (PoiStickerHollowTextView) findViewById(R.id.a03);
        this.f110327a.setMaxWidth(this.f110330d);
        setVisibility(8);
    }
}
