package com.p683ss.android.ugc.aweme.photomovie.edit.imageframe;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.photomovie.edit.imageframe.C38771a.C38774b;
import com.p683ss.android.ugc.aweme.shortvideo.p2209l.C43952a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView */
public class ImageFrameView extends AppCompatImageView implements C38774b {

    /* renamed from: a */
    public C38771a f98638a;

    /* renamed from: b */
    private C38770a f98639b;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView$a */
    public interface C38770a {
        /* renamed from: a */
        void mo78717a();
    }

    public C38771a getImageLoader() {
        return this.f98638a;
    }

    /* renamed from: a */
    public final void mo78730a() {
        if (this.f98638a != null) {
            this.f98638a.mo78736a();
        }
    }

    /* renamed from: b */
    public final void mo78732b() {
        if (this.f98639b != null) {
            this.f98639b.mo78717a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f98638a != null) {
            this.f98638a.mo78736a();
        }
        super.onDetachedFromWindow();
    }

    public ImageFrameView(Context context) {
        super(context);
    }

    public void setOnLoadFinishListener(C38770a aVar) {
        this.f98639b = aVar;
    }

    /* renamed from: a */
    public final void mo78731a(BitmapDrawable bitmapDrawable, C43952a aVar) {
        setImageDrawable(bitmapDrawable);
    }

    public ImageFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
