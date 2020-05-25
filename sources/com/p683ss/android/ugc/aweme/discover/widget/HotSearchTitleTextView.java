package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.hotspot.C28224a;
import com.p683ss.android.ugc.aweme.discover.hotspot.C28224a.C28225a;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView */
public final class HotSearchTitleTextView extends DmtTextView {

    /* renamed from: b */
    public boolean f75842b;

    /* renamed from: c */
    private HotSearchItem f75843c;

    /* renamed from: d */
    private boolean f75844d;

    /* renamed from: e */
    private boolean f75845e;

    /* renamed from: f */
    private boolean f75846f;

    public HotSearchTitleTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public HotSearchTitleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getNoDrawable() {
        return this.f75846f;
    }

    public final boolean getOld() {
        return this.f75845e;
    }

    public final boolean getSmall() {
        return this.f75844d;
    }

    public final void setInSpot(boolean z) {
        this.f75842b = z;
    }

    public final void setNoDrawable(boolean z) {
        this.f75846f = z;
    }

    public final void setOld(boolean z) {
        this.f75845e = z;
    }

    public final void setSmall(boolean z) {
        this.f75844d = z;
    }

    public final void setHotSearchItem(HotSearchItem hotSearchItem) {
        float f;
        float f2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        C52711k.m112240b(hotSearchItem, "item");
        this.f75843c = hotSearchItem;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (hotSearchItem.getType() == 1) {
            spannableStringBuilder.append("#");
            String word = hotSearchItem.getWord();
            if (word == null) {
                C52711k.m112234a();
            }
            CharSequence charSequence = word;
            int length = charSequence.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (charSequence.charAt(i2) <= ' ') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z3 = true;
                } else {
                    i3++;
                }
            }
            spannableStringBuilder.append(charSequence.subSequence(i3, length + 1).toString());
        } else if (hotSearchItem.getType() == 0) {
            String word2 = hotSearchItem.getWord();
            if (word2 == null) {
                C52711k.m112234a();
            }
            CharSequence charSequence2 = word2;
            int length2 = charSequence2.length() - 1;
            int i4 = 0;
            boolean z4 = false;
            while (i4 <= length2) {
                if (!z4) {
                    i = i4;
                } else {
                    i = length2;
                }
                if (charSequence2.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z4) {
                    if (!z) {
                        break;
                    }
                    length2--;
                } else if (!z) {
                    z4 = true;
                } else {
                    i4++;
                }
            }
            spannableStringBuilder.append(charSequence2.subSequence(i4, length2 + 1).toString());
            Drawable drawable = null;
            if (!this.f75842b) {
                switch (hotSearchItem.getLabel()) {
                    case 1:
                        drawable = getResources().getDrawable(R.drawable.duw);
                        break;
                    case 2:
                        drawable = getResources().getDrawable(R.drawable.dfd);
                        break;
                    case 3:
                        drawable = getResources().getDrawable(R.drawable.duv);
                        break;
                }
            } else {
                hotSearchItem.getLabel();
                if (!this.f75846f) {
                    boolean z5 = this.f75845e;
                    boolean z6 = this.f75844d;
                    Context context = getContext();
                    C52711k.m112236a((Object) context, "context");
                    C52711k.m112240b(context, "context");
                }
            }
            if (drawable != null) {
                if (this.f75842b) {
                    f = 16.0f;
                } else {
                    f = 13.0f;
                }
                if (C28225a.m67137a(C28224a.f74092a, hotSearchItem.getLabel(), this.f75842b, false, 4, null) > 0.0f) {
                    f2 = C28225a.m67137a(C28224a.f74092a, hotSearchItem.getLabel(), this.f75842b, false, 4, null);
                } else {
                    f2 = f;
                }
                drawable.setBounds(0, 0, (int) C9432q.m18687b(getContext(), f2), (int) C9432q.m18687b(getContext(), f));
                C10674a aVar = new C10674a(drawable);
                spannableStringBuilder.append(" *");
                spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        setText(spannableStringBuilder);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        C52711k.m112236a((Object) layout, "layout");
        if (layout.getEllipsisCount(layout.getLineCount() - 1) > 0 && this.f75843c != null) {
            HotSearchItem hotSearchItem = this.f75843c;
            if (hotSearchItem == null) {
                C52711k.m112234a();
            }
            if (hotSearchItem.getType() == 0) {
                CharSequence text = getText();
                HotSearchItem hotSearchItem2 = this.f75843c;
                if (hotSearchItem2 == null) {
                    C52711k.m112234a();
                }
                if (!TextUtils.equals(text, hotSearchItem2.getWord())) {
                    HotSearchItem hotSearchItem3 = this.f75843c;
                    if (hotSearchItem3 == null) {
                        C52711k.m112234a();
                    }
                    setText(hotSearchItem3.getWord());
                }
            }
        }
    }

    public HotSearchTitleTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ HotSearchTitleTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
