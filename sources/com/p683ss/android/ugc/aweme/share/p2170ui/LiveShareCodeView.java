package com.p683ss.android.ugc.aweme.share.p2170ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p766a.p769c.C12169d;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView */
public final class LiveShareCodeView extends LinearLayout {

    /* renamed from: e */
    public static final C42239a f106773e = new C42239a(null);

    /* renamed from: a */
    public String f106774a;

    /* renamed from: b */
    public UrlModel f106775b;

    /* renamed from: c */
    public C42240b f106776c;

    /* renamed from: d */
    public Context f106777d;

    /* renamed from: f */
    private HashMap f106778f;

    /* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView$a */
    public static final class C42239a {
        private C42239a() {
        }

        public /* synthetic */ C42239a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView$b */
    public interface C42240b {
        /* renamed from: a */
        void mo86202a();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView$c */
    public static final class C42241c extends C12169d {

        /* renamed from: a */
        final /* synthetic */ LiveShareCodeView f106779a;

        public C42241c(LiveShareCodeView liveShareCodeView) {
            this.f106779a = liveShareCodeView;
        }

        /* renamed from: a */
        public final void mo23100a(Throwable th) {
            if (th != null) {
                C17840a.m43754b(th);
            }
            ((SmartCircleImageView) this.f106779a.mo86198a((int) R.id.ejg)).setImageBitmap(this.f106779a.getDefaultBitmap());
        }

        /* renamed from: a */
        public final void mo23099a(Bitmap bitmap) {
            if (bitmap != null) {
                ((SmartCircleImageView) this.f106779a.mo86198a((int) R.id.ejg)).setImageBitmap(LiveShareCodeView.m92674a(bitmap));
                C42240b bVar = this.f106779a.f106776c;
                if (bVar != null) {
                    bVar.mo86202a();
                }
            } else {
                ((SmartCircleImageView) this.f106779a.mo86198a((int) R.id.ejg)).setImageBitmap(this.f106779a.getDefaultBitmap());
                C42240b bVar2 = this.f106779a.f106776c;
                if (bVar2 != null) {
                    bVar2.mo86202a();
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo86198a(int i) {
        if (this.f106778f == null) {
            this.f106778f = new HashMap();
        }
        View view = (View) this.f106778f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106778f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Context getMContext() {
        return this.f106777d;
    }

    public final Bitmap getDefaultBitmap() {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f106777d.getResources(), R.drawable.di0);
        if (decodeResource == null) {
            C52711k.m112234a();
        }
        return m92674a(decodeResource);
    }

    public final void setMContext(Context context) {
        C52711k.m112240b(context, "<set-?>");
        this.f106777d = context;
    }

    public LiveShareCodeView(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    /* renamed from: a */
    public static Bitmap m92674a(Bitmap bitmap) {
        C52711k.m112240b(bitmap, "bmp");
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TileMode tileMode = TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = ((float) min) / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        C52711k.m112236a((Object) createBitmap, "newBitmap");
        return createBitmap;
    }

    public LiveShareCodeView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    public LiveShareCodeView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "mContext");
        super(context);
        this.f106777d = context;
        View.inflate(this.f106777d, R.layout.bys, this);
    }
}
