package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView */
public class ChooseVideoCoverView extends FrameLayout implements OnTouchListener {

    /* renamed from: a */
    public int f115137a;

    /* renamed from: b */
    public C45621n f115138b;

    /* renamed from: c */
    private RecyclerView f115139c;

    /* renamed from: d */
    private Context f115140d;

    /* renamed from: e */
    private float f115141e;

    /* renamed from: f */
    private float f115142f;

    /* renamed from: g */
    private View f115143g;

    /* renamed from: h */
    private View f115144h;

    /* renamed from: i */
    private LayoutParams f115145i;

    /* renamed from: j */
    private LayoutParams f115146j;

    /* renamed from: k */
    private int f115147k;

    /* renamed from: l */
    private int f115148l;

    /* renamed from: m */
    private C45566b f115149m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a */
    public static class C45564a extends C1322a<C45565a> {

        /* renamed from: a */
        C45617m f115150a;

        /* renamed from: b */
        C52847n[] f115151b;

        /* renamed from: c */
        boolean f115152c;

        /* renamed from: d */
        C1690c f115153d;

        /* renamed from: e */
        private int f115154e;

        /* renamed from: f */
        private int f115155f;

        /* renamed from: g */
        private boolean f115156g;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a$a */
        public static class C45565a extends C1352v {

            /* renamed from: a */
            public ImageView f115157a;

            public C45565a(View view) {
                super(view);
                this.f115157a = (ImageView) view.findViewById(R.id.b4w);
            }
        }

        /* renamed from: a */
        public final void mo91860a() {
            this.f115153d.dispose();
        }

        public final int getItemCount() {
            return this.f115150a.f115388a;
        }

