package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify */
public class AvatarImageWithVerify extends FrameLayout {

    /* renamed from: k */
    private static C23621e[] f62895k = {new C23620d(), new C23619c(), new C23618b(), new C23617a(), new C23622f()};

    /* renamed from: a */
    public ImageView f62896a;

    /* renamed from: b */
    public ImageView f62897b;

    /* renamed from: c */
    public ImageView f62898c;

    /* renamed from: d */
    public ImageView f62899d;

    /* renamed from: e */
    public ImageView f62900e;

    /* renamed from: f */
    private SmartAvatarImageView f62901f;

    /* renamed from: g */
    private UserVerify f62902g;

    /* renamed from: h */
    private int f62903h;

    /* renamed from: i */
    private int f62904i;

    /* renamed from: j */
    private int[] f62905j;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$a */
    static class C23617a implements C23621e {
        private C23617a() {
        }

        /* renamed from: a */
        public final void mo48972a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62896a.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo48974b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62896a.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo48973a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (userVerify == null || TextUtils.isEmpty(userVerify.getCustomVerify())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$b */
    static class C23618b implements C23621e {
        private C23618b() {
        }

        /* renamed from: a */
        public final void mo48972a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62900e.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo48974b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62900e.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo48973a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (userVerify.getVerificationType().intValue() == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$c */
    static class C23619c implements C23621e {
        private C23619c() {
        }

        /* renamed from: a */
        public final void mo48972a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62899d.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo48974b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62899d.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo48973a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (!TextUtils.isEmpty(userVerify.getEnterpriseVerifyReason())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$d */
    static class C23620d implements C23621e {
        private C23620d() {
        }

        /* renamed from: a */
        public final void mo48972a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62898c.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo48974b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62898c.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo48973a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (userVerify.getVerificationType().intValue() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$e */
    interface C23621e {
        /* renamed from: a */
        void mo48972a(AvatarImageWithVerify avatarImageWithVerify);

        /* renamed from: a */
        boolean mo48973a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify);

        /* renamed from: b */
        void mo48974b(AvatarImageWithVerify avatarImageWithVerify);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$f */
    static class C23622f implements C23621e {
        private C23622f() {
        }

        /* renamed from: a */
        public final void mo48972a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62897b.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo48974b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f62897b.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo48973a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            String str;
            if (TextUtils.isEmpty(userVerify.getCustomVerify())) {
                str = userVerify.getWeiboVerify();
            } else {
                str = userVerify.getCustomVerify();
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
    }

    public SmartAvatarImageView getAvatarImageView() {
        return this.f62901f;
    }

    /* access modifiers changed from: protected */
    public int getVerifyIconMarginEnd() {
        return -this.f62904i;
    }

    public int getVerifyIconSize() {
        return this.f62903h;
    }

    /* access modifiers changed from: protected */
    public LayoutParams getAvatarLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: b */
    public final void mo48964b() {
        for (C23621e b : f62895k) {
            b.mo48974b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48963a() {
        this.f62901f = new SmartAvatarImageView(getContext());
        addView(this.f62901f, getAvatarLayoutParams());
        LayoutParams a = m57897a(getVerifyIconSize());
        this.f62896a = new ImageView(getContext());
        try {
            this.f62896a.setImageDrawable(getResources().getDrawable(R.drawable.ah4));
        } catch (NotFoundException unused) {
        }
        this.f62896a.setVisibility(8);
        LayoutParams a2 = m57897a(getVerifyIconSize());
        this.f62897b = new ImageView(getContext());
        try {
            this.f62897b.setImageDrawable(getResources().getDrawable(R.drawable.ah4));
        } catch (NotFoundException unused2) {
        }
        this.f62897b.setVisibility(8);
        this.f62898c = new ImageView(getContext());
        try {
            this.f62898c.setImageDrawable(getResources().getDrawable(R.drawable.ah3));
        } catch (NotFoundException unused3) {
        }
        this.f62898c.setVisibility(8);
        this.f62899d = new ImageView(getContext());
        try {
            this.f62899d.setImageDrawable(getResources().getDrawable(R.drawable.ah0));
        } catch (NotFoundException unused4) {
        }
        this.f62899d.setVisibility(8);
        this.f62900e = new ImageView(getContext());
        try {
            this.f62900e.setImageDrawable(getResources().getDrawable(R.drawable.ah3));
        } catch (NotFoundException unused5) {
        }
        this.f62900e.setVisibility(8);
        addView(this.f62896a, a);
        addView(this.f62897b, a2);
        addView(this.f62898c, a2);
        addView(this.f62899d, a2);
        addView(this.f62900e, a2);
    }

    public void setRequestImgSize(int[] iArr) {
        this.f62905j = iArr;
    }

    public AvatarImageWithVerify(Context context) {
        this(context, null);
    }

    public void setPlaceHolder(int i) {
        ((C13833a) this.f62901f.getHierarchy()).mo25892a(i, C13818b.f36067g);
    }

    /* renamed from: a */
    private LayoutParams m57897a(int i) {
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 8388693;
        m57898a(layoutParams, getVerifyIconMarginEnd());
        return layoutParams;
    }

    public void setUserData(UserVerify userVerify) {
        if (this.f62902g == null || userVerify == null || this.f62902g.getAvatarThumb() != userVerify.getAvatarThumb()) {
            int i = 0;
            setClipChildren(false);
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            this.f62902g = userVerify;
            if (userVerify == null) {
                this.f62901f.setController(null);
                C23621e[] eVarArr = f62895k;
                int length = eVarArr.length;
                while (i < length) {
                    eVarArr[i].mo48974b(this);
                    i++;
                }
                return;
            }
            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(userVerify.getAvatarThumb()));
            if (this.f62905j != null) {
                a.mo23125b(this.f62905j);
            }
            a.mo23116a((C12197k) this.f62901f).mo23118a("Avatar").mo23121a();
            C23621e[] eVarArr2 = f62895k;
            int length2 = eVarArr2.length;
            boolean z = false;
            while (i < length2) {
                C23621e eVar = eVarArr2[i];
                if (z || !eVar.mo48973a(this, userVerify)) {
                    eVar.mo48974b(this);
                } else {
                    eVar.mo48972a(this);
                    z = true;
                }
                i++;
            }
        }
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m57898a(LayoutParams layoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(i);
        } else if (C47918gj.m103682a(getContext())) {
            layoutParams.leftMargin = i;
        } else {
            layoutParams.rightMargin = i;
        }
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62903h = (int) C9432q.m18687b(C11010c.m22280a(), 16.0f);
        this.f62904i = (int) C9432q.m18687b(C11010c.m22280a(), 2.0f);
        mo48963a();
    }
}
