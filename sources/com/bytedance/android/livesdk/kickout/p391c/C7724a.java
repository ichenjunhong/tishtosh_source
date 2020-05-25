package com.bytedance.android.livesdk.kickout.p391c;

import android.content.Context;
import android.content.DialogInterface;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.recyclerview.C4240a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.c.a */
public final class C7724a extends C4240a {

    /* renamed from: c */
    public boolean f21235c;

    /* renamed from: d */
    private Context f21236d;

    /* renamed from: e */
    private List<User> f21237e = new ArrayList();

    /* renamed from: f */
    private String f21238f;

    /* renamed from: g */
    private long f21239g;

    /* renamed from: h */
    private long f21240h;

    /* renamed from: com.bytedance.android.livesdk.kickout.c.a$a */
    static class C7725a extends C1352v {

        /* renamed from: a */
        TextView f21241a;

        public C7725a(View view) {
            super(view);
            this.f21241a = (TextView) view.findViewById(R.id.d73);
        }
    }

    /* renamed from: c */
    public final int mo9862c() {
        if (this.f21235c) {
            return this.f21237e.size() + 1;
        }
        return this.f21237e.size();
    }

    /* renamed from: a */
    public final void mo14070a(Collection<? extends User> collection) {
        if (collection != null && collection.size() > 0) {
            this.f21237e.addAll(collection);
        }
    }

    /* renamed from: a */
    public final int mo9859a(int i) {
        if (!this.f21235c || i != this.f21237e.size()) {
            return super.mo9859a(i);
        }
        return MessageCenter.MSG_SDK_TO_CLIENT_END_GAME_REQ;
    }

    /* renamed from: a */
    public final void mo14069a(long j) {
        int size = this.f21237e.size() - 1;
        while (size >= 0) {
            User user = (User) this.f21237e.get(size);
            if (user == null || user.getId() != j) {
                size--;
            } else {
                this.f21237e.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* renamed from: a */
    public final C1352v mo9860a(ViewGroup viewGroup, int i) {
        if (i == 4099) {
            return new C7725a(LayoutInflater.from(this.f21236d).inflate(R.layout.al_, viewGroup, false));
        }
        C7726b bVar = new C7726b(this.f21236d, LayoutInflater.from(this.f21236d).inflate(R.layout.ala, viewGroup, false), this.f21238f, this.f21239g, this.f21240h);
        return bVar;
    }

    /* renamed from: a */
    public final void mo9861a(C1352v vVar, int i) {
        ImageModel imageModel;
        int i2;
        if (getItemViewType(i) == 4099) {
            C7725a aVar = (C7725a) vVar;
            if (aVar != null) {
                String str = this.f21238f;
                TextView textView = aVar.f21241a;
                if (str.equals("activity_kick_out")) {
                    i2 = R.string.ect;
                } else {
                    i2 = R.string.ecs;
                }
                textView.setText(i2);
            }
            return;
        }
        C7726b bVar = (C7726b) vVar;
        if (bVar != null) {
            List<User> list = this.f21237e;
            if (list != null) {
                bVar.f21248g = list;
                User user = (User) list.get(i);
                if (user != null) {
                    if (user.getAvatarThumb() != null) {
                        C5213c.m11824b(bVar.f21242a, user.getAvatarThumb());
                    } else {
                        bVar.f21242a.setImageResource(R.drawable.bt6);
                    }
                    bVar.f21242a.setOnClickListener(new C7729c(user));
                    bVar.f21245d.setText(C7726b.m15749a(user));
                    if (user.getUserHonor() != null) {
                        imageModel = user.getUserHonor().mo8156k();
                    } else {
                        imageModel = null;
                    }
                    if (imageModel == null || C9376b.m18558a((Collection<T>) imageModel.getUrls())) {
                        bVar.f21246e.setVisibility(8);
                    } else {
                        C5213c.m11819a((ImageView) bVar.f21246e, imageModel, (C3910a) new C3910a() {
                            /* renamed from: a */
                            public final void mo9270a(ImageModel imageModel) {
                            }

                            /* renamed from: a */
                            public final void mo9272a(ImageModel imageModel, Exception exc) {
                            }

                            /* renamed from: a */
                            public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                                LayoutParams layoutParams = C7726b.this.f21246e.getLayoutParams();
                                int a = C3922z.m9899a(32.0f);
                                layoutParams.width = a;
                                layoutParams.height = (i2 * a) / i;
                                C7726b.this.f21246e.setLayoutParams(layoutParams);
                            }
                        });
                        bVar.f21246e.setVisibility(0);
                    }
                    bVar.f21243b.setOnClickListener(new OnClickListener(i) {

                        /* renamed from: a */
                        final /* synthetic */ int f21256a;

                        public final void onClick(View view) {
                            String str;
                            String str2;
                            int i;
                            String str3;
                            C7726b bVar = C7726b.this;
                            int i2 = this.f21256a;
                            if (!C7732f.m15761a(bVar.f21247f)) {
                                C4204a.m10421a(bVar.f21247f, (int) R.string.e77);
                            } else {
                                User user = (User) bVar.f21248g.get(i2);
                                String str4 = bVar.f21249h;
                                if (user != null) {
                                    bVar.f21252k = user;
                                    String string = bVar.f21247f.getString(R.string.e49);
                                    if (TextUtils.isEmpty(C7726b.m15749a(user))) {
                                        str2 = "";
                                    } else {
                                        str2 = C7726b.m15749a(user);
                                    }
                                    Context context = bVar.f21247f;
                                    if (str4.equals("activity_banned_talk")) {
                                        i = R.string.e4_;
                                    } else {
                                        i = R.string.e4a;
                                    }
                                    String string2 = context.getString(i);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append(" ");
                                    sb.append(str2);
                                    sb.append(" ");
                                    sb.append(string2);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(bVar.f21247f.getResources().getColor(R.color.a_h)), string.length() + 1, string.length() + 1 + str2.length(), 33);
                                    Map c = bVar.mo14071c();
                                    c.put("user_id", user.getIdStr());
                                    new C8552a(bVar.f21247f).mo15009c((CharSequence) spannableStringBuilder).mo15003b(1, (int) R.string.e45, (DialogInterface.OnClickListener) new C7730d(bVar, c)).mo15003b(0, (int) R.string.e42, (DialogInterface.OnClickListener) new C7731e(bVar, c, str4, user)).mo15011d();
                                    if (bVar.f21249h.equals("activity_banned_talk")) {
                                        str3 = "livesdk_anchor_mute_cancel_toast_show";
                                    } else {
                                        str3 = "livesdk_anchor_blacklist_cancel_toast_show";
                                    }
                                    C8049c.m15979a().mo14202a(str3, c, new Object[0]);
                                }
                            }
                            User user2 = (User) C7726b.this.f21248g.get(this.f21256a);
                            Map c2 = C7726b.this.mo14071c();
                            c2.put("user_id", user2.getIdStr());
                            if (C7726b.this.f21249h.equals("activity_banned_talk")) {
                                str = "livesdk_anchor_mute_cancel_click";
                            } else {
                                str = "livesdk_anchor_blacklist_cancel_click";
                            }
                            C8049c.m15979a().mo14202a(str, c2, new Object[0]);
                        }

                        {
                            this.f21256a = r2;
                        }
                    });
                }
            }
        }
    }

    public C7724a(Context context, String str, long j, long j2) {
        this.f21236d = context;
        this.f21238f = str;
        this.f21239g = j;
        this.f21240h = j2;
    }
}
