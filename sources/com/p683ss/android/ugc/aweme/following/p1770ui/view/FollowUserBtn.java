package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a.C10684a;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10685b;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10686c;
import com.bytedance.ies.dmt.p664ui.common.rebranding.NiceWidthTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn */
public class FollowUserBtn extends RelativeLayout implements C10685b, C32259b {

    /* renamed from: a */
    protected NiceWidthTextView f84041a;

    /* renamed from: b */
    protected int f84042b;

    /* renamed from: c */
    protected int f84043c;

    /* renamed from: d */
    protected int f84044d;

    /* renamed from: e */
    public int f84045e;

    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        return R.drawable.de0;
    }

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        return R.color.a17;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.b4t;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowBgResId() {
        return R.drawable.ddx;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowTextColorResId() {
        return R.color.jf;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public LayoutParams getButtonLayoutParams() {
        return this.f84041a.getLayoutParams();
    }

    public C0184k getLifeCycleOwner() {
        return (FragmentActivity) C23729p.m58270d(this);
    }

    public FollowUserBtn(Context context) {
        this(context, null);
    }

    public void setForceWidth(int i) {
        if (this.f84043c != i) {
            this.f84043c = i;
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f84041a.setOnClickListener(onClickListener);
    }

    public void setButtonLayoutParams(LayoutParams layoutParams) {
        this.f84045e = layoutParams.width;
        C10683a.m21511a(getClass(), new C10684a(mo19031a((TextView) this.f84041a)));
        this.f84041a.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void setFollowButtonTextAndIcon(int i) {
        this.f84041a.setText(getResources().getText(R.string.b3w));
        setFollowButtonStyle(-1);
    }

    public void setText(String str) {
        setVisibility(0);
        setFollowButtonStyle(-1);
        this.f84041a.setText(str);
        this.f84041a.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
        this.f84041a.setBackground(getResources().getDrawable(getUnFollowBgResId()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo65359a(Drawable drawable) {
        int i = 0;
        if (this.f84041a == null || TextUtils.isEmpty(this.f84041a.getText())) {
            return 0;
        }
        TextPaint paint = this.f84041a.getPaint();
        Rect rect = new Rect();
        paint.getTextBounds(this.f84041a.getText().toString(), 0, this.f84041a.getText().toString().length(), rect);
        int width = rect.width();
        if (this.f84044d == 0) {
            this.f84044d = mo19031a((TextView) this.f84041a);
        }
        int i2 = this.f84044d;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        }
        return (int) ((((float) ((i2 - width) - i)) - C9432q.m18687b(getContext(), 4.0f)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void setFollowButtonStyle(int i) {
        if (i == -1) {
            this.f84041a.setPadding(0, 0, 0, 0);
            this.f84041a.setGravity(17);
            this.f84041a.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f84041a.setPadding(mo65359a(drawable), 0, 0, 0);
        this.f84041a.setCompoundDrawables(drawable, null, null, null);
        this.f84041a.setGravity(16);
    }

    /* renamed from: a */
    public int mo19031a(TextView textView) {
        if (this.f84043c != -1) {
            return this.f84043c;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.b55));
        arrayList.add(Integer.valueOf(R.string.as8));
        arrayList.add(Integer.valueOf(R.string.b4y));
        arrayList.add(Integer.valueOf(R.string.as_));
        arrayList.add(Integer.valueOf(R.string.gfm));
        return C10686c.m21513a(textView, arrayList, (int) C9432q.m18687b(getContext(), 60.0f), (int) C9432q.m18687b(getContext(), 120.0f));
    }

    public void setFollowStatus(int i) {
        if (this.f84042b != i) {
            this.f84042b = i;
            int followedBgResId = getFollowedBgResId();
            setVisibility(0);
            switch (i) {
                case 0:
                    this.f84041a.setText(getResources().getText(R.string.b3w));
                    this.f84041a.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
                    this.f84041a.setBackground(getResources().getDrawable(getUnFollowBgResId()));
                    return;
                case 1:
                    this.f84041a.setText(getResources().getText(R.string.b55));
                    this.f84041a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    this.f84041a.setBackground(getResources().getDrawable(followedBgResId));
                    return;
                case 2:
                    this.f84041a.setText(getResources().getText(R.string.as8));
                    this.f84041a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    this.f84041a.setBackground(getResources().getDrawable(followedBgResId));
                    return;
                case 3:
                    setVisibility(8);
                    break;
                case 4:
                    this.f84041a.setText(getResources().getText(R.string.b4y));
                    this.f84041a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    this.f84041a.setBackground(getResources().getDrawable(followedBgResId));
                    return;
            }
        }
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo65360a(int i, int i2) {
        int followedBgResId = getFollowedBgResId();
        setVisibility(0);
        switch (i) {
            case 0:
                setFollowButtonTextAndIcon(i2);
                this.f84041a.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
                this.f84041a.setBackground(getResources().getDrawable(getUnFollowBgResId()));
                break;
            case 1:
                setFollowButtonStyle(-1);
                this.f84041a.setText(getResources().getText(R.string.b55));
                this.f84041a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                this.f84041a.setBackground(getResources().getDrawable(followedBgResId));
                break;
            case 2:
                setFollowButtonStyle(-1);
                this.f84041a.setText(getResources().getText(R.string.as8));
                this.f84041a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                this.f84041a.setBackground(getResources().getDrawable(followedBgResId));
                break;
            case 3:
                setVisibility(8);
                break;
            case 4:
                setFollowButtonStyle(-1);
                this.f84041a.setText(getResources().getText(R.string.b4y));
                this.f84041a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                this.f84041a.setBackground(getResources().getDrawable(followedBgResId));
                break;
        }
        this.f84042b = i;
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f84043c = -1;
        mo65361a(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo65361a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ace});
        this.f84043c = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        obtainStyledAttributes.recycle();
        this.f84041a = (NiceWidthTextView) LayoutInflater.from(context).inflate(getLayout(), this, true).findViewById(R.id.ns);
        this.f84041a.mo19030a(this);
        this.f84044d = mo19031a((TextView) this.f84041a);
        C10683a.m21511a(getClass(), new C10684a(mo19031a((TextView) this.f84041a)));
        this.f84042b = 0;
    }
}
