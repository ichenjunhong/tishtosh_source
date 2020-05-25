package com.zhihu.matisse.internal.p2254ui;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2253c.C45347c;
import com.zhihu.matisse.internal.p2254ui.widget.DraweeViewTouch;
import com.zhihu.matisse.p2250b.C45335b;
import p2674it.sephiroth.android.library.imagezoom.ImageViewTouch.C53179c;
import p2674it.sephiroth.android.library.imagezoom.ImageViewTouchBase.C53184a;

/* renamed from: com.zhihu.matisse.internal.ui.b */
public final class C45360b extends Fragment {

    /* renamed from: a */
    public C45335b f114711a;

    public final void onDetach() {
        super.onDetach();
        this.f114711a = null;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C45335b) {
            this.f114711a = (C45335b) context;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.toString());
        sb.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(sb.toString());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Point point;
        super.onViewCreated(view, bundle);
        final Item item = (Item) getArguments().getParcelable("args_item");
        if (item != null) {
            View findViewById = view.findViewById(R.id.dpp);
            if (item.mo91665c()) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(item.f114655c, "video/*");
                        try {
                            C45360b.this.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Toast makeText = Toast.makeText(C45360b.this.getContext(), R.string.c4v, 0);
                            if (VERSION.SDK_INT == 25) {
                                C47905fy.m103630a(makeText);
                            }
                            makeText.show();
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            DraweeViewTouch draweeViewTouch = (DraweeViewTouch) view.findViewById(R.id.arl);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.ako);
            Uri uri = item.f114655c;
            FragmentActivity activity = getActivity();
            ContentResolver contentResolver = activity.getContentResolver();
            Point a = C45347c.m98878a(contentResolver, uri);
            int i = a.x;
            int i2 = a.y;
            if (C45347c.m98880c(contentResolver, uri)) {
                i = a.y;
                i2 = a.x;
            }
            if (i2 == 0) {
                point = new Point(1600, 1600);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f = (float) i;
                float f2 = ((float) displayMetrics.widthPixels) / f;
                float f3 = (float) i2;
                float f4 = ((float) displayMetrics.heightPixels) / f3;
                if (f2 > f4) {
                    point = new Point((int) (f * f2), (int) (f3 * f4));
                } else {
                    point = new Point((int) (f * f2), (int) (f3 * f4));
                }
            }
            C14229b a2 = C14232c.m29169a(item.f114655c).mo26453a(new C13952d(point.x, point.y)).mo26449a();
            if (item.mo91664b()) {
                draweeViewTouch.setVisibility(4);
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        if (C45360b.this.f114711a != null) {
                            C45360b.this.f114711a.mo91626b();
                        }
                    }
                });
                simpleDraweeView.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25757b(a2)).mo25762c(true)).mo25763d());
                return;
            }
            draweeViewTouch.setVisibility(0);
            simpleDraweeView.setVisibility(4);
            draweeViewTouch.setDisplayType(C53184a.FIT_TO_SCREEN);
            draweeViewTouch.setSingleTapListener(new C53179c() {
                /* renamed from: a */
                public final void mo91689a() {
                    if (C45360b.this.f114711a != null) {
                        C45360b.this.f114711a.mo91626b();
                    }
                }
            });
            draweeViewTouch.setImageRequest(a2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pa, viewGroup, false);
    }
}
