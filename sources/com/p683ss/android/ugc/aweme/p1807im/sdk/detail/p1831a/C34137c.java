package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34144a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34150g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1833c.C34151a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.c */
public final class C34137c extends C1322a<C33298c<C33368b>> {

    /* renamed from: c */
    public static final C34138a f88231c = new C34138a(null);

    /* renamed from: a */
    public String f88232a;

    /* renamed from: b */
    public String f88233b;

    /* renamed from: d */
    private final ArrayList<C33368b> f88234d = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.c$a */
    public static final class C34138a {
        private C34138a() {
        }

        public /* synthetic */ C34138a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.c$b */
    public final class C34139b extends C34135b {

        /* renamed from: e */
        final /* synthetic */ C34137c f88235e;

        /* renamed from: f */
        private TextView f88236f;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.c$b$a */
        static final class C34140a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C34139b f88237a;

            C34140a(C34139b bVar) {
                this.f88237a = bVar;
            }

            public final void onClick(View view) {
                IMUser iMUser;
                ClickInstrumentation.onClick(view);
                C33367a aVar = this.f88237a.f88227d;
                IMUser iMUser2 = null;
                if (aVar != null) {
                    iMUser = aVar.getUser();
                } else {
                    iMUser = null;
                }
                if (iMUser != null) {
                    View view2 = this.f88237a.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    Context context = view2.getContext();
                    C52711k.m112236a((Object) context, "itemView.context");
                    C33367a aVar2 = this.f88237a.f88227d;
                    if (aVar2 != null) {
                        iMUser2 = aVar2.getUser();
                    }
                    if (iMUser2 == null) {
                        C52711k.m112234a();
                    }
                    C34008d.m77746a(context, (IMContact) iMUser2, "group_setting");
                }
            }
        }

        /* renamed from: b */
        public final void mo70628b() {
            super.mo70628b();
            View findViewById = this.itemView.findViewById(R.id.dbt);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_member_detail)");
            this.f88236f = (TextView) findViewById;
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            view.setBackground(C10678c.m21505e(view2.getContext()));
        }

