package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.widget.C6640a.C6642a;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.e */
public final class C6673e extends C6640a {

    /* renamed from: q */
    public TextView f18219q;

    /* renamed from: e */
    public final void mo12760e() {
        super.mo12760e();
        if (this.f18219q != null) {
            this.f18219q.setText(this.f18134o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo12758c() {
        return LayoutInflater.from(getContext()).inflate(R.layout.ah8, this, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo12759d() {
        if (this.f18219q != null && this.f18219q.getVisibility() == 0) {
            this.f18219q.performClick();
        }
    }

    public final void setText(String str) {
        super.setText(str);
        if (this.f18219q != null) {
            this.f18219q.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12757b(final View view) {
        ImageView imageView = (ImageView) findViewById(R.id.cf1);
        this.f18219q = (TextView) findViewById(R.id.cf2);
        if (this.f18127h != null && this.f18127h.f23940a != null && this.f18127h.f23940a.getUrls() != null && this.f18127h.f23940a.getUrls().size() != 0) {
            CharSequence charSequence = null;
            Iterator it = this.f18127h.f23940a.getUrls().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    charSequence = str;
                    break;
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C5213c.m11819a(imageView, this.f18127h.f23940a, (C3910a) new C3910a() {

                    /* renamed from: c */
                    private boolean f18222c;

                    /* renamed from: a */
                    public final void mo9270a(ImageModel imageModel) {
                    }

                    /* renamed from: a */
                    public final void mo9272a(ImageModel imageModel, Exception exc) {
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo12803a(View view) {
                        if (C6673e.this.f18129j != null) {
                            C6673e.this.f18129j.mo12356a(C6673e.this.f18134o, C6673e.this.f18127h.f23944e);
                        }
                    }

                    /* renamed from: a */
                    public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                        int i3;
                        int i4;
                        float f;
                        if (!this.f18222c) {
                            this.f18222c = true;
                            int b = (int) C9432q.m18687b(C6673e.this.getContext(), ((float) i) / 2.0f);
                            int b2 = (int) C9432q.m18687b(C6673e.this.getContext(), ((float) i2) / 2.0f);
                            int i5 = b / 2;
                            int i6 = b2 / 2;
                            LayoutParams layoutParams = view.getLayoutParams();
                            layoutParams.width = b;
                            layoutParams.height = b2;
                            view.setLayoutParams(layoutParams);
                            if (C6673e.this.f18127h.f23948i != -1 || C6673e.this.f18127h.f23949j != -1) {
                                float f2 = 1.0f;
                                if (C6673e.this.f18127h.f23950k > 0) {
                                    f = ((float) C6673e.this.f18132m) / ((float) C6673e.this.f18127h.f23950k);
                                } else {
                                    f = 1.0f;
                                }
                                if (C6673e.this.f18127h.f23951l > 0) {
                                    f2 = ((float) C6673e.this.f18133n) / ((float) C6673e.this.f18127h.f23951l);
                                }
                                i4 = ((int) (((float) C6673e.this.f18127h.f23948i) * f)) - i5;
                                i3 = ((int) (((float) C6673e.this.f18127h.f23949j) * f2)) - i6;
                            } else if (C6673e.this.f18127h.f23954o == null || C6673e.this.f18127h.f23954o.size() <= 1) {
                                i4 = (C6673e.this.f18132m / 2) - i5;
                                i3 = (C6673e.this.f18133n / 3) - i6;
                            } else {
                                double d = (double) C6673e.this.f18132m;
                                double doubleValue = ((Double) C6673e.this.f18127h.f23954o.get(0)).doubleValue();
                                Double.isNaN(d);
                                i4 = (int) (d * doubleValue);
                                double d2 = (double) C6673e.this.f18133n;
                                double doubleValue2 = ((Double) C6673e.this.f18127h.f23954o.get(1)).doubleValue();
                                Double.isNaN(d2);
                                i3 = (int) (d2 * doubleValue2);
                            }
                            if (i4 < C6673e.this.f18131l[2]) {
                                i4 = C6673e.this.f18131l[2];
                            } else if (layoutParams.width + i4 > C6673e.this.f18131l[3]) {
                                i4 = C6673e.this.f18131l[3] - layoutParams.width;
                            }
                            if (i3 < C6673e.this.f18131l[0]) {
                                i3 = C6673e.this.f18131l[0];
                            } else if (layoutParams.height + i3 > C6673e.this.f18131l[1]) {
                                i3 = C6673e.this.f18131l[1] - layoutParams.height;
                            }
                            view.setX((float) i4);
                            view.setY((float) i3);
                            C6673e.this.f18127h.f23948i = i4 + i5;
                            C6673e.this.f18127h.f23949j = i3 + i6;
                            if (C6673e.this.f18128i && C6673e.this.f18129j != null) {
                                C6673e.this.f18129j.mo12360g();
                            }
                            if (1 == C6673e.this.f18127h.f23946g) {
                                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) C6673e.this.f18219q.getLayoutParams();
                                if (C6673e.this.f18127h.f23945f != null && C6673e.this.f18127h.f23945f.length == 4) {
                                    layoutParams2.leftMargin = (int) C9432q.m18687b(C6673e.this.getContext(), ((float) C6673e.this.f18127h.f23945f[0]) / 2.0f);
                                    layoutParams2.topMargin = (int) C9432q.m18687b(C6673e.this.getContext(), ((float) C6673e.this.f18127h.f23945f[1]) / 2.0f);
                                    layoutParams2.width = (int) C9432q.m18687b(C6673e.this.getContext(), ((float) C6673e.this.f18127h.f23945f[2]) / 2.0f);
                                    layoutParams2.height = (int) C9432q.m18687b(C6673e.this.getContext(), ((float) C6673e.this.f18127h.f23945f[3]) / 2.0f);
                                }
                                C6673e.this.f18219q.setLayoutParams(layoutParams2);
                                C6673e.this.f18219q.setTextSize(2, (float) (C6673e.this.f18127h.f23942c / 2));
                                C6673e.this.f18219q.setTextColor(Color.parseColor(C6673e.this.f18127h.f23941b));
                                String str = "";
                                if (!TextUtils.isEmpty(C6673e.this.f18134o)) {
                                    str = C6673e.this.f18134o;
                                } else if (!TextUtils.isEmpty(C6673e.this.f18127h.f23943d)) {
                                    str = C6673e.this.f18127h.f23943d;
                                }
                                C6673e.this.f18219q.setText(str);
                                C6673e.this.f18219q.setOnClickListener(new C6675f(this));
                                C6673e.this.f18219q.setVisibility(0);
                            } else {
                                C6673e.this.f18219q.setVisibility(8);
                            }
                            C6673e.this.setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    public C6673e(Context context, C8721u uVar, boolean z, int[] iArr, C6642a aVar) {
        super(context, uVar, z, iArr, aVar);
    }
}
