package com.aspose.ocr.cloud.android.api;

import androidx.annotation.NonNull;

public enum Language {
    English (1),
    French (2),
    German(2)
    ;

    private final int code;

    private Language(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    @NonNull
    @Override
    public String toString() {
        return Integer.toString(this.code);
    }
}
