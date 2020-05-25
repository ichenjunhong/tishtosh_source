package com.p683ss.ttuploader;

import java.util.Map;

/* renamed from: com.ss.ttuploader.TTImageXUploader */
public class TTImageXUploader implements TTImageUploaderListener {
    private TTImageUploader mImageUploader;
    private TTImageXUploaderListener mListener;

    public static boolean isError() {
        return TTImageUploader.isError();
    }

    public void close() {
        if (this.mImageUploader != null) {
            this.mImageUploader.close();
        }
    }

    public void start() {
        if (this.mImageUploader != null) {
            this.mImageUploader.start();
        }
    }

    public void stop() {
        if (this.mImageUploader != null) {
            this.mImageUploader.stop();
        }
    }

    public TTImageXUploader() throws Exception {
        try {
            this.mImageUploader = new TTImageUploader(4);
            this.mImageUploader.setListener(this);
        } catch (Throwable unused) {
            this.mImageUploader = null;
        }
        if (this.mImageUploader == null) {
            throw new Exception("create native uploader fail");
        }
    }

    public void setListener(TTImageXUploaderListener tTImageXUploaderListener) {
        this.mListener = tTImageXUploaderListener;
    }

    public void setEnableHttps(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setEnableHttps(i);
        }
    }

    public void setFileRetryCount(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setFileRetryCount(i);
        }
    }

    public void setImageUploadDomain(String str) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setImageUploadDomain(str);
        }
    }

    public void setMaxFailTime(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setMaxFailTime(i);
        }
    }

    public void setOpenBoe(boolean z) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setOpenBoe(z);
        }
    }

    public void setServerParameter(String str) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setServerParameter(str);
        }
    }

    public void setSliceReTryCount(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setSliceReTryCount(i);
        }
    }

    public void setSliceTimeout(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setSliceTimeout(i);
        }
    }

    public void setSocketNum(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setSocketNum(i);
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setTraceIDConfig(map);
        }
    }

    public void setTranTimeOutUnit(int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setTranTimeOutUnit(i);
        }
    }

    public void setUploadToken(String str) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setUploadToken(str);
        }
    }

    public void setFileName(int i, String[] strArr) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setFileName(i, strArr);
        }
    }

    public void setFilePath(int i, String[] strArr) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setFilePath(i, strArr);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setMediaDataReader(tTMediaDataReader, i);
        }
    }

    public void setStringValue(int i, String str) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setStringValue(i, str);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i, int i2) {
        if (this.mImageUploader != null) {
            this.mImageUploader.setMediaDataReader(tTMediaDataReader, i, i2);
        }
    }

    public void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        TTImageXInfo tTImageXInfo;
        if (tTImageInfo != null) {
            tTImageXInfo = new TTImageXInfo(tTImageInfo.mImageToskey, tTImageInfo.mProgress, tTImageInfo.mFileIndex, tTImageInfo.mMetaInfo);
        } else {
            tTImageXInfo = null;
        }
        if (i == 0) {
            this.mListener.onNotify(i, j, null);
        } else if (i == 1) {
            this.mListener.onNotify(i, j, null);
        } else if (i == 3) {
            this.mListener.onNotify(i, j, tTImageXInfo);
        } else if (i == 4) {
            tTImageXInfo.mErrcode = tTImageInfo.mErrcode;
            tTImageXInfo.mProgress = tTImageInfo.mProgress;
            this.mListener.onNotify(i, j, tTImageXInfo);
        } else {
            if (i == 2) {
                this.mListener.onNotify(i, j, tTImageXInfo);
            }
        }
    }
}
