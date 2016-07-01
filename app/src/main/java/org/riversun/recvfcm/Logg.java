/*
 * Copyright 2016-2017 Tom Misawa, riversun.org@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
 * Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 *  INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package org.riversun.recvfcm;

import android.util.Log;
/**
 * Logger showing class name,method name,line number
 *
 * @author Tom Misawa (riversun.org@gmail.com)
 */
public class Logg {

    private static final String TAG = "MyAppDebug";
    private static final boolean debuggable = BuildConfig.DEBUG;

    public static void d() {
        if (debuggable) {
            Log.d(TAG, getCallFrom());
        }
    }

    public static void d(String msg) {
        if (debuggable) {
            Log.d(TAG, getCallFrom() + " " + msg);
        }
    }


    private static String getCallFrom() {

        final StackTraceElement ste = Thread.currentThread().getStackTrace()[4];
        final String fqClassName = ste.getClassName();
        final String className = fqClassName.substring(fqClassName.lastIndexOf(".") + 1);
        final String methodName = ste.getMethodName();
        final int lineNumber = ste.getLineNumber();
        final String callerInfo = className + "." + methodName + ": L" + lineNumber;

        return callerInfo;

    }
}
