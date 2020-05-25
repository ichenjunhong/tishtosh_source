package com.facebook.login.p989a;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.os.Bundle;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C13850e;
import com.facebook.C13896h;
import com.facebook.C14533n;
import com.facebook.Profile;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14308d.C14310b;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import com.facebook.login.C14503a;
import com.facebook.login.C14521d;
import com.facebook.login.LoginManager;
import com.facebook.login.p989a.C14513b.C14518b;
import com.facebook.p909a.C13589l;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.login.a.a */
public class C14504a extends C13896h {

    /* renamed from: g */
    private static final String f37683g = "com.facebook.login.a.a";

    /* renamed from: d */
    public boolean f37684d;

    /* renamed from: e */
    public C14509a f37685e = new C14509a();

    /* renamed from: f */
    public String f37686f = "fb_login_view_usage";

    /* renamed from: h */
    private String f37687h;

    /* renamed from: i */
    private String f37688i;

    /* renamed from: j */
    private boolean f37689j;

    /* renamed from: k */
    private C14518b f37690k = C14518b.BLUE;

    /* renamed from: l */
    private C14512c f37691l;

    /* renamed from: m */
    private long f37692m = 6000;

    /* renamed from: n */
    private C14513b f37693n;

    /* renamed from: o */
    private C13850e f37694o;

    /* renamed from: p */
    private LoginManager f37695p;

    /* renamed from: com.facebook.login.a.a$a */
    static class C14509a {

        /* renamed from: a */
        public C14503a f37702a = C14503a.FRIENDS;

        /* renamed from: b */
        public List<String> f37703b = Collections.emptyList();

        /* renamed from: c */
        public C14521d f37704c = C14521d.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        public String f37705d = "rerequest";

        C14509a() {
        }
    }

    /* renamed from: com.facebook.login.a.a$b */
    protected class C14510b implements OnClickListener {
        /* renamed from: a */
        private LoginManager m29731a() {
            LoginManager a = LoginManager.m29666a();
            a.mo26703a(C14504a.this.getDefaultAudience());
            a.mo26704a(C14504a.this.getLoginBehavior());
            a.mo26705a(C14504a.this.getAuthType());
            return a;
        }

        protected C14510b() {
        }

