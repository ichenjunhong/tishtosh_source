package p2699pl.droidsonroids.gif;

import com.C2240a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Locale;

/* renamed from: pl.droidsonroids.gif.b */
public enum C53878b {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(BaseNotice.HASHTAG, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(BaseNotice.CHECK_PROFILE, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(BaseNotice.COMMENT_REPLY_WITH_VIDEO, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    

    /* renamed from: a */
    int f133515a;
    public final String description;

    public final int getErrorCode() {
        return this.f133515a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo113943a() {
        return C2240a.m6773a(Locale.ENGLISH, "GifError %d: %s", new Object[]{Integer.valueOf(this.f133515a), this.description});
    }

    /* renamed from: a */
    static C53878b m114547a(int i) {
        C53878b[] values;
        for (C53878b bVar : values()) {
            if (bVar.f133515a == i) {
                return bVar;
            }
        }
        C53878b bVar2 = UNKNOWN;
        bVar2.f133515a = i;
        return bVar2;
    }

    private C53878b(int i, String str) {
        this.f133515a = i;
        this.description = str;
    }
}
