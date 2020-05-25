package com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.audiorecord.Point;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import java.util.Collection;
import java.util.Stack;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b */
public final class C43402b extends RelativeLayout {

    /* renamed from: a */
    public final ImageView f109720a;

    /* renamed from: b */
    final C43401a f109721b;

    /* renamed from: c */
    public int f109722c;

    /* renamed from: d */
    int f109723d;

    /* renamed from: e */
    int f109724e;

    /* renamed from: f */
    public int f109725f = -1;

    /* renamed from: g */
    public int f109726g = -1;

    /* renamed from: h */
    int f109727h = 1;

    /* renamed from: i */
    C43428d f109728i;

    /* renamed from: j */
    private int f109729j = -1;

    /* renamed from: k */
    private int f109730k = -1;

    /* renamed from: l */
    private final int f109731l = 50;

    /* renamed from: m */
    private final C43405c f109732m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$a */
    public static final class C43403a implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C43402b f109733a;

        C43403a(C43402b bVar) {
            this.f109733a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C52711k.m112240b(view, "v");
            C52711k.m112240b(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 1:
                    this.f109733a.mo88341a(view, motionEvent.getRawX(), true);
                    break;
                case 2:
                    this.f109733a.mo88341a(view, motionEvent.getRawX(), false);
                    break;
                case 3:
                    this.f109733a.mo88341a(view, motionEvent.getRawX(), true);
                    break;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$b */
    static final class C43404b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43402b f109734a;

        /* renamed from: b */
        final /* synthetic */ float f109735b;

        C43404b(C43402b bVar, float f) {
            this.f109734a = bVar;
            this.f109735b = f;
        }

        public final void run() {
            this.f109734a.mo88338a();
            this.f109734a.mo88340a((int) ((((float) this.f109734a.f109722c) + (((float) (this.f109734a.f109726g - this.f109734a.f109725f)) * this.f109735b)) - ((float) (this.f109734a.f109720a.getWidth() / 2))));
        }
    }

    /* renamed from: b */
    public final void mo88343b() {
        this.f109721b.invalidate();
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.f109721b.getMStack());
        return stack;
    }

    /* renamed from: a */
    public final void mo88338a() {
        this.f109725f = this.f109722c;
        this.f109726g = getWidth() - this.f109722c;
        this.f109729j = this.f109725f - (this.f109720a.getWidth() / 2);
        this.f109730k = this.f109726g - (this.f109720a.getWidth() / 2);
    }

    /* renamed from: c */
    private final int m95163c(int i) {
        if (i < this.f109729j) {
            i = this.f109729j;
        }
        if (i > this.f109730k) {
            return this.f109730k;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo88339a(float f) {
        post(new C43404b(this, f));
    }

    /* renamed from: b */
    public final Point mo88342b(int i) {
        Object push = this.f109721b.getMStack().push(new Point(i, i, System.currentTimeMillis()));
        C52711k.m112236a(push, "seekBar.mStack.push(Poin…tem.currentTimeMillis()))");
        return (Point) push;
    }

    public final void setStack(Stack<Point> stack) {
        C52711k.m112240b(stack, "s");
        this.f109721b.getMStack().clear();
        Collection collection = stack;
        if (!C9376b.m18558a(collection)) {
            this.f109721b.getMStack().addAll(collection);
        }
        mo88343b();
    }

    /* renamed from: a */
    public final void mo88340a(int i) {
        if (i >= 0) {
            LayoutParams layoutParams = this.f109720a.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (C47918gj.m103682a(getContext())) {
                    layoutParams2.setMarginEnd(m95163c(i));
                } else {
                    layoutParams2.leftMargin = m95163c(i);
                }
                this.f109720a.setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public C43402b(Context context, C43405c cVar) {
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(cVar, "scene");
        super(context);
        this.f109720a = new ImageView(context);
        this.f109721b = new C43401a(context);
        this.f109732m = cVar;
    }

    /* renamed from: a */
    public final void mo88341a(View view, float f, boolean z) {
        if (!this.f109732m.f109780q) {
            mo88338a();
            int i = (int) f;
            mo88340a(m95163c(i));
            float c = ((float) ((m95163c(i) + (view.getWidth() / 2)) - this.f109722c)) / ((float) (this.f109726g - this.f109725f));
            if (((double) c) > 0.99d) {
                c = 1.0f;
            }
            if (((double) c) < 0.01d) {
                c = 0.0f;
            }
            C43428d dVar = this.f109728i;
            if (dVar != null) {
                dVar.mo88366a(c, z);
            }
        }
    }
}