        public final void onClick(View view) {
            String str;
            C14504a aVar = C14504a.this;
            if (aVar.f36242b != null) {
                aVar.f36242b.onClick(view);
            }
            AccessToken a = AccessToken.m27253a();
            int i = 0;
            if (AccessToken.m27257b()) {
                Context context = C14504a.this.getContext();
                final LoginManager a2 = m29731a();
                if (C14504a.this.f37684d) {
                    String string = C14504a.this.getResources().getString(R.string.a6i);
                    String string2 = C14504a.this.getResources().getString(R.string.a6e);
                    Profile a3 = Profile.m27312a();
                    if (a3 == null || a3.f35253f == null) {
                        str = C14504a.this.getResources().getString(R.string.a6l);
                    } else {
                        str = C2240a.m6772a(C14504a.this.getResources().getString(R.string.a6k), new Object[]{a3.f35253f});
                    }
                    Builder builder = new Builder(context);
                    builder.setMessage(str).setCancelable(true).setPositiveButton(string, new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            a2.mo26711b();
                        }
                    }).setNegativeButton(string2, null);
                    builder.create().show();
                } else {
                    a2.mo26711b();
                }
            } else {
                LoginManager a4 = m29731a();
                if (C14504a.this.getFragment() != null) {
                    a4.mo26708a(C14504a.this.getFragment(), (Collection<String>) C14504a.this.f37685e.f37703b);
                } else if (C14504a.this.getNativeFragment() != null) {
                    a4.mo26707a(C14504a.this.getNativeFragment(), (Collection<String>) C14504a.this.f37685e.f37703b);
                } else {
                    a4.mo26706a(C14504a.this.getActivity(), (Collection<String>) C14504a.this.f37685e.f37703b);
                }
            }
            C13589l lVar = new C13589l(C14504a.this.getContext());
            Bundle bundle = new Bundle();
            String str2 = "logging_in";
            if (a == null) {
                i = 1;
            }
            bundle.putInt(str2, i);
            bundle.putInt("access_token_expired", AccessToken.m27257b() ? 1 : 0);
            lVar.mo25411b(C14504a.this.f37686f, bundle);
        }
    }

    /* renamed from: com.facebook.login.a.a$c */
    public enum C14512c {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static C14512c DEFAULT;

        /* renamed from: a */
        private String f37710a;

        /* renamed from: b */
        private int f37711b;

        public final int getValue() {
            return this.f37711b;
        }

        public final String toString() {
            return this.f37710a;
        }

        static {
            DEFAULT = AUTOMATIC;
        }

        public static C14512c fromInt(int i) {
            C14512c[] values;
            for (C14512c cVar : values()) {
                if (cVar.getValue() == i) {
                    return cVar;
                }
            }
            return null;
        }

        private C14512c(String str, int i) {
            this.f37710a = str;
            this.f37711b = i;
        }
    }

    public int getDefaultStyleResource() {
        return R.style.sw;
    }

    public long getToolTipDisplayTime() {
        return this.f37692m;
    }

    public C14512c getToolTipMode() {
        return this.f37691l;
    }

    public String getAuthType() {
        return this.f37685e.f37705d;
    }

    public C14503a getDefaultAudience() {
        return this.f37685e.f37702a;
    }

    public int getDefaultRequestCode() {
        return C14310b.Login.toRequestCode();
    }

    public C14521d getLoginBehavior() {
        return this.f37685e.f37704c;
    }

    /* access modifiers changed from: protected */
    public C14510b getNewLoginClickListener() {
        return new C14510b();
    }

    /* access modifiers changed from: 0000 */
    public List<String> getPermissions() {
        return this.f37685e.f37703b;
    }

    /* renamed from: b */
    private void m29725b() {
        if (this.f37693n != null) {
            this.f37693n.dismiss();
            this.f37693n = null;
        }
    }

    public LoginManager getLoginManager() {
        if (this.f37695p == null) {
            this.f37695p = LoginManager.m29666a();
        }
        return this.f37695p;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37694o != null && !this.f37694o.f36138d) {
            this.f37694o.mo25987a();
            mo26729a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37694o != null) {
            C13850e eVar = this.f37694o;
            if (eVar.f36138d) {
                eVar.f36137c.mo2402a(eVar.f36136b);
                eVar.f36138d = false;
            }
        }
        m29725b();
    }

    /* renamed from: a */
    public final void mo26729a() {
        String str;
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.m27257b()) {
            if (this.f37688i != null) {
                str = this.f37688i;
            } else {
                str = resources.getString(R.string.a6j);
            }
            setText(str);
        } else if (this.f37687h != null) {
            setText(this.f37687h);
        } else {
            String string = resources.getString(R.string.a6g);
            int width = getWidth();
            if (width != 0 && m29726c(string) > width) {
                string = resources.getString(R.string.a6f);
            }
            setText(string);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLoginManager(LoginManager loginManager) {
        this.f37695p = loginManager;
    }

    /* access modifiers changed from: 0000 */
    public void setProperties(C14509a aVar) {
        this.f37685e = aVar;
    }

    public void setToolTipDisplayTime(long j) {
        this.f37692m = j;
    }

    public void setToolTipMode(C14512c cVar) {
        this.f37691l = cVar;
    }

    public void setToolTipStyle(C14518b bVar) {
        this.f37690k = bVar;
    }

    public void setAuthType(String str) {
        this.f37685e.f37705d = str;
    }

    public void setDefaultAudience(C14503a aVar) {
        this.f37685e.f37702a = aVar;
    }

    public void setLoginBehavior(C14521d dVar) {
        this.f37685e.f37704c = dVar;
    }

    public void setLoginText(String str) {
        this.f37687h = str;
        mo26729a();
    }

    public void setLogoutText(String str) {
        this.f37688i = str;
        mo26729a();
    }

    public void setPermissions(List<String> list) {
        this.f37685e.f37703b = list;
    }

    public void setPublishPermissions(List<String> list) {
        this.f37685e.f37703b = list;
    }

    public void setReadPermissions(List<String> list) {
        this.f37685e.f37703b = list;
    }

    public void setPermissions(String... strArr) {
        this.f37685e.f37703b = Arrays.asList(strArr);
    }

    public void setPublishPermissions(String... strArr) {
        this.f37685e.f37703b = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.f37685e.f37703b = Arrays.asList(strArr);
    }

    public C14504a(Context context) {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    /* renamed from: c */
    private int m29726c(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + mo26051a(str) + getCompoundPaddingRight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26730b(String str) {
        this.f37693n = new C14513b(str, this);
        this.f37693n.f37715d = this.f37690k;
        this.f37693n.f37716e = this.f37692m;
        this.f37693n.mo26764a();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f37689j && !isInEditMode()) {
            this.f37689j = true;
            switch (this.f37691l) {
                case AUTOMATIC:
                    final String a = C14277aa.m29250a(getContext());
                    C14533n.m29771e().execute(new Runnable() {
                        public final void run() {
                            final C14336o a = C14338p.m29399a(a, false);
                            C14504a.this.getActivity().runOnUiThread(new Runnable() {
                                public final void run() {
                                    C14504a aVar = C14504a.this;
                                    C14336o oVar = a;
                                    if (oVar != null && oVar.f37291c && aVar.getVisibility() == 0) {
                                        aVar.mo26730b(oVar.f37290b);
                                    }
                                }
                            });
                        }
                    });
                    return;
                case DISPLAY_ALWAYS:
                    mo26730b(getResources().getString(R.string.a6t));
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            m29725b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.f37687h;
        if (str == null) {
            str = resources.getString(R.string.a6g);
            int c = m29726c(str);
            if (resolveSize(c, i) < c) {
                str = resources.getString(R.string.a6f);
            }
        }
        int c2 = m29726c(str);
        String str2 = this.f37688i;
        if (str2 == null) {
            str2 = resources.getString(R.string.a6j);
        }
        setMeasuredDimension(resolveSize(Math.max(c2, m29726c(str2)), i), compoundPaddingTop);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo26052a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo26052a(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        this.f37691l = C14512c.DEFAULT;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.hg, R.attr.hk, R.attr.hl, R.attr.hq}, i, i2);
        try {
            this.f37684d = obtainStyledAttributes.getBoolean(0, true);
            this.f37687h = obtainStyledAttributes.getString(1);
            this.f37688i = obtainStyledAttributes.getString(2);
            this.f37691l = C14512c.fromInt(obtainStyledAttributes.getInt(3, C14512c.DEFAULT.getValue()));
            obtainStyledAttributes.recycle();
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.he));
                this.f37687h = "Continue with Facebook";
            } else {
                this.f37694o = new C13850e() {
                    /* renamed from: a */
                    public final void mo25988a(AccessToken accessToken, AccessToken accessToken2) {
                        C14504a.this.mo26729a();
                    }
                };
            }
            mo26729a();
            setCompoundDrawablesWithIntrinsicBounds(C1124a.m3315b(getContext(), R.drawable.uo), null, null, null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo26729a();
    }
}
