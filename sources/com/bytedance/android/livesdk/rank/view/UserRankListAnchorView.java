package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;

public class UserRankListAnchorView extends RelativeLayout {

    /* renamed from: a */
    protected View f22497a;

    /* renamed from: b */
    protected ImageView f22498b;

    /* renamed from: c */
    protected TextView f22499c;

    /* renamed from: d */
    protected ImageView f22500d;

    /* renamed from: e */
    protected HSImageView f22501e;

    /* renamed from: f */
    protected TextView f22502f;

    /* renamed from: g */
    protected TextView f22503g;

    /* renamed from: h */
    protected TextView f22504h;

    /* renamed from: i */
    protected View f22505i;

    /* renamed from: j */
    protected View f22506j;

    /* renamed from: k */
    protected View f22507k;

    /* renamed from: l */
    protected long f22508l;

    /* renamed from: m */
    protected DataCenter f22509m;

    /* renamed from: n */
    C8335g<C3009i> f22510n;

    /* renamed from: o */
    private int f22511o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14383a() {
        C9432q.m18691b((View) this, 0);
        C9432q.m18691b(this.f22497a, 8);
        C9432q.m18691b(this.f22507k, 0);
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f22509m = dataCenter;
    }

    public void setLoginObserver(C8335g<C3009i> gVar) {
        this.f22510n = gVar;
    }

    public void setOwnerId(long j) {
        this.f22508l = j;
    }