        /* renamed from: a */
        public final void mo70627a(C33368b bVar, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            CharSequence charSequence;
            CharSequence charSequence2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Object obj;
            String str7;
            String str8;
            String str9;
            String str10;
            CharSequence charSequence3;
            boolean z4;
            Object obj2;
            String str11;
            String str12;
            String str13;
            CharSequence charSequence4;
            boolean z5;
            CharSequence charSequence5;
            boolean z6;
            Object obj3;
            String str14;
            C33368b bVar2 = bVar;
            super.mo70627a(bVar, i);
            if (bVar2 instanceof C33367a) {
                C33367a aVar = (C33367a) bVar2;
                if (aVar.getUser() != null) {
                    CharSequence charSequence6 = this.f88235e.f88232a;
                    boolean z7 = true;
                    if (charSequence6 == null || charSequence6.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C34151a aVar2 = C34151a.f88260a;
                        TextView textView = this.f88236f;
                        if (textView == null) {
                            C52711k.m112237a("mDetailView");
                        }
                        String str15 = this.f88235e.f88232a;
                        if (str15 == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112240b(textView, "textView");
                        C52711k.m112240b(aVar, "imMember");
                        C52711k.m112240b(str15, "keyword");
                        if (str15.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String str16 = null;
                        if (z2) {
                            C34151a.m77969a(textView, aVar);
                        } else {
                            IMUser user = aVar.getUser();
                            if (user == null || user.getSearchType() != 5) {
                                IMUser user2 = aVar.getUser();
                                if (user2 == null || user2.getSearchType() != 4) {
                                    IMUser user3 = aVar.getUser();
                                    if (user3 == null || user3.getSearchType() != 3) {
                                        IMUser user4 = aVar.getUser();
                                        if (user4 == null || user4.getSearchType() != 1) {
                                            IMUser user5 = aVar.getUser();
                                            if (user5 == null || user5.getSearchType() != 2) {
                                                textView.setVisibility(8);
                                            } else {
                                                Resources resources = C11010c.m22280a().getResources();
                                                Object[] objArr = new Object[1];
                                                IMUser user6 = aVar.getUser();
                                                if (user6 != null) {
                                                    obj = user6.getContactName();
                                                } else {
                                                    obj = null;
                                                }
                                                objArr[0] = obj;
                                                String string = resources.getString(R.string.bg5, objArr);
                                                IMUser user7 = aVar.getUser();
                                                if (user7 != null) {
                                                    str7 = user7.getContactName();
                                                } else {
                                                    str7 = null;
                                                }
                                                IMUser user8 = aVar.getUser();
                                                if (user8 != null) {
                                                    str8 = user8.getContactNamePinyin();
                                                } else {
                                                    str8 = null;
                                                }
                                                IMUser user9 = aVar.getUser();
                                                if (user9 != null) {
                                                    str9 = user9.getContactNameInitial();
                                                } else {
                                                    str9 = null;
                                                }
                                                String a = C34839a.m78903a(str7, str8, str9, str15);
                                                C52711k.m112236a((Object) a, "CharacterUtil.convertPin…tactNameInitial, keyword)");
                                                C52711k.m112236a((Object) string, "str");
                                                C34848e.m78928a(textView, string, a, 6);
                                                textView.setVisibility(0);
                                            }
                                        } else {
                                            IMUser user10 = aVar.getUser();
                                            if (user10 != null) {
                                                str10 = user10.getDisplayId();
                                            } else {
                                                str10 = null;
                                            }
                                            String c = C34839a.m78908c(str10);
                                            C52711k.m112236a((Object) c, "CharacterUtil.hanziToPinyin(id)");
                                            if (c != null) {
                                                String lowerCase = c.toLowerCase();
                                                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                                                String a2 = C34839a.m78903a(str10, lowerCase, C34839a.m78906b(str10), str15);
                                                C52711k.m112236a((Object) a2, "CharacterUtil.convertPin…al(id), highLightKeyword)");
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(C11010c.m22280a().getResources().getString(R.string.bdn));
                                                sb.append(str10);
                                                C34848e.m78928a(textView, sb.toString(), a2, 4);
                                                textView.setVisibility(0);
                                            } else {
                                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                            }
                                        }
                                    } else {
                                        IMUser user11 = aVar.getUser();
                                        if (user11 != null) {
                                            charSequence3 = user11.getRemarkName();
                                        } else {
                                            charSequence3 = null;
                                        }
                                        CharSequence charSequence7 = charSequence3;
                                        if (charSequence7 == null || charSequence7.length() == 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            C11206o member = aVar.getMember();
                                            if (member != null) {
                                                charSequence4 = member.getAlias();
                                            } else {
                                                charSequence4 = null;
                                            }
                                            CharSequence charSequence8 = charSequence4;
                                            if (charSequence8 == null || charSequence8.length() == 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                C34151a.m77969a(textView, aVar);
                                            }
                                        }
                                        Resources resources2 = C11010c.m22280a().getResources();
                                        Object[] objArr2 = new Object[1];
                                        IMUser user12 = aVar.getUser();
                                        if (user12 != null) {
                                            obj2 = user12.getNickName();
                                        } else {
                                            obj2 = null;
                                        }
                                        objArr2[0] = obj2;
                                        String string2 = resources2.getString(R.string.blf, objArr2);
                                        IMUser user13 = aVar.getUser();
                                        if (user13 != null) {
                                            str11 = user13.getNickName();
                                        } else {
                                            str11 = null;
                                        }
                                        IMUser user14 = aVar.getUser();
                                        if (user14 != null) {
                                            str12 = user14.getNickNamePinyin();
                                        } else {
                                            str12 = null;
                                        }
                                        IMUser user15 = aVar.getUser();
                                        if (user15 != null) {
                                            str13 = user15.getNickNameInitial();
                                        } else {
                                            str13 = null;
                                        }
                                        String a3 = C34839a.m78903a(str11, str12, str13, str15);
                                        C52711k.m112236a((Object) a3, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                        C52711k.m112236a((Object) string2, "str");
                                        C34848e.m78928a(textView, string2, a3, 3);
                                        textView.setVisibility(0);
                                    }
                                } else {
                                    IMUser user16 = aVar.getUser();
                                    if (user16 != null) {
                                        charSequence5 = user16.getRemarkName();
                                    } else {
                                        charSequence5 = null;
                                    }
                                    CharSequence charSequence9 = charSequence5;
                                    if (charSequence9 == null || charSequence9.length() == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        C34151a.m77969a(textView, aVar);
                                    } else {
                                        Resources resources3 = C11010c.m22280a().getResources();
                                        Object[] objArr3 = new Object[1];
                                        C11206o member2 = aVar.getMember();
                                        if (member2 != null) {
                                            obj3 = member2.getAlias();
                                        } else {
                                            obj3 = null;
                                        }
                                        objArr3[0] = obj3;
                                        String string3 = resources3.getString(R.string.biu, objArr3);
                                        C11206o member3 = aVar.getMember();
                                        if (member3 != null) {
                                            str14 = member3.getAlias();
                                        } else {
                                            str14 = null;
                                        }
                                        String a4 = C34839a.m78903a(str14, aVar.getAliasPinyin(), aVar.getAliasInitial(), str15);
                                        C52711k.m112236a((Object) a4, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                        C52711k.m112236a((Object) string3, "str");
                                        C34848e.m78928a(textView, string3, a4, 4);
                                        textView.setVisibility(0);
                                    }
                                }
                            } else {
                                C34151a.m77969a(textView, aVar);
                            }
                        }
                        TextView e = mo72080e();
                        String str17 = this.f88235e.f88232a;
                        if (str17 == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112240b(e, "textView");
                        C52711k.m112240b(aVar, "imMember");
                        C52711k.m112240b(str17, "keyword");
                        CharSequence charSequence10 = str17;
                        if (charSequence10.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            e.setText(aVar.getMemberDisplayName());
                        } else {
                            if (!C35279p.m79763a()) {
                                IMUser user17 = aVar.getUser();
                                if (user17 == null || user17.getSearchType() != 5) {
                                    IMUser user18 = aVar.getUser();
                                    if (user18 == null || user18.getSearchType() != 4) {
                                        IMUser user19 = aVar.getUser();
                                        if (user19 != null && user19.getSearchType() == 3) {
                                            IMUser user20 = aVar.getUser();
                                            if (user20 != null) {
                                                str3 = user20.getNickName();
                                            } else {
                                                str3 = null;
                                            }
                                            IMUser user21 = aVar.getUser();
                                            if (user21 != null) {
                                                str4 = user21.getNickNamePinyin();
                                            } else {
                                                str4 = null;
                                            }
                                            IMUser user22 = aVar.getUser();
                                            if (user22 != null) {
                                                str16 = user22.getNickNameInitial();
                                            }
                                            str17 = C34839a.m78903a(str3, str4, str16, str17);
                                            C52711k.m112236a((Object) str17, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                        }
                                    } else {
                                        C11206o member4 = aVar.getMember();
                                        if (member4 != null) {
                                            str16 = member4.getAlias();
                                        }
                                        str17 = C34839a.m78903a(str16, aVar.getAliasPinyin(), aVar.getAliasInitial(), str17);
                                        C52711k.m112236a((Object) str17, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                    }
                                } else {
                                    IMUser user23 = aVar.getUser();
                                    if (user23 != null) {
                                        str5 = user23.getRemarkName();
                                    } else {
                                        str5 = null;
                                    }
                                    IMUser user24 = aVar.getUser();
                                    if (user24 != null) {
                                        str6 = user24.getRemarkPinyin();
                                    } else {
                                        str6 = null;
                                    }
                                    IMUser user25 = aVar.getUser();
                                    if (user25 != null) {
                                        str16 = user25.getRemarkInitial();
                                    }
                                    str17 = C34839a.m78903a(str5, str6, str16, str17);
                                    C52711k.m112236a((Object) str17, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                }
                            } else {
                                IMUser user26 = aVar.getUser();
                                if (user26 != null) {
                                    charSequence = user26.getNickName();
                                } else {
                                    charSequence = null;
                                }
                                CharSequence charSequence11 = charSequence;
                                if (!(charSequence11 == null || charSequence11.length() == 0)) {
                                    z7 = false;
                                }
                                if (!z7) {
                                    IMUser user27 = aVar.getUser();
                                    if (user27 != null) {
                                        charSequence2 = user27.getNickName();
                                    } else {
                                        charSequence2 = null;
                                    }
                                    if (charSequence2 == null) {
                                        C52711k.m112234a();
                                    }
                                    if (!C52830p.m112456b(charSequence2, charSequence10, false, 2, (Object) null)) {
                                        String lowerCase2 = str17.toLowerCase();
                                        C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                                        IMUser user28 = aVar.getUser();
                                        if (user28 != null) {
                                            str = user28.getNickName();
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            C52711k.m112234a();
                                        }
                                        if (str != null) {
                                            String lowerCase3 = str.toLowerCase();
                                            C52711k.m112236a((Object) lowerCase3, "(this as java.lang.String).toLowerCase()");
                                            int a5 = C52830p.m112419a((CharSequence) lowerCase3, lowerCase2, 0, false, 6, (Object) null);
                                            if (a5 != -1) {
                                                int length = lowerCase2.length() + a5;
                                                IMUser user29 = aVar.getUser();
                                                if (user29 != null) {
                                                    str2 = user29.getNickName();
                                                } else {
                                                    str2 = null;
                                                }
                                                if (str2 == null) {
                                                    C52711k.m112234a();
                                                }
                                                int min = Math.min(length, str2.length());
                                                IMUser user30 = aVar.getUser();
                                                if (user30 != null) {
                                                    str16 = user30.getNickName();
                                                }
                                                if (str16 == null) {
                                                    C52711k.m112234a();
                                                }
                                                if (str16 != null) {
                                                    str17 = str16.substring(a5, min);
                                                    C52711k.m112236a((Object) str17, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                } else {
                                                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                                }
                                            } else {
                                                str17 = lowerCase2;
                                            }
                                        } else {
                                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                        }
                                    }
                                }
                            }
                            String memberDisplayName = aVar.getMemberDisplayName();
                            if (memberDisplayName == null) {
                                memberDisplayName = "";
                            }
                            C34848e.m78928a(e, memberDisplayName, str17, 0);
                        }
                        this.itemView.setOnClickListener(new C34140a(this));
                    }
                }
            }
        }

        public C34139b(C34137c cVar, ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            this.f88235e = cVar;
            super(viewGroup, R.layout.bfe);
        }
    }

    public final int getItemCount() {
        return this.f88234d.size();
    }

    /* renamed from: a */
    public final void mo72083a(List<? extends C33368b> list) {
        mo72084a(list, null);
    }

    public C34137c(List<? extends C33368b> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f88234d.addAll(collection);
        }
    }

    public final int getItemViewType(int i) {
        C33368b bVar = (C33368b) this.f88234d.get(i);
        if (bVar instanceof C34150g) {
            return 1;
        }
        boolean z = false;
        if (bVar instanceof C34144a) {
            return 0;
        }
        CharSequence charSequence = this.f88232a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            return 3;
        }
        return 2;
    }

    public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C33298c cVar = (C33298c) vVar;
        C52711k.m112240b(cVar, "holder");
        super.onViewAttachedToWindow(cVar);
        if (cVar instanceof C34135b) {
            C34135b bVar = (C34135b) cVar;
            if (!TextUtils.isEmpty(bVar.f88226c) && !C53755c.m114319a().mo112958b((Object) bVar)) {
                C53755c.m114319a().mo112955a((Object) bVar);
            }
        }
    }

    public final /* synthetic */ void onViewDetachedFromWindow(C1352v vVar) {
        C33298c cVar = (C33298c) vVar;
        C52711k.m112240b(cVar, "holder");
        super.onViewDetachedFromWindow(cVar);
        if (cVar instanceof C34135b) {
            C34135b bVar = (C34135b) cVar;
            if (C53755c.m114319a().mo112958b((Object) bVar)) {
                C53755c.m114319a().mo112959c((Object) bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo72084a(List<? extends C33368b> list, String str) {
        if (list != null) {
            this.f88232a = str;
            this.f88234d.clear();
            this.f88234d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C33298c cVar = (C33298c) vVar;
        C52711k.m112240b(cVar, "holder");
        cVar.mo70627a(this.f88234d.get(i), i);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C33298c cVar;
        C52711k.m112240b(viewGroup, "parent");
        if (i != 3) {
            switch (i) {
                case 0:
                    cVar = new C34132a(viewGroup, R.layout.bd8, this.f88233b);
                    break;
                case 1:
                    cVar = new C34142e(viewGroup, R.layout.bd8);
                    break;
                default:
                    cVar = new C34135b(viewGroup, R.layout.bd9);
                    break;
            }
        } else {
            cVar = new C34139b(this, viewGroup, R.layout.bfe);
        }
        return cVar;
    }
}
