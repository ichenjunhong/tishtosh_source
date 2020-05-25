package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26373af;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30789bd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.ui.TagLayout */
public class TagLayout extends LinearLayout {

    /* renamed from: e */
    public static final C23640a f63027e = new C23640a(7, 20);

    /* renamed from: f */
    private static final int f63028f = C23728o.m58241a(5.0d);

    /* renamed from: a */
    public Context f63029a;

    /* renamed from: b */
    public String f63030b;

    /* renamed from: c */
    public Aweme f63031c;

    /* renamed from: d */
    public TextView f63032d;

    /* renamed from: g */
    private int f63033g;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.TagLayout$a */
    public static class C23640a {

        /* renamed from: a */
        public final int f63037a = 7;

        /* renamed from: b */
        public final int f63038b;

        public C23640a(int i, int i2) {
            this.f63038b = i2;
        }
    }

    /* renamed from: a */
    private void m57974a() {
        if (this.f63032d != null) {
            removeView(this.f63032d);
        }
    }

    public void setEventType(String str) {
        this.f63030b = str;
    }

    public void setFeedFromPage(int i) {
        this.f63033g = i;
    }

    public TagLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public View mo49066a(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (i == ((Integer) childAt.getTag()).intValue()) {
                return childAt;
            }
        }
        return null;
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m57975a(int i, int i2) {
        if (i < i2) {
            while (i < i2) {
                removeView(getChildAt(i));
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m57976a(Aweme aweme, C23640a aVar) {
        boolean z;
        if (aweme != null && aweme.getTextVideoLabels() != null) {
            m57975a(aweme.getTextVideoLabels().size(), getChildCount());
            for (int i = 0; i < aweme.getTextVideoLabels().size(); i++) {
                LayoutParams layoutParams = new LayoutParams(-2, (int) C9432q.m18687b(this.f63029a, (float) aVar.f63038b));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f63029a, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f63029a, (float) aVar.f63037a);
                }
                AwemeTextLabelModel awemeTextLabelModel = (AwemeTextLabelModel) aweme.getTextVideoLabels().get(i);
                if (awemeTextLabelModel != null) {
                    if (!C47915gg.m103651b() || awemeTextLabelModel.getLabelType() != 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        View childAt = getChildAt(i);
                        if (childAt == null) {
                            DmtTextView dmtTextView = new DmtTextView(getContext());
                            addView(dmtTextView, -1, layoutParams);
                            m57973a((TextView) dmtTextView, awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                        } else if (childAt instanceof TextView) {
                            m57973a((TextView) getChildAt(i), awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                        } else {
                            removeView(childAt);
                            DmtTextView dmtTextView2 = new DmtTextView(getContext());
                            addView(dmtTextView2, i, layoutParams);
                            m57973a((TextView) dmtTextView2, awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m57978b(Aweme aweme, C23640a aVar) {
        if (aweme != null && aweme.getHybridLabels() != null) {
            m57975a(aweme.getHybridLabels().size(), getChildCount());
            for (int i = 0; i < aweme.getHybridLabels().size(); i++) {
                LayoutParams layoutParams = new LayoutParams(-2, (int) C9432q.m18687b(this.f63029a, 19.0f));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f63029a, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f63029a, (float) aVar.f63037a);
                }
                AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) aweme.getHybridLabels().get(i);
                if (awemeHybridLabelModel != null) {
                    View childAt = getChildAt(i);
                    if (childAt != null) {
                        removeView(childAt);
                    }
                    LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f63029a).inflate(R.layout.b4d, this, false);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(Color.parseColor(awemeHybridLabelModel.getBackgroundColor()));
                    gradientDrawable.setCornerRadius(C9432q.m18687b(this.f63029a, 2.0f));
                    linearLayout.setBackground(gradientDrawable);
                    RemoteImageView remoteImageView = (RemoteImageView) linearLayout.findViewById(R.id.ef5);
                    if (awemeHybridLabelModel.getImageUrl() != null) {
                        remoteImageView.setVisibility(0);
                        C23515d.m57672a(remoteImageView, awemeHybridLabelModel.getImageUrl(), (C13791d<C14045f>) new C30789bd<C14045f>(remoteImageView, this.f63029a));
                    } else {
                        remoteImageView.setVisibility(8);
                    }
                    DmtTextView dmtTextView = (DmtTextView) linearLayout.findViewById(R.id.dau);
                    dmtTextView.setText(awemeHybridLabelModel.getText());
                    dmtTextView.setTextColor(Color.parseColor(awemeHybridLabelModel.getTextColor()));
                    addView(linearLayout, i, layoutParams);
                    if (!TextUtils.isEmpty(awemeHybridLabelModel.getRefUrl())) {
                        linearLayout.setOnClickListener(new C23704n(awemeHybridLabelModel));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m57977a(List<AwemeLabelModel> list, C23640a aVar) {
        if (list != null) {
            m57975a(list.size(), getChildCount());
            for (int i = 0; i < list.size(); i++) {
                LayoutParams layoutParams = new LayoutParams(-2, (int) C9432q.m18687b(this.f63029a, (float) aVar.f63038b));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f63029a, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C9432q.m18687b(this.f63029a, (float) aVar.f63037a);
                }
                AwemeLabelModel awemeLabelModel = (AwemeLabelModel) list.get(i);
                View childAt = getChildAt(i);
                if (childAt != null && !(childAt instanceof RemoteImageView)) {
                    removeView(childAt);
                    childAt = null;
                }
                RemoteImageView remoteImageView = (RemoteImageView) childAt;
                if (awemeLabelModel != null) {
                    if (remoteImageView == null) {
                        remoteImageView = new RemoteImageView(this.f63029a);
                        addView(remoteImageView, i, layoutParams);
                    } else {
                        remoteImageView.setLayoutParams(layoutParams);
                    }
                    remoteImageView.setVisibility(0);
                    remoteImageView.setAlpha(1.0f);
                    UrlModel urlModels = awemeLabelModel.getUrlModels();
                    int labelType = awemeLabelModel.getLabelType();
                    remoteImageView.setTag(Integer.valueOf(labelType));
                    remoteImageView.setScaleType(ScaleType.FIT_XY);
                    if (labelType == 3) {
                        remoteImageView.setVisibility(8);
                    } else {
                        C23515d.m57672a(remoteImageView, urlModels, (C13791d<C14045f>) new C30789bd<C14045f>(remoteImageView, this.f63029a));
                    }
                }
            }
        }
    }

    public TagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f63033g = -1;
        this.f63029a = context;
    }

    /* renamed from: a */
    private static TextView m57973a(TextView textView, AwemeTextLabelModel awemeTextLabelModel, ViewGroup.LayoutParams layoutParams) {
        C26373af.m63820a((View) textView, awemeTextLabelModel);
        textView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) C23728o.m58241a(13.0d));
        textView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setGravity(16);
        textView.setBackgroundDrawable(C23729p.m58249a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) C23728o.m58241a(4.0d)));
        textView.setPadding(f63028f, 0, f63028f, 0);
        textView.setSingleLine();
        textView.setMaxEms(20);
        textView.setEllipsize(TruncateAt.END);
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
        return textView;
    }

    /* renamed from: b */
    public final void mo49068b(Aweme aweme, List<AwemeLabelModel> list, C23640a aVar) {
        this.f63031c = aweme;
        m57974a();
        int i = 8;
        if (aweme == null) {
            setVisibility(8);
            return;
        }
        if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
            m57978b(aweme, aVar);
        } else if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            m57977a(list, aVar);
        } else {
            m57976a(aweme, aVar);
        }
        if (getChildCount() > 0) {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: c */
    public final void mo49069c(Aweme aweme, List<AwemeLabelModel> list, C23640a aVar) {
        boolean z;
        String str;
        int i;
        this.f63031c = aweme;
        m57974a();
        int i2 = 8;
        if (aweme == null) {
            setVisibility(8);
            return;
        }
        if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
            m57978b(aweme, aVar);
        } else if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            m57977a(list, aVar);
            RelationDynamicLabel relationLabel = aweme.getRelationLabel();
            if (relationLabel != null && relationLabel.isValid()) {
                int i3 = 16;
                if (this.f63032d == null) {
                    DmtTextView dmtTextView = new DmtTextView(getContext());
                    dmtTextView.setTextSize(0, (float) C23728o.m58241a(13.0d));
                    dmtTextView.setTextColor(C23723j.m58216a(R.color.n6));
                    dmtTextView.setGravity(16);
                    dmtTextView.setBackgroundDrawable(C23729p.m58249a(C23723j.m58216a(R.color.v5), (float) C23728o.m58241a(4.0d)));
                    dmtTextView.setPadding(f63028f, 0, f63028f, 0);
                    dmtTextView.setSingleLine();
                    this.f63032d = dmtTextView;
                }
                String nickname = relationLabel.getNickname();
                String labelInfo = relationLabel.getLabelInfo();
                if (getChildCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i3 = 15;
                }
                if (TextUtils.isEmpty(nickname)) {
                    str = C23710a.m58194a(labelInfo, i3, "");
                } else {
                    StringBuilder sb = new StringBuilder("@");
                    sb.append(nickname);
                    String a = C23710a.m58194a(sb.toString(), (int) Math.ceil((double) (((float) i3) - C23710a.m58187a(labelInfo))), C23710a.f63235a);
                    if (!TextUtils.isEmpty(a)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a);
                        sb2.append(" ");
                        a = sb2.toString();
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(a);
                    sb3.append(labelInfo);
                    str = sb3.toString();
                }
                this.f63032d.setText(str);
                LayoutParams layoutParams = new LayoutParams(-2, -1);
                if (z) {
                    i = C23728o.m58241a(6.0d);
                } else {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                addView(this.f63032d, layoutParams);
            }
        } else {
            m57976a(aweme, aVar);
        }
        if (getChildCount() > 0) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    /* renamed from: a */
    public final void mo49067a(Aweme aweme, List<AwemeLabelModel> list, C23640a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((AwemeLabelModel) list.get(i)).getLabelType() != 100) {
                    arrayList.add(list.get(i));
                    break;
                } else {
                    i++;
                }
            }
        }
        mo49068b(aweme, arrayList, aVar);
    }
}
