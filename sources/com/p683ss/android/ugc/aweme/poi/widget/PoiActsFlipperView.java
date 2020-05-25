package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiActsFlipperView */
public class PoiActsFlipperView extends ViewFlipper {

    /* renamed from: a */
    public List<C39092f> f100936a;

    /* renamed from: b */
    private int f100937b;

    /* renamed from: c */
    private int f100938c;

    /* renamed from: d */
    private C39067g f100939d;

    /* renamed from: e */
    private C39472a f100940e;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiActsFlipperView$a */
    public interface C39472a {
    }

    public int getCurrentPosition() {
        return getDisplayedChild();
    }

    /* renamed from: a */
    public final void mo80443a() {
        if (isFlipping()) {
            stopFlipping();
        }
    }

    public C39092f getCurrentItem() {
        int displayedChild = getDisplayedChild();
        if (displayedChild < 0 || displayedChild >= this.f100936a.size()) {
            return null;
        }
        return (C39092f) this.f100936a.get(displayedChild);
    }

    public void setOnItemChangeListener(C39472a aVar) {
        this.f100940e = aVar;
    }

    public PoiActsFlipperView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private TextView m87795a(C39092f fVar) {
        TextView textView = new TextView(getContext());
        textView.setSingleLine();
        textView.setText(fVar.getDescription());
        textView.setTextSize(1, (float) this.f100937b);
        textView.setEllipsize(TruncateAt.END);
        textView.setTextColor(this.f100938c);
        textView.setGravity(8388627);
        return textView;
    }

    public void setDisplayedChild(int i) {
        int displayedChild = getDisplayedChild();
        super.setDisplayedChild(i);
        int displayedChild2 = getDisplayedChild();
        if (displayedChild != displayedChild2) {
            if (this.f100940e != null) {
                getCurrentItem();
                getDisplayedChild();
            }
            int size = displayedChild2 % this.f100936a.size();
            m87796a((C39092f) this.f100936a.get(size), size);
        }
    }

    public PoiActsFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ly, R.attr.aan, R.attr.aao});
        this.f100937b = obtainStyledAttributes.getInt(2, 15);
        this.f100938c = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.a81));
        this.f100936a = new ArrayList();
        setFlipInterval(5000);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.ey));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.ez));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m87796a(C39092f fVar, int i) {
        C39452l.m87730a(this.f100939d, "banner_show", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f100939d.getPreviousPage()).mo47829a("banner_id", fVar.getBid()).mo47826a("client_order", i).mo47829a("city_info", C23198ae.m56845a()).mo47829a("from_poi_id", this.f100939d.getPoiId()));
    }

    /* renamed from: a */
    public final void mo80444a(List<C39092f> list, C39067g gVar) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            this.f100939d = gVar;
            if (isFlipping()) {
                stopFlipping();
            }
            this.f100936a.clear();
            this.f100936a.addAll(list);
            Collections.shuffle(this.f100936a);
            removeAllViews();
            for (int i = 0; i < this.f100936a.size(); i++) {
                C39092f fVar = (C39092f) this.f100936a.get(i);
                addView(m87795a(fVar), new LayoutParams(-1, -1));
                if (i == 0) {
                    m87796a(fVar, 0);
                }
            }
            if (this.f100936a.size() >= 2) {
                startFlipping();
            }
        }
    }
}
