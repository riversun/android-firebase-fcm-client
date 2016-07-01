package org.riversun.recvfcm;

import android.content.Intent;

import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        Logg.d();

        startService(new Intent(this, FcmTokenRegistrationService.class));
    }
}
