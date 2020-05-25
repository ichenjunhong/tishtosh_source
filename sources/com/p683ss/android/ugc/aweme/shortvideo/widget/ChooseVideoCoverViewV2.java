package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p094l.C2180b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 */
public final class ChooseVideoCoverViewV2 extends FrameLayout {

    /* renamed from: a */
    public C45568a f115158a;

    /* renamed from: b */
    public final C2180b<MotionEvent> f115159b;

    /* renamed from: c */
    private int f115160c;

    /* renamed from: d */
    private RecyclerView f115161d;

    /* renamed from: e */
    private C45621n f115162e;

    /* renamed from: f */
    private View f115163f;

    /* renamed from: g */
    private final C2201v<MotionEvent> f115164g;

    /* renamed from: h */
    private final C2201v<MotionEvent> f115165h;

    /* renamed from: i */
    private final C2201v<MotionEvent> f115166i;

    /* renamed from: j */
    private final C2201v<MotionEvent> f115167j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$a */
    public interface C45568a {
        /* renamed from: a */
        void mo86765a(float f);

        /* renamed from: b */
        void mo86769b(float f);

        /* renamed from: c */
        void mo86770c(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$b */
    static final class C45569b<T> implements C1710e<MotionEvent> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCoverViewV2 f115169a;

        C45569b(ChooseVideoCoverViewV2 chooseVideoCoverViewV2) {
            this.f115169a = chooseVideoCoverViewV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            this.f115169a.mo91862a(1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$c */
    static final class C45570c<T> implements C1710e<MotionEvent> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCoverViewV2 f115170a;

        C45570c(ChooseVideoCoverViewV2 chooseVideoCoverViewV2) {
            this.f115170a = chooseVideoCoverViewV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            this.f115170a.mo91862a(1.2f);
            ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f115170a;
            C52711k.m112236a((Object) motionEvent, "event");
            chooseVideoCoverViewV2.mo91863a(motionEvent);
            C45568a aVar = this.f115170a.f115158a;
            if (aVar != null) {
                aVar.mo86765a(this.f115170a.mo91864b(motionEvent));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$d */
    static final class C45571d<T> implements C1715j<MotionEvent> {

        /* renamed from: a */
        public static final C45571d f115171a = new C45571d();

        C45571d() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C52711k.m112240b(motionEvent, "ev");
            if (motionEvent.getActionMasked() == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$e */
    static final class C45572e<T> implements C1715j<MotionEvent> {

        /* renamed from: a */
        public static final C45572e f115172a = new C45572e();

        C45572e() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C52711k.m112240b(motionEvent, "ev");
            if (motionEvent.getActionMasked() == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$f */
    static final class C45573f<T> implements C1715j<MotionEvent> {

        /* renamed from: a */
        public static final C45573f f115173a = new C45573f();

        C45573f() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C52711k.m112240b(motionEvent, "ev");
            if (motionEvent.getActionMasked() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$g */
    static final class C45574g<T> implements C1715j<MotionEvent> {

        /* renamed from: a */
        public static final C45574g f115174a = new C45574g();

        C45574g() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C52711k.m112240b(motionEvent, "ev");
            if (motionEvent.getActionMasked() == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$h */
    static final class C45575h<T> implements C1710e<MotionEvent> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCoverViewV2 f115175a;

        C45575h(ChooseVideoCoverViewV2 chooseVideoCoverViewV2) {
            this.f115175a = chooseVideoCoverViewV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f115175a;
            C52711k.m112236a((Object) motionEvent, "event");
            chooseVideoCoverViewV2.mo91863a(motionEvent);
            C45568a aVar = this.f115175a.f115158a;
            if (aVar != null) {
                aVar.mo86769b(this.f115175a.mo91864b(motionEvent));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$i */
    static final class C45576i<T> implements C1710e<MotionEvent> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCoverViewV2 f115176a;

        C45576i(ChooseVideoCoverViewV2 chooseVideoCoverViewV2) {
            this.f115176a = chooseVideoCoverViewV2;
        }

        public final /* synthetic */ void accept(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            this.f115176a.mo91862a(1.0f);
            ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f115176a;
            C52711k.m112236a((Object) motionEvent, "event");
            chooseVideoCoverViewV2.mo91863a(motionEvent);
            C45568a aVar = this.f115176a.f115158a;
            if (aVar != null) {
                aVar.mo86770c(this.f115176a.mo91864b(motionEvent));
            }
        }
    }

    public ChooseVideoCoverViewV2(Context context) {
        this(context, null, 0, 6, null);
    }

    public ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getCoverSize() {
        return this.f115160c;
    }

    public final int getItemCount() {
        return this.f115160c;
    }

    public final RecyclerView getRecyclerView() {
        return this.f115161d;
    }

    public final View getShadowView() {
        return this.f115163f;
    }

    public final C45621n getVideoCoverView() {
        return this.f115162e;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final C1322a<C1352v> getAdapter() {
        return this.f115161d.getAdapter();
    }

    public final float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f115160c);
    }

    private final float getOneThumbHeight() {
        return ((float) this.f115162e.getHeight()) - (C9432q.m18687b(getContext(), 1.0f) * 2.0f);
    }

    public final void setItemCount(int i) {
        this.f115160c = i;
    }

    public final void setOnScrollListener(C45568a aVar) {
        C52711k.m112240b(aVar, "onScrollListener");
        this.f115158a = aVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "<set-?>");
        this.f115161d = recyclerView;
    }

    public final void setShadowView(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f115163f = view;
    }

    public final void setVideoCoverView(C45621n nVar) {
        C52711k.m112240b(nVar, "<set-?>");
        this.f115162e = nVar;
    }

    public final void setAdapter(C1322a<C1352v> aVar) {
        C52711k.m112240b(aVar, "adapter");
        this.f115161d.setAdapter(aVar);
    }

    /* renamed from: a */
    public final void mo91862a(float f) {
        this.f115162e.animate().scaleX(f).scaleY(f).setDuration(100).start();
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i;
        int i2;
        C52711k.m112240b(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float oneThumbWidth = getOneThumbWidth();
        float oneThumbHeight = getOneThumbHeight();
        if (((float) height) * oneThumbWidth > ((float) width) * oneThumbHeight) {
            i = (int) oneThumbHeight;
            i2 = (width * i) / height;
        } else {
            int i3 = (int) oneThumbWidth;
            int i4 = i3;
            i = (height * i3) / width;
            i2 = i4;
        }
        this.f115162e.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i2, i, true));
    }

    /* renamed from: a */
    public final void mo91863a(MotionEvent motionEvent) {
        if (motionEvent.getX() <= getOneThumbWidth() / 2.0f) {
            this.f115162e.setX(0.0f);
        } else if (motionEvent.getX() >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
            this.f115162e.setX(((float) getMeasuredWidth()) - getOneThumbWidth());
        } else {
            this.f115162e.setX(motionEvent.getX() - (getOneThumbWidth() / 2.0f));
        }
    }

    /* renamed from: b */
    public final float mo91864b(MotionEvent motionEvent) {
        float f;
        if (motionEvent.getX() <= getOneThumbWidth() / 2.0f) {
            f = 0.0f;
        } else if (motionEvent.getX() >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
            f = ((float) getMeasuredWidth()) - getOneThumbWidth();
        } else {
            f = motionEvent.getX() - (getOneThumbWidth() / 2.0f);
        }
        float measuredWidth = f / (((float) getMeasuredWidth()) - getOneThumbWidth());
        if (measuredWidth > 0.9f) {
            return 0.9f;
        }
        return measuredWidth;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f115162e.mo92002a(getMeasuredWidth() / this.f115160c, getMeasuredHeight());
    }

    public ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f115160c = 7;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setHasFixedSize(true);
        this.f115161d = recyclerView;
        C45621n nVar = new C45621n(context);
        nVar.setScaleType(ScaleType.CENTER_CROP);
        nVar.setColor(context.getResources().getColor(R.color.aw4));
        this.f115162e = nVar;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.hl);
        this.f115163f = view;
        C2180b<MotionEvent> l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create<MotionEvent>()");
        this.f115159b = l;
        this.f115164g = this.f115159b.mo6522a((C1715j<? super T>) C45572e.f115172a);
        this.f115165h = this.f115159b.mo6522a((C1715j<? super T>) C45573f.f115173a);
        this.f115166i = this.f115159b.mo6522a((C1715j<? super T>) C45574g.f115174a);
        this.f115167j = this.f115159b.mo6522a((C1715j<? super T>) C45571d.f115171a);
        addView(this.f115161d, new LayoutParams(-1, -1));
        addView(this.f115163f, new LayoutParams(-1, -1));
        addView(this.f115162e);
        setOnTouchListener(new OnTouchListener(this) {

            /* renamed from: a */
            final /* synthetic */ ChooseVideoCoverViewV2 f115168a;

            {
                this.f115168a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f115168a.f115159b.onNext(motionEvent);
                return true;
            }
        });
        this.f115164g.mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C45570c<Object>(this));
        this.f115165h.mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C45575h<Object>(this));
        this.f115166i.mo6534c(200, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C45576i<Object>(this));
        this.f115167j.mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C45569b<Object>(this));
    }

    public /* synthetic */ ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
