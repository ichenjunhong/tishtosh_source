package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView */
public class HotSearchWordsFlipperView extends ViewFlipper implements GenericLifecycleObserver {

    /* renamed from: a */
    List<C28446a> f74780a;

    /* renamed from: b */
    int f74781b;

    /* renamed from: c */
    int f74782c;

    /* renamed from: d */
    private C28447b f74783d;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView$a */
    public static class C28446a {

        /* renamed from: a */
        public final HotSearchItem f74784a;

        /* renamed from: b */
        public final AdDefaultSearchStruct f74785b;

        /* renamed from: a */
        public final int mo58080a() {
            if (this.f74785b != null) {
                return 2;
            }
            return 1;
        }

        /* renamed from: b */
        public final String mo58081b() {
            if (this.f74785b != null) {
                return this.f74785b.getDefaultWord();
            }
            return this.f74784a.getWord();
        }

        public C28446a(AdDefaultSearchStruct adDefaultSearchStruct) {
            this.f74785b = adDefaultSearchStruct;
        }

        public C28446a(HotSearchItem hotSearchItem) {
            this.f74784a = hotSearchItem;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView$b */
    public interface C28447b {
    }

    /* renamed from: b */
    public final void mo58072b() {
        if (isFlipping()) {
            stopFlipping();
        }
    }

    public void dismiss() {
        mo58072b();
        setVisibility(8);
    }

    public String getCurrentDisplayedWord() {
        C28446a currentItem = getCurrentItem();
        if (currentItem != null) {
            return currentItem.mo58081b();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo58071a() {
        setVisibility(0);
        if (!isFlipping()) {
            showNext();
            startFlipping();
        }
    }

    public C28446a getCurrentItem() {
        int displayedChild = getDisplayedChild();
        if (displayedChild < 0 || displayedChild >= this.f74780a.size()) {
            return null;
        }
        return (C28446a) this.f74780a.get(displayedChild);
    }

    public String getCurrentOperatedWord() {
        String str;
        C28446a currentItem = getCurrentItem();
        if (currentItem == null) {
            str = null;
        } else if (currentItem.f74785b == null) {
            return currentItem.f74784a.getRealSearchWord();
        } else {
            str = currentItem.f74785b.getSearchWord();
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo58073c() {
        C28446a currentItem = getCurrentItem();
        if (currentItem != null && currentItem.mo58080a() == 2) {
            HotSearchAdData adData = currentItem.f74784a.getAdData();
            if (adData != null) {
                C27936b.m66694b(adData.getTrackUrl(), adData.getCreativeId(), adData.getLogExtra());
            }
            C26077e.m63190a().mo53582a("result_ad").mo53593b("hot_search_keyword_show").mo53602g("default_search_keyword").mo53604i(currentItem.f74785b.getAdData().getLogExtra()).mo53580a(currentItem.f74785b.getAdData().getCreativeId()).mo53586a(getContext());
        }
    }

    public void setOnItemChangeListener(C28447b bVar) {
        this.f74783d = bVar;
    }

    public HotSearchWordsFlipperView(Context context) {
        this(context, null);
    }

    public void setDisplayedChild(int i) {
        int displayedChild = getDisplayedChild();
        super.setDisplayedChild(i);
        if (displayedChild != getDisplayedChild()) {
            if (this.f74783d != null) {
                getCurrentItem();
                getDisplayedChild();
            }
            mo58073c();
        }
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar == C0177a.ON_RESUME) {
            postDelayed(new C28481aj(this), 100);
        }
    }

    public HotSearchWordsFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ly, R.attr.aan, R.attr.aao});
        int i = obtainStyledAttributes.getInt(0, 2) * 1000;
        this.f74781b = obtainStyledAttributes.getColor(2, 15);
        this.f74782c = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.a81));
        this.f74780a = new ArrayList();
        int intValue = ((Integer) SharePrefCache.inst().getHotSearchWordsShowInterval().mo47782d()).intValue() * 1000;
        if (intValue <= 0) {
            intValue = i;
        }
        setFlipInterval(intValue);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.ey));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.ez));
        obtainStyledAttributes.recycle();
    }
}
