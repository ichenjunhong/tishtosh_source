package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.Editable;
import android.text.Selection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.util.C40569t;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w */
public final class C40462w extends C1164e implements C39978l, C39985s {

    /* renamed from: e */
    public static final C40463a f103300e = new C40463a(null);

    /* renamed from: a */
    public C39954ad f103301a;

    /* renamed from: b */
    public final C39948a f103302b = new C39948a();

    /* renamed from: c */
    public String f103303c;

    /* renamed from: d */
    public final Context f103304d;

    /* renamed from: f */
    private final boolean f103305f = this.f103307h.getBoolean("complete_avatar");

    /* renamed from: g */
    private final boolean f103306g = this.f103307h.getBoolean("complete_nickname");

    /* renamed from: h */
    private final Bundle f103307h;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$a */
    public static final class C40463a {
        private C40463a() {
        }

        public /* synthetic */ C40463a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$b */
    static final class C40464b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40462w f103308a;

        C40464b(C40462w wVar) {
            this.f103308a = wVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            CharSequence charSequence = this.f103308a.f103303c;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f103308a.f103302b.mo81843a(0);
                return;
            }
            C39948a aVar = this.f103308a.f103302b;
            Context context = this.f103308a.f103304d;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            AvatarImageView avatarImageView = (AvatarImageView) this.f103308a.findViewById(R.id.hi);
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            aVar.mo81844a(0, activity, avatarImageView, g.getCurUser());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$c */
    public static final class C40465c extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C40462w f103309a;

        C40465c(C40462w wVar) {
            this.f103309a = wVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            boolean z2;
            String str;
            String str2;
            C52711k.m112240b(editable, "s");
            C52711k.m112240b(editable, "$this$limitToMaxInput");
            CharSequence charSequence = editable;
            if (Character.codePointCount(charSequence, 0, editable.length()) > 20) {
                int selectionEnd = Selection.getSelectionEnd(charSequence);
                if (selectionEnd == 0) {
                    str = "";
                } else {
                    str = charSequence.subSequence(0, selectionEnd).toString();
                }
                if (selectionEnd == editable.length()) {
                    str2 = "";
                } else {
                    str2 = charSequence.subSequence(selectionEnd, charSequence.length()).toString();
                }
                int codePointCount = Character.codePointCount(str2, 0, str2.length());
                StringBuilder sb = new StringBuilder();
                int i = 20 - codePointCount;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                }
                sb.append(str2);
                Selection.setSelection(editable, C52753d.m112322d(editable.length() - str2.length(), editable.length()));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C10691a.m21545b(C11010c.m22280a(), C11010c.m22280a().getString(R.string.rc)).mo19066a();
            }
            if (charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ImageButton imageButton = (ImageButton) this.f103309a.findViewById(R.id.nh);
                C52711k.m112236a((Object) imageButton, "btn_clear");
                imageButton.setVisibility(4);
                DmtTextView dmtTextView = (DmtTextView) this.f103309a.findViewById(R.id.ccd);
                Context context = this.f103309a.getContext();
                C52711k.m112236a((Object) context, "context");
                dmtTextView.setTextColor(context.getResources().getColor(R.color.amp));
                DmtTextView dmtTextView2 = (DmtTextView) this.f103309a.findViewById(R.id.ccd);
                C52711k.m112236a((Object) dmtTextView2, "right_btn");
                dmtTextView2.setEnabled(false);
                return;
            }
            ImageButton imageButton2 = (ImageButton) this.f103309a.findViewById(R.id.nh);
            C52711k.m112236a((Object) imageButton2, "btn_clear");
            imageButton2.setVisibility(0);
            DmtTextView dmtTextView3 = (DmtTextView) this.f103309a.findViewById(R.id.ccd);
            Context context2 = this.f103309a.getContext();
            C52711k.m112236a((Object) context2, "context");
            dmtTextView3.setTextColor(context2.getResources().getColor(R.color.ja));
            DmtTextView dmtTextView4 = (DmtTextView) this.f103309a.findViewById(R.id.ccd);
            C52711k.m112236a((Object) dmtTextView4, "right_btn");
            dmtTextView4.setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$d */
    static final class C40466d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40462w f103310a;

        C40466d(C40462w wVar) {
            this.f103310a = wVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f103310a.findViewById(R.id.au2)).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$e */
    static final class C40467e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40462w f103311a;

