package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.p1094a.C18371e;
import com.squareup.p1094a.C18396v;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.C52074f;
import com.twitter.sdk.android.core.internal.C52187t;
import com.twitter.sdk.android.core.internal.scribe.C52144aa;
import com.twitter.sdk.android.core.models.C52197d;
import com.twitter.sdk.android.core.models.C52201h;
import com.twitter.sdk.android.core.models.C52203j;
import com.twitter.sdk.android.core.models.C52209m;
import com.twitter.sdk.android.tweetui.C52306n;
import com.twitter.sdk.android.tweetui.C52312r;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.GalleryActivity.C52259a;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.tweetui.PlayerActivity.C52261a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class TweetMediaView extends ViewGroup implements OnClickListener {

    /* renamed from: a */
    final float[] f130169a;

    /* renamed from: b */
    int f130170b;

    /* renamed from: c */
    int f130171c;

    /* renamed from: d */
    final C52275a f130172d;

    /* renamed from: e */
    boolean f130173e;

    /* renamed from: f */
    C52306n f130174f;

    /* renamed from: g */
    C52209m f130175g;

    /* renamed from: h */
    private final C52294e[] f130176h;

    /* renamed from: i */
    private List<C52203j> f130177i;

    /* renamed from: j */
    private final Path f130178j;

    /* renamed from: k */
    private final RectF f130179k;

    /* renamed from: l */
    private final int f130180l;

    /* renamed from: m */
    private int f130181m;

    /* renamed from: com.twitter.sdk.android.tweetui.internal.TweetMediaView$a */
    static class C52275a {
        C52275a() {
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.internal.TweetMediaView$b */
    static class C52276b implements C18371e {

        /* renamed from: a */
        final WeakReference<ImageView> f130182a;

        /* renamed from: b */
        public final void mo36820b() {
        }

        /* renamed from: a */
        public final void mo36819a() {
            ImageView imageView = (ImageView) this.f130182a.get();
            if (imageView != null) {
                imageView.setBackgroundResource(17170445);
            }
        }

        C52276b(ImageView imageView) {
            this.f130182a = new WeakReference<>(imageView);
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.internal.TweetMediaView$c */
    static class C52277c {

        /* renamed from: a */
        static final C52277c f130183a = new C52277c();

        /* renamed from: b */
        final int f130184b;

        /* renamed from: c */
        final int f130185c;

        private C52277c() {
            this(0, 0);
        }

        C52277c(int i, int i2) {
            this.f130184b = i;
            this.f130185c = i2;
        }
    }

    public void setMediaBgColor(int i) {
        this.f130170b = i;
    }

    public void setPhotoErrorResId(int i) {
        this.f130171c = i;
    }

    public void setTweetMediaClickListener(C52306n nVar) {
        this.f130174f = nVar;
    }

    public TweetMediaView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.f130173e || VERSION.SDK_INT < 18) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f130178j);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setVineCard(C52209m mVar) {
        if (mVar != null && mVar.f129960H != null && C52187t.m111610a(mVar.f129960H)) {
            this.f130175g = mVar;
            this.f130177i = Collections.emptyList();
            for (int i = 0; i < this.f130181m; i++) {
                C52294e eVar = this.f130176h[i];
                if (eVar != null) {
                    eVar.setVisibility(8);
                }
            }
            this.f130181m = 0;
            C52197d dVar = mVar.f129960H;
            this.f130181m = 1;
            C52294e eVar2 = this.f130176h[0];
            if (eVar2 == null) {
                eVar2 = new C52294e(getContext());
                eVar2.setLayoutParams(generateDefaultLayoutParams());
                eVar2.setOnClickListener(this);
                this.f130176h[0] = eVar2;
                addView(eVar2, 0);
            } else {
                m111705a(0, 0, 0);
                m111706a(0, 0, 0, 0, 0);
            }
            eVar2.setVisibility(0);
            eVar2.setBackgroundColor(this.f130170b);
            eVar2.setTag(R.id.dje, Integer.valueOf(0));
            C52201h hVar = (C52201h) dVar.f129924a.mo108925a("player_image");
            String str = hVar.f129934d;
            if (!TextUtils.isEmpty(str)) {
                eVar2.setContentDescription(str);
            } else {
                eVar2.setContentDescription(getResources().getString(R.string.f53));
            }
            String str2 = hVar.f129933c;
            C18396v vVar = C52312r.m111747a().f130273g;
            if (vVar != null) {
                vVar.mo36849a(str2).mo36880a().mo36887b().mo36881a(this.f130171c).mo36886a((ImageView) eVar2, (C18371e) new C52276b(eVar2));
            }
            eVar2.setOverlayDrawable(getContext().getResources().getDrawable(R.drawable.c9_));
            this.f130173e = false;
            requestLayout();
        }
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        Integer num = (Integer) view.getTag(R.id.dje);
        if (this.f130174f != null) {
            if (!this.f130177i.isEmpty()) {
                this.f130177i.get(num.intValue());
            }
            return;
        }
        if (!this.f130177i.isEmpty()) {
            C52203j jVar = (C52203j) this.f130177i.get(num.intValue());
            if ("video".equals(jVar.type) || "animated_gif".equals(jVar.type)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if ("photo".equals(jVar.type)) {
                    int intValue = num.intValue();
                    Intent intent = new Intent(getContext(), GalleryActivity.class);
                    intent.putExtra("GALLERY_ITEM", new C52259a(this.f130175g.f129969i, intValue, this.f130177i));
                    C52074f.m111396b(getContext(), intent);
                }
            } else if (C52300h.m111737a(jVar) != null) {
                Intent intent2 = new Intent(getContext(), PlayerActivity.class);
                if ("animated_gif".equals(jVar.type) || ("video".endsWith(jVar.type) && jVar.videoInfo.durationMillis < 6500)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C52261a aVar = new C52261a(C52300h.m111737a(jVar).url, z2, !"animated_gif".equals(jVar.type), null, null);
                intent2.putExtra("PLAYER_ITEM", aVar);
                C52074f.m111396b(getContext(), intent2);
            }
        } else {
            C52209m mVar = this.f130175g;
            C52197d dVar = mVar.f129960H;
            Intent intent3 = new Intent(getContext(), PlayerActivity.class);
            C52261a aVar2 = new C52261a((String) dVar.f129924a.mo108925a("player_stream_url"), true, false, null, null);
            intent3.putExtra("PLAYER_ITEM", aVar2);
            intent3.putExtra("SCRIBE_ITEM", C52144aa.fromTweetCard(mVar.f129969i, dVar));
            C52074f.m111396b(getContext(), intent3);
        }
    }

    public TweetMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new C52275a());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C52277c cVar;
        if (this.f130181m > 0) {
            int size = MeasureSpec.getSize(i);
            int size2 = MeasureSpec.getSize(i2);
            int i3 = (size - this.f130180l) / 2;
            int i4 = (size2 - this.f130180l) / 2;
            switch (this.f130181m) {
                case 1:
                    m111705a(0, size, size2);
                    break;
                case 2:
                    m111705a(0, i3, size2);
                    m111705a(1, i3, size2);
                    break;
                case 3:
                    m111705a(0, i3, size2);
                    m111705a(1, i3, i4);
                    m111705a(2, i3, i4);
                    break;
                case 4:
                    m111705a(0, i3, i4);
                    m111705a(1, i3, i4);
                    m111705a(2, i3, i4);
                    m111705a(3, i3, i4);
                    break;
            }
            int max = Math.max(size, 0);
            int max2 = Math.max(size2, 0);
            if (max == 0 && max2 == 0) {
                cVar = C52277c.f130183a;
            } else {
                cVar = new C52277c(max, max2);
            }
        } else {
            cVar = C52277c.f130183a;
        }
        setMeasuredDimension(cVar.f130184b, cVar.f130185c);
    }

    /* renamed from: a */
    private void m111705a(int i, int i2, int i3) {
        this.f130176h[i].measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    TweetMediaView(Context context, AttributeSet attributeSet, C52275a aVar) {
        super(context, attributeSet);
        this.f130176h = new C52294e[4];
        this.f130177i = Collections.emptyList();
        this.f130178j = new Path();
        this.f130179k = new RectF();
        this.f130169a = new float[8];
        this.f130170b = -16777216;
        this.f130172d = aVar;
        this.f130180l = getResources().getDimensionPixelSize(R.dimen.ud);
        this.f130171c = 2131956656;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f130178j.reset();
        this.f130179k.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f130178j.addRoundRect(this.f130179k, this.f130169a, Direction.CW);
        this.f130178j.close();
    }

    /* renamed from: a */
    private void m111706a(int i, int i2, int i3, int i4, int i5) {
        C52294e eVar = this.f130176h[i];
        if (eVar.getLeft() != i2 || eVar.getTop() != i3 || eVar.getRight() != i4 || eVar.getBottom() != i5) {
            eVar.layout(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f130181m > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i5 = (measuredWidth - this.f130180l) / 2;
            int i6 = (measuredHeight - this.f130180l) / 2;
            int i7 = this.f130180l + i5;
            switch (this.f130181m) {
                case 1:
                    m111706a(0, 0, 0, measuredWidth, measuredHeight);
                    return;
                case 2:
                    int i8 = measuredHeight;
                    m111706a(0, 0, 0, i5, i8);
                    m111706a(1, i5 + this.f130180l, 0, measuredWidth, i8);
                    return;
                case 3:
                    m111706a(0, 0, 0, i5, measuredHeight);
                    int i9 = i7;
                    int i10 = measuredWidth;
                    m111706a(1, i9, 0, i10, i6);
                    m111706a(2, i9, i6 + this.f130180l, i10, measuredHeight);
                    return;
                case 4:
                    int i11 = i5;
                    m111706a(0, 0, 0, i11, i6);
                    m111706a(2, 0, i6 + this.f130180l, i11, measuredHeight);
                    int i12 = i7;
                    int i13 = measuredWidth;
                    m111706a(1, i12, 0, i13, i6);
                    m111706a(3, i12, i6 + this.f130180l, i13, measuredHeight);
                    break;
            }
        }
    }
}
