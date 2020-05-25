package com.bytedance.android.livesdk.admin.p276d;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.admin.p273a.C4529a;
import com.bytedance.android.livesdk.admin.p274b.C4531b;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import com.bytedance.android.livesdk.admin.p275c.C4533a;
import com.bytedance.android.livesdk.admin.p277e.C4546a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p330f.C6766a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.admin.d.b */
public final class C4539b extends C6766a implements C4546a {

    /* renamed from: a */
    public TextView f12483a;

    /* renamed from: b */
    public View f12484b;

    /* renamed from: c */
    public HSImageView f12485c;

    /* renamed from: d */
    public Context f12486d;

    /* renamed from: e */
    C4531b f12487e;

    /* renamed from: f */
    public C4533a f12488f = new C4533a(this);

    /* renamed from: g */
    public long f12489g;

    /* renamed from: h */
    public long f12490h;

    /* renamed from: j */
    private VHeadView f12491j;

    /* renamed from: k */
    private TextView f12492k;

    /* renamed from: a */
    public final void mo10360a(C4532c cVar, Exception exc) {
    }

    /* renamed from: a */
    public final Map<String, String> mo10359a() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f12489g));
        hashMap.put("room_id", String.valueOf(this.f12490h));
        hashMap.put("user_id", String.valueOf(this.f12487e.f12464a.getId()));
        return hashMap;
    }

    /* renamed from: a */
    public final <T> void mo10361a(T t) {
        ImageModel imageModel;
        if (t instanceof C4531b) {
            this.f12487e = (C4531b) t;
            User user = this.f12487e.f12464a;
            if (user != null) {
                if (user.getAvatarThumb() != null) {
                    C5213c.m11824b(this.f12491j, user.getAvatarThumb());
                } else {
                    this.f12491j.setImageResource(R.drawable.bt6);
                }
                this.f12491j.setOnClickListener(new C4544c(user));
                this.f12492k.setText(user.getNickName());
                if (user.getUserHonor() != null) {
                    imageModel = user.getUserHonor().mo8156k();
                } else {
                    imageModel = null;
                }
                if (imageModel == null || C9376b.m18558a((Collection<T>) imageModel.getUrls())) {
                    this.f12485c.setVisibility(8);
                } else {
                    C5213c.m11819a((ImageView) this.f12485c, imageModel, (C3910a) new C3910a() {
                        /* renamed from: a */
                        public final void mo9270a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo9272a(ImageModel imageModel, Exception exc) {
                        }

                        /* renamed from: a */
                        public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                            LayoutParams layoutParams = C4539b.this.f12485c.getLayoutParams();
                            int a = C3922z.m9899a(32.0f);
                            layoutParams.width = a;
                            layoutParams.height = (i2 * a) / i;
                            C4539b.this.f12485c.setLayoutParams(layoutParams);
                        }
                    });
                    this.f12485c.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10363a(boolean z, Exception exc) {
        if (!z) {
            this.f12483a.setVisibility(0);
            this.f12484b.setVisibility(8);
            C4602l.m11046a(this.f12486d, exc);
        }
    }

    /* renamed from: a */
    public final void mo10362a(boolean z, User user) {
        if (!z) {
            this.f12483a.setVisibility(0);
            this.f12484b.setVisibility(8);
            C4495a.m10823a().mo10301a((Object) new C4529a(z, user.getId()));
            C4575an.m10981a((int) R.string.hqw);
        }
    }

    public C4539b(Context context, View view, long j, long j2) {
        super(view, 0);
        this.f12491j = (VHeadView) view.findViewById(R.id.ao6);
        this.f12483a = (TextView) view.findViewById(R.id.qa);
        this.f12484b = view.findViewById(R.id.qg);
        this.f12492k = (TextView) view.findViewById(R.id.dn1);
        this.f12485c = (HSImageView) view.findViewById(R.id.dme);
        this.f12483a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                C4539b bVar = C4539b.this;
                if (!(bVar.f12487e == null || bVar.f12487e.f12464a == null)) {
                    if (!C4545d.m10933a(bVar.f12486d)) {
                        C4204a.m10421a(bVar.f12486d, (int) R.string.e77);
                    } else {
                        User user = bVar.f12487e.f12464a;
                        if (user != null) {
                            String string = bVar.f12486d.getString(R.string.e47);
                            if (TextUtils.isEmpty(user.getNickName())) {
                                str = "";
                            } else {
                                str = user.getNickName();
                            }
                            String string2 = bVar.f12486d.getString(R.string.e48);
                            StringBuilder sb = new StringBuilder();
                            sb.append(string);
                            sb.append(str);
                            sb.append(string2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(bVar.f12486d.getResources().getColor(R.color.a_h)), string.length(), string.length() + str.length(), 33);
                            new C8552a(bVar.f12486d).mo15009c((CharSequence) spannableStringBuilder).mo15003b(1, (int) R.string.e45, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    C8068g.m16014a(C4539b.this.f12486d);
                                    Map a = C4539b.this.mo10359a();
                                    a.put("action_type", "no");
                                    C8049c.m15979a().mo14202a("livesdk_anchor_admin_cancel_toast_click", a, new Object[0]);
                                    dialogInterface.dismiss();
                                }
                            }).mo15003b(0, (int) R.string.e42, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(user) {

                                /* renamed from: a */
                                final /* synthetic */ User f12495a;

                                {
                                    this.f12495a = r2;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    C8068g.m16014a(C4539b.this.f12486d);
                                    C4539b.this.f12484b.setVisibility(0);
                                    C4539b.this.f12483a.setVisibility(8);
                                    C4539b.this.f12488f.mo10356a(false, this.f12495a.getId(), C4539b.this.f12489g, C4539b.this.f12490h);
                                    Map a = C4539b.this.mo10359a();
                                    a.put("action_type", "yes");
                                    C8049c.m15979a().mo14202a("livesdk_anchor_admin_cancel_toast_click", a, new Object[0]);
                                    dialogInterface.dismiss();
                                }
                            }).mo15011d();
                            C8049c.m15979a().mo14202a("livesdk_anchor_admin_cancel_toast_show", bVar.mo10359a(), new Object[0]);
                            C8068g.m16014a(bVar.f12486d);
                        }
                    }
                }
                C8049c.m15979a().mo14202a("livesdk_anchor_admin_cancel_click", C4539b.this.mo10359a(), new Object[0]);
            }
        });
        this.f12486d = context;
        this.f12489g = j;
        this.f12490h = j2;
    }
}
