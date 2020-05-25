package com.bytedance.android.livesdk.verify;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.p190d.C2971a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6169a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4579ar;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.verify.e */
public final class C8380e {
    /* renamed from: a */
    public static void m16603a(final Activity activity, final int i, final C2971a aVar, final Bundle bundle) {
        if (activity != null) {
            SpannableString spannableString = new SpannableString(C3922z.m9903a((int) R.string.f34));
            spannableString.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.abj)), 0, spannableString.length(), 33);
            new C6169a(activity, 2).mo12210a(false).mo12206a((int) R.string.f37).mo12212b((int) R.string.f35).mo12209a(C3922z.m9903a((int) R.string.e45), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8068g.m16014a((Context) activity);
                    dialogInterface.dismiss();
                }
            }).mo12214b(spannableString, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    if (aVar != null && aVar.f8710e == 5) {
                        TTLiveSDKContext.getHostService().mo10318k();
                    } else if (aVar == null || aVar.f8710e != 2) {
                        TTLiveSDKContext.getHostService().mo10318k();
                    } else {
                        Activity activity = activity;
                        int i2 = i;
                        C2971a aVar = aVar;
                        String str = "";
                        if (aVar != null) {
                            str = aVar.f8709d;
                        }
                        SpannableString spannableString = new SpannableString(C3922z.m9903a((int) R.string.f43));
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff4e33")), 0, spannableString.length(), 33);
                        new C6169a(activity, 2).mo12208a((CharSequence) C3922z.m9905a((int) R.string.f45, str)).mo12213b((CharSequence) C3922z.m9905a((int) R.string.f44, str)).mo12209a(spannableString, new OnClickListener(activity, i2) {

                            /* renamed from: a */
                            final /* synthetic */ Activity f22810a;

                            /* renamed from: b */
                            final /* synthetic */ int f22811b;

                            {
                                this.f22810a = r1;
                                this.f22811b = r2;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                TTLiveSDKContext.getHostService().mo10318k();
                            }
                        }).mo12214b(C3922z.m9903a((int) R.string.f42), new OnClickListener(activity, i2) {

                            /* renamed from: a */
                            final /* synthetic */ Activity f22808a;

                            /* renamed from: b */
                            final /* synthetic */ int f22809b;

                            {
                                this.f22808a = r1;
                                this.f22809b = r2;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                Activity activity = this.f22808a;
                                int i2 = this.f22809b;
                                ProgressDialog a = C4579ar.m10999a(activity);
                                a.setCancelable(false);
                                a.setCanceledOnTouchOutside(false);
                                ((HotsoonVerifyApi) C4514j.m10883j().mo10321b().mo9550a(HotsoonVerifyApi.class)).unbindOldWithdrawAccount("use_withdraw").mo6505a((C1710e<? super T>) new C1710e<C4177d<Void>>(a, activity, i2) {

                                    /* renamed from: a */
                                    final /* synthetic */ ProgressDialog f22812a;

                                    /* renamed from: b */
                                    final /* synthetic */ Activity f22813b;

                                    /* renamed from: c */
                                    final /* synthetic */ int f22814c;

                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                        C4177d dVar = (C4177d) obj;
                                        if (this.f22812a.isShowing()) {
                                            this.f22812a.dismiss();
                                        }
                                        TTLiveSDKContext.getHostService().mo10318k();
                                    }

                                    {
                                        this.f22812a = r1;
                                        this.f22813b = r2;
                                        this.f22814c = r3;
                                    }
                                }, (C1710e<? super Throwable>) new C1710e<Throwable>(a, activity) {

                                    /* renamed from: a */
                                    final /* synthetic */ ProgressDialog f22815a;

                                    /* renamed from: b */
                                    final /* synthetic */ Activity f22816b;

                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                        Throwable th = (Throwable) obj;
                                        if (this.f22815a.isShowing()) {
                                            this.f22815a.dismiss();
                                        }
                                        C4602l.m11046a(this.f22816b, th);
                                    }

                                    {
                                        this.f22815a = r1;
                                        this.f22816b = r2;
                                    }
                                });
                            }
                        }).mo12215b();
                    }
                }
            }).mo12207a((OnCancelListener) new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    C8068g.m16014a((Context) activity);
                }
            }).mo12215b();
            C8068g.m16014a((Context) activity);
        }
    }
}