        C40467e(C40462w wVar) {
            this.f103311a = wVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f103311a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$f */
    static final class C40468f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40462w f103312a;

        C40468f(C40462w wVar) {
            this.f103312a = wVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            LinearLayout linearLayout = (LinearLayout) this.f103312a.findViewById(R.id.au3);
            C52711k.m112236a((Object) linearLayout, "input_container");
            if (linearLayout.getVisibility() == 0) {
                DmtEditText dmtEditText = (DmtEditText) this.f103312a.findViewById(R.id.au2);
                C52711k.m112236a((Object) dmtEditText, "input");
                String valueOf = String.valueOf(dmtEditText.getText());
                if (!C40569t.m90003a(valueOf)) {
                    C10691a.m21548c(this.f103312a.f103304d, (int) R.string.cgq).mo19066a();
                    return;
                }
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                User curUser = g.getCurUser();
                C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
                if (C52711k.m112239a((Object) valueOf, (Object) curUser.getNickname())) {
                    this.f103312a.dismiss();
                    return;
                }
                C39954ad adVar = this.f103312a.f103301a;
                if (adVar == null) {
                    C52711k.m112237a("userPresent");
                }
                adVar.mo81851a(valueOf);
                ((DmtStatusView) this.f103312a.findViewById(R.id.csv)).mo19212f();
                return;
            }
            AvatarImageView avatarImageView = (AvatarImageView) this.f103312a.findViewById(R.id.hi);
            C52711k.m112236a((Object) avatarImageView, "avatar");
            if (avatarImageView.getVisibility() == 0) {
                CharSequence charSequence = this.f103312a.f103303c;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f103312a.f103302b.mo81847d();
                    ((DmtStatusView) this.f103312a.findViewById(R.id.csv)).mo19212f();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.w$g */
    static final class C40469g implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C40462w f103313a;

        C40469g(C40462w wVar) {
            this.f103313a = wVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            LinearLayout linearLayout = (LinearLayout) this.f103313a.findViewById(R.id.au3);
            C52711k.m112236a((Object) linearLayout, "input_container");
            if (linearLayout.getVisibility() == 0) {
                C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Void, Object>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40469g f103314a;

                    {
                        this.f103314a = r1;
                    }

                    public final /* synthetic */ Object then(C0013i iVar) {
                        DmtEditText dmtEditText = (DmtEditText) this.f103314a.f103313a.findViewById(R.id.au2);
                        if (dmtEditText != null) {
                            dmtEditText.requestFocus();
                            KeyboardUtils.m58182a(dmtEditText);
                        }
                        return null;
                    }
                }, C0013i.f25b);
            }
        }
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public final void cancel() {
        KeyboardUtils.m58184c((DmtEditText) findViewById(R.id.au2));
        super.cancel();
    }

    public final void dismiss() {
        KeyboardUtils.m58184c((DmtEditText) findViewById(R.id.au2));
        super.dismiss();
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        ((DmtStatusView) findViewById(R.id.csv)).mo19209d();
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (avatarUri == null) {
            C10691a.m21542b(getContext(), (int) R.string.cq).mo19066a();
            return;
        }
        C39954ad adVar = this.f103301a;
        if (adVar == null) {
            C52711k.m112237a("userPresent");
        }
        adVar.mo81855b(avatarUri.uri);
    }

    /* renamed from: a */
    private final void m89882a(int i) {
        while (true) {
            switch (i) {
                case 0:
                    LinearLayout linearLayout = (LinearLayout) findViewById(R.id.au3);
                    C52711k.m112236a((Object) linearLayout, "input_container");
                    linearLayout.setVisibility(0);
                    DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.ed0);
                    C52711k.m112236a((Object) dmtTextView, "input_bottom_hint");
                    dmtTextView.setVisibility(0);
                    if (this.f103306g && this.f103305f) {
                        ((DmtTextView) findViewById(R.id.ccd)).setText(R.string.gvw);
                    }
                    C26890h.m65011a("add_nickname_show", C23089d.m56640a().mo47829a("enter_from", this.f103307h.getString("enter_from")).mo47829a("enter_method", this.f103307h.getString("enter_method")).f61491a);
                    return;
                case 1:
                    AvatarImageView avatarImageView = (AvatarImageView) findViewById(R.id.hi);
                    C52711k.m112236a((Object) avatarImageView, "avatar");
                    ((C13833a) avatarImageView.getHierarchy()).mo25892a((int) R.drawable.dsb, C13818b.f36067g);
                    AvatarImageView avatarImageView2 = (AvatarImageView) findViewById(R.id.hi);
                    C52711k.m112236a((Object) avatarImageView2, "avatar");
                    avatarImageView2.setVisibility(0);
                    DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.e3h);
                    C52711k.m112236a((Object) dmtTextView2, "complete_avatar_hint");
                    dmtTextView2.setVisibility(0);
                    ((DmtTextView) findViewById(R.id.ccd)).setText(R.string.gvv);
                    DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.ccd);
                    Context context = getContext();
                    C52711k.m112236a((Object) context, "context");
                    dmtTextView3.setTextColor(context.getResources().getColor(R.color.amp));
                    C26890h.m65011a("add_head_show", C23089d.m56640a().mo47829a("enter_from", this.f103307h.getString("enter_from")).mo47829a("enter_method", this.f103307h.getString("enter_method")).f61491a);
                    return;
                case 2:
                    LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.au3);
                    C52711k.m112236a((Object) linearLayout2, "input_container");
                    linearLayout2.setVisibility(8);
                    DmtTextView dmtTextView4 = (DmtTextView) findViewById(R.id.ed0);
                    C52711k.m112236a((Object) dmtTextView4, "input_bottom_hint");
                    dmtTextView4.setVisibility(8);
                    ((DmtTextView) findViewById(R.id.title)).setText(R.string.gvx);
                    i = 1;
                default:
                    return;
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.bom, null));
        String string = this.f103307h.getString("enter_method");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1268958287) {
                if (hashCode == 950398559 && string.equals("comment")) {
                    this.f103301a = new C39954ad(3);
                    ((DmtTextView) findViewById(R.id.title)).setText(R.string.fvw);
                    if (this.f103306g && this.f103305f) {
                        ((DmtTextView) findViewById(R.id.cup)).setText(R.string.fvx);
                    } else if (this.f103306g) {
                        ((DmtTextView) findViewById(R.id.cup)).setText(R.string.fvy);
                    } else if (this.f103305f) {
                        ((DmtTextView) findViewById(R.id.cup)).setText(R.string.fvz);
                    }
                }
            } else if (string.equals("follow")) {
                this.f103301a = new C39954ad(2);
                ((DmtTextView) findViewById(R.id.title)).setText(R.string.gfo);
                if (this.f103306g && this.f103305f) {
                    ((DmtTextView) findViewById(R.id.cup)).setText(R.string.gfp);
                } else if (this.f103306g) {
                    ((DmtTextView) findViewById(R.id.cup)).setText(R.string.gfq);
                } else if (this.f103305f) {
                    ((DmtTextView) findViewById(R.id.cup)).setText(R.string.gfr);
                }
            }
        }
        if (this.f103306g) {
            m89882a(0);
        } else if (this.f103305f) {
            m89882a(1);
        }
        ((AvatarImageView) findViewById(R.id.hi)).setOnClickListener(new C40464b(this));
        ((DmtEditText) findViewById(R.id.au2)).addTextChangedListener(new C40465c(this));
        ((ImageButton) findViewById(R.id.nh)).setOnClickListener(new C40466d(this));
        ((DmtTextView) findViewById(R.id.eiw)).setOnClickListener(new C40467e(this));
        ((DmtTextView) findViewById(R.id.ccd)).setOnClickListener(new C40468f(this));
        ((DmtStatusView) findViewById(R.id.csv)).setBuilder(C10719a.m21676a(this.f103304d));
        setOnShowListener(new C40469g(this));
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.ccd);
        C52711k.m112236a((Object) dmtTextView, "right_btn");
        dmtTextView.setEnabled(false);
        C39954ad adVar = this.f103301a;
        if (adVar == null) {
            C52711k.m112237a("userPresent");
        }
        adVar.mo81850a((C39985s) this);
        this.f103302b.f101827c = this;
        C39948a aVar = this.f103302b;
        Context context = this.f103304d;
        if (!(context instanceof Activity)) {
            context = null;
        }
        aVar.mo80925b((Activity) context, null);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        if (str != null) {
            this.f103303c = str;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            Uri parse = Uri.parse(sb.toString());
            C13771c.m27875c().mo26191b(parse);
            C23515d.m57686b((AvatarImageView) findViewById(R.id.hi), parse.toString(), (int) C9432q.m18687b(getContext(), 84.0f), (int) C9432q.m18687b(getContext(), 84.0f));
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.ccd);
            C52711k.m112236a((Object) dmtTextView, "right_btn");
            dmtTextView.setEnabled(true);
            DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.ccd);
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            dmtTextView2.setTextColor(context.getResources().getColor(R.color.ja));
            ((DmtTextView) findViewById(R.id.e3h)).setText(R.string.gxh);
        }
    }

    public C40462w(Context context, Bundle bundle) {
        C52711k.m112240b(context, "myContext");
        C52711k.m112240b(bundle, "argument");
        super(context);
        this.f103304d = context;
        this.f103307h = bundle;
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        ((DmtStatusView) findViewById(R.id.csv)).mo19209d();
        C22971a.m56494a(this.f103304d, exc, R.string.czy);
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        ((DmtStatusView) findViewById(R.id.csv)).mo19209d();
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        C52711k.m112240b(user, "data");
        if (i == 0) {
            if (this.f103305f) {
                m89882a(2);
            } else {
                dismiss();
            }
            C26890h.m65011a("add_nickname_success", C23089d.m56640a().mo47829a("enter_from", this.f103307h.getString("enter_from")).mo47829a("enter_method", this.f103307h.getString("enter_method")).f61491a);
            ((DmtStatusView) findViewById(R.id.csv)).mo19209d();
        } else if (i == 4) {
            C23515d.m57669a((RemoteImageView) (AvatarImageView) findViewById(R.id.hi), user.getAvatarMedium());
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.czi).mo19066a();
            dismiss();
            C26890h.m65011a("add_head_success", C23089d.m56640a().mo47829a("enter_from", this.f103307h.getString("enter_from")).mo47829a("enter_method", this.f103307h.getString("enter_method")).f61491a);
            ((DmtStatusView) findViewById(R.id.csv)).mo19209d();
        }
    }
}
