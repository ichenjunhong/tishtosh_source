package com.p683ss.ugc.live.barrage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2603b.C51607a;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.view.BarrageLayout */
public final class BarrageLayout extends View {

    /* renamed from: a */
    private final ArrayList<C51607a> f128921a;

    /* renamed from: b */
    private C51607a f128922b;

    public BarrageLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public BarrageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo105557a(C51607a aVar) {
        m110794a(aVar, this.f128921a.size());
    }

    /* renamed from: a */
    public final void mo105556a() {
        Iterator it = this.f128921a.iterator();
        while (it.hasNext()) {
            ((C51607a) it.next()).mo10732a();
        }
    }

    public final void draw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        super.draw(canvas);
        Iterator it = this.f128921a.iterator();
        while (it.hasNext()) {
            C51607a aVar = (C51607a) it.next();
            C52711k.m112240b(canvas, "canvas");
            Iterator it2 = aVar.f128900e.iterator();
            while (it2.hasNext()) {
                ((C51596a) it2.next()).mo10730a(canvas);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it = this.f128921a.iterator();
                while (it.hasNext()) {
                    C51607a aVar = (C51607a) it.next();
                    if (aVar.mo105549a(motionEvent)) {
                        this.f128922b = aVar;
                        return true;
                    }
                }
                break;
            case 1:
                if (this.f128922b == null) {
                    this.f128922b = null;
                    break;
                } else {
                    C51607a aVar2 = this.f128922b;
                    if (aVar2 == null) {
                        C52711k.m112234a();
                    }
                    return aVar2.mo105549a(motionEvent);
                }
            case 2:
            case 3:
                if (this.f128922b != null) {
                    C51607a aVar3 = this.f128922b;
                    if (aVar3 == null) {
                        C52711k.m112234a();
                    }
                    return aVar3.mo105549a(motionEvent);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m110794a(C51607a aVar, int i) {
        if (aVar != null) {
            if (i > this.f128921a.size() || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f128921a.add(i, aVar);
        }
    }

    public BarrageLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f128921a = new ArrayList<>();
    }

    public /* synthetic */ BarrageLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