    public UserRankListAnchorView(Context context) {
        super(context);
        m16317a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14384a(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("page_source", "contribution_ranklist");
        bundle.putString("enter_from", "live_detail");
        bundle.putString("user_id", String.valueOf(this.f22508l));
        if (this.f22511o == 1) {
            bundle.putString("type", "totally_rank");
        } else if (this.f22511o == 2) {
            bundle.putString("type", "weekly_rank");
        } else if (this.f22511o == 3) {
            bundle.putString("type", "live_room_rank");
        }
        if (this.f22509m != null) {
            User user = new User();
            user.setId(this.f22508l);
            this.f22509m.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
            this.f22509m.lambda$put$1$DataCenter("cmd_send_gift", user);
        }
    }

    /* renamed from: a */
    private void m16317a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.akv, this, true);
        this.f22497a = findViewById(R.id.c87);
        this.f22498b = (ImageView) findViewById(R.id.c8c);
        this.f22499c = (TextView) findViewById(R.id.c8g);
        this.f22500d = (ImageView) findViewById(R.id.dm3);
        this.f22501e = (HSImageView) findViewById(R.id.ay3);
        this.f22502f = (TextView) findViewById(R.id.dn1);
        this.f22503g = (TextView) findViewById(R.id.c8a);
        this.f22505i = findViewById(R.id.a6h);
        this.f22506j = findViewById(R.id.cl9);
        this.f22504h = (TextView) findViewById(R.id.d02);
        this.f22506j.setOnClickListener(new C8242k(this));
        this.f22507k = findViewById(R.id.bj_);
        this.f22507k.setOnClickListener(new C8243l(this));
    }

    public UserRankListAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16317a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14385a(C8219f fVar, int i) {
        String str;
        String str2;
        boolean z;
        int i2;
        float f;
        String str3;
        this.f22511o = i;
        int i3 = 0;
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            this.f22507k.setVisibility(0);
            this.f22497a.setVisibility(8);
        } else if (fVar == null) {
            this.f22507k.setVisibility(8);
            this.f22497a.setVisibility(8);
        } else {
            C9432q.m18691b((View) this, 0);
            C9432q.m18691b(this.f22497a, 0);
            C9432q.m18691b(this.f22507k, 8);
            if (fVar != null) {
                this.f22498b.setVisibility(8);
                this.f22499c.setVisibility(0);
                int i4 = fVar.f22444c;
                String valueOf = String.valueOf(i4);
                this.f22499c.setText(valueOf);
                if (fVar.f22443b > 0) {
                    if (i4 > 0 && i4 <= 100) {
                        switch (i4) {
                            case 1:
                                this.f22498b.setImageResource(R.drawable.c0z);
                                this.f22498b.setVisibility(0);
                                this.f22499c.setVisibility(8);
                                break;
                            case 2:
                                this.f22498b.setImageResource(R.drawable.c10);
                                this.f22498b.setVisibility(0);
                                this.f22499c.setVisibility(8);
                                break;
                            case 3:
                                this.f22498b.setImageResource(R.drawable.c11);
                                this.f22498b.setVisibility(0);
                                this.f22499c.setVisibility(8);
                                break;
                            default:
                                this.f22499c.setText(valueOf);
                                break;
                        }
                    } else if (this.f22511o == 17) {
                        this.f22499c.setText(getContext().getResources().getString(R.string.enr));
                    } else {
                        if (C8607a.f23572a) {
                            str3 = "-";
                        } else {
                            str3 = getContext().getResources().getString(R.string.enr);
                        }
                        this.f22499c.setText(str3);
                    }
                } else {
                    this.f22499c.setText("-");
                }
                this.f22499c.setVisibility(0);
                this.f22498b.setVisibility(8);
                TextView textView = (TextView) this.f22497a.findViewById(R.id.cky);
                if (this.f22511o == 17 && fVar.f22443b >= 0) {
                    String valueOf2 = String.valueOf(fVar.f22443b);
                    textView.setText(getResources().getString(R.string.ewo, new Object[]{valueOf2}));
                }
                if (!(getContext() == null || getContext().getResources() == null)) {
                    if (i4 <= 0 || i4 > 100) {
                        z = false;
                    } else {
                        z = true;
                    }
                    TextView textView2 = this.f22499c;
                    Resources resources = getContext().getResources();
                    if (z) {
                        i2 = R.color.alm;
                    } else {
                        i2 = R.color.aln;
                    }
                    textView2.setTextColor(resources.getColor(i2));
                    TextView textView3 = this.f22499c;
                    if (z) {
                        f = 20.0f;
                    } else {
                        f = 12.0f;
                    }
                    textView3.setTextSize(f);
                    if (fVar.f22443b <= 0) {
                        this.f22499c.setTextSize(20.0f);
                    }
                }
            }
            User user = fVar.f22442a;
            if (user != null) {
                C5213c.m11826b(this.f22500d, user.getAvatarThumb(), this.f22500d.getWidth(), this.f22500d.getHeight(), R.drawable.bt6);
                if (!(user.getBorder() == null || this.f22501e == null)) {
                    C3899m.m9868b(this.f22501e, user.getBorder().f8838a);
                }
                if (user.displayId == null || !((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
                    this.f22502f.setText(user.getNickName());
                } else {
                    this.f22502f.setText(user.displayId);
                }
            }
            if (fVar != null) {
                if (!C8607a.f23572a) {
                    if (!(getContext() == null || getContext().getResources() == null)) {
                        if (this.f22511o == 17) {
                            if (C9431p.m18664a(fVar.f22445d)) {
                                str2 = getContext().getResources().getString(R.string.f2y, new Object[]{C3890e.m9834b(fVar.f22443b)});
                            } else {
                                str2 = getContext().getResources().getString(R.string.f2x, new Object[]{C3890e.m9834b(fVar.f22443b), fVar.f22445d});
                            }
                            this.f22503g.setText(str2);
                        } else if (this.f22511o == 7) {
                            if (C9431p.m18664a(fVar.f22445d)) {
                                str = getContext().getResources().getString(R.string.f33, new Object[]{C3890e.m9834b(fVar.f22443b)});
                            } else {
                                str = getContext().getResources().getString(R.string.f32, new Object[]{C3890e.m9834b(fVar.f22443b), fVar.f22445d});
                            }
                            this.f22503g.setText(str);
                        } else {
                            this.f22503g.setText("");
                        }
                    }
                } else if (!TextUtils.isEmpty(fVar.f22445d)) {
                    String str4 = fVar.f22445d;
                    SpannableString spannableString = new SpannableString(str4);
                    while (i3 < str4.length()) {
                        char charAt = str4.charAt(i3);
                        if (Character.isDigit(charAt)) {
                            int i5 = i3 + 1;
                            while (i5 < str4.length() - 1 && Character.isDigit(str4.charAt(i5))) {
                                i5++;
                            }
                            spannableString.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.abh)), i3, i5, 18);
                            i3 = i5;
                        } else {
                            if (i3 > 0 && charAt == '.' && Character.isDigit(str4.charAt(i3 - 1))) {
                                spannableString.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.abh)), i3, i3 + 1, 18);
                            } else if (i3 > 0 && ((charAt == 'k' || charAt == 'm' || charAt == 'b') && Character.isDigit(str4.charAt(i3 - 1)))) {
                                spannableString.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.abh)), i3, i3 + 1, 18);
                            } else if (i3 < str4.length() - 1 && (charAt == 'k' || charAt == 'm' || charAt == 'b')) {
                                int i6 = i3 + 1;
                                if (Character.isDigit(str4.charAt(i6))) {
                                    spannableString.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.abh)), i3, i6, 18);
                                }
                            }
                            i3++;
                        }
                    }
                    this.f22503g.setText(spannableString);
                } else {
                    this.f22503g.setVisibility(8);
                    this.f22505i.setVisibility(8);
                }
                this.f22503g.setVisibility(8);
            }
        }
    }

    public UserRankListAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16317a(context);
    }

    public UserRankListAnchorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m16317a(context);
    }
}
