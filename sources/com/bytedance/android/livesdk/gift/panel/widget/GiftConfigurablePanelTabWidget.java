package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.p030v4.p037e.C0776f;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.dialog.view.GiftTabTextView;
import com.bytedance.android.livesdk.gift.model.GiftOperation;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p388k.C7711c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.Widget;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class GiftConfigurablePanelTabWidget extends Widget implements OnClickListener {

    /* renamed from: a */
    public final List<GiftPage> f20734a = new ArrayList();

    /* renamed from: b */
    final Map<View, Integer> f20735b = new HashMap();

    /* renamed from: c */
    LinearLayout f20736c;

    /* renamed from: d */
    View f20737d;

    /* renamed from: e */
    public View f20738e;

    /* renamed from: f */
    boolean f20739f;

    /* renamed from: g */
    public GiftTabTextView f20740g;

    /* renamed from: h */
    boolean f20741h;

    /* renamed from: i */
    boolean f20742i;

    /* renamed from: j */
    HSImageView f20743j;

    /* renamed from: k */
    TextView f20744k;

    /* renamed from: l */
    HSImageView f20745l;

    /* renamed from: m */
    GiftOperation f20746m;

    /* renamed from: n */
    private ObjectAnimator f20747n;

    /* renamed from: o */
    private GiftDialogViewModel f20748o;

    /* renamed from: p */
    private GiftOperation f20749p;

    /* renamed from: q */
    private C1690c f20750q;

    /* renamed from: r */
    private Activity f20751r;

    public int getLayoutId() {
        return R.layout.ahr;
    }

    public void onClick(View view) {
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f20748o != null) {
            this.f20748o.mo13948a(this);
        }
        if (this.f20750q != null && !this.f20750q.isDisposed()) {
            this.f20750q.dispose();
        }
        if (this.f20747n != null) {
            this.f20747n.cancel();
            this.f20747n.removeAllListeners();
        }
        this.f20737d = null;
        this.f20740g = null;
        this.f20741h = false;
        this.f20751r = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13941a() {
        boolean z;
        if (this.f20737d != null) {
            int width = this.f20738e.getWidth();
            float x = this.f20737d.getX();
            int width2 = this.f20737d.getWidth();
            if ((this.f20737d instanceof GiftTabTextView) && ((GiftTabTextView) this.f20737d).mo13473a()) {
                width2 -= C3922z.m9899a(8.0f);
            }
            if (width > 0 && width2 > 0) {
                int i = (width2 - width) / 2;
                if (i < 0) {
                    i = 0;
                }
                float f = x + ((float) i);
                float x2 = this.f20738e.getX();
                if (this.f20747n != null) {
                    this.f20747n.cancel();
                    this.f20747n.removeAllListeners();
                }
                if (C0776f.m2189a(Locale.getDefault()) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Rect rect = new Rect();
                if (z && this.f20751r != null) {
                    this.f20751r.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    f = (((float) rect.right) - f) - C4577ap.m10990a(this.f20751r, 43.0f);
                }
                this.f20747n = ObjectAnimator.ofFloat(this.f20738e, "x", new float[]{x2, f});
                this.f20747n.setDuration(200);
                this.f20747n.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (GiftConfigurablePanelTabWidget.this.f20738e.getVisibility() != 0) {
                            GiftConfigurablePanelTabWidget.this.f20738e.setVisibility(0);
                        }
                    }
                });
                this.f20747n.start();
            }
        }
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        this.f20736c = (LinearLayout) this.contentView.findViewById(R.id.cx0);
        this.f20738e = this.contentView.findViewById(R.id.a2t);
        this.f20743j = (HSImageView) this.contentView.findViewById(R.id.bv2);
        this.f20744k = (TextView) this.contentView.findViewById(R.id.bv6);
        this.f20745l = (HSImageView) this.contentView.findViewById(R.id.bv5);
        if (this.dataCenter != null) {
            this.f20748o = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model", null);
        }
        if (this.f20748o != null) {
            this.f20748o.f20758E.observe(this, new C7580a(this));
            this.f20748o.f20760G.observe(this, new C7596b(this));
            this.f20748o.f20785r.observe(this, new C7597c(this));
            this.f20748o.f20777j.observe(this, new C7598d(this));
            this.f20748o.f20778k.observe(this, new C7599e(this));
            if (this.f20748o.f20774g == C7595ao.PROP) {
                z = true;
            } else {
                z = false;
            }
            this.f20739f = z;
        }
        if (this.f20750q != null && !this.f20750q.isDisposed()) {
            this.f20750q.dispose();
        }
        this.f20750q = C4495a.m10823a().mo10300a(C7711c.class).mo6545f((C1710e<? super T>) new C1710e<C7711c>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C7711c cVar = (C7711c) obj;
                GiftPage giftPage = null;
                for (GiftPage giftPage2 : GiftConfigurablePanelTabWidget.this.f20734a) {
                    if (giftPage2.pageType == 5) {
                        giftPage = giftPage2;
                    }
                }
                if (giftPage != null) {
                    GiftConfigurablePanelTabWidget.this.mo13942a(GiftConfigurablePanelTabWidget.this.f20740g, true, giftPage);
                }
            }
        });
        if (this.f20739f) {
            C7649u.m15656a().mo14017d();
            return;
        }
        if (((Boolean) C4525b.f12427by.mo10345a()).booleanValue()) {
            this.f20741h = true;
        }
    }

    public GiftConfigurablePanelTabWidget(Activity activity) {
        this.f20751r = activity;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13944a(boolean z) {
        this.f20741h = z;
        if (this.f20740g != null) {
            if (z) {
                C7647s.m15644a(5);
            }
            this.f20740g.mo13472a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13943a(GiftOperation giftOperation, int i) {
        int i2;
        int i3;
        if (!this.f20742i || i != 1) {
            this.f20746m = null;
            if (i == 0) {
                this.f20749p = giftOperation;
            } else if (giftOperation == null) {
                giftOperation = this.f20749p;
            }
            int i4 = 8;
            if (giftOperation == null) {
                this.f20743j.setVisibility(8);
                this.f20745l.setVisibility(8);
                this.f20744k.setVisibility(8);
                return;
            }
            ImageModel imageModel = giftOperation.leftImage;
            ImageModel imageModel2 = giftOperation.rightImage;
            String str = giftOperation.title;
            String str2 = giftOperation.titleColor;
            int i5 = giftOperation.titleSize;
            String str3 = giftOperation.schemeUrl;
            C5213c.m11820a(this.f20743j, imageModel);
            C5213c.m11820a(this.f20745l, imageModel2);
            this.f20744k.setText(str);
            try {
                this.f20744k.setTextColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
            }
            this.f20744k.setTextSize((float) i5);
            this.f20744k.setOnClickListener(new C7602h(this, str3, giftOperation));
            HSImageView hSImageView = this.f20743j;
            if (imageModel != null) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            hSImageView.setVisibility(i2);
            TextView textView = this.f20744k;
            if (TextUtils.isEmpty(str)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
            HSImageView hSImageView2 = this.f20745l;
            if (imageModel2 != null) {
                i4 = 0;
            }
            hSImageView2.setVisibility(i4);
            return;
        }
        this.f20746m = giftOperation;
    }

    /* renamed from: a */
    public final void mo13942a(View view, boolean z, GiftPage giftPage) {
        String str;
        if (view != null && giftPage != null) {
            if (this.f20737d instanceof TextView) {
                ((TextView) this.f20737d).setTextColor(this.context.getResources().getColor(R.color.ahx));
            } else if (this.f20737d instanceof GiftTabTextView) {
                ((GiftTabTextView) this.f20737d).setTextColor(this.context.getResources().getColor(R.color.ahx));
            }
            this.f20737d = view;
            if (this.f20737d instanceof TextView) {
                ((TextView) this.f20737d).setTextColor(this.context.getResources().getColor(R.color.alt));
            } else if (this.f20737d instanceof GiftTabTextView) {
                ((GiftTabTextView) this.f20737d).setTextColor(this.context.getResources().getColor(R.color.alt));
            }
            if (z) {
                mo13941a();
            }
            mo13943a(giftPage.operation, 0);
            if (this.f20748o != null) {
                this.f20748o.f20785r.postValue(null);
                this.f20748o.f20786s.postValue(null);
                this.f20748o.f20780m.postValue(Boolean.valueOf(false));
            }
            Integer num = (Integer) this.f20735b.get(this.f20737d);
            if (num != null) {
                this.f20748o.f20759F.postValue(num);
            }
            if (!TextUtils.isEmpty(giftPage.eventName)) {
                if (((C4282a) C4116c.m10249a(C4282a.class)).user() != null) {
                    str = String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
                } else {
                    str = "";
                }
                HashMap hashMap = new HashMap();
                Room room = (Room) this.dataCenter.get("data_room", null);
                if (room != null) {
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    hashMap.put("orientation", String.valueOf(room.getOrientation()));
                }
                hashMap.put("user_id", str);
                C8049c.m15979a().mo14202a(giftPage.eventName, hashMap, new C8059j(), Room.class);
            }
        }
    }
}
