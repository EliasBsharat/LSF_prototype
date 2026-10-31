package com.example.lsf_prototype;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FireBaseServices {
    private static FireBaseServices Instance;
    private FirebaseAuth auth;
    private FirebaseFirestore fire;
    private FirebaseStorage storage;

    public FireBaseServices(){
        auth = FirebaseAuth.getInstance();
        fire = FirebaseFirestore.getInstance();
        storage = FirebaseStorage.getInstance();
    }
    public static FireBaseServices getInstance(){
        if (Instance == null) Instance=new FireBaseServices();
        return Instance;
    }
    public FirebaseStorage getStorage() {
        return storage;
    }
    public FirebaseAuth getAuth() {
        return auth;
    }
    public FirebaseFirestore getFire() {
        return fire;
    }
}
