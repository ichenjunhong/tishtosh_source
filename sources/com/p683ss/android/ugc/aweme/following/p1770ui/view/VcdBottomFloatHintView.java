package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.C23771be.C23772a.C23773a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.vcd.C50506f;
import com.p683ss.android.ugc.vcd.C50513l;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.VcdBottomFloatHintView */
public class VcdBottomFloatHintView extends RelativeLayout {

    /* renamed from: a */
    public DmtTextView f84047a;

    /* renamed from: b */
    public String f84048b;

    /* renamed from: c */
    private RemoteImageView f84049c;

    /* renamed from: d */
    private Context f84050d;

    public VcdBottomFloatHintView(Context context) {
        this(context, null);
    }

    public VcdBottomFloatHintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VcdBottomFloatHintView(Context context, AttributeSet attributeSet, int i) {
        C32260c cVar;
        super(context, attributeSet, i);
        this.f84050d = context;
        LayoutInflater.from(context).inflate(R.layout.byb, this, true);
        this.f84047a = (DmtTextView) findViewById(R.id.f5l);
        this.f84049c = (RemoteImageView) findViewById(R.id.ef2);
        findViewById(R.id.az9).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                VcdBottomFloatHintView.this.setVisibility(8);
                VcdBottomFloatHintView vcdBottomFloatHintView = VcdBottomFloatHintView.this;
                if (AccountService.createIAccountServicebyMonsterPlugin().userService().getCurUser().getAwemeHotsoonAuth() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C50506f.m108851a();
                } else {
                    C50506f.m108851a();
                }
            }
        });
        final String str = "授权你在抖音火山版的关系链，方可查看完整关注列表。";
        this.f84047a.setText("");
        final SpannableString spannableString = new SpannableString(this.f84050d.getString(R.string.fo0));
        spannableString.setSpan(new ClickableSpan() {
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.parseColor("#FFFACE15"));
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                if (!TextUtils.isEmpty(VcdBottomFloatHintView.this.f84048b)) {
                    C26890h.m65011a("vcd_relation_acquire_bar_confirm", C23089d.m56640a().mo47829a("enter_from", VcdBottomFloatHintView.this.f84048b).f61491a);
                }
                C50513l.m108854a(VcdBottomFloatHintView.this.getContext(), new C23773a() {
                });
            }
        }, 0, spannableString.length(), 33);
        DmtTextView dmtTextView = this.f84047a;
        if (C32260c.f84058b == null) {
            C32260c.f84058b = new C32260c(0);
        } else if (C32260c.f84058b.f84060a != 0) {
            cVar = new C32260c(0);
            dmtTextView.setMovementMethod(cVar);
            this.f84047a.setText(str);
            this.f84047a.append(spannableString);
            final String charSequence = this.f84047a.getText().toString();
            this.f84047a.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    VcdBottomFloatHintView.this.f84047a.getViewTreeObserver().removeOnPreDrawListener(this);
                    Layout layout = VcdBottomFloatHintView.this.f84047a.getLayout();
                    String str = "";
                    int i = 0;
                    int i2 = 0;
                    while (i < VcdBottomFloatHintView.this.f84047a.getLineCount()) {
                        try {
                            int lineEnd = layout.getLineEnd(i);
                            i++;
                            String substring = charSequence.substring(i2, lineEnd);
                            i2 = lineEnd;
                            str = substring;
                        } catch (Throwable unused) {
                        }
                    }
                    if (str.length() > 0 && str.length() < 3) {
                        VcdBottomFloatHintView.this.f84047a.setText(str);
                        VcdBottomFloatHintView.this.f84047a.append("\n");
                        VcdBottomFloatHintView.this.f84047a.append(spannableString);
                    }
                    return false;
                }
            });
        }
        cVar = C32260c.f84058b;
        dmtTextView.setMovementMethod(cVar);
        this.f84047a.setText(str);
        this.f84047a.append(spannableString);
        final String charSequence2 = this.f84047a.getText().toString();
        this.f84047a.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                VcdBottomFloatHintView.this.f84047a.getViewTreeObserver().removeOnPreDrawListener(this);
                Layout layout = VcdBottomFloatHintView.this.f84047a.getLayout();
                String str = "";
                int i = 0;
                int i2 = 0;
                while (i < VcdBottomFloatHintView.this.f84047a.getLineCount()) {
                    try {
                        int lineEnd = layout.getLineEnd(i);
                        i++;
                        String substring = charSequence2.substring(i2, lineEnd);
                        i2 = lineEnd;
                        str = substring;
                    } catch (Throwable unused) {
                    }
                }
                if (str.length() > 0 && str.length() < 3) {
                    VcdBottomFloatHintView.this.f84047a.setText(str);
                    VcdBottomFloatHintView.this.f84047a.append("\n");
                    VcdBottomFloatHintView.this.f84047a.append(spannableString);
                }
                return false;
            }
        });
    }
}
