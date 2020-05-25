package android.support.p030v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p030v4.app.C0631ah.C0632a;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.b */
public final class C0636b extends C0726c {

    /* renamed from: a */
    static C0639b f2302a;

    /* renamed from: android.support.v4.app.b$a */
    public interface C0638a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.b$b */
    public interface C0639b {
        /* renamed from: a */
        boolean mo2162a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo2163a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.b$c */
    public interface C0640c {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: android.support.v4.app.b$d */
    static class C0641d extends SharedElementCallback {

        /* renamed from: a */
        private final C0631ah f2306a;

        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        public final void onRejectSharedElements(List<View> list) {
        }

        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        C0641d(C0631ah ahVar) {
            this.f2306a = ahVar;
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            ImageView imageView = null;
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap == null) {
                    return null;
                }
                imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix matrix = new Matrix();
                    matrix.setValues(floatArray);
                    imageView.setImageMatrix(matrix);
                }
            } else if (parcelable instanceof Bitmap) {
                Bitmap bitmap2 = (Bitmap) parcelable;
                imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap2);
            }
            return imageView;
        }

        public final void onSharedElementsArrived(List<String> list, List<View> list2, final OnSharedElementsReadyListener onSharedElementsReadyListener) {
            new C0632a() {
                /* renamed from: a */
                public final void mo2157a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            }.mo2157a();
        }

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap bitmap;
            Bitmap bitmap2;
            View view2 = view;
            RectF rectF2 = rectF;
            C0631ah ahVar = this.f2306a;
            if (view2 instanceof ImageView) {
                ImageView imageView = (ImageView) view2;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        bitmap2 = null;
                    } else {
                        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                        if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                            int i = (int) (((float) intrinsicWidth) * min);
                            int i2 = (int) (((float) intrinsicHeight) * min);
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                            bitmap2 = createBitmap;
                        } else {
                            bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        }
                    }
                    if (bitmap2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap2);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return bundle;
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                bitmap = null;
            } else {
                float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
                int i7 = (int) (((float) round) * min2);
                int i8 = (int) (((float) round2) * min2);
                if (ahVar.f2299a == null) {
                    ahVar.f2299a = new Matrix();
                }
                ahVar.f2299a.set(matrix);
                ahVar.f2299a.postTranslate(-rectF2.left, -rectF2.top);
                ahVar.f2299a.postScale(min2, min2);
                Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.concat(ahVar.f2299a);
                view2.draw(canvas2);
                bitmap = createBitmap2;
            }
            return bitmap;
        }
    }

    /* renamed from: a */
    public static void m1715a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m1720b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: c */
    public static void m1721c(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: a */
    public static boolean m1719a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: a */
    public static void m1718a(final Activity activity, final String[] strArr, final int i) {
        if (f2302a != null && f2302a.mo2163a(activity, strArr, i)) {
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            if (activity instanceof C0640c) {
                ((C0640c) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
            return;
        }
        if (activity instanceof C0638a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0638a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1716a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m1717a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
