package android.support.p030v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.C2240a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final Mode f2737h = Mode.SRC_IN;

    /* renamed from: a */
    public int f2738a;

    /* renamed from: b */
    public Object f2739b;

    /* renamed from: c */
    public byte[] f2740c;

    /* renamed from: d */
    public Parcelable f2741d;

    /* renamed from: e */
    public int f2742e;

    /* renamed from: f */
    public int f2743f;

    /* renamed from: g */
    public ColorStateList f2744g;

    /* renamed from: i */
    public Mode f2745i = f2737h;

    /* renamed from: j */
    public String f2746j;

    /* renamed from: c */
    private String m2320c() {
        if (this.f2738a == -1 && VERSION.SDK_INT >= 23) {
            return m2318a((Icon) this.f2739b);
        }
        if (this.f2738a == 2) {
            return ((String) this.f2739b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final Bundle mo2606b() {
        Bundle bundle = new Bundle();
        int i = this.f2738a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) this.f2739b);
                    break;
                case 2:
                case 4:
                    bundle.putString("obj", (String) this.f2739b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) this.f2739b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
        } else {
            bundle.putParcelable("obj", (Parcelable) this.f2739b);
        }
        bundle.putInt("type", this.f2738a);
        bundle.putInt("int1", this.f2742e);
        bundle.putInt("int2", this.f2743f);
        if (this.f2744g != null) {
            bundle.putParcelable("tint_list", this.f2744g);
        }
        if (this.f2745i != f2737h) {
            bundle.putString("tint_mode", this.f2745i.name());
        }
        return bundle;
    }

    /* renamed from: a */
    public final Icon mo2605a() {
        Icon icon;
        int i = this.f2738a;
        if (i == -1) {
            return (Icon) this.f2739b;
        }
        switch (i) {
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f2739b);
                break;
            case 2:
                icon = Icon.createWithResource(m2320c(), this.f2742e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f2739b, this.f2742e, this.f2743f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f2739b);
                break;
            case 5:
                if (VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m2317a((Bitmap) this.f2739b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f2739b);
                    break;
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        if (this.f2744g != null) {
            icon.setTintList(this.f2744g);
        }
        if (this.f2745i != f2737h) {
            icon.setTintMode(this.f2745i);
        }
        return icon;
    }

    public String toString() {
        String str;
        int i;
        if (this.f2738a == -1) {
            return String.valueOf(this.f2739b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2738a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2738a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2739b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2739b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(m2320c());
                sb.append(" id=");
                String str2 = "0x%08x";
                Object[] objArr = new Object[1];
                if (this.f2738a == -1 && VERSION.SDK_INT >= 23) {
                    i = m2319b((Icon) this.f2739b);
                } else if (this.f2738a == 2) {
                    i = this.f2742e;
                } else {
                    StringBuilder sb2 = new StringBuilder("called getResId() on ");
                    sb2.append(this);
                    throw new IllegalStateException(sb2.toString());
                }
                objArr[0] = Integer.valueOf(i);
                sb.append(C2240a.m6772a(str2, objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2742e);
                if (this.f2743f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2743f);
                    break;
                }
                break;
            case 4:
                sb.append(" uri=");
                sb.append(this.f2739b);
                break;
        }
        if (this.f2744g != null) {
            sb.append(" tint=");
            sb.append(this.f2744g);
        }
        if (this.f2745i != f2737h) {
            sb.append(" mode=");
            sb.append(this.f2745i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m2318a(Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException unused2) {
            return null;
        } catch (NoSuchMethodException unused3) {
            return null;
        }
    }

    /* renamed from: b */
    private static int m2319b(Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            return 0;
        } catch (InvocationTargetException unused2) {
            return 0;
        } catch (NoSuchMethodException unused3) {
            return 0;
        }
    }

    /* renamed from: a */
    private static Bitmap m2317a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = ((float) min) * 0.5f;
        float f2 = 0.9166667f * f;
        paint.setColor(-16777216);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f, f, f2, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