        /* renamed from: a */
        public final void mo91861a(boolean z) {
            if (this.f115156g ^ z) {
                this.f115156g = z;
                notifyDataSetChanged();
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.afs, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.f115155f;
            layoutParams.width = this.f115154e;
            imageView.setLayoutParams(layoutParams);
            return new C45565a(imageView);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (r0.isRecycled() == false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            if (r0.isRecycled() == false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (r1 < r0) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r4, int r5) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a$a r4 = (com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a.C45565a) r4
                int r0 = r3.getItemCount()
                boolean r1 = r3.f115156g
                if (r1 == 0) goto L_0x0013
                int r1 = r0 - r5
                int r1 = r1 + -1
                if (r1 < 0) goto L_0x0013
                if (r1 >= r0) goto L_0x0013
                goto L_0x0014
            L_0x0013:
                r1 = r5
            L_0x0014:
                d.n[] r0 = r3.f115151b
                r0 = r0[r1]
                r1 = 0
                if (r0 == 0) goto L_0x002a
                java.lang.Object r0 = r0.getSecond()
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                if (r0 == 0) goto L_0x002a
                boolean r2 = r0.isRecycled()
                if (r2 != 0) goto L_0x002a
                goto L_0x0040
            L_0x002a:
                d.n[] r0 = r3.f115151b
                r0 = r0[r1]
                if (r0 == 0) goto L_0x003f
                java.lang.Object r0 = r0.getSecond()
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                if (r0 == 0) goto L_0x003f
                boolean r2 = r0.isRecycled()
                if (r2 != 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                android.widget.ImageView r2 = r4.f115157a
                r2.setImageBitmap(r0)
                android.widget.ImageView r4 = r4.f115157a
                r4.setPadding(r1, r1, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
        }

        public C45564a(C42542c cVar, int i, int i2) {
            this(new C45617m(cVar, i, i2, cVar.mo78726a()), i, i2);
        }

        public C45564a(C45617m mVar, int i, int i2) {
            this.f115152c = true;
            this.f115150a = mVar;
            this.f115154e = i;
            this.f115155f = i2;
            this.f115151b = new C52847n[mVar.f115388a];
            this.f115153d = this.f115150a.mo92001a().mo6545f((C1710e<? super T>) new C45602d<Object>(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$b */
    public interface C45566b {
        /* renamed from: a */
        void mo78719a(float f);

        /* renamed from: b */
        void mo78720b(float f);

        /* renamed from: c */
        void mo78721c(float f);
    }

    public int getCoverSize() {
        return this.f115137a;
    }

    public int getFrameHeight() {
        return this.f115148l;
    }

    public int getFrameWidth() {
        return this.f115147k;
    }

    public C1322a getAdapter() {
        return this.f115139c.getAdapter();
    }

    public float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f115137a);
    }

    public float getOneThumbHeight() {
        return ((float) this.f115138b.getHeight()) - (C9432q.m18687b(getContext(), 1.0f) * 2.0f);
    }

    public void setCoverSize(int i) {
        this.f115137a = i;
    }

    public void setOnScrollListener(C45566b bVar) {
        this.f115149m = bVar;
    }

    public ChooseVideoCoverView(Context context) {
        this(context, null);
    }

    public void setAdapter(C1322a aVar) {
        this.f115139c.setAdapter(aVar);
    }

    public void setLayoutManager(C1332i iVar) {
        this.f115139c.setLayoutManager(iVar);
    }

    /* renamed from: b */
    private float m99216b(float f) {
        return f / ((float) (this.f115138b.getWidth() * this.f115137a));
    }

    /* renamed from: c */
    private void m99218c(float f) {
        if (this.f115149m != null) {
            this.f115149m.mo78719a(m99216b(f));
        }
    }

    /* renamed from: d */
    private void m99219d(float f) {
        if (this.f115149m != null) {
            this.f115149m.mo78721c(m99216b(f));
        }
    }

    /* renamed from: e */
    private void m99220e(float f) {
        if (this.f115149m != null) {
            this.f115149m.mo78720b(m99216b(f));
        }
    }

    /* renamed from: a */
    public final void mo91846a(boolean z) {
        if (this.f115138b != null) {
            this.f115138b.setOnTouchListener(null);
            this.f115138b.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m99217b(MotionEvent motionEvent) {
        float a = m99215a(motionEvent);
        this.f115138b.animate().x(a).y(this.f115138b.getY()).setDuration(0).start();
        mo91845a(a);
        m99220e(a);
    }

    /* renamed from: a */
    public void mo91845a(float f) {
        this.f115145i.width = (int) (f - 0.0f);
        this.f115143g.setLayoutParams(this.f115145i);
        this.f115146j.width = (int) ((((float) getMeasuredWidth()) - f) + ((float) this.f115138b.getWidth()));
        this.f115144h.setX(f + ((float) this.f115138b.getWidth()));
        this.f115144h.setLayoutParams(this.f115146j);
    }

    public void setVideoCoverFrameView(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int oneThumbWidth = (int) getOneThumbWidth();
            int oneThumbHeight = (int) getOneThumbHeight();
            int i = height * oneThumbWidth;
            int i2 = width * oneThumbHeight;
            if (i > i2) {
                oneThumbWidth = i2 / height;
            } else {
                oneThumbHeight = i / width;
            }
            this.f115138b.setImageBitmap(Bitmap.createScaledBitmap(bitmap, oneThumbWidth, oneThumbHeight, true));
        }
    }

    /* renamed from: a */
    private float m99215a(MotionEvent motionEvent) {
        this.f115141e = (float) ((ViewGroup) getParent()).getPaddingLeft();
        this.f115142f = (float) getPaddingLeft();
        float rawX = (this.f115142f + (motionEvent.getRawX() - this.f115141e)) - (((float) this.f115138b.getWidth()) / 2.0f);
        if (rawX > ((float) (this.f115138b.getWidth() * (this.f115137a - 1)))) {
            rawX = (float) (this.f115138b.getWidth() * (this.f115137a - 1));
        }
        if (rawX < 0.0f) {
            return 0.0f;
        }
        return rawX;
    }

    public ChooseVideoCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f115138b.mo92002a(getMeasuredWidth() / this.f115137a, getMeasuredHeight());
        mo91845a(this.f115138b.getX());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        if (str.equals("tag_VideoCoverFrameView")) {
            switch (motionEvent.getAction()) {
                case 0:
                    m99218c(m99215a(motionEvent));
                    break;
                case 1:
                    m99219d(m99215a(motionEvent));
                    break;
                case 2:
                    m99217b(motionEvent);
                    break;
            }
            return true;
        } else if (!str.equals("tag_RecyclerView")) {
            return super.onTouchEvent(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    m99218c(m99215a(motionEvent));
                    break;
                case 1:
                    m99217b(motionEvent);
                    m99219d(m99215a(motionEvent));
                    break;
            }
            return true;
        }
    }

    public ChooseVideoCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115137a = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ip, R.attr.iq, R.attr.j6, R.attr.j7, R.attr.mi, R.attr.mj, R.attr.s7, R.attr.acz, R.attr.ad0, R.attr.vq, R.attr.a1z, R.attr.adk, R.attr.adl});
            this.f115147k = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            this.f115148l = Math.round(obtainStyledAttributes.getDimension(4, 0.0f));
        }
        this.f115140d = context;
        this.f115139c = new RecyclerView(this.f115140d);
        this.f115139c.setTag("tag_RecyclerView");
        this.f115139c.setOnTouchListener(this);
        addView(this.f115139c, new LayoutParams(-1, -1));
        this.f115138b = new C45621n(this.f115140d);
        this.f115138b.setScaleType(ScaleType.CENTER_CROP);
        this.f115138b.setColor(getResources().getColor(R.color.aw4));
        this.f115138b.setTag("tag_VideoCoverFrameView");
        this.f115138b.setOnTouchListener(this);
        addView(this.f115138b);
        this.f115143g = new View(this.f115140d);
        this.f115145i = new LayoutParams(-1, -1);
        this.f115143g.setBackgroundResource(R.drawable.hl);
        this.f115144h = new View(this.f115140d);
        this.f115146j = new LayoutParams(-1, -1);
        this.f115144h.setBackgroundResource(R.drawable.hl);
    }
}
