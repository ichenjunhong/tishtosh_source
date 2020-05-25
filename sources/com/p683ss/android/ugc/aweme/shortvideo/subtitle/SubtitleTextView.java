package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleTextView */
public final class SubtitleTextView extends TextStickerEditText {

    /* renamed from: a */
    public static int f113511a = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 6.0f));

    /* renamed from: b */
    public static int f113512b = ((int) C9432q.m18687b((Context) C39629l.m88233b(), 3.0f));

    /* renamed from: c */
    public static final C44855a f113513c = new C44855a(null);

    /* renamed from: k */
    private SubtitleStyleViewModel f113514k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleTextView$a */
    public static final class C44855a {
        private C44855a() {
        }

        public /* synthetic */ C44855a(C52707g gVar) {
            this();
        }
    }

    public SubtitleTextView(Context context) {
        this(context, null, 2, null);
    }

    public final int getScene() {
        return 1;
    }

    public final void setViewModel(SubtitleStyleViewModel subtitleStyleViewModel) {
        this.f113514k = subtitleStyleViewModel;
    }

    public final void setAligin(int i) {
        super.setAligin(i);
        if (this.f113514k != null) {
            SubtitleStyleViewModel subtitleStyleViewModel = this.f113514k;
            if (subtitleStyleViewModel == null) {
                C52711k.m112234a();
            }
            subtitleStyleViewModel.mo90949d().setValue(Integer.valueOf(i));
        }
    }

    public final void setFontType(Typeface typeface) {
        C52711k.m112240b(typeface, MLConfigModel.MODEL_TYPE_TF);
        super.setFontType(typeface);
        if (this.f113514k != null) {
            SubtitleStyleViewModel subtitleStyleViewModel = this.f113514k;
            if (subtitleStyleViewModel == null) {
                C52711k.m112234a();
            }
            subtitleStyleViewModel.mo90946a().setValue(C46679c.m101291a().mo93622a(typeface));
        }
    }

    /* renamed from: a */
    public final void mo90951a(Context context) {
        this.f117907d = f113512b;
        this.f117911h = (int) C9432q.m18687b(context, 2.0f);
        this.f117908e = new Paint();
        Paint paint = this.f117908e;
        C52711k.m112236a((Object) paint, "mBgFillPaint");
        paint.setColor(this.f117910g);
        Paint paint2 = this.f117908e;
        C52711k.m112236a((Object) paint2, "mBgFillPaint");
        paint2.setStyle(Style.FILL);
        Paint paint3 = this.f117908e;
        C52711k.m112236a((Object) paint3, "mBgFillPaint");
        paint3.setAntiAlias(true);
        Paint paint4 = this.f117908e;
        C52711k.m112236a((Object) paint4, "mBgFillPaint");
        paint4.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        Paint paint5 = this.f117908e;
        C52711k.m112236a((Object) paint5, "mBgFillPaint");
        paint5.setPathEffect(new CornerPathEffect((float) this.f117911h));
        this.f117909f = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f117907d, getLineSpacingMultiplier());
    }

    public SubtitleTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        setInputType(131072);
        setGravity(17);
        setSingleLine(false);
        setHorizontallyScrolling(false);
        setTextSize(0, 40.0f);
        int i = f113511a;
        setPadding(i, i, i, i);
        setBackground(null);
    }

    /* renamed from: a */
    public final void mo90950a(int i, int i2) {
        super.mo90950a(i, i2);
        if (this.f113514k != null) {
            SubtitleStyleViewModel subtitleStyleViewModel = this.f113514k;
            if (subtitleStyleViewModel == null) {
                C52711k.m112234a();
            }
            subtitleStyleViewModel.mo90947b().setValue(Integer.valueOf(i));
            SubtitleStyleViewModel subtitleStyleViewModel2 = this.f113514k;
            if (subtitleStyleViewModel2 == null) {
                C52711k.m112234a();
            }
            subtitleStyleViewModel2.mo90948c().setValue(Integer.valueOf(i2));
        }
    }

    public /* synthetic */ SubtitleTextView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
