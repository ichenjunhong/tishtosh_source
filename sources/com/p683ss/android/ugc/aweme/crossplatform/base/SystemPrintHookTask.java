package com.p683ss.android.ugc.aweme.crossplatform.base;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.base.SystemPrintHookTask */
public final class SystemPrintHookTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        Field field;
        Field field2;
        Field field3;
        System.err.println("err before");
        System.out.println("out before");
        try {
            field = System.class.getField("err");
            field2 = System.class.getField("out");
            field.setAccessible(true);
            field2.setAccessible(true);
            field3 = Field.class.getDeclaredField("accessFlags");
        } catch (NoSuchFieldException unused) {
            field3 = Field.class.getDeclaredField("modifiers");
        } catch (Throwable unused2) {
        }
        field3.setAccessible(true);
        field3.setInt(field, field.getModifiers() & -17);
        field3.setInt(field2, field2.getModifiers() & -17);
        PrintStream printStream = new PrintStream(new OutputStream() {
            public final void write(int i) {
            }
        });
        field.set(null, printStream);
        field2.set(null, printStream);
        System.err.println("err after");
        System.out.println("out after");
    }
}
