package com.p683ss.android.ugc.gamora.editor;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.gamora.editor.v */
public final class C49527v extends C46722b {

    /* renamed from: a */
    public List<C46722b> f124265a = new ArrayList();

    /* renamed from: b */
    private List<C46722b> f124266b = new ArrayList();

    /* renamed from: c */
    private List<C46722b> f124267c = new ArrayList();

    /* renamed from: d */
    private List<C46722b> f124268d = new ArrayList();

    /* renamed from: e */
    private List<C46722b> f124269e = new ArrayList();

    /* renamed from: a */
    public final boolean mo87823a(C20385c cVar) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87823a(cVar)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87823a(cVar)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87823a(cVar)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87823a(cVar)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87823a(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo97455a(C46722b bVar) {
        this.f124266b.add(0, bVar);
    }

    /* renamed from: b */
    public final void mo97456b(C46722b bVar) {
        this.f124267c.add(0, bVar);
    }

    /* renamed from: c */
    public final void mo97457c(C46722b bVar) {
        this.f124265a.add(0, bVar);
    }

    /* renamed from: d */
    public final void mo97458d(C46722b bVar) {
        this.f124268d.add(bVar);
    }

    /* renamed from: e */
    public final void mo97459e(C46722b bVar) {
        this.f124269e.add(bVar);
    }

    /* renamed from: f */
    public final void mo97460f(C46722b bVar) {
        this.f124265a.remove(bVar);
        mo97457c(bVar);
    }

    /* renamed from: g */
    public final void mo97461g(C46722b bVar) {
        this.f124267c.remove(bVar);
        mo97456b(bVar);
    }

    /* renamed from: b */
    public final void mo88486b(C20382b bVar) {
        for (C46722b bVar2 : this.f124266b) {
            if (bVar2 != null) {
                bVar2.mo88486b(bVar);
            }
        }
        for (C46722b bVar3 : this.f124267c) {
            if (bVar3 != null) {
                bVar3.mo88486b(bVar);
            }
        }
        for (C46722b bVar4 : this.f124265a) {
            if (bVar4 != null) {
                bVar4.mo88486b(bVar);
            }
        }
        for (C46722b bVar5 : this.f124268d) {
            if (bVar5 != null) {
                bVar5.mo88486b(bVar);
            }
        }
        for (C46722b bVar6 : this.f124269e) {
            if (bVar6 != null) {
                bVar6.mo88486b(bVar);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo87819a(float f) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87819a(f)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87819a(f)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87819a(f)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87819a(f)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87819a(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87826b(float f) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87826b(f)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87826b(f)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87826b(f)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87826b(f)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87826b(f)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo87831c(float f) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87831c(f)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87831c(f)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87831c(f)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87831c(f)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87831c(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87834d(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87834d(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87834d(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87834d(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87834d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo88487e(MotionEvent motionEvent) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo88487e(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo88487e(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo88487e(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo88487e(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo88487e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87832c(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87832c(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87832c(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87832c(motionEvent)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87832c(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo88484a(C20382b bVar) {
        for (C46722b bVar2 : this.f124266b) {
            if (bVar2 != null && bVar2.mo88484a(bVar)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124267c) {
            if (bVar3 != null && bVar3.mo88484a(bVar)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124265a) {
            if (bVar4 != null && bVar4.mo88484a(bVar)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124268d) {
            if (bVar5 != null && bVar5.mo88484a(bVar)) {
                return true;
            }
        }
        for (C46722b bVar6 : this.f124269e) {
            if (bVar6 != null && bVar6.mo88484a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo88485a(C20382b bVar, float f, float f2) {
        for (C46722b bVar2 : this.f124266b) {
            if (bVar2 != null && bVar2.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124267c) {
            if (bVar3 != null && bVar3.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124265a) {
            if (bVar4 != null && bVar4.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124268d) {
            if (bVar5 != null && bVar5.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar6 : this.f124269e) {
            if (bVar6 != null && bVar6.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C46722b bVar : this.f124266b) {
            if (bVar != null && bVar.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar2 : this.f124267c) {
            if (bVar2 != null && bVar2.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar3 : this.f124265a) {
            if (bVar3 != null && bVar3.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar4 : this.f124268d) {
            if (bVar4 != null && bVar4.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C46722b bVar5 : this.f124269e) {
            if (bVar5 != null && bVar5.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return false;
    }
}
